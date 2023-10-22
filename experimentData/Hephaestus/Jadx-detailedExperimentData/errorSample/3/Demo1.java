class T1 {
    public T1(T1[] t1s) {
    }
}

class Demo1 extends T1 {
    public Demo1() {
        super(new T1[] { (T1) null, (T1) null, (T1) null });
    }
}
