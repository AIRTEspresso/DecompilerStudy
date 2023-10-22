/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 3594617949L;
    public int iFld = -3;
    public float fFld = 0.124f;
    public static volatile short sFld = (short)9772;
    public boolean bFld = false;
    public static volatile byte byFld = (byte)-22;
    public static double[] dArrFld = new double[400];
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long iMeth_check_sum;

    public int iMeth(int n) {
        int n2 = 7927;
        int n3 = -193;
        int n4 = -119;
        int n5 = -12;
        int n6 = -9715;
        int n7 = 241;
        float f = -111.65f;
        int n8 = 108;
        long l = -14L;
        ++n;
        for (n2 = 19; n2 < 398; ++n2) {
            for (n4 = 1; n4 < 4; n4 += 2) {
                this.iFld = (int)instanceCount;
                for (n6 = 1; n6 < 4; ++n6) {
                    Test.dArrFld[n6] = f;
                    instanceCount *= instanceCount;
                }
                instanceCount -= instanceCount;
                n8 = (byte)instanceCount;
                l -= (long)n6;
                n3 = n4;
                n3 *= 21168;
                l += (long)(-26549 + n4 * n4);
            }
        }
        n7 = (int)f;
        long l2 = (long)(n + n2 + n3 + n4 + n5 + n6 + n7 + Float.floatToIntBits(f) + n8) + l;
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public void vMeth1(float f, int n) {
        double d = -2.65346;
        int n2 = -144;
        int n3 = -174;
        int n4 = 73;
        int n5 = 4;
        int n6 = 5;
        int n7 = 9;
        long l = 112483535L;
        long[] lArray = new long[400];
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, -68.326f);
        FuzzerUtils.init(lArray, 1591523943L);
        fArray[(this.iFld >>> 1) % 400] = (float)d;
        for (n2 = 9; n2 < 148; ++n2) {
            long[] lArray2 = lArray;
            lArray = lArray2;
            lArray = lArray2;
            lArray = lArray2;
        }
        for (n4 = 15; n4 < 257; ++n4) {
            n6 = 1;
            do {
                for (l = 1L; l < 1L; ++l) {
                    n += (int)(l - (long)this.iFld);
                    this.iFld += this.iMeth(n2);
                    Test.dArrFld[n4 + 1] = l;
                    n += (int)(l - (long)n7);
                    int n8 = (int)l;
                    lArray[n8] = lArray[n8] + (long)n4;
                    n5 = (int)f;
                    n3 >>>= (n7 += (int)instanceCount);
                    n7 = (int)((long)n7 + (2162L + l * l));
                }
            } while (++n6 < 7);
        }
        vMeth1_check_sum += (long)(Float.floatToIntBits(f) + n) + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + l + (long)n7 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray);
    }

    public void vMeth(double d, long l, double d2) {
        int n = 4;
        int n2 = -13;
        int n3 = 58;
        int n4 = -226;
        int n5 = 94;
        int n6 = 5457;
        int[] nArray = new int[400];
        int n7 = 98;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 2918919998L);
        FuzzerUtils.init(nArray, 7);
        n = 139;
        while (--n > 0) {
            this.iFld = (int)((long)n + lArray[n]);
            this.iFld += this.iFld;
            this.vMeth1(this.fFld, n);
            this.iFld += n ^ n7;
            this.iFld >>>= n;
            this.iFld <<= sFld;
        }
        for (n2 = 2; n2 < 348; ++n2) {
            for (n4 = 1; n4 < 5; ++n4) {
                this.iFld += (int)instanceCount;
                n5 >>= this.iFld;
                n6 = 1;
                while (++n6 < 2) {
                    this.bFld = true;
                    try {
                        n3 = nArray[n6 - 1] % 254;
                        this.iFld = n2 % nArray[n6 - 1];
                        nArray[n2] = n6 % n5;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    d *= (double)sFld;
                    n5 = (int)l;
                }
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + l + Double.doubleToLongBits(d2) + (long)n + (long)n7 + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
    }

    public void mainTest(String[] stringArray) {
        double d = -1.115433;
        int n = -231;
        int n2 = -239;
        int n3 = 74;
        int n4 = 79;
        int n5 = -72;
        int n6 = -41365;
        int n7 = 11;
        int[][] nArray = new int[400][400];
        int[] nArray2 = new int[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, -193);
        FuzzerUtils.init(lArray, 2527083260L);
        FuzzerUtils.init(nArray2, 5);
        this.vMeth(d, instanceCount, d);
        d = this.iFld;
        this.iFld *= 142;
        int[] nArray3 = nArray[(this.iFld >>> 1) % 400];
        int n8 = (this.iFld >>> 1) % 400;
        nArray3[n8] = nArray3[n8] - -2;
        int n9 = (this.iFld >>> 1) % 400;
        lArray[n9] = lArray[n9] >>> (int)instanceCount;
        for (int n10 : nArray2) {
            sFld = (short)this.iFld;
            n10 = (int)instanceCount;
            nArray2[(this.iFld >>> 1) % 400] = this.iFld = (int)instanceCount;
            int n11 = (n10 >>> 1) % 400;
            iArrFld[n11] = iArrFld[n11] * (int)instanceCount;
            n = 1;
            do {
                n10 <<= n10;
                n10 -= this.iFld;
                nArray[n - 1][n - 1] = n;
                this.fFld -= (float)instanceCount;
                this.bFld = this.bFld;
                this.iFld -= (int)d;
            } while (++n < 63);
            for (n2 = 63; n2 > 1; n2 -= 2) {
                for (n4 = n2; n4 < 3; ++n4) {
                    n10 += n4;
                }
                instanceCount += (long)sFld;
                if (this.bFld) break;
            }
            nArray[(n3 >>> 1) % 400][0] = n;
            if (this.bFld) {
                for (n6 = 3; n6 < 63; ++n6) {
                    n5 >>= n5;
                    this.fFld = byFld;
                    instanceCount += (long)n;
                }
                continue;
            }
            if (this.bFld) {
                n5 /= 88;
                continue;
            }
            n7 >>= (int)instanceCount;
        }
        FuzzerUtils.out.println("d3 i21 i22 = " + Double.doubleToLongBits(d) + "," + n + "," + n2);
        FuzzerUtils.out.println("i23 i24 i25 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i26 i27 iArr1 = " + n6 + "," + n7 + "," + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("lArr2 iArr2 = " + FuzzerUtils.checkSum(lArray) + "," + FuzzerUtils.checkSum(nArray2));
        FuzzerUtils.out.println("Test.instanceCount iFld fFld = " + instanceCount + "," + this.iFld + "," + Float.floatToIntBits(this.fFld));
        FuzzerUtils.out.println("Test.sFld bFld Test.byFld = " + sFld + "," + (this.bFld ? 1 : 0) + "," + byFld);
        FuzzerUtils.out.println("Test.dArrFld Test.iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
        FuzzerUtils.init(dArrFld, 0.98955);
        FuzzerUtils.init(iArrFld, 13);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}

