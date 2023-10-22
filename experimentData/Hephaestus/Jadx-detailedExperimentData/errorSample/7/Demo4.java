class T2<K> {
    K y;
}

class T1<T> {
    public void foo() {
        T2<T> t2 = (T2<T>)null;
        Object o = t2.y;
    }
}
