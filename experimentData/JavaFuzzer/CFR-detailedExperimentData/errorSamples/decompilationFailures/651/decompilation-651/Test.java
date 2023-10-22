/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 11L;
    public int iFld = -72;
    public int[][][] iArrFld = new int[400][400][400];
    public static volatile int[] iArrFld1 = new int[400];
    public static long bMeth_check_sum;
    public static long iMeth_check_sum;
    public static long lMeth_check_sum;

    /*
     * Unable to fully structure code
     */
    public static long lMeth(double var0, float var2_1) {
        var3_2 = 61115;
        var4_3 = -11;
        var5_4 = 86;
        var6_5 = 59198;
        var7_6 = 26366;
        var8_7 = new int[400];
        var9_8 = 59.11994;
        var11_9 = true;
        var12_10 = 26545;
        var13_11 = -68;
        var14_12 = new long[400];
        FuzzerUtils.init(var8_7, 21709);
        FuzzerUtils.init(var14_12, 1973144196L);
        switch ((var3_2 >>> 1) % 10 * 5 + 108) {
            case 136: {
                var9_8 = 1.0;
                block22: while (true) {
                    var9_8 += 1.0;
                    if (!(v0 < 274.0)) break;
                    var4_3 = 1;
                    while (true) {
                        if (6 <= var4_3) continue block22;
                        var5_4 += var4_3;
lbl24:
                        // 5 sources

                        for (var6_5 = 1; var6_5 < 2; ++var6_5) {
                            var3_2 = var6_5;
                            var3_2 -= var7_6;
                            var5_4 += var6_5 ^ var4_3;
                            if (var11_9) {
                                var2_1 += (float)var3_2;
                                continue;
                            }
                            if (!var11_9) ** GOTO lbl61
                            var8_7[var6_5 - 1] = -8694;
                            switch (var4_3 % 9 + 49) {
                                case 49: {
                                    var2_1 = 18.61f;
                                    var3_2 += var6_5;
                                    var0 = var2_1;
                                    break;
                                }
                                case 50: {
                                    var3_2 = -172;
                                    break;
                                }
                                ** case 51:
lbl43:
                                // 2 sources

                                case 52: {
                                    if (var11_9) {
                                        break;
                                    }
                                    ** GOTO lbl24
                                }
                                case 53: {
                                    var12_10 = (short)(var12_10 + (short)((long)(var6_5 * var7_6) + Test.instanceCount - Test.instanceCount));
                                    break;
                                }
                                case 54: {
                                    v1 = (int)var9_8;
                                    var8_7[v1] = var8_7[v1] ^ var5_4;
                                }
                                case 55: {
                                    var3_2 ^= var6_5;
                                }
                                case 56: {
                                    var7_6 += var5_4;
                                    break;
                                }
                                case 57: {
                                    var2_1 *= var2_1;
                                }
                            }
                            continue;
lbl61:
                            // 1 sources

                            var7_6 += 82;
                        }
                        ++var4_3;
                    }
                    break;
                }
            }
            case 132: {
                var5_4 *= var6_5;
                break;
            }
            case 128: {
                var13_11 = (byte)Test.instanceCount;
                break;
            }
            case 126: {
                Test.instanceCount <<= (int)Test.instanceCount;
            }
            case 119: 
            case 142: {
                break;
            }
            case 149: {
                var5_4 *= 4;
                break;
            }
            case 112: {
                var5_4 <<= var3_2;
                break;
            }
            case 141: {
                Test.instanceCount = var12_10;
            }
            case 148: {
                var14_12[12] = var14_12[12] + (long)var3_2;
                break;
            }
            default: {
                var8_7[7] = var8_7[7] + var3_2;
            }
        }
        var15_13 = Double.doubleToLongBits(var0) + (long)Float.floatToIntBits(var2_1) + (long)var3_2 + Double.doubleToLongBits(var9_8) + (long)var4_3 + (long)var5_4 + (long)var6_5 + (long)var7_6 + (long)(var11_9 != false ? 1 : 0) + (long)var12_10 + (long)var13_11 + FuzzerUtils.checkSum(var8_7) + FuzzerUtils.checkSum(var14_12);
        Test.lMeth_check_sum += var15_13;
        return var15_13;
    }

    public static int iMeth(int n) {
        double d = 94.123726;
        float f = 39.423f;
        float[] fArray = new float[400];
        int n2 = -251;
        int n3 = -10;
        int n4 = 1;
        int n5 = -172;
        int n6 = 14;
        long[] lArray = new long[400];
        FuzzerUtils.init(fArray, -100.734f);
        FuzzerUtils.init(lArray, 2968121567L);
        int n7 = (n >>> 1) % 400;
        fArray[n7] = fArray[n7] * (float)Test.lMeth(d, f);
        n %= n | 1;
        n -= n;
        block4: for (n2 = 354; n2 > 22; --n2) {
            Test.iArrFld1[n2 - 1] = 2;
            n3 -= n3;
            n *= (int)instanceCount;
            switch (n2 % 3 * 5 + 11) {
                case 21: {
                    n = (int)d;
                    d += (double)n3;
                    n += n2;
                    for (n4 = 5; n4 > 1; --n4) {
                        n *= (int)(instanceCount += (long)n4);
                    }
                    continue block4;
                }
                case 19: 
                case 25: {
                    int n8 = n2;
                    lArray[n8] = lArray[n8] - (long)n6;
                }
                default: {
                    n5 += n2;
                }
            }
        }
        long l = (long)n + Double.doubleToLongBits(d) + (long)Float.floatToIntBits(f) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public static boolean bMeth() {
        int n = -1302;
        int n2 = -157;
        int n3 = 26444;
        int n4 = 6;
        int[] nArray = new int[400];
        float f = 31.429f;
        float[] fArray = new float[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, 54687);
        FuzzerUtils.init(lArray, 150L);
        FuzzerUtils.init(fArray, 0.894f);
        int n5 = (n >>> 1) % 400;
        nArray[n5] = nArray[n5] >> (int)((long)(n + n - Test.iMeth(n)) + instanceCount);
        n -= n;
        Test.iArrFld1[(n >>> 1) % 400] = n;
        n = 19965;
        iArrFld1 = FuzzerUtils.int1array(400, 9267);
        n2 = 1;
        while (++n2 < 313) {
            n = n2;
            block5: for (n3 = n2; n3 < 5; ++n3) {
                int n6 = n3 - 1;
                lArray[n6] = lArray[n6] - (long)f;
                n4 = n2;
                n = (int)((long)n + ((long)n3 ^ instanceCount));
                switch (n3 % 2 + 113) {
                    case 113: {
                        instanceCount *= instanceCount;
                        n = 44367879;
                    }
                    case 114: {
                        int n7 = n2 - 1;
                        fArray[n7] = fArray[n7] + (float)n3;
                        continue block5;
                    }
                    default: {
                        n *= -2;
                    }
                }
            }
        }
        long l = (long)(n + n2 + n3 + n4 + Float.floatToIntBits(f)) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        bMeth_check_sum += l;
        return l % 2L > 0L;
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = -58673;
        var3_3 = 205;
        var4_4 = 59154;
        var5_5 = 6;
        var6_6 = -9;
        var7_7 = 0.47668;
        var9_8 = new double[400];
        var10_9 = -17786;
        var11_10 = true;
        var12_11 = new byte[400];
        var13_12 = new float[400];
        var14_13 = new long[400];
        FuzzerUtils.init(var12_11, (byte)-28);
        FuzzerUtils.init(var13_12, 101.16f);
        FuzzerUtils.init(var9_8, -1.43286);
        FuzzerUtils.init(var14_13, 150L);
        this.iFld *= (int)(-(Test.instanceCount + -133L));
        for (var2_2 = 4; 354 > var2_2; ++var2_2) {
            try {
                var3_3 = this.iArrFld[var2_2][var2_2 + 1][var2_2 - 1] % this.iArrFld[var2_2][var2_2 + 1][var2_2 + 1];
                var3_3 = 10144 % this.iFld;
                var3_3 = var2_2 % 59600;
            }
            catch (ArithmeticException var15_14) {
                // empty catch block
            }
            for (var4_4 = 3; var4_4 < 72; ++var4_4) {
                var6_6 = 2;
                block29: do {
                    var7_7 -= (double)this.iArrFld[var6_6 + 1][var6_6 - 1][var6_6 - 1];
                    var10_9 = var12_11[var6_6];
                    if (Test.bMeth()) {
                        var3_3 += var6_6 * var6_6;
                    }
                    Test.instanceCount -= -27253L;
                    v0 = var6_6 + 1;
                    var13_12[v0] = var13_12[v0] * (float)var10_9;
                    block1 : switch (var6_6 % 5 * 5 + 83) {
                        case 84: {
                            var7_7 += (double)var5_5;
                            Test.iArrFld1[var6_6] = (int)Test.instanceCount;
                            var5_5 &= var3_3;
                            break;
                        }
                        case 88: {
                            switch (var4_4 % 10 * 5 + 38) {
                                case 53: {
                                    this.iFld <<= this.iFld;
                                    Test.instanceCount -= (long)var6_6;
                                    var3_3 *= var6_6;
                                    break block1;
                                }
                                case 42: {
                                    switch (var6_6 % 4 + 17) {
                                        case 17: {
                                            Test.instanceCount <<= var6_6;
                                            break;
                                        }
                                        case 18: {
                                            var5_5 *= (int)(Test.instanceCount <<= var6_6);
                                            Test.instanceCount += (long)(var6_6 | var3_3);
                                            break;
                                        }
                                        case 19: {
                                            var14_13[var6_6 + 1] = 1253704757L;
                                            var3_3 -= var5_5;
                                            break;
                                        }
                                        case 20: {
                                            this.iFld *= (int)var7_7;
                                        }
                                    }
                                    continue block29;
                                }
                                case 68: {
                                    Test.iArrFld1[var6_6 + 1] = var4_4;
                                    break block1;
                                }
                                case 88: {
                                    this.iFld ^= -9;
                                    break block1;
                                }
                                case 44: {
                                    Test.instanceCount += (long)(var6_6 | var6_6);
                                }
                                case 64: {
                                    var3_3 = (int)Test.instanceCount;
                                }
                                case 85: {
                                    this.iFld += var6_6 ^ var5_5;
                                    break block1;
                                }
                                case 77: {
                                    var5_5 += var6_6;
                                    break block1;
                                }
                                case 54: {
                                    Test.instanceCount *= (long)this.iFld;
                                    break block1;
                                }
                                case 41: {
                                    Test.instanceCount += (long)(var6_6 * var6_6);
                                    break block1;
                                }
                            }
                            break;
                        }
                        case 98: {
                            if (!var11_10) break;
                            break;
                        }
                        ** case 94:
lbl93:
                        // 2 sources

                        case 100: {
                            var10_9 = (short)(var10_9 + 124);
                        }
                    }
                } while (--var6_6 > 0);
            }
        }
        FuzzerUtils.out.println("i i1 i2 = " + var2_2 + "," + var3_3 + "," + var4_4);
        FuzzerUtils.out.println("i3 i4 d = " + var5_5 + "," + var6_6 + "," + Double.doubleToLongBits(var7_7));
        FuzzerUtils.out.println("s b1 byArr = " + var10_9 + "," + (var11_10 != false ? 1 : 0) + "," + FuzzerUtils.checkSum(var12_11));
        FuzzerUtils.out.println("fArr2 dArr lArr3 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(var13_12)) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(var9_8)) + "," + FuzzerUtils.checkSum(var14_13));
        FuzzerUtils.out.println("Test.instanceCount iFld iArrFld = " + Test.instanceCount + "," + this.iFld + "," + FuzzerUtils.checkSum((Object[][])this.iArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.iArrFld1));
        FuzzerUtils.out.println("lMeth_check_sum: " + Test.lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + Test.iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + Test.bMeth_check_sum);
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
        FuzzerUtils.init(iArrFld1, 159);
        bMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
    }
}

