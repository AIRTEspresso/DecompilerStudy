#!/usr/bin/env bash

set -o pipefail
set -o nounset
rm -rf tmp
rm -rf perses_result
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
javac Test.java
rm output.txt
javac Test.java
timeout 100 java Test>>output.txt
if ! grep -q 'Test.bFld Test.iArrFld Test.lArrFld = 0,-9763,3336850141137879124' output.txt; then
     echo 'failure'
     exit 1
fi
jar cmf /root/DecompilerTester/Test.mf Test.jar *.class
mkdir cfr
java -jar /root/DecompilerTester/cfr.jar Test.jar --outputdir cfr
cd cfr
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
rm *.class
rm output.txt
javac Test.java
timeout 100 java Test>>output.txt
if ! grep -q 'Test.bFld Test.iArrFld Test.lArrFld = 0,-10023,3336850141137879124' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
