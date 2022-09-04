
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/114/original-114/Test.dex */
public class Test {
    public static final int N = 400;
    public static float[] fArrFld;
    public static long instanceCount = 6410838818528573617L;
    public static int iFld = 13;
    public static int iFld1 = 231;
    public static boolean bFld = true;
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        float[] fArr = new float[N];
        fArrFld = fArr;
        FuzzerUtils.init(fArr, 42.196f);
    }

    public static void vMeth1() {
        int i;
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(jArr, 2603973738L);
        iFld = (int) instanceCount;
        int i2 = -32166;
        int i3 = 4;
        while (285 > i3) {
            try {
                i2 = (iArr[i3 - 1] % (-145)) / i3;
                i = (-1738862258) % iFld;
            } catch (ArithmeticException e) {
                i = i2;
            }
            int i4 = (((i3 >>> 1) % 2) * 5) + 109;
            if (i4 != 110) {
                i2 = i4 != 118 ? i : i / 18222;
            } else {
                i2 = 0;
            }
            i3++;
        }
        vMeth1_check_sum += ((((i3 + i2) + 24633) + 28969) - 6) + Double.doubleToLongBits(1.74993d) + 0 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
    }

    public static void vMeth(int i, int i2, float f) {
        double[] dArr = new double[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -6080L);
        FuzzerUtils.init(dArr, -23.37426d);
        vMeth1();
        jArr[255] = iFld;
        int i3 = i2;
        int i4 = -33757;
        int i5 = 58530;
        int i6 = 180;
        int i7 = 11;
        while (327 > i7) {
            i4 -= 823354691;
            i3 |= 8;
            int i8 = i6;
            int i9 = 1;
            while (i9 < 5) {
                i9++;
                dArr[i9] = iFld;
                int i10 = ((i7 % 2) * 5) + 50;
                if (i10 == 56) {
                    instanceCount -= 0;
                    int i11 = (i >>> 1) % N;
                    jArr[i11] = jArr[i11] >> 168;
                    i3 += (int) 1.41276d;
                    i4 = 1;
                } else if (i10 != 58) {
                    i8 = 2;
                }
                instanceCount += i7;
                i8 = 2;
            }
            i7++;
            i5 = i9;
            i6 = i8;
        }
        vMeth_check_sum += i + i3 + Float.floatToIntBits(f) + i7 + i4 + i5 + 4 + 0 + i6 + Double.doubleToLongBits(1.41276d) + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static boolean bMeth(int i) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, N, N);
        FuzzerUtils.init(bArr, (byte) -49);
        int i2 = 7;
        while (i2 < 323) {
            long j = instanceCount + 1;
            instanceCount = j;
            i = (int) j;
            i2++;
        }
        int i3 = -248;
        float f = 1.0f;
        while (true) {
            f += 1.0f;
            if (f >= 391.0f) {
                break;
            }
            i3 ^= Math.abs(14);
            vMeth(98, i, f);
        }
        iFld += i;
        long j2 = instanceCount;
        instanceCount = j2 + j2;
        int i4 = 4;
        int i5 = -203;
        byte b = 116;
        long j3 = 130;
        while (i4 < 154) {
            int i6 = iFld;
            i5 += ((i4 * i6) + i5) - i4;
            b = (byte) (b - ((byte) i6));
            j3 = 1;
            while (j3 < 11) {
                i3 = (int) j3;
                j3++;
            }
            i4++;
        }
        instanceCount = -4982L;
        long floatToIntBits = i + i2 + i3 + Float.floatToIntBits(f) + i4 + i5 + b + j3 + 32545 + 1 + FuzzerUtils.checkSum(bArr);
        bMeth_check_sum += floatToIntBits;
        return floatToIntBits % 2 > 0;
    }

    public void mainTest(String[] strArr) {
        int[] iArr = new int[N];
        int[] iArr2 = new int[N];
        boolean[] zArr = new boolean[N];
        short[] sArr = new short[N];
        FuzzerUtils.init(zArr, false);
        FuzzerUtils.init(iArr, -40735);
        FuzzerUtils.init(iArr2, 41);
        FuzzerUtils.init(sArr, (short) -18776);
        float f = 311.0f;
        while (true) {
            f -= 3.0f;
            if (f <= 0.0f) {
                break;
            }
            zArr[(int) f] = bMeth(iFld);
        }
        int i = 21;
        int i2 = -64;
        int i3 = -1;
        int i4 = 15918;
        int i5 = 13;
        int i6 = 200;
        while (i < 363) {
            long j = instanceCount - 27196;
            instanceCount = j;
            float[] fArr = fArrFld;
            int i7 = i + 1;
            fArr[i7] = fArr[i7] - iFld;
            instanceCount = 32499 & j;
            int i8 = i6;
            int i9 = i5;
            int i10 = i4;
            int i11 = 2;
            while (i11 < 74) {
                if (bFld) {
                    long j2 = instanceCount - 95;
                    instanceCount = j2;
                    iFld >>>= i;
                    if (((i11 % 2) * 5) + 122 == 125) {
                        long j3 = j2 + 1;
                        instanceCount = j3;
                        instanceCount = j3 * ((long) (-2.9206d));
                        iFld1 += 57;
                        i2 -= i2;
                    }
                    long j4 = instanceCount;
                    iArr2[i] = (int) j4;
                    iFld1 *= (int) j4;
                    instanceCount = j4 - iFld;
                }
                iArr2[i] = iArr2[i] - 9;
                iFld |= (int) instanceCount;
                i10 = iFld1;
                iFld1 = i10 * 9;
                i11++;
                i9 = 2;
                i8 = 2;
            }
            int i12 = i - 1;
            sArr[i12] = (short) (sArr[i12] - ((short) instanceCount));
            i3 = i11;
            i4 = i10;
            i5 = i9;
            i = i7;
            i6 = i8;
        }
        iFld = (int) instanceCount;
        iArr2[27] = iArr2[27] + iFld1;
        FuzzerUtils.out.println("f i19 i20 = " + Float.floatToIntBits(f) + "," + i + "," + i2);
        FuzzerUtils.out.println("i21 i22 i23 = " + i3 + "," + (i4 ^ i2) + "," + i5);
        FuzzerUtils.out.println("by1 d2 i24 = 96," + Double.doubleToLongBits(-2.9206d) + "," + i6);
        FuzzerUtils.out.println("bArr iArr1 iArr2 = " + FuzzerUtils.checkSum(zArr) + "," + FuzzerUtils.checkSum(iArr) + "," + FuzzerUtils.checkSum(iArr2));
        FuzzerUtils.out.println("sArr = " + FuzzerUtils.checkSum(sArr));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.iFld1 = " + instanceCount + "," + iFld + "," + iFld1);
        FuzzerUtils.out.println("Test.bFld Test.fArrFld = " + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
