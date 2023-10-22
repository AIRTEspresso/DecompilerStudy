/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/508/original-508/Test.dex */
public class Test {
    public static long instanceCount = 49446;
    public static int iFld = -2975;
    public static boolean bFld = true;
    public static int iFld1 = 222;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(iArrFld, 13);
        FuzzerUtils.init(lArrFld, 135268376471142250L);
    }

    public static int iMeth(int i, long j) {
        int i2 = 7;
        int i3 = -141;
        int i4 = 0;
        byte b = 8;
        int i5 = 1;
        while (true) {
            i5++;
            if (i5 >= 320) {
                long j2 = i + j + i5 + i2 + 25573 + b + i3 + 56119 + i4 + 25139;
                iMeth_check_sum += j2;
                return (int) j2;
            }
            iArrFld[2] = b;
            b = (byte) (b * ((byte) 25573));
            i3 = i5;
            while (i3 < 5) {
                i = (int) instanceCount;
                i3++;
                lArrFld[i3] = 2889189745785352286L;
                i4 = 1;
            }
            i2 = 1;
        }
    }

    public static void vMeth1(int i, float f, long j) {
        iArrFld[(i >>> 1) % N] = (int) ((i * 1.726f) - (iMeth(iFld, j) + f));
        vMeth1_check_sum += ((((((((i + Float.floatToIntBits(f)) + j) + Double.doubleToLongBits(-108.36446d)) - 3438) - 126) - 49) + 0) - 14) + 0 + ((short) (((short) j) - 3483));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r2 != 57) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth(int r18) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r21) {
        /*
            Method dump skipped, instructions count: 608
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
