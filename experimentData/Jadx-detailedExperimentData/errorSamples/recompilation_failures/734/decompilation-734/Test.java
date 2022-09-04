/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/734/original-734/Test.dex */
public class Test {
    public static final int N = 400;
    public static long[] lArrFld;
    public static long instanceCount = 7636187329640604205L;
    public static int iFld = -10;
    public static volatile float fFld = 82.154f;
    public static double dFld = -1.19911d;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        long[] jArr = new long[N];
        lArrFld = jArr;
        FuzzerUtils.init(jArr, -4617474070751630229L);
    }

    public static void vMeth1(int i, int i2) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 4);
        long j = instanceCount >> (-43501);
        instanceCount = j;
        instanceCount = j >> i2;
        float f = -36.734f;
        int i3 = i2 - ((int) (-36.734f));
        iFld -= 5502;
        int i4 = 1;
        while (true) {
            int i5 = iFld;
            int i6 = i5 | i5;
            iFld = i6;
            i3 += ((i4 * i6) + 0) - i6;
            instanceCount += (long) (-1.129212d);
            int i7 = i4 + 1;
            iArr[i7] = iArr[i7] + ((int) (-1.129212d));
            while (i4 < 6) {
                instanceCount += i4;
                f *= -1.613f;
                i4++;
            }
            fFld = -41745.0f;
            if (i7 < 296) {
                i4 = i7;
            } else {
                vMeth1_check_sum += ((((((0 + i3) + Float.floatToIntBits(f)) + i7) + Double.doubleToLongBits(-1.129212d)) + i4) - 33164) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public static float fMeth() {
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 90.17663d);
        int i = iFld;
        vMeth1(i, i);
        long doubleToLongBits = (-51488) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += doubleToLongBits;
        return (float) doubleToLongBits;
    }

    public static void vMeth(double d, int i, int i2) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 17);
        int i3 = 9;
        int i4 = -21939;
        int i5 = -14;
        short s = -13919;
        int i6 = 162;
        while (i6 > 2) {
            i3 = i6;
            while (true) {
                i5 = 29;
                if (i3 >= 29) {
                    break;
                }
                int i7 = iFld;
                iFld = i7 - 1;
                int i8 = iArr[i3];
                iArr[i3] = i8 + 1;
                i2 -= i7 + i8;
                i3 += 2;
            }
            long[] jArr = lArrFld;
            jArr[i6] = jArr[i6] + ((long) d);
            double d2 = i4;
            Double.isNaN(d2);
            double reverseBytes = Long.reverseBytes(instanceCount);
            Double.isNaN(reverseBytes);
            i2 *= (int) (-((d - d2) + reverseBytes));
            i4 += i6;
            double fMeth = fMeth() * 58278.0f;
            Double.isNaN(fMeth);
            d -= fMeth;
            double d3 = dFld;
            double d4 = i3;
            Double.isNaN(d4);
            dFld = d3 + d4;
            while (i5 > 1) {
                long j = instanceCount;
                s = (short) j;
                instanceCount = j % (-17);
                fFld = fFld;
                int i9 = i5 - 1;
                iArr[i9] = iArr[i9] + i2;
                fFld = fFld;
                i4++;
                i5 -= 3;
            }
            i6 -= 3;
        }
        vMeth_check_sum += ((((((((((Double.doubleToLongBits(d) + i) + i2) + i6) - 2) + i3) + i4) + i5) + 4982) + s) - 18) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        long j = instanceCount;
        int i = 9;
        long j2 = 9;
        long j3 = j - 1;
        instanceCount = j3;
        instanceCount = j - (((j2 + j) / (1 | j3)) - ((-28.853f) >>> ((int) (j3 + j2))));
        double d = dFld;
        int i2 = iFld;
        vMeth(d, i2, i2);
        int i3 = iFld << (-57);
        iFld = i3;
        lArrFld[(i3 >>> 1) % N] = j2;
        int i4 = -121;
        int i5 = 26540;
        int i6 = -9;
        int i7 = -223;
        int i8 = -22;
        float f = 2.677f;
        int i9 = 11;
        while (i9 < 254) {
            long j4 = i4;
            instanceCount = j4;
            int i10 = (int) j4;
            i5 = 1;
            while (true) {
                i5++;
                if (i5 >= 103) {
                    break;
                }
                i6 = 1;
            }
            int i11 = iFld - i10;
            iFld = i11;
            iFld = i11 + i6;
            f += i9 + i4;
            int i12 = 4;
            while (i12 < 103) {
                instanceCount = 228L;
                try {
                    i7 = 25 % i10;
                    iFld = (-48803) / i12;
                    i7 = (-38234) % i6;
                } catch (ArithmeticException e) {
                }
                i12 += 2;
            }
            i9++;
            i8 = i12;
            int i13 = i4;
            i4 = i10;
            i = i13;
        }
        FuzzerUtils.out.println("i f i19 = " + i + "," + Float.floatToIntBits(f) + "," + i9);
        FuzzerUtils.out.println("i20 i21 i22 = " + i4 + "," + i5 + "," + i6);
        FuzzerUtils.out.println("i23 i24 i25 = " + i7 + ",-5,-27598");
        FuzzerUtils.out.println("by1 s1 i26 = 55,16495," + i8);
        FuzzerUtils.out.println("i27 = -48803");
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + instanceCount + "," + iFld + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.dFld Test.lArrFld = " + Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
