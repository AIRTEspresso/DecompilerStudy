/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 62L;
    public static short sFld = (short)-32176;
    public static float fFld = 0.12f;
    public static boolean bFld = true;
    public double dFld = 1.68015;
    public static int[] iArrFld = new int[400];
    public static long[] lArrFld = new long[400];
    public static long[][] lArrFld1 = new long[400][400];
    public short[] sArrFld = new short[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    public static void vMeth2() {
        int n = -234;
        int n2 = 9497;
        int n3 = 20114;
        int n4 = -126;
        int n5 = -187;
        int n6 = -8374;
        int n7 = -3;
        int n8 = 14;
        int[] nArray = new int[400];
        double d = 2.51093;
        float f = 17.197f;
        boolean bl = true;
        FuzzerUtils.init(nArray, -13464);
        for (n = 264; n > 1; --n) {
            for (d = 6.0; d > 1.0; d -= 1.0) {
                int n9 = -25066;
                n9 = (short)(n9 & (short)n2);
                n4 = 1;
                while (++n4 < 2) {
                    instanceCount = -4L;
                }
                instanceCount += (long)d | (long)n3;
            }
            n3 *= n3;
            n2 /= (int)(instanceCount | 1L);
        }
        block10: for (n5 = 18; n5 < 289; ++n5) {
            switch (n5 % 6 + 75) {
                case 75: {
                    for (n7 = 1; n7 < 6; ++n7) {
                        instanceCount += (long)n7;
                        n6 = (int)d;
                        n2 >>= n2;
                    }
                    continue block10;
                }
                case 76: {
                    int n10 = n5 + 1;
                    nArray[n10] = nArray[n10] & 0xFFFFFFFD;
                    continue block10;
                }
                case 77: {
                    f += (float)n5;
                    continue block10;
                }
                case 78: 
                case 79: {
                    instanceCount *= (long)n2;
                }
                case 80: {
                    if (!bl) continue block10;
                    continue block10;
                }
            }
        }
        vMeth2_check_sum += (long)(n + n2) + Double.doubleToLongBits(d) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)Float.floatToIntBits(f) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth1() {
        int n = 59;
        int n2 = 4;
        int n3 = -12;
        int n4 = -9;
        int n5 = -52298;
        double d = 14.114085;
        Test.vMeth2();
        n = 144;
        while ((n -= 2) > 0) {
            for (d = 1.0; 21.0 > d; d += 1.0) {
                Test.iArrFld[(int)(d - 1.0)] = sFld;
                n2 *= sFld;
                for (n3 = 1; n3 < 2; ++n3) {
                    boolean bl = false;
                    if (bl) continue;
                    int n6 = n + 1;
                    lArrFld[n6] = lArrFld[n6] * (long)n;
                    n2 *= n3;
                }
                sFld = (short)(sFld << 0);
                n2 %= (int)((long)fFld | 1L);
                n2 -= n;
                Test.lArrFld[n + 1] = n5;
                int n7 = n - 1;
                lArrFld[n7] = lArrFld[n7] - -1L;
            }
        }
        vMeth1_check_sum += (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5;
    }

    public static void vMeth(long l) {
        int n = 1;
        int n2 = 12;
        int n3 = 207;
        int n4 = 0;
        Test.vMeth1();
        Test.iArrFld[365] = n;
        for (n2 = 4; n2 < 174; ++n2) {
            Test.iArrFld[n2] = (int)l;
            n4 = 1;
            do {
                block21: {
                    int n5 = -22;
                    n -= n;
                    l = -69L;
                    block0 : switch (n4 % 1 + 91) {
                        case 91: {
                            switch ((n >>> 1) % 10 + 18) {
                                case 18: {
                                    instanceCount += (long)(n4 + n2);
                                    switch (n2 % 1 + 53) {
                                        case 53: {
                                            if (!bFld) {
                                                instanceCount >>= n4;
                                                break;
                                            }
                                            break block21;
                                        }
                                        default: {
                                            fFld += (float)(n4 * n3);
                                        }
                                    }
                                }
                                case 19: {
                                    n += 5990;
                                    break block0;
                                }
                                case 20: {
                                    instanceCount &= 0xFFFFFFFFFFFFFC82L;
                                    break block0;
                                }
                                case 21: {
                                    n3 += n5;
                                    break block0;
                                }
                                case 22: {
                                    n3 = n2;
                                    break block0;
                                }
                                case 23: {
                                    n3 >>= 9;
                                    break block0;
                                }
                                case 24: {
                                    n3 -= (int)l;
                                    break block0;
                                }
                                case 25: {
                                    n3 -= n4;
                                    break block0;
                                }
                                case 26: {
                                    n3 += n4 * n4;
                                    break block0;
                                }
                                case 27: {
                                    long[] lArray = lArrFld1[n2];
                                    int n6 = n2;
                                    lArray[n6] = lArray[n6] - (long)n3;
                                }
                            }
                        }
                    }
                }
            } while (++n4 < 9);
        }
        vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void mainTest(String[] stringArray) {
        int n = -11;
        int n2 = -3;
        int n3 = 35;
        int n4 = 58518;
        int n5 = -197;
        int n6 = 12;
        int n7 = 119;
        int n8 = -5;
        int n9 = 135;
        int n10 = 18457;
        n = 7;
        while (true) {
            if (124 > n) {
                Test.vMeth(instanceCount);
                n2 *= (int)instanceCount;
                instanceCount <<= (int)instanceCount;
            } else {
                FuzzerUtils.out.println("i i1 i19 = " + n + "," + n2 + "," + n3);
                FuzzerUtils.out.println("i20 i21 i22 = " + n4 + "," + n5 + "," + n6);
                FuzzerUtils.out.println("i23 i24 i25 = " + n7 + "," + n8 + "," + n9);
                FuzzerUtils.out.println("i26 = " + n10);
                FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + instanceCount + "," + sFld + "," + Float.floatToIntBits(fFld));
                FuzzerUtils.out.println("Test.bFld dFld Test.iArrFld = " + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(this.dFld) + "," + FuzzerUtils.checkSum(iArrFld));
                FuzzerUtils.out.println("Test.lArrFld Test.lArrFld1 sArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(lArrFld1) + "," + FuzzerUtils.checkSum(this.sArrFld));
                FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
                FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                return;
            }
            block28: for (n3 = 1; 214 > n3; ++n3) {
                fFld += (float)n3;
                switch (n3 % 9 + 84) {
                    case 84: {
                        n2 += n3 * n4 + n - n3;
                        for (n5 = n; 2 > n5; ++n5) {
                            int n11 = -107;
                            fFld -= (float)instanceCount;
                            n6 *= -10106;
                            Test.lArrFld1[n5 + 1][n5] = 170L;
                            try {
                                Test.iArrFld[n5] = 17819 % n2;
                                n6 = n % -151;
                                n7 = -4555 % n3;
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            n4 = n11;
                        }
                        for (n8 = 1; n8 < 2; n4 *= n5, ++n8) {
                            n6 = (int)instanceCount;
                        }
                        switch (n % 2 + 20) {
                            case 20: {
                                if (!bFld) break;
                                continue block28;
                            }
                            case 21: {
                                n10 = 1;
                                block31: while (++n10 < 2) {
                                    n4 += n10;
                                    int n12 = n10 + 1;
                                    this.sArrFld[n12] = (short)(this.sArrFld[n12] + (short)(instanceCount -= 13925L));
                                    int n13 = n3 - 1;
                                    iArrFld[n13] = iArrFld[n13] - n5;
                                    n2 *= n9;
                                    n7 += 62719;
                                    switch (n3 % 9 + 46) {
                                        case 46: {
                                            instanceCount -= (long)n4;
                                            sFld = (short)(sFld + (short)(5 + n10 * n10));
                                            Test.iArrFld[n10 - 1] = 237;
                                            continue block31;
                                        }
                                        case 47: {
                                            n7 *= n10;
                                        }
                                        case 48: {
                                            n4 += (int)instanceCount;
                                            continue block31;
                                        }
                                        case 49: {
                                            n6 *= n3;
                                        }
                                        case 50: {
                                            n6 >>= (int)instanceCount;
                                        }
                                        case 51: {
                                            n9 >>= -10;
                                            continue block31;
                                        }
                                        case 52: {
                                            this.dFld += (double)n3;
                                            continue block31;
                                        }
                                        case 53: {
                                            n2 = (int)instanceCount;
                                            continue block31;
                                        }
                                        case 54: {
                                            n7 = 1;
                                            break;
                                        }
                                    }
                                    this.dFld += (double)fFld;
                                }
                                break block11;
                            }
                        }
                        continue block28;
                    }
                    case 85: {
                        Test.iArrFld[n] = n3;
                        continue block28;
                    }
                    case 86: 
                    case 87: {
                        int n14 = n3;
                        iArrFld[n14] = iArrFld[n14] + (int)instanceCount;
                        continue block28;
                    }
                    case 88: {
                        n2 += 1671591720;
                        continue block28;
                    }
                    case 89: {
                        n6 = 72;
                    }
                    case 90: {
                        n6 = (int)instanceCount;
                        continue block28;
                    }
                    case 91: {
                        n2 -= n5;
                        continue block28;
                    }
                    case 92: {
                        n2 *= (int)instanceCount;
                        continue block28;
                    }
                }
            }
            ++n;
        }
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
        FuzzerUtils.init(iArrFld, 5678);
        FuzzerUtils.init(lArrFld, 7L);
        FuzzerUtils.init(lArrFld1, 18881L);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}

