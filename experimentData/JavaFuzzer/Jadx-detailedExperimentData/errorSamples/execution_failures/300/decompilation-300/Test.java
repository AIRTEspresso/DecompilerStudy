/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/300/original-300/Test.dex */
public class Test {
    public static double[] dArrFld;
    public static volatile long instanceCount = 218;
    public static double dFld = 127.29154d;
    public static float fFld = -95.66f;
    public static volatile int iFld = -6;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    static {
        double[] dArr = new double[N];
        dArrFld = dArr;
        FuzzerUtils.init(dArr, 2.33381d);
        FuzzerUtils.init(iArrFld, -19555);
    }

    public static long lMeth(int i, long j, byte b) {
        dFld = i;
        long j2 = i + j + b;
        lMeth_check_sum += j2;
        return j2;
    }

    public static void vMeth1(byte b, long j, int i) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        boolean[] zArr = new boolean[N];
        FuzzerUtils.init(jArr, -13L);
        FuzzerUtils.init(iArr, 197);
        FuzzerUtils.init(zArr, false);
        byte b2 = b;
        int i2 = i;
        int i3 = -4;
        int i4 = -127;
        float f = 101.7f;
        short s = 28413;
        int i5 = 14;
        while (i5 < 284) {
            i2 = (int) lMeth(i3, instanceCount, b2);
            jArr[i5] = jArr[i5] / 2;
            int i6 = (((i5 >>> 1) % 5) * 5) + 99;
            if (i6 != 108) {
                if (i6 != 110) {
                    switch (i6) {
                        case 104:
                            float f2 = 1.0f;
                            while (true) {
                                f2 += 1.0f;
                                if (f2 >= 6.0f) {
                                    f = f2;
                                    break;
                                } else {
                                    jArr[(int) f2] = j;
                                    iArr[(int) (f2 + 1.0f)] = i5;
                                    b2 = (byte) (b2 + ((byte) (((float) instanceCount) + f2)));
                                    instanceCount += f2;
                                }
                            }
                    }
                } else {
                    s = (short) (s + ((short) (((i5 * instanceCount) + i2) - j)));
                }
                i5++;
            } else {
                int i7 = ((i5 % 6) * 5) + 16;
                if (i7 != 20) {
                    if (i7 == 22) {
                        jArr[i5] = j;
                    } else if (i7 != 32) {
                        if (i7 == 37) {
                            int i8 = i5 + 1;
                            iArr[i8] = iArr[i8] - b2;
                        } else if (i7 == 29) {
                            s = (short) (s + ((short) i5));
                            fFld *= 11.0f;
                            int i9 = 1;
                            while (i9 < 6) {
                                zArr[i9] = true;
                                dArrFld[i9] = i2;
                                i9++;
                            }
                            i4 = i9;
                        } else if (i7 == 30) {
                            instanceCount += ((i5 * (-125)) + i5) - instanceCount;
                        } else {
                            i3 *= 192;
                        }
                    }
                }
            }
            fFld -= -125;
            i5++;
        }
        vMeth1_check_sum += ((((((((b2 + j) + i2) + i5) + i3) + Float.floatToIntBits(f)) + s) + i4) - 125) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(zArr);
    }

    public static void vMeth(int i, int i2) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -48573L);
        byte b = 54;
        int i3 = i2;
        vMeth1((byte) 54, instanceCount, i3);
        int i4 = 1;
        while (i4 < 304) {
            fFld *= -14451.0f;
            i4++;
        }
        double d = dFld;
        double d2 = fFld;
        Double.isNaN(d2);
        dFld = d + d2;
        int i5 = 11;
        long j = 63532;
        int i6 = 1;
        while (true) {
            i6++;
            if (i6 < 184) {
                long j2 = 1;
                long j3 = 1;
                while (9 > j3) {
                    double d3 = dFld;
                    int i7 = i5 + ((int) d3);
                    double d4 = instanceCount;
                    Double.isNaN(d4);
                    dFld = d3 * d4;
                    b = (byte) (b + ((byte) fFld));
                    dArrFld = dArrFld;
                    int i8 = (int) j3;
                    i3 += i8;
                    int i9 = (int) (j3 - j2);
                    jArr[i9] = jArr[i9] * i4;
                    i5 = ((i7 + 1) - i8) << (-55822);
                    j2 = 1;
                    j3++;
                }
                j = j3;
            } else {
                vMeth_check_sum += (((((((i + i3) + b) + i4) + i5) + i6) + j) - 18913) + FuzzerUtils.checkSum(jArr);
                return;
            }
        }
    }

    public void mainTest(String[] strArr) {
        float[] fArr = new float[N];
        FuzzerUtils.init(fArr, 1.426f);
        int i = -55683;
        int i2 = 24;
        while (i2 < 390) {
            vMeth(i2, i2);
            int i3 = i2 - 1;
            fArr[i3] = fArr[i3] * i2;
            i = (int) (i + (((i2 * 11) + 11) - instanceCount));
            i2++;
        }
        FuzzerUtils.out.println("i i1 s1 = " + i2 + ",30,16642");
        FuzzerUtils.out.println("i16 i17 i18 = -9,11,-161");
        FuzzerUtils.out.println("i19 i20 by3 = -16903," + i + ",23");
        FuzzerUtils.out.println("b1 fArr = 1," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.iFld Test.dArrFld Test.iArrFld = " + iFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
