/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 60695L;
    public static short sFld = (short)-12971;
    public static byte byFld = (byte)-108;
    public static boolean bFld = false;
    public static int[] iArrFld = new int[400];
    public static volatile long[] lArrFld = new long[400];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth1_check_sum;

    public static int iMeth1(int n, double d, int n2) {
        int n3 = -250;
        int n4 = 7;
        int n5 = 36535;
        int n6 = -65196;
        int[] nArray = new int[400];
        int[] nArray2 = new int[400];
        int n7 = -7608;
        int n8 = 117;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(byArray, (byte)83);
        FuzzerUtils.init(nArray, -11);
        FuzzerUtils.init(nArray2, 11);
        byArray[(n >>> 1) % 400] = (byte)n;
        block5: for (n3 = 324; n3 > 12; --n3) {
            n5 = 1;
            do {
                nArray = nArray2;
                n7 = (short)instanceCount;
                n2 += (int)instanceCount;
            } while (++n5 < 5);
            n4 += n;
            instanceCount = -235L;
            n8 = 30;
            instanceCount = n;
            switch (n3 % 3 * 5 + 49) {
                case 53: {
                    n6 = 1;
                    while (++n6 < 5) {
                        instanceCount = n;
                        n4 += n6;
                    }
                    continue block5;
                }
                case 51: {
                    n4 = n5;
                    continue block5;
                }
                case 63: {
                    n4 = n6;
                }
            }
        }
        long l = (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n7 + (long)n8 + (long)n6 + FuzzerUtils.checkSum(byArray) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(nArray2);
        iMeth1_check_sum += l;
        return (int)l;
    }

    public static void vMeth() {
        int n = 19;
        n = -8 * Test.iMeth1(n, -89.39037, -131);
        vMeth_check_sum += (long)n;
    }

    public static int iMeth() {
        int n = -181;
        int n2 = -130;
        int n3 = 14;
        double d = 79.34239;
        float f = 1.764f;
        int n4 = -1;
        short[] sArray = new short[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(sArray, (short)-25215);
        FuzzerUtils.init(lArray, -5345615981701219748L);
        try {
            for (n = 133; n > -398; --n) {
                d = n2++;
                Test.vMeth();
                n3 = 1;
                block14: while (++n3 < 4) {
                    f *= 106.0f;
                    int n5 = n - 1;
                    sArray[n5] = (short)(sArray[n5] * (short)n);
                    d *= 47096.0;
                    switch (((n2 >>>= (int)(instanceCount -= -14L)) >>> 1) % 10 + 87) {
                        case 87: {
                            n4 = (byte)n3;
                            continue block14;
                        }
                        case 88: {
                            n2 = n3;
                            n2 = -713;
                            n2 += (int)f;
                            continue block14;
                        }
                        case 89: {
                            Test.iArrFld[n] = (int)instanceCount;
                            continue block14;
                        }
                        case 90: {
                            f *= 23408.0f;
                        }
                        case 91: {
                            int n6 = n3 + 1;
                            lArray[n6] = lArray[n6] % (long)(n3 | 1);
                        }
                        case 92: {
                            n2 *= n2;
                            continue block14;
                        }
                        case 93: 
                        case 94: {
                            int n7 = n;
                            iArrFld[n7] = iArrFld[n7] + n;
                            continue block14;
                        }
                        case 95: {
                            instanceCount += (long)n3;
                        }
                        case 96: {
                            d += (double)n;
                            continue block14;
                        }
                    }
                    n2 >>= -10;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            d = -124.0;
        }
        long l = (long)(n + n2) + Double.doubleToLongBits(d) + (long)n3 + (long)Float.floatToIntBits(f) + (long)n4 + FuzzerUtils.checkSum(sArray) + FuzzerUtils.checkSum(lArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        long l = -6680001980801465313L;
        int n = 170;
        int n2 = 214;
        int n3 = -210;
        int n4 = 7;
        int n5 = 7;
        int n6 = 44204;
        int n7 = 14;
        float f = -1.267f;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(byArray, (byte)39);
        for (l = 1L; l < 272L; ++l) {
            instanceCount *= (long)Math.abs((int)(26.939f + (float)Test.iMeth()));
            n |= (int)l;
            instanceCount += l;
            for (n2 = 5; n2 < 93; ++n2) {
                n3 = n2;
                f -= -29.0f;
                n >>= n2;
                if (bFld) {
                    if (bFld) {
                        for (n4 = 1; n4 < 2; ++n4) {
                            Test.iArrFld[(int)l] = n2;
                            int n8 = (int)(l + 1L);
                            iArrFld[n8] = iArrFld[n8] ^ (int)l;
                            n *= n4;
                            Test.iArrFld[n4] = (int)f;
                            sFld = (short)(instanceCount += (long)n4);
                            n3 -= (int)instanceCount;
                            Test.iArrFld[n2 - 1] = 142;
                        }
                        byFld = (byte)(byFld | (byte)n3);
                        Test.iArrFld[n2 - 1] = n5;
                        int n9 = (int)l;
                        lArrFld[n9] = lArrFld[n9] - (long)n;
                    } else {
                        for (n6 = 1; 2 > n6; ++n6) {
                            n5 = 199;
                        }
                    }
                    sFld = (short)(sFld >> (short)n3);
                    byArray[(int)l] = (byte)n2;
                    try {
                        n = 6079 / n2;
                        n5 = n6 / n5;
                        Test.iArrFld[n2 - 1] = iArrFld[(int)(l - 1L)] / n5;
                    }
                    catch (ArithmeticException arithmeticException) {}
                    continue;
                }
                try {
                    n7 = n3 / 56045;
                    n5 = n4 % -25;
                    Test.iArrFld[(int)l] = iArrFld[(int)(l - 1L)] / 226;
                }
                catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                sFld = (short)l;
            }
        }
        FuzzerUtils.out.println("l i i11 = " + l + "," + n + "," + n2);
        FuzzerUtils.out.println("i12 f1 i13 = " + n3 + "," + Float.floatToIntBits(f) + "," + n4);
        FuzzerUtils.out.println("i14 i15 i16 = " + n5 + "," + n6 + "," + n7);
        FuzzerUtils.out.println("byArr1 = " + FuzzerUtils.checkSum(byArray));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + instanceCount + "," + sFld + "," + byFld);
        FuzzerUtils.out.println("Test.bFld Test.iArrFld Test.lArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
        FuzzerUtils.init(iArrFld, 89);
        FuzzerUtils.init(lArrFld, 507897389772567526L);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }
}

