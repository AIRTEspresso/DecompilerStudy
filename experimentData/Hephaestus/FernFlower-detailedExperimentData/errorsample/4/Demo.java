interface FunctionI<A, R> {
    public R apply(A a);
}

class T1 {
}

class T2<B extends T1> {
    public T2(B b1) {
    }
}

public class Demo {
    static <X extends T1> void foo() {
        FunctionI<X, T2<X>> function1 = (n) -> {
            T2<X> ret = new T2<>(n);
            return ret;
        };
    }
}
