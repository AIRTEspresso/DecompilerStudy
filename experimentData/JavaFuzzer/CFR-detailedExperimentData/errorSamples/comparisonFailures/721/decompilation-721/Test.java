/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = 3L;
    public static volatile int iFld = -4;
    public static float fFld = -108.28f;
    public static long lFld = -8873L;
    public static double[][] dArrFld = new double[400][400];
    public static int[] iArrFld = new int[400];
    public static long iMeth_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(long l, int n) {
        float f = -115.847f;
        int n2 = -62272;
        int n3 = 60116;
        int n4 = -212;
        int n5 = 55906;
        int n6 = -177;
        int[] nArray = new int[400];
        int n7 = 20319;
        boolean bl = false;
        FuzzerUtils.init(nArray, -3);
        iFld += (int)f;
        for (n2 = 15; n2 < 382; ++n2) {
            block5: for (n4 = 5; 1 < n4; --n4) {
                n = (int)((float)n + ((float)(n4 * n2) + f - (float)(iFld *= (int)instanceCount)));
                n5 *= n;
                if (bl) continue;
                switch (n2 % 2 + 124) {
                    case 124: {
                        n7 = (short)(n7 - (short)l);
                        n6 = 1;
                        while (++n6 < 2) {
                            nArray[n4] = (int)l;
                            l = 9L;
                            n3 -= n2;
                        }
                        continue block5;
                    }
                    case 125: {
                        f += (float)n4;
                    }
                }
            }
        }
        vMeth_check_sum += l + (long)n + (long)Float.floatToIntBits(f) + (long)n2 + (long)n3 + (long)n7 + (long)n4 + (long)n5 + (long)(bl ? 1 : 0) + (long)n6 + FuzzerUtils.checkSum(nArray);
    }

    public static long lMeth(float f) {
        int n = -22037;
        int n2 = -12;
        int n3 = 251;
        int n4 = 163;
        int n5 = -59140;
        int n6 = -22035;
        int[] nArray = new int[400];
        int[][] nArray2 = new int[400][400];
        boolean bl = true;
        int n7 = -47;
        long[] lArray = new long[400];
        FuzzerUtils.init(nArray, 5185);
        FuzzerUtils.init(lArray, -9083848344221977855L);
        FuzzerUtils.init(nArray2, 18876);
        int[] nArray3 = FuzzerUtils.int1array(400, -188);
        nArray = nArray3;
        nArray = nArray3;
        nArray = nArray3;
        nArray = nArray3;
        for (n = 11; 193 > n; ++n) {
            int n8 = n;
            lArray[n8] = lArray[n8] << ++n2;
            for (n3 = 1; n3 < 9; ++n3) {
                Test.vMeth(instanceCount, n4);
                int[] nArray4 = nArray2[n + 1];
                int n9 = n3;
                nArray4[n9] = nArray4[n9] | 0xFFFF9749;
                int n10 = n;
                lArray[n10] = lArray[n10] - (long)n2;
                nArray2[n3][n3] = n4;
            }
            instanceCount += instanceCount;
            for (n5 = 9; n5 > 1; n5 -= 3) {
                n2 <<= iFld;
                n7 = (byte)(n7 + (byte)instanceCount);
            }
        }
        long l = (long)(Float.floatToIntBits(f) + n + n2 + n3 + n4 + n5 + n6 + (bl ? 1 : 0) + n7) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray2);
        lMeth_check_sum += l;
        return l;
    }

    public static int iMeth(long l, double d) {
        int n = 57627;
        int n2 = -131;
        int n3 = 5;
        int[] nArray = new int[400];
        boolean bl = false;
        int n4 = 109;
        float[] fArray = new float[400];
        FuzzerUtils.init(nArray, 40469);
        FuzzerUtils.init(fArray, -2.475f);
        Test.lMeth(fFld);
        iFld >>>= iFld;
        iFld ^= iFld;
        for (n = 200; n > 6; n -= 3) {
            l = iFld;
            iFld += -31576;
        }
        instanceCount >>>= -6;
        instanceCount <<= n2;
        nArray[(n2 >>> 1) % 400] = n;
        n3 = 1;
        while (!bl) {
            n2 += n3;
            if (++n3 < 305) continue;
        }
        fFld -= (float)n4;
        fArray[0] = fArray[0] + -4.0f;
        long l2 = l + Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)(bl ? 1 : 0) + (long)n4 + FuzzerUtils.checkSum(nArray) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray));
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public void mainTest(String[] stringArray) {
        int n = -218;
        int n2 = 59392;
        int n3 = 10470;
        int n4 = 6;
        int n5 = -9;
        int n6 = 49160;
        int n7 = -227;
        int n8 = 1328;
        float f = 105.348f;
        double d = 1.28617;
        int n9 = -12694;
        int n10 = 22;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -12023L);
        iFld *= 1;
        for (n = 8; n < 283; ++n) {
            f *= (float)d;
            n2 -= Test.iMeth(instanceCount, d);
        }
        --iFld;
        n2 += (int)instanceCount;
        block12: for (n3 = 2; n3 < 158; ++n3) {
            n2 = n3;
            lFld = iFld;
            switch (n3 % 4 * 5 + 76) {
                case 93: {
                    n2 += n3 * n9 + iFld - n2;
                    n4 -= n2;
                    lFld += (long)n9;
                    continue block12;
                }
                case 80: {
                    for (n5 = n3; 161 > n5; ++n5) {
                        double[] dArray = dArrFld[n3];
                        int n11 = n3;
                        dArray[n11] = dArray[n11] - 37983.0;
                        n9 = (short)(n9 << (short)n2);
                        block14: for (n7 = n5; n7 < 1; ++n7) {
                            n10 = (byte)(n10 << (byte)iFld);
                            switch (n3 % 4 + 112) {
                                case 112: 
                                case 113: {
                                    n4 = (int)instanceCount;
                                    Test.iArrFld[n5] = iFld;
                                    continue block14;
                                }
                                case 114: {
                                    n6 |= n8;
                                    instanceCount <<= -57976;
                                    n9 = (short)(n9 + (short)(n7 * n7));
                                    n4 = n2;
                                }
                                case 115: {
                                    n6 -= (int)lFld;
                                    fFld *= (float)instanceCount;
                                    d *= (double)n7;
                                    continue block14;
                                }
                                default: {
                                    n6 &= n8;
                                    n9 = (short)(n9 + (short)n7);
                                }
                            }
                        }
                    }
                }
                case 87: {
                    n4 += n3;
                    continue block12;
                }
                case 92: {
                    int n12 = n3;
                    iArrFld[n12] = iArrFld[n12] * iFld;
                }
                default: {
                    int n13 = n3;
                    lArray[n13] = lArray[n13] >>> (int)instanceCount;
                }
            }
        }
        FuzzerUtils.out.println("i i1 f = " + n + "," + n2 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("d i17 i18 = " + Double.doubleToLongBits(d) + "," + n3 + "," + n4);
        FuzzerUtils.out.println("s1 i19 i20 = " + n9 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i21 i22 by2 = " + n7 + "," + n8 + "," + n10);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + instanceCount + "," + iFld + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.lFld Test.dArrFld Test.iArrFld = " + lFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(dArrFld, 1.33431);
        FuzzerUtils.init(iArrFld, -108);
        iMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

