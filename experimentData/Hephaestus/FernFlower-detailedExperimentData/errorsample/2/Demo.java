interface I1<N> {
    void foo(N var1, Long var2);
}

class Demo implements I1<String> {
    public void foo(String var1, Long var2) {
    }
}
