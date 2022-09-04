/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -13L;
    public byte byFld = (byte)2;
    public static double dFld = 1.15879;
    public static volatile byte byFld1 = (byte)-37;
    public static float fFld = 0.395f;
    public static volatile double[] dArrFld = new double[400];
    public static float[] fArrFld = new float[400];
    public volatile int[] iArrFld = new int[400];
    public static long lMeth_check_sum;
    public static long lMeth1_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(long l, int n, int n2) {
        int n3 = 242;
        int n4 = -30539;
        int n5 = 251;
        int n6 = 8;
        int n7 = -12;
        int[] nArray = new int[400];
        int[][][] nArray2 = new int[400][400][400];
        int n8 = 111;
        boolean bl = false;
        float f = -2.966f;
        int n9 = 13171;
        FuzzerUtils.init(nArray, -33890);
        FuzzerUtils.init((Object[][])nArray2, (Object)-12);
        n = (int)instanceCount;
        for (int n10 : nArray) {
            n = n2;
            l += (long)n2;
        }
        Test.dArrFld[(n2 >>> 1) % 400] = 59648.0;
        n2 *= 228;
        for (n3 = 3; n3 < 195; ++n3) {
            n8 = (byte)(n8 & (byte)n2);
            if (bl) break;
            for (n5 = n3; n5 < 8; ++n5) {
                n7 = 1;
                while (++n7 < 1) {
                    n2 = (int)f;
                    f += (float)n7 * f + (float)n9 - (float)n2;
                    n6 += n7;
                }
            }
        }
        vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n8 + (long)(bl ? 1 : 0) + (long)n5 + (long)n6 + (long)n7 + (long)Float.floatToIntBits(f) + (long)n9 + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum((Object[][])nArray2);
    }

    public static long lMeth1(long l) {
        int n = 6;
        int n2 = 12;
        int n3 = -4;
        int n4 = 172;
        int n5 = -7;
        int n6 = -10;
        int n7 = -41008;
        int[][] nArray = new int[400][400];
        float f = -86.297f;
        boolean bl = true;
        FuzzerUtils.init(nArray, -6);
        Test.vMeth(l, 30684, n);
        for (n2 = 3; n2 < 179; ++n2) {
            f = 1.0f;
            do {
                int[] nArray2 = nArray[(int)(f + 1.0f)];
                int n8 = n2 - 1;
                nArray2[n8] = nArray2[n8] | n2;
                int[] nArray3 = nArray[(int)(f - 1.0f)];
                int n9 = n2 + 1;
                nArray3[n9] = nArray3[n9] + 1690;
                n *= (int)dFld;
                byFld1 = (byte)(byFld1 + (byte)(6.0f + f * f));
                l += (long)(f * f);
                for (n4 = 1; n4 < 3; ++n4) {
                    instanceCount += (long)n2;
                }
            } while ((f += 3.0f) < 9.0f);
            l *= 128L;
            for (n6 = 1; 9 > n6; ++n6) {
                int n10 = n2 + 1;
                fArrFld[n10] = fArrFld[n10] * (float)n2;
                if (!bl) continue;
            }
        }
        long l2 = l + (long)n + (long)n2 + (long)n3 + (long)Float.floatToIntBits(f) + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)(bl ? 1 : 0) + FuzzerUtils.checkSum(nArray);
        lMeth1_check_sum += l2;
        return l2;
    }

    public static long lMeth() {
        double d = -2.69354;
        int n = -10;
        int n2 = 0;
        int n3 = -177;
        int n4 = -33746;
        int n5 = 137;
        int n6 = 13;
        int n7 = 130;
        int[] nArray = new int[400];
        FuzzerUtils.init(nArray, 181);
        d = (long)(-n) * ((long)n % (instanceCount | 1L) >> n % (n | 1));
        n -= (int)(d += 1.0);
        Test.lMeth1(instanceCount);
        for (n2 = 7; n2 < 232; ++n2) {
            for (n4 = n2; n4 < 7; ++n4) {
                n += n4 * n4;
                block7: for (n6 = 1; n6 < 1; ++n6) {
                    boolean bl = false;
                    nArray[n2] = (int)fFld;
                    switch (n6 % 3 + 126) {
                        case 126: {
                            n3 -= n7;
                            continue block7;
                        }
                        case 127: {
                            fFld %= (float)(instanceCount | 1L);
                            n5 *= n7;
                        }
                        case 128: {
                            instanceCount += (long)n4;
                            int n8 = n4;
                            nArray[n8] = nArray[n8] >> 48994;
                            if (bl) continue block7;
                        }
                        default: {
                            int n9 = n2 - 1;
                            nArray[n9] = nArray[n9] + 475700792;
                        }
                    }
                }
            }
        }
        long l = Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + FuzzerUtils.checkSum(nArray);
        lMeth_check_sum += l;
        return l;
    }

    public void mainTest(String[] stringArray) {
        float f = 1.187f;
        int n = -6360;
        int n2 = -1;
        int n3 = -101;
        int n4 = 49669;
        int n5 = 10;
        int n6 = -14;
        double d = 1.65927;
        int n7 = -26214;
        short[] sArray = new short[400];
        long[] lArray = new long[400];
        byte[][][] byArray = new byte[400][400][400];
        FuzzerUtils.init(lArray, -56288L);
        FuzzerUtils.init((Object[][])byArray, (Object)53);
        FuzzerUtils.init(sArray, (short)-4381);
        this.byFld = (byte)(Math.abs(f) * (float)Test.lMeth() - (float)n);
        lArray[235] = lArray[235] / (long)(n | 1);
        this.iArrFld[6] = this.iArrFld[6] * n;
        n *= n;
        n2 = 1;
        do {
            n += n2 * n;
            f *= 7.0f;
            dFld += (double)instanceCount;
            for (d = 4.0; 100.0 > d; d += 1.0) {
                n7 = (short)(n7 + (short)(d - (double)n3));
                n3 += (int)(d * d);
            }
            switch (n2 % 2 + 16) {
                case 16: {
                    dFld = n2;
                    instanceCount += (long)n3;
                    byFld1 = (byte)(byFld1 >> (byte)n3);
                    break;
                }
                default: {
                    n4 = 1;
                    do {
                        n3 += (int)instanceCount;
                        dFld = 5.0;
                        block11: for (n5 = n2; n5 < 1; ++n5) {
                            int n8 = n5;
                            sArray[n8] = (short)(sArray[n8] - (short)instanceCount);
                            this.iArrFld = this.iArrFld;
                            instanceCount <<= 50575;
                            switch ((n3 >>> 1) % 4 + 64) {
                                case 64: {
                                    this.iArrFld[n4] = (int)instanceCount;
                                    continue block11;
                                }
                                case 65: 
                                case 66: {
                                    n = (int)instanceCount;
                                    lArray[n4] = n;
                                    instanceCount *= instanceCount;
                                    continue block11;
                                }
                                case 67: {
                                    this.iArrFld[n2 - 1] = n;
                                }
                            }
                        }
                    } while (++n4 < 100);
                }
            }
        } while (++n2 < 252);
        FuzzerUtils.out.println("f i22 i23 = " + Float.floatToIntBits(f) + "," + n + "," + n2);
        FuzzerUtils.out.println("d1 i26 s1 = " + Double.doubleToLongBits(d) + "," + n3 + "," + n7);
        FuzzerUtils.out.println("i27 i28 i29 = " + n4 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("lArr byArr sArr = " + FuzzerUtils.checkSum(lArray) + "," + FuzzerUtils.checkSum((Object[][])byArray) + "," + FuzzerUtils.checkSum(sArray));
        FuzzerUtils.out.println("Test.instanceCount byFld Test.dFld = " + instanceCount + "," + this.byFld + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.byFld1 Test.fFld Test.dArrFld = " + byFld1 + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.fArrFld iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(this.iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        FuzzerUtils.init(dArrFld, -2.69701);
        FuzzerUtils.init(fArrFld, -118.926f);
        lMeth_check_sum = 0L;
        lMeth1_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

