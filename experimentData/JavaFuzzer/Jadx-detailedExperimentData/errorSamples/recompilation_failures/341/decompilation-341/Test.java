
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/341/original-341/Test.dex */
public class Test {
    public static final int N = 400;
    public static int[] iArrFld;
    public static long instanceCount = -4977358156190995254L;
    public static double dFld = 24.84776d;
    public static long vSmallMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, 5);
    }

    public static long lMeth(int i, boolean z, long j) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -114);
        int i2 = -224;
        float f = 7.0f;
        while (true) {
            if (f >= 134.0f) {
                break;
            }
            i2 = ((int) f) ^ 4;
            long j2 = instanceCount;
            i += (int) (f ^ j2);
            long j3 = i2;
            if (z) {
                j = j3;
                break;
            }
            instanceCount = j2 + j3;
            f += 1.0f;
            j = j3;
        }
        iArr[(i >>> 1) % N] = 80;
        double d = 1.0d;
        while (379.0d > d) {
            i2 += i;
            i &= i2;
            d += 1.0d;
        }
        long floatToIntBits = ((((((i + (z ? 1 : 0)) + j) + Float.floatToIntBits(f)) + i2) + Double.doubleToLongBits(d)) - 22810) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static int iMeth(int i) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 13L);
        FuzzerUtils.init(iArr, 10);
        int i2 = i + 113;
        int i3 = 178;
        int i4 = 19;
        int i5 = 370;
        int i6 = 0;
        while (5 < i5) {
            long lMeth = instanceCount + lMeth(i2, false, -10L);
            instanceCount = lMeth;
            jArr[i5 + 1] = lMeth;
            int i7 = ((int) lMeth) + i5;
            int i8 = i3 + ((int) lMeth);
            i6 = 1;
            while (true) {
                i6++;
                if (i6 < 13) {
                    i8 >>= -10;
                    iArr[i5] = iArr[i5] * i7;
                }
            }
            long j = instanceCount + (i5 | i6);
            instanceCount = j;
            i2 = i7 + 194;
            i3 = i8 >> ((int) j);
            i4 = 3;
            i5 -= 3;
        }
        double d = dFld;
        double d2 = -28969;
        Double.isNaN(d2);
        dFld = d * d2;
        long checkSum = ((((((i2 + i5) + i3) + 0) + i6) + i4) - 28969) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += checkSum;
        return (int) checkSum;
    }

    public static void vSmallMeth(int i) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        FuzzerUtils.init(iArr, 8);
        int[] iArr2 = iArr[(i >>> 1) % N];
        iArr2[97] = iArr2[97] ^ iMeth(i);
        long j = i;
        instanceCount += j;
        vSmallMeth_check_sum += j + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        int i3 = -3744;
        int i4 = -8;
        int i5 = -54321;
        int i6 = -23129;
        long j = -173;
        float f = 0.499f;
        int i7 = -27;
        int i8 = 4;
        while (i8 < 133) {
            i7 *= -17549;
            long j2 = i8;
            float f2 = f;
            long j3 = j2;
            while (j3 > 1) {
                for (int i9 = 0; i9 < 1; i9++) {
                    vSmallMeth(i7);
                }
                int i10 = i3 + ((int) (j3 * j2));
                try {
                    i2 = i5;
                    i = i6;
                    int i11 = (int) (j3 - 1);
                    try {
                        int i12 = iArrFld[(int) (j3 + 1)] / iArrFld[i11];
                        i10 = i12 / i12;
                        iArrFld[i8] = i8 / iArrFld[i11];
                    } catch (ArithmeticException e) {
                    }
                } catch (ArithmeticException e2) {
                    i2 = i5;
                    i = i6;
                }
                i7 = i10;
                i3 = (int) f2;
                instanceCount = j2;
                int i13 = ((i8 % 4) * 5) + 98;
                if (i13 == 101) {
                    i4 = i8;
                    i5 = i2;
                    i6 = i;
                } else if (i13 == 102) {
                    i4 += (int) (j3 * j3);
                    iArrFld[i8] = -1515154643;
                    i5 = i2;
                    i6 = i;
                } else if (i13 == 114) {
                    i5 = 1;
                    while (2 > i5) {
                        i5++;
                    }
                    i3 += (int) (i4 * j3);
                    i6 = i * i8;
                } else if (i13 == 118) {
                    f2 -= 147;
                    i5 = i2;
                    i6 = i;
                } else {
                    int[] iArr = iArrFld;
                    int i14 = (int) j3;
                    iArr[i14] = iArr[i14] - i7;
                    i5 = i2;
                    i6 = i;
                }
                j3--;
            }
            i8 += 3;
            j = j3;
            f = f2;
        }
        FuzzerUtils.out.println("i i1 l = " + i8 + "," + i7 + "," + j);
        FuzzerUtils.out.println("i2 f1 i11 = " + i3 + "," + Float.floatToIntBits(f) + ",-147");
        FuzzerUtils.out.println("i12 b2 i13 = " + i4 + ",0," + i5);
        FuzzerUtils.out.println("i14 = " + i6);
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iArrFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
