/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 12L;
    public static int iFld = -5;
    public static short sFld = (short)25490;
    public float fFld = 0.167f;
    public static int[] iArrFld = new int[400];
    public static long lMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(int n) {
        int n2 = 3;
        int n3 = -2178;
        int n4 = -5;
        int n5 = -201;
        int n6 = -78;
        int n7 = -13395;
        boolean bl = false;
        float[] fArray = new float[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(fArray, 48.216f);
        FuzzerUtils.init(lArray, 139L);
        n = iFld;
        fArray[71] = fArray[71] - (float)iFld;
        for (n2 = 11; n2 < 270; ++n2) {
            n *= n3;
            n3 <<= -12073;
            n3 = 532074264;
            n >>>= n6;
            for (n4 = 6; n4 > 1; n4 -= 3) {
                iFld = (int)((long)iFld + ((long)(n4 * n + n4) - instanceCount));
                if (bl) {
                    iFld = n7;
                    n3 = -27;
                    n7 = (short)n;
                    continue;
                }
                if (!bl) continue;
                int n8 = n4;
                lArray[n8] = lArray[n8] ^ (long)n5;
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n6 + n4 + n5 + n7 + (bl ? 1 : 0)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray);
    }

    public static int iMeth(int n, int n2, double d) {
        int n3 = 13;
        int n4 = -13;
        int n5 = -64330;
        int n6 = 196;
        int n7 = -4;
        int n8 = 171;
        int n9 = 1;
        int n10 = -23117;
        int n11 = -17680;
        int n12 = -20;
        float f = 63.769f;
        boolean bl = true;
        iFld = --n;
        Test.vMeth(iFld);
        for (n3 = 5; n3 < 167; n3 += 2) {
            for (n5 = 1; n5 < 19; ++n5) {
                for (n7 = 1; 2 > n7; ++n7) {
                    n6 = -52685;
                    instanceCount -= (long)n6;
                }
                int n13 = n3 + 1;
                iArrFld[n13] = iArrFld[n13] + (int)d;
                n2 += n6;
                for (n9 = 1; 2 > n9; ++n9) {
                    n10 = n5;
                }
                n11 = (short)(n11 | (short)n7);
                n12 = (byte)n3;
                f *= 2.52056f;
            }
        }
        long l = (long)(n + n2) + Double.doubleToLongBits(d) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9 + (long)n10 + (long)n11 + (long)n12 + (long)Float.floatToIntBits(f) + (long)(bl ? 1 : 0);
        iMeth_check_sum += l;
        return (int)l;
    }

    public static long lMeth() {
        double d = -90.90482;
        double d2 = 0.65288;
        float f = 0.911f;
        long l = 310304144709520296L;
        int n = -18068;
        int n2 = -103;
        int[] nArray = new int[400];
        short[] sArray = new short[400];
        FuzzerUtils.init(nArray, -28114);
        FuzzerUtils.init(sArray, (short)-32487);
        d = 331.0;
        do {
            try {
                iFld = nArray[(int)(d - 1.0)] % 59423;
                iFld = -686331878 % iFld;
                iFld %= -199;
            }
            catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            iFld -= (int)((Long.reverseBytes(instanceCount) + (long)(iFld + 42317)) * (long)iFld);
            d2 -= (double)(-(++iFld));
            f = -sArray[(int)(d + 1.0)];
            int n3 = (iFld += (int)(d * d)) - iFld;
            iFld = -1734285898;
            instanceCount -= (long)(n3 * -1734285898 * 166);
            l = 5L;
            while ((l -= 3L) > 0L) {
                int n4 = -27;
                int n5 = (int)d;
                nArray[n5] = nArray[n5] << -(n4 + iFld) + nArray[(int)l];
                n4 = (int)((long)n4 + (-7L + l * l));
                iFld -= (int)((long)Test.iMeth(n4, n4, d2) + instanceCount);
                for (n = 3; n > 1; n -= 2) {
                    f *= 6037.0f;
                    d2 += -12.0;
                }
                d2 -= -65522.0;
            }
        } while ((d -= 1.0) > 0.0);
        long l2 = Double.doubleToLongBits(d) + Double.doubleToLongBits(d2) + (long)Float.floatToIntBits(f) + l + (long)n + (long)n2 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(sArray);
        lMeth_check_sum += l2;
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    public void mainTest(String[] var1_1) {
        var2_2 = 0.112962;
        var4_3 = -11;
        var5_4 = -4;
        var6_5 = 159;
        var7_6 = -6;
        var8_7 = 123;
        var9_8 = 30104;
        var10_9 = -11;
        var11_10 = -3;
        var12_11 = -4;
        var13_12 = 63;
        var14_13 = true;
        var15_14 = new long[400];
        FuzzerUtils.init(var15_14, 422L);
        Test.instanceCount -= (long)((double)(Test.iFld * Test.iFld) * (3.910638169E9 - (var2_2 - (double)Test.instanceCount)) + (double)Test.lMeth());
        for (var4_3 = 5; var4_3 < 239; ++var4_3) {
            Test.iFld += var4_3 | var5_4;
        }
        v0 = (var4_3 >>> 1) % 400;
        Test.iArrFld[v0] = Test.iArrFld[v0] << -200;
        var13_12 = (byte)var4_3;
        block11: for (var6_5 = 9; var6_5 < 293; ++var6_5) {
            Test.instanceCount += (long)var7_6;
            switch (var6_5 % 4 + 58) {
                case 58: {
                    var7_6 *= var5_4;
                    continue block11;
                }
                case 59: {
                    var15_14[var6_5 - 1] = Test.instanceCount;
                    for (var8_7 = 5; var8_7 < 89; ++var8_7) {
                        var5_4 = var4_3;
                        Test.instanceCount += (long)var2_2;
                        Test.instanceCount = Test.iFld;
                        var7_6 += (int)Test.instanceCount;
                        if (var14_13) continue;
                        Test.iFld = -244;
                        block13: for (var10_9 = 1; var10_9 < 2; ++var10_9) {
                            Test.sFld = (short)(Test.sFld + (short)(var10_9 * var10_9));
                            this.fFld -= (float)var8_7;
                            switch (var6_5 % 2 + 126) {
                                case 126: {
                                    this.fFld += (float)(-3 + var10_9 * var10_9);
                                    this.fFld *= 12442.0f;
                                    var7_6 += var13_12;
                                    if (!var14_13) ** GOTO lbl52
                                    if (var14_13) {
                                        if (var14_13) continue block13;
                                        this.fFld += (float)(var10_9 * var8_7 + var6_5 - var6_5);
                                    } else {
                                        Test.instanceCount += (long)var12_11;
                                    }
                                    ** GOTO lbl56
lbl52:
                                    // 1 sources

                                    if (var14_13) {
                                        var13_12 = (byte)(var13_12 + (byte)(var10_9 * var11_10));
                                    } else {
                                        var2_2 *= (double)var9_8;
                                    }
                                }
lbl56:
                                // 5 sources

                                case 127: {
                                    this.fFld += (float)((long)(var10_9 * var9_8 + var10_9) - Test.instanceCount);
                                }
                            }
                        }
                    }
                    continue block11;
                }
                case 60: {
                    var7_6 <<= Test.iFld;
                    continue block11;
                }
                case 61: {
                    v1 = var6_5;
                    Test.iArrFld[v1] = Test.iArrFld[v1] - (int)var2_2;
                    continue block11;
                }
                default: {
                    var11_10 *= var12_11;
                }
            }
        }
        FuzzerUtils.out.println("d i19 i20 = " + Double.doubleToLongBits(var2_2) + "," + var4_3 + "," + var5_4);
        FuzzerUtils.out.println("by2 i21 i22 = " + var13_12 + "," + var6_5 + "," + var7_6);
        FuzzerUtils.out.println("i23 i24 b2 = " + var8_7 + "," + var9_8 + "," + (var14_13 != false ? 1 : 0));
        FuzzerUtils.out.println("i25 i26 i27 = " + var10_9 + "," + var11_10 + "," + var12_11);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(var15_14));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld + "," + Test.sFld);
        FuzzerUtils.out.println("fFld Test.iArrFld = " + Float.floatToIntBits(this.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + Test.vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + Test.iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + Test.lMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 7);
        lMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

