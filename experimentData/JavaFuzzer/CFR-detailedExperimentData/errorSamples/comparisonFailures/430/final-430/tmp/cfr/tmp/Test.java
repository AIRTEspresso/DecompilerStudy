/*
 * Decompiled with CFR 0.152.
 */
class Test {
    long instanceCount = 3093829568423456391L;
    int iFld = 46934;
    long vSmallMeth_check_sum;

    Test() {
    }

    void vMeth1(int n, int n2) {
        this.instanceCount = n2;
    }

    void vMeth(float f, long l) {
        int n = 186;
        int n2 = 154;
        int n3 = 1;
        do {
            this.vMeth1(n, n2 *= n3);
        } while (++n3 < 142);
    }

    void vSmallMeth(boolean bl, int n, int n2) {
        float f = 0.223f;
        this.vMeth(f, this.instanceCount);
        this.vSmallMeth_check_sum += (long)(1 + (n |= (int)this.instanceCount) + n2 + Float.floatToIntBits(f));
    }

    void mainTest(String[] stringArray) {
        boolean bl = true;
        for (int i = 0; i < 127; ++i) {
            this.vSmallMeth(bl, this.iFld, 27417);
        }
        System.out.println("vSmallMeth_check_sum: " + this.vSmallMeth_check_sum);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }
}

