
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/417/original-417/Test.dex */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 2701252561513436752L;
    public static double dFld = -85.58383d;
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public int iFld = 7;
    public short sFld = 24750;
    public int[][] iArrFld = (int[][]) Array.newInstance(int.class, N, N);

    public static void vMeth1(float f, long j) {
        int i;
        int[][][] iArr = (int[][][]) Array.newInstance(int.class, N, N, N);
        int[] iArr2 = new int[N];
        FuzzerUtils.init((Object[][]) iArr, (Object) 38445);
        FuzzerUtils.init(iArr2, -28176);
        dFld = dFld;
        int i2 = -192;
        int i3 = 153;
        int i4 = 14961;
        int i5 = 4;
        int i6 = 230;
        int i7 = 0;
        while (true) {
            i6 -= 3;
            if (i6 > 0) {
                i2 = 0 - ((int) f);
                f += i7;
                int i8 = i4;
                int i9 = 20;
                while (true) {
                    i = 1;
                    if (i9 <= 1) {
                        break;
                    }
                    j = 5;
                    try {
                        i7 = (-45) / i9;
                        iArr[i6][i9][i6] = 6404 % i8;
                        i8 = 32354 / iArr2[i6 + 1];
                    } catch (ArithmeticException e) {
                    }
                    instanceCount /= i9 | 1;
                    i9--;
                }
                i7 += (int) j;
                while (i < 20) {
                    j += j;
                    i2 += (int) ((i * i) + 7.712f);
                    i8 -= 100;
                    i++;
                }
                i3 = i9;
                i4 = i8;
                i5 = i;
            } else {
                vMeth1_check_sum += (((((((((Float.floatToIntBits(f) + j) + i6) + i2) + i7) + i3) + i4) + i5) - 24) - 100) + FuzzerUtils.checkSum((Object[][]) iArr) + FuzzerUtils.checkSum(iArr2);
                return;
            }
        }
    }

    public static void vMeth(int i, float f, int i2) {
        int i3;
        float f2;
        long[] jArr = new long[N];
        byte[][][] bArr = (byte[][][]) Array.newInstance(byte.class, N, N, N);
        FuzzerUtils.init(jArr, 192L);
        FuzzerUtils.init((Object[][]) bArr, (Object) (byte) 67);
        double d = -70.16871d;
        int i4 = 9;
        int i5 = -60888;
        if ((((i2 - 1) >>> 1) % 1) + 7 == 7) {
            double d2 = jArr[(i >>> 1) % N];
            Double.isNaN(d2);
            d = (-70.16871d) * d2;
            f2 = f;
            i4 = 4;
            while (i4 < 150) {
                vMeth1(f2, instanceCount);
                i5 = 1;
                while (i5 < 11) {
                    f2 -= (float) instanceCount;
                    i5 += 3;
                }
                i4++;
            }
        } else {
            instanceCount *= 9;
            f2 = f;
        }
        int i6 = 10;
        int i7 = 80;
        short s = -7743;
        int i8 = i;
        int i9 = 7;
        while (i9 < 268) {
            i8 += i9 ^ i6;
            i6 += 58;
            i7 = 1;
            while (6 > i7) {
                s = (short) (((short) i5) << 67);
                i7 += 2;
            }
            i9++;
        }
        vMeth_check_sum += (((((((i8 + Float.floatToIntBits(f2)) + i3) + Double.doubleToLongBits(d)) + i4) + i6) + i5) - 12) + i9 + 58 + i7 + 62877 + 0 + s + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum((Object[][]) bArr);
    }

    public static void vSmallMeth(int i, int i2, int i3) {
        vMeth(i, -1.191f, i2);
        vSmallMeth_check_sum += i + i2 + i3;
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        int i3;
        int i4;
        float[] fArr = new float[N];
        double[] dArr = new double[N];
        int i5 = 2;
        long[][] jArr = (long[][]) Array.newInstance(long.class, N, N);
        FuzzerUtils.init(dArr, 1.12241d);
        FuzzerUtils.init(jArr, -229L);
        FuzzerUtils.init(fArr, -24.591f);
        for (int i6 = 0; i6 < 597; i6++) {
            int i7 = this.iFld;
            vSmallMeth(i7, i7, i7);
        }
        this.iFld <<= (int) instanceCount;
        float f = 0.8f;
        this.iFld = (int) 0.8f;
        int i8 = 1;
        while (true) {
            i8++;
            if (i8 >= 125) {
                break;
            }
            float f2 = i8;
            f += f2;
            int i9 = (int) (this.iFld + (f2 - f));
            this.iFld = i9;
            int i10 = i9 * ((int) f);
            this.iFld = i10;
            this.iFld = i10 >> i10;
        }
        float f3 = 1.0f;
        int i11 = -1624;
        int i12 = 13;
        int i13 = -8;
        int i14 = 131;
        float f4 = 1.0f;
        while (f4 < 131.0f) {
            i12 = 12;
            while (i12 < 193) {
                i13 = 1;
                while (i13 < i5) {
                    int i15 = ((i13 % 10) * 5) + 91;
                    if (i15 != 93) {
                        if (i15 != 94) {
                            if (i15 == 103) {
                                i = i8;
                                double d = dArr[i13];
                                i4 = i11;
                                double d2 = this.iFld;
                                Double.isNaN(d2);
                                dArr[i13] = d + d2;
                            } else {
                                if (i15 == 105) {
                                    this.iFld -= 178;
                                    i11 = -30168;
                                    i = i8;
                                    instanceCount += i13;
                                    f *= -30168;
                                } else if (i15 != 120) {
                                    if (i15 != 122) {
                                        if (i15 == 134) {
                                            int i16 = (int) (f4 + f3);
                                            fArr[i16] = fArr[i16] * f;
                                            i = i8;
                                            i4 = i11;
                                        } else if (i15 != 140) {
                                            if (i15 == 108) {
                                                i = i8;
                                            } else if (i15 == 109) {
                                                i = i8;
                                                i3 = i11;
                                                i14 -= i3;
                                                i11 = i3;
                                                i13++;
                                                i8 = i;
                                                i5 = 2;
                                                f3 = 1.0f;
                                            } else {
                                                i = i8;
                                                i2 = i11;
                                                i11 = i2;
                                                i14 = -12;
                                                i13++;
                                                i8 = i;
                                                i5 = 2;
                                                f3 = 1.0f;
                                            }
                                        }
                                    }
                                }
                                this.iFld += i13 ^ i13;
                                long j = i14;
                                instanceCount = j;
                                int[] iArr = this.iArrFld[i12 + 1];
                                int i17 = (int) (f4 + f3);
                                iArr[i17] = iArr[i17] >> i11;
                                jArr[i13][i13 + 1] = j;
                                i14 = 63609;
                                i13++;
                                i8 = i;
                                i5 = 2;
                                f3 = 1.0f;
                            }
                            i11 = i4;
                            i13++;
                            i8 = i;
                            i5 = 2;
                            f3 = 1.0f;
                        }
                        i = i8;
                        i3 = i11;
                        i14 = -12;
                        i14 -= i3;
                        i11 = i3;
                        i13++;
                        i8 = i;
                        i5 = 2;
                        f3 = 1.0f;
                    }
                    i = i8;
                    i2 = i11;
                    this.sFld = (short) (this.sFld * 19560);
                    i11 = i2;
                    i14 = -12;
                    i13++;
                    i8 = i;
                    i5 = 2;
                    f3 = 1.0f;
                }
                i12++;
                i5 = 2;
                f3 = 1.0f;
            }
            f4 += 1.0f;
            i5 = 2;
            f3 = 1.0f;
        }
        FuzzerUtils.out.println("f2 i20 f3 = " + Float.floatToIntBits(f) + "," + i8 + "," + Float.floatToIntBits(f4));
        FuzzerUtils.out.println("i21 i22 i23 = " + i11 + "," + i12 + ",178");
        FuzzerUtils.out.println("i24 i25 b1 = " + i13 + "," + i14 + ",1");
        FuzzerUtils.out.println("dArr lArr1 fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," + FuzzerUtils.checkSum(jArr) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + this.iFld);
        FuzzerUtils.out.println("sFld iArrFld = " + ((int) this.sFld) + "," + FuzzerUtils.checkSum(this.iArrFld));
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
