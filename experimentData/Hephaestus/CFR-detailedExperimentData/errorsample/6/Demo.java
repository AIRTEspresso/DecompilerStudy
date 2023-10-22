class T1 {
    public T1(byte b) {
    }
}

class Demo {
    public static void foo() {
        T1 t1 = new T1((byte) -70);
    }
}
