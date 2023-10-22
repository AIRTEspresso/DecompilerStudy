/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 3093829568423456391L;
    public static int iFld = 46934;
    public short sFld = (short)-13791;
    public static boolean[] bArrFld = new boolean[400];
    public static int[][] iArrFld = new int[400][400];
    public static long[][] lArrFld = new long[400][400];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(int n, int n2) {
        int n3 = -23773;
        int n4 = -105;
        int n5 = 24966;
        int n6 = -157;
        int n7 = 114;
        int n8 = 0;
        int[] nArray = new int[400];
        float f = 0.39f;
        short[] sArray = new short[400];
        FuzzerUtils.init(sArray, (short)15202);
        FuzzerUtils.init(nArray, -1);
        instanceCount = n2 *= -57;
        for (n3 = 8; n3 < 285; ++n3) {
            boolean bl = true;
            instanceCount |= (long)n8;
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + Float.floatToIntBits(f) + n7 + n8) + FuzzerUtils.checkSum(sArray) + FuzzerUtils.checkSum(nArray);
    }

    public static void vMeth(float f, long l) {
        double d = 0.129769;
        int n = 9013;
        int n2 = -186;
        int n3 = 154;
        int n4 = -19;
        int n5 = 40333;
        d = Math.abs(instanceCount);
        n = 1;
        do {
            for (n2 = 11; n2 > n; --n2) {
                Test.vMeth1(n2, n3 *= n);
                for (n4 = 1; n4 < 1; ++n4) {
                    instanceCount += l;
                    f = n;
                    instanceCount *= (long)f;
                    d += -3.0;
                    n3 &= (int)l;
                    n3 = (int)((float)n3 + ((float)(n4 * n2) + f - (float)n));
                    int[] nArray = iArrFld[n2 - 1];
                    int n6 = n2;
                    nArray[n6] = nArray[n6] | n3;
                    n5 *= n3;
                }
                int[] nArray = iArrFld[n];
                int n7 = n;
                nArray[n7] = nArray[n7] - n5;
            }
        } while (++n < 142);
        vMeth_check_sum += (long)Float.floatToIntBits(f) + l + Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5;
    }

    public static void vSmallMeth(boolean bl, int n, int n2) {
        float f = 0.223f;
        Test.vMeth(f, instanceCount);
        vSmallMeth_check_sum += (long)((bl ? 1 : 0) + (n |= (int)instanceCount) + n2 + Float.floatToIntBits(f));
    }

    public void mainTest(String[] stringArray) {
        boolean bl = true;
        int n = 12;
        int n2 = 48187;
        int n3 = -106;
        int n4 = 10189;
        int n5 = -163;
        int n6 = -13;
        int n7 = -200;
        int n8 = -3;
        int n9 = -228;
        int n10 = -37;
        long l = -8L;
        double d = 0.18313;
        double d2 = -123.120479;
        float f = 38.898f;
        for (int i = 0; i < 127; ++i) {
            Test.vSmallMeth(bl, iFld, 27417);
        }
        for (n = 14; n < 358; ++n) {
            instanceCount -= (long)n10;
            for (n3 = 4; n3 < 73; ++n3) {
                l = iFld;
                int[] nArray = iArrFld[n3];
                int n11 = (n4 >>> 1) % 400;
                nArray[n11] = nArray[n11] - n3;
                n4 += 721003680;
                n10 = (byte)(n10 - (byte)n2);
                iFld = (int)l;
                int[] nArray2 = iArrFld[n3 - 1];
                int n12 = n + 1;
                nArray2[n12] = nArray2[n12] & n2;
            }
            for (n5 = n; n5 < 73; ++n5) {
                this.sFld = (short)n10;
                instanceCount += (long)n5;
                for (n7 = 1; n7 < 1; ++n7) {
                    instanceCount = n7;
                    long[] lArray = lArrFld[n5 - 1];
                    int n13 = n5;
                    lArray[n13] = lArray[n13] | (long)n6;
                    iFld = this.sFld;
                    Test.lArrFld[n - 1][n5] = n3;
                    instanceCount += (long)(4 + n7 * n7);
                    n6 *= n5;
                }
                n6 = (int)((long)n6 + ((long)n5 | l));
                instanceCount -= -22739L;
                n6 *= n2;
                d = f;
                for (d2 = 1.0; d2 < 1.0; d2 += 1.0) {
                    n4 += (int)(d2 * d2);
                    long[] lArray = lArrFld[(int)d2];
                    int n14 = (int)(d2 - 1.0);
                    lArray[n14] = lArray[n14] - l;
                    if (bl) {
                        int[] nArray = iArrFld[(int)(d2 + 1.0)];
                        int n15 = n;
                        nArray[n15] = nArray[n15] * this.sFld;
                        f += (float)n2;
                        continue;
                    }
                    n2 = n6;
                }
            }
        }
        FuzzerUtils.out.println("b2 i15 i16 = " + (bl ? 1 : 0) + "," + n + "," + n2);
        FuzzerUtils.out.println("by i17 i18 = " + n10 + "," + n3 + "," + n4);
        FuzzerUtils.out.println("l1 i19 i20 = " + l + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i21 i22 d1 = " + n7 + "," + n8 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("f3 d2 i23 = " + Float.floatToIntBits(f) + "," + Double.doubleToLongBits(d2) + "," + n9);
        FuzzerUtils.out.println("Test.instanceCount Test.iFld sFld = " + instanceCount + "," + iFld + "," + this.sFld);
        FuzzerUtils.out.println("Test.bArrFld Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(bArrFld) + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
        FuzzerUtils.init(bArrFld, false);
        FuzzerUtils.init(iArrFld, 102);
        FuzzerUtils.init(lArrFld, -4087854843876614839L);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

