/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 2578945836651582030L;
    public static volatile double dFld = 126.43486;
    public static boolean bFld = true;
    public long lFld = -3L;
    public static int iFld = -17551;
    public static boolean bFld1 = true;
    public static int[] iArrFld = new int[400];
    public static byte[] byArrFld = new byte[400];
    public static volatile double[] dArrFld = new double[400];
    public static long[] lArrFld = new long[400];
    public boolean[][][] bArrFld = new boolean[400][400][400];
    public volatile float[] fArrFld = new float[400];
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(int n, double d, int n2) {
        int n3 = 17593;
        int n4 = -30939;
        int n5 = -21203;
        int n6 = -8589;
        float f = -97.867f;
        float[] fArray = new float[400];
        boolean bl = true;
        int n7 = 28457;
        short[] sArray = new short[400];
        FuzzerUtils.init(fArray, 72.294f);
        FuzzerUtils.init(sArray, (short)18200);
        block8: for (n3 = 9; n3 < 150; ++n3) {
            instanceCount *= instanceCount;
            switch (n3 % 6 * 5 + 83) {
                case 89: {
                    instanceCount = (long)f;
                    int n8 = n3;
                    iArrFld[n8] = iArrFld[n8] >> -1683999809;
                    n4 = 2061990560;
                    continue block8;
                }
                case 97: {
                    n4 -= (int)f;
                    if (!bl) continue block8;
                    continue block8;
                }
                case 111: {
                    Test.byArrFld[n3 - 1] = 119;
                    for (n5 = n3; n5 < 11; ++n5) {
                        n6 = (int)((float)n6 + ((float)((long)n5 * instanceCount + instanceCount) - f));
                        n2 += n5 * n3;
                        fArray[n3] = -1212.0f;
                        Test.iArrFld[n3] = n3;
                        instanceCount += (long)n5;
                    }
                }
                case 94: {
                    n = n2;
                }
                case 110: {
                    n2 += (int)d;
                    continue block8;
                }
                case 109: {
                    n6 += n7;
                }
                default: {
                    n6 = (int)instanceCount;
                }
            }
        }
        vMeth1_check_sum += (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)Float.floatToIntBits(f) + (long)(bl ? 1 : 0) + (long)n5 + (long)n6 + (long)n7 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(sArray);
    }

    public static long lMeth(long l) {
        int n = 109;
        int n2 = 167;
        int n3 = -12;
        int n4 = -56782;
        int n5 = 8;
        int n6 = -24209;
        float f = -3.447f;
        long[][][] lArray = new long[400][400][400];
        FuzzerUtils.init((Object[][])lArray, (Object)117L);
        Test.vMeth1(n, dFld, n);
        n2 = 1;
        do {
            long[] lArray2 = lArray[n2][n2];
            int n7 = n2;
            lArray2[n7] = lArray2[n7] + 0L;
            n3 = n2;
            if (5 > n3) {
                long[] lArray3 = lArray[n2][n3];
                int n8 = n2 - 1;
                lArray3[n8] = lArray3[n8] * (long)n4;
                n <<= n;
            }
            for (n5 = 1; n5 < 5; ++n5) {
                try {
                    n = -135 / n5;
                    n4 = n3 / n2;
                    n4 = n3 / n;
                    continue;
                }
                catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
            }
            int n9 = n2++;
            dArrFld[n9] = dArrFld[n9] - (double)f;
        } while (n2 < 352);
        int n10 = (n6 >>> 1) % 400;
        iArrFld[n10] = iArrFld[n10] - n6;
        long l2 = l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)Float.floatToIntBits(f) + FuzzerUtils.checkSum((Object[][])lArray);
        lMeth_check_sum += l2;
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    public void vMeth(int var1_1, short var2_2) {
        var3_3 = -6;
        var4_4 = 23342;
        var5_5 = -152;
        var6_6 = -63;
        var7_7 = 34;
        var8_8 = -2059223996L;
        var10_9 = -83.595f;
        var11_10 = new float[400][400];
        FuzzerUtils.init(var11_10, 0.28f);
        for (var3_3 = 10; var3_3 < 381; ++var3_3) {
            Test.iArrFld[var3_3 - 1] = -104;
            this.lFld += (long)(var1_1 += (int)(-Test.lMeth(32L) + -63L));
            var7_7 = (byte)var1_1;
            var5_5 = 1;
            do {
                block14: for (var8_8 = 1L; var8_8 < 1L; ++var8_8) {
                    v0 = var3_3;
                    Test.lArrFld[v0] = Test.lArrFld[v0] - (long)var6_6;
                    var4_4 <<= (int)var8_8;
                    this.bArrFld[var3_3 + 1][(int)(var8_8 - 1L)][(int)(var8_8 + 1L)] = true;
                    switch (var3_3 % 10 + 74) {
                        case 74: {
                            Test.dFld -= (double)var4_4;
                            var10_9 = -100.0f;
                            var7_7 = (byte)(var7_7 >> (byte)var6_6);
                            var1_1 >>= (int)this.lFld;
                            continue block14;
                        }
                        case 75: {
                            var6_6 = var1_1;
                            continue block14;
                        }
                        case 76: {
                            var6_6 = var4_4;
                            continue block14;
                        }
                        case 77: {
                            Test.lArrFld[38] = Test.lArrFld[38] * this.lFld;
                            continue block14;
                        }
                        case 78: {
                            continue block14;
                        }
                        case 79: {
                            var1_1 += var5_5;
                            continue block14;
                        }
                        case 80: {
                            var4_4 = 9;
                            continue block14;
                        }
                        ** case 81:
lbl46:
                        // 2 sources

                        case 82: {
                            if (var1_1 == 0) continue block14;
                            Test.vMeth_check_sum += (long)(var1_1 + var2_2 + var3_3 + var4_4 + var7_7 + var5_5) + var8_8 + (long)var6_6 + (long)Float.floatToIntBits(var10_9) + Double.doubleToLongBits(FuzzerUtils.checkSum(var11_10));
                            return;
                        }
                        case 83: {
                            if (var4_4 == 0) continue block14;
                            Test.vMeth_check_sum += (long)(var1_1 + var2_2 + var3_3 + var4_4 + var7_7 + var5_5) + var8_8 + (long)var6_6 + (long)Float.floatToIntBits(var10_9) + Double.doubleToLongBits(FuzzerUtils.checkSum(var11_10));
                            return;
                        }
                        default: {
                            var1_1 = -190045263;
                        }
                    }
                }
            } while (++var5_5 < 5);
        }
        Test.vMeth_check_sum += (long)(var1_1 + var2_2 + var3_3 + var4_4 + var7_7 + var5_5) + var8_8 + (long)var6_6 + (long)Float.floatToIntBits(var10_9) + Double.doubleToLongBits(FuzzerUtils.checkSum(var11_10));
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = 13179;
        var3_3 = 5;
        var4_4 = 25883;
        var5_5 = 67;
        var6_6 = -53343;
        var7_7 = -6.54f;
        this.vMeth(Test.iFld, (short)var2_2);
lbl8:
        // 14 sources

        block51: for (int var11_11 : Test.iArrFld) {
            var3_3 = (byte)(var3_3 * 67);
            var4_4 = 1;
            do {
                Test.dFld -= (double)Test.instanceCount;
                try {
                    Test.iFld = -32244 % var4_4;
                    var11_11 = 184 / var11_11;
                    var11_11 = -56991 / var11_11;
                }
                catch (ArithmeticException var12_13) {
                    // empty catch block
                }
                var11_11 = var2_2;
                Test.dFld = var7_7;
                var11_11 = Test.iFld;
                Test.instanceCount >>= Test.iFld;
                this.lFld += (long)var11_11;
            } while (++var4_4 < 63);
            switch ((Test.iFld >>> 1) % 10 * 5 + 47) {
                case 56: {
                    Test.lArrFld[(var11_11 >>> 1) % 400] = var11_11;
                }
                case 50: {
                    Test.iArrFld[(var4_4 >>> 1) % 400] = 3;
                    switch ((var11_11 >>> 1) % 2 * 5 + 50) {
                        case 53: {
                            try {
                                var11_11 = Test.iFld % 639891475;
                                Test.iFld /= Test.iFld;
                                Test.iArrFld[(var11_11 >>> 1) % 400] = 568095387 % Test.iArrFld[(var4_4 >>> 1) % 400];
                            }
                            catch (ArithmeticException var12_14) {
                                // empty catch block
                            }
                            for (var5_5 = 63; 1 < var5_5; --var5_5) {
                                var7_7 *= (float)this.lFld;
                                var7_7 -= (float)var5_5;
                            }
                            switch (99) {
                                case 97: {
                                    if (Test.bFld) {
                                        switch ((var4_4 >>> 1) % 9 + 83) {
                                            case 83: {
                                                if (Test.bFld) break;
                                                v0 = (var6_6 >>> 1) % 400;
                                                Test.iArrFld[v0] = Test.iArrFld[v0] & 14;
                                                Test.bFld = Test.bFld1;
                                            }
                                            case 84: {
                                                try {
                                                    Test.iFld = var11_11 % var11_11;
                                                    var6_6 = -1429891635 / Test.iArrFld[(var11_11 >>> 1) % 400];
                                                    var11_11 = Test.iFld % var5_5;
                                                }
                                                catch (ArithmeticException var12_15) {
                                                    // empty catch block
                                                }
                                                switch ((var5_5 >>> 1) % 3 + 43) {
                                                    case 43: {
                                                        var6_6 = (int)var7_7;
                                                        var2_2 = (short)(var2_2 * -5736);
                                                        break;
                                                    }
                                                    case 44: {
                                                        Test.instanceCount = var4_4;
                                                        break;
                                                    }
                                                    ** case 45:
lbl70:
                                                    // 2 sources

                                                    default: {
                                                        var6_6 -= (int)this.lFld;
                                                    }
                                                }
                                            }
                                            case 85: {
                                                var3_3 = (byte)Test.dFld;
                                            }
                                            case 86: {
                                                var7_7 = Test.iFld;
                                            }
                                            case 87: {
                                                v1 = (var5_5 >>> 1) % 400;
                                                Test.iArrFld[v1] = Test.iArrFld[v1] * Test.iFld;
                                            }
                                            case 88: {
                                                try {
                                                    var11_11 = Test.iArrFld[7] / var4_4;
                                                    Test.iArrFld[(var11_11 >>> 1) % 400] = 41983 % Test.iArrFld[1];
                                                    var6_6 = Test.iArrFld[(var11_11 >>> 1) % 400] / var6_6;
                                                }
                                                catch (ArithmeticException var12_16) {}
                                                break;
                                            }
                                            case 89: {
                                                try {
                                                    var6_6 = var4_4 / 63;
                                                    var6_6 = var5_5 % var5_5;
                                                    Test.iFld %= -22022;
                                                }
                                                catch (ArithmeticException var12_17) {}
                                                break;
                                            }
                                            case 90: {
                                                try {
                                                    var11_11 = var6_6 % -1879834875;
                                                    Test.iFld /= -105;
                                                    var11_11 = var5_5 / var6_6;
                                                }
                                                catch (ArithmeticException var12_18) {}
                                                break;
                                            }
                                            case 91: {
                                                if (Test.bFld) {
                                                    // empty if block
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        continue block51;
                                    }
                                    ** GOTO lbl8
                                }
                                case 98: {
                                    Test.lArrFld[2] = 227L;
                                    break;
                                }
                                case 99: {
                                    Test.iFld = var6_6;
                                    break;
                                }
                                default: {
                                    var6_6 = (int)Test.instanceCount;
                                    break;
                                }
                            }
                            continue block51;
                        }
                        case 52: {
                            try {
                                Test.iFld = var5_5 % var11_11;
                                Test.iFld = var6_6 / Test.iArrFld[(Test.iFld >>> 1) % 400];
                                Test.iArrFld[(Test.iFld >>> 1) % 400] = 3707 / var6_6;
                                break;
                            }
                            catch (ArithmeticException var12_19) {
                                // empty catch block
                            }
                        }
                    }
                    continue block51;
                }
                case 61: {
                    Test.iFld += -1;
                }
                case 85: {
                    var6_6 += (int)Test.instanceCount;
                    continue block51;
                }
                case 95: {
                    Test.dFld = var7_7;
                }
                case 55: {
                    continue block51;
                }
                case 68: {
                    v2 = (var6_6 >>> 1) % 400;
                    Test.iArrFld[v2] = Test.iArrFld[v2] + (int)Test.dFld;
                    continue block51;
                }
                case 74: {
                    Test.dFld *= (double)Test.instanceCount;
                }
                case 76: {
                    var11_11 -= var4_4;
                    continue block51;
                }
                case 51: {
                    var6_6 += var6_6;
                    continue block51;
                }
                default: {
                    var6_6 -= (int)var7_7;
                }
            }
        }
        FuzzerUtils.out.println("s3 by1 i20 = " + var2_2 + "," + var3_3 + "," + var4_4);
        FuzzerUtils.out.println("f3 i21 i22 = " + Float.floatToIntBits(var7_7) + "," + var5_5 + "," + var6_6);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.bFld = " + Test.instanceCount + "," + Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld != false ? 1 : 0));
        FuzzerUtils.out.println("lFld Test.iFld Test.bFld1 = " + this.lFld + "," + Test.iFld + "," + (Test.bFld1 != false ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld Test.byArrFld Test.dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.byArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.lArrFld bArrFld fArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," + FuzzerUtils.checkSum((Object[][])this.bArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + Test.vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + Test.lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + Test.vMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 252);
        FuzzerUtils.init(byArrFld, (byte)-34);
        FuzzerUtils.init(dArrFld, 2.98285);
        FuzzerUtils.init(lArrFld, 2162L);
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

