/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    long instanceCount = 3125503453L;
    int[] iArrFld = new int[this.N];

    Test() {
        this.init(this.iArrFld, -180);
    }

    int iMeth() {
        this.instanceCount = 115L;
        return 12;
    }

    void mainTest() {
        int n = 173;
        int n2 = 1;
        for (int i = 149; i > 7; i -= 2) {
            int n3 = i;
            this.iArrFld[n3] = (int)((long)this.iArrFld[n3] + this.instanceCount);
            n2 -= (n <<= this.iMeth());
            this.iArrFld[i - 1] = i;
        }
        System.out.println("the sum of iArrFld is :" + this.checkSum(this.iArrFld));
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }

    void init(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = i % 2 == 0 ? n + i : n - i;
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

