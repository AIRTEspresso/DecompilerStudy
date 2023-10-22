class T1<K> {
}

class T2<Q> extends T1<Integer> {
}

class Demo1 {
    public T1<Integer> foo(Boolean b1) {
        final T1<Integer> t1 = (T1<Integer>) null;
        return ((b1) ? t1 : new T2<Double>());
    }
}
