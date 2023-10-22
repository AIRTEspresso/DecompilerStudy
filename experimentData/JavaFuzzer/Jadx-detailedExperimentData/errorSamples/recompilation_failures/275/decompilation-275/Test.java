
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/275/original-275/Test.dex */
public class Test {
    public static int[] iArrFld;
    public static long instanceCount = -2034554388294346798L;
    public static volatile int iFld = 54234;
    public static double dFld = -1.29473d;
    public static boolean bFld = false;
    public static final int N = 400;
    public static short[] sArrFld = new short[N];
    public static long[] lArrFld = new long[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, -52);
        FuzzerUtils.init(sArrFld, (short) 22622);
        FuzzerUtils.init(lArrFld, -1L);
    }

    public static void vMeth2(int i, int i2, int i3) {
        int i4 = -6838;
        byte b = 34;
        int i5 = 236;
        while (true) {
            int i6 = 14944;
            int i7 = -60950;
            float f = 2.271f;
            if (i5 <= 4) {
                sArrFld[26] = (short) i;
                int i8 = 1;
                while (true) {
                    i8++;
                    if (i8 < 380) {
                        i7 = 1;
                        while (4 > i7) {
                            instanceCount = (long) 14.66578d;
                            int[] iArr = iArrFld;
                            iArr[i8] = iArr[i8] * i8;
                            f *= 2.819f;
                            i7++;
                        }
                        i6 = i4;
                    } else {
                        vMeth2_check_sum += (((((((((((i + i2) + i3) + i5) + i6) + i4) + 64016) + Double.doubleToLongBits(14.66578d)) + b) + i8) + i7) - 4) + Float.floatToIntBits(f);
                        return;
                    }
                }
            } else {
                i4 = 1;
                while (i4 < 7) {
                    if (iFld != 0) {
                        vMeth2_check_sum += (((((((((((i + i2) + i3) + i5) + 14944) + i4) + 64016) + Double.doubleToLongBits(14.66578d)) + b) - 10) - 60950) - 4) + Float.floatToIntBits(2.271f);
                        return;
                    }
                    long j = instanceCount - 64016;
                    instanceCount = j;
                    instanceCount = j * j;
                    i4++;
                }
                instanceCount = (long) 14.66578d;
                b = (byte) 14.66578d;
                i5--;
            }
        }
    }

    public static void vMeth1(int i) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[N];
        float[] fArr = new float[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 2.125508d);
        FuzzerUtils.init(fArr, -1.429f);
        FuzzerUtils.init(iArr3, -44480);
        int i2 = -218;
        int i3 = -217;
        int i4 = 2938;
        int i5 = 36;
        int i6 = i;
        int i7 = 8;
        while (i7 < 277) {
            int[] iArr4 = iArrFld;
            int i8 = iArr4[i7];
            long j = instanceCount + 1;
            instanceCount = j;
            iArr4[i7] = i8 * ((int) Long.reverseBytes(j));
            vMeth2(i6, i6, i6);
            iFld += i7;
            int i9 = i7 - 1;
            iArrFld[i9] = iArr[i9] - 60;
            instanceCount *= i7;
            i6 -= 60;
            i2 = 1;
            while (6 > i2) {
                int i10 = ((i2 % 10) * 5) + 93;
                if (i10 == 102) {
                    iArr2 = iArr3;
                } else if (i10 != 103) {
                    if (i10 == 105) {
                        iArr2 = iArr3;
                        int i11 = i2 + 1;
                        fArr[i11] = fArr[i11] + i4;
                    } else {
                        if (i10 != 109) {
                            if (i10 != 112) {
                                if (i10 == 120) {
                                    vMeth1_check_sum += ((i7 + i2) - 60) + i2 + i3 + i4 + i5 + Float.floatToIntBits(109.65f) + 0 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3);
                                    return;
                                } else if (i10 == 135) {
                                    iArr2 = iArr3;
                                    i5 = (int) (i5 + (109.65f ^ i2));
                                } else if (i10 != 141) {
                                    if (i10 != 122) {
                                        iArr2 = iArr3;
                                        if (i10 != 123) {
                                        }
                                    } else {
                                        i4 = i2;
                                        while (i4 < 2) {
                                            long[] jArr = lArrFld;
                                            long j2 = instanceCount;
                                            jArr[352] = j2;
                                            instanceCount = j2 + (i4 ^ j2);
                                            i4++;
                                            i5 = i2;
                                        }
                                        iArr2 = iArr3;
                                    }
                                }
                            }
                            iArr2 = iArr3;
                            int i12 = i2 + 1;
                            double d = dArr[i12];
                            double d2 = instanceCount | 1;
                            Double.isNaN(d2);
                            dArr[i12] = d / d2;
                        } else {
                            iArr2 = iArr3;
                            try {
                                iFld = 12524 % i7;
                                i3 = iFld % i2;
                                iArrFld[i7] = (-114) % iArrFld[i9];
                            } catch (ArithmeticException e) {
                            }
                        }
                        iArrFld = iArr2;
                    }
                    iArr3 = iArr2;
                    int i13 = i2;
                    i2++;
                    i6 = i13;
                } else {
                    iArr2 = iArr3;
                }
                long[] jArr2 = lArrFld;
                jArr2[i7] = jArr2[i7] * i5;
                iArr3 = iArr2;
                int i132 = i2;
                i2++;
                i6 = i132;
            }
            i7++;
        }
        vMeth1_check_sum += ((i6 + i7) - 60) + i2 + i3 + i4 + i5 + Float.floatToIntBits(109.65f) + 0 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr3);
    }

    public static void vMeth(float f, int i, int i2) {
        vMeth1(i2);
        int i3 = (int) dFld;
        int i4 = -206;
        int i5 = 141;
        int i6 = -3;
        int i7 = -13;
        int i8 = 2;
        while (166 > i8) {
            f = -57754.0f;
            instanceCount += 37;
            i5 = 10;
            while (i5 > i8) {
                i3 = (i5 | i8) + i4;
                i7 = 115;
                long j = instanceCount;
                i -= (int) j;
                i4 = (int) j;
                i6 -= 1113893104;
                iFld = (int) (iFld + (i5 - (-57754.0f)));
                i5 -= 2;
            }
            i8++;
        }
        vMeth_check_sum += Float.floatToIntBits(f) + i + i3 + i8 + i4 + i5 + i6 + 0 + i7;
    }

    public void mainTest(String[] strArr) {
        int[][] iArr;
        int i;
        long j;
        double d;
        long j2;
        int i2;
        double d2;
        int i3;
        FuzzerUtils.init((int[][]) Array.newInstance(int.class, N, N), 3);
        double d3 = iFld;
        Double.isNaN(d3);
        double d4 = (-69.29982d) - d3;
        int i4 = -137;
        int i5 = -10;
        int i6 = 38814;
        long j3 = -36101;
        int i7 = 12;
        while (true) {
            j = 1;
            if (i7 >= 196) {
                break;
            }
            vMeth(-4.442f, iFld, i7);
            iArrFld = FuzzerUtils.int1array(N, 6);
            instanceCount = i7;
            i5 = 7;
            while (i5 < 136) {
                iFld = iFld;
                i5++;
            }
            j3 = 1;
            while (j3 < 136) {
                i6 += (int) (-4.442f);
                bFld = bFld;
                iFld += i5;
                instanceCount <<= i7;
                if (bFld) {
                    break;
                }
                iFld -= (int) d4;
                i4 = iFld;
                j3++;
            }
            i7++;
        }
        int i8 = 348;
        int i9 = -6323;
        int i10 = -67;
        int i11 = 22345;
        int i12 = 8;
        for (i = 6; i8 > i; i = 6) {
            int i13 = i9;
            long j4 = instanceCount;
            i4 *= (int) j4;
            iArrFld[i8 + 1] = (int) j4;
            if (bFld) {
                int i14 = 1;
                i9 = i13;
                while (i14 < 147) {
                    iFld = i5;
                    int i15 = i10 - ((int) instanceCount);
                    int i16 = 2;
                    while (true) {
                        lArrFld = lArrFld;
                        long j5 = instanceCount - 1;
                        instanceCount = j5;
                        d2 = d4;
                        i3 = i5;
                        instanceCount = j5 + i8;
                        i9 += i16;
                        i16--;
                        if (i16 <= 0) {
                            break;
                        }
                        i5 = i3;
                        d4 = d2;
                    }
                    iFld = (int) j3;
                    i14++;
                    i12 = i16;
                    i5 = i3;
                    i10 = i15;
                    j = 1;
                    d4 = d2;
                }
                d = d4;
                j2 = j;
                i2 = i5;
                i11 = i14;
            } else {
                d = d4;
                j2 = j;
                i2 = i5;
                i4 += i8 - i6;
                i9 = i13;
            }
            i8 -= 2;
            i5 = i2;
            j = j2;
            d4 = d;
        }
        FuzzerUtils.out.println("d i i1 = " + Double.doubleToLongBits(d4) + "," + i7 + "," + i4);
        FuzzerUtils.out.println("f3 i26 i27 = " + Float.floatToIntBits(-4.442f) + "," + i5 + "," + i9);
        FuzzerUtils.out.println("l i28 i29 = " + j3 + "," + i6 + "," + i8);
        FuzzerUtils.out.println("i30 i31 i32 = " + i10 + "," + i11 + ",-13");
        FuzzerUtils.out.println("i33 iArr1 = " + i12 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.dFld = " + instanceCount + "," + iFld + "," + Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.bFld Test.iArrFld Test.sArrFld = " + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(sArrFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(lArrFld));
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
