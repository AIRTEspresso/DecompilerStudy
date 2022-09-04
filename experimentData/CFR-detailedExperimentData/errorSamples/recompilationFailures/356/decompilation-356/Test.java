/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 3972502732L;
    public static short sFld = (short)-15999;
    public static double dFld = 0.106173;
    public int iFld = -6;
    public static float fFld = 0.405f;
    public long[] lArrFld = new long[400];
    public static long[] lArrFld1 = new long[400];
    public static int[] iArrFld = new int[400];
    public long[] lArrFld2 = new long[400];
    public float[] fArrFld = new float[400];
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long iMeth2_check_sum;
    public static long vMeth_check_sum;

    public int iMeth1() {
        float f = -18.285f;
        f = this.lArrFld[(this.iFld >>> 1) % 400];
        long l = Float.floatToIntBits(f);
        iMeth1_check_sum += l;
        return (int)l;
    }

    public static void vMeth(float f) {
        int n = 46;
        dFld -= (double)n;
        dFld -= (double)n;
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n);
    }

    public static int iMeth2(int n, int n2, long l) {
        int n3 = 63;
        int n4 = -2;
        int n5 = -219;
        int n6 = 12;
        int n7 = -221;
        int n8 = 21799;
        int n9 = -10;
        int[] nArray = new int[400];
        double[][][] dArray = new double[400][400][400];
        FuzzerUtils.init((Object[][])dArray, (Object)0.103677);
        FuzzerUtils.init(nArray, -9);
        n2 -= (int)((double)(n + n2 - (n + n)) - (14.0 - dArray[(n >>> 1) % 400][(n2 >>> 1) % 400][42] + (double)((long)n3 - instanceCount)));
        Test.vMeth(fFld);
        block11: for (n4 = 8; n4 < 384; ++n4) {
            int n10 = n4 - 1;
            lArrFld1[n10] = lArrFld1[n10] - (long)n;
            switch (102) {
                case 97: {
                    for (n6 = 4; n6 > n4; n6 -= 3) {
                        switch ((n4 >>> 1) % 2 * 5 + 91) {
                            case 92: {
                                n5 ^= (int)l;
                                break;
                            }
                            case 94: {
                                nArray[n6 - 1] = (int)instanceCount;
                            }
                        }
                        n5 -= n7;
                        for (n8 = 1; n8 < 1; ++n8) {
                            l += (long)fFld;
                            int n11 = n6;
                            nArray[n11] = nArray[n11] + n3;
                            n += (int)fFld;
                            n7 = -64;
                        }
                    }
                    continue block11;
                }
                case 98: {
                    fFld += (float)n4;
                    continue block11;
                }
                case 99: {
                    n7 += n4 * n5;
                    continue block11;
                }
                case 100: {
                    n += n4 + n2;
                    continue block11;
                }
                case 101: {
                    n -= n2;
                    continue block11;
                }
            }
        }
        long l2 = (long)(n + n2) + l + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9 + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][])dArray)) + FuzzerUtils.checkSum(nArray);
        iMeth2_check_sum += l2;
        return (int)l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int iMeth(int n, boolean bl) {
        int n2 = 1;
        int n3 = -85;
        int n4 = -11;
        float f = -59.821f;
        n2 = 1;
        block9: while (true) {
            if (++n2 >= 342) {
                long l = n + (bl ? 1 : 0) + n2 + n3 + n4 + Float.floatToIntBits(f);
                iMeth_check_sum += l;
                return (int)l;
            }
            this.iMeth1();
            n = -n;
            n3 = 5;
            while (true) {
                if (n3 <= 1) continue block9;
                n4 = (int)((float)this.iFld + Math.abs(f) - (float)((long)Test.iMeth2(46064, -5, 429719668L) + instanceCount));
                switch ((this.iFld >>> 1) % 3 * 5 + 114) {
                    case 123: {
                        n = (int)((long)n + ((long)n3 | instanceCount));
                        int n5 = n3 + 1;
                        iArrFld[n5] = iArrFld[n5] * 22847;
                        break;
                    }
                    case 127: {
                        f -= 9.0f;
                        break;
                    }
                    case 120: {
                        this.lArrFld2[n2 - 1] = -41L;
                        fFld *= (float)instanceCount;
                        switch (n2 % 3 * 5 + 62) {
                            case 67: {
                                if (bl) break;
                                n &= n3;
                            }
                            case 73: 
                            case 77: {
                                n4 += -14 + n3 * n3;
                                break;
                            }
                        }
                        break;
                    }
                }
                n3 -= 2;
            }
            break;
        }
    }

    public void mainTest(String[] stringArray) {
        int n = -9;
        int n2 = -123;
        int n3 = -1;
        int n4 = 14946;
        int n5 = -21352;
        int n6 = 5;
        int n7 = 27569;
        long l = -64560L;
        long[] lArray = new long[400];
        boolean bl = false;
        int n8 = -124;
        FuzzerUtils.init(lArray, -175514017L);
        for (n = 3; n < 247; ++n) {
            int n9 = (n2 >>> 1) % 400;
            lArray[n9] = lArray[n9] << (int)((long)sFld - Long.reverseBytes(l) + (long)n);
            n2 = -90;
            n2 *= (int)((double)(-(n - n)) - dFld);
            n2 >>= this.iMeth(n2, bl);
            n3 = 1;
            do {
                n2 <<= (int)instanceCount;
                this.iFld += -25;
                fFld += (float)(212 + n3 * n3);
                sFld = (short)n3;
                for (n4 = 1; n4 < 1; n4 += 2) {
                    int n10 = n3 - 1;
                    iArrFld[n10] = iArrFld[n10] >> n4;
                    n5 = (int)((float)n5 + ((float)((long)n4 * instanceCount + (long)n4) - fFld));
                }
                n2 += n;
                for (n6 = 1; n6 < 1; ++n6) {
                    switch (n % 7 * 5 + 17) {
                        case 31: {
                            break;
                        }
                        case 38: {
                            int n11 = n;
                            iArrFld[n11] = iArrFld[n11] - 105;
                            dFld = instanceCount;
                        }
                        case 30: {
                            int n12 = n6 + 1;
                            this.fArrFld[n12] = this.fArrFld[n12] + (float)instanceCount;
                            dFld = 2.321f;
                            n2 = 38767;
                            fFld -= (float)n3;
                            break;
                        }
                        case 51: {
                            int n13 = n6 + 1;
                            this.fArrFld[n13] = this.fArrFld[n13] - 3.84157261E9f;
                            break;
                        }
                        case 33: {
                            this.iFld -= this.iFld;
                            break;
                        }
                        case 44: {
                            this.iFld -= n5;
                            break;
                        }
                        case 45: {
                            n5 <<= n8;
                        }
                        default: {
                            n5 = n2;
                            int n14 = n;
                            this.fArrFld[n14] = this.fArrFld[n14] - -8.0f;
                        }
                    }
                    l >>>= this.iFld;
                }
            } while (++n3 < 103);
        }
        FuzzerUtils.out.println("i i1 l = " + n + "," + n2 + "," + l);
        FuzzerUtils.out.println("b1 i16 i17 = " + (bl ? 1 : 0) + "," + n3 + "," + n4);
        FuzzerUtils.out.println("i18 i19 i20 = " + n5 + "," + n6 + "," + n7);
        FuzzerUtils.out.println("by1 lArr = " + n8 + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + instanceCount + "," + sFld + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("iFld Test.fFld lArrFld = " + this.iFld + "," + Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("Test.lArrFld1 Test.iArrFld lArrFld2 = " + FuzzerUtils.checkSum(lArrFld1) + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(this.lArrFld2));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        FuzzerUtils.init(lArrFld1, -3230703983L);
        FuzzerUtils.init(iArrFld, 175);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        iMeth2_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

