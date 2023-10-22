# Bug8


[Link](https://github.com/leibnitz27/cfr/issues/350).

Error message:

``` txt
./T1.java:11: error: incompatible types: bad type in conditional expression
        Comparable<Boolean> comparable = bl != false ? (Comparable<Double>)Double.valueOf(-33.998) : (Comparable<Double>)bl2;
                                                       ^
    Comparable<Double> cannot be converted to Comparable<Boolean>
./T1.java:11: error: incompatible types: Boolean cannot be converted to Comparable<Double>
        Comparable<Boolean> comparable = bl != false ? (Comparable<Double>)Double.valueOf(-33.998) : (Comparable<Double>)bl2;
                                                                                                                         ^
2 errors
```