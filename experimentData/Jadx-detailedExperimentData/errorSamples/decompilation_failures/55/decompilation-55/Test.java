
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/55/original-55/Test.dex */
public class Test {
    public static final int N = 400;
    public static int[][] iArrFld1;
    public byte byFld = -97;
    public int[] iArrFld = new int[N];
    public static long instanceCount = -158286646;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        iArrFld1 = iArr;
        FuzzerUtils.init(iArr, -10);
    }

    public static void vMeth1(double d) {
        double[] dArr = new double[N];
        float[] fArr = new float[N];
        long[][] jArr = (long[][]) Array.newInstance(long.class, N, N);
        FuzzerUtils.init(jArr, 1445252468L);
        FuzzerUtils.init(fArr, 0.83f);
        FuzzerUtils.init(dArr, 0.9963d);
        int i = 5;
        short s = -25152;
        int i2 = 5;
        double d2 = d;
        double d3 = -2.55413d;
        int i3 = 21;
        int i4 = 118;
        int i5 = 25745;
        while (344 > i3) {
            int i6 = i2;
            short s2 = s;
            double d4 = d3;
            int i7 = i5;
            int i8 = 1;
            while (i > i8) {
                d4 = 2.0d;
                while (d4 > 1.0d) {
                    i6 >>= -7924;
                    long j = instanceCount;
                    long j2 = j + j;
                    instanceCount = j2;
                    int i9 = i8;
                    double d5 = -7924;
                    Double.isNaN(d5);
                    int i10 = i3;
                    double d6 = 2.425f;
                    Double.isNaN(d6);
                    double d7 = (d5 * d4) + d6;
                    double d8 = j2;
                    Double.isNaN(d8);
                    long j3 = j2 + ((long) (d7 - d8));
                    instanceCount = j3;
                    int i11 = (int) (d4 + 1.0d);
                    jArr[i11][i11] = i6;
                    double d9 = i9;
                    Double.isNaN(d9);
                    fArr[86] = fArr[86] - ((float) j3);
                    d4 -= 1.0d;
                    s2 = (short) (-50);
                    d2 = d9 * d2;
                    i3 = i10;
                    i8 = i9;
                }
                double d10 = d2;
                int i12 = i8;
                int i13 = i3;
                i7 = 1;
                while (i7 < 2) {
                    dArr[i7 - 1] = 127.0d;
                    i7++;
                    i6 = -7924;
                }
                i8 = i12 + 1;
                i3 = i13;
                d2 = d10;
                i = 5;
            }
            i4 = i8;
            i3++;
            i5 = i7;
            d3 = d4;
            s = s2;
            i2 = i6;
            i = 5;
        }
        vMeth1_check_sum += ((((((Double.doubleToLongBits(d2) + i3) - 7924) + i4) + i2) + Double.doubleToLongBits(d3)) - 50) + 0 + s + Float.floatToIntBits(2.425f) + i5 + 14340 + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth(int i) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 39L);
        vMeth1(0.90106d);
        instanceCount >>= 84;
        int i2 = 113;
        float f = 5.0f;
        while (f < 148.0f) {
            i2 *= -2;
            f += 1.0f;
        }
        int i3 = 10;
        int i4 = 1;
        while (true) {
            i4++;
            if (i4 < 196) {
                i -= (int) f;
                i3 = i4;
                while (i3 < 8) {
                    int[] iArr = iArrFld1[i4 - 1];
                    iArr[i3] = iArr[i3] + i;
                    i3++;
                }
            } else {
                long floatToIntBits = (((((((i + Float.floatToIntBits(f)) + i2) + i4) + i3) + 65) - 14) - 2) + 58 + 0 + FuzzerUtils.checkSum(jArr);
                iMeth_check_sum += floatToIntBits;
                return (int) floatToIntBits;
            }
        }
    }

    public void vMeth(int i) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -2328114433L);
        int i2 = -50753;
        int i3 = -9;
        int i4 = -132;
        int i5 = 24342;
        int i6 = 367;
        while (9 < i6) {
            i *= this.iArrFld[i6] + iMeth(154);
            long j = i2;
            i2 = ((int) (j + (((i6 * i6) + instanceCount) - j))) + i6;
            i3 = 9;
            while (i3 > 1) {
                instanceCount -= -43719;
                iArrFld1[i3 + 1][i6] = i6;
                i4 = 1;
                while (2 > i4) {
                    i5 += (i4 * i4) - 13;
                    i4++;
                    i = -12350;
                }
                i2 = 5;
                instanceCount += 48.73f;
                i3--;
            }
            i6 -= 2;
        }
        vMeth_check_sum += ((((i + i6) + i2) + i3) - 12350) + i4 + i5 + 1 + Float.floatToIntBits(48.73f) + FuzzerUtils.checkSum(jArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r32) {
        /*
            Method dump skipped, instructions count: 1136
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
