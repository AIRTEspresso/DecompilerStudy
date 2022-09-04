/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 3125503453L;
    public static float fFld = 1.855f;
    public int iFld = -250;
    public boolean bFld = false;
    public static byte byFld = (byte)-50;
    public static long[] lArrFld = new long[400];
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long iMeth1_check_sum;

    public static int iMeth1(long l) {
        int n = 4357;
        int n2 = -141;
        int n3 = 8;
        int n4 = -13635;
        int n5 = 14184;
        int[] nArray = new int[400];
        float f = -127.506f;
        FuzzerUtils.init(nArray, 14);
        for (n = 13; n < 298; ++n) {
            n2 = (int)l;
            instanceCount = n2;
            for (n3 = 6; 1 < n3; n3 -= 3) {
                n4 = 50295;
            }
            instanceCount += (long)(n * n3 + n) - l;
            try {
                n2 = 209 % n3;
                nArray[n + 1] = n3 % -151972265;
                n2 = 194 / n;
            }
            catch (ArithmeticException arithmeticException) {
                // empty catch block
            }
            n4 += n;
            n5 = 1;
            do {
                switch ((n2 >>> 1) % 3 + 24) {
                    case 24: {
                        n2 = n4;
                        n2 += n5 | n5;
                        break;
                    }
                    case 25: {
                        n4 += n5;
                        break;
                    }
                    case 26: {
                        f *= -12.0f;
                    }
                }
            } while (++n5 < 6);
        }
        long l2 = l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)Float.floatToIntBits(f) + FuzzerUtils.checkSum(nArray);
        iMeth1_check_sum += l2;
        return (int)l2;
    }

    public static int iMeth() {
        int n = -7;
        int n2 = 0;
        int n3 = -13;
        int n4 = 14;
        int n5 = 76;
        int n6 = -51569;
        double d = -4.90408;
        int n7 = -5;
        boolean bl = false;
        boolean[] blArray = new boolean[400];
        FuzzerUtils.init(blArray, true);
        n = (int)(((float)((long)n + 2739312917L) + fFld * fFld) * (float)Test.iMeth1(instanceCount));
        for (n2 = 17; n2 < 320; ++n2) {
            for (d = 5.0; d > 1.0; d -= 1.0) {
                fFld = n2;
                n4 &= 0x55F5B97A;
                instanceCount = 4L;
                fFld += (float)(d - (double)n7);
                n = n2;
                instanceCount = 115L;
            }
            for (n5 = 1; n5 < 5; ++n5) {
                blArray[n2 + 1] = bl;
            }
        }
        n7 = 119;
        n4 = n6;
        n3 = -397004895;
        long l = (long)(n + n2 + n3) + Double.doubleToLongBits(d) + (long)n4 + (long)n7 + (long)n5 + (long)n6 + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(blArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth() {
        int n = -10;
        int n2 = 173;
        int n3 = 1;
        int n4 = 58;
        int n5 = 5;
        int n6 = -14;
        boolean bl = false;
        int n7 = -29;
        for (n = 149; n > 7; n -= 2) {
            int n8 = n;
            iArrFld[n8] = iArrFld[n8] + (int)instanceCount;
            n3 -= (n2 <<= Test.iMeth() + n3);
            n2 = (int)((float)n2 + ((float)n * fFld + (float)n2 - (float)instanceCount));
            Test.iArrFld[n - 1] = n;
            for (n4 = 1; 22 > n4; ++n4) {
                n2 -= n2;
                n6 = 1;
                while (++n6 < 2) {
                    int n9 = n - 1;
                    lArrFld[n9] = lArrFld[n9] - (long)n;
                    instanceCount += (long)n3;
                    if (n4 != 0) {
                        vMeth_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + (bl ? 1 : 0) + n7);
                        return;
                    }
                    n7 = (byte)n6;
                    n5 >>= -1597847310;
                }
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + (bl ? 1 : 0) + n7);
    }

    public void mainTest(String[] stringArray) {
        int n = 30977;
        int n2 = -14;
        int n3 = -44215;
        int n4 = 0;
        int n5 = -111;
        int n6 = -11;
        int n7 = 47;
        int n8 = 61530;
        double d = 116.12225;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, -1.154f);
        Test.vMeth();
        Test.iArrFld[(this.iFld >>> 1) % 400] = n;
        this.iFld *= n;
        int n9 = (this.iFld >>> 1) % 400;
        fArray[n9] = fArray[n9] * (float)instanceCount;
        for (n2 = 379; n2 > 2; n2 -= 3) {
            n3 = (int)((long)n3 + ((long)n2 * instanceCount + instanceCount - (long)n3));
            switch ((n3 >>> 1) % 1 * 5 + 25) {
                case 29: {
                    n3 = -87;
                    this.iFld += n2 | n2;
                    break;
                }
                default: {
                    int n10 = n2 + 1;
                    iArrFld[n10] = iArrFld[n10] + (int)fFld;
                    this.iFld -= (int)instanceCount;
                }
            }
            this.iFld = (int)((long)this.iFld + ((long)n2 * instanceCount + instanceCount - (long)n3));
            n = (short)n2;
            instanceCount = (long)fFld;
            fFld -= (float)this.iFld;
        }
        for (int n11 : iArrFld) {
            n4 = 1;
            while (++n4 < 63) {
                if (this.bFld) {
                    for (n5 = 1; n5 < 1; ++n5) {
                    }
                    int n12 = n4 + 1;
                    iArrFld[n12] = iArrFld[n12] * n2;
                }
                this.bFld = this.bFld;
                this.iFld += 28758 + n4 * n4;
                instanceCount += (long)n4;
                byFld = (byte)(byFld + (byte)n3);
                this.iFld += n4;
                instanceCount = n2;
            }
            for (n7 = 63; n7 > 2; --n7) {
                d = -1013.0;
                n3 -= this.iFld;
            }
        }
        FuzzerUtils.out.println("s i17 i18 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i20 i21 i22 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i23 i24 d1 = " + n7 + "," + n8 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld iFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + this.iFld);
        FuzzerUtils.out.println("bFld Test.byFld Test.lArrFld = " + (this.bFld ? 1 : 0) + "," + byFld + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
        FuzzerUtils.init(lArrFld, 3104454649035639001L);
        FuzzerUtils.init(iArrFld, -180);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
    }
}

