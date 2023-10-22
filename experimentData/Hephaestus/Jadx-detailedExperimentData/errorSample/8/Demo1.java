class T3 <A, B> {}

class T2 {}

class T1 extends T2 {
    public T1(T3<? extends Boolean, ? extends Byte> t3, T2 t2) {
    }
}

class Demo1 extends T1 {
    public Demo1() {
        super((T3<Boolean, Byte>) null,
              new T1((T3<Boolean, Byte>) null, new T2()));
    }
}
