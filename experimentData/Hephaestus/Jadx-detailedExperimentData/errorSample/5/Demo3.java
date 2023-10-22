class T2<W extends String> {
    public W w;
}

class T1<O extends String> {
    public void foo0() {
        O o1 = (new T2<O>()).w;
    }
}
