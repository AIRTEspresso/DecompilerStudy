class T1<S> {
    public final S s1;
    public final S s2;

    public T1(S s1, S s2) {
        this.s1 = s1;
        this.s2 = s2;
    }
}

class T2 {}

class Demo2<S extends T2> extends T1<S> {
    public Demo2() {
        super((S) null, (S) null);
    }
}
