/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/499/original-499/Test.dex */
public class Test {
    public static final int N = 400;
    public static int[] iArrFld;
    public static long instanceCount = 2842853334L;
    public static float fFld = 2.87f;
    public static boolean bFld = false;
    public static byte byFld = -90;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, -82);
    }

    public static long lMeth() {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 14760);
        int i = 31096;
        int i2 = 136;
        int i3 = -6;
        int i4 = 9;
        while (301 > i4) {
            i2 = 6;
            while (i2 > i4) {
                instanceCount -= 10;
                i2 -= 2;
                i3 = 1;
                i = i4;
            }
            i4++;
        }
        long checkSum = (((((i4 + i) + i2) + 10) + i3) - 55006) + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += checkSum;
        return checkSum;
    }

    public static float fMeth(int i, int i2, int i3) {
        boolean[] zArr = new boolean[N];
        long[] jArr = new long[N];
        int i4 = 0;
        FuzzerUtils.init(zArr, false);
        FuzzerUtils.init(jArr, 5L);
        double d = 1.0d;
        while (d < 181.0d) {
            long j = instanceCount + (-Math.abs((int) (-lMeth())));
            instanceCount = j;
            int i5 = (int) d;
            zArr[i5] = bFld;
            i2 *= i;
            jArr[i5] = i3;
            double d2 = byFld;
            Double.isNaN(d2);
            double d3 = j;
            Double.isNaN(d3);
            double d4 = (d2 * d) + d3;
            double d5 = i2;
            Double.isNaN(d5);
            i += (int) (d4 - d5);
            i4 = (i4 + i3) * i3;
            d += 1.0d;
        }
        long doubleToLongBits = i + i2 + i3 + Double.doubleToLongBits(d) + i4 + FuzzerUtils.checkSum(zArr) + FuzzerUtils.checkSum(jArr);
        fMeth_check_sum += doubleToLongBits;
        return (float) doubleToLongBits;
    }

    public static void vMeth(long j, long j2) {
        vMeth_check_sum += j + j2 + ((int) (-fMeth(216, 216, 216)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0143, code lost:
        if (defpackage.Test.bFld != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 878
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
