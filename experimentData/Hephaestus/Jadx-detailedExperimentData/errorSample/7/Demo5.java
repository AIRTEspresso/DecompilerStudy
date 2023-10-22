class T1<T extends Integer> {
    public T t;

    public void foo0() {
        T1<Integer> t1 = (T1<Integer>) null;
        final Integer i = t1.t;
    }
}
