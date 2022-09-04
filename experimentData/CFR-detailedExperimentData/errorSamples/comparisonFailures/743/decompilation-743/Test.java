/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 5122183147755864801L;
    public static int iFld = -10;
    public static boolean bFld = true;
    public static volatile int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;

    public static int iMeth(float f) {
        int n = 6;
        int n2 = -24211;
        int n3 = 38823;
        int n4 = -3652;
        int n5 = -6;
        int n6 = -54809;
        double d = -69.2332;
        double[] dArray = new double[400];
        int n7 = -32617;
        FuzzerUtils.init(dArray, -2.39078);
        for (n = 9; 333 > n; ++n) {
            instanceCount = (long)f;
            iFld = 0;
            n2 -= n2;
            block12: for (n3 = n; n3 < 5; ++n3) {
                switch (n3 % 9 + 116) {
                    case 116: {
                        f += (float)d;
                        instanceCount -= (long)n3;
                        f += (float)(n3 - n7);
                        n5 = 1;
                        while (n5 < 1) {
                            n2 >>= n6;
                            int n8 = n5++;
                            dArray[n8] = dArray[n8] - (double)n4;
                            d -= (double)instanceCount;
                            n4 = (int)f;
                            n6 += 9;
                        }
                    }
                    case 117: {
                        iFld >>= (int)instanceCount;
                    }
                    case 118: {
                        iFld -= n;
                    }
                    case 119: {
                        n4 <<= 0;
                        continue block12;
                    }
                    case 120: {
                        n2 = -128;
                        continue block12;
                    }
                    case 121: {
                        int n9 = n;
                        iArrFld[n9] = iArrFld[n9] % (n2 | 1);
                        continue block12;
                    }
                    case 122: {
                        iFld >>= n2;
                    }
                    case 123: {
                        n7 = (short)n;
                        continue block12;
                    }
                    case 124: {
                        n4 += n3;
                    }
                }
            }
        }
        long l = (long)(Float.floatToIntBits(f) + n + n2 + n3 + n4) + Double.doubleToLongBits(d) + (long)n7 + (long)n5 + (long)n6 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray));
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth1(long l) {
        float f = 1.486f;
        int n = -224;
        int n2 = -32262;
        int n3 = -91;
        int n4 = 9;
        int n5 = 107;
        iFld = iFld << (int)(-(instanceCount++ - (long)iFld++));
        iFld -= iArrFld[330] - Test.iMeth(f);
        n = 1;
        while (++n < 256) {
            for (n2 = 1; n2 < 6; ++n2) {
                n3 += n2 * n + iFld - n3;
                iFld >>>= (int)instanceCount;
                iFld -= (n3 -= iFld);
                block7: for (n4 = 2; n4 > 1; n4 -= 3) {
                    iFld += n2;
                    switch ((n3 >>> 1) % 3 + 6) {
                        case 6: {
                            l = n5 += (int)instanceCount;
                            if ((n3 += n4) != 0) {
                                vMeth1_check_sum += l + (long)Float.floatToIntBits(f) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5;
                                return;
                            }
                        }
                        case 7: {
                            int n6 = n;
                            iArrFld[n6] = iArrFld[n6] + 27231;
                            continue block7;
                        }
                        case 8: {
                            iFld += (int)f;
                        }
                    }
                }
            }
        }
        vMeth1_check_sum += l + (long)Float.floatToIntBits(f) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5;
    }

    public static void vMeth(int n) {
        int n2 = 4;
        int n3 = 42463;
        int n4 = -196;
        int n5 = -53014;
        int n6 = -64581;
        int n7 = 11;
        int n8 = 2;
        int n9 = -127;
        float f = 0.15f;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, -71.821f);
        Test.vMeth1(instanceCount);
        instanceCount ^= (long)iFld;
        block13: for (n2 = 5; n2 < 248; ++n2) {
            if (bFld) {
                switch (n2 % 2 + 122) {
                    case 122: {
                        block14: for (n4 = 1; n4 < 7; ++n4) {
                            instanceCount -= instanceCount;
                            try {
                                iFld = n / 24413;
                                n3 = -106 / n4;
                                n = n5 / -8;
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            switch (n2 % 5 + 71) {
                                case 71: {
                                    n6 |= (int)instanceCount;
                                    iFld = 128;
                                    n9 = (byte)(n9 + (byte)((float)n4 * f));
                                }
                                case 72: {
                                    for (n7 = 2; n7 > 1; --n7) {
                                        int n10 = n4 + 1;
                                        iArrFld[n10] = iArrFld[n10] + (int)(instanceCount /= (long)(n5 | 1));
                                    }
                                    continue block14;
                                }
                                case 73: {
                                    if (!bFld) continue block14;
                                    continue block14;
                                }
                                case 74: {
                                    iFld *= n7;
                                    continue block14;
                                }
                                case 75: {
                                    iFld = n6;
                                }
                            }
                        }
                        continue block13;
                    }
                    case 123: {
                        n9 = 109;
                        break;
                    }
                    default: {
                        int n11 = n2 - 1;
                        fArray[n11] = fArray[n11] + (float)n4;
                        break;
                    }
                }
                continue;
            }
            instanceCount += (long)n2;
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + n9 + Float.floatToIntBits(f) + n7 + n8) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public void mainTest(String[] stringArray) {
        Test.vMeth(14);
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + instanceCount + "," + iFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -23);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}

