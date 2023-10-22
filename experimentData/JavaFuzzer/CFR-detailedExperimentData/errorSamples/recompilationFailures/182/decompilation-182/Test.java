/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 254L;
    public static float fFld = -2.83f;
    public static double dFld = 8.102582;
    public static volatile float fFld1 = -126.86f;
    public volatile int iFld = 26;
    public boolean bFld = true;
    public static short[] sArrFld = new short[400];
    public static int[] iArrFld = new int[400];
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1() {
        int n = 46803;
        int n2 = 95;
        int n3 = 111;
        int n4 = -232;
        int n5 = 12;
        int[] nArray = new int[400];
        FuzzerUtils.init(nArray, 18877);
        for (n = 3; n < 167; ++n) {
            for (n3 = n; n3 < 10; n3 += 3) {
                n4 += 83;
                n5 = 1;
                do {
                    try {
                        n4 = n2 % -87;
                        n2 = n5 % 522520565;
                        n4 = n2 / n5;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    n2 <<= n4;
                    instanceCount = 235L;
                    int n6 = n3 - 1;
                    nArray[n6] = nArray[n6] + n;
                    n2 = n;
                    instanceCount &= 0xF638L;
                    fFld += (float)n2;
                    fFld = n4 *= n3;
                } while (++n5 < 1);
                n4 = n;
                int n7 = n3 + 1;
                nArray[n7] = nArray[n7] >> 20184;
            }
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n4 + n5) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth(int n, long l, int n2) {
        boolean bl = false;
        int n3 = -8;
        int n4 = 4;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 2.921f);
        block6: for (short s : sArrFld) {
            Test.vMeth1();
            l |= l;
            if (bl) continue;
            try {
                n2 = n / n;
                n2 = iArrFld[47] / -82044512;
                n2 /= iArrFld[(n >>> 1) % 400];
            }
            catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            switch (54) {
                case 53: {
                    n2 -= (int)fFld;
                    n = (int)instanceCount;
                    n2 = (int)l;
                }
                case 54: {
                    Test.iArrFld[(n >>> 1) % 400] = (int)dFld;
                    continue block6;
                }
                default: {
                    for (n3 = 4; n3 > 1; n3 -= 2) {
                        fFld1 += (float)n3;
                        if (n4 != 0) {
                            vMeth_check_sum += (long)n + l + (long)n2 + (long)(bl ? 1 : 0) + (long)n3 + (long)n4 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
                            return;
                        }
                        n4 -= s;
                        int n5 = n3;
                        fArray[n5] = fArray[n5] - (float)l;
                    }
                }
            }
        }
        vMeth_check_sum += (long)n + l + (long)n2 + (long)(bl ? 1 : 0) + (long)n3 + (long)n4 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public static float fMeth(long l, long l2, int n) {
        int n2 = -244;
        int n3 = 52935;
        int n4 = -7;
        float f = -2.29f;
        int n5 = -7;
        for (n2 = 4; n2 < 170; ++n2) {
            Test.vMeth(64278, instanceCount, n);
            n += n2;
        }
        for (f = 7.0f; 135.0f > f; f += 1.0f) {
            n3 *= n5;
            n5 = (byte)n;
            instanceCount = n4;
        }
        long l3 = l + l2 + (long)n + (long)n2 + (long)n3 + (long)Float.floatToIntBits(f) + (long)n4 + (long)n5;
        fMeth_check_sum += l3;
        return l3;
    }

    public void mainTest(String[] stringArray) {
        int n = 53565;
        int n2 = 44;
        int n3 = 45277;
        int n4 = -250;
        int n5 = 4;
        int n6 = -32626;
        int n7 = -33329;
        int n8 = 223;
        int n9 = 51;
        int n10 = -8;
        int n11 = -9;
        int n12 = 7;
        float f = -72.251f;
        float[] fArray = new float[400];
        int n13 = 44;
        long[] lArray = new long[400];
        double[][][] dArray = new double[400][400][400];
        FuzzerUtils.init(lArray, 2806961701L);
        FuzzerUtils.init(fArray, -83.532f);
        FuzzerUtils.init((Object[][])dArray, (Object)0.32342);
        for (n = 142; n > 5; --n) {
            float f2 = f;
            f = f2 + 1.0f;
            n2 = (int)Test.fMeth(++instanceCount, -13L, -17554);
            lArray[n + 1] = (long)(f2 + (float)instanceCount + (float)n2);
            for (n3 = 183; n3 > 2; --n3) {
                instanceCount += (long)n3;
                switch ((n >>> 1) % 2 + 118) {
                    case 118: {
                        for (n5 = 1; n5 < 2; ++n5) {
                            n6 = n3;
                            n2 += n5 * n2 + n6 - n;
                            n6 = n7;
                        }
                        for (n8 = 1; 2 > n8; ++n8) {
                            int n14 = n3 + 1;
                            iArrFld[n14] = iArrFld[n14] - n5;
                            n6 += n8 * n8;
                            n9 *= (int)instanceCount;
                            this.iFld ^= n;
                            int n15 = n + 1;
                            iArrFld[n15] = iArrFld[n15] - this.iFld;
                            this.iFld = (int)f;
                            n7 = n10;
                            if (this.bFld) {
                                n9 = n5;
                                int n16 = n3;
                                fArray[n16] = fArray[n16] + fFld;
                                if (this.bFld) {
                                    continue;
                                }
                            } else {
                                n7 *= this.iFld;
                            }
                            instanceCount += 20908L;
                        }
                        for (n11 = n; n11 < 2; ++n11) {
                            n12 = n6;
                            int n17 = n - 1;
                            iArrFld[n17] = iArrFld[n17] ^ 0xFFFF82E7;
                            double[] dArray2 = dArray[n - 1][n + 1];
                            int n18 = n;
                            dArray2[n18] = dArray2[n18] * -96.0;
                            instanceCount = n4;
                        }
                    }
                    case 119: {
                        n13 = (byte)n8;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i1 f = " + n + "," + n2 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i15 i16 i17 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i18 i19 i20 = " + n6 + "," + n7 + "," + n8);
        FuzzerUtils.out.println("i21 i22 i23 = " + n9 + "," + n10 + "," + n11);
        FuzzerUtils.out.println("i24 by1 lArr = " + n12 + "," + n13 + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("fArr1 dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][])dArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.fFld1 iFld bFld = " + Float.floatToIntBits(fFld1) + "," + this.iFld + "," + (this.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sArrFld Test.iArrFld = " + FuzzerUtils.checkSum(sArrFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
        FuzzerUtils.init(sArrFld, (short)9775);
        FuzzerUtils.init(iArrFld, -51588);
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

