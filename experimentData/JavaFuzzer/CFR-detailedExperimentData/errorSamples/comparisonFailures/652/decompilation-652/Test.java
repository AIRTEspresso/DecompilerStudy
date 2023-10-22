/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 1818248298180143934L;
    public static double dFld = -1.1715;
    public static int iFld = 2;
    public int iFld1 = -6;
    public static boolean bFld = true;
    public static int[] iArrFld = new int[400];
    public static long lMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;

    public static void vMeth(long l, int n, long l2) {
        int n2 = -221;
        int n3 = 1;
        int n4 = -104;
        n2 = 1;
        do {
            for (n3 = 1; n3 < 5; ++n3) {
                int n5 = n2;
                int n6 = iArrFld[n5];
                iArrFld[n5] = n6 - 1;
                dFld *= (double)(l2 += (long)(n6 - n2));
            }
        } while (++n2 < 372);
        vMeth_check_sum += l + (long)n + l2 + (long)n2 + (long)n3 + (long)n4;
    }

    public static int iMeth(int n) {
        int n2 = -50050;
        int n3 = -60196;
        int n4 = -55;
        int n5 = 33;
        boolean bl = true;
        int n6 = 5878;
        Test.vMeth(1555838649L, -8, instanceCount);
        if (bl) {
            n >>>= n;
            n2 = 1;
            do {
                float f = 97.862f;
                f = n5;
                n = n2++;
            } while (n2 < 368);
        }
        n3 = 1;
        while (++n3 < 125) {
            n6 = (short)(n6 + (short)(n3 ^ n2));
            n6 = (short)(n6 + (short)n2);
        }
        n -= n;
        n4 = 1;
        while (++n4 < 134) {
            if (n2 != 0) {
                // empty if block
            }
            n = -33279;
            n -= 14;
            if (!bl) continue;
        }
        long l = n + n2 + n5 + (bl ? 1 : 0) + n3 + n6 + n4;
        iMeth_check_sum += l;
        return (int)l;
    }

    public static long lMeth(int n) {
        boolean bl = false;
        boolean[] blArray = new boolean[400];
        int n2 = -5;
        int n3 = -217;
        int n4 = 11488;
        int n5 = 58;
        int n6 = -9;
        int n7 = 20268;
        long[] lArray = new long[400];
        FuzzerUtils.init(blArray, false);
        FuzzerUtils.init(lArray, -46L);
        bl = blArray[(n2 >>> 1) % 400];
        instanceCount = n2;
        Test.vMeth(Math.min(instanceCount, (long)((float)n2 - -1.472f) << Test.iMeth(-45840)), n2, 0L);
        for (n3 = 9; n3 < 328; ++n3) {
            float f = 0.726f;
            f = n3;
            instanceCount = -177L;
            for (n5 = n3; n5 < 5; ++n5) {
                n += n5;
                n6 += (int)(f += (float)n6);
                n2 -= 43;
                int n8 = n3;
                lArray[n8] = lArray[n8] * (long)n5;
            }
        }
        long l = (long)(n + (bl ? 1 : 0) + n2 + n3 + n4 + n7 + n5 + n6) + FuzzerUtils.checkSum(blArray) + FuzzerUtils.checkSum(lArray);
        lMeth_check_sum += l;
        return l;
    }

    public void mainTest(String[] stringArray) {
        int n = 12;
        int n2 = -171;
        int n3 = 28696;
        int n4 = -8;
        int n5 = -23;
        int n6 = -186;
        int n7 = -40013;
        float f = 2.345f;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, 3697874498L);
        dFld = instanceCount--;
        instanceCount -= Test.lMeth(iFld);
        Test.iArrFld[(this.iFld1 >>> 1) % 400] = this.iFld1;
        lArray[(Test.iFld >>> 1) % 400] = (long)dFld;
        for (n = 9; n < 254; ++n) {
            this.iFld1 = n2;
            n2 += n | n2;
            iFld *= (int)dFld;
            n2 += n;
            block5: for (n3 = n; n3 < 103; ++n3) {
                n4 *= 14398;
                instanceCount -= (long)n3;
                this.iFld1 *= 1;
                n4 += 63512;
                switch (n3 % 2 * 5 + 87) {
                    case 93: {
                        f += (float)((long)n3 * instanceCount + (long)n5 - instanceCount);
                        iFld = n4;
                        continue block5;
                    }
                    case 89: {
                        n2 *= iFld;
                        n5 = (int)instanceCount;
                        for (n6 = 1; n6 < 1; n6 += 3) {
                            n5 *= 233;
                            this.iFld1 >>= n2;
                            instanceCount += (long)n6;
                            int n8 = n3 + 1;
                            lArray[n8] = lArray[n8] >>> (n7 += n6 - n);
                        }
                        continue block5;
                    }
                }
            }
        }
        FuzzerUtils.out.println("i14 i15 i16 = " + n + "," + n2 + "," + n3);
        FuzzerUtils.out.println("i17 f2 i18 = " + n4 + "," + Float.floatToIntBits(f) + "," + n5);
        FuzzerUtils.out.println("i19 i20 lArr1 = " + n6 + "," + n7 + "," + FuzzerUtils.checkSum(lArray));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + iFld);
        FuzzerUtils.out.println("iFld1 Test.bFld Test.iArrFld = " + this.iFld1 + "," + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        FuzzerUtils.init(iArrFld, 189);
        lMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
    }
}

