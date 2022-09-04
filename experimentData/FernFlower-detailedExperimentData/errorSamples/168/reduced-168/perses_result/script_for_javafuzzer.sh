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
mkdir fernflower
java -jar /root/DecompilerTester/fernflower.jar Test.jar fernflower
cd fernflower
unzip Test.jar
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
rm *.class
rm output.txt
javac Test.java 2>output.txt
if ! grep -q 'error: incompatible types: possible lossy conversion from long to int' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
