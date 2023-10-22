class T1 {
    public T1(long l, Short s) {
    }
}

class T2 extends T1 {
    public T2(Short s, long l) {
        super((long) -38, (short) -37);
    }

}

class T3 extends T1 {
    public T3(T2 t2, Short s) {
        super((long) -38, (short) -37);
    }
}

class Demo<M extends String> extends T3 {
    public Demo() {
        super(new T2((short) -55, (long) 96), (short) -48);
    }
}
