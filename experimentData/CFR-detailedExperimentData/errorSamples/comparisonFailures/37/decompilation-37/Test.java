/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -1107322595L;
    public static int iFld1 = 221;
    public static double dFld = 1.7509;
    public static byte byFld = (byte)-111;
    public static float fFld = 63.531f;
    public int iFld2 = 10;
    public static int[] iArrFld = new int[400];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long sMeth_check_sum;
    public static long iMeth1_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth(int n, int n2) {
        float f = -2.295f;
        int n3 = 0;
        iFld1 -= (int)((long)iFld1 * instanceCount++ * ((long)((float)n2 - f) ^ 0xFFFFFFFFFFFFFFFFL));
        n3 = (byte)(n3 - 84);
        vMeth_check_sum += (long)(n + n2 + Float.floatToIntBits(f) + n3);
    }

    public static int iMeth(long l) {
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 39L);
        int n = -(iFld1 + iFld1);
        int n2 = (iFld1 >>> 1) % 400;
        long l2 = lArray[n2] ^ 0xFFFFFFFFFFFFFFF3L;
        lArray[n2] = l2;
        Test.vMeth(n - iFld1--, (int)(l2 - (l + (long)iFld1) - (long)(++iFld1)));
        long l3 = l + FuzzerUtils.checkSum(lArray);
        iMeth_check_sum += l3;
        return (int)l3;
    }

    public static void vMeth1(int n, int n2) {
        dFld = iFld1;
        instanceCount = n2;
        n = -32870;
        vMeth1_check_sum += (long)(n + n2);
    }

    public static int iMeth1(long l, int n, int n2) {
        boolean bl = true;
        boolean[] blArray = new boolean[400];
        int n3 = 24;
        int n4 = -155;
        FuzzerUtils.init(blArray, false);
        Test.vMeth1(n, iFld1);
        blArray[(n2 >>> 1) % 400] = bl;
        fFld = n2;
        fFld -= fFld;
        for (n3 = 18; n3 < 337; ++n3) {
            n2 -= n;
            if (n == 0) continue;
        }
        byFld = (byte)n;
        long l2 = l + (long)n + (long)n2 + (long)(bl ? 1 : 0) + (long)n3 + (long)(n4 *= (int)fFld) + FuzzerUtils.checkSum(blArray);
        iMeth1_check_sum += l2;
        return (int)l2;
    }

    public static short sMeth(boolean bl, int n) {
        int n2 = -117;
        int n3 = 13;
        int n4 = -26357;
        int n5 = 15;
        int n6 = -24286;
        short[] sArray = new short[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -61985L);
        FuzzerUtils.init(sArray, (short)30045);
        byFld = (byte)(byFld + 1);
        dFld -= (double)(++instanceCount + (long)byFld);
        if (bl) {
            n = Test.iMeth1(instanceCount, 7, -12);
            for (n2 = 8; n2 < 224; ++n2) {
                n = -2;
                if (!bl) continue;
                int n7 = n2 + 1;
                lArray[n7] = lArray[n7] + 14L;
                switch (n2 % 1 + 26) {
                    default: 
                }
                n4 = 1;
                while (++n4 < 7) {
                    instanceCount -= (long)n2;
                    n += n4 - iFld1;
                    n += n6;
                    fFld = n4;
                    int n8 = n2;
                    lArray[n8] = lArray[n8] - (long)n5;
                    int n9 = n4;
                    sArray[n9] = (short)(sArray[n9] - (short)fFld);
                }
            }
        } else {
            lArray[376] = lArray[376] + (long)n2;
        }
        long l = (long)((bl ? 1 : 0) + n + n2 + n3 + n4 + n6 + n5) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(sArray);
        sMeth_check_sum += l;
        return (short)l;
    }

    public void mainTest(String[] stringArray) {
        long l = 59078L;
        long[] lArray = new long[400];
        int n = -35;
        int n2 = -20392;
        int n3 = 7;
        int n4 = 5;
        int n5 = -248;
        int n6 = -41679;
        int n7 = 9;
        int n8 = -57771;
        int n9 = 14435;
        int n10 = 17275;
        boolean bl = true;
        float[] fArray = new float[400];
        double[] dArray = new double[400];
        byte[] byArray = new byte[400];
        FuzzerUtils.init(fArray, -2.167f);
        FuzzerUtils.init(lArray, -155L);
        FuzzerUtils.init(dArray, -2.33952);
        FuzzerUtils.init(byArray, (byte)82);
        int n11 = iFld1;
        float f = fArray[(iFld1 >>> 1) % 400];
        --iFld1;
        iFld1 = n11 - (int)((double)(f / (float)(iFld1 | 1)) * ((double)instanceCount + 0.48934 + (double)iFld1));
        int n12 = (iFld1 >>> 1) % 400;
        long l2 = lArray[n12] + 1L;
        lArray[n12] = l2;
        double d = dFld;
        dFld = d + 1.0;
        iFld1 = (iFld1 *= (int)(((long)Test.iMeth(instanceCount) + l2) * (long)Test.iMeth(l))) / (int)((long)d | 1L);
        Test.vMeth(iFld1, --iFld1);
        for (n = 13; 224 > n; ++n) {
            for (n3 = 5; 119 > n3; ++n3) {
                for (n5 = n; n5 < 2; ++n5) {
                    Test.vMeth((int)((long)n10 - l), iArrFld[n5 - 1]);
                    instanceCount = Test.sMeth(bl, n6) - n6 + n3;
                    iFld1 >>>= n2;
                    int n13 = n3 - 1;
                    dArray[n13] = dArray[n13] - (double)n4;
                }
                byFld = (byte)(byFld - (byte)fFld);
                n6 += n3;
                int n14 = n;
                byArray[n14] = (byte)(byArray[n14] * (byte)n5);
                n4 >>= n3;
            }
            if (bl) {
                instanceCount += (long)(n | n4);
                fFld -= (float)n2;
                dFld -= (double)n2;
            } else {
                for (n7 = 7; n7 < 119; ++n7) {
                    n2 -= (int)l;
                    l = instanceCount;
                    int n15 = n7 + 1;
                    iArrFld[n15] = iArrFld[n15] << n;
                }
                n2 = (int)((long)n2 + ((long)(n * n2) + l - (long)iFld1));
                n8 = n3;
            }
            n9 = 1;
            do {
                n10 = (short)(n10 + (short)(n9 - byFld));
                l -= (long)this.iFld2;
                instanceCount = (long)((float)instanceCount + ((float)((long)n9 * instanceCount + instanceCount) - fFld));
            } while (++n9 < 119);
            fFld += (float)n;
        }
        FuzzerUtils.out.println("l1 i5 i6 = " + l + "," + n + "," + n2);
        FuzzerUtils.out.println("i7 i8 i9 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i10 s1 b2 = " + n6 + "," + n10 + "," + (bl ? 1 : 0));
        FuzzerUtils.out.println("i22 i23 i24 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("fArr lArr1 dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + "," + FuzzerUtils.checkSum(lArray) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray)));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArray));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld1 Test.dFld = " + instanceCount + "," + iFld1 + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.byFld Test.fFld iFld2 = " + byFld + "," + Float.floatToIntBits(fFld) + "," + this.iFld2);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -8723);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        sMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

