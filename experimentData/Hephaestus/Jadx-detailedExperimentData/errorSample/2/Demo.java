interface Function0<R> {
    public R apply();
}

class T2 {
    public long l;

    public T2(long l) {
        this.l = l;
    }

    public void w() {
    }
}

class Demo {
    public Byte foo(Byte b1) {
        Function0<Void> f1 = () -> {
            new T2(94L).w();
            return null;
        };
        f1.apply();
        return null;
    }
}
