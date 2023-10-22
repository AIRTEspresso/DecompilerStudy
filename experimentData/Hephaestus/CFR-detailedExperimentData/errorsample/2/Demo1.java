class Demo1<T extends Character, N> {
    public final Short foo(T t1) {
        final Boolean b = false;
        T t2 = t1;
        // Character c = ...
        T t3 = (T) new Character('x');
        // String s = ...
        N n = (N) new String("");
        return foo(((b) ? t3 : t2));
    }
}
