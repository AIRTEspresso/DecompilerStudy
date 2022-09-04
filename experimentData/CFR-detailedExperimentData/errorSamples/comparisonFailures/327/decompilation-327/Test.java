/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 40795L;
    public static int iFld = -116;
    public short sFld = (short)9548;
    public static boolean bFld = true;
    public static byte byFld = (byte)21;
    public double dFld = -2.129898;
    public static long[] lArrFld = new long[400];
    public static int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;

    public static void vMeth2() {
        double d = -53.129656;
        int n = 1;
        int n2 = -52751;
        int n3 = 8;
        int n4 = 1;
        boolean bl = false;
        int n5 = -25433;
        float[] fArray = new float[400];
        long[] lArray = new long[400];
        FuzzerUtils.init(fArray, 1.1015f);
        FuzzerUtils.init(lArray, 2200290079L);
        for (d = 11.0; 246.0 > d; d += 2.0) {
            for (n2 = 1; n2 < 13; ++n2) {
                n = (int)((long)n + ((long)n2 * instanceCount + (long)n3 - (long)n3));
                n3 >>= n;
                n4 = 1;
                do {
                    fArray[n4 - 1] = n;
                    n += 118;
                    instanceCount ^= (long)n4;
                    if (bl) break;
                    n5 = (short)(n5 + (short)n4);
                    n3 >>= n3;
                } while (++n4 < 2);
                if (bl) continue;
                n += n;
                int n6 = (int)d;
                lArray[n6] = lArray[n6] >> -52244;
                n = n2;
            }
        }
        vMeth2_check_sum += Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)(bl ? 1 : 0) + (long)n5 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(lArray);
    }

    public static void vMeth1(int n) {
        int n2 = -10117;
        double d = -12.125172;
        float f = 2.186f;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(byArray, (byte)118);
        Test.vMeth2();
        n2 = 1;
        while (++n2 < 122) {
            int n3 = n2;
            lArrFld[n3] = lArrFld[n3] << n;
            d = -8149.0;
            f += (float)(n *= n2);
            n <<= (int)(instanceCount += (long)d);
            switch (n2 % 2 * 5 + 21) {
                case 23: {
                    n -= n;
                    iFld = 34909;
                    break;
                }
                case 25: {
                    iFld = (int)d;
                    byArray[n2 - 1] = (byte)n;
                }
            }
        }
        Test.iArrFld[(Test.iFld >>> 1) % 400] = iFld;
        iFld >>= 72;
        vMeth1_check_sum += (long)(n + n2) + Double.doubleToLongBits(d) + (long)Float.floatToIntBits(f) + FuzzerUtils.checkSum(byArray);
    }

    public static void vMeth() {
        int n = 71;
        int n2 = -6;
        int[] nArray = new int[400];
        double d = 79.67282;
        double[] dArray = new double[400];
        long l = 6578109779049630165L;
        long[] lArray = new long[400];
        float f = -76.686f;
        short[] sArray = new short[400];
        byte[] byArray = new byte[400];
        FuzzerUtils.init(sArray, (short)15536);
        FuzzerUtils.init(nArray, -223);
        FuzzerUtils.init(lArray, 3494467435L);
        FuzzerUtils.init(byArray, (byte)42);
        FuzzerUtils.init(dArray, 65.64447);
        n >>= sArray[(n >>> 1) % 400];
        d = Long.reverseBytes(instanceCount) * (long)n-- - ((long)nArray[(n >>> 1) % 400] - -instanceCount);
        int n3 = n--;
        int n4 = (n >>> 1) % 400;
        long l2 = lArray[n4] + 1L;
        lArray[n4] = l2;
        l += (long)n3 - l2 + (long)n;
        int n5 = (n >>> 1) % 400;
        byArray[n5] = (byte)(byArray[n5] << (byte)(--n));
        nArray[114] = nArray[114] + 1;
        byArray[(n >>> 1) % 400] = (byte)Math.min(Integer.reverseBytes((int)((double)f - d)), (int)((float)nArray[114] - f * (float)l));
        Test.vMeth1(-13);
        n2 = 1;
        do {
            iFld += n2;
            n = (int)((long)n + ((long)n2 | instanceCount));
            n = n2;
            iFld += n2 * n + n - iFld;
            int n6 = n2 - 1;
            dArray[n6] = dArray[n6] + (double)iFld;
            iFld = n2;
            iFld += n2 * n2 + n - n2;
        } while (++n2 < 263);
        vMeth_check_sum += (long)n + Double.doubleToLongBits(d) + (l += 65495L) + (long)Float.floatToIntBits(f) + (long)n2 + FuzzerUtils.checkSum(sArray) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(byArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray));
    }

    public void mainTest(String[] stringArray) {
        int n = -1;
        int n2 = -58017;
        int n3 = 10;
        int n4 = 12938;
        int n5 = 1950;
        int n6 = -8;
        int n7 = -31547;
        float f = -20.45f;
        Test.vMeth();
        iFld |= iFld;
        n = 1;
        do {
            this.sFld = (short)(this.sFld + (short)((float)n - f));
            block7: for (n2 = 5; n2 < 183; ++n2) {
                switch (n2 % 3 + 115) {
                    case 115: 
                    case 116: {
                        continue block7;
                    }
                    case 117: {
                        try {
                            n5 = n2 % n5;
                            n5 = n4 % 34528;
                            n7 = iFld % n2;
                        }
                        catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                        n7 = (int)instanceCount;
                        Test.iArrFld[n2 - 1] = byFld;
                        instanceCount -= (long)n7;
                        continue block7;
                    }
                    default: {
                        n3 = n2;
                    }
                }
            }
        } while (++n < 137);
        FuzzerUtils.out.println("i8 f2 i9 = " + n + "," + Float.floatToIntBits(f) + "," + n2);
        FuzzerUtils.out.println("i10 i11 i12 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i13 i14 = " + n6 + "," + n7);
        FuzzerUtils.out.println("Test.instanceCount Test.iFld sFld = " + instanceCount + "," + iFld + "," + this.sFld);
        FuzzerUtils.out.println("Test.bFld Test.byFld dFld = " + (bFld ? 1 : 0) + "," + byFld + "," + Double.doubleToLongBits(this.dFld));
        FuzzerUtils.out.println("Test.lArrFld Test.iArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(iArrFld));
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
        FuzzerUtils.init(lArrFld, -5512993925053146759L);
        FuzzerUtils.init(iArrFld, 0);
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
    }
}

