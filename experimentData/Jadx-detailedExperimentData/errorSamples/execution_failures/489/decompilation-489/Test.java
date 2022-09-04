
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/489/original-489/Test.dex */
public class Test {
    public static final int N = 400;
    public byte byFld = -114;
    public volatile float fFld1 = 101.357f;
    public static long instanceCount = 2184208139L;
    public static volatile boolean bFld = false;
    public static float fFld = 8.392f;
    public static volatile short sFld = 18016;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f) {
        int i;
        int[] iArr = new int[N];
        boolean[] zArr = new boolean[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(zArr, true);
        int i2 = -5;
        FuzzerUtils.init(iArr, -5);
        FuzzerUtils.init(fArr, 1.235f);
        zArr[14] = bFld;
        double d = -93.39876d;
        int i3 = 0;
        int i4 = 1;
        do {
            i3 <<= (int) instanceCount;
            i = 1;
            while (i < 7) {
                int i5 = iArr[i];
                long j = instanceCount;
                iArr[i] = i5 + ((int) j);
                instanceCount = (-13) ^ j;
                i2 = 1;
                while (i2 < 2) {
                    if (bFld) {
                        instanceCount -= 5;
                    }
                    int i6 = i4 + 1;
                    fArr[i6] = fArr[i6] - (-3.869f);
                    int i7 = (((i3 >>> 1) % 2) * 5) + 39;
                    if (i7 == 45) {
                        long j2 = instanceCount;
                        i3 -= (int) j2;
                        int i8 = i + 1;
                        iArr[i8] = iArr[i8] + ((int) fFld);
                        instanceCount = j2 + (((i2 * (-13)) + i3) - j2);
                    } else if (i7 == 46) {
                        d *= 137.0d;
                    }
                    i2++;
                }
                i++;
            }
            i4++;
        } while (i4 < 215);
        vMeth2_check_sum += ((((Float.floatToIntBits(f) + i3) + i4) + i) - 13) + i2 + 28 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(zArr) + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i, long j, boolean z) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, -5297);
        FuzzerUtils.init(jArr, -11L);
        int i2 = 1;
        int i3 = i;
        long j2 = -14;
        int i4 = -59313;
        int i5 = 1;
        double d = -28.99413d;
        int i6 = -58;
        long j3 = j;
        while (true) {
            i5 += i2;
            if (i5 < 249) {
                int i7 = (i5 % 2) + 97;
                if (i7 == 97) {
                    iArr[i5] = iArr[i5] + (i3 * i5);
                    vMeth2(fFld);
                } else if (i7 == 98) {
                    j3--;
                    d -= 10.0d;
                }
                int i8 = i5 - 1;
                long j4 = j3;
                jArr[i8] = jArr[i8] + i5;
                int i9 = i3;
                i6 = i5;
                while (i6 < 7) {
                    j2 -= i9;
                    int i10 = i4 - ((int) j2);
                    if (((i6 % 1) * 5) + 97 == 100) {
                        i4 = -30;
                    } else {
                        int i11 = (i10 >> i10) * ((int) instanceCount);
                        try {
                            i9 /= -857475700;
                            i11 = i5 % 636779951;
                            i4 = iArr[i5] / 19294;
                        } catch (ArithmeticException e) {
                            i4 = i11;
                        }
                    }
                    i6++;
                }
                j3 = j4;
                i3 = i9;
                i2 = 1;
            } else {
                vMeth1_check_sum += i3 + j3 + (z ? 1L : 0L) + i5 + Double.doubleToLongBits(d) + i6 + i4 + j2 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(jArr);
                return;
            }
        }
    }

    public static void vMeth(double d, int i) {
        int[] iArr = new int[N];
        double[] dArr = new double[N];
        byte[] bArr = new byte[N];
        FuzzerUtils.init(dArr, -105.96575d);
        FuzzerUtils.init(bArr, (byte) -112);
        FuzzerUtils.init(iArr, -60323);
        int i2 = i;
        vMeth1(i2, instanceCount, bFld);
        bFld = bFld;
        int i3 = 14;
        int i4 = 63445;
        int i5 = -163;
        int i6 = 1;
        while (true) {
            i6++;
            if (i6 < 131) {
                double d2 = dArr[i6];
                double d3 = fFld;
                Double.isNaN(d3);
                dArr[i6] = d2 - d3;
                int i7 = i4;
                int i8 = 12;
                while (i8 > 1) {
                    i7 = 1;
                    while (i7 < 3) {
                        int i9 = i7 + 1;
                        bArr[i9] = (byte) i5;
                        int i10 = i6 + i7 + i8;
                        try {
                            i5 = i6 / iArr[(i8 >>> 1) % N];
                            i10 = ((-95) % i8) % iArr[i7 - 1];
                        } catch (ArithmeticException e) {
                        }
                        iArr[i6 + 1] = i5;
                        fFld %= i5 | 1;
                        i2 = i10 - i10;
                        i7 = i9;
                    }
                    i2 >>= 7;
                    i8 -= 2;
                }
                int i11 = i8;
                i4 = i7;
                i3 = i11;
            } else {
                vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i6 + i3 + 8 + i4 + i5 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int i;
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        FuzzerUtils.init(iArr, -4);
        vMeth(-2.89466d, 4042);
        int i2 = 16337764;
        iArr[82][324] = 16337764;
        int[] iArr2 = iArr[19];
        iArr2[82] = iArr2[82] ^ 11;
        long j = instanceCount - (-81);
        instanceCount = j;
        double d = j;
        int i3 = 236;
        int i4 = -13;
        int i5 = 69;
        int i6 = -12944;
        int i7 = 58610;
        int i8 = -50958;
        int i9 = -12;
        int i10 = -153;
        int i11 = 17;
        while (i11 < 292) {
            int i12 = i11 - 1;
            iArr[i12][i12] = i11;
            int i13 = 1;
            while (true) {
                if (i13 >= 91) {
                    int i14 = i10;
                    int i15 = i9;
                    int i16 = i8;
                    int i17 = i7;
                    int i18 = 3;
                    for (int i19 = 91; i18 < i19; i19 = 91) {
                        int[] iArr3 = iArr[44];
                        int i20 = i18 - 1;
                        iArr3[i20] = iArr3[i20] - 17695;
                        int[] iArr4 = iArr[i12];
                        iArr4[i11] = iArr4[i11] * (-132);
                        int i21 = i18;
                        while (i21 < 2) {
                            int i22 = i15;
                            long j2 = instanceCount;
                            int i23 = (i5 + ((int) fFld)) | ((int) j2);
                            sFld = (short) i23;
                            instanceCount *= 8;
                            i21 += 2;
                            i2 >>= (int) j2;
                            i11 = i11;
                            i15 = i22;
                            i5 = i23;
                        }
                        int i24 = i15;
                        int i25 = i11;
                        switch ((i18 % 10) + 18) {
                            case 18:
                                i = i13;
                                int[] iArr5 = iArr[i12];
                                int i26 = i25 + 1;
                                iArr5[i26] = iArr5[i26] & 8;
                                i15 = i24;
                                i3 = 17695;
                                break;
                            case 19:
                                i = i13;
                                fFld %= i21 | 1;
                                try {
                                    i5 = i21 % 24621;
                                    i2 = i5 / (-598520166);
                                    iArr[i12][i20] = (-66) / i21;
                                    i15 = i24;
                                    i3 = 17695;
                                    break;
                                } catch (ArithmeticException e) {
                                    i15 = i24;
                                    i3 = 17695;
                                    break;
                                }
                            case 20:
                                i = i13;
                                i5 += i18;
                                i15 = i24;
                                i3 = 17695;
                                break;
                            case 21:
                                i = i13;
                                bFld = bFld;
                                i15 = 1;
                                while (i15 < 2) {
                                    fFld -= i17;
                                    i5 <<= sFld;
                                    this.byFld = (byte) (this.byFld + 62);
                                    i15++;
                                }
                                i3 = 17695;
                                break;
                            case 22:
                                i = i13;
                                fFld -= i18;
                                i15 = i24;
                                i3 = 17695;
                                break;
                            case 23:
                                i = i13;
                                this.fFld1 += (float) instanceCount;
                                i17 = -65;
                                i15 = i24;
                                i3 = 17695;
                                break;
                            case 24:
                                i = i13;
                                i17 = -65;
                                i15 = i24;
                                i3 = 17695;
                                break;
                            case 25:
                                i = i13;
                                i3 = ((int) d) + 17695;
                                i15 = i24;
                                break;
                            case 26:
                                i = i13;
                                i14 = 191;
                                i15 = i24;
                                i3 = 17695;
                                break;
                            case 27:
                                long j3 = instanceCount;
                                i = i13;
                                instanceCount = j3 + (i18 * j3);
                                i14 *= i21;
                                i15 = i24;
                                i3 = 17695;
                                break;
                            default:
                                i = i13;
                                i14 *= i21;
                                i15 = i24;
                                i3 = 17695;
                                break;
                        }
                        i18++;
                        i16 = i21;
                        i13 = i;
                        i11 = i25;
                    }
                    int i27 = i15;
                    i11++;
                    i4 = i13;
                    i6 = i18;
                    i7 = i17;
                    i8 = i16;
                    i10 = i14;
                    i9 = i27;
                } else {
                    instanceCount = instanceCount;
                    i13++;
                }
            }
        }
        FuzzerUtils.out.println("d3 i17 i18 = " + Double.doubleToLongBits(d) + "," + i2 + "," + i11);
        FuzzerUtils.out.println("i19 i20 i21 = " + i3 + "," + i4 + "," + i5);
        FuzzerUtils.out.println("i22 i23 i24 = " + i6 + "," + i7 + ",17695");
        FuzzerUtils.out.println("i25 i26 i27 = " + i8 + ",8," + i9);
        FuzzerUtils.out.println("i28 iArr3 = " + i10 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.fFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.sFld byFld fFld1 = " + ((int) sFld) + "," + ((int) this.byFld) + "," + Float.floatToIntBits(this.fFld1));
        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
