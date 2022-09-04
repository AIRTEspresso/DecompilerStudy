/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 1723977013L;
    public byte byFld = (byte)15;
    public volatile float fFld = -93.335f;
    public static int[] iArrFld = new int[400];
    public boolean[][][] bArrFld = new boolean[400][400][400];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    public static int iMeth(int n) {
        --n;
        long l = n;
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth2() {
        int n = 172;
        vMeth2_check_sum += (long)n;
    }

    public static void vMeth1() {
        int n = 53;
        int n2 = -58396;
        int n3 = -8681;
        int n4 = -8;
        int n5 = 11268;
        int n6 = 21390;
        int n7 = 36;
        boolean bl = false;
        short[] sArray = new short[400];
        FuzzerUtils.init(sArray, (short)7937);
        Test.vMeth2();
        n &= (int)instanceCount;
        for (n2 = 3; n2 < 226; ++n2) {
            n7 = (byte)n3;
            instanceCount += 26L;
            n4 = 1;
            while (!bl) {
                for (n5 = 1; 1 > n5; ++n5) {
                    n += n5 ^ n6;
                    n = (int)instanceCount;
                    n6 += n5;
                    int n8 = n2 + 1;
                    sArray[n8] = (short)(sArray[n8] >>> (short)n);
                    n6 = 225;
                }
                if (++n4 < 7) continue;
            }
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n7 + n4 + (bl ? 1 : 0) + n5 + n6) + FuzzerUtils.checkSum(sArray);
    }

    public static void vMeth(float f) {
        int n = -2;
        int n2 = 5;
        int n3 = 64798;
        int n4 = -1;
        int n5 = -23269;
        n = 1;
        while (++n < 224) {
            Test.vMeth1();
        }
        block10: for (n2 = 173; n2 > 2; n2 -= 3) {
            instanceCount ^= (long)n2;
            switch (119) {
                case 119: {
                    n3 = n2;
                    n3 *= -110;
                    Test.iArrFld[n2] = n2;
                    switch (n2 % 2 + 61) {
                        case 61: {
                            instanceCount = n;
                            try {
                                n3 = n2 % n2;
                                n3 = 37353 % n3;
                                n3 = -10 / n3;
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            n3 = n2;
                            break;
                        }
                        case 62: {
                            n5 = (short)n4;
                            instanceCount <<= n3;
                            n4 -= n;
                        }
                    }
                    continue block10;
                }
                default: {
                    n4 -= 24524;
                }
            }
        }
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3 + n5 + n4);
    }

    public void mainTest(String[] stringArray) {
        int n = -138;
        int n2 = 186;
        int n3 = 6;
        int n4 = -12281;
        double d = 0.124347;
        double[] dArray = new double[400];
        long[][] lArray = new long[400][400];
        FuzzerUtils.init(lArray, 1447614521L);
        FuzzerUtils.init(dArray, 45.35738);
        ++n;
        n = (int)((long)n * ((long)(12 + Test.iMeth(-56875)) * instanceCount));
        this.byFld = (byte)(this.byFld - 1);
        Test.vMeth(this.fFld);
        lArray[((n <<= -21451 + this.byFld) >>> 1) % 400] = lArray[(n >>> 1) % 400];
        n2 = 1;
        do {
            dArray[n2 + 1] = -126.10907;
            for (n3 = 101; n3 > 6; n3 -= 2) {
                this.bArrFld[n3 - 1][n3 - 1] = this.bArrFld[n3 + 1][n3 - 1];
                n = 43276;
                this.byFld = (byte)(this.byFld + (byte)n3);
            }
            n = (int)((long)n + ((long)n2 ^ instanceCount));
        } while (++n2 < 248);
        FuzzerUtils.out.println("i d i13 = " + n + "," + Double.doubleToLongBits(d) + "," + n2);
        FuzzerUtils.out.println("i14 i15 lArr = " + n3 + "," + n4 + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray)));
        FuzzerUtils.out.println("Test.instanceCount byFld fFld = " + instanceCount + "," + this.byFld + "," + Float.floatToIntBits(this.fFld));
        FuzzerUtils.out.println("Test.iArrFld bArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum((Object[][])this.bArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
        FuzzerUtils.init(iArrFld, 33391);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}

