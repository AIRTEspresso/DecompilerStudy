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
timeout 100 java Test>>output.txt
if ! grep -q 'vMeth_check_sum: -695748819682119852' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 7019049567676333112' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: -1797862875019041704' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 8121163623013254964' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 4814821457002489408' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 1508479290991723852' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 3712707401665567556' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 5916935512339411260' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 406365235654802000' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'vMeth_check_sum: 2610593346328645704' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
