class T1<K extends Integer, U extends Double> {
    public String print() {
        return "T1";
    }
}

class T2<P, Q> extends T1<Integer, Double> {
    public String print() {
        return "T2";
    }
}

// 语义错误
class Demo2 {
    public T1<Integer, Double> foo(Boolean b1) {
        final T1<Integer, Double> t1 = new T1<>();
        return ((b1) ? t1 : new T2<Integer, Double>());
    }

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        Boolean b1 = true;
        T1<Integer, Double> t1 = d.foo(b1);
        // Should be true
        System.out.println("T1".equals(t1.print()));
    }
}
