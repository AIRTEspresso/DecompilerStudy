/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/645/original-645/Test.dex */
public class Test {
    public static final int N = 400;
    public static float[] fArrFld;
    public static long instanceCount = 3927;
    public static boolean bFld = false;
    public static float fFld = 92.572f;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        float[] fArr = new float[N];
        fArrFld = fArr;
        FuzzerUtils.init(fArr, -2.4f);
    }

    public static long lMeth(int i, int i2) {
        long j = instanceCount;
        instanceCount = j * j;
        int i3 = i % (i | 1);
        int i4 = 3;
        int i5 = 85;
        int i6 = 10;
        int i7 = -217;
        float f = 60.773f;
        int i8 = 14;
        while (i8 < 251) {
            int i9 = 1;
            int i10 = 1;
            while (i10 < 7) {
                f = i10;
                i10++;
            }
            i5 += i8 * i2;
            while (i9 < 7) {
                i5 += i9;
                i7 = 2;
                i9++;
            }
            i8++;
            int i11 = i10;
            i6 = i9;
            i4 = i11;
        }
        long floatToIntBits = i3 + i2 + i8 + 13 + i4 + i5 + Float.floatToIntBits(f) + i6 + 12 + i7 + 20;
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static void vMeth1(boolean z, long j, int i) {
        int i2;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -42462);
        int i3 = i;
        long lMeth = j >>> ((int) lMeth(i3, i3));
        int i4 = 2;
        int i5 = 42729;
        int i6 = 3959;
        short s = -22955;
        int i7 = 9;
        while (i7 < 397) {
            fFld += 85;
            long j2 = i7;
            int i8 = i4 + i7;
            int i9 = 1;
            int i10 = (int) (i3 + (((j2 * lMeth) + j2) - i4));
            do {
                try {
                    i8 = i7 / 59;
                    i10 = 197 % i8;
                    iArr[i7 - 1] = 39 % i9;
                } catch (ArithmeticException e) {
                }
                try {
                    i10 = i8 % (-25429);
                    i8 = iArr[i9] / iArr[i9];
                    i8 = i10 / i9;
                } catch (ArithmeticException e2) {
                }
                i10 += i9;
                s = (short) (s - ((short) 1));
                if (!bFld) {
                    try {
                        i10 = 1 / iArr[i9];
                        i8 = i9 / i7;
                        i2 = i10 % i9;
                    } catch (ArithmeticException e3) {
                        i2 = i8;
                    }
                    i8 = i2 | (-10);
                }
                i9++;
            } while (i9 < 4);
            i7++;
            i3 = i10;
            i4 = i8;
            i5 = i9;
            i6 = 1;
        }
        vMeth1_check_sum += (z ? 1L : 0L) + lMeth + i3 + i7 + i4 + 85 + i5 + i6 + s + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i) {
        long[] jArr = new long[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(jArr, -1619260512L);
        FuzzerUtils.init(fArr, 104.641f);
        int i2 = 2;
        int i3 = -10041;
        int i4 = 1;
        while (true) {
            i4++;
            if (i4 < 304) {
                vMeth1(bFld, instanceCount, i);
                instanceCount -= i;
                if (bFld) {
                    i ^= i;
                    i2 = 1;
                    do {
                        switch ((i4 % 6) + 24) {
                            case 24:
                                i3 = 1;
                                break;
                            case 25:
                                i += i2;
                                break;
                            case 26:
                                instanceCount -= -102;
                                break;
                            case 27:
                                instanceCount <<= 17116973;
                            case 28:
                                i -= (int) 0.73268d;
                                break;
                            case 29:
                                int i5 = i2 - 1;
                                fArr[i5] = fArr[i5] * (-102);
                                break;
                            default:
                                fFld *= -47046.0f;
                                break;
                        }
                        i2++;
                    } while (i2 < 5);
                }
            } else {
                vMeth_check_sum += ((((i + i4) + i2) + i3) - 102) + 13631 + 52 + 57 + Double.doubleToLongBits(0.73268d) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r0 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0101, code lost:
        if (r0 != false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 851
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
