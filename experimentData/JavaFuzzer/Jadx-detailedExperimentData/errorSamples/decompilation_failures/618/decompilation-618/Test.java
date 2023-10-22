
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/618/original-618/Test.dex */
public class Test {
    public static float[][] fArrFld;
    public static long instanceCount = 13;
    public static volatile byte byFld = -72;
    public static float fFld = 0.89f;
    public static volatile int iFld = 98;
    public static final int N = 400;
    public static double[] dArrFld = new double[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public volatile int iFld1 = 64985;
    public int[] iArrFld = new int[N];

    static {
        float[][] fArr = (float[][]) Array.newInstance(float.class, N, N);
        fArrFld = fArr;
        FuzzerUtils.init(fArr, 65.468f);
        FuzzerUtils.init(dArrFld, -46.37529d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    public static void vMeth1(int i) {
        int i2;
        int i3;
        short s;
        long[] jArr = new long[N];
        boolean[] zArr = new boolean[N];
        boolean z = true;
        FuzzerUtils.init(zArr, true);
        FuzzerUtils.init(jArr, -7L);
        int i4 = 2;
        int i5 = -6;
        int i6 = -13;
        int i7 = i;
        long j = -40391;
        double d = 0.63859d;
        byte b = 4;
        int i8 = -33451;
        short s2 = -32498;
        while (b < 312) {
            fFld += (float) (((byFld * b) + i7) - instanceCount);
            i5 += b ^ i6;
            long j2 = 1;
            boolean z2 = z;
            i6 = i6;
            while (true) {
                int i9 = b + 1;
                zArr[i9] = z2;
                short s3 = (short) (s2 - ((short) d));
                i2 = (int) j2;
                for (?? r2 = z2; i2 < r2; r2 = 1) {
                    i5 &= i2;
                    double d2 = i2;
                    Double.isNaN(d2);
                    d *= d2;
                    i4 = (int) (i4 + (i2 | instanceCount));
                    fFld = -217.0f;
                    i6 = (i6 << 6) << i5;
                    i2 += 2;
                    i7 = i7;
                    i9 = i9;
                    s3 = s3;
                }
                i3 = i9;
                s = s3;
                i7 *= 1649972010;
                j2++;
                if (j2 >= 5) {
                    break;
                }
                s2 = s;
                z2 = true;
                i6 = i6;
            }
            j = j2;
            i8 = i2;
            b = i3;
            s2 = s;
            z = true;
        }
        vMeth1_check_sum += i7 + b + i5 + i6 + j + 1 + s2 + Double.doubleToLongBits(d) + i8 + i4 + FuzzerUtils.checkSum(zArr) + FuzzerUtils.checkSum(jArr);
    }

    public static void vMeth(int i) {
        int i2 = i + ((i - 1) * i);
        int i3 = 10396;
        int i4 = -28928;
        short s = 11447;
        double d = -64.1845d;
        int i5 = 11;
        while (i5 < 277) {
            byte b = byFld;
            byFld = (byte) (b + 1);
            s = Short.reverseBytes((short) (b >>> ((int) (instanceCount - i2))));
            i3 >>= i5;
            vMeth1(-192);
            i4 = i5;
            while (i4 < 12) {
                instanceCount %= i4 | 1;
                d = 1.0d;
                i4++;
            }
            i5 += 2;
        }
        vMeth_check_sum += i2 + i5 + i3 + s + i4 + 41455 + Double.doubleToLongBits(d) + 47385;
    }

    public static void vSmallMeth(long j) {
        vMeth(iFld);
        iFld <<= iFld;
        vSmallMeth_check_sum += j;
    }

    public void mainTest(String[] strArr) {
        long[] jArr;
        FuzzerUtils.init(new long[N], 5566697705650767690L);
        for (int i = 0; i < 868; i++) {
            vSmallMeth(instanceCount);
        }
        int i2 = 26453 - ((int) instanceCount);
        float[][] fArr = fArrFld;
        int i3 = (i2 >>> 1) % N;
        fArr[i3][i3] = iFld;
        int i4 = -9;
        try {
            i4 = this.iArrFld[3] % 1307249648;
            try {
                this.iArrFld[5] = this.iArrFld[5] / i4;
                i2 = 4;
            } catch (ArithmeticException e) {
                i2 = 4;
            }
        } catch (ArithmeticException e2) {
        }
        fFld -= (float) instanceCount;
        this.iArrFld[(this.iFld1 >>> 1) % N] = -48399;
        FuzzerUtils.out.println("i12 i13 i14 = " + i2 + ",4," + i4);
        FuzzerUtils.out.println("b1 l2 i15 = 1,-113,-34446");
        FuzzerUtils.out.println("i16 i17 i18 = 5,-43289,-11");
        FuzzerUtils.out.println("i19 i20 i21 = -232,5,-238");
        FuzzerUtils.out.println("i22 i23 i24 = 141,6,-34");
        FuzzerUtils.out.println("i25 s2 lArr1 = 4,30430," + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.fFld = " + instanceCount + "," + ((int) byFld) + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.iFld iFld1 Test.fArrFld = " + iFld + "," + this.iFld1 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("iArrFld Test.dArrFld = " + FuzzerUtils.checkSum(this.iArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
