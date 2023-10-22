/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/325/original-325/Test.dex */
public class Test {
    public static final int N = 400;
    public static long[] lArrFld;
    public static long instanceCount = 12;
    public static float fFld = -49.513f;
    public static volatile byte byFld = -13;
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        long[] jArr = new long[N];
        lArrFld = jArr;
        FuzzerUtils.init(jArr, -3113517310863762446L);
    }

    public static int iMeth(int i) {
        int i2;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -244);
        int i3 = (int) instanceCount;
        instanceCount = i3;
        int i4 = i3 | i3;
        int i5 = 89;
        int i6 = -32;
        int i7 = -48395;
        int i8 = -60903;
        double d = -44.79751d;
        int i9 = 8;
        while (258 > i9) {
            instanceCount -= 13;
            fFld += i9;
            int i10 = i6;
            int i11 = 7;
            while (true) {
                i2 = 1;
                if (i11 <= 1) {
                    break;
                }
                i10 |= 13;
                iArr[i11] = -8;
                i11 -= 3;
            }
            double d2 = fFld;
            while (i2 < 7) {
                i8 = i2;
                while (2 > i8) {
                    iArr[i8] = iArr[i8] - ((int) d2);
                    i8++;
                }
                i10 <<= -29864;
                i2++;
            }
            i9++;
            i5 = i11;
            i6 = i10;
            i7 = i2;
            d = d2;
        }
        long doubleToLongBits = (((((((((((i4 + i9) + 13) + i5) - 8) + i6) + Double.doubleToLongBits(d)) + i7) - 43921) + i8) + 2) - 29864) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(int i, int i2) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -141);
        int i3 = i2 + 1;
        instanceCount -= (i3 + 3.829f) + 3.829f;
        int i4 = 0;
        int i5 = 14599;
        int i6 = -19;
        int i7 = 2;
        while (202 > i7) {
            instanceCount += 10 - Math.min(i3 / 11, iMeth(10));
            i3 += (i7 * i7) + 1255;
            i4 = 8;
            while (i4 > i7) {
                byFld = (byte) (byFld * ((byte) 3.829f));
                try {
                    int i8 = 10 % i7;
                    i5 = (-14441) / i3;
                    i3 = 221 % i5;
                } catch (ArithmeticException e) {
                }
                i4--;
                i6 = 1;
            }
            i7++;
        }
        vMeth_check_sum += ((((((((i + i3) + Float.floatToIntBits(3.829f)) + i7) + 10) + i4) + i5) + i6) - 43) + 1 + FuzzerUtils.checkSum(iArr);
    }

    public static void vSmallMeth(long j, int i) {
        vMeth(i, i);
        vSmallMeth_check_sum += j + i;
    }

    public void mainTest(String[] strArr) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 57814);
        int i = 3;
        int i2 = 14;
        int i3 = -12462;
        int i4 = 2;
        int i5 = 0;
        while (i4 < 151) {
            for (int i6 = 0; i6 < 62; i6++) {
                vSmallMeth(instanceCount, 249);
            }
            instanceCount = i4;
            i = 4;
            while (i < 168) {
                long[] long1array = FuzzerUtils.long1array(N, -7L);
                lArrFld = long1array;
                int i7 = (i4 % 2) + 121;
                if (i7 == 121) {
                    int i8 = ((i4 % 9) * 5) + 109;
                    if (i8 == 111) {
                        float f = fFld * ((float) instanceCount);
                        fFld = f;
                        fFld = f + i;
                    } else {
                        if (i8 != 135) {
                            if (i8 != 143) {
                                if (i8 != 145) {
                                    if (i8 != 113) {
                                        if (i8 != 114) {
                                            switch (i8) {
                                                case 148:
                                                    try {
                                                        int i9 = 344819139 / i3;
                                                        i5 = i % i4;
                                                        i2 = iArr[i] / 40866;
                                                        break;
                                                    } catch (ArithmeticException e) {
                                                        break;
                                                    }
                                                case 149:
                                                    instanceCount = i;
                                                    i5 = (int) (-67.13848d);
                                                    break;
                                                case 150:
                                                    i2 = (int) (i2 + (((float) ((i * instanceCount) + i2)) - fFld));
                                                    break;
                                                default:
                                                    i2 >>= 53209;
                                                    break;
                                            }
                                        }
                                    } else {
                                        i2 += i * i2;
                                        fFld = i4;
                                        i3 = 2;
                                        i5 = 8;
                                    }
                                } else {
                                    i2 >>= -20;
                                }
                            } else {
                                i2 >>= i2;
                            }
                        }
                        instanceCount >>>= i;
                        i2 += i;
                    }
                } else if (i7 != 122) {
                    long1array[i] = long1array[i] + ((long) (-67.13848d));
                } else {
                    i2 *= (int) fFld;
                }
                i++;
            }
            i4++;
        }
        FuzzerUtils.out.println("i i1 i21 = " + i4 + "," + i5 + "," + i);
        FuzzerUtils.out.println("i22 i23 iArr2 = " + i2 + "," + i3 + "," + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + ((int) byFld));
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
