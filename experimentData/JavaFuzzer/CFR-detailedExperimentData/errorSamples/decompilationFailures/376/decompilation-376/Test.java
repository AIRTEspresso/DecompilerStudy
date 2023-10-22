/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -3693941265L;
    public static boolean bFld = true;
    public static float fFld = -31.681f;
    public short sFld = (short)17401;
    public static volatile int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long lMeth_check_sum;

    public static long lMeth(boolean bl) {
        int n = 47924;
        int n2 = -9;
        int n3 = -60361;
        int n4 = 2721;
        int n5 = -9;
        int n6 = 6;
        int[] nArray = new int[400];
        float f = 1.702f;
        double d = 93.121787;
        FuzzerUtils.init(nArray, 193);
        d += (double)(n -= (int)f);
        n2 = 1;
        while (++n2 < 328) {
            n3 = 1;
            do {
                instanceCount = n3;
                n -= 742;
                n4 = 1;
                do {
                    n >>= n3;
                    n += n4 * n4;
                } while (++n4 < 1);
                int n7 = n2;
                nArray[n7] = nArray[n7] - 29245;
            } while (++n3 < 5);
            for (n5 = 1; n5 < 5; ++n5) {
                n >>>= n3;
            }
            n >>= n5;
            n += n2;
            n6 ^= n2;
        }
        long l = (long)((bl ? 1 : 0) + n + Float.floatToIntBits(f)) + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(nArray);
        lMeth_check_sum += l;
        return l;
    }

    public static void vMeth1(long l, int n) {
        double d = -82.119233;
        int n2 = -35215;
        int n3 = -113;
        int n4 = 1;
        int n5 = -150;
        int[] nArray = new int[400];
        float f = -23.356f;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -1675037240L);
        FuzzerUtils.init(nArray, 7);
        for (d = 8.0; d < 146.0; d += 1.0) {
            for (n3 = 1; n3 < 11; ++n3) {
                int n6 = n3 - 1;
                long l2 = lArray[n6] - 1L;
                lArray[n6] = l2;
                f *= (float)Math.min(--n2, (int)((long)n2 * (54059L + l2)));
                n5 = 1;
                block12: do {
                    int n7 = 17037;
                    switch (n3 % 6 + 93) {
                        case 93: {
                            nArray[n5 - 1] = (int)(Float.intBitsToFloat(n2) + (float)(n2 + n7) - (float)((long)(n5 + -165) * Test.lMeth(bFld)));
                            int n8 = (int)(d - 1.0);
                            nArray[n8] = nArray[n8] ^ (int)instanceCount;
                            n4 = n3;
                            break;
                        }
                        case 94: {
                            n2 = (int)((long)n2 + ((long)(n5 * n2) + l - (long)n3));
                            n4 += (int)l;
                            n2 -= n3;
                            break;
                        }
                        case 95: {
                            int n9 = n3;
                            nArray[n9] = nArray[n9] & (int)l;
                            try {
                                n2 = -44798 / nArray[n5 + 1];
                                n2 = 54885 / nArray[(int)d];
                                n2 = 2072336639 / n3;
                            }
                            catch (ArithmeticException arithmeticException) {}
                            continue block12;
                        }
                        case 96: {
                            n -= n;
                            break;
                        }
                        case 97: {
                            break;
                        }
                        case 98: {
                            nArray[n3] = n3;
                        }
                    }
                } while (++n5 < 2);
            }
        }
        vMeth1_check_sum += l + (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)Float.floatToIntBits(f) + (long)n5 + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth(long l, long l2, int n) {
        float f = 14.176f;
        int n2 = -86;
        int n3 = 0;
        int n4 = -9;
        int[] nArray = new int[400];
        long l3 = 1663839326L;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -350440897L);
        FuzzerUtils.init(nArray, -28809);
        if (bFld) {
            int n5 = (n >>> 1) % 400;
            lArray[n5] = lArray[n5] * (long)((float)n * f + (float)((long)n * -43807L) + f);
            for (n2 = 8; 207 > n2; ++n2) {
                Test.vMeth1(instanceCount, n2);
                try {
                    n3 = -399906325 / n2;
                    n3 = nArray[n2] % n3;
                    n = nArray[n2] / n3;
                }
                catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                instanceCount -= (long)n;
            }
            for (l3 = 5L; l3 < 313L; ++l3) {
                f *= (float)n3;
                n3 += 61;
                n3 -= 119601880;
                n3 += (int)(l3 * (long)n3 + (long)n3 - (long)n3);
                n3 = (int)instanceCount;
                n3 = 7;
                n4 = n;
            }
        }
        vMeth_check_sum += l + l2 + (long)n + (long)Float.floatToIntBits(f) + (long)n2 + (long)n3 + l3 + (long)n4 + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = 52964;
        var3_3 = 45938;
        var4_4 = -24;
        var5_5 = -204;
        var6_6 = 1;
        var7_7 = -2;
        var8_8 = -215;
        var9_9 = 9502;
        var10_10 = -1L;
        var12_11 = new long[400];
        var13_12 = -1;
        var14_13 = -116.24286;
        var16_14 = new float[400];
        FuzzerUtils.init(var16_14, 0.273f);
        FuzzerUtils.init(var12_11, 6724907717687416936L);
        Test.vMeth(Test.instanceCount, Test.instanceCount, var2_2);
        for (var3_3 = 17; var3_3 < 355; var3_3 += 3) {
            Test.instanceCount += (long)var3_3;
            var4_4 = (int)((float)var4_4 + ((float)(var3_3 * var4_4 + var2_2) - Test.fFld));
            if (Test.bFld) {
                block9: for (var5_5 = 4; var5_5 < 224; ++var5_5) {
                    v0 = var5_5 + 1;
                    var12_11[v0] = var12_11[v0] * var10_10;
                    Test.instanceCount >>= var6_6;
                    var4_4 = (int)var10_10;
                    var6_6 += var4_4;
                    switch (var3_3 % 9 + 109) {
                        ** case 109:
lbl29:
                        // 2 sources

                        case 110: 
                        case 111: {
                            Test.bFld = false;
                            for (var7_7 = 2; var7_7 > 1; --var7_7) {
                                var4_4 *= var7_7;
                                var13_12 = (byte)(var13_12 + 55);
                                var2_2 = var5_5;
                                Test.iArrFld[var7_7 + 1] = var3_3;
                            }
                        }
                        case 112: {
                            var4_4 += -70 + var5_5 * var5_5;
                            continue block9;
                        }
                        case 113: {
                            var6_6 += 5;
                            var8_8 = this.sFld;
                            for (var14_13 = 1.0; var14_13 < 2.0; var14_13 += 1.0) {
                                var8_8 = 74;
                            }
                            var13_12 = (byte)(var13_12 | (byte)Test.instanceCount);
                            continue block9;
                        }
                        case 114: 
                        case 115: 
                        case 116: {
                            var12_11[var3_3] = 47133L;
                        }
                        case 117: {
                            var2_2 = (int)((long)var2_2 + ((long)var5_5 * Test.instanceCount + (long)var7_7 - Test.instanceCount));
                        }
                    }
                }
                continue;
            }
            if (Test.bFld) {
                Test.instanceCount = var6_6;
                continue;
            }
            if (Test.bFld) {
                Test.instanceCount = var5_5;
                continue;
            }
            var4_4 >>= 5;
        }
        FuzzerUtils.out.println("i15 i16 i17 = " + var2_2 + "," + var3_3 + "," + var4_4);
        FuzzerUtils.out.println("i18 i19 l4 = " + var5_5 + "," + var6_6 + "," + var10_10);
        FuzzerUtils.out.println("i20 i21 by = " + var7_7 + "," + var8_8 + "," + var13_12);
        FuzzerUtils.out.println("d2 i22 fArr = " + Double.doubleToLongBits(var14_13) + "," + var9_9 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(var16_14)));
        FuzzerUtils.out.println("lArr2 = " + FuzzerUtils.checkSum(var12_11));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + Test.instanceCount + "," + (Test.bFld != false ? 1 : 0) + "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("sFld Test.iArrFld = " + this.sFld + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + Test.lMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + Test.vMeth1_check_sum);
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
        FuzzerUtils.init(iArrFld, 58);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        lMeth_check_sum = 0L;
    }
}

