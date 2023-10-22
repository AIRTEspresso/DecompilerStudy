
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/44/original-44/Test.dex */
public class Test {
    public static final int N = 400;
    public static long[] lArrFld;
    public static long instanceCount = 14;
    public static int iFld = 4038;
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public short sFld = -28926;
    public volatile byte byFld = -103;

    static {
        long[] jArr = new long[N];
        lArrFld = jArr;
        FuzzerUtils.init(jArr, -1306739658L);
    }

    public static void vMeth1(int i, long j, int i2) {
        boolean[][] zArr;
        double d;
        long j2;
        int i3;
        long j3;
        int i4;
        float f;
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        boolean[][] zArr2 = (boolean[][]) Array.newInstance(boolean.class, N, N);
        FuzzerUtils.init(fArr, 0.932f);
        FuzzerUtils.init(iArr, 148);
        FuzzerUtils.init(zArr2, false);
        double d2 = 1.101138d;
        int i5 = 13;
        while (i5 < 333) {
            d2 = i;
            i5++;
        }
        int i6 = i;
        int i7 = i2;
        int i8 = 1;
        while (true) {
            int i9 = i6 + i5;
            int i10 = 1;
            while (true) {
                long j4 = i9;
                zArr = zArr2;
                long j5 = instanceCount;
                d = d2;
                i3 = i5;
                j3 = 37;
                i4 = (int) (j4 + (((i10 * j5) + i5) - j3));
                fArr[i10] = 37;
                f = (float) j5;
                iArr[i10 - 1] = i4;
                iArr[i8 - 1] = (int) j;
                i7 += i3;
                i10++;
                if (i10 >= 5) {
                    break;
                }
                i9 = i4;
                zArr2 = zArr;
                d2 = d;
                i5 = i3;
            }
            i8++;
            if (i8 >= 312) {
                vMeth1_check_sum += ((((i4 + j) + i7) + j2) - 210) + Double.doubleToLongBits(d) + i8 + i10 + j3 + Float.floatToIntBits(f) + 2 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(zArr);
                return;
            }
            i6 = i4;
            zArr2 = zArr;
            d2 = d;
            i5 = i3;
        }
    }

    public static void vMeth(int i) {
        int i2;
        long j;
        int i3 = iFld;
        vMeth1(i3, instanceCount, i3);
        int i4 = -42064;
        int i5 = 8;
        int i6 = 5;
        while (i5 < 326) {
            iFld -= i5;
            iFld = 209;
            iFld = i6;
            i4 = 1;
            do {
                long j2 = instanceCount * i;
                instanceCount = j2;
                iFld -= i;
                i2 = (int) 2.14568d;
                j = j2 << (-207);
                instanceCount = j;
                i4++;
            } while (i4 < 5);
            i6 = i2 + ((int) j);
            i <<= -244;
            i5++;
        }
        vMeth_check_sum += i + i5 + i6 + Float.floatToIntBits(-1.147f) + i4 + Double.doubleToLongBits(2.14568d);
    }

    public static void vSmallMeth(boolean z, int i) {
        lArrFld[(i >>> 1) % N] = i;
        vMeth(11);
        vSmallMeth_check_sum += (z ? 1 : 0) + i;
    }

    public void mainTest(String[] strArr) {
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, N, N);
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 13);
        FuzzerUtils.init(zArr, false);
        for (int i = 0; i < 919; i++) {
            vSmallMeth(false, iFld);
        }
        int i2 = iFld * ((int) 1.4836d);
        iFld = i2;
        iArr[2] = iArr[2] & ((int) instanceCount);
        zArr[(i2 >>> 1) % N][(i2 >>> 1) % N] = false;
        this.sFld = (short) (this.sFld * (-7948));
        instanceCount = -6202473916003642764L;
        int i3 = (i2 >>> 1) % N;
        iArr[i3] = iArr[i3] + i2;
        instanceCount = (-6202473916003642764) >>> i2;
        int i4 = 20;
        while (389 > i4) {
            i4++;
        }
        FuzzerUtils.out.println("d2 b2 i12 = " + Double.doubleToLongBits(1.4836d) + ",0," + i4);
        FuzzerUtils.out.println("i13 i14 i15 = -36699,29,7");
        FuzzerUtils.out.println("i16 i17 f2 = -110,181," + Float.floatToIntBits(0.348f));
        FuzzerUtils.out.println("iArr1 bArr1 = " + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(zArr));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld sFld = " + instanceCount + "," + iFld + "," + ((int) this.sFld));
        FuzzerUtils.out.println("byFld Test.lArrFld = " + ((int) this.byFld) + "," + FuzzerUtils.checkSum(lArrFld));
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
