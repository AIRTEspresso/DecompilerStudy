/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -9L;
    public int iFld = 7;
    public static double dFld = -66.79636;
    public static byte byFld = (byte)17;
    public static float fFld = -1.628f;
    public static double[][] dArrFld = new double[400][400];
    public static byte[] byArrFld = new byte[400];
    public int[] iArrFld = new int[400];
    public long[][][] lArrFld = new long[400][400][400];
    public static boolean[] bArrFld = new boolean[400];
    public static long iMeth_check_sum;
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;

    public static void vMeth(int n, float f) {
        int n2 = 229;
        int n3 = 1;
        int[] nArray = new int[400];
        boolean bl = false;
        byte[] byArray = new byte[400];
        FuzzerUtils.init(nArray, -12);
        FuzzerUtils.init(byArray, (byte)-51);
        int n4 = (n >>> 1) % 400;
        nArray[n4] = nArray[n4] << -224;
        for (n2 = 15; n2 < 305; ++n2) {
            if (n == 0) continue;
            vMeth_check_sum += (long)(n + Float.floatToIntBits(f) + n2 + n3 + (bl ? 1 : 0)) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(byArray);
            return;
        }
        nArray[(n3 >>> 1) % 400] = n2;
        byArray[7] = (byte)(byArray[7] + (byte)n2);
        vMeth_check_sum += (long)(n + Float.floatToIntBits(f -= (float)n3) + n2 + n3 + (bl ? 1 : 0)) + FuzzerUtils.checkSum(nArray) + FuzzerUtils.checkSum(byArray);
    }

    public static long lMeth() {
        int n = 29128;
        int n2 = -36993;
        int n3 = -232;
        int n4 = -152;
        int n5 = -12;
        int[][] nArray = new int[400][400];
        float f = -42.418f;
        boolean bl = true;
        FuzzerUtils.init(nArray, 88);
        Test.vMeth(n, f);
        block4: for (n2 = 160; n2 > 10; n2 -= 2) {
            switch ((n >>> 1) % 2 + 50) {
                case 50: {
                    n += n2 | n3;
                    nArray[n2] = nArray[n2];
                    continue block4;
                }
                case 51: {
                    n4 = 1;
                    while ((n4 += 2) < 21) {
                        if (n3 != 0) {
                            // empty if block
                        }
                        instanceCount += (long)f;
                        n5 = 1;
                        do {
                            n3 -= n4;
                            n3 = (int)((long)n3 + ((long)n5 * instanceCount + (long)n4 - instanceCount));
                            n = (int)instanceCount;
                            n |= 0xFFFFBD8F;
                            instanceCount += (long)(n5 * n3 + n2 - byFld);
                        } while (++n5 < 3);
                        Test.bArrFld[n2 - 1] = bl;
                    }
                    continue block4;
                }
                default: {
                    if (!bl) continue block4;
                }
            }
        }
        long l = (long)(n + Float.floatToIntBits(f) + n2 + n3 + n4 + n5 + (bl ? 1 : 0)) + FuzzerUtils.checkSum(nArray);
        lMeth_check_sum += l;
        return l;
    }

    public int iMeth() {
        float f = -101.128f;
        float f2 = -35.345f;
        int n = -93;
        int n2 = -9297;
        int n3 = -21449;
        boolean bl = false;
        switch ((this.iFld - this.iFld >>> 1) % 8 + 68) {
            case 68: {
                byArrFld = byArrFld;
                byArrFld = byArrFld;
                this.iFld = (int)((dFld *= (double)instanceCount) + (double)this.iFld);
                this.iArrFld[(this.iFld >>> 1) % 400] = (int)((long)this.iFld - instanceCount);
                break;
            }
            case 69: {
                instanceCount = instanceCount-- * (long)(-(-67.104506 - (double)instanceCount) + (double)(instanceCount + (long)this.iFld) + (double)this.lArrFld[177][(this.iFld >>> 1) % 400][(this.iFld >>> 1) % 400]);
                break;
            }
            case 70: {
                for (f = 190.0f; 1.0f < f; f -= 1.0f) {
                    this.iFld = (int)Test.lMeth();
                    instanceCount *= (long)(n -= Math.max(this.iFld, this.iArrFld[(int)f]));
                    n += (int)(f * f + (float)instanceCount - (float)instanceCount);
                    if (bl) break;
                }
                for (n2 = 4; 197 > n2; ++n2) {
                    dFld = -11.0;
                }
                break;
            }
            case 71: {
                dFld = n;
                break;
            }
            case 72: 
            case 73: {
                f2 *= (float)dFld;
                break;
            }
            case 74: {
                n3 += n2;
                break;
            }
            case 75: {
                this.iFld |= n2;
            }
        }
        long l = Float.floatToIntBits(f) + n + (bl ? 1 : 0) + n2 + n3 + Float.floatToIntBits(f2);
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        int n = 49;
        int n2 = 57891;
        int n3 = -52195;
        int n4 = -2;
        int n5 = -171;
        int n6 = -11368;
        int n7 = -240;
        int n8 = 48841;
        double d = -1.12201;
        boolean bl = true;
        int n9 = 15486;
        for (n = 4; n < 364; ++n) {
            for (n3 = 3; 70 > n3; ++n3) {
                n2 -= (int)d;
                for (n5 = 1; n5 < 2; ++n5) {
                    n2 <<= n4;
                    ++instanceCount;
                    instanceCount = -instanceCount;
                    double[] dArray = dArrFld[n3 + 1];
                    int n10 = n5 - 1;
                    dArray[n10] = dArray[n10] - (double)this.iMeth();
                    n4 = (int)dFld;
                    n2 = n3;
                }
                block26: for (n7 = 1; n7 < 2; ++n7) {
                    this.iArrFld[n7 - 1] = (int)instanceCount;
                    fFld += (float)n7;
                    switch (n % 5 * 5 + 106) {
                        case 116: 
                        case 127: {
                            dFld -= 34800.0;
                            continue block26;
                        }
                        case 114: {
                            n8 = (int)((long)n8 + ((long)n7 * instanceCount + (long)n4 - (long)(n6 -= (int)instanceCount)));
                            switch (n % 8 + 112) {
                                case 112: {
                                    instanceCount >>= n5;
                                }
                                case 113: {
                                    instanceCount -= (long)n8;
                                    break;
                                }
                                case 114: {
                                    byFld = (byte)dFld;
                                    fFld += (float)n;
                                }
                                case 115: 
                                case 116: {
                                    n2 += n;
                                    switch ((n8 >>> 1) % 5 + 4) {
                                        case 4: 
                                        case 5: {
                                            int n11 = n3;
                                            this.iArrFld[n11] = this.iArrFld[n11] - (int)instanceCount;
                                            break;
                                        }
                                        case 6: {
                                            if (bl) break;
                                        }
                                        case 7: {
                                            instanceCount += (long)n9;
                                            n4 += n7 - this.iFld;
                                            n2 <<= n8;
                                            fFld += (float)(n7 * n7);
                                            break;
                                        }
                                        case 8: {
                                            n2 <<= this.iFld;
                                        }
                                    }
                                    continue block26;
                                }
                                case 117: {
                                    n4 = n6;
                                    break;
                                }
                                case 118: {
                                    try {
                                        n2 = this.iArrFld[n7] / 59710;
                                        n4 = n3 / -7014;
                                        n4 = 294254790 % n3;
                                    }
                                    catch (ArithmeticException arithmeticException) {}
                                    break;
                                }
                                case 119: {
                                    n8 += 8;
                                }
                            }
                            continue block26;
                        }
                        case 123: {
                            this.iArrFld[n] = 21693;
                            continue block26;
                        }
                        case 119: {
                            n4 = (int)fFld;
                            continue block26;
                        }
                        default: {
                            n8 = n6;
                        }
                    }
                }
            }
        }
        FuzzerUtils.out.println("i i1 i2 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i3 d i4 = " + n4 + "," + Double.doubleToLongBits(d) + "," + n5);
        FuzzerUtils.out.println("i5 i17 i18 = " + n6 + "," + n7 + "," + n8);
        FuzzerUtils.out.println("b3 s = " + (bl ? 1 : 0) + "," + n9);
        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + instanceCount + "," + this.iFld + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.byFld Test.fFld Test.dArrFld = " + byFld + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("Test.byArrFld iArrFld lArrFld = " + FuzzerUtils.checkSum(byArrFld) + "," + FuzzerUtils.checkSum(this.iArrFld) + "," + FuzzerUtils.checkSum((Object[][])this.lArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(bArrFld));
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
        FuzzerUtils.init(dArrFld, 93.1927);
        FuzzerUtils.init(byArrFld, (byte)-56);
        FuzzerUtils.init(bArrFld, false);
        iMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
    }
}

