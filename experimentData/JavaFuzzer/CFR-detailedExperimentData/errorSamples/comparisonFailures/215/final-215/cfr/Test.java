/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    long instanceCount = -9L;
    int iFld = 7;
    double dFld = -66.79636;
    int[] iArrFld = new int[this.N];

    Test() {
    }

    int iMeth() {
        int n = -93;
        this.dFld *= (double)this.instanceCount;
        this.iFld = (int)(this.dFld + (double)this.iFld);
        this.iArrFld[(this.iFld >>> 1) % this.N] = (int)((long)this.iFld - this.instanceCount);
        long l = n;
        return (int)l;
    }

    void mainTest() {
        this.iMeth();
        System.out.println("Test.iArrFld = " + this.checkSum(this.iArrFld));
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }

    long checkSum(int[] nArray) {
        long l = 0L;
        for (int i = 0; i < nArray.length; ++i) {
            l += (long)(nArray[i] / (i + 1) + nArray[i] % (i + 1));
        }
        return l;
    }
}

