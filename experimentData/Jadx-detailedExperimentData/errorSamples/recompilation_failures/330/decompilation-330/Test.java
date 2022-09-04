
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/330/original-330/Test.dex */
public class Test {
    public static final int N = 400;
    public static double[] dArrFld;
    public static long instanceCount = -3156;
    public static int iFld = -16;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        double[] dArr = new double[N];
        dArrFld = dArr;
        FuzzerUtils.init(dArr, 2.106392d);
    }

    public static void vMeth1(double d, int i) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        FuzzerUtils.init(iArr, 11);
        double d2 = iFld;
        Double.isNaN(d2);
        double d3 = d + d2;
        int i2 = 28953;
        int i3 = -127;
        short s = 17258;
        int i4 = 9;
        int i5 = -1;
        int i6 = 1;
        while (i4 < 396) {
            double d4 = i4;
            Double.isNaN(d4);
            d3 += d4;
            s = (short) (s + ((short) (i4 * i4)));
            i5 = 1;
            while (i5 < 4) {
                i6 = 2;
                while (true) {
                    i6--;
                    if (i6 > 0) {
                        long j = instanceCount;
                        instanceCount = j >>> 1950896498;
                        instanceCount = i6;
                        i3 = 54;
                        s = (short) j;
                    }
                }
                iArr[i5][i4] = 35521;
                long j2 = instanceCount + (i5 * i5);
                instanceCount = j2;
                i2 = -393174300;
                instanceCount = j2 * (-393174300);
                i5++;
            }
            i4++;
        }
        vMeth1_check_sum += Double.doubleToLongBits(d3) + i + i4 + i2 + s + i5 + i3 + i6 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth() {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -94);
        int i = (iFld >>> 1) % N;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        iFld = i2;
        dArrFld[(i2 >>> 1) % N] = i2;
        vMeth1(-2.76719d, i2);
        instanceCount *= iFld;
        iFld = 70;
        int i3 = 12;
        int i4 = 38841;
        int i5 = 4;
        while (i5 < 302) {
            i3 = 6;
            while (i3 > 1) {
                i4 = 2;
                i3--;
            }
            i5++;
        }
        long doubleToLongBits = ((((Double.doubleToLongBits(-2.76719d) + i5) - 65448) + i3) - 4068) + i4 + 0 + 10 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(float f, int i) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(jArr, 14L);
        int i2 = -199;
        int i3 = -63754;
        int i4 = 7;
        while (i4 < 132) {
            int i5 = iArr[i4] + 1;
            iArr[i4] = i5;
            i >>= i5;
            i2 = 1;
            while (true) {
                i2++;
                if (i2 < 13) {
                    i3 = 1;
                }
            }
            i4++;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i4 + 141 + i2 + i3 + 4 + 0 + Double.doubleToLongBits(0.79241d) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
    }

    public void mainTest(String[] strArr) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 8990460574384986545L);
        int i = 7;
        while (i < 383) {
            vMeth(0.275f, i);
            i += 3;
        }
        int i2 = iFld;
        int i3 = (i2 >>> 1) % N;
        jArr[i3] = jArr[i3] + 0.275f;
        FuzzerUtils.out.println("i i1 f1 = " + i + "," + i2 + "," + Float.floatToIntBits(0.275f));
        FuzzerUtils.out.println("s1 lArr1 = " + ((int) ((short) (1714 - ((short) i)))) + "," + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dArrFld = " + instanceCount + "," + iFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
