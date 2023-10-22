# Bug4

[Link](https://youtrack.jetbrains.com/issue/IDEA-318289/Fernflower-generates-incorrect-generic-type-losing-its-type-arguments).

Error message:

``` txt
./Demo.java:4: error: incompatible types: Object cannot be converted to T1
         T2 var1 = new T2(var0x);
                          ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
```
