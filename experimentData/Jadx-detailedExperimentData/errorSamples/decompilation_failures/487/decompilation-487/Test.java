
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/487/original-487/Test.dex */
public class Test {
    public static int[] iArrFld;
    public boolean bFld = false;
    public static long instanceCount = -4;
    public static final int N = 400;
    public static long[] lArrFld = new long[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, -2);
        FuzzerUtils.init(lArrFld, -10L);
    }

    public static int iMeth1(long j, int i, byte b) {
        int i2 = 42003;
        int i3 = 28126;
        int i4 = 10176;
        float f = 2.306f;
        float f2 = 1.427f;
        double d = -4.13259613189912E9d;
        double d2 = 11.0d;
        while (d2 < 193.0d) {
            double d3 = j;
            Double.isNaN(d3);
            d -= d3;
            i = (int) instanceCount;
            float f3 = f2;
            float f4 = 1.0f;
            while (f4 < 9.0f) {
                b = (byte) (b - ((byte) i2));
                i = (i + i2) >> (-63294);
                f3 = i;
                j = 1;
                i4 = 2;
                i3 = 0;
                f4 += 1.0f;
                i2 = 2;
            }
            d2 += 1.0d;
            f = f4;
            f2 = f3;
        }
        long doubleToLongBits = j + i + b + Double.doubleToLongBits(d) + Double.doubleToLongBits(d2) + i2 + Float.floatToIntBits(f) + i3 + i4 + Float.floatToIntBits(f2);
        iMeth1_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth() {
        long[] jArr = new long[N];
        float[] fArr = new float[N];
        short[][] sArr = (short[][]) Array.newInstance(short.class, N, N);
        FuzzerUtils.init(fArr, 1.714f);
        FuzzerUtils.init(jArr, -5L);
        FuzzerUtils.init(sArr, (short) -1036);
        fArr[283] = 1462890 + iMeth1(121L, -44330, (byte) 116);
        instanceCount *= 3;
        vMeth_check_sum += ((((((((((-44330) + 121) + 116) + 51618) + 19378) + 21) - 3) + 3) - 60757) - 7) + 0 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(sArr);
    }

    public int iMeth(int i, long j) {
        int i2 = 214;
        int i3 = -2601;
        float f = 89.452f;
        int i4 = 5;
        while (i4 < 144) {
            vMeth();
            i3 = 11;
            int[] iArr = iArrFld;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] << i2;
            i2 -= 11;
            f *= i4;
            iArr[12] = (int) j;
            i4++;
        }
        long floatToIntBits = (((((i + j) + i4) + i2) + i3) - 46) + 1 + Float.floatToIntBits(f);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r23) {
        /*
            Method dump skipped, instructions count: 740
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
