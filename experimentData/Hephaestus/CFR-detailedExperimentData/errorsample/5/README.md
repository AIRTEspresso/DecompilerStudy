# Bug5

[Link](https://github.com/leibnitz27/cfr/issues/341).

Error message:

``` txt
./Demo.java:7: error: cannot find symbol
        super(new T2((Short)-55, 96L), (Short)-48);
                      ^
  symbol:   variable Short
  location: class Demo<M>
  where M is a type-variable:
    M extends String declared in class Demo
./Demo.java:7: error: illegal parenthesized expression
        super(new T2((Short)-55, 96L), (Short)-48);
                     ^
./Demo.java:7: error: cannot find symbol
        super(new T2((Short)-55, 96L), (Short)-48);
                                        ^
  symbol:   variable Short
  location: class Demo<M>
  where M is a type-variable:
    M extends String declared in class Demo
./Demo.java:7: error: illegal parenthesized expression
        super(new T2((Short)-55, 96L), (Short)-48);
                                       ^
4 errors
```