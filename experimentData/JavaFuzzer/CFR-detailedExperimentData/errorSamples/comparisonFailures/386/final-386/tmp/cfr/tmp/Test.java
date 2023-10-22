/*
 * Decompiled with CFR 0.152.
 */
class Test {
    long instanceCount;
    static double dFld;
    int iFld;
    int iFld1;

    Test() {
    }

    void vMeth(int n) {
        this.instanceCount -= Long.reverseBytes(-2187064611379246730L);
        double d = dFld;
        dFld += 1.0;
        dFld = d - dFld;
    }

    void mainTest(String[] stringArray) {
        int n = 110;
        this.iFld = -22195;
        this.vMeth(this.iFld1);
        float f = (float)(dFld *= (double)(this.instanceCount + (long)this.iFld));
        for (int i = 228; i > 11; --i) {
            for (long j = 7L; j < 116L; j += 3L) {
                switch ((int)(j % 6L + 19L)) {
                    case 20: {
                        this.instanceCount >>= n;
                    }
                    case 21: {
                        this.instanceCount = i;
                    }
                    case 23: {
                        this.iFld -= this.iFld;
                    }
                }
            }
        }
        System.out.println("Test.instanceCount Test.dFld iFld = " + this.instanceCount + "," + Double.doubleToLongBits(dFld) + "," + this.iFld);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }
}

