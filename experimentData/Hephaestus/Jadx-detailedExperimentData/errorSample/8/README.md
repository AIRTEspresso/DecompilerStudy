# Bug8

[Link](https://github.com/skylot/jadx/issues/1854).

Error message from `Demo1`:

``` txt
./out/sources/defpackage/Demo.java:10: error: constructor T1 in class T1 cannot be applied to given types;
    public Demo() {
                  ^
  required: T3<? extends Boolean,? extends Byte>,T2
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
```

Error message from `Demo2`:

``` txt
./out/sources/defpackage/Demo.java:13: error: constructor T1 in class T1<S#2> cannot be applied to given types;
    public Demo() {
                  ^
  required: S#1,S#1
  found: no arguments
  reason: actual and formal argument lists differ in length
  where S#1,S#2 are type-variables:
    S#1 extends T2 declared in class Demo
    S#2 extends Object declared in class T1
1 error
```
