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
if ! grep -q 'byMeth_check_sum: 683293151652571728' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: -7702599568696423070' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: -3509653208521925671' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: 1241612695989759068' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: 5992878600501443807' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: -4067972752859113011' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: -8260919113033610410' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: 4876239511827069127' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: -8819238657370797750' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'byMeth_check_sum: 5434559056164256467' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
