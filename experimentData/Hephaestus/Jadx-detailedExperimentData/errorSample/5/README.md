# Bug5

[Link](https://github.com/skylot/jadx/issues/1842).


Error message:

``` txt
./out/sources/defpackage/Demo.java:6: error: Demo is not abstract and does not override abstract method foo2() in I1
class Demo<K extends T1, U extends K> implements I1<K, U> {
^
  where U,K are type-variables:
    U extends K declared in class Demo
    K extends T1 declared in class Demo
./out/sources/defpackage/Demo.java:21: error: foo2() in Demo cannot implement foo2() in I1
    public T1 foo2() {
              ^
  return type T1 is not compatible with U
  where B,U,K are type-variables:
    B extends Object declared in interface I1
    U extends K declared in class Demo
    K extends T1 declared in class Demo
./out/sources/defpackage/Demo.java:12: error: name clash: foo1(Object) in Demo and foo1(K) in I1 have the same erasure, yet neither overrides the other
    public /* bridge */ /* synthetic */ void foo1(Object obj) {
                                             ^
  where K is a type-variable:
    K extends T1 declared in class Demo
./out/sources/defpackage/Demo.java:11: error: method does not override or implement a method from a supertype
    @Override // defpackage.I1
    ^
./out/sources/defpackage/Demo.java:13: error: incompatible types: T1 cannot be converted to Demo<K,U>
        foo1((Demo<K, U>) ((T1) obj));
                          ^
  where K,U are type-variables:
    K extends T1 declared in class Demo
    U extends K declared in class Demo
./out/sources/defpackage/Demo.java:20: error: method does not override or implement a method from a supertype
    @Override // defpackage.I1
    ^
6 errors
```


