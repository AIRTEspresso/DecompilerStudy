class T1<V extends Integer> {
    public short foo(V v) {
        return (short)64;
    }
}

class Main {
    public static short s;
    public static void main(String[] args) {
        Main.s = new T1<Integer>().foo(null);
    }
}
