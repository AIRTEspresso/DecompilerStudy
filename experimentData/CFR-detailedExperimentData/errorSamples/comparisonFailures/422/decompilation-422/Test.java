/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -1068005935077800450L;
    public static short sFld = (short)-18457;
    public static byte byFld = (byte)-40;
    public int iFld = -113;
    public static boolean bFld = true;
    public static int[] iArrFld = new int[400];
    public static volatile byte[] byArrFld = new byte[400];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(int n, int n2, int n3) {
        boolean bl = false;
        boolean[] blArray = new boolean[400];
        int n4 = 106;
        int n5 = 58978;
        int n6 = -6;
        int n7 = 5549;
        int n8 = 6;
        int n9 = 40033;
        double d = -2.94548;
        FuzzerUtils.init(blArray, true);
        n += n;
        Test.iArrFld[(n2 >>> 1) % 400] = n3;
        if (bl) {
            vMeth1_check_sum += (long)(n + n2 + n3 + (bl ? 1 : 0) + n4 + n5 + n6 + n7 + n8 + n9) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(blArray);
            return;
        }
        for (n4 = 8; n4 < 161; ++n4) {
            for (n6 = n4; n6 < 10; ++n6) {
                int n10 = -70;
                for (n8 = 1; n8 < 1; ++n8) {
                    sFld = (short)d;
                    n3 *= (int)instanceCount;
                }
                instanceCount += (long)n10;
                int n11 = n6 - 1;
                iArrFld[n11] = iArrFld[n11] - -18;
                n5 = n9;
                n9 = (int)(instanceCount -= 30310L);
                n3 += n5;
                blArray[n6] = bl;
            }
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + (bl ? 1 : 0) + n4 + n5 + n6 + n7 + n8 + n9) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(blArray);
    }

    public static void vMeth() {
        int n = -5815;
        int n2 = 223;
        int n3 = 4;
        float f = 91.809f;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 60350L);
        lArray[(n >>> 1) % 400] = -1L;
        n >>= Integer.reverseBytes(n);
        n2 = 364;
        while (--n2 > 0) {
            n3 = 1;
            while (++n3 < 5) {
                n <<= n3;
                Test.vMeth1(n3, n3, n2);
                f = 1.0f;
                do {
                    int n4 = (int)(f + 1.0f);
                    iArrFld[n4] = iArrFld[n4] + 4;
                    instanceCount += (long)(f * f);
                    Test.iArrFld[n3 - 1] = n -= n3;
                    byFld = (byte)n2;
                } while ((f += 1.0f) < 1.0f);
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3 + Float.floatToIntBits(f)) + FuzzerUtils.checkSum(lArray);
    }

    public static void vSmallMeth(float f, int n, int n2) {
        Test.vMeth();
        vSmallMeth_check_sum += (long)(Float.floatToIntBits(f) + n + (n2 += (int)instanceCount));
    }

    public void mainTest(String[] stringArray) {
        float f = -16.177f;
        int n = -4235;
        int n2 = 11;
        int n3 = 12;
        int n4 = 56856;
        int n5 = 0;
        double d = -2.57488;
        boolean[] blArray = new boolean[400];
        FuzzerUtils.init(blArray, false);
        for (int i = 0; i < 411; ++i) {
            Test.vSmallMeth(f, 70, this.iFld);
        }
        for (n = 2; n < 305; ++n) {
            n2 = 1264579708;
            n3 = 1;
            do {
                this.iFld = sFld;
                n2 += n3 * n3;
                instanceCount += (long)n3;
                instanceCount = this.iFld;
                n2 <<= (int)instanceCount;
                instanceCount += (long)(n3 * n3);
                block15: for (n4 = 1; n4 < 1; ++n4) {
                    switch (n3 % 2 + 124) {
                        case 124: {
                            blArray[n4 - 1] = true;
                            switch ((this.iFld >>> 1) % 2 + 54) {
                                case 54: {
                                    if (bFld) {
                                        d = n;
                                        Test.byArrFld[n4] = -126;
                                        n2 *= (int)instanceCount;
                                        n2 = n3;
                                    }
                                    n2 += n4 + n4;
                                }
                                case 55: {
                                    n5 = (int)((float)n5 + ((float)(n4 * n4 + n4) - f));
                                    this.iFld = n;
                                    this.iFld -= (int)f;
                                    blArray[n4 + 1] = bFld;
                                    break;
                                }
                                default: {
                                    this.iFld = (int)((float)this.iFld + ((float)n4 - f));
                                }
                            }
                            try {
                                n2 = n4 / -29;
                                n5 = n4 / 18;
                                Test.iArrFld[n3] = 10448 % iArrFld[n];
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            instanceCount *= (long)n2;
                        }
                        case 125: {
                            try {
                                Test.iArrFld[n3 + 1] = -17 % n3;
                                n2 = n3 % -249;
                                n2 = n5 % -40431;
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            continue block15;
                        }
                        default: {
                            byFld = (byte)instanceCount;
                        }
                    }
                }
            } while (++n3 < 83);
        }
        FuzzerUtils.out.println("f2 i15 i16 = " + Float.floatToIntBits(f) + "," + n + "," + n2);
        FuzzerUtils.out.println("i17 i18 i19 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("d1 bArr1 = " + Double.doubleToLongBits(d) + "," + FuzzerUtils.checkSum(blArray));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + instanceCount + "," + sFld + "," + byFld);
        FuzzerUtils.out.println("iFld Test.bFld Test.iArrFld = " + this.iFld + "," + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.byArrFld = " + FuzzerUtils.checkSum(byArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 7108);
        FuzzerUtils.init(byArrFld, (byte)-95);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

