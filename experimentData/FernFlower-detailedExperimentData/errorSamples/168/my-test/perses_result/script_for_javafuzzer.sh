#!/usr/bin/env bash

set -o pipefail
set -o nounset
rm -rf tmp
rm -rf fernflower

javac Test.java
jar cmf /root/DecompilerTester/Test.mf Test.jar Test.class
mkdir fernflower
java -jar /root/DecompilerTester/fernflower.jar Test.jar fernflower
cd fernflower
unzip Test.jar
cd ..
mkdir tmp
cp fernflower/Test.java tmp
cd tmp
cp /root/DecompilerTester/StyleChecker.class ./
java StyleChecker Test.java
cd tmp
rm *.class
rm output.txt
javac Test.java 2>>output.txt
if ! grep -q 'incompatible types' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
