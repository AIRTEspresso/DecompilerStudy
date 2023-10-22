class T1<I> {
    public I i;
}

class Demo<I> {
    public static final T1<Float> t1 = new T1<>();

    public final void foo() {
        Demo.t1.i = (float) -92.333;
    }
}
