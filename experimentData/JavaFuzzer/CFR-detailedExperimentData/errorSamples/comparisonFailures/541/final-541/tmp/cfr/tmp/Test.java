/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    long instanceCount = 252L;
    int iFld = 194;
    int[] iArrFld = new int[this.N];
    long vSmallMeth_check_sum;

    Test() {
        this.init(this.iArrFld, 16937);
    }

    float fMeth(int n) {
        int n2 = n >> 1;
        this.iArrFld[n2] = (int)((long)this.iArrFld[n2] - this.instanceCount);
        int n3 = 127;
        while (n3 > 2) {
            int n4 = n3--;
            this.iArrFld[n4] = this.iArrFld[n4] - -213;
        }
        long l = n;
        return l;
    }

    void vMeth(int n) {
        int n2 = 1;
        do {
            n *= n;
            this.fMeth(n2);
        } while (++n2 < 235);
        this.instanceCount = n;
    }

    void vSmallMeth(long l, int n) {
        this.vMeth(n);
        this.vSmallMeth_check_sum += (l *= (long)this.iArrFld[n >> 1]) + (long)n;
    }

    void mainTest(String[] stringArray) {
        for (int i = 0; i < 155; ++i) {
            this.vSmallMeth(this.instanceCount, this.iFld);
        }
        System.out.println("vSmallMeth_check_sum: " + this.vSmallMeth_check_sum);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }

    void init(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = n - i;
        }
    }
}

