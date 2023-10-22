interface I1<F extends Double, P, W> {
}

class T1 implements I1<Double, Double, Boolean> {
}

class T2<T extends I1<? extends Double, Float, ? super Number>, M extends T, B extends T1> extends T1 {
    public final T t;

    public T2(T t) {
        super();
        this.t = t;
    }
}

class Demo2 {
    public static <F_C extends I1<? extends Double, Float, ? super Number>> void foo() {
        final T2<F_C, F_C, ? super T1> t2_1 = (T2<F_C, F_C, T1>) null;
        final I1<? extends Double, Float, ?> i1 = t2_1.t;
    }
}
