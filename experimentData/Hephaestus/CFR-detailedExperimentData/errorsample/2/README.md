# Bug2


[Link](https://github.com/leibnitz27/cfr/issues/338).

Error message from `Demo1`:

``` txt
./Demo.java:12: error: incompatible types: bad type in conditional expression
        return this.foo(bl != false ? c : t2);
                                      ^
    Character cannot be converted to T
  where T is a type-variable:
    T extends Character declared in class Demo
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
```

Relative samples:

``` txt
1-3 1-16 1-20

2-9

3-2 3-61 3-69
```
