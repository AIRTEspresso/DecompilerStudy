#!/usr/bin/env bash

set -o pipefail
set -o nounset
rm -rf tmp

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
java Test>>output.txt
if ! grep -q 'i i1 i2 = 337,0,77' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
