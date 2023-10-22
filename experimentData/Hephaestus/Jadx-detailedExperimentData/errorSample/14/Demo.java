class T1 {
    public Double d;

    public static String str;
    public static Short sh;
    public static Byte bt() {
        return (byte) -37;
    }

}

class T {
    static Boolean bo = (((byte) 46 != T1.bt())
            || (((T1) null).d < T1.sh));

    static final String bs = T1.str;
}
