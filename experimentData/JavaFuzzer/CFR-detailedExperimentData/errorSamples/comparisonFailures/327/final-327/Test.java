class Test {
    static long instanceCount = 40795L;

    void mainTest(){
        int i6;
        int i1 = -13;
        double d2 = - 12.125172;
        float f1 = 2.186F;
        i6 = 1;
        while(++ i6 < 122){
            instanceCount +=(long)d2;
            d2 = - 8149L;
            i1 *= i6;
            f1 += i1;
            i1 <<= instanceCount;
        }
        System.out.println("f1:" + Double.doubleToLongBits(f1));
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest();
    }
}
