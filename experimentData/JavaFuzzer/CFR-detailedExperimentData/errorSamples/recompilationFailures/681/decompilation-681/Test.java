/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -4035108823L;
    public static byte byFld = (byte)85;
    public static int iFld = -14;
    public static long[] lArrFld = new long[400];
    public static long[][] lArrFld1 = new long[400][400];
    public int[][][] iArrFld = new int[400][400][400];
    public float[] fArrFld = new float[400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1() {
        int n = 30;
        int n2 = 12;
        int n3 = 52697;
        int n4 = 52;
        int n5 = 3052;
        int n6 = 12;
        int[] nArray = new int[400];
        int n7 = -29887;
        double d = -112.124887;
        float f = 0.536f;
        boolean bl = true;
        FuzzerUtils.init(nArray, -206);
        n >>>= n;
        n7 = (short)(n7 - (short)d);
        n2 &= n2;
        for (int n8 : nArray) {
            instanceCount *= 8L;
            for (n3 = 1; 4 > n3; ++n3) {
                for (n5 = n3; n5 < 2; ++n5) {
                    instanceCount += (long)d;
                    n6 = (int)f;
                    instanceCount <<= n8;
                    n6 = 4;
                }
                n2 = (int)instanceCount;
                n7 = (short)(n7 * (short)instanceCount);
            }
        }
        vMeth1_check_sum += (long)(n + n7) + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)Float.floatToIntBits(f) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray);
    }

    public static int iMeth(double d, int n, int n2) {
        int n3 = 27396;
        int n4 = -203;
        int n5 = 0;
        int n6 = -181;
        int n7 = -46561;
        int n8 = 5;
        int[] nArray = new int[400];
        boolean bl = false;
        int n9 = -21421;
        FuzzerUtils.init(nArray, 5);
        n2 -= n2;
        for (n3 = 162; 5 < n3; n3 -= 2) {
            boolean bl2;
            bl = (long)n3 != 6068699970408286646L;
            bl = bl;
            if (!bl2) continue;
            for (n5 = 1; 20 > n5; ++n5) {
                switch (n3 % 1 + 116) {
                    case 116: {
                        n6 += n9;
                        break;
                    }
                    default: {
                        Test.vMeth1();
                        try {
                            n6 = 210 / n;
                            n = n3 / -50725;
                            n4 = n / n2;
                        }
                        catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                        int n10 = n3;
                        lArrFld[n10] = lArrFld[n10] + (long)byFld;
                        int n11 = n3 - 1;
                        nArray[n11] = nArray[n11] * n5;
                    }
                }
                for (n7 = n3; n7 < 2; ++n7) {
                    n >>= n;
                    int n12 = n5;
                    nArray[n12] = nArray[n12] / (n9 | 1);
                    n2 -= n3;
                    byFld = (byte)(byFld + (byte)(164 + n7 * n7));
                }
            }
        }
        long l = Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)(bl ? 1 : 0) + (long)n5 + (long)n6 + (long)n9 + (long)n7 + (long)n8 + FuzzerUtils.checkSum(nArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth(byte by) {
        int n = 5;
        int n2 = -56;
        int n3 = -12;
        int n4 = -8347;
        int n5 = -3;
        int n6 = -4;
        int n7 = 3516;
        int n8 = 5;
        int n9 = 37066;
        int[] nArray = new int[400];
        int n10 = 18955;
        float f = 14.177f;
        double d = 26.45238;
        boolean bl = false;
        FuzzerUtils.init(nArray, 0);
        n = Test.iMeth(31.60701, n, n) * n10;
        for (n2 = 4; n2 < 269; ++n2) {
            for (n4 = n2; n4 < 6; ++n4) {
                try {
                    n = nArray[n2] % iFld;
                    nArray[n2] = iFld / n5;
                    nArray[n4 + 1] = nArray[n4 - 1] % n3;
                }
                catch (ArithmeticException arithmeticException) {
                    // empty catch block
                }
                n10 = (short)(n10 + (short)(n4 * n4));
                for (n6 = 1; n6 < 1; ++n6) {
                    n10 = (short)(n10 + (short)((long)n6 | (long)f));
                }
                for (n8 = 1; n8 < 1; ++n8) {
                    n10 = (short)(n10 + 4);
                    instanceCount += (long)(n8 ^ n9);
                    n5 += (int)d;
                    if (n != 0) {
                        vMeth_check_sum += (long)(by + n + n10 + n2 + n3 + n4 + n5 + n6 + n7 + Float.floatToIntBits(f) + n8 + n9) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray);
                        return;
                    }
                    if (!bl) continue;
                }
            }
        }
        vMeth_check_sum += (long)(by + n + n10 + n2 + n3 + n4 + n5 + n6 + n7 + Float.floatToIntBits(f) + n8 + n9) + Double.doubleToLongBits(d) + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        float f = 68.91f;
        double d = 7.25772;
        int n = 6478;
        int n2 = 240;
        int n3 = -8353;
        int n4 = -85;
        int n5 = -78;
        int n6 = 32102;
        int n7 = 3;
        Test.vMeth((byte)-12);
        this.iArrFld[0][(Test.iFld >>> 1) % 400][(Test.iFld >>> 1) % 400] = (int)f;
        d *= (double)iFld;
        d -= (double)iFld;
        iFld = n;
        instanceCount >>>= iFld;
        int n8 = (iFld >>> 1) % 400;
        this.fArrFld[n8] = this.fArrFld[n8] + 48824.0f;
        iFld -= 62903;
        iFld += iFld;
        for (n2 = 2; n2 < 388; ++n2) {
            n3 = -52;
            iFld += (int)instanceCount;
            n3 = (int)instanceCount;
            n3 >>= byFld;
            block8: for (n4 = 3; n4 < 65; ++n4) {
                n5 &= n5;
                n5 += n4;
                n5 = 3250;
                int[] nArray = this.iArrFld[n4][n2 + 1];
                int n9 = n4;
                nArray[n9] = nArray[n9] >>> (int)instanceCount;
                Test.lArrFld[n4 + 1] = iFld;
                switch (n4 % 5 * 5 + 103) {
                    case 126: {
                        for (n6 = 2; 1 < n6; n6 -= 3) {
                            instanceCount += (long)(n6 + n4);
                        }
                        int[] nArray2 = this.iArrFld[n4][n2];
                        int n10 = n4;
                        nArray2[n10] = nArray2[n10] + n3;
                        instanceCount += -14L;
                        instanceCount = n6;
                        continue block8;
                    }
                    case 109: {
                        f += (float)n;
                        f = instanceCount *= (long)n2;
                        continue block8;
                    }
                    case 123: {
                        iFld -= n6;
                    }
                    case 127: {
                        int[] nArray3 = this.iArrFld[n2 + 1][n2];
                        int n11 = n2 + 1;
                        nArray3[n11] = nArray3[n11] << n;
                        continue block8;
                    }
                    case 119: {
                        instanceCount -= (long)d;
                    }
                }
            }
        }
        FuzzerUtils.out.println("f2 d3 s3 = " + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d) + "," + n);
        FuzzerUtils.out.println("i25 i26 i27 = " + n2 + "," + n3 + "," + n4);
        FuzzerUtils.out.println("i28 i29 i30 = " + n5 + "," + n6 + "," + n7);
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.iFld = " + instanceCount + "," + byFld + "," + iFld);
        FuzzerUtils.out.println("Test.lArrFld Test.lArrFld1 iArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(lArrFld1) + "," + FuzzerUtils.checkSum((Object[][])this.iArrFld));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
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
        FuzzerUtils.init(lArrFld, -2113223696L);
        FuzzerUtils.init(lArrFld1, -10752L);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

