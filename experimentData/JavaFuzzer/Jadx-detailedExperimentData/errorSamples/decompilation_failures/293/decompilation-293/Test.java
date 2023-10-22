
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/293/original-293/Test.dex */
public class Test {
    public int iFld = 6591;
    public static long instanceCount = 2322956587539681484L;
    public static float fFld = -2.775f;
    public static double dFld = 8.7092d;
    public static short sFld = 28341;
    public static final int N = 400;
    public static volatile long[] lArrFld = new long[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(lArrFld, 13748L);
    }

    public static void vMeth1(int i, int i2, int i3) {
        int[] iArr = new int[N];
        int[][][] iArr2 = (int[][][]) Array.newInstance(int.class, N, N, N);
        long[][][] jArr = (long[][][]) Array.newInstance(long.class, N, N, N);
        float[][] fArr = (float[][]) Array.newInstance(float.class, N, N);
        FuzzerUtils.init((Object[][]) jArr, (Object) 3015630487L);
        FuzzerUtils.init(fArr, -2.562f);
        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init((Object[][]) iArr2, (Object) (-10));
        int i4 = (i2 >>> 1) % N;
        jArr[i4][(i3 >>> 1) % N][i4] = i3;
        int i5 = -17;
        int i6 = -241;
        int i7 = 384;
        while (true) {
            i7 -= 2;
            if (i7 > 0) {
                int i8 = i7 - 1;
                jArr[i8][i8][i8] = i7;
                i5 = 8;
                while (i5 > i7) {
                    i5--;
                    i6 = 1;
                }
            } else {
                vMeth1_check_sum += (((((((((i + i2) + i3) + i7) + i5) - 60891) + i6) + 44) + 1) - 200) + FuzzerUtils.checkSum((Object[][]) jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum((Object[][]) iArr2);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
        if (r21 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth(boolean r21, int r22) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(boolean, int):void");
    }

    public static void vSmallMeth(int i) {
        vMeth(true, i);
        instanceCount += i;
        vSmallMeth_check_sum += i + 1;
    }

    public void mainTest(String[] strArr) {
        int i = 2;
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        FuzzerUtils.init(iArr, -132);
        for (int i2 = 0; i2 < 382; i2++) {
            vSmallMeth(-50856);
        }
        int i3 = (-146) << ((int) instanceCount);
        int i4 = 7;
        while (193 > i4) {
            i3 *= sFld;
            i4 += 2;
        }
        long[] jArr = lArrFld;
        jArr[49] = jArr[49] + i4;
        int i5 = i3 >> i3;
        int i6 = 99 << i4;
        int i7 = i5 - i5;
        int i8 = 18;
        int i9 = -3;
        int i10 = 8;
        int i11 = -11739;
        int i12 = 11;
        int i13 = 44;
        int i14 = -3;
        while (396 > i8) {
            i11 = 4;
            while (i11 < 67) {
                iArr[i8 - 1] = iArr[i8 + 1];
                int i15 = i7 & i10;
                i13 = 1;
                while (i13 < i) {
                    i12 = (2 - i13) + i10;
                    long j = instanceCount;
                    instanceCount = j + (((i13 * (-3)) + i9) - j);
                    instanceCount = i8;
                    i10 = this.iFld;
                    int[] iArr2 = iArr[i8];
                    int i16 = i11 + 1;
                    iArr2[i16] = iArr2[i16] - i15;
                    i13++;
                    i9 = -3;
                }
                i14 = i8;
                while (i14 < i) {
                    long j2 = i6;
                    instanceCount = j2;
                    int i17 = i15;
                    this.iFld = (int) (this.iFld + (i14 - j2));
                    fFld *= i17;
                    instanceCount = (-3) ^ j2;
                    i14 += 3;
                    i15 = i17;
                    iArr = iArr;
                    i = 2;
                }
                i11++;
                i7 = i15;
                iArr = iArr;
                i = 2;
                i9 = -3;
            }
            i8++;
            i = 2;
            i9 = -3;
        }
        FuzzerUtils.out.println("i18 i19 i20 = " + i7 + "," + i4 + "," + i6);
        FuzzerUtils.out.println("i21 i22 i23 = " + i8 + "," + i10 + "," + i11);
        FuzzerUtils.out.println("i24 i25 i26 = " + i12 + "," + i13 + ",-3");
        FuzzerUtils.out.println("i27 i28 b2 = " + i14 + ",-7,0");
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.sFld iFld Test.lArrFld = " + ((int) sFld) + "," + this.iFld + "," + FuzzerUtils.checkSum(lArrFld));
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
