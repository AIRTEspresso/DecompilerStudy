/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/637/original-637/Test.dex */
public class Test {
    public static int[] iArrFld;
    public int[] iArrFld1 = new int[N];
    public static long instanceCount = -27;
    public static short sFld = -7298;
    public static byte byFld = -76;
    public static byte byFld1 = -34;
    public static boolean bFld = false;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, -29690);
        FuzzerUtils.init(fArrFld, -2.109f);
    }

    public static int iMeth1() {
        int i = (-60) - byFld;
        int i2 = 11;
        double d = 1.0d;
        while (true) {
            d += 1.0d;
            if (d < 357.0d) {
                i2 = 5;
                do {
                    i += (i2 * i2) + 24302;
                    i2--;
                } while (i2 > 0);
            } else {
                long doubleToLongBits = i + Double.doubleToLongBits(d) + i2;
                iMeth1_check_sum += doubleToLongBits;
                return (int) doubleToLongBits;
            }
        }
    }

    public static void vMeth(int i, int i2) {
        int i3 = N;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -235669650L);
        instanceCount *= iMeth1();
        int i4 = i;
        int i5 = i2;
        double d = -108.98677d;
        int i6 = -10;
        int i7 = -219;
        int i8 = 0;
        float f = -1.695f;
        int i9 = 11;
        while (true) {
            int i10 = 1;
            if (i9 < 360) {
                int i11 = (i5 >>> 1) % i3;
                jArr[i11] = jArr[i11] >> i6;
                i6 += i9;
                long j = instanceCount >> (-3);
                instanceCount = j;
                f = 52992.0f;
                int i12 = ((i9 % 10) * 5) + 15;
                if (i12 == 17) {
                    instanceCount = j + (((i9 * j) + j) - j);
                } else if (i12 == 25) {
                    instanceCount = j - i5;
                } else if (i12 != 29) {
                    if (i12 == 32) {
                        while (5 > i10) {
                            i6 = -1;
                            i10++;
                        }
                        i7 = i10;
                        i4 = -3;
                    } else if (i12 == 38) {
                        double d2 = 52992.0f;
                        Double.isNaN(d2);
                        d *= d2;
                        i4 = -3;
                    } else if (i12 != 40) {
                        if (i12 == 44) {
                            int i13 = 1;
                            do {
                                i5 >>= i13;
                                iArrFld[i13 - 1] = 1078026792;
                                i13++;
                            } while (i13 < 5);
                            i8 = i13;
                            i4 = -3;
                        } else if (i12 == 46) {
                            i4 = i7;
                        } else if (i12 == 52) {
                            fArrFld = fArrFld;
                        } else if (i12 != 65) {
                            jArr[i9] = jArr[i9] - 2554576780295895974L;
                        } else {
                            i6 += 61;
                            i4 = -3;
                        }
                    }
                    i9++;
                    i3 = N;
                } else {
                    byFld1 = byFld1;
                }
                i4 = -3;
                i9++;
                i3 = N;
            } else {
                vMeth_check_sum += i4 + i5 + i9 + i6 + Float.floatToIntBits(f) + i7 + 64791 + i8 + 1 + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(jArr);
                return;
            }
        }
    }

    public static int iMeth(int i) {
        short[] sArr = new short[N];
        FuzzerUtils.init(sArr, (short) 29449);
        int i2 = iArrFld[(i >>> 1) % N];
        vMeth(i2, i2);
        int i3 = -3;
        int i4 = 178;
        while (i4 > 5) {
            i3 = 1;
            while (i3 < 9) {
                int i5 = i4 + 1;
                sArr[i5] = (short) (sArr[i5] << ((short) instanceCount));
                i3++;
            }
            i4--;
        }
        int i6 = 20;
        while (i6 < 365) {
            i6++;
        }
        long floatToIntBits = (((((((((i2 + i4) - 43284) + i3) - 54) + i6) - 52709) + Float.floatToIntBits(0.716f)) + 48438) - 20500) + Double.doubleToLongBits(96.91043d) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        int i3 = 8;
        int i4 = 2;
        int i5 = 1;
        int i6 = 8;
        int i7 = -40645;
        int i8 = -10265;
        int i9 = 23809;
        float f = -1.752f;
        int i10 = 2;
        int i11 = 4;
        int i12 = 116;
        int i13 = 1;
        while (228 > i10) {
            instanceCount = ((i10 - sFld) * iMeth(i10)) + i3;
            i3 += ((i10 * i3) + byFld1) - i3;
            i6 = 4;
            while (111 > i6) {
                i7 = 1;
                while (i7 < i4) {
                    f = i11;
                    instanceCount = i11;
                    this.iArrFld1[i6 - 1] = 10;
                    i7++;
                }
                if (bFld) {
                    int i14 = 2;
                    while (i5 < i14) {
                        int[] iArr = iArrFld;
                        long j = instanceCount;
                        iArr[i14 - 1] = (int) j;
                        int i15 = ((i6 % 7) * 5) + 97;
                        if (i15 == 102) {
                            i2 = i3;
                            i8 -= (int) f;
                        } else if (i15 == 114) {
                            i2 = i3;
                            instanceCount = j + 8;
                        } else if (i15 == 116) {
                            int i16 = ((i6 % 2) * 5) + 52;
                            if (i16 == 57) {
                                i2 = i3;
                                i11 = (int) (i11 + (((i14 * i10) + i9) - j));
                                instanceCount = j + (byFld ^ i14);
                            } else if (i16 != 58) {
                                i2 = i3;
                            } else {
                                iArr[i10] = i13;
                                i11 >>= -311;
                                i2 = i3;
                            }
                        } else if (i15 == 120) {
                            byFld1 = (byte) (byFld1 + ((byte) i13));
                            i2 = i3;
                        } else if (i15 == 125) {
                            f += i14;
                            if (bFld) {
                                i9 = i3;
                                i2 = i9;
                            } else {
                                i8 = sFld;
                                i9 = i3;
                                i2 = i9;
                            }
                        } else if (i15 == 128) {
                            i13 = (int) f;
                            i2 = i3;
                        } else if (i15 == 129) {
                            instanceCount = -17803L;
                            i9 += i14 * i14;
                            i2 = i3;
                            i8 = i10;
                        } else {
                            instanceCount = j >>> (-16252);
                            i2 = i3;
                        }
                        i14 -= 3;
                        i3 = i2;
                        i5 = 1;
                    }
                    i = i3;
                    i12 = i14;
                } else {
                    i = i3;
                    i8 = 19238;
                }
                i6++;
                i3 = i;
                i4 = 2;
                i5 = 1;
            }
            i10++;
            i4 = 2;
            i5 = 1;
        }
        FuzzerUtils.out.println("i i1 i20 = " + i10 + "," + i3 + "," + i6);
        FuzzerUtils.out.println("i21 i22 i23 = " + i11 + "," + i7 + "," + i8);
        FuzzerUtils.out.println("f2 i24 i25 = " + Float.floatToIntBits(f) + "," + i12 + "," + i9);
        FuzzerUtils.out.println("i26 d3 = " + i13 + "," + Double.doubleToLongBits(52.29183d));
        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + instanceCount + "," + ((int) sFld) + "," + ((int) byFld));
        FuzzerUtils.out.println("Test.byFld1 Test.bFld Test.iArrFld = " + ((int) byFld1) + "," + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.fArrFld iArrFld1 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(this.iArrFld1));
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
