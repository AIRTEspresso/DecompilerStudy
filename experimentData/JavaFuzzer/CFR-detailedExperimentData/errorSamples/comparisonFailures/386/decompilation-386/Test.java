/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = 12L;
    public static volatile double dFld = -2.14946;
    public int iFld = -9;
    public static int iFld1 = -11;
    public static int[] iArrFld = new int[400];
    public static float[] fArrFld = new float[400];
    public byte[] byArrFld = new byte[400];
    public static long vMeth_check_sum;
    public static long lMeth_check_sum;
    public static long bMeth_check_sum;

    public static boolean bMeth(int n, double d) {
        int n2 = -17;
        int n3 = -7;
        int n4 = 4;
        int n5 = -238;
        int n6 = -10;
        int n7 = 17175;
        int n8 = (n >>> 1) % 400;
        iArrFld[n8] = iArrFld[n8] + n;
        for (n2 = 15; n2 < 386; ++n2) {
            block7: for (n4 = 1; n4 < 5; ++n4) {
                Test.iArrFld[n4 + 1] = n5;
                switch (n2 % 2 * 5 + 111) {
                    case 117: {
                        n -= (int)instanceCount;
                        continue block7;
                    }
                    case 114: {
                        n6 = 1;
                        do {
                            int n9 = n4;
                            iArrFld[n9] = iArrFld[n9] & n;
                            try {
                                n5 = -239 % n5;
                                n5 = -64313 / iArrFld[n4 + 1];
                                n5 = n / iArrFld[(n >>> 1) % 400];
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            Test.fArrFld[n2] = 37948.0f;
                            n3 += (int)(instanceCount *= (long)n7);
                            instanceCount += (long)(n6 * n);
                            n3 |= n4;
                        } while (++n6 < 2);
                        n5 *= (int)instanceCount;
                    }
                }
            }
        }
        long l = (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7;
        bMeth_check_sum += l;
        return l % 2L > 0L;
    }

    public static long lMeth(int n, float f) {
        int n2 = -10;
        int n3 = 82;
        int n4 = 56930;
        int n5 = -7736;
        boolean bl = true;
        boolean[] blArray = new boolean[400];
        int n6 = -6;
        FuzzerUtils.init(blArray, false);
        n2 = 1;
        while (++n2 < 201 && !Test.bMeth(n, dFld) && !bl) {
            blArray[n2 - 1] = bl;
            instanceCount += (long)n2;
            n3 = 1;
            do {
                n = (int)((float)n + ((float)n3 * f + (float)n2 - (float)n3));
                n >>= 57128;
            } while (++n3 < 8);
        }
        n <<= n;
        int n7 = (iFld1 >>> 1) % 400;
        iArrFld[n7] = iArrFld[n7] + (int)dFld;
        n >>= -2;
        for (n4 = 134; 3 < n4; n4 -= 3) {
            n >>= (int)instanceCount;
            int n8 = n4 + 1;
            iArrFld[n8] = iArrFld[n8] & n6;
            int n9 = n4 - 1;
            fArrFld[n9] = fArrFld[n9] + (float)n6;
            iFld1 = 42;
        }
        long l = (long)(n + Float.floatToIntBits(f) + n2 + (bl ? 1 : 0) + n3 + n4 + n5 + n6) + FuzzerUtils.checkSum(blArray);
        lMeth_check_sum += l;
        return l;
    }

    public static void vMeth(int n) {
        float f = 1.72f;
        float[] fArray = new float[400];
        int n2 = 41902;
        int n3 = 0;
        int n4 = 5;
        int n5 = -8;
        int n6 = 14;
        int n7 = -145;
        int n8 = -16114;
        FuzzerUtils.init(fArray, 87.46f);
        instanceCount -= Long.reverseBytes(-2187064611379246730L);
        int n9 = (n >>> 1) % 400;
        int n10 = iArrFld[n9] + 1;
        iArrFld[n9] = n10;
        int n11 = ((n *= n10) >>> 1) % 400;
        fArray[n11] = fArray[n11] - -f;
        for (n2 = 3; n2 < 126; ++n2) {
            for (n4 = 1; n4 < 13; ++n4) {
                for (n6 = 1; n6 < 2; ++n6) {
                    double d = dFld;
                    dFld += 1.0;
                    dFld = d - dFld;
                    int n12 = n2 - 1;
                    fArray[n12] = fArray[n12] - (float)Test.lMeth(n6, f);
                    n += n3;
                    fArray[(n7 >>> 1) % 400] = n8;
                    iFld1 += n6;
                    iFld1 = n8;
                }
            }
            f += (float)((long)n2 ^ (long)f);
            n += n2;
            n7 += 7521 + n2 * n2;
        }
        vMeth_check_sum += (long)(n + Float.floatToIntBits(f) + n2 + n3 + n4 + n5 + n6 + n7 + n8) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
    }

    public void mainTest(String[] stringArray) {
        float f = 1.179f;
        int n = 62;
        int n2 = 50259;
        int n3 = -14;
        int n4 = -110;
        int n5 = 144;
        int n6 = 13;
        boolean bl = false;
        long l = 118L;
        int n7 = -5077;
        this.iFld = this.iFld - -11897 - (this.iFld + 34092) + iArrFld[(this.iFld >>> 1) % 400];
        Test.vMeth(iFld1);
        f = (float)(dFld *= (double)(--instanceCount + (long)this.iFld));
        for (n = 228; n > 11; --n) {
            instanceCount += (long)(n * n);
            iFld1 += n;
            int n8 = n + 1;
            iArrFld[n8] = iArrFld[n8] | (int)(instanceCount += (long)n2);
            for (l = 7L; l < 116L; l += 3L) {
                block13: for (n4 = 1; n4 < 4; n4 += 2) {
                    switch (n4 % 2 * 5 + 114) {
                        case 116: {
                            f += (float)iFld1;
                            n3 += (int)l;
                            instanceCount += (long)(n4 * n + n5) - instanceCount;
                            break;
                        }
                        case 118: {
                            n5 *= (int)l;
                            break;
                        }
                        default: {
                            iArrFld = FuzzerUtils.int1array(400, 13);
                            f = n4;
                            n7 = (short)(n7 * 2511);
                            int n9 = n - 1;
                            iArrFld[n9] = iArrFld[n9] + n4;
                        }
                    }
                    n5 += n4 ^ n5;
                    switch ((int)(l % 6L + 19L)) {
                        case 19: {
                            int n10 = n4;
                            this.byArrFld[n10] = (byte)(this.byArrFld[n10] & (byte)this.iFld);
                        }
                        case 20: {
                            instanceCount >>= n4;
                            instanceCount += (long)(n4 * n4);
                            iFld1 += (int)l;
                        }
                        case 21: {
                            n6 >>= (int)instanceCount;
                            instanceCount = n;
                            continue block13;
                        }
                        case 22: {
                            n6 += n4 ^ n4;
                            continue block13;
                        }
                        case 23: {
                            this.iFld -= this.iFld;
                            continue block13;
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println("f3 i18 i19 = " + Float.floatToIntBits(f) + "," + n + "," + n2);
        FuzzerUtils.out.println("b1 l i20 = " + (bl ? 1 : 0) + "," + l + "," + n3);
        FuzzerUtils.out.println("i21 i22 s2 = " + n4 + "," + n5 + "," + n7);
        FuzzerUtils.out.println("i23 = " + n6);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + this.iFld);
        FuzzerUtils.out.println("Test.iFld1 Test.iArrFld Test.fArrFld = " + iFld1 + "," + FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("byArrFld = " + FuzzerUtils.checkSum(this.byArrFld));
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -6);
        FuzzerUtils.init(fArrFld, -86.35f);
        vMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        bMeth_check_sum = 0L;
    }
}

