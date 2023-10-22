/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 7607L;
    public static double dFld = -62.37278;
    public boolean bFld = false;
    public static int[][] iArrFld = new int[400][400];
    public static long fMeth_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(long l, int n) {
        int n2 = -2;
        int n3 = 21659;
        int n4 = -26456;
        int n5 = 8;
        int[] nArray = new int[400];
        float f = -2.32f;
        float f2 = -7.2f;
        int n6 = 26967;
        FuzzerUtils.init(nArray, 63918);
        n >>>= n;
        n2 = 1;
        while (++n2 < 333) {
            nArray[n2] = -2;
            n -= (int)f;
            n += n2 * n6 + n - n;
            f += (float)((long)n2 - instanceCount);
            n = (int)dFld;
            n = n2;
            f += (float)n2;
        }
        for (n3 = 4; n3 < 377; ++n3) {
            n %= (int)((long)dFld | 1L);
            n += n3 * n3;
            for (f2 = 5.0f; f2 > (float)n3; f2 -= 1.0f) {
                n += (int)f2;
            }
            n = n5;
        }
        vMeth_check_sum += l + (long)n + (long)n2 + (long)Float.floatToIntBits(f) + (long)n6 + (long)n3 + (long)n4 + (long)Float.floatToIntBits(f2) + (long)n5 + FuzzerUtils.checkSum(nArray);
    }

    public static long lMeth(long l, long l2, short s) {
        int n = -25140;
        int n2 = -7224;
        int n3 = 55;
        for (n = 7; n < 345; ++n) {
            l >>= n2;
            Test.vMeth(l2, n);
        }
        n3 = (byte)s;
        long l3 = l + l2 + (long)s + (long)n + (long)(n2 += (int)l2) + (long)n3;
        lMeth_check_sum += l3;
        return l3;
    }

    public float fMeth(int n) {
        float f = 4.42f;
        int n2 = -14;
        int n3 = 53165;
        int n4 = -6;
        int n5 = -8775;
        int n6 = 235;
        int n7 = -31349;
        int n8 = 18861;
        boolean bl = true;
        long[][][] lArray = new long[400][400][400];
        FuzzerUtils.init((Object[][])lArray, (Object)1865655428788013374L);
        f = (long)n + Test.lMeth(instanceCount, instanceCount, (short)26807);
        for (n2 = 6; n2 < 398; ++n2) {
            n3 += n2 * n + n2 - n3;
            for (n4 = 1; n4 < 4; ++n4) {
                for (n6 = 2; n6 > 1; --n6) {
                    n8 = -14;
                }
                lArray[n2 - 1][n4][n4] = n8;
                if (bl) {
                    instanceCount += (long)(n4 ^ n5);
                    n8 += n8;
                    continue;
                }
                if (!bl) continue;
                try {
                    n3 = -42309 / n2;
                    n8 = iArrFld[n2][n4 + 1] / n4;
                    Test.iArrFld[n2 - 1][n4 - 1] = n2 % n5;
                }
                catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                lArray[n2][n4 + 1] = lArray[n2][n4 - 1];
            }
        }
        long l = (long)(n + Float.floatToIntBits(f) + n2 + n3 + n4 + n5 + n6 + n7 + n8 + (bl ? 1 : 0)) + FuzzerUtils.checkSum((Object[][])lArray);
        fMeth_check_sum += l;
        return l;
    }

    public void mainTest(String[] stringArray) {
        float f = 1.18f;
        float[] fArray = new float[400];
        int n = -25868;
        int n2 = 45791;
        int n3 = -10;
        int n4 = -242;
        int n5 = -133;
        int n6 = 1;
        int n7 = 62816;
        int n8 = -11;
        int n9 = 108;
        int n10 = -21675;
        int n11 = 17627;
        int n12 = -2;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 2643954517L);
        FuzzerUtils.init(fArray, -18.36f);
        f = 268.0f;
        block2: while (true) {
            float f2;
            f -= 1.0f;
            if (!(f2 > 0.0f)) break;
            n = 4;
            while (true) {
                if (n >= 94) continue block2;
                for (n3 = 1; n3 < 2; ++n3) {
                    instanceCount += (long)n3;
                    Test.iArrFld[(int)(f - 1.0f)][(n3 >>> 1) % 400] = (int)(instanceCount <<= (int)((float)(-n4++) + this.fMeth(47893) + (float)n));
                    if (this.bFld) continue;
                    n2 /= n | 1;
                }
                dFld = f;
                n11 = (short)n3;
                ++n;
            }
            break;
        }
        for (n5 = 10; 366 > n5; ++n5) {
            block6: for (n7 = 1; 71 > n7; ++n7) {
                for (n9 = 1; n9 < 2; ++n9) {
                    if (this.bFld) {
                        lArray[n7 + 1] = n5;
                        int[] nArray = iArrFld[n7 + 1];
                        int n13 = n7 + 1;
                        nArray[n13] = nArray[n13] + -67;
                        n6 -= 86;
                        n10 += -18 + n9 * n9;
                    }
                    if (this.bFld) {
                        int n14 = n9 - 1;
                        fArray[n14] = fArray[n14] + (float)n12;
                        dFld = n6;
                        n8 = n7;
                        continue;
                    }
                    if (this.bFld) continue block6;
                    n10 = -105;
                    try {
                        n10 = n8 / -36975;
                        n10 = n3 / n8;
                        n8 = n5 / n3;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    instanceCount += instanceCount;
                }
            }
        }
        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + n + "," + n2);
        FuzzerUtils.out.println("i2 i3 s2 = " + n3 + "," + n4 + "," + n11);
        FuzzerUtils.out.println("i19 i20 i21 = " + n5 + "," + n6 + "," + n7);
        FuzzerUtils.out.println("i22 i23 i24 = " + n8 + "," + n9 + "," + n10);
        FuzzerUtils.out.println("by1 lArr1 fArr = " + n12 + "," + FuzzerUtils.checkSum(lArray) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld bFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + (this.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -24202);
        fMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

