
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/116/original-116/Test.dex */
public class Test {
    public static int[] iArrFld;
    public int iFld = -43857;
    public static long instanceCount = -8933235804963499611L;
    public static boolean bFld = false;
    public static final int N = 400;
    public static double[] dArrFld = new double[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, 93);
        FuzzerUtils.init(dArrFld, -106.100693d);
    }

    public static void vSmallMeth(int i, int i2, int i3) {
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 60.671f);
        fArr[(i2 >>> 1) % N] = -6.0f;
        vSmallMeth_check_sum += i + i2 + i3 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(double d, float f, int i) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(jArr, 95L);
        iArr[46] = i;
        int i2 = 4;
        while (i2 < 326) {
            long j = i;
            instanceCount = j;
            instanceCount = j + j;
            i2++;
        }
        int i3 = (i2 >>> 1) % N;
        jArr[i3] = jArr[i3] & 10;
        float f2 = f;
        long j2 = 6838349389279639813L;
        int i4 = 156;
        int i5 = -44421;
        int i6 = -11;
        while (i4 > 6) {
            long j3 = instanceCount;
            iArr[i4 + 1] = (int) j3;
            i5 = (int) j3;
            f2 -= i2;
            j2 = 11;
            while (j2 > 1) {
                instanceCount += j2 - j2;
                i6 += 166;
                j2 -= 2;
            }
            i4--;
        }
        int i7 = 2;
        int i8 = -213;
        while (i7 < 201) {
            i5 += i7;
            i8 += i7 * i7;
            i7++;
        }
        vMeth1_check_sum += ((((((((Double.doubleToLongBits(d) + Float.floatToIntBits(f2)) + i) + i2) + i5) + i4) + i6) + j2) - 234) + i7 + i8 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
    }

    public static short sMeth(long j, long j2, int i) {
        long j3;
        int i2;
        int[] iArr = new int[N];
        int[][][] iArr2 = (int[][][]) Array.newInstance(int.class, N, N, N);
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 3188266214L);
        FuzzerUtils.init(iArr, 204);
        FuzzerUtils.init((Object[][]) iArr2, (Object) (-62320));
        float f = -34.42f;
        vMeth1(108.69093d, -34.42f, -35740);
        int i3 = 112;
        int i4 = 128;
        do {
            jArr[i4] = i;
            i2 = 12;
            while (i2 > i4) {
                f = (float) 108.69093d;
                i2--;
                i3 = 1;
            }
            iArr[i4] = -46295;
            i4--;
        } while (i4 > 0);
        int i5 = -41008;
        int i6 = 6;
        while (272 > i6) {
            i5 = 1;
            while (6 > i5) {
                f = 8.0f;
                i5++;
            }
            i6++;
        }
        long doubleToLongBits = (((((((((((j + j2) + j3) + Double.doubleToLongBits(108.69093d)) + Float.floatToIntBits(f)) + i4) + i2) - 38321) + i3) - 46295) + i6) - 11) + i5 + 1899 + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum((Object[][]) iArr2);
        sMeth_check_sum += doubleToLongBits;
        return (short) doubleToLongBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void vMeth(boolean z, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = 239;
        int i6 = 11;
        int i7 = -32;
        int i8 = 16;
        float f = 0.673f;
        int i9 = 10;
        while (265 > i9) {
            int i10 = i4 + 1;
            long j = instanceCount;
            vSmallMeth(i9, (int) (i4 % ((sMeth(j, j, i9) + instanceCount) | 1)), 206);
            if (z == 0) {
                i4 = i10;
            } else {
                long j2 = i9;
                instanceCount = j2;
                int[] iArr = iArrFld;
                int i11 = i9 + 1;
                iArr[i11] = iArr[i11] - i5;
                i5 = (int) (i5 + (((j2 * j2) + i3) - j2));
                i4 = i10 + i9;
            }
            float f2 = f;
            int i12 = i8;
            int i13 = i7;
            int i14 = 1;
            while (i14 < 6) {
                f2 -= (float) instanceCount;
                i13 *= i5;
                double[] dArr = dArrFld;
                double d = dArr[i14];
                double d2 = i4;
                Double.isNaN(d2);
                dArr[i14] = d + d2;
                i12 = 1;
                while (i12 < 2) {
                    if (i3 != 0) {
                        vMeth_check_sum += ((((((((i3 + z) + i4) + i9) + i5) + i14) + i13) + Float.floatToIntBits(f2)) + i12) - 201;
                        return;
                    } else {
                        i3 = (i3 * ((int) instanceCount)) - 49;
                        i12++;
                    }
                }
                i14++;
            }
            i9++;
            i6 = i14;
            i7 = i13;
            i8 = i12;
            f = f2;
        }
        vMeth_check_sum += ((((((((i3 + (z ? 1 : 0)) + i4) + i9) + i5) + i6) + i7) + Float.floatToIntBits(f)) + i8) - 201;
    }

    public void mainTest(String[] strArr) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(jArr, -7L);
        for (int i = 0; i < 204; i++) {
            vSmallMeth(960, 960, 960);
        }
        int i2 = 960 * ((int) 0.79700005f);
        vMeth(bFld, i2, i2);
        int i3 = i2 ^ i2;
        int i4 = -13;
        int i5 = 161;
        int i6 = 1;
        while (i6 < 192) {
            int i7 = ((i6 % 2) * 5) + 121;
            int i8 = 131;
            if (i7 == 126) {
                while (i8 > i6) {
                    i8--;
                    i5 = 1;
                }
                i4 = i8;
            } else if (i7 == 131) {
                i3 -= (int) (-72.86975d);
            }
            i6++;
        }
        FuzzerUtils.out.println("i3 f i30 = " + i3 + "," + Float.floatToIntBits(0.79700005f) + "," + i6);
        FuzzerUtils.out.println("i31 i32 i33 = -9," + i4 + ",-16687");
        FuzzerUtils.out.println("i34 i35 d2 = " + i5 + ",-235," + Double.doubleToLongBits(-72.86975d));
        FuzzerUtils.out.println("iArr3 lArr2 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld iFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + this.iFld);
        FuzzerUtils.out.println("Test.iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
