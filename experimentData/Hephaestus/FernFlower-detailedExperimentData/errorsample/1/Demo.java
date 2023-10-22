interface Function2<A1, A2, R> {
    public R apply(A1 a1, A2 a2);
}

public class Demo<N extends Integer, O extends N> {
    public Number foo1(Number n1) {
        Number n2 = (Number) new Long(55);
        Function2<String, N, Void> hiroshima = (x1, x2) -> {
            N x4 = (N) null;
            return null;
        };
        return n2;
    }
}
