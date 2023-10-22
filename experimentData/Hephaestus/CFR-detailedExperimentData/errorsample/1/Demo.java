class T1<V, U, F> {
    public final Boolean b;

    public T1(Boolean b) {
        this.b = b;
    }
}

class Demo {
    public static final short foo(short s1) {
        Boolean b1 = true;
        final Boolean b2 = new T1<Byte, Byte, Short>(b1).b;
        short s2 = (short) -69;
        return ((b2) ? Demo.foo(s2) : s1);
    }
}
