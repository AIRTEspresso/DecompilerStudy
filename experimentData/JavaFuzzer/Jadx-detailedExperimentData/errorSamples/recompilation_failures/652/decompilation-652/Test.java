/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/652/original-652/Test.dex */
public class Test {
    public static final int N = 400;
    public static int[] iArrFld;
    public int iFld1 = -6;
    public static long instanceCount = 1818248298180143934L;
    public static double dFld = -1.1715d;
    public static int iFld = 2;
    public static boolean bFld = true;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, 189);
    }

    public static void vMeth(long j, int i, long j2) {
        int i2;
        int i3;
        int i4 = 1;
        do {
            i2 = 1;
            while (i2 < 5) {
                double d = dFld;
                int[] iArr = iArrFld;
                iArr[i4] = iArr[i4] - 1;
                j2 += i3 - i4;
                double d2 = j2;
                Double.isNaN(d2);
                dFld = d * d2;
                i2++;
            }
            i4++;
        } while (i4 < 372);
        vMeth_check_sum += ((((j + i) + j2) + i4) + i2) - 104;
    }

    public static int iMeth(int i) {
        vMeth(1555838649L, -8, instanceCount);
        int i2 = 1;
        do {
            i2++;
        } while (i2 < 368);
        short s = 5878;
        int i3 = 1;
        while (true) {
            i3++;
            if (i3 >= 125) {
                long j = (-33293) + i2 + 33 + 1 + i3 + s + 2;
                iMeth_check_sum += j;
                return (int) j;
            }
            s = (short) (((short) (s + ((short) (i3 ^ i2)))) + ((short) i2));
        }
    }

    public static long lMeth(int i) {
        boolean[] zArr = new boolean[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(zArr, false);
        FuzzerUtils.init(jArr, -46L);
        boolean z = zArr[45];
        int i2 = -5;
        long j = -5;
        instanceCount = j;
        vMeth(Math.min(j, ((-5) - (-1.472f)) << iMeth(-45840)), -5, 0L);
        int i3 = 58;
        int i4 = -9;
        int i5 = 9;
        while (i5 < 328) {
            instanceCount = -177L;
            int i6 = i4;
            float f = i5;
            i3 = i5;
            while (i3 < 5) {
                i += i3;
                f += i6;
                i6 += (int) f;
                i2 -= 43;
                jArr[i5] = jArr[i5] * i3;
                i3++;
            }
            i5++;
            i4 = i6;
        }
        long checkSum = i + (z ? 1 : 0) + i2 + i5 + 11488 + 20268 + i3 + i4 + FuzzerUtils.checkSum(zArr) + FuzzerUtils.checkSum(jArr);
        lMeth_check_sum += checkSum;
        return checkSum;
    }

    public void mainTest(String[] strArr) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 3697874498L);
        long j = instanceCount;
        long j2 = j - 1;
        instanceCount = j2;
        dFld = j;
        instanceCount = j2 - lMeth(iFld);
        int[] iArr = iArrFld;
        int i = this.iFld1;
        iArr[(i >>> 1) % N] = i;
        jArr[(iFld >>> 1) % N] = (long) dFld;
        int i2 = -171;
        int i3 = 28696;
        int i4 = -8;
        int i5 = -23;
        int i6 = -186;
        float f = 2.345f;
        int i7 = 9;
        while (i7 < 254) {
            this.iFld1 = i2;
            iFld *= (int) dFld;
            i2 = i2 + (i7 | i2) + i7;
            i3 = i7;
            while (i3 < 103) {
                long j3 = i3;
                long j4 = instanceCount - j3;
                instanceCount = j4;
                this.iFld1 *= 1;
                i4 = (i4 * 14398) + 63512;
                int i8 = ((i3 % 2) * 5) + 87;
                if (i8 == 89) {
                    i2 *= iFld;
                    i5 = (int) j4;
                    i6 = 1;
                } else if (i8 == 93) {
                    f += (float) (((j3 * j4) + i5) - j4);
                    bFld = bFld;
                    iFld = i4;
                }
                i3++;
            }
            i7++;
        }
        FuzzerUtils.out.println("i14 i15 i16 = " + i7 + "," + i2 + "," + i3);
        FuzzerUtils.out.println("i17 f2 i18 = " + i4 + "," + Float.floatToIntBits(f) + "," + i5);
        FuzzerUtils.out.println("i19 i20 lArr1 = " + i6 + ",-40013," + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + iFld);
        FuzzerUtils.out.println("iFld1 Test.bFld Test.iArrFld = " + this.iFld1 + "," + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
