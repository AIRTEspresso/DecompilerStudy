/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    long instanceCount = 5122183147755864801L;
    int iFld = 10;
    int[] iArrFld = new int[this.N];

    Test() {
        this.init(this.iArrFld, -23);
    }

    void vMeth1(long l) {
        int n = -91;
        int n2 = 1;
        if (++n2 < 256) {
            int n3 = 1;
            while (true) {
                n += n3;
                this.iFld >>>= (int)this.instanceCount;
                switch (n -= this.iFld) {
                    case 6: {
                        return;
                    }
                    case 7: {
                        int n4 = n2;
                        this.iArrFld[n4] = this.iArrFld[n4] + 27231;
                    }
                }
                ++n3;
            }
        }
    }

    void vMeth(int n) {
        this.vMeth1(this.instanceCount);
    }

    void mainTest(String[] stringArray) {
        this.vMeth(14);
        System.out.println("Test.iArrFld = " + this.checkSum(this.iArrFld));
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }

    void init(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = i % 2 == 0 ? n + i : n;
        }
    }

    long checkSum(int[] nArray) {
        long l = 0L;
        for (int i = 0; i < nArray.length; ++i) {
            l += (long)(nArray[i] / (i + 1) + nArray[i] % (i + 1));
        }
        return l;
    }
}

