/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    int iFld1 = 221;

    Test() {
    }

    void vMeth(int n, int n2) {
        System.out.println("i4:" + n2);
    }

    void mainTest() {
        this.iFld1 = 540298370;
        long[] lArray = new long[this.N];
        this.init(lArray, 39L);
        int n = (this.iFld1 >>> 1) % this.N;
        long l = lArray[n] ^ 0xFFFFFFFFFFFFFFF3L;
        lArray[n] = l;
        this.vMeth(this.iFld1--, (int)l);
        System.out.println("Test.iFld1= " + this.iFld1);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }

    void init(long[] lArray, long l) {
        for (int i = 0; i < lArray.length; ++i) {
            lArray[i] = i % 2 == 0 ? l + (long)i : l - (long)i;
        }
    }
}

