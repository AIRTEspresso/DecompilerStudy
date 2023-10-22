#!/usr/bin/env bash

set -o pipefail
set -o nounset
rm -rf tmp
rm -rf perses_result
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
rm output.txt
javac Test.java 2>output.txt
jar cmf /root/DecompilerTester/Test.mf Test.jar *.class
if grep -q 'error' output.txt; then
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
javac Test.java 2>output.txt
if ! grep -q 'error: illegal start of statement' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
