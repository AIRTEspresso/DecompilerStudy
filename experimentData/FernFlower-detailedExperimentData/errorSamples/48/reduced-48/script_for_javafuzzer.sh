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
if ! grep -q 'iMeth_check_sum: 4564381859864184236' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: 2282190930170828020' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: -7035789424765298732' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: 7987668254404218560' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: 6846572789557540452' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: 9128763719250896668' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: -8176884889611976840' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: 1141095465324149912' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: 5705477324710862344' output.txt; then
     echo 'failure'
     exit 1
fi
if ! grep -q 'iMeth_check_sum: 3423286395017506128' output.txt; then
     echo 'failure'
     exit 1
fi
echo 'success'
exit 0
