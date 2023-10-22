/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/510/original-510/Test.dex */
public class Test {
    public static final int N = 400;
    public volatile double[] dArrFld = new double[N];
    public static long instanceCount = 0;
    public static int iFld = 14;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long j, long j2, short s) {
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(iArr, -54799);
        FuzzerUtils.init(fArr, 123.983f);
        FuzzerUtils.init(dArr, 88.119575d);
        int i = 140;
        float f = -1.342f;
        float f2 = -69.135f;
        float f3 = 12.668f;
        int i2 = 1;
        while (true) {
            i2++;
            if (i2 < 159) {
                f += i2 + i2;
                f2 = i2;
                while (f2 < 10.0f) {
                    f2 += 1.0f;
                    int i3 = (int) f2;
                    double d = dArr[i3];
                    double d2 = s;
                    Double.isNaN(d2);
                    dArr[i3] = d + d2;
                    i *= (int) f;
                    instanceCount = 50613;
                    f3 = 1.0f;
                }
            } else {
                vMeth2_check_sum += j + j2 + s + i2 + Float.floatToIntBits(f) + Float.floatToIntBits(f2) + i + Float.floatToIntBits(f3) + 50613 + 0 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                return;
            }
        }
    }

    public static void vMeth1(int i) {
        int i2;
        int i3;
        int[] iArr = new int[N];
        short[] sArr = new short[N];
        FuzzerUtils.init(iArr, 32);
        FuzzerUtils.init(sArr, (short) -27132);
        long j = instanceCount + 1;
        instanceCount = j;
        byte b = (byte) j;
        int i4 = -11;
        int i5 = 130;
        do {
            long j2 = instanceCount;
            vMeth2(j2, j2, (short) 31255);
            i2 = 1;
            do {
                i += i2;
                i2++;
                i3 = 12;
            } while (i2 < 12);
            while (i3 > 1) {
                long j3 = instanceCount - i3;
                instanceCount = j3;
                i4 += i3;
                iFld = (int) (iFld + (((i3 * i) + j3) - i));
                i3 -= 3;
            }
            i5--;
        } while (i5 > 0);
        vMeth1_check_sum += i + b + i5 + i2 + 0 + i3 + i4 + 21 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(int i, byte b) {
        vMeth1(iFld);
        vMeth_check_sum += i + b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb A[LOOP:3: B:23:0x00e8->B:25:0x00eb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r22) {
        /*
            Method dump skipped, instructions count: 668
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
