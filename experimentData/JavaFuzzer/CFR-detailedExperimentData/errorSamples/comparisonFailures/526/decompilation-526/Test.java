/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 10205L;
    public static float fFld = -14.577f;
    public short sFld = (short)-16976;
    public byte byFld = (byte)-52;
    public int[] iArrFld = new int[400];
    public static boolean[] bArrFld = new boolean[400];
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth() {
        long l = 9L;
        int n = -53218;
        int n2 = -43990;
        int n3 = -49450;
        int[] nArray = new int[400];
        double d = -1.26682;
        int n4 = 30694;
        FuzzerUtils.init(nArray, -10737);
        l = 1L;
        while (++l < 334L) {
            for (n = 1; n < 5; ++n) {
                switch (33) {
                    case 33: {
                        instanceCount >>= n;
                        break;
                    }
                    case 34: {
                        if (n != 0) {
                            vMeth_check_sum += l + (long)n + (long)n2 + Double.doubleToLongBits(d) + (long)n3 + (long)n4 + FuzzerUtils.checkSum(nArray);
                            return;
                        }
                    }
                    default: {
                        try {
                            n2 = 1181301283 % n2;
                            n2 = n % 68;
                            n2 = 28311 / n2;
                            break;
                        }
                        catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                    }
                }
                n2 += 13;
                n2 -= n2;
                for (d = 1.0; d < 2.0; d += 1.0) {
                    int n5 = (int)(l - 1L);
                    nArray[n5] = nArray[n5] << n4;
                    n2 += (int)((long)d ^ (long)n2);
                    n3 += (int)d;
                    n2 += (int)(d * (double)l + (double)n4 - (double)n);
                    n2 += (int)(d * (double)n + (double)n2 - (double)n2);
                    n2 -= n;
                }
            }
        }
        vMeth_check_sum += l + (long)n + (long)n2 + Double.doubleToLongBits(d) + (long)n3 + (long)n4 + FuzzerUtils.checkSum(nArray);
    }

    public static int iMeth1(int n, int n2) {
        boolean bl = true;
        int n3 = -226;
        int n4 = -6;
        int n5 = -6;
        int n6 = -28249;
        int n7 = 14;
        int[] nArray = new int[400];
        double d = -26.72589;
        int n8 = -23582;
        FuzzerUtils.init(nArray, -2);
        bl = bArrFld[(n2 >>> 1) % 400];
        int n9 = n2++;
        Test.vMeth();
        int n10 = (n >>> 1) % 400;
        nArray[n10] = nArray[n10] + (int)(instanceCount += (long)(-17158.0f * (fFld - (float)n) + (float)n9));
        n3 = 237;
        do {
            n2 = (int)d;
            n -= n8;
            int n11 = n3--;
            nArray[n11] = nArray[n11] | 0xFFFFFF07;
        } while (n3 > 0);
        for (n4 = 257; n4 > 4; --n4) {
            d += (double)n4;
            n6 = 1;
            while (++n6 < 6) {
                if (n5 != 0) {
                    // empty if block
                }
                int n12 = n4 - 1;
                nArray[n12] = nArray[n12] ^ 0xA;
                n7 *= (int)instanceCount;
                Test.bArrFld[n4 - 1] = bl;
            }
        }
        long l = (long)(n + n2 + (bl ? 1 : 0) + n3) + Double.doubleToLongBits(d) + (long)n8 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + FuzzerUtils.checkSum(nArray);
        iMeth1_check_sum += l;
        return (int)l;
    }

    public static int iMeth(short s) {
        int n = 31;
        int n2 = 154;
        int n3 = 22208;
        int n4 = -14;
        int n5 = 0;
        int n6 = -28116;
        int[] nArray = new int[400];
        FuzzerUtils.init(nArray, 118);
        for (n = 3; n < 241; n += 2) {
            int n7 = -14;
            n2 |= n7;
            n2 = n7++ + (n2 - n2 - Test.iMeth1(n, -20685));
            for (n3 = 1; n3 < 13; ++n3) {
                for (n5 = 1; n5 < 2; ++n5) {
                    n4 = n5;
                    instanceCount = n2 += 62291 + n5 * n5;
                    s = (short)(s * (short)n);
                    n4 += n5;
                    instanceCount <<= (int)instanceCount;
                    n2 += (int)instanceCount;
                    n7 += 47773;
                    nArray[n3 - 1] = -99;
                }
                fFld -= (float)n6;
            }
        }
        long l = (long)(s + n + n2 + n3 + n4 + n5 + n6) + FuzzerUtils.checkSum(nArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        int n = -229;
        int n2 = -26146;
        int n3 = 46;
        int n4 = -160;
        int n5 = -57288;
        int n6 = 13;
        int n7 = 1;
        int n8 = 7;
        int n9 = 42074;
        int n10 = 0;
        int n11 = 190;
        int n12 = -12;
        double d = 2.80172;
        boolean bl = false;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(byArray, (byte)45);
        instanceCount = n;
        for (n2 = 238; n2 > 3; --n2) {
            for (n4 = 107; n4 > 4; --n4) {
                n5 = (int)(instanceCount -= (long)(this.iArrFld[n2] * Test.iMeth(this.sFld)));
                instanceCount = n4;
            }
            this.byFld = (byte)instanceCount;
            instanceCount -= (long)n4;
            for (n6 = 2; n6 < 107; ++n6) {
                n3 += n6 * n7 + n3 - n4;
                for (n8 = n6; n8 < 2; ++n8) {
                    n5 >>>= (n3 += (int)fFld);
                    n5 *= (int)d;
                    n += 30 + n8 * n8;
                    int n13 = n2 + 1;
                    byArray[n13] = (byte)(byArray[n13] >> (byte)instanceCount);
                    d += (double)n9;
                }
            }
            for (n10 = 2; n10 < 107; ++n10) {
                int n14 = n10 + 1;
                this.iArrFld[n14] = this.iArrFld[n14] + (int)fFld;
                instanceCount += (long)n3;
                switch (n10 % 2 + 125) {
                    case 125: {
                        n12 = 1;
                        do {
                            this.iArrFld[n12] = n5;
                            n11 += 19805;
                            n += 64306;
                            switch (n12 % 2 * 5 + 50) {
                                case 52: {
                                    n9 = n2;
                                    if (bl) {
                                        // empty if block
                                    }
                                    fFld = n9;
                                    n5 += n5;
                                    break;
                                }
                                default: {
                                    instanceCount += (long)(n12 * n12);
                                }
                            }
                        } while (++n12 < 2);
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i1 i2 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i3 i4 i22 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i23 i24 i25 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("d2 i26 i27 = " + Double.doubleToLongBits(d) + "," + n10 + "," + n11);
        FuzzerUtils.out.println("i28 b1 byArr = " + n12 + "," + (bl ? 1 : 0) + "," + FuzzerUtils.checkSum(byArray));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld sFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + this.sFld);
        FuzzerUtils.out.println("byFld iArrFld Test.bArrFld = " + this.byFld + "," + FuzzerUtils.checkSum(this.iArrFld) + "," + FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
        FuzzerUtils.init(bArrFld, true);
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

