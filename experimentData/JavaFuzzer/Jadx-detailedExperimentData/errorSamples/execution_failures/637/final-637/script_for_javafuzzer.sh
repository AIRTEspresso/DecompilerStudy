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
cp /root/DecompilerTester/Test.mf ./
jar cmf Test.mf Test.jar *.class
d8 Test.jar
cp classes.dex Test.dex
mkdir jadx
bash /root/DecompilerTester/jadx/bin/jadx Test.dex -d jadx
cd jadx
cp ./sources/defpackage/Test.java Test.java
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
rm *.class
rm output.txt
javac Test.java
timeout 15 java Test>>output.txt
if ! grep -q 'vMeth_check_sum: 4259216492900126090' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
