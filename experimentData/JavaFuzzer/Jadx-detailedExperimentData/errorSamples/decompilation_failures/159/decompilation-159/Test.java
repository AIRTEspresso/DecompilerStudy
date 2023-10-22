
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/159/original-159/Test.dex */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 79;
    public static float fFld = -1.311f;
    public static boolean bFld = true;
    public static double dFld = 0.98551d;
    public static float fFld1 = 17.148f;
    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public int iFld = -3;
    public byte byFld = 93;
    public int iFld1 = -6207;
    public int[][] iArrFld = (int[][]) Array.newInstance(int.class, N, N);

    public static void vMeth(long j, int i) {
        double[] dArr;
        float[] fArr;
        int i2 = N;
        long[] jArr = new long[N];
        float[] fArr2 = new float[N];
        double[] dArr2 = new double[N];
        FuzzerUtils.init(jArr, -9L);
        FuzzerUtils.init(fArr2, 3.569f);
        FuzzerUtils.init(dArr2, -100.96964d);
        int i3 = 2730;
        int i4 = 0;
        int i5 = -6;
        int i6 = -9;
        int i7 = 1;
        while (true) {
            long[] long1array = FuzzerUtils.long1array(i2, 6L);
            long j2 = 1;
            while (j2 < 8) {
                instanceCount = i7;
                j2++;
            }
            int i8 = 1;
            while (i8 < 8) {
                i3 <<= (int) instanceCount;
                i8++;
            }
            int i9 = ((i7 % 3) * 5) + 90;
            if (i9 == 94) {
                fArr = fArr2;
                dArr = dArr2;
            } else if (i9 == 101) {
                fArr = fArr2;
                dArr = dArr2;
                long j3 = instanceCount;
                int i10 = ((int) j3) ^ i3;
                instanceCount = j3 - 17884;
                int i11 = i7;
                while (i11 < 8) {
                    i11++;
                    i6 = 1;
                }
                i4 = i11;
                i3 = i10;
            } else if (i9 != 105) {
                fArr = fArr2;
                dArr = dArr2;
            } else {
                fArr = fArr2;
                dArr = dArr2;
                i5 = (int) (i5 + (((i7 * j2) + j2) - (-106)));
            }
            i7++;
            if (i7 >= 194) {
                vMeth_check_sum += ((((((((((j + i) + i7) + j2) + 17884) + i8) + i3) + i4) + i5) + i6) - 106) + FuzzerUtils.checkSum(long1array) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
            fArr2 = fArr;
            dArr2 = dArr;
            i2 = N;
        }
    }

    public static int iMeth(int i, int i2, int i3) {
        long j;
        double[][] dArr = (double[][]) Array.newInstance(double.class, N, N);
        FuzzerUtils.init(dArr, -2.31288d);
        int i4 = 1;
        int i5 = 1;
        int i6 = i;
        while (true) {
            i6 += i4;
            j = instanceCount * i6;
            instanceCount = j;
            i5 += i4;
            if (i5 >= 265) {
                break;
            }
            i4 = 1;
        }
        vMeth(j, -11);
        int i7 = i2;
        int i8 = i3;
        int i9 = 2;
        int i10 = 3;
        int i11 = 108;
        int i12 = 33566;
        int i13 = 40034;
        while (i10 < 126) {
            i12 = 13;
            while (i10 < i12) {
                i13 *= i6;
                long j2 = i12;
                instanceCount = j2;
                i8 %= i12 | 1;
                i9 = i10;
                while (i4 > i9) {
                    long j3 = instanceCount;
                    instanceCount = j3 + j3;
                    dArr[i10 + 1] = FuzzerUtils.double1array(N, 72.82947d);
                    i9++;
                    i7 = i6;
                    i4 = 1;
                    i13 = 99;
                    i6 = i7;
                }
                instanceCount *= j2;
                i11 >>= 135;
                i12--;
                i4 = 1;
                i6 = i6;
            }
            i10++;
            i4 = 1;
        }
        long doubleToLongBits = (((((((((i6 + i7) + i8) + i5) + i10) + i11) + i12) + i13) + i9) - 55934) + 99 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean bMeth(long r21, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.bMeth(long, int, int):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:31|(4:33|(4:35|(2:37|(4:39|(1:(2:42|(1:44)(1:46))(3:47|60|61))|48|61))(1:50)|51|52)|49|54)(1:55)|71|56|57|59|60|61) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        if (r0 != 85) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r22) {
        /*
            Method dump skipped, instructions count: 842
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
