/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 9976L;
    public static float fFld = 0.352f;
    public static double dFld = 108.26118;
    public static int iFld = -175;
    public static int[] iArrFld = new int[400];
    public static long[] lArrFld = new long[400];
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;

    public static void vMeth1(int n, int n2) {
        double d = 92.101416;
        int n3 = 4;
        int n4 = 103;
        int n5 = -3;
        int n6 = -5;
        int n7 = -47274;
        boolean bl = true;
        int n8 = 3682;
        for (d = 6.0; d < 260.0; d += 1.0) {
            int n9 = -111;
            instanceCount += (long)(d * (double)n9 + (double)fFld - (double)instanceCount);
            n3 *= n3;
            n /= n | 1;
            fFld -= fFld;
            if (bl) break;
            n = (int)fFld;
            n2 += (int)(d - (double)n8);
            n4 = 6;
            while (d < (double)n4) {
                n = n4;
                n = (int)instanceCount;
                --n4;
            }
            n8 = (short)(n8 + (short)(d + (double)instanceCount));
        }
        for (n6 = 22; 382 > n6; ++n6) {
            if (n2 != 0) {
                vMeth1_check_sum += (long)(n + n2) + Double.doubleToLongBits(d) + (long)n3 + (long)(bl ? 1 : 0) + (long)n8 + (long)n4 + (long)n5 + (long)n6 + (long)n7;
                return;
            }
            n7 = n4;
        }
        vMeth1_check_sum += (long)(n + n2) + Double.doubleToLongBits(d) + (long)n3 + (long)(bl ? 1 : 0) + (long)n8 + (long)n4 + (long)n5 + (long)n6 + (long)n7;
    }

    public static void vMeth(int n, int n2, int n3) {
        int n4 = 14756;
        short[][][] sArray = new short[400][400][400];
        int n5 = -67;
        int n6 = -187;
        boolean bl = false;
        long l = -7L;
        FuzzerUtils.init((Object[][])sArray, (Object)330);
        switch (((int)(-112712196L + (long)(n >> (int)instanceCount)) >>> 1) % 5 + 107) {
            case 107: {
                int n7 = (n3 >>> 1) % 400;
                int n8 = iArrFld[n7];
                iArrFld[n7] = n8 + 1;
                Test.vMeth1(n += n8, n2);
                n2 = (int)instanceCount;
                break;
            }
            case 108: {
                n4 = (short)n2;
                try {
                    n3 += (int)instanceCount;
                    block17: for (n5 = 10; n5 < 755; ++n5) {
                        n2 -= n3;
                        if (!bl) continue;
                        n2 += (int)dFld;
                        switch (n5 % 6 + 104) {
                            case 104: {
                                n2 = (int)instanceCount;
                                instanceCount = n4;
                                n3 = (int)dFld;
                                continue block17;
                            }
                            case 105: {
                                n2 = n;
                                continue block17;
                            }
                            case 106: {
                                instanceCount = n;
                                continue block17;
                            }
                            case 107: {
                                instanceCount <<= n5;
                                continue block17;
                            }
                            case 108: {
                                n4 = (short)n6;
                                continue block17;
                            }
                            default: {
                                sArray[n5 - 1][n5 - 1][n5 - 1] = n4;
                            }
                        }
                    }
                    break;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    dFld -= dFld;
                    break;
                }
                catch (UserDefinedExceptionTest userDefinedExceptionTest) {
                    n2 += n3;
                    break;
                }
            }
            case 109: {
                n2 = -55200;
                break;
            }
            case 110: {
                n6 = 63;
                break;
            }
            case 111: {
                l = n5;
                break;
            }
            default: {
                n3 >>= n5;
            }
        }
        vMeth_check_sum += (long)(n + n2 + n3 + n4 + n5 + n6 + (bl ? 1 : 0)) + l + FuzzerUtils.checkSum((Object[][])sArray);
    }

    public static float fMeth(int n) {
        int n2 = 104;
        int n3 = 187;
        int n4 = -253;
        int n5 = -19618;
        int n6 = 28533;
        boolean bl = true;
        float[] fArray = new float[400];
        double[] dArray = new double[400];
        FuzzerUtils.init(fArray, 126.614f);
        FuzzerUtils.init(dArray, -50.117935);
        for (n2 = 13; n2 < 218; ++n2) {
            n4 = 1;
            while (8 > n4) {
                double d = -3.70727;
                int n7 = n4++;
                float f = fArray[n7] - 1.0f;
                fArray[n7] = f;
                d *= (double)f;
                Test.vMeth(n2, -221, 208);
            }
            instanceCount += (long)(n2 * n5 + n3 - n4);
            n6 = 1;
            do {
                if (bl) {
                    int n8 = n6 + 1;
                    lArrFld[n8] = lArrFld[n8] + (long)n5;
                    n = (int)dFld;
                    dArray[n6] = instanceCount;
                } else if (bl) {
                    Test.iArrFld[n2 + 1] = n;
                    if (n6 != 0) {
                        // empty if block
                    }
                    int n9 = n2 + 1;
                    lArrFld[n9] = lArrFld[n9] + instanceCount;
                    n3 <<= n4;
                }
                dFld += dFld;
            } while (++n6 < 8);
        }
        long l = (long)(n + n2 + n3 + n4 + n5 + n6 + (bl ? 1 : 0)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray));
        fMeth_check_sum += l;
        return l;
    }

    public void mainTest(String[] stringArray) {
        int n = -13;
        int n2 = 7;
        int n3 = -13;
        int n4 = 14;
        int n5 = -15;
        int n6 = 0;
        int n7 = 62303;
        int n8 = -123;
        int n9 = 12;
        int n10 = -14;
        int n11 = 6620;
        boolean bl = false;
        boolean bl2 = false;
        int n12 = -12800;
        Test.fMeth(iFld);
        fFld *= 1.58324f;
        n = 12;
        if (219 > n) {
            // empty if block
        }
        for (n4 = 12; n4 < 219 && !bl; n4 += 3) {
            n2 <<= -10;
            n5 = -12;
            --n2;
            instanceCount += (long)dFld;
            for (n6 = n4; n6 < 363; ++n6) {
                for (n8 = 1; n8 < 1; ++n8) {
                    Test.lArrFld[n4] = n12;
                }
                n2 += n6;
                n7 -= n7;
                int n13 = n4 + 1;
                iArrFld[n13] = iArrFld[n13] << 3969;
            }
            if (bl) {
                n9 += n8;
            } else if (bl2) {
                for (n10 = 13; n10 < 363; ++n10) {
                    n11 = (int)instanceCount;
                }
            }
            if (bl) break;
        }
        FuzzerUtils.out.println("i18 i19 i20 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i21 i22 b3 = " + n4 + "," + n5 + "," + (bl ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 i25 = " + n6 + "," + n7 + "," + n8);
        FuzzerUtils.out.println("i26 s2 i27 = " + n9 + "," + n12 + "," + n10);
        FuzzerUtils.out.println("i28 b4 = " + n11 + "," + (bl2 ? 1 : 0));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.iFld Test.iArrFld Test.lArrFld = " + iFld + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, -2298);
        FuzzerUtils.init(lArrFld, 4826642194869447603L);
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
    }
}

