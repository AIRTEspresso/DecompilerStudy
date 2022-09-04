/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = -2408418474L;
    public static int iFld = 49210;
    public static byte byFld = (byte)127;
    public static boolean bFld = false;
    public static float fFld = 8.153f;
    public static double dFld = -53.8111;
    public static long lFld = -2516580881L;
    public static byte[] byArrFld = new byte[400];
    public static long[] lArrFld = new long[400];
    public int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(double d, int n) {
        int n2 = -43255;
        int n3 = -7;
        int n4 = -57;
        int n5 = -1;
        int n6 = 162;
        int n7 = 10;
        int n8 = -21950;
        int n9 = 9986;
        for (n2 = 3; n2 < 163; ++n2) {
            byFld = (byte)-108;
            n3 += n2 ^ (n &= 0xFFFFFFF6);
        }
        block9: for (n4 = 5; n4 < 221; ++n4) {
            switch (n4 % 6 * 5 + 113) {
                case 130: {
                    n *= (int)d;
                    n += n4;
                }
                case 123: {
                    n5 += n4 * n4;
                    for (n6 = n4; n6 < 7; ++n6) {
                        instanceCount += (long)(n6 * n6);
                        for (n8 = 1; n8 > n6; --n8) {
                            n9 ^= (int)instanceCount;
                            iFld += -2 + n8 * n8;
                        }
                    }
                    continue block9;
                }
                case 131: {
                    if (!bFld) continue block9;
                    continue block9;
                }
                case 129: {
                    iFld += (int)instanceCount;
                }
                case 124: {
                    n9 *= 1;
                }
                case 132: {
                    n = 6544;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9;
    }

    public static int iMeth(int n, long l, long l2) {
        float f = -114.85f;
        double d = -2.28635;
        int n2 = -5103;
        int n3 = 22;
        int n4 = -13;
        long l3 = 1L;
        l += (long)((float)iFld * ((float)n + f - (float)(iFld - byFld)));
        Test.vMeth1(d, iFld);
        for (n2 = 11; n2 < 215; ++n2) {
            f = instanceCount;
            iFld -= n3;
            n3 ^= (int)l2;
            l2 -= (long)n2;
            l3 = 1L;
            while (++l3 < 8L) {
                n4 = 1;
                while (!bFld) {
                    n = n3;
                    if (!bFld) {
                        iFld += (int)l3;
                    }
                    if (++n4 < 1) continue;
                }
                n3 &= 0x806E;
                n &= 0xA3EA;
            }
        }
        long l4 = (long)n + l + l2 + (long)Float.floatToIntBits(f) + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + l3 + (long)n4;
        iMeth_check_sum += l4;
        return (int)l4;
    }

    public static void vMeth(long l, int n, int n2) {
        int n3 = -21477;
        int n4 = -2;
        int n5 = -61993;
        int n6 = 0;
        int n7 = -157;
        int n8 = -7;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -245L);
        iFld -= Test.iMeth(iFld, instanceCount, instanceCount) % (n | 1);
        fFld *= (float)n2;
        instanceCount = -206L;
        dFld -= (double)instanceCount;
        n3 = (short)(n3 >> (short)(n *= (iFld -= n2)));
        n4 = 221;
        do {
            block5: for (n5 = 1; 14 > n5; n5 += 2) {
                switch (n5 % 2 * 5 + 1) {
                    case 4: {
                        n2 <<= n5;
                        for (n7 = n5; n7 < 3; ++n7) {
                            n3 = (short)(n3 - (short)n7);
                            iFld = (int)l;
                            n2 = n6;
                        }
                        continue block5;
                    }
                    case 10: {
                        int n9 = n4;
                        byArrFld[n9] = (byte)(byArrFld[n9] | (byte)n6);
                        continue block5;
                    }
                    default: {
                        l >>>= (int)l;
                    }
                }
            }
        } while ((n4 -= 2) > 0);
        vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + FuzzerUtils.checkSum(lArray);
    }

    public void mainTest(String[] stringArray) {
        int n = 111;
        int n2 = 26492;
        int n3 = -22019;
        int n4 = 1;
        int n5 = 52213;
        int n6 = 9;
        int n7 = -146;
        int n8 = -27054;
        int n9 = -196;
        int n10 = 4572;
        Test.vMeth(instanceCount, -178, iFld += (int)(++instanceCount));
        for (n = 9; n < 270; ++n) {
            iFld = (int)instanceCount;
            iFld += n;
            dFld *= 4.0;
            n2 += n;
            iFld <<= iFld;
            block11: for (n3 = 96; n3 > 6; n3 -= 2) {
                fFld += (float)n3;
                n5 = 1;
                do {
                    fFld += (float)instanceCount;
                    n4 <<= n5;
                    dFld *= (double)iFld;
                    fFld += (float)n3;
                    n2 |= (int)instanceCount;
                    iFld <<= byFld;
                    int n11 = n5 + 1;
                    lArrFld[n11] = lArrFld[n11] & (long)n5;
                } while (++n5 < 3);
                iFld -= (int)fFld;
                for (n6 = 1; 3 > n6; ++n6) {
                    fFld -= 248.0f;
                }
                n4 &= iFld;
                Test.byArrFld[n - 1] = 87;
                iFld += -63;
                switch ((n7 >>> 1) % 8 + 17) {
                    case 17: {
                        for (n8 = 3; n8 > 1; --n8) {
                            lFld -= -59542L;
                            iFld = (int)instanceCount;
                            n9 += (int)instanceCount;
                        }
                        try {
                            n2 = n8 % n6;
                            n4 = n3 % 73;
                            n7 = n2 % -12085;
                        }
                        catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                    }
                    case 18: {
                        int n12 = n3 - 1;
                        this.iArrFld[n12] = this.iArrFld[n12] - n8;
                        continue block11;
                    }
                    case 19: 
                    case 20: {
                        n7 = (int)((float)n7 + ((float)n3 * fFld + fFld - (float)n10));
                    }
                    case 21: {
                        continue block11;
                    }
                    case 22: 
                    case 23: {
                        n4 -= n;
                        continue block11;
                    }
                    case 24: {
                        int n13 = n + 1;
                        lArrFld[n13] = lArrFld[n13] - lFld;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i20 i21 i22 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i23 i24 i25 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i26 i27 i28 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("s1 = " + n10);
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + instanceCount + "," + iFld + "," + byFld);
        FuzzerUtils.out.println("Test.bFld Test.fFld Test.dFld = " + (bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.lFld Test.byArrFld Test.lArrFld = " + lFld + "," + FuzzerUtils.checkSum(byArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(this.iArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        FuzzerUtils.init(byArrFld, (byte)126);
        FuzzerUtils.init(lArrFld, -2L);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

