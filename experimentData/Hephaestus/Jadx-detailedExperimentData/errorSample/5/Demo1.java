interface I1<A, B> {
    void foo1(A a);
    B foo2();
}

class T1 {}

class Demo<K extends T1, U extends K> implements I1<K, U> {
    public void foo1(K u) {
    }
    public U foo2() {
        return null;
    }
}
