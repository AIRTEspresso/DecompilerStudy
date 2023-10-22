class T1<H extends Boolean> {
}

class T2<Q extends Boolean> {
    public T1<Q> t;

    public T2(T1<Q> t1) {
        this.t = t1;
    }
}

class Demo1 {
    public void foo() {
        T2<Boolean> t2 = new T2<Boolean>((T1<Boolean>) null);
        t2.t = (T1<Boolean>) null;
        System.out.println(t2);
    }

}
