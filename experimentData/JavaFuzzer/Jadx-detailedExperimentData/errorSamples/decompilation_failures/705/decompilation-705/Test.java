/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/705/original-705/Test.dex */
public class Test {
    public static long instanceCount = -4212500827L;
    public static boolean bFld = true;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public float fFld = -1.281f;
    public double[] dArrFld = new double[N];

    static {
        FuzzerUtils.init(iArrFld, -11);
        FuzzerUtils.init(lArrFld, -3911311148057376227L);
    }

    public static int iMeth1(byte b) {
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 0.4392d);
        long[] jArr = lArrFld;
        jArr[42] = jArr[42] - 14;
        int i = (int) instanceCount;
        int i2 = i + i;
        int[] iArr = iArrFld;
        int length = iArr.length;
        int i3 = -8;
        int i4 = 181;
        int i5 = 193;
        int i6 = -33912;
        int i7 = 0;
        while (i7 < length) {
            int i8 = iArr[i7];
            if (bFld) {
                break;
            }
            b = 99;
            int i9 = i6;
            int i10 = i5;
            int i11 = i4;
            int i12 = 1;
            while (i12 < 4) {
                long j = instanceCount;
                i2 >>>= (int) j;
                double d = dArr[i12];
                double d2 = i2;
                Double.isNaN(d2);
                dArr[i12] = d * d2;
                long[] jArr2 = lArrFld;
                i12++;
                jArr2[i12] = jArr2[i12] - j;
                i10 = 2;
                i11 = i8;
                i9 = 1;
            }
            i7++;
            i3 = i12;
            i4 = i11;
            i5 = i10;
            i6 = i9;
        }
        long doubleToLongBits = b + i2 + i3 + i4 + i5 + i6 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static short sMeth(long j, float f, int i) {
        int[] iArr = iArrFld;
        iArr[10] = iArr[10] >>> iMeth1((byte) -60);
        int i2 = -33930;
        int i3 = 117;
        int i4 = 5;
        while (i4 < 358) {
            i += ((i4 * i2) + i2) - i4;
            int i5 = (int) j;
            i2 = (i2 - i4) & i5;
            int i6 = ((i4 % 10) * 5) + 30;
            if (i6 != 45) {
                if (i6 == 46) {
                    boolean z = bFld;
                } else if (i6 == 56) {
                    i >>>= i4;
                } else if (i6 != 57 && i6 != 60) {
                    if (i6 == 65) {
                        int i7 = (i4 % 2) + 4;
                        if (i7 != 4) {
                            if (i7 == 5) {
                                i3 = 1;
                                do {
                                    int[] iArr2 = iArrFld;
                                    int i8 = i4 + 1;
                                    iArr2[i8] = iArr2[i8] & i5;
                                    bFld = bFld;
                                    i = i + 20319 + ((int) f);
                                    i3++;
                                } while (i3 < 5);
                            } else {
                                f = -60;
                            }
                        } else {
                            i -= i2;
                            i2 += i2;
                        }
                    } else if (i6 == 67) {
                        long j2 = instanceCount;
                        instanceCount = j2 + j2;
                    } else if (i6 != 70 && i6 != 72) {
                        if (i6 == 74) {
                            lArrFld[i4 - 1] = i2;
                        } else {
                            int[] iArr3 = iArrFld;
                            int i9 = i4 + 1;
                            iArr3[i9] = iArr3[i9] + i4;
                        }
                    }
                }
                i4++;
            }
            j += i4 + i2;
            i4++;
        }
        long floatToIntBits = (((j + Float.floatToIntBits(f)) + i) - 60) + i4 + i2 + i3;
        sMeth_check_sum += floatToIntBits;
        return (short) floatToIntBits;
    }

    public static int iMeth(long j) {
        int[] iArr = iArrFld;
        int i = iArr[316] * 3953941;
        iArr[316] = i;
        double d = i;
        int i2 = 167;
        int i3 = -243;
        int i4 = 105;
        while (i2 > 2) {
            int i5 = (i2 % 2) + 105;
            if (i5 == 105) {
                instanceCount += i2 * i2;
                i4 = 1;
                while (i4 < 19) {
                    j <<= -38962;
                    long[] jArr = lArrFld;
                    int i6 = i2 - 1;
                    jArr[i6] = jArr[i6] + i2;
                    i4++;
                }
                iArrFld = iArrFld;
                i3 = i2;
            } else {
                if (i5 == 106) {
                    iArrFld[i2 + 1] = 0;
                }
                double d2 = instanceCount;
                Double.isNaN(d2);
                d += d2;
            }
            i2 -= 2;
        }
        long doubleToLongBits = (((((j + 317) + Double.doubleToLongBits(d)) + 1) + Float.floatToIntBits(-1.349f)) - 38962) + i2 + i3 + i4 + 123;
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r18) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.mainTest(java.lang.String[]):void");
    }

    public static void main(String[] strArr) {
        try {
            Test test = new Test();
            for (int i = 0; i < 10; i++) {
                test.mainTest(strArr);
            }
        } catch (Exception e) {
            FuzzerUtils.out.println(e.getClass().getCanonicalName());
        }
    }
}
