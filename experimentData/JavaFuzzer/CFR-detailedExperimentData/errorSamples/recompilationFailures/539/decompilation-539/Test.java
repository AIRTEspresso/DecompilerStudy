/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 227L;
    public static int iFld = -5;
    public static volatile double[] dArrFld = new double[400];
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    public static void vMeth2(int n) {
        int n2 = 167;
        int n3 = -56;
        int n4 = 117;
        int n5 = -13;
        int[] nArray = new int[400];
        float f = 0.605f;
        double d = -118.46446;
        boolean bl = false;
        boolean[] blArray = new boolean[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 30838L);
        FuzzerUtils.init(blArray, false);
        FuzzerUtils.init(nArray, -36499);
        lArray[110] = lArray[110] / (instanceCount | 1L);
        if (bl) {
            for (n2 = 11; n2 < 378; ++n2) {
                f += (float)n;
                block10: for (n4 = 1; n4 < 5; ++n4) {
                    switch (n2 % 5 * 5 + 90) {
                        case 92: {
                            try {
                                n3 = n2 / 212;
                                nArray[n2] = n4 % -105;
                                n3 %= -167;
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            d = instanceCount;
                        }
                        case 94: {
                            n = (int)((long)n + ((long)n4 | (long)f));
                            instanceCount += (long)f;
                            n3 = 99;
                            continue block10;
                        }
                        case 106: {
                            n ^= 0xFFFF5C96;
                            continue block10;
                        }
                        case 95: {
                            nArray[n2 + 1] = n2;
                            continue block10;
                        }
                        case 98: {
                            n5 += n5;
                        }
                    }
                }
            }
        } else {
            nArray[107] = nArray[107] + n2;
        }
        vMeth2_check_sum += (long)(n + n2 + n3 + Float.floatToIntBits(f) + n4 + n5) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(blArray) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth1(int n, int n2) {
        float f = -36.656f;
        float f2 = 101.41f;
        int n3 = -101;
        int n4 = -192;
        int n5 = -13;
        int n6 = 14;
        int[][][] nArray = new int[400][400][400];
        double d = 96.125212;
        FuzzerUtils.init((Object[][])nArray, (Object)101);
        f += (float)(++n2);
        int[] nArray2 = nArray[(n >>> 1) % 400][(n >>> 1) % 400];
        int n7 = (n2 >>> 1) % 400;
        nArray2[n7] = nArray2[n7] + n;
        Test.vMeth2(n);
        n3 = 1;
        do {
            for (n4 = 4; n4 > 1; --n4) {
                for (f2 = 1.0f; f2 < 2.0f; f2 += 1.0f) {
                    n5 = n2;
                    n2 += 144;
                    nArray[(int)(f2 - 1.0f)][(int)f2][n4] = n6 -= (int)f;
                    n2 <<= -29190;
                }
            }
        } while (++n3 < 390);
        vMeth1_check_sum += (long)(n + n2 + Float.floatToIntBits(f) + n3 + n4 + n5) + Double.doubleToLongBits(d) + (long)Float.floatToIntBits(f2) + (long)n6 + FuzzerUtils.checkSum((Object[][])nArray);
    }

    public static void vMeth(byte by) {
        int n = 94;
        int n2 = -189;
        int n3 = -2;
        int n4 = 180;
        int n5 = -54063;
        int n6 = 129;
        int n7 = 11797;
        int[] nArray = new int[400];
        boolean bl = false;
        double d = -1.43336;
        int n8 = -12824;
        FuzzerUtils.init(nArray, -22459);
        Test.vMeth1(n, n);
        for (n2 = 2; 209 > n2 && !bl; ++n2) {
            instanceCount += instanceCount;
        }
        d = n8;
        for (n4 = 6; 330 > n4; ++n4) {
            n *= n3;
            for (n6 = 1; 5 > n6; ++n6) {
                n7 += n6 - n3;
                int n9 = n4;
                nArray[n9] = nArray[n9] | n4;
                try {
                    n5 = n4 % 240;
                    n5 = iFld % -255;
                    nArray[n6 + 1] = n7 % 204;
                }
                catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                instanceCount <<= by;
                instanceCount -= -224L;
                iFld |= n5;
                iFld *= n8;
            }
        }
        vMeth_check_sum += (long)(by + n + n2 + n3 + (bl ? 1 : 0)) + Double.doubleToLongBits(d) + (long)n8 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        byte by = -26;
        byte[] byArray = new byte[400];
        int n = 7;
        int n2 = 35;
        int n3 = 12;
        int n4 = 9;
        int n5 = -48;
        int n6 = 43;
        double d = -20.108593;
        float f = -35.744f;
        boolean[] blArray = new boolean[400];
        FuzzerUtils.init(blArray, true);
        FuzzerUtils.init(byArray, (byte)-126);
        Test.vMeth(by);
        block11: for (int n7 : iArrFld) {
            instanceCount = n7;
            int n8 = (n >>> 1) % 400;
            iArrFld[n8] = iArrFld[n8] - iFld;
            iFld -= (int)d;
            f -= (float)n7;
            switch ((n >>> 1) % 2 * 5 + 30) {
                case 32: {
                    int n9;
                    n2 = 1;
                    do {
                        instanceCount = n2;
                        int n10 = n2 + 1;
                        dArrFld[n10] = dArrFld[n10] * (double)n2;
                        n7 /= iFld | 1;
                        n = (int)instanceCount;
                        f = -57071.0f;
                        ++iFld;
                        for (n3 = 1; n3 > n2; --n3) {
                            n9 = 0;
                            try {
                                n7 = 54627 / n4;
                                iFld = iArrFld[n3 + 1] % iFld;
                                Test.iArrFld[n3 + 1] = 143 / n3;
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            blArray[n2 + 1] = n9;
                        }
                        n4 >>>= n3;
                        f -= 6.0f;
                    } while (++n2 < 63);
                    instanceCount -= instanceCount;
                    f = n;
                    block14: for (n5 = 3; n5 < 63; n5 += 3) {
                        n9 = 31371;
                        int n11 = n5 + 1;
                        iArrFld[n11] = iArrFld[n11] - n2;
                        n ^= n4;
                        switch (n5 % 3 + 33) {
                            case 33: {
                                n7 = n6;
                                continue block14;
                            }
                            case 34: {
                                instanceCount = n3;
                                int n12 = n5;
                                byArray[n12] = (byte)(byArray[n12] >>> (byte)n);
                                n4 *= -55945;
                                n -= (int)d;
                            }
                            case 35: {
                                int n13 = n5 - 1;
                                iArrFld[n13] = iArrFld[n13] >>> n9;
                                continue block14;
                            }
                            default: {
                                n6 += n5;
                            }
                        }
                    }
                    continue block11;
                }
                case 40: {
                    n6 += 111;
                }
                default: {
                    d = n5;
                }
            }
        }
        FuzzerUtils.out.println("by1 i19 d3 = " + by + "," + n + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("f3 i20 i21 = " + Float.floatToIntBits(f) + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i22 i23 i24 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("bArr1 byArr = " + FuzzerUtils.checkSum(blArray) + "," + FuzzerUtils.checkSum(byArray));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dArrFld = " + instanceCount + "," + iFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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

    static {
        FuzzerUtils.init(dArrFld, -35.382);
        FuzzerUtils.init(iArrFld, 13);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}

