# Bug1


[Link](https://github.com/leibnitz27/cfr/issues/337).

Error message:

``` txt
./Demo.java:10: error: cannot find symbol
        Boolean bl2 = new T1<V, U, F>((Boolean)bl).b;
                             ^
  symbol:   class V
  location: class Demo
./Demo.java:10: error: cannot find symbol
        Boolean bl2 = new T1<V, U, F>((Boolean)bl).b;
                                ^
  symbol:   class U
  location: class Demo
./Demo.java:10: error: cannot find symbol
        Boolean bl2 = new T1<V, U, F>((Boolean)bl).b;
                                   ^
  symbol:   class F
  location: class Demo
3 errors
```