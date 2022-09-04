/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    long instanceCount;
    long bMeth_check_sum;

    Test() {
    }

    boolean bMeth(double d, int n) {
        int n2;
        int n3 = -61492;
        int n4 = -57244;
        int n5 = 2;
        int[] nArray = new int[this.N];
        float f = -1.231f;
        float[] fArray = new float[this.N];
        this.init(fArray, 119.546f);
        this.init(nArray, -4);
        int n6 = 1;
        for (n2 = 232; n2 > 10; --n2) {
            n += n2 + (n4 += 12545 + n2 * n2);
            n5 = 1;
            while (++n5 < 7) {
                int n7 = n2 - 1;
                fArray[n7] = fArray[n7] + (float)this.instanceCount;
                n4 = n6;
                f += (float)n5;
            }
        }
        long l = Double.doubleToLongBits(d) + (long)n + (long)n6 + 1L + (long)Float.floatToIntBits(f) + (long)n3 + (long)n2 + (long)n4 + (long)n5 + Double.doubleToLongBits(this.checkSum(fArray)) + this.checkSum(nArray);
        this.bMeth_check_sum += l;
        return l % 2L > 0L;
    }

    void vMeth(int n, int n2, int n3) {
        int n4 = 10;
        float[] fArray = new float[this.N];
        this.init(fArray, 1.282f);
        n = (int)((long)n + (-3469599995L + (long)n3));
        for (double d = 190.0; d > 5.0; d -= 1.0) {
            for (int i = 1; i < 9; ++i) {
                this.instanceCount = (long)(-fArray[i] - (float)(Integer.reverseBytes(n3) + n));
                n3 = (int)((double)n3 + Math.max(-69.0 - ((double)(n2 += i) - d), (double)(n4 + n4)) * -124.0);
                if (this.bMeth(-6.45281, n4)) break;
            }
            this.instanceCount = (long)((double)this.instanceCount + d);
            n3 = n -= (int)this.instanceCount;
        }
    }

    void vSmallMeth() {
        int n = -58;
        this.vMeth(n, n, 86);
    }

    void mainTest(String[] stringArray) {
        for (int i = 0; i < 787; ++i) {
            this.vSmallMeth();
        }
        System.out.println("bMeth_check_sum: " + this.bMeth_check_sum);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }

    void init(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = i % 2 == 0 ? n + i : n - i;
        }
    }

    void init(float[] fArray, float f) {
        for (int i = 0; i < fArray.length; ++i) {
            fArray[i] = i % 2 == 0 ? f + (float)i : f - (float)i;
        }
    }

    long checkSum(int[] nArray) {
        long l = 0L;
        for (int i = 0; i < nArray.length; ++i) {
            l += (long)(nArray[i] / (i + 1) + nArray[i] % (i + 1));
        }
        return l;
    }

    double checkSum(float[] fArray) {
        double d = 0.0;
        for (int i = 0; i < fArray.length; ++i) {
            d += (double)(fArray[i] / (float)(i + 1) + fArray[i] % (float)(i + 1));
        }
        return d;
    }
}

