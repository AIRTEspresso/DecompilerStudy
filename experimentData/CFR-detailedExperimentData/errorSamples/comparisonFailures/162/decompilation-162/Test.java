/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 11L;
    public static float fFld = 1.846f;
    public volatile int iFld = 9;
    public static long vMeth_check_sum = 0L;
    public static long vMeth1_check_sum = 0L;
    public static long fMeth_check_sum = 0L;

    public static float fMeth() {
        int n = -10;
        int n2 = 228;
        int n3 = 13;
        int n4 = -48284;
        int n5 = 14;
        int[] nArray = new int[400];
        int n6 = 62;
        float f = 27.65f;
        boolean bl = false;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -2223656525721366550L);
        FuzzerUtils.init(nArray, 88);
        for (n = 5; n < 181; ++n) {
            n6 = (short)(n6 >>> (short)instanceCount);
            instanceCount = n2;
            n2 += (int)(-42L + (long)(n * n));
            for (n3 = 9; n3 > 1; n3 -= 3) {
                n2 <<= n;
                n2 = (int)f;
                if (!bl) continue;
                switch (n3 % 10 + 28) {
                    case 28: {
                        lArray[n3 + 1] = (long)f;
                        break;
                    }
                    case 29: {
                        n4 >>= n2;
                        break;
                    }
                    case 30: {
                        n2 >>= -234;
                        break;
                    }
                    case 31: {
                        n5 = 1;
                        do {
                            int n7 = n3 + 1;
                            nArray[n7] = nArray[n7] * (int)f;
                            n4 &= n5;
                        } while (++n5 < 5);
                    }
                    case 32: {
                        break;
                    }
                    case 33: {
                        int n8 = n + 1;
                        lArray[n8] = lArray[n8] << n3;
                    }
                    case 34: {
                        n2 += n3 * n3;
                        break;
                    }
                    case 35: {
                        int n9 = (n2 >>> 1) % 400;
                        nArray[n9] = nArray[n9] | (int)instanceCount;
                        break;
                    }
                    case 36: {
                        n2 = (int)((long)n2 + ((long)n3 * instanceCount + instanceCount - (long)n5));
                        break;
                    }
                    case 37: {
                        n2 = n5;
                    }
                }
            }
        }
        long l = (long)(n + n2 + n6 + n3 + n4 + Float.floatToIntBits(f) + n5 + (bl ? 1 : 0)) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
        fMeth_check_sum += l;
        return l;
    }

    public static void vMeth1(int n, int n2) {
        float f = -39.956f;
        int n3 = 1;
        int n4 = 46;
        int n5 = 9;
        int n6 = 239;
        int n7 = -172;
        int[] nArray = new int[400];
        int n8 = -47;
        FuzzerUtils.init(nArray, 8558);
        n2 = 62;
        f -= Test.fMeth();
        n3 = 1;
        while (++n3 < 331) {
            n4 = 1;
            while ((n4 += 3) < 5) {
                n2 += n4 + n2;
                f -= (float)n8;
                nArray[n3 + 1] = n3;
                for (n5 = n3; n5 < 5; ++n5) {
                    n6 = (int)((long)n6 + ((long)(n5 * n2 + n3) - instanceCount));
                    n += n5;
                    int n9 = n3 - 1;
                    nArray[n9] = nArray[n9] + n7;
                }
                n6 = -58;
                nArray[n4] = (int)fFld;
                instanceCount = 58632L;
                n7 = n4;
            }
        }
        vMeth1_check_sum += (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n8 + n5 + n6 + n7) + FuzzerUtils.checkSum(nArray);
    }

    public void vMeth(long l, int n) {
        int n2 = 29799;
        int n3 = 121;
        int n4 = 26896;
        int n5 = 1515;
        int n6 = 14841;
        int n7 = 51;
        int[] nArray = new int[400];
        FuzzerUtils.init(nArray, -3);
        Test.vMeth1(44170, n);
        for (n2 = 11; 202 > n2; ++n2) {
            l >>= 2135098574;
            n3 = -10416;
            n3 *= n3;
            int n8 = n2;
            nArray[n8] = nArray[n8] << n2;
        }
        n3 <<= n2;
        n3 -= 40421;
        for (n4 = 20; 397 > n4; ++n4) {
            n3 = n4;
            int n9 = n4 - 1;
            nArray[n9] = nArray[n9] * n;
            n6 = 1;
            while (4 > n6) {
                n = n6++;
                if (n7 == 0) continue;
                vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + FuzzerUtils.checkSum(nArray);
                return;
            }
        }
        vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        int[] nArray = new int[400];
        FuzzerUtils.init(nArray, -11272);
        nArray = nArray;
        nArray = nArray;
        this.vMeth(instanceCount, this.iFld);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld iFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + this.iFld);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }

    public static void main(String[] stringArray) {
        try {
            Test test = new Test();
            for (int i = 0; i < 10; ++i) {
                test.mainTest(stringArray);
            }
        }
        catch (Exception exception) {
            FuzzerUtils.out.println(exception.getClass().getCanonicalName());
        }
    }
}

