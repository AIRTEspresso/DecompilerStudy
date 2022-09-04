/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 1L;
    public static double dFld = 0.118459;
    public static int[] iArrFld = new int[400];
    public static long vSmallMeth_check_sum;
    public static long vMeth_check_sum;
    public static long bMeth_check_sum;

    public static boolean bMeth(double d, int n) {
        int n2 = -10;
        int n3 = -61492;
        int n4 = 119;
        int n5 = -57244;
        int n6 = -2;
        int[] nArray = new int[400];
        boolean bl = true;
        float f = -1.231f;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 119.546f);
        FuzzerUtils.init(nArray, -4);
        n2 = 1;
        while (!bl) {
            instanceCount = (long)f;
            n3 += (int)instanceCount;
            n3 %= n3 | 1;
            n3 >>= n3;
            if (++n2 < 319) continue;
        }
        for (n4 = 232; n4 > 10; --n4) {
            n += n4 + (n5 += 12545 + n4 * n4);
            n6 = 1;
            while (++n6 < 7) {
                int n7 = n4 - 1;
                fArray[n7] = fArray[n7] + (float)instanceCount;
                n5 = -1188776984;
                if (bl) {
                    n5 = n2;
                    f += (float)n6;
                    continue;
                }
                if (!bl) continue;
                int n8 = n4;
                nArray[n8] = nArray[n8] - n2;
            }
        }
        long l = Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)(bl ? 1 : 0) + (long)Float.floatToIntBits(f) + (long)n3 + (long)n4 + (long)n5 + (long)n6 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + FuzzerUtils.checkSum(nArray);
        bMeth_check_sum += l;
        return l % 2L > 0L;
    }

    public static void vMeth(int n, int n2, int n3) {
        double d = 71.93603;
        double[] dArray = new double[400];
        int n4 = 10;
        int n5 = -12;
        int n6 = 6;
        float f = 1.302f;
        float[] fArray = new float[400];
        FuzzerUtils.init(fArray, 1.282f);
        FuzzerUtils.init(dArray, -103.28192);
        n += (int)(-3469599995L + (long)n3);
        for (d = 190.0; d > 5.0; d -= 1.0) {
            for (n5 = 1; n5 < 9; ++n5) {
                n6 = 248;
                instanceCount = (long)(-fArray[n5] - (float)(Integer.reverseBytes(n3) + n));
                n3 += Math.max((int)(-69.0 - ((double)(n2 += n5) - d)), n4 + n4) * -124;
                dArray[5] = dArray[5] + d;
                if (Test.bMeth(-6.45281, n4)) break;
                dFld *= (double)f;
            }
            f += 48718.0f;
            n3 = n -= (int)(instanceCount += (long)d);
            dFld -= (double)n6;
        }
        vMeth_check_sum += (long)(n + n2 + n3) + Double.doubleToLongBits(d) + (long)n4 + (long)n5 + (long)n6 + (long)Float.floatToIntBits(f) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArray)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArray));
    }

    public static void vSmallMeth() {
        int n = -58;
        Test.vMeth(n, n, 86);
        int n2 = (n >>> 1) % 400;
        iArrFld[n2] = iArrFld[n2] | 0xFFFFFFB1;
        vSmallMeth_check_sum += (long)n;
    }

    public void mainTest(String[] stringArray) {
        float f = 0.484f;
        int n = -72;
        int n2 = -4;
        int n3 = 7;
        int n4 = -1;
        int n5 = -113;
        int n6 = 5;
        int n7 = -5;
        int n8 = 0;
        int n9 = -21474;
        instanceCount = instanceCount << (int)instanceCount--;
        for (int i = 0; i < 787; ++i) {
            Test.vSmallMeth();
        }
        f += (float)instanceCount;
        for (n = 10; n < 350; ++n) {
            for (n3 = 74; n3 > 3; --n3) {
                n2 = 2;
            }
            n2 >>= n3;
            for (n5 = 74; n5 > n; n5 -= 3) {
                f *= (float)n2;
                n4 >>= n2;
                Test.iArrFld[n - 1] = n9;
                dFld += 86.0;
                for (n7 = 1; n7 < 1; ++n7) {
                    instanceCount >>= n3;
                }
                instanceCount = (long)((float)instanceCount + ((float)n5 * f + (float)instanceCount - f));
            }
            f += (float)n;
            instanceCount += (long)n;
        }
        n4 = n9;
        FuzzerUtils.out.println("f2 i13 i14 = " + Float.floatToIntBits(f) + "," + n + "," + n2);
        FuzzerUtils.out.println("i15 i16 i17 = " + n3 + "," + n4 + "," + n5);
        FuzzerUtils.out.println("i18 s i19 = " + n6 + "," + n9 + "," + n7);
        FuzzerUtils.out.println("i20 = " + n8);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iArrFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 5);
        vSmallMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        bMeth_check_sum = 0L;
    }
}

