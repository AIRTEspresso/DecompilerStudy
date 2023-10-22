
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/559/original-559/Test.dex */
public class Test {
    public static final int N = 400;
    public int[] iArrFld = new int[N];
    public static volatile long instanceCount = -167;
    public static int iFld = -11;
    public static boolean bFld = true;
    public static byte byFld = -98;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 9);
        instanceCount *= iFld;
        int i = 4581;
        int i2 = 62334;
        int i3 = 1155;
        int i4 = 5;
        double d = -85.40773d;
        float f = -131.881f;
        int i5 = 4;
        while (162 > i5) {
            i2 = i5;
            while (i2 < 10) {
                d += d;
                iFld += i2;
                i3 = i2;
                while (i3 < 1) {
                    i *= (int) d;
                    f *= (float) instanceCount;
                    try {
                        iArr[i5 + 1] = i5 % i4;
                        i4 = iArr[i5] / i3;
                        iArr[1] = -113;
                    } catch (ArithmeticException e) {
                    }
                    i3++;
                }
                instanceCount += (i2 * i2) - 2;
                i2++;
            }
            i5++;
        }
        long floatToIntBits = 12653 + Float.floatToIntBits(f) + i5 + i + i2 + 3 + Double.doubleToLongBits(d) + i3 + 13 + i4 + 0 + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static void vMeth1(long j, long j2) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        FuzzerUtils.init(iArr, 0);
        double dMeth = dMeth();
        double d = iFld;
        Double.isNaN(d);
        long j3 = j2 & ((long) (dMeth * d));
        int i = -6463;
        int i2 = -5415;
        int i3 = -44639;
        float f = 38.1011f;
        int i4 = 7;
        while (i4 < 184) {
            float f2 = 1.0f;
            while (true) {
                f2 += 1.0f;
                if (f2 < 9.0f) {
                    int[] iArr2 = iArr[i4];
                    int i5 = (int) f2;
                    iArr2[i5] = iArr2[i5] - i4;
                    iFld = 1439344382;
                    if (bFld) {
                        i = -13;
                        i2 = 1;
                        break;
                    }
                    j++;
                    i3 += (int) (((1439344382 * f2) + byFld) - ((float) instanceCount));
                    iFld -= 23448;
                    i = 1;
                    i2 = 1;
                }
            }
            instanceCount += 14;
            i4++;
            f = f2;
        }
        vMeth1_check_sum += j + j3 + i4 + i + Float.floatToIntBits(f) + i2 + i3 + 23448 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i, float f) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -50647L);
        jArr[272] = jArr[272] / ((-i) | 1);
        vMeth1(28592L, 28592L);
        vMeth_check_sum += iFld + Float.floatToIntBits(f) + 28592 + FuzzerUtils.checkSum(jArr);
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        float[] fArr = new float[N];
        byte[] bArr = new byte[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(fArr, -2.179f);
        FuzzerUtils.init(bArr, (byte) -121);
        FuzzerUtils.init(jArr, -26293L);
        int i3 = -43173;
        fArr[61] = fArr[61] - (-43173);
        instanceCount *= instanceCount;
        float f = -123.205f;
        vMeth(-43173, -123.205f);
        int i4 = 11;
        int i5 = 36476;
        int i6 = -3147;
        int i7 = -4;
        int i8 = 32555;
        int i9 = -13;
        int i10 = -2;
        double d = 0.91118d;
        int i11 = 1;
        while (true) {
            byte[] bArr2 = bArr;
            if (i11 < 278) {
                int i12 = 1;
                while (true) {
                    float f2 = (-31.0f) * f;
                    int i13 = i9;
                    int i14 = i10;
                    double d2 = f2;
                    Double.isNaN(d2);
                    d = (d + d) - d2;
                    i12++;
                    int i15 = 91;
                    if (i12 < 91) {
                        f = f2;
                        i9 = i13;
                        i10 = i14;
                    } else {
                        try {
                            this.iArrFld[i11 - 1] = i3 / i12;
                            this.iArrFld[i11] = 1365758419 / i4;
                            i3 = this.iArrFld[i11] / i12;
                        } catch (ArithmeticException e) {
                        }
                        f = f2;
                        int i16 = i13;
                        int i17 = 1;
                        while (i17 < i15) {
                            if (bFld) {
                                int i18 = iFld + (i17 * i17);
                                iFld = i18;
                                iFld = i18 - 2049655103;
                                int[] iArr = this.iArrFld;
                                int i19 = i17 - 1;
                                iArr[i19] = iArr[i19] + i17;
                            }
                            i8 = 1;
                            while (true) {
                                if (i8 < 2) {
                                    instanceCount += i7;
                                    i8++;
                                    i16 = i16;
                                } else {
                                    int i20 = i16;
                                    int i21 = i3 + (i17 * (-32473));
                                    switch ((i17 % 4) + 123) {
                                        case 123:
                                            i2 = i20;
                                            i7 += i17 * i17;
                                            i = i21;
                                            instanceCount <<= (int) instanceCount;
                                            i4 = i4;
                                            break;
                                        case 124:
                                            i2 = i20;
                                            this.iArrFld[i11] = 197;
                                            i4 >>= i8;
                                            i = i21;
                                            break;
                                        case 125:
                                            float f3 = i20;
                                            i2 = (int) (f3 + (((i17 * f) + iFld) - f3));
                                            i = i21;
                                            break;
                                        case 126:
                                            i2 = i20 + (i17 * i17);
                                            i = i21;
                                            break;
                                        default:
                                            i = i21;
                                            i2 = i20;
                                            int i22 = i4;
                                            int i23 = i11;
                                            for (int i24 = 2; i23 < i24; i24 = 2) {
                                                jArr[i17] = jArr[i17] - i12;
                                                f -= byFld;
                                                i23 += 2;
                                                i7 = i7;
                                            }
                                            i14 = i23;
                                            i4 = i22;
                                            break;
                                    }
                                    i17++;
                                    i3 = i;
                                    i15 = 91;
                                    i16 = i2;
                                }
                            }
                        }
                        i9 = i16;
                        i11++;
                        i6 = i17;
                        i10 = i14;
                        i5 = i12;
                        bArr = bArr2;
                    }
                }
            } else {
                FuzzerUtils.out.println("i f3 i14 = " + i3 + "," + Float.floatToIntBits(f) + "," + i11);
                FuzzerUtils.out.println("i15 i16 d1 = " + i4 + "," + i5 + "," + Double.doubleToLongBits(d));
                FuzzerUtils.out.println("i17 i18 i19 = " + i6 + "," + i7 + ",-66");
                FuzzerUtils.out.println("i20 i21 i22 = " + i8 + "," + i9 + "," + i10);
                FuzzerUtils.out.println("i23 fArr byArr = -19," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + "," + FuzzerUtils.checkSum(bArr2));
                FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(jArr));
                FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + instanceCount + "," + iFld + "," + (bFld ? 1 : 0));
                FuzzerUtils.out.println("Test.byFld iArrFld = " + ((int) byFld) + "," + FuzzerUtils.checkSum(this.iArrFld));
                FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
                FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                return;
            }
        }
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
