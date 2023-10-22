# Bug9

[Link](https://github.com/skylot/jadx/issues/1855).

Error message:

``` txt
./out/sources/defpackage/Demo.java:11: error: incompatible types: I cannot be converted to Float
        t1.i = (I) Float.valueOf(-92.333f);
               ^
  where I is a type-variable:
    I extends Object declared in class Demo
Note: ./out/sources/defpackage/Demo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
```
