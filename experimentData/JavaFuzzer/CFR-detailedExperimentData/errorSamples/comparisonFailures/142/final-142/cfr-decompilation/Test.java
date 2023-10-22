/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    int iFld;

    Test() {
    }

    void mainTest() {
        int n = 4;
        long[] lArray = new long[this.N];
        this.init(lArray, 2918919998L);
        while (--n > 0) {
            this.iFld = (int)((long)n + lArray[n]);
            this.iFld += this.iFld;
        }
        System.out.println("iFld " + Double.doubleToLongBits(this.iFld));
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }

    void init(long[] lArray, long l) {
        for (int i = 0; i < lArray.length; ++i) {
            lArray[i] = l - (long)i;
        }
    }
}

