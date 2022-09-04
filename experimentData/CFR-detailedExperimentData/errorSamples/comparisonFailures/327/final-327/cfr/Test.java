/*
 * Decompiled with CFR 0.152.
 */
class Test {
    static long instanceCount = 40795L;

    Test() {
    }

    void mainTest() {
        int n = -13;
        double d = -12.125172;
        float f = 2.186f;
        int n2 = 1;
        while (++n2 < 122) {
            d = -8149.0;
            f += (float)(n *= n2);
            n <<= (int)(instanceCount += (long)d);
        }
        System.out.println("f1:" + Double.doubleToLongBits(f));
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }
}

