/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 2622L;
    public byte byFld = (byte)-112;
    public static byte byFld1 = (byte)42;
    public static float fFld = -1.309f;
    public static double dFld = -1.8935;
    public static boolean bFld = true;
    public byte[][] byArrFld = new byte[400][400];
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long fMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(int n) {
        int n2 = 9927;
        int n3 = -44601;
        int n4 = 53747;
        int n5 = 175;
        int n6 = -54146;
        int n7 = 119;
        float f = -104.495f;
        boolean bl = false;
        n2 = (short)instanceCount;
        for (n3 = 16; n3 < 394; n3 += 3) {
            n5 = 1;
            while (++n5 < 12) {
                for (n6 = 1; n6 < 1; ++n6) {
                    n -= n7;
                    n4 += n6;
                    n = (int)((float)n + ((float)(n6 * n2) + f - (float)n5));
                }
                if (!bl) continue;
                n4 = (int)instanceCount;
                f += (float)instanceCount;
            }
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + n7 + Float.floatToIntBits(f) + (bl ? 1 : 0));
    }

    public static float fMeth(double d, int n, int n2) {
        int n3 = 62304;
        int n4 = 12;
        int n5 = 9546;
        int n6 = -13;
        int n7 = -4954;
        int n8 = -9;
        int n9 = -135;
        int n10 = -42;
        int n11 = 2203;
        boolean bl = false;
        byte[] byArray = new byte[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(byArray, (byte)-70);
        FuzzerUtils.init(lArray, -7L);
        for (n3 = 6; n3 < 241; n3 += 3) {
            for (n5 = 1; 20 > n5; ++n5) {
                byArray[n5] = (byte)lArray[n3 + 1];
                n11 = (short)(n11 + (short)byArray[n5]);
                if (bl) break;
            }
            for (n7 = n3; n7 < 20; ++n7) {
                n2 += n7 * byFld1 + n4 - n7;
            }
            Test.vMeth1(n8);
            fFld -= fFld;
        }
        n2 <<= (int)instanceCount;
        d -= 41195.0;
        for (n9 = 12; n9 < 262; ++n9) {
            int n12 = n9 + 1;
            iArrFld[n12] = iArrFld[n12] + n7;
            n4 -= 36;
            n = n5;
            n -= byFld1;
        }
        long l = Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n11 + (long)(bl ? 1 : 0) + (long)n7 + (long)n8 + (long)n9 + (long)n10 + FuzzerUtils.checkSum(byArray) + FuzzerUtils.checkSum(lArray);
        fMeth_check_sum += l;
        return l;
    }

    public static void vMeth(long l, long l2) {
        int n = -44;
        int n2 = 3;
        int n3 = 9128;
        int n4 = -35469;
        int n5 = -31428;
        int n6 = 21;
        int n7 = -10;
        int n8 = 11;
        int n9 = 9;
        boolean bl = true;
        float f = 90.839f;
        int n10 = -19889;
        n = (int)(Test.fMeth(15.48263, n, -12) * (float)l2 - (float)l);
        for (n2 = 3; 363 > n2; ++n2) {
            for (n4 = 1; n4 < 5; ++n4) {
            }
            try {
                n6 = n3 / n5;
                n3 = n6 % -525730321;
                n3 = n / 5995;
            }
            catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            dFld = 5.0;
            if (bl) {
                Test.iArrFld[n2 - 1] = n2;
                for (f = 1.0f; f < 5.0f; f += 1.0f) {
                    for (n8 = 1; n8 < 2; ++n8) {
                        n5 >>>= n7;
                        l2 = n10;
                    }
                    byFld1 = (byte)instanceCount;
                    n3 = (int)dFld;
                    n5 += (int)l2;
                }
                continue;
            }
            iArrFld[6] = iArrFld[6] * (int)instanceCount;
        }
        vMeth_check_sum += l + l2 + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)(bl ? 1 : 0) + (long)n6 + (long)Float.floatToIntBits(f) + (long)n7 + (long)n8 + (long)n9 + (long)n10;
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = -1450;
        var3_3 = -119;
        var4_4 = -37295;
        var5_5 = 12;
        var6_6 = 135;
        var7_7 = 8;
        var8_8 = -5675;
        var9_9 = 50;
        var10_10 = -28650;
        var11_11 = -15536;
        var12_12 = 16795;
        var13_13 = new long[400][400];
        var14_14 = new long[400];
        FuzzerUtils.init(var13_13, -12L);
        FuzzerUtils.init(var14_14, 7L);
        v0 = this.byArrFld[(var2_2 >>> 1) % 400];
        v1 = (var2_2 >>> 1) % 400;
        v2 = (byte)(v0[v1] - 1);
        v0[v1] = v2;
        Test.instanceCount = this.byFld + v2;
        var2_2 >>>= (int)Test.instanceCount;
        Test.instanceCount = Test.instanceCount - Test.instanceCount++;
        var3_3 = 1;
        while (++var3_3 < 348) {
            Test.vMeth(Test.instanceCount, Test.instanceCount);
            Test.dFld += (double)this.byFld;
        }
        block23: for (var4_4 = 13; var4_4 < 269; ++var4_4) {
            try {
                var2_2 = var4_4 % 40164;
                var2_2 = var3_3 / var2_2;
                var5_5 = var3_3 / -24168;
            }
            catch (ArithmeticException var15_15) {
                // empty catch block
            }
            var6_6 = 5;
            while (var6_6 < 98) {
                var2_2 = var7_7;
                v3 = var6_6;
                Test.iArrFld[v3] = Test.iArrFld[v3] ^ Test.byFld1;
                var5_5 = var6_6++;
            }
            switch (var4_4 % 5 + 63) {
                case 63: {
                    Test.fFld *= Test.fFld;
                    switch (var4_4 % 7 * 5 + 47) {
                        case 74: {
                            var8_8 = 1;
                            do {
                                v4 = var13_13[var4_4 + 1];
                                v5 = var4_4 - 1;
                                v4[v5] = v4[v5] + (long)var7_7;
                                for (var9_9 = 1; var9_9 < 1; ++var9_9) {
                                    var5_5 <<= (int)Test.instanceCount;
                                    Test.dFld = Test.instanceCount;
                                    var2_2 <<= (int)Test.instanceCount;
                                    var7_7 ^= var4_4;
                                    if (Test.bFld) {
                                        switch (var4_4 % 2 * 5 + 106) {
                                            case 112: {
                                                Test.iArrFld[var4_4] = 194;
                                                v6 = var9_9 - 1;
                                                var14_14[v6] = var14_14[v6] >>> 251;
                                                v7 = var13_13[var8_8];
                                                v8 = var9_9 + 1;
                                                v7[v8] = v7[v8] >>> var6_6;
                                                break;
                                            }
                                            case 109: {
                                                Test.fFld = -154.0f;
                                                break;
                                            }
                                            default: {
                                                var5_5 += var9_9 | var6_6;
                                                break;
                                            }
                                        }
                                        continue;
                                    }
                                    if (Test.bFld) {
                                        Test.dFld -= (double)Test.instanceCount;
                                        continue;
                                    }
                                    var2_2 += var10_10;
                                }
                            } while (++var8_8 < 98);
                            break;
                        }
                        case 67: {
                            var10_10 = var5_5;
                            break;
                        }
                        case 65: {
                            this.byFld = (byte)(this.byFld & 7);
                            break;
                        }
                        case 66: {
                            var5_5 = -3777;
                            break;
                        }
                        case 63: {
                            var10_10 = var11_11;
                            break;
                        }
                        case 80: {
                            var7_7 -= 33312;
                        }
                        case 52: {
                            var10_10 *= var3_3;
                        }
                    }
                }
                case 64: {
                    var12_12 = (short)(var12_12 * (short)var7_7);
                    continue block23;
                }
                ** case 65:
lbl102:
                // 2 sources

                case 66: {
                    var2_2 -= (int)Test.instanceCount;
                    continue block23;
                }
                case 67: {
                    if (!Test.bFld) continue block23;
                }
            }
        }
        FuzzerUtils.out.println("i i1 i27 = " + var2_2 + "," + var3_3 + "," + var4_4);
        FuzzerUtils.out.println("i28 i29 i30 = " + var5_5 + "," + var6_6 + "," + var7_7);
        FuzzerUtils.out.println("i31 i32 i33 = " + var8_8 + "," + var9_9 + "," + var10_10);
        FuzzerUtils.out.println("s3 s4 lArr1 = " + var11_11 + "," + var12_12 + "," + FuzzerUtils.checkSum(var13_13));
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(var14_14));
        FuzzerUtils.out.println("Test.instanceCount byFld Test.byFld1 = " + Test.instanceCount + "," + this.byFld + "," + Test.byFld1);
        FuzzerUtils.out.println("Test.fFld Test.dFld Test.bFld = " + Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld) + "," + (Test.bFld != false ? 1 : 0));
        FuzzerUtils.out.println("byArrFld Test.iArrFld = " + FuzzerUtils.checkSum(this.byArrFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + Test.vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + Test.fMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 36006);
        vMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

