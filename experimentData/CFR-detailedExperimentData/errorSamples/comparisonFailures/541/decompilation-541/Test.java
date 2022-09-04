/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 252L;
    public static short sFld = (short)15107;
    public int iFld = 194;
    public static float fFld = 103.505f;
    public static boolean bFld = false;
    public static volatile long[] lArrFld = new long[400];
    public static int[] iArrFld = new int[400];
    public static boolean[] bArrFld = new boolean[400];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long fMeth_check_sum;

    public static float fMeth(int n) {
        int n2 = -27109;
        int n3 = 45689;
        int n4 = -37857;
        int n5 = 36196;
        int n6 = -5957;
        int n7 = -181;
        int n8 = 213;
        boolean bl = true;
        double[] dArray = new double[400];
        FuzzerUtils.init(dArray, 0.8826);
        int n9 = (n >>> 1) % 400;
        iArrFld[n9] = iArrFld[n9] - (int)instanceCount;
        n2 = 138;
        while (1 < n2) {
            n3 = n2--;
            n <<= sFld;
        }
        for (n4 = 127; n4 > 2; --n4) {
            int n10 = n4 - 1;
            iArrFld[n10] = iArrFld[n10] - -213;
            n6 = 1;
            do {
                n += n2;
                for (n7 = 1; n7 < 1; ++n7) {
                    if (bl) {
                        n3 += -4 + n7 * n7;
                        int n11 = n6 - 1;
                        dArray[n11] = dArray[n11] + 5.0;
                        continue;
                    }
                    if (bl) {
                        sFld = (short)(sFld + (short)((long)(n7 * n5 + n7) - instanceCount));
                        fFld -= (float)n;
                        if (n3 == 0) continue;
                        continue;
                    }
                    int n12 = n6 + 1;
                    lArrFld[n12] = lArrFld[n12] + (long)n7;
                }
            } while (++n6 < 13);
        }
        long l = (long)(n + n2 + n3 + n4 + n5 + n6 + n7 + n8 + (bl ? 1 : 0)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray));
        fMeth_check_sum += l;
        return l;
    }

    public static void vMeth(int n) {
        int n2 = -6;
        int n3 = -35524;
        int n4 = 8;
        int n5 = -250;
        int n6 = 8;
        int n7 = 57115;
        int n8 = 20;
        double d = -117.77503;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 97.215f);
        n2 = 1;
        do {
            n *= n;
            Test.fMeth(n2);
        } while (++n2 < 235);
        instanceCount = n;
        n3 = 1;
        block13: while (++n3 < 158) {
            n += n;
            switch ((n >>> 1) % 8 + 16) {
                case 16: {
                    fFld += (float)(n3 + n2);
                    continue block13;
                }
                case 17: {
                    instanceCount <<= n8;
                    for (n4 = n3; n4 < 10; ++n4) {
                        for (n6 = 1; n6 < 1; ++n6) {
                            n8 = (byte)(n8 + (byte)((long)n6 | instanceCount));
                            d = instanceCount;
                        }
                        try {
                            n5 = -155 % n;
                            n5 = 591746516 / n3;
                            n = -69 / n2;
                            continue;
                        }
                        catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                    }
                    continue block13;
                }
                case 18: {
                    continue block13;
                }
                case 19: {
                    n7 += n3 - n3;
                    continue block13;
                }
                case 20: {
                    sFld = (short)instanceCount;
                    continue block13;
                }
                case 21: {
                    int n9 = n3 + 1;
                    iArrFld[n9] = iArrFld[n9] * 4;
                    continue block13;
                }
                case 22: {
                    int n10 = n3 - 1;
                    fArray[n10] = fArray[n10] + (float)instanceCount;
                    continue block13;
                }
                case 23: {
                    n += n3 * n3;
                }
            }
            sFld = (short)(sFld >> 7318);
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n8 + n4 + n5 + n6 + n7) + Double.doubleToLongBits(d) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public static void vSmallMeth(long l, int n) {
        Test.vMeth(n);
        vSmallMeth_check_sum += (l *= (long)iArrFld[(n >>> 1) % 400]) + (long)n;
    }

    public void mainTest(String[] stringArray) {
        boolean bl = false;
        int n = 9;
        int n2 = 10;
        int n3 = 183;
        int n4 = 4;
        int n5 = -43618;
        int n6 = 13;
        int n7 = 9;
        int n8 = -31904;
        int n9 = 1;
        int n10 = 9;
        double d = 0.121613;
        int n11 = -23;
        float[][] fArray = new float[400][400];
        FuzzerUtils.init(fArray, 75.346f);
        bl = true;
        bl = true;
        int n12 = (this.iFld >>> 1) % 400;
        long l = lArrFld[n12] - 1L;
        lArrFld[n12] = l;
        sFld = (short)Long.reverseBytes(l);
        for (int i = 0; i < 155; ++i) {
            Test.vSmallMeth(instanceCount, this.iFld);
        }
        instanceCount = this.iFld;
        this.iFld = this.iFld;
        this.iFld >>>= this.iFld;
        for (n = 1; n < 326; ++n) {
            if (bl) {
                this.iFld -= n;
                instanceCount <<= -6;
                fFld = n2;
                this.iFld -= sFld;
                for (n3 = n; n3 < 77; ++n3) {
                    n2 = (int)d;
                    for (n5 = 1; n5 < 1; ++n5) {
                        d *= (double)n3;
                    }
                    for (n7 = n3; 1 > n7; ++n7) {
                        int n13 = n + 1;
                        iArrFld[n13] = iArrFld[n13] << n8;
                        fFld += (float)n11;
                        sFld = (short)(sFld + (short)n6);
                    }
                    n8 >>>= this.iFld;
                    float[] fArray2 = fArray[n3];
                    int n14 = n3;
                    fArray2[n14] = fArray2[n14] * (float)n2;
                    n8 += n2;
                    for (n9 = n3; n9 < 1; ++n9) {
                        instanceCount += instanceCount;
                        instanceCount += (long)(n9 ^ sFld);
                        n2 = (int)(fFld += 65459.0f);
                        int n15 = n3 - 1;
                        lArrFld[n15] = lArrFld[n15] + (long)n11;
                    }
                }
                continue;
            }
            if (bFld) {
                fFld = n7;
                continue;
            }
            if (!bFld) continue;
            n10 *= n11;
        }
        FuzzerUtils.out.println("b i16 i17 = " + (bl ? 1 : 0) + "," + n + "," + n2);
        FuzzerUtils.out.println("i18 i19 d1 = " + n3 + "," + n4 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("i20 i21 i22 = " + n5 + "," + n6 + "," + n7);
        FuzzerUtils.out.println("i23 by1 i24 = " + n8 + "," + n11 + "," + n9);
        FuzzerUtils.out.println("i25 fArr1 = " + n10 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld iFld = " + instanceCount + "," + sFld + "," + this.iFld);
        FuzzerUtils.out.println("Test.fFld Test.bFld Test.lArrFld = " + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.iArrFld Test.bArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
        FuzzerUtils.init(lArrFld, -36L);
        FuzzerUtils.init(iArrFld, 16937);
        FuzzerUtils.init(bArrFld, true);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
    }
}

