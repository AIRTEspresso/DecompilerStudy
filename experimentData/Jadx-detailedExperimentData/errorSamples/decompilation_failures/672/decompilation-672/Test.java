
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/672/original-672/Test.dex */
public class Test {
    public static long instanceCount = -6583368440205385030L;
    public static long lFld = -211;
    public static volatile float fFld = -6.953f;
    public static float fFld1 = 1.24f;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];
    public static short[] sArrFld = new short[N];
    public static double[][] dArrFld = (double[][]) Array.newInstance(double.class, N, N);
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        FuzzerUtils.init(fArrFld, 0.873f);
        FuzzerUtils.init(sArrFld, (short) 32457);
        FuzzerUtils.init(dArrFld, 124.127783d);
    }

    public static void vMeth() {
        int i;
        int i2;
        int i3;
        int[] iArr = new int[N];
        double[] dArr = new double[N];
        long[] jArr = new long[N];
        long[] jArr2 = new long[N];
        FuzzerUtils.init(jArr, -3L);
        FuzzerUtils.init(jArr2, 157226804L);
        FuzzerUtils.init(iArr, -10);
        FuzzerUtils.init(dArr, 66.125295d);
        int i4 = (int) (-2.10339d);
        short s = (short) (((short) i4) - 20717);
        int i5 = -189;
        int i6 = 33739;
        byte b = 112;
        float f = 0.938f;
        switch (((i4 >>> 1) % 10) + 87) {
            case 87:
                i3 = 9;
                i2 = 231;
                i = -5;
                while (i3 < 282) {
                    i2 = i3;
                    while (i2 < 6) {
                        b = (byte) (b * b);
                        i5 = i2;
                        while (i5 < 1) {
                            long j = jArr[i3];
                            long j2 = instanceCount;
                            jArr[i3] = j + j2;
                            long j3 = j2 / 180;
                            instanceCount = j3;
                            i4 = i6 >> ((int) j3);
                            int i7 = i2 - 1;
                            jArr2[i7] = jArr2[i7] - j3;
                            i6 = (int) j3;
                            int i8 = i5 - 1;
                            jArr2[i8] = jArr2[i8] >>> i3;
                            i5++;
                            i = -29;
                        }
                        i2++;
                    }
                    i3++;
                }
                break;
            case 88:
                i6 = (int) lFld;
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            case 89:
                iArr[8] = iArr[8] * ((int) instanceCount);
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            case 90:
                iArr[353] = 112;
            case 91:
                f = -2.47188813E9f;
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            case 92:
                i6 = 33751;
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            case 93:
                lFld = lFld;
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            case 94:
                lFld = 33739;
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            case 95:
                dArr[69] = 25.503000259399414d;
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            case 96:
                i4 *= 33739;
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
            default:
                float[] fArr = fArrFld;
                fArr[42] = fArr[42] - (-189);
                i3 = -12;
                i2 = 231;
                i = -5;
                break;
        }
        vMeth_check_sum += ((((i4 + Double.doubleToLongBits(-2.10339d)) + s) + i3) - 29) + i2 + i + b + i5 + i6 + Float.floatToIntBits(f) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(jArr2) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011e A[LOOP:0: B:3:0x002b->B:46:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int iMeth1(int r17, long r18, int r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.iMeth1(int, long, int):int");
    }

    public static int iMeth(long j) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 107);
        iArr[75] = iArr[75] & iMeth1(-11946, lFld, 221);
        lFld += (long) (-122.92781d);
        int i = ((int) j) - 11946;
        int i2 = -43802;
        int i3 = -5392;
        byte b = 100;
        int i4 = 7;
        while (i4 < 164) {
            long j2 = lFld + (i4 | (-29950));
            lFld = j2;
            int i5 = ((i4 % 2) * 5) + 103;
            if (i5 == 106) {
                i2 = i;
            } else if (i5 == 112) {
                int i6 = 1;
                if ((((i2 >>> 1) % 1) * 5) + 126 == 128) {
                    b = (byte) (b - ((byte) j2));
                    i2 = (i2 & i) + i;
                }
                i += i4;
                while (i6 < 10) {
                    i = (i >> 80) + 80;
                    i6++;
                }
                i3 = i6;
            }
            i4++;
        }
        long doubleToLongBits = j + i + Double.doubleToLongBits(-122.92781d) + i4 + i2 + b + i3 + 80 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        int i3;
        int[] iArr = new int[N];
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, N, N);
        float[][] fArr = (float[][]) Array.newInstance(float.class, N, N);
        FuzzerUtils.init(bArr, (byte) -104);
        FuzzerUtils.init(iArr, -57864);
        FuzzerUtils.init(fArr, 2.678f);
        int i4 = -51413;
        int i5 = 2;
        while (373 > i5) {
            byte[] bArr2 = bArr[i5];
            int i6 = i5 - 1;
            bArr2[i6] = (byte) (bArr2[i6] - ((byte) iMeth(lFld)));
            i4 = (int) (i4 + (i5 ^ lFld));
            i5 += 3;
        }
        iArr[(i5 >>> 1) % N] = i4;
        int i7 = 4;
        int i8 = 60;
        int i9 = -7;
        int i10 = 147;
        int i11 = 12;
        int i12 = -22708;
        byte b = -98;
        double d = 2.127295d;
        int i13 = 3;
        short s = 7029;
        while (i13 < 278) {
            int i14 = i13 + 1;
            double[] dArr = dArrFld[i14];
            double d2 = dArr[i14];
            byte[][] bArr3 = bArr;
            float[][] fArr2 = fArr;
            double d3 = i8;
            Double.isNaN(d3);
            dArr[i14] = d2 + d3;
            int i15 = 91;
            while (i15 > 3) {
                fFld1 += i13;
                switch ((i13 % 4) + 25) {
                    case 25:
                        lFld <<= i8;
                        instanceCount += i15 * i15;
                        i4 = i5;
                        i10 = i10;
                        i11 = 2;
                        break;
                    case 26:
                        i = i11;
                        instanceCount -= 3074;
                        int i16 = i7;
                        i2 = i5;
                        int i17 = i8;
                        int i18 = 1;
                        while (i18 < 2) {
                            if ((i13 % 1) + 84 == 84) {
                                fFld *= fFld;
                                byte b2 = (byte) (b + ((byte) (i18 * i18)));
                                try {
                                    i16 = i13 / i16;
                                    i8 = i5 / (i15 % iArr[i14]);
                                } catch (ArithmeticException e) {
                                }
                                b = b2;
                                i17 = i;
                            } else {
                                i2 += (i18 * i18) - 121;
                            }
                            i18++;
                        }
                        i12 = i18;
                        int i19 = i16;
                        i3 = i17;
                        i7 = i19;
                        d *= -177.0d;
                        i10 = i3;
                        i4 = i2;
                        i11 = i;
                        break;
                    case 27:
                        i = i11;
                        i3 = i10;
                        i2 = i5;
                        d *= -177.0d;
                        i10 = i3;
                        i4 = i2;
                        i11 = i;
                        break;
                    case 28:
                        s = (short) (s + ((short) (((i15 * lFld) + i13) - i5)));
                        i4 = i5;
                        i10 = i10;
                        i11 = i11;
                        break;
                    default:
                        i7 -= 44;
                        i4 = i5;
                        break;
                }
                i15--;
            }
            i13 = i14;
            fArr = fArr2;
            i9 = i15;
            bArr = bArr3;
        }
        FuzzerUtils.out.println("i i1 i19 = " + i5 + "," + i4 + "," + i13);
        FuzzerUtils.out.println("i20 i21 i22 = " + i8 + "," + i9 + "," + i10);
        FuzzerUtils.out.println("i23 by4 i24 = " + i11 + "," + ((int) b) + "," + i12);
        FuzzerUtils.out.println("i25 d3 s2 = " + i7 + "," + Double.doubleToLongBits(d) + "," + ((int) s));
        FuzzerUtils.out.println("byArr iArr3 fArr = " + FuzzerUtils.checkSum(bArr) + "," + FuzzerUtils.checkSum(iArr) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.fFld = " + instanceCount + "," + lFld + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.fFld1 Test.fArrFld Test.sArrFld = " + Float.floatToIntBits(fFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
