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
mkdir fernflower
java -jar /root/DecompilerTester/fernflower.jar Test.jar fernflower
cd fernflower
unzip Test.jar
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
rm *.class
rm output.txt
javac Test.java
timeout 10 java Test>>output.txt
if ! grep -q 'f5 i21 i22 = -2147483648,373,372' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -8614506,0,49' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -8968970,0,65' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -8083738,0,25' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -8260938,0,33' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -9499802,0,89' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -7906730,0,17' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -8438138,0,41' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -9323306,0,81' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -8792026,0,57' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'Test.instanceCount Test.bFld Test.byFld = -9146170,0,73' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
