/*
 * Decompiled with CFR 0.152.
 */
class Test {
    long instanceCount = -1068005935077800450L;
    int iFld = -113;
    long vSmallMeth_check_sum;

    Test() {
    }

    void vMeth1(int n, int n2, int n3) {
        for (int i = 8; i < 161; ++i) {
            for (int j = i; j < 10; ++j) {
                int n4 = -70;
                this.instanceCount += (long)n4;
                this.instanceCount -= 30310L;
            }
        }
    }

    void vMeth() {
        int n = 364;
        while (--n > 0) {
            int n2 = 1;
            while (++n2 < 5) {
                this.vMeth1(n2, n2, n);
                float f = 1.0f;
                this.instanceCount += (long)f;
            }
        }
    }

    void vSmallMeth(float f, int n, int n2) {
        this.vMeth();
        this.vSmallMeth_check_sum += (long)(Float.floatToIntBits(f) + n + (n2 += (int)this.instanceCount));
    }

    void mainTest(String[] stringArray) {
        float f = -16.177f;
        for (int i = 0; i < 411; ++i) {
            this.vSmallMeth(f, 70, this.iFld);
        }
        System.out.println("vSmallMeth_check_sum: " + this.vSmallMeth_check_sum);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }
}

