class T1<A, B> {
    public A a;

    public T1(A a) {
        this.a = a;
    }
}

class T2<Q, K> {
    public void foo(Q q) {
        T1<Q, K> t1 = new T1((Q) null);
        foo(t1.a);
    }
}
