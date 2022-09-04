/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/160/original-160/Test.dex */
public class Test {
    public static final int N = 400;
    public static long[] lArrFld;
    public double dFld = -25.42777d;
    public short sFld = -6543;
    public static volatile long instanceCount = -222;
    public static int iFld = 31231;
    public static float fFld = 4.476f;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        long[] jArr = new long[N];
        lArrFld = jArr;
        FuzzerUtils.init(jArr, -10L);
    }

    public static void vMeth2(int i, int i2) {
        int[] iArr = new int[N];
        int[] iArr2 = new int[N];
        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(iArr2, 9);
        int i3 = i;
        int i4 = i2;
        double d = 116.121409d;
        int i5 = -7;
        int i6 = 15595;
        int i7 = 0;
        int i8 = -37579;
        short s = -9439;
        byte b = 29;
        int i9 = 7;
        while (i9 < 328) {
            int i10 = i3 - ((int) instanceCount);
            iFld += ((i9 * i10) + i4) - i5;
            int i11 = i8;
            int i12 = i7;
            int i13 = 1;
            while (i13 < 5) {
                int i14 = (i9 % 2) + 26;
                if (i14 == 26) {
                    i4 = iFld;
                    if (i9 != 0) {
                        vMeth2_check_sum += i10 + i4 + i9 + i5 + i13 + i12 + s + i11 + 51 + b + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                    s = (short) (s - ((short) i10));
                    try {
                        i5 = i9 % i13;
                        iArr2[i9 + 1] = iArr[i13 + 1] / (-48370);
                        i12 = i4 % i5;
                    } catch (ArithmeticException e) {
                    }
                } else if (i14 != 27) {
                    i13++;
                }
                i11 = 2;
                while (i11 > 1) {
                    b = (byte) (b * 55);
                    d = i13;
                    i5 -= (int) instanceCount;
                    iFld += i11;
                    i11 -= 3;
                }
                i13++;
            }
            i9++;
            int i15 = i12;
            i8 = i11;
            i3 = i10;
            i6 = i13;
            i7 = i15;
        }
        vMeth2_check_sum += i3 + i4 + i9 + i5 + i6 + i7 + s + i8 + 51 + b + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth1() {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -191);
        vMeth2(iFld, 18352);
        iArr[(iFld >>> 1) % N] = (int) fFld;
        double d = instanceCount;
        int i = iFld;
        iFld = i - i;
        int i2 = -6;
        int i3 = -10;
        int i4 = -54571;
        byte b = -76;
        int i5 = 3;
        while (i5 < 157) {
            int i6 = (i2 - ((int) instanceCount)) * (-13900);
            instanceCount += i5;
            int i7 = 10;
            do {
                b = (byte) d;
                i7--;
            } while (i7 > 0);
            i5++;
            i3 = i7;
            i2 = i6;
            i4 = 1;
        }
        vMeth1_check_sum += (((Double.doubleToLongBits(d) + i5) + i2) - 13900) + i3 + b + i4 + 159 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(short s) {
        long j = 92;
        int i = 1;
        while (true) {
            i++;
            if (i < 384) {
                instanceCount = j ^ instanceCount;
                fFld = (float) 1.51951d;
                int i2 = iFld;
                double d = i2;
                Double.isNaN(d);
                long min = Math.min((int) (d - 1.51951d), i2);
                iFld = i2 >> ((int) min);
                j = min;
            } else {
                vMeth1();
                vMeth_check_sum += s + i + j + Double.doubleToLongBits(1.51951d);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3 A[LOOP:2: B:26:0x00ed->B:28:0x00f3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r24) {
        /*
            Method dump skipped, instructions count: 764
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
