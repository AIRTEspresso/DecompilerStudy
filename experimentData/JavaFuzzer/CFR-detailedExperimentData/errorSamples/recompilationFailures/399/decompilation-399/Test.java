/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 1821961752287876664L;
    public static double dFld = 2.3843;
    public int iFld = -3;
    public static float fFld = 78.6f;
    public static boolean bFld = false;
    public volatile byte byFld = (byte)18;
    public short sFld = (short)-15127;
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long byMeth_check_sum;
    public static long iMeth_check_sum;

    public static int iMeth(int n, long l, double d) {
        int n2 = 23554;
        int n3 = 1600;
        int n4 = 34837;
        int n5 = -61675;
        float f = 72.648f;
        int n6 = 484;
        n -= n;
        for (n2 = 143; n2 > 1; --n2) {
            n4 = 1;
            do {
                for (f = 1.0f; f < 1.0f; f += 1.0f) {
                    int n7 = 9;
                    n7 = (byte)n;
                    n7 = 16;
                    n -= n4;
                    d += (double)l;
                    n5 += (int)(f * (float)n5 + (float)n6 - (float)n4);
                    n += (int)instanceCount;
                    l += (long)n4;
                }
                n >>= n6;
                n5 *= -33;
                n += n3;
            } while (++n4 < 11);
        }
        long l2 = (long)n + l + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)Float.floatToIntBits(f) + (long)n5 + (long)n6;
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public static byte byMeth() {
        int n = -232;
        int n2 = -8;
        int n3 = -2;
        int n4 = 22431;
        int n5 = 64728;
        int n6 = -49849;
        int n7 = 21102;
        int n8 = 84;
        int n9 = -185;
        int n10 = 0;
        int[] nArray = new int[400];
        int n11 = -11995;
        int n12 = -31;
        float f = 0.394f;
        float[] fArray = new float[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(fArray, 0.383f);
        FuzzerUtils.init(lArray, -3089688151L);
        FuzzerUtils.init(nArray, 55956);
        block14: for (n = 342; n > 16; --n) {
            int n13 = n;
            fArray[n13] = fArray[n13] - ((float)(-(n2 - n11)) + (103.596f + (float)Test.iMeth(n2, instanceCount, dFld)) - 43490.0f);
            switch (n % 10 + 57) {
                case 57: {
                    n3 = 1;
                    while (++n3 < 5) {
                        int n14 = n3 + 1;
                        lArray[n14] = lArray[n14] & (long)n;
                    }
                    for (n4 = 1; n4 < 5; ++n4) {
                        for (n6 = 1; n6 < 2; ++n6) {
                            n5 += n6 * n2;
                            n5 += (int)dFld;
                            n8 = n12;
                        }
                        instanceCount -= (long)n2;
                        n9 = 1;
                        if (n9 < 2) {
                            n5 >>= n6;
                        }
                        if (n3 == 0) continue;
                    }
                    continue block14;
                }
                case 58: {
                    int n15 = n;
                    lArray[n15] = lArray[n15] >> n4;
                    continue block14;
                }
                case 59: {
                    int n16 = n;
                    lArray[n16] = lArray[n16] - -6L;
                    continue block14;
                }
                case 60: {
                    n2 = -48502;
                    continue block14;
                }
                case 61: {
                    f -= (float)n;
                }
                case 62: {
                    int n17 = n + 1;
                    fArray[n17] = fArray[n17] + (float)instanceCount;
                    continue block14;
                }
                case 63: {
                    f += (float)instanceCount;
                    continue block14;
                }
                case 64: {
                    n10 = n8;
                    continue block14;
                }
                case 65: {
                    f = n12;
                    continue block14;
                }
                case 66: {
                    n5 = 14;
                    continue block14;
                }
                default: {
                    try {
                        n5 = nArray[n - 1] / 788266506;
                        n10 = -134 / n3;
                        n8 = n10 % -21855;
                        continue block14;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                }
            }
        }
        long l = (long)(n + n2 + n11 + n3 + n4 + n5 + n6 + n7 + n8 + n12 + n9 + n10 + Float.floatToIntBits(f)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
        byMeth_check_sum += l;
        return (byte)l;
    }

    public void vMeth() {
        float f = 0.313f;
        int n = 6088;
        int n2 = 62254;
        int[] nArray = new int[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -50898L);
        FuzzerUtils.init(nArray, 9);
        Test.byMeth();
        for (long l : lArray) {
            this.iFld = this.iFld;
            f -= (float)instanceCount;
            instanceCount = 2L;
            this.iFld = this.iFld;
            int n3 = (this.iFld >>> 1) % 400;
            nArray[n3] = nArray[n3] >>> this.iFld;
            for (n = 1; n < 4; ++n) {
                this.iFld += n ^ n2;
                this.iFld += n;
                instanceCount = n2;
                this.iFld = this.iFld;
                f -= (float)n;
                n2 += n;
            }
        }
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + n2) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        int n = -63964;
        int n2 = 60528;
        int n3 = -2;
        int n4 = -3;
        int n5 = -56824;
        int n6 = -7;
        int n7 = -243;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 221L);
        this.vMeth();
        for (n = 377; n > 9; --n) {
            instanceCount <<= this.iFld;
        }
        this.iFld -= n2;
        fFld += (float)dFld;
        this.iFld = this.iFld;
        for (n3 = 9; n3 < 190; ++n3) {
            block5: for (n5 = 139; n5 > 3; --n5) {
                iArrFld = FuzzerUtils.int1array(400, -86);
                instanceCount = n;
                switch (n3 % 1 + 75) {
                    case 75: {
                        if (bFld) continue block5;
                        this.iFld += n5;
                        instanceCount *= instanceCount;
                        if (bFld) {
                            dFld = fFld;
                            Test.iArrFld[n3] = (int)instanceCount;
                            n4 += n2;
                            continue block5;
                        }
                        n4 = 201;
                        n4 = n;
                        n2 = (int)((float)n2 + ((float)n5 * fFld + (float)this.byFld - (float)this.iFld));
                        continue block5;
                    }
                    default: {
                        fFld -= (float)n6;
                        n7 = 2;
                        while ((n7 -= 2) > 0) {
                            this.sFld = (short)(this.sFld + (short)((long)n7 | (instanceCount -= -1L)));
                            instanceCount += 125L;
                            n4 = (int)((float)n4 + ((float)(n7 * this.iFld + n) - fFld));
                            int n8 = n5 + 1;
                            iArrFld[n8] = iArrFld[n8] & n6;
                            n4 = this.sFld;
                        }
                        break block0;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i17 i18 i19 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i20 i21 i22 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i23 lArr2 = " + n7 + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + this.iFld);
        FuzzerUtils.out.println("Test.fFld Test.bFld byFld = " + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0) + "," + this.byFld);
        FuzzerUtils.out.println("sFld Test.iArrFld = " + this.sFld + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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

    static {
        FuzzerUtils.init(iArrFld, 2);
        vMeth_check_sum = 0L;
        byMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}

