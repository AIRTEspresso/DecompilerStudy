
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/721/original-721/Test.dex */
public class Test {
    public static double[][] dArrFld;
    public static volatile long instanceCount = 3;
    public static volatile int iFld = -4;
    public static float fFld = -108.28f;
    public static long lFld = -8873;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    static {
        double[][] dArr = (double[][]) Array.newInstance(double.class, N, N);
        dArrFld = dArr;
        FuzzerUtils.init(dArr, 1.33431d);
        FuzzerUtils.init(iArrFld, -108);
    }

    public static void vMeth(long j, int i) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -3);
        float f = -115.847f;
        iFld += (int) (-115.847f);
        int i2 = -212;
        int i3 = 55906;
        int i4 = -177;
        short s = 20319;
        int i5 = 15;
        while (i5 < 382) {
            i2 = 5;
            while (1 < i2) {
                iFld *= (int) instanceCount;
                i = (int) (i + (((i2 * i5) + f) - iFld));
                i3 *= i;
                iFld = iFld;
                int i6 = (i5 % 2) + 124;
                if (i6 == 124) {
                    s = (short) (s - ((short) j));
                    i4 = 2;
                } else if (i6 == 125) {
                    f += i2;
                }
                i2--;
            }
            i5++;
        }
        vMeth_check_sum += j + i + Float.floatToIntBits(f) + i5 + 60116 + s + i2 + i3 + 0 + i4 + FuzzerUtils.checkSum(iArr);
    }

    public static long lMeth(float f) {
        int[] iArr = new int[N];
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, N, N);
        long[] jArr = new long[N];
        FuzzerUtils.init(iArr, 5185);
        FuzzerUtils.init(jArr, -9083848344221977855L);
        FuzzerUtils.init(iArr2, 18876);
        int[] int1array = FuzzerUtils.int1array(N, -188);
        int i = -12;
        int i2 = 251;
        int i3 = -59140;
        byte b = -47;
        int i4 = 11;
        while (193 > i4) {
            i++;
            jArr[i4] = jArr[i4] << i;
            i2 = 1;
            while (true) {
                i3 = 9;
                if (i2 >= 9) {
                    break;
                }
                vMeth(instanceCount, 163);
                int[] iArr3 = iArr2[i4 + 1];
                iArr3[i2] = iArr3[i2] | (-26807);
                jArr[i4] = jArr[i4] - i;
                iArr2[i2][i2] = 163;
                i2++;
            }
            instanceCount += instanceCount;
            while (i3 > 1) {
                i <<= iFld;
                b = (byte) (b + ((byte) instanceCount));
                i3 -= 3;
            }
            i4++;
        }
        long floatToIntBits = ((((((Float.floatToIntBits(f) + i4) + i) + i2) + 163) + i3) - 22035) + 1 + b + FuzzerUtils.checkSum(int1array) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public static int iMeth(long j, double d) {
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, 40469);
        FuzzerUtils.init(fArr, -2.475f);
        lMeth(fFld);
        iFld >>>= iFld;
        iFld ^= iFld;
        int i = 200;
        while (i > 6) {
            j = iFld;
            iFld -= 31576;
            i -= 3;
        }
        instanceCount >>>= -6;
        int i2 = -131;
        instanceCount <<= -131;
        iArr[382] = i;
        int i3 = 1;
        do {
            i2 += i3;
            i3++;
        } while (i3 < 305);
        fFld -= 109;
        fArr[0] = fArr[0] - 4.0f;
        long doubleToLongBits = j + Double.doubleToLongBits(d) + i + i2 + i3 + 0 + 109 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public void mainTest(String[] strArr) {
        double d;
        float f;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -12023L);
        iFld *= 1;
        int i = 59392;
        float f2 = 105.348f;
        int i2 = 8;
        while (true) {
            d = 1.28617d;
            if (i2 >= 283) {
                break;
            }
            f2 *= (float) 1.28617d;
            i -= iMeth(instanceCount, 1.28617d);
            i2++;
        }
        iFld--;
        int i3 = i + ((int) instanceCount);
        int i4 = 2;
        int i5 = 6;
        int i6 = -9;
        int i7 = 49160;
        int i8 = -227;
        short s = -12694;
        byte b = 22;
        while (i4 < 158) {
            lFld = iFld;
            int i9 = i4 % 4;
            int i10 = (i9 * 5) + 76;
            if (i10 == 80) {
                f = f2;
                i6 = i4;
                while (161 > i6) {
                    double[] dArr = dArrFld[i4];
                    dArr[i4] = dArr[i4] - 37983.0d;
                    s = (short) (s << ((short) i4));
                    i8 = i6;
                    while (i8 < 1) {
                        b = (byte) (b << ((byte) iFld));
                        switch (i9 + 112) {
                            case 112:
                            case 113:
                                int i11 = (int) instanceCount;
                                iArrFld[i6] = iFld;
                                i5 = i11;
                                break;
                            case 114:
                                i7 |= 1328;
                                instanceCount <<= -57976;
                                s = (short) (s + ((short) (i8 * i8)));
                                i5 = i4;
                            case 115:
                                i7 -= (int) lFld;
                                fFld *= (float) instanceCount;
                                double d2 = i8;
                                Double.isNaN(d2);
                                d *= d2;
                                break;
                            default:
                                s = (short) (s + ((short) i8));
                                i7 &= 1328;
                                break;
                        }
                        i8++;
                    }
                    i6++;
                }
            } else if (i10 == 87) {
                f = f2;
            } else {
                if (i10 == 92) {
                    f = f2;
                    int[] iArr = iArrFld;
                    iArr[i4] = iArr[i4] * iFld;
                } else if (i10 != 93) {
                    f = f2;
                } else {
                    i3 = (((i4 * s) + iFld) - i4) + i4;
                    i5 -= i3;
                    f = f2;
                    lFld += s;
                    i4++;
                    f2 = f;
                }
                jArr[i4] = jArr[i4] >>> ((int) instanceCount);
                i3 = i4;
                i4++;
                f2 = f;
            }
            i5 += i4;
            i3 = i4;
            i4++;
            f2 = f;
        }
        FuzzerUtils.out.println("i i1 f = " + i2 + "," + i3 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("d i17 i18 = " + Double.doubleToLongBits(d) + "," + i4 + "," + i5);
        FuzzerUtils.out.println("s1 i19 i20 = " + ((int) s) + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i21 i22 by2 = " + i8 + ",1328," + ((int) b));
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + instanceCount + "," + iFld + "," + Float.floatToIntBits(fFld));
        FuzzerUtils.out.println("Test.lFld Test.dArrFld Test.iArrFld = " + lFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
