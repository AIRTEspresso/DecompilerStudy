
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/506/original-506/Test.dex */
public class Test {
    public static final int N = 400;
    public static int[] iArrFld;
    public byte byFld = 91;
    public static long instanceCount = 23228;
    public static volatile int iFld = 7599;
    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, 7026);
    }

    public static void vMeth1(byte b, long j) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 216);
        float f = 0.421f;
        double d = 0.88641d;
        int i = 0;
        long j2 = -7049337105499461961L;
        long j3 = j;
        for (int i2 = N; i < i2; i2 = N) {
            int i3 = iArr[i];
            long j4 = 1;
            long j5 = 1;
            while (true) {
                j5 += j4;
                if (j5 < 4) {
                    long j6 = i3;
                    instanceCount = j6;
                    int i4 = (int) j5;
                    iArr[i4] = -8;
                    instanceCount = j6 * j5;
                    int i5 = i3;
                    try {
                        iArr[i4] = iArr[(int) (j5 + 1)] / (-8);
                        i3 = (-48490) % iArr[i4];
                        j4 = 1;
                        try {
                            i3 = 4364 % iArr[(int) (j5 - 1)];
                        } catch (ArithmeticException e) {
                        }
                    } catch (ArithmeticException e2) {
                        j4 = 1;
                        i3 = i5;
                    }
                    f = ((float) d) - ((float) j5);
                }
            }
            int i6 = i3;
            d = -8;
            j3 -= -60462;
            int i7 = (i6 >>> 1) % N;
            iArr[i7] = iArr[i7] << (-8);
            instanceCount >>>= i6;
            i++;
            j2 = j5;
        }
        vMeth1_check_sum += ((b + j3) - 8) + j2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(int i, int i2, int i3) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 139);
        vMeth1((byte) -79, instanceCount);
        int i4 = i;
        int i5 = i2;
        long j = 21;
        int i6 = -38476;
        byte b = -79;
        int i7 = 1;
        int i8 = i3;
        while (348 > j) {
            i4 <<= (int) j;
            i7 = 1;
            while (i7 < 5) {
                long j2 = i7;
                long j3 = instanceCount + j2;
                instanceCount = j3;
                i8 = (int) (i8 + ((((float) (j2 * j3)) + 2.43f) - i4));
                instanceCount = -19491L;
                b = (byte) (b % ((byte) (((long) 104.101451d) | 1)));
                i6 = 2;
                iArr[2] = iArr[2] + i4;
                iArr[2] = i5 * (-62);
                i7++;
                i5 = -24444;
            }
            j++;
        }
        long floatToIntBits = (((((((i4 + i5) + i8) + b) + j) - 24444) + i7) - 204) + Float.floatToIntBits(2.43f) + i6 + Double.doubleToLongBits(104.101451d) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public void vMeth() {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -35);
        int i = 0;
        int i2 = -19797;
        float f = -45.487f;
        double d = 9.0d;
        while (d < 177.0d) {
            lMeth(-202, -202, -202);
            i = 1;
            while (i < 18) {
                f += i;
                i2 = 2;
                i++;
            }
            d += 2.0d;
        }
        vMeth_check_sum += (((Double.doubleToLongBits(d) - 202) + i) - 24001) + Float.floatToIntBits(f) + i2 + 31749 + Double.doubleToLongBits(0.117066d) + 115 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        long[][] jArr;
        FuzzerUtils.init((long[][]) Array.newInstance(long.class, N, N), -7148775128771739964L);
        vMeth();
        long j = 6;
        while (j < 310) {
            int[] iArr = iArrFld;
            int i = (int) j;
            iArr[i] = iArr[i] << (-7110);
            j++;
        }
        int i2 = 125;
        int i3 = -33968;
        int i4 = 45859;
        int i5 = -6;
        int i6 = 216;
        while (i2 > 6) {
            iArrFld[i2 + 1] = i2;
            instanceCount = i3;
            int i7 = 1;
            while (true) {
                i7++;
                if (i7 < 211) {
                    i3 += i7;
                    int[] iArr2 = iArrFld;
                    int i8 = i7 + 1;
                    iArr2[i8] = iArr2[i8] - ((int) j);
                    instanceCount += i7 - i3;
                    i5 = 1;
                    i6 = 2;
                }
            }
            i2--;
            i4 = i7;
        }
        FuzzerUtils.out.println("l3 i14 i15 = " + j + ",204," + i2);
        FuzzerUtils.out.println("i16 b1 i17 = " + i3 + ",0," + i4);
        FuzzerUtils.out.println("i18 i19 f3 = " + i5 + ",36753," + Float.floatToIntBits(0.798f));
        FuzzerUtils.out.println("i20 d4 lArr = " + i6 + "," + Double.doubleToLongBits(-3.93295d) + "," + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("Test.instanceCount byFld Test.iFld = " + instanceCount + "," + ((int) this.byFld) + "," + iFld);
        FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
