/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 2085349214L;
    public static double dFld = 0.90949;
    public static short sFld = (short)3971;
    public static boolean bFld = false;
    public static int[] iArrFld = new int[400];
    public boolean[] bArrFld = new boolean[400];
    public static long iMeth_check_sum;
    public static long lMeth_check_sum;
    public static long lMeth1_check_sum;

    public static long lMeth1() {
        int n = 41;
        int n2 = 11;
        int n3 = 127;
        int n4 = -4;
        int n5 = -9097;
        int n6 = -1978;
        int n7 = 0;
        int n8 = -9589;
        boolean bl = false;
        float f = -97.969f;
        long[][] lArray = new long[400][400];
        FuzzerUtils.init(lArray, -13L);
        try {
            for (n = 11; n < 590; ++n) {
                if (bl) {
                    for (n3 = -399; n3 < 4; ++n3) {
                        for (n5 = -399; n5 < 1; ++n5) {
                            dFld = n4;
                        }
                    }
                } else {
                    int n9 = n;
                    iArrFld[n9] = iArrFld[n9] - -12;
                }
                n2 = (int)instanceCount;
                for (n7 = 1; n7 < 4; ++n7) {
                    int n10 = 25880;
                    dFld -= (double)f;
                    n10 = (short)(n10 + (short)n5);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
        long l = (long)(n + n2 + (bl ? 1 : 0) + n3 + n4 + n5 + n6 + n7 + n8 + Float.floatToIntBits(f)) + FuzzerUtils.checkSum(lArray);
        lMeth1_check_sum += l;
        return l;
    }

    public static long lMeth(double d, long l) {
        float f = -120.854f;
        float[] fArray = new float[400];
        int n = -7676;
        int n2 = -65008;
        int n3 = 23;
        int n4 = 9;
        int n5 = 0;
        int n6 = -24505;
        boolean bl = false;
        FuzzerUtils.init(fArray, 1.466f);
        f += (float)(Test.lMeth1() - (long)n);
        for (n2 = 1; n2 < 149; ++n2) {
            instanceCount = -188L;
            for (n4 = 1; n4 < 11; ++n4) {
                int n7 = n4 + 1;
                iArrFld[n7] = iArrFld[n7] >> n6;
                n = n6;
                n3 = (int)(instanceCount -= (long)n2);
                n6 += 9;
                bl = false;
                n6 = n;
                l += (long)(n4 * sFld + n2 - sFld);
                n3 += n4 * n2 + n3 - n2;
            }
        }
        dFld = n2;
        instanceCount -= (long)n6;
        long l2 = Double.doubleToLongBits(d) + l + (long)Float.floatToIntBits(f) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)(bl ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        lMeth_check_sum += l2;
        return l2;
    }

    public static int iMeth(double d, long l) {
        int n = 177;
        int n2 = -132;
        int n3 = 2;
        int n4 = -200;
        int n5 = 11245;
        int n6 = -21;
        int n7 = 2;
        float f = 0.441f;
        float[] fArray = new float[400];
        int n8 = -61;
        long l2 = -1424L;
        boolean bl = false;
        FuzzerUtils.init(fArray, -5.468f);
        n = 2;
        while (136 > n) {
            for (n3 = n; n3 < 12; ++n3) {
                fArray[n - 1] = (float)((double)instanceCount-- + (-95.28634 - (double)(-5L + l--)));
                n4 = n4++;
            }
            n2 += n;
            int n9 = n++;
            iArrFld[n9] = iArrFld[n9] >> (int)Test.lMeth(119.68848, l);
            f = n8;
        }
        block2: for (n5 = 218; n5 > 7; --n5) {
            n4 *= (int)f;
            for (l2 = 1L; l2 < 8L; ++l2) {
                n2 *= -12;
                int n10 = n5;
                iArrFld[n10] = iArrFld[n10] << n6;
                if (bl) continue block2;
                n7 = n5;
            }
        }
        long l3 = Double.doubleToLongBits(d) + l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)Float.floatToIntBits(f) + (long)n8 + (long)n5 + (long)n6 + l2 + (long)n7 + (long)(bl ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        iMeth_check_sum += l3;
        return (int)l3;
    }

    public void mainTest(String[] stringArray) {
        double d = -1.45484;
        int n = 21343;
        int n2 = -3;
        int n3 = -43216;
        float f = 2.136f;
        float[] fArray = new float[400];
        int n4 = -7;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(fArray, -49.647f);
        FuzzerUtils.init(byArray, (byte)-122);
        Test.iMeth(dFld, instanceCount);
        d = 1.0;
        block8: do {
            n += (int)(d * (double)n + (double)f - (double)n4);
            n2 = 1;
            do {
                n3 = 1;
                while (--n3 > 0 && !bFld) {
                    n += n3 + n2;
                    n *= n2;
                    n |= n;
                    sFld = (short)(sFld + (short)n3);
                    n += n3;
                    try {
                        n /= n;
                        n = iArrFld[n3] / n;
                        Test.iArrFld[n3 - 1] = n2 / 91;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    int n5 = (int)(d + 1.0);
                    fArray[n5] = fArray[n5] - (float)instanceCount;
                    n = (int)((long)n + ((long)(n3 * n3 + n) - instanceCount));
                    try {
                        n = 51458 % iArrFld[n3];
                        n = -51783 % iArrFld[n2 - 1];
                        n = 4501 % n2;
                    }
                    catch (ArithmeticException arithmeticException) {}
                }
                n = n3;
                if (bFld) continue block8;
                this.bArrFld[(int)(d + 1.0)] = bFld;
                switch (n2 % 2 + 18) {
                    case 18: {
                        byArray[(int)d] = n4;
                        n = (int)((long)n + ((long)n2 - instanceCount));
                        sFld = (short)instanceCount;
                        break;
                    }
                    case 19: {
                        n += (int)instanceCount;
                        int n6 = n2 - 1;
                        iArrFld[n6] = iArrFld[n6] - (int)instanceCount;
                        f *= (float)n2;
                        n += 59347;
                    }
                    default: {
                        if (bFld) {
                            n += n;
                            f += (float)n2;
                            break;
                        }
                        n = (int)((long)n + ((long)(n2 * n3) + instanceCount - (long)n));
                    }
                }
            } while (++n2 < 142);
        } while ((d += 1.0) < 177.0);
        FuzzerUtils.out.println("d2 i21 f4 = " + Double.doubleToLongBits(d) + "," + n + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("by1 i22 i23 = " + n4 + "," + n2 + "," + n3);
        FuzzerUtils.out.println("fArr2 byArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + "," + FuzzerUtils.checkSum(byArray));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.sFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + sFld);
        FuzzerUtils.out.println("Test.bFld Test.iArrFld bArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(this.bArrFld));
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -136);
        iMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        lMeth1_check_sum = 0L;
    }
}

