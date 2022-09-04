
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/401/original-401/Test.dex */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -3;
    public static volatile int iFld = 45;
    public static boolean bFld = true;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public short sFld = -53;
    public double dFld = 15.60691d;
    public long lFld = 39544;
    public int iFld1 = 50;
    public int[] iArrFld = new int[N];
    public volatile byte[] byArrFld = new byte[N];

    public static void vMeth1() {
        int i = -85;
        float f = 1.0f;
        while (true) {
            f += 1.0f;
            if (f < 152.0f) {
                i = 1;
                do {
                    iFld *= i;
                    iFld += (int) ((i * i) + 2.867f);
                    i++;
                } while (i < 10);
                instanceCount++;
            } else {
                vMeth1_check_sum += Float.floatToIntBits(f) + i;
                return;
            }
        }
    }

    public static float fMeth() {
        int[] iArr = new int[N];
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, N, N);
        byte[] bArr = new byte[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, 212);
        FuzzerUtils.init(iArr2, 210);
        FuzzerUtils.init(bArr, (byte) -19);
        FuzzerUtils.init(fArr, -60.757f);
        int i = -21214;
        int i2 = 1;
        while (true) {
            i2++;
            if (i2 < 243) {
                int i3 = i2 - 1;
                iFld <<= iArr[i3];
                vMeth1();
                iFld <<= 13;
                iArr[i3] = iArr[i3] + ((int) instanceCount);
                if (bFld) {
                    iFld += (int) instanceCount;
                    i = i2;
                    while (i < 7) {
                        int i4 = i - 1;
                        bArr[i4] = (byte) (bArr[i4] | ((byte) 12));
                        i++;
                    }
                    iFld >>= (int) instanceCount;
                }
            } else {
                long checkSum = i2 + i + 12 + 3 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(bArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                fMeth_check_sum += checkSum;
                return (float) checkSum;
            }
        }
    }

    public static void vMeth(float f, boolean z, long j) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, 142);
        FuzzerUtils.init(jArr, 64395L);
        float f2 = f;
        long j2 = j;
        long j3 = -8;
        int i = -9;
        int i2 = -58687;
        int i3 = 8;
        int i4 = 4;
        while (i4 < 389) {
            long j4 = 1;
            long j5 = 1;
            while (true) {
                j5 += j4;
                if (j5 >= 4) {
                    break;
                }
                long j6 = i << (i + 1);
                instanceCount += j6;
                int i5 = i4 - 1;
                iArr[i5] = iArr[i5] - ((int) ((((float) j2) + fMeth()) * i4));
                i = (int) (j6 + ((j5 * j5) - 12351));
                int i6 = (int) (j5 - j4);
                jArr[i6] = jArr[i6] * (-52);
                j4 = 1;
            }
            i2 = 4;
            while (i2 > 1) {
                i3 += (int) ((i2 * i2) - 31.128f);
                iFld = (int) (iFld + (i2 - f2));
                i = (int) j5;
                instanceCount = i3;
                i2--;
                j2 = j5;
            }
            f2 *= i2;
            instanceCount = iFld;
            i4++;
            j3 = j5;
        }
        vMeth_check_sum += ((((((Float.floatToIntBits(f2) + (z ? 1 : 0)) + j2) + i4) + i) + j3) - 52) + i2 + i3 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
    }

    public void mainTest(String[] strArr) {
        int[][] iArr;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, N, N);
        float[] fArr = new float[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -61816L);
        FuzzerUtils.init(fArr, -63.757f);
        FuzzerUtils.init(iArr2, 243);
        int[] iArr3 = this.iArrFld;
        this.iArrFld = iArr3;
        this.iArrFld = iArr3;
        byte[] bArr = this.byArrFld;
        int i = -51019;
        byte b = (byte) (bArr[207] >>> ((byte) ((-51019) * instanceCount)));
        bArr[207] = b;
        int i2 = (b * 255842) & (-19681);
        float f = 65.63f;
        int i3 = 1;
        while (true) {
            double d = i3;
            Double.isNaN(d);
            iArr = iArr2;
            double reverseBytes = Integer.reverseBytes(i3);
            Double.isNaN(reverseBytes);
            f *= (float) (((d - 18.102586d) - (-8.0d)) + reverseBytes);
            i *= 14;
            double d2 = i;
            Double.isNaN(d2);
            i2 <<= (int) (18.102586d - d2);
            if (i2 >= -11) {
                instanceCount -= i2;
            }
            i3++;
            if (i3 >= 133) {
                break;
            }
            iArr2 = iArr;
        }
        vMeth(f, bFld, instanceCount);
        int i4 = 12;
        int i5 = 0;
        int i6 = -10;
        int i7 = 10;
        int i8 = 7;
        while (i4 < 212) {
            int[] iArr4 = this.iArrFld;
            int i9 = i4 + 1;
            iArr4[i9] = iArr4[i9] & i;
            int i10 = i2;
            int i11 = i;
            int i12 = i8;
            int i13 = 7;
            while (i13 < 126) {
                i10 += i13;
                i13++;
                i11 = (int) (this.sFld + (i13 | instanceCount));
                i4 = i4;
                i12 = 2;
            }
            int i14 = i4;
            int i15 = (i3 >>> 1) % N;
            long j = instanceCount;
            jArr[i15] = j;
            float f2 = ((float) j) * f;
            instanceCount = i10;
            int i16 = 1;
            do {
                i6 -= i14;
                i16++;
            } while (i16 < 126);
            f = f2;
            i7 = i16;
            i5 = i13;
            i2 = i10;
            i4 = i9;
            i = i11;
            i8 = i12;
        }
        FuzzerUtils.out.println("i i1 by = " + i2 + "," + i + ",-11");
        FuzzerUtils.out.println("i2 f i14 = " + i3 + "," + Float.floatToIntBits(f) + "," + i4);
        FuzzerUtils.out.println("i15 i16 i17 = 28123," + i5 + "," + i6);
        FuzzerUtils.out.println("i18 i19 lArr = " + i8 + "," + i7 + "," + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("fArr1 iArr3 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + instanceCount + "," + iFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("sFld dFld lFld = " + ((int) this.sFld) + "," + Double.doubleToLongBits(this.dFld) + "," + this.lFld);
        FuzzerUtils.out.println("iFld1 iArrFld byArrFld = " + this.iFld1 + "," + FuzzerUtils.checkSum(this.iArrFld) + "," + FuzzerUtils.checkSum(this.byArrFld));
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
