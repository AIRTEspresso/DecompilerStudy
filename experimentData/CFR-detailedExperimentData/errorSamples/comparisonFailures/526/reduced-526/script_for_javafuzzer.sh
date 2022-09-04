#!/usr/bin/env bash

set -o pipefail
set -o nounset
rm -rf tmp
rm -rf perses_result
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
javac Test.java
jar cmf /root/DecompilerTester/Test.mf Test.jar *.class
rm output.txt
timeout 15 java Test>>output.txt
if ! grep -q 'iMeth1_check_sum: 5981820703916748208' output.txt; then
     echo 'failure'
     exit 1
fi
mkdir cfr
java -jar /root/DecompilerTester/cfr.jar Test.jar --outputdir cfr
cd cfr
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
rm *.class
rm output.txt
javac Test.java
timeout 15 java Test>>output.txt
if ! grep -q 'iMeth1_check_sum: 5981533754157046634' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
