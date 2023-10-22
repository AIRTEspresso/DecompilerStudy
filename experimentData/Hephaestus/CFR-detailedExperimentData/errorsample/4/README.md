# Bug4
[Link](https://github.com/leibnitz27/cfr/issues/340).

Error message from `Demo1`:

``` txt
./Demo1.java:10: error: incompatible types: bad type in conditional expression
        return bl != false ? t1 : new T2();
                             ^
    T1<Object> cannot be converted to T1<Integer>
Note: ./Demo1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
```

