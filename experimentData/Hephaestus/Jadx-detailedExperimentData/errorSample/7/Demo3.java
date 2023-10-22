class T1<Q extends Boolean> {
    public T1<Q> t;
}

class Demo {
    public void foo() {
        T1<Boolean> t2 = new T1<Boolean>();
        t2.t = (T1<Boolean>) null;
    }

}
