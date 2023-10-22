/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -13400L;
    public static short sFld = (short)29789;
    public static int iFld = 41363;
    public static volatile float fFld = -107.67f;
    public static boolean bFld = true;
    public double dFld = -1.19269;
    public static int iFld1 = 24598;
    public static byte[] byArrFld = new byte[400];
    public static long lMeth_check_sum;
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(int n, boolean bl, int n2) {
        int n3 = -2;
        int n4 = -45388;
        int n5 = -11;
        int n6 = -5;
        int n7 = 10;
        int n8 = -188;
        int n9 = 5;
        double d = 97.80612;
        float f = 2.674f;
        float f2 = 2.74f;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, -1.711f);
        for (n3 = 306; n3 > 12; n3 -= 3) {
            int n10 = n3;
            fArray[n10] = fArray[n10] * (float)n;
            for (n5 = 1; n5 < 16; ++n5) {
                n = (int)d;
                sFld = (short)(sFld + (short)n5);
                for (n7 = n5; n7 < 2; ++n7) {
                    if (bl) continue;
                    n6 |= n7;
                    int n11 = n3;
                    byArrFld[n11] = (byte)(byArrFld[n11] >> (byte)n4);
                    n8 += (int)f;
                    n6 = (int)((long)n6 + ((long)(n7 * n6 + n3) - instanceCount));
                    int n12 = n5 - 1;
                    byArrFld[n12] = (byte)(byArrFld[n12] + (byte)sFld);
                }
                for (f2 = 1.0f; f2 < 2.0f && !bl; f2 += 1.0f) {
                    instanceCount += (long)f;
                }
            }
        }
        vMeth_check_sum += (long)(n + (bl ? 1 : 0) + n2 + n3 + n4 + n5 + n6) + Double.doubleToLongBits(d) + (long)n7 + (long)n8 + (long)Float.floatToIntBits(f) + (long)Float.floatToIntBits(f2) + (long)n9 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public static float fMeth(int n, double d) {
        int n2 = -58601;
        int n3 = 19738;
        int n4 = 2;
        int n5 = 9;
        int n6 = 4;
        int n7 = 6;
        int n8 = -141;
        int[] nArray = new int[400];
        FuzzerUtils.init(nArray, 33251);
        Test.vMeth(n, true, -12);
        n2 = 170;
        while (n2 > 6) {
            for (n4 = 10; n4 > 1; n4 -= 3) {
                if (n != 0) {
                    // empty if block
                }
                n5 = n;
                for (n6 = 1; n6 < 4; ++n6) {
                    try {
                        n3 = -18681 / n7;
                        n = n7 / -9306;
                        n5 = n6 % nArray[n2 - 1];
                        continue;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                }
                int n9 = n4 + 1;
                nArray[n9] = nArray[n9] - n2;
                d -= (double)iFld;
                fFld -= (float)n4;
            }
            n3 = n2--;
            if (bFld) break;
        }
        n8 = 1;
        while (++n8 < 253) {
            int n10 = n8 - 1;
            byArrFld[n10] = (byte)(byArrFld[n10] - (byte)d);
            instanceCount -= (long)n5;
        }
        long l = (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + FuzzerUtils.checkSum(nArray);
        fMeth_check_sum += l;
        return l;
    }

    public static long lMeth(long l) {
        int n = -16580;
        int n2 = -143;
        double d = -89.46318;
        n = (short)(n - (short)n2);
        int n3 = (n2 >>> 1) % 400;
        byArrFld[n3] = (byte)(byArrFld[n3] - (byte)Test.fMeth(n2, d));
        long l2 = l + (long)n + (long)n2 + Double.doubleToLongBits(d);
        lMeth_check_sum += l2;
        return l2;
    }

    public void mainTest(String[] stringArray) {
        boolean bl = true;
        int n = 54830;
        int n2 = -218;
        int n3 = 231;
        int n4 = 9;
        int n5 = -17949;
        int n6 = -7;
        int n7 = 57;
        int n8 = -58117;
        int n9 = -188;
        int n10 = -54;
        int[] nArray = new int[400];
        long l = -57605L;
        long[] lArray = new long[400];
        float[] fArray = new float[400];
        FuzzerUtils.init(nArray, 240);
        FuzzerUtils.init(lArray, -49946L);
        FuzzerUtils.init(fArray, 0.824f);
        bl = (long)n++ <= (long)Math.abs(n) - Test.lMeth(instanceCount);
        for (n2 = 1; n2 < 125; ++n2) {
            n4 = 1;
            while (++n4 < 202) {
                for (n5 = n2; n5 < 1; ++n5) {
                    n3 -= sFld;
                    n3 <<= -90;
                    iFld ^= 7;
                    instanceCount += (long)n2;
                    try {
                        n = -49243 / nArray[n2 + 1];
                        n3 = 12 % n2;
                        iFld = n5 % n6;
                        continue;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                }
            }
            n7 = 1;
            while (++n7 < 202) {
                block22: for (n8 = 1; n8 < 1; ++n8) {
                    int n11 = 43;
                    switch (n7 % 10 + 29) {
                        case 29: {
                            fFld -= (float)n9;
                            continue block22;
                        }
                        case 30: {
                            instanceCount = n3;
                            continue block22;
                        }
                        case 31: {
                            n10 += n6;
                            n9 = (int)l;
                            this.dFld = instanceCount;
                            continue block22;
                        }
                        case 32: {
                            n = (int)((float)n + ((float)n8 * fFld + (float)n5 - (float)instanceCount));
                            n10 += n8;
                            switch (n8 % 2 * 5 + 85) {
                                case 90: {
                                    l += (long)n8;
                                    n -= iFld1;
                                    break;
                                }
                                case 91: {
                                    int n12 = n2;
                                    lArray[n12] = lArray[n12] | 0x2819L;
                                    n11 = (byte)(n11 + (byte)n9);
                                }
                            }
                            continue block22;
                        }
                        case 33: {
                            continue block22;
                        }
                        case 34: {
                            fFld += (float)n10;
                            iFld -= n;
                        }
                        case 35: {
                            l = (long)fFld;
                            fFld += (float)n8;
                            continue block22;
                        }
                        case 36: {
                            instanceCount += (long)(n8 * n9 + n11 - n9);
                        }
                        case 37: {
                            l += (long)(n8 * n9) + l - (long)n7;
                            continue block22;
                        }
                        case 38: {
                            fFld += (float)((long)n8 * l + (long)n6 - (long)n3);
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println("b i i19 = " + (bl ? 1 : 0) + "," + n + "," + n2);
        FuzzerUtils.out.println("i20 i21 i22 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i23 i24 i25 = " + n6 + "," + n7 + "," + n8);
        FuzzerUtils.out.println("i26 i27 l1 = " + n9 + "," + n10 + "," + l);
        FuzzerUtils.out.println("iArr1 lArr fArr1 = " + FuzzerUtils.checkSum(nArray) + "," + FuzzerUtils.checkSum(lArray) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.iFld = " + instanceCount + "," + sFld + "," + iFld);
        FuzzerUtils.out.println("Test.fFld Test.bFld dFld = " + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(this.dFld));
        FuzzerUtils.out.println("Test.iFld1 Test.byArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(byArrFld, (byte)27);
        lMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

