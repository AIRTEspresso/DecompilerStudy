class T2 {
    public long l;
}

class T1<H, P extends Byte> {
    public T2 t2;

    public T1(T2 t2) {
        this.t2 = t2;
    }
}

public class Demo {
    static public final Long foo(Double d1) {
        T1<T2, Byte> t1 = (T1<T2, Byte>) null;
        return t1.t2.l;
    }
}
