# Bug7


[Link](https://github.com/skylot/jadx/issues/1844).

Error message from `Demo1`:

``` txt
./out/sources/defpackage/Demo.java:9: error: cannot find symbol
        T1<Q> t1 = (T1) 0;
           ^
  symbol:   class Q
  location: class Demo
./out/sources/defpackage/Demo.java:9: error: incompatible types: int cannot be converted to T1
        T1<Q> t1 = (T1) 0;
                        ^
Note: ./out/sources/defpackage/Demo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
2 errors
```

Error message from `Demo2`:

``` txt
./out/sources/defpackage/Demo2.java:10: error: cannot find symbol
        T t = t2.t;
        ^
  symbol:   class T
  location: class Demo2
1 error
```
