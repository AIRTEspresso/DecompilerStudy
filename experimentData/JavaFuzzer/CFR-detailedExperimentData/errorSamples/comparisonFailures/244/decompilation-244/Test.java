/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 3167832886L;
    public static int iFld = 8;
    public static float fFld = 1.288f;
    public static double dFld = -3.67625;
    public static float[] fArrFld = new float[400];
    public long[] lArrFld = new long[400];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(short s) {
        int n = 13;
        int n2 = 3;
        int n3 = 197;
        int n4 = 0;
        int n5 = -7;
        int n6 = 233;
        int n7 = 13;
        int n8 = -1;
        int[] nArray = new int[400];
        double d = -76.68049;
        boolean bl = false;
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, 38);
        FuzzerUtils.init(lArray, 970730100L);
        iFld -= n;
        n2 = 6;
        while (n2 < 128) {
            n4 = 1;
            do {
                int n9 = n2++;
                nArray[n9] = nArray[n9] * (int)fFld;
            } while (++n4 < 13);
        }
        d -= -60664.0;
        instanceCount -= (long)iFld;
        block12: for (n5 = 6; n5 < 183; ++n5) {
            switch (n5 % 9 + 47) {
                case 47: {
                    lArray[n5] = instanceCount;
                    n *= (int)fFld;
                    n3 = (int)((long)n3 + ((long)n5 ^ instanceCount));
                }
                case 48: {
                    for (n7 = 1; n7 < 9; ++n7) {
                        int n10 = n5 - 1;
                        lArray[n10] = lArray[n10] - 5L;
                    }
                    n3 *= (int)instanceCount;
                }
                case 49: {
                    n8 = 34;
                    continue block12;
                }
                case 50: {
                    iFld >>>= 23821;
                    continue block12;
                }
                case 51: 
                case 52: {
                    continue block12;
                }
                case 53: {
                    iFld = n2;
                }
                case 54: {
                    n3 -= n;
                    continue block12;
                }
                case 55: {
                    n8 = (int)((float)n8 + ((float)(n5 * n8) + fFld - (float)n7));
                    continue block12;
                }
                default: {
                    iFld = 8;
                }
            }
        }
        vMeth1_check_sum += (long)(s + n + n2 + n3 + n4) + Double.doubleToLongBits(d) + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray);
    }

    public static void vMeth(int n, int n2) {
        short s = -30748;
        Test.vMeth1(s);
        vMeth_check_sum += (long)((n |= iFld) + n2 + s);
    }

    public static int iMeth(int n) {
        int n2 = 3;
        int n3 = 11;
        int n4 = 11;
        int n5 = -11;
        long l = 2247622150L;
        double d = 0.118598;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 1.73f);
        for (n2 = 4; n2 < 323; ++n2) {
            l = 1L;
            do {
                Test.vMeth(iFld, n);
                int n6 = (int)l;
                fArray[n6] = fArray[n6] + -207.0f;
                instanceCount = n2;
                iFld -= (int)l;
                for (n4 = 1; n4 < 1; ++n4) {
                    instanceCount -= (long)n5;
                    iFld += iFld;
                    instanceCount *= l;
                    iFld += (int)d;
                    iFld &= n2;
                    instanceCount += (long)(n4 * n4);
                }
            } while (++l < 5L);
        }
        long l2 = (long)(n + n2 + n3) + l + (long)n4 + (long)n5 + Double.doubleToLongBits(d) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public void mainTest(String[] stringArray) {
        int n = 10;
        int n2 = -9;
        int n3 = -14;
        int n4 = -22081;
        int n5 = -48658;
        int n6 = -124;
        int n7 = -10242;
        int n8 = -56;
        int n9 = 70;
        int n10 = 15088;
        int[] nArray = new int[400];
        int n11 = 32408;
        double d = -1.7699;
        boolean bl = true;
        int n12 = 95;
        FuzzerUtils.init(nArray, 12);
        int[] nArray2 = nArray;
        nArray = nArray2;
        nArray = nArray2;
        nArray = nArray2;
        int n13 = iFld;
        iFld -= nArray[(iFld >>> 1) % 400];
        iFld = n13 << iFld;
        for (n = 14; n < 295; ++n) {
            try {
                n2 = 28353 / n;
                iFld = nArray[n - 1] / -62267;
                n2 = 204 / iFld;
            }
            catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            n2 -= (int)((long)Test.iMeth(iFld) + instanceCount);
            nArray[n] = -5;
            for (n3 = 5; n3 < 89; ++n3) {
                Test.fArrFld[n3] = instanceCount;
                instanceCount >>= n3;
                n4 *= n11;
                iFld -= n;
                n2 = n;
            }
        }
        n2 += n3;
        for (n5 = 6; 395 > n5; ++n5) {
            this.lArrFld[n5] = (long)dFld;
        }
        for (d = 2.0; d < 370.0; d += 1.0) {
            fFld = n11;
            instanceCount -= (long)n2;
        }
        instanceCount -= (long)n5;
        block6: for (n8 = 14; n8 < 317; ++n8) {
            n10 = 1;
            do {
                fFld += (float)n4;
                n2 >>= n;
                if (bl) continue block6;
                instanceCount = n3;
                n9 = n12;
                fFld = n11;
                iFld = n10;
                iFld /= n2 | 1;
            } while (++n10 < 83);
        }
        FuzzerUtils.out.println("i i1 i17 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i18 s2 i19 = " + n4 + "," + n11 + "," + n5);
        FuzzerUtils.out.println("i20 d2 i21 = " + n6 + "," + Double.doubleToLongBits(d) + "," + n7);
        FuzzerUtils.out.println("i22 i23 i24 = " + n8 + "," + n9 + "," + n10);
        FuzzerUtils.out.println("b1 by iArr = " + (bl ? 1 : 0) + "," + n12 + "," + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + instanceCount + "," + iFld + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.dFld Test.fArrFld lArrFld = " + Double.doubleToLongBits(dFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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

    static {
        FuzzerUtils.init(fArrFld, 71.1013f);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

