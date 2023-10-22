/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/162/original-162/Test.dex */
public class Test {
    public static final int N = 400;
    public volatile int iFld = 9;
    public static long instanceCount = 11;
    public static float fFld = 1.846f;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -2223656525721366550L);
        FuzzerUtils.init(iArr, 88);
        int i = 228;
        int i2 = 13;
        short s = 62;
        int i3 = 5;
        while (i3 < 181) {
            s = (short) (s >>> ((short) instanceCount));
            instanceCount = i;
            i += (int) ((i3 * i3) - 42);
            i2 = 9;
            while (i2 > 1) {
                i = (int) 27.65f;
                i2 -= 3;
            }
            i3++;
        }
        long floatToIntBits = ((((i3 + i) + s) + i2) - 48284) + Float.floatToIntBits(27.65f) + 14 + 0 + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += floatToIntBits;
        return (float) floatToIntBits;
    }

    public static void vMeth1(int i, int i2) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 8558);
        float fMeth = (-39.956f) - fMeth();
        int i3 = 46;
        int i4 = 9;
        int i5 = 239;
        int i6 = -172;
        int i7 = 62;
        int i8 = 1;
        while (true) {
            i8++;
            if (i8 < 331) {
                i3 = 1;
                while (true) {
                    i3 += 3;
                    if (i3 < 5) {
                        i7 += i3 + i7;
                        fMeth -= -47;
                        iArr[i8 + 1] = i8;
                        i4 = i8;
                        while (i4 < 5) {
                            i += i4;
                            int i9 = i8 - 1;
                            iArr[i9] = iArr[i9] + i6;
                            i4++;
                        }
                        i5 = -58;
                        iArr[i3] = (int) fFld;
                        instanceCount = 58632L;
                        i6 = i3;
                    }
                }
            } else {
                vMeth1_check_sum += (((((i + i7) + Float.floatToIntBits(fMeth)) + i8) + i3) - 47) + i4 + i5 + i6 + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public void vMeth(long j, int i) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -3);
        vMeth1(44170, i);
        int i2 = 11;
        while (202 > i2) {
            j >>= 2135098574;
            iArr[i2] = iArr[i2] << i2;
            i2++;
        }
        iArr[19] = iArr[19] * i;
        long j2 = 1;
        long j3 = 20;
        vMeth_check_sum += j + j2 + i2 + j3 + j3 + 1515 + j2 + 51 + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -11272);
        vMeth(instanceCount, this.iFld);
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld iFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + this.iFld);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
