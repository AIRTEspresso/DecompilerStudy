/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -9197421431258648103L;
    public static float fFld = -2.584f;
    public static int iFld = 5;
    public static boolean bFld = true;
    public static volatile int iFld1 = 38602;
    public double dFld = -15.3741;
    public static long iMeth_check_sum = 0L;
    public static long vMeth_check_sum = 0L;
    public static long lMeth_check_sum = 0L;

    public static long lMeth(boolean bl, byte by, long l) {
        long l2 = -8255520576848102185L;
        int n = -46813;
        int n2 = -9;
        int n3 = -13;
        int n4 = -6;
        int n5 = -35261;
        int[] nArray = new int[400];
        int n6 = -17359;
        boolean bl2 = true;
        FuzzerUtils.init(nArray, -29303);
        block5: for (l2 = 1L; 134L > l2; ++l2) {
            for (n2 = 1; n2 < 12; ++n2) {
                n3 |= n3;
                n6 = by;
                n += n2;
                n += -14 + n2 * n2;
                n += n3;
            }
            switch ((int)(l2 % 3L * 5L + 66L)) {
                case 71: {
                    fFld += -10301.0f;
                    int n7 = (int)(l2 + 1L);
                    nArray[n7] = nArray[n7] + (int)instanceCount;
                    n += n3;
                    continue block5;
                }
                case 74: {
                    if (bl2) continue block5;
                }
                case 72: {
                    n3 /= n3 | 1;
                }
            }
        }
        long l3 = (long)((bl ? (byte)1 : 0) + by) + l + l2 + (long)n + (long)n2 + (long)n3 + (long)n6 + (long)n4 + (long)n5 + (long)(bl2 ? 1 : 0) + FuzzerUtils.checkSum(nArray);
        lMeth_check_sum += l3;
        return l3;
    }

    public static void vMeth(long l) {
        double d = 0.118181;
        byte by = 111;
        int n = 21626;
        int n2 = -20569;
        int n3 = -4;
        int n4 = -177;
        int n5 = 33738;
        int n6 = 6;
        int n7 = 77;
        int[] nArray = new int[400];
        long l2 = 227L;
        FuzzerUtils.init(nArray, 4);
        d = 1.0;
        do {
            int n8 = 203;
            n8 = Math.abs(n8) - nArray[(int)(d + 1.0)] - (n8 + by - n8);
            for (n = 1; n < 5; ++n) {
                for (n3 = 1; n3 < 2; ++n3) {
                    n2 = (int)((long)n2 + ((long)n3 ^ instanceCount));
                }
                for (n5 = 1; n5 < 2; ++n5) {
                    by = (byte)(by | (byte)(58.0f - (fFld + -2.864f + (float)(n2 += n5))));
                    int n9 = n5;
                    nArray[n9] = nArray[n9] * (int)(((double)(n * n6) + (d - (double)n6)) * (double)(++instanceCount - (long)(-(30233 - (n5 + n5)))));
                    n8 %= (int)(Test.lMeth(bFld, by, 12L) | 1L);
                    if (bFld) break;
                    iFld += 142;
                }
                for (l2 = 1L; l2 < 2L; ++l2) {
                    n2 += n7;
                    fFld += (float)(l2 * (long)iFld + instanceCount - (long)n4);
                }
            }
        } while ((d += 1.0) < 323.0);
        vMeth_check_sum += l + Double.doubleToLongBits(d) + (long)by + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + l2 + (long)n7 + FuzzerUtils.checkSum(nArray);
    }

    public static int iMeth(long l, int n) {
        int n2 = -5847;
        int n3 = 3;
        int n4 = 2781;
        int n5 = -48;
        int n6 = 45708;
        int[] nArray = new int[400];
        int n7 = 117;
        long[] lArray = new long[400];
        FuzzerUtils.init(lArray, -6L);
        FuzzerUtils.init(nArray, -29624);
        Test.vMeth(instanceCount);
        lArray[0] = instanceCount;
        nArray[356] = nArray[356] - n;
        n2 = (short)(n2 - (short)n);
        for (n3 = 12; n3 < 283; ++n3) {
            instanceCount = -177L;
            n7 = (byte)(n7 * 108);
            n = 42122;
            lArray[n3] = (long)fFld;
            n = -10;
        }
        iFld = -123;
        for (n5 = 13; n5 < 389; ++n5) {
            l <<= n4;
            iFld = n;
            fFld *= -8.0f;
        }
        long l2 = l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n7 + (long)n5 + (long)n6 + FuzzerUtils.checkSum(lArray) + FuzzerUtils.checkSum(nArray);
        iMeth_check_sum += l2;
        return (int)l2;
    }

    public void mainTest(String[] stringArray) {
        int n = 10;
        int n2 = -130;
        int n3 = 14;
        int n4 = 51760;
        int n5 = 128;
        int n6 = 26449;
        int n7 = -14;
        int n8 = 14;
        int n9 = -15920;
        int[] nArray = new int[400];
        float f = 0.48f;
        int n10 = 74;
        int n11 = -2402;
        FuzzerUtils.init(nArray, -141);
        n = 1;
        do {
            f *= (float)(n2++ - nArray[n]);
            int n12 = n;
            nArray[n12] = nArray[n12] * (Math.max(n2, (int)(instanceCount * (long)n2)) + Math.min(n, -34466 * Test.iMeth(instanceCount, n2)));
            n10 = (byte)(n10 + 118);
            nArray[n + 1] = iFld;
            iFld = n;
            n3 = 5;
            while (n3 < 186) {
                iFld = iFld1;
                iFld += iFld1;
                int n13 = n3++;
                nArray[n13] = nArray[n13] - (n2 += n3 | n4);
                n11 = (short)(n11 << -30424);
            }
            iFld += n3;
            n5 = 1;
            do {
                n6 = 1;
                while (n6 < 1) {
                    n7 -= (int)instanceCount;
                    n4 += n6 * n6;
                    f -= (float)iFld;
                    n2 = 132;
                    n4 = n5;
                    n4 |= n11;
                    int n14 = n6++;
                    nArray[n14] = nArray[n14] + (int)instanceCount;
                    int n15 = n - 1;
                    nArray[n15] = nArray[n15] << (n2 += 55756);
                }
                f += f;
                for (n8 = 1; n8 < 1; ++n8) {
                    n9 = -42598;
                    this.dFld += 50540.0;
                    this.dFld -= (double)iFld;
                    n9 = (int)((long)n9 + ((long)n8 ^ (long)fFld));
                }
            } while (++n5 < 186);
        } while (++n < 135);
        FuzzerUtils.out.println("i f i1 = " + n + "," + Float.floatToIntBits(f) + "," + n2);
        FuzzerUtils.out.println("by3 i20 i21 = " + n10 + "," + n3 + "," + n4);
        FuzzerUtils.out.println("s2 i22 i23 = " + n11 + "," + n5 + "," + n6);
        FuzzerUtils.out.println("i24 i25 i26 = " + n7 + "," + n8 + "," + n9);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(nArray));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + iFld);
        FuzzerUtils.out.println("Test.bFld Test.iFld1 dFld = " + (bFld ? 1 : 0) + "," + iFld1 + "," + Double.doubleToLongBits(this.dFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
}

