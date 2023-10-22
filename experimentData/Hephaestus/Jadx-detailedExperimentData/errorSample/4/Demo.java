class Demo {

    public static void foo(Object o) {
        if (o instanceof Boolean) System.out.println("Boolean: " + o);
        if (o instanceof Float) System.out.println("Float: " + o);
    }

    public static void main(String[] args) {
        // 这里有没有 final 都会触发报错
        // final Float f = (float) -47.99;
        Float f = (float) -47.99;
        Boolean b = args.length == 0;
        Object o = ((b) ? false : f);
        foo(o);
    }

}
