
import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/619/original-619/Test.dex */
public class Test {
    public float fFld = -1.652f;
    public int iFld1 = -29538;
    public static long instanceCount = 163288996;
    public static volatile float fFld1 = 2.253f;
    public static boolean bFld = false;
    public static int iFld = 13;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(iArrFld, -11732);
    }

    public static int iMeth() {
        long j;
        int i;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 13);
        int i2 = 10;
        int i3 = -231;
        int i4 = 0;
        int i5 = -6;
        int i6 = 12;
        float f = 2.717f;
        int i7 = 2;
        while (i7 < 189) {
            float f2 = f;
            int i8 = i6;
            int i9 = i5;
            int i10 = i4;
            int i11 = 1;
            while (i11 < 9) {
                i10 &= (int) instanceCount;
                i2 >>= i10;
                instanceCount = ((float) j) - 200.0f;
                f2 = 2.0f;
                i9 = 1;
                while (i9 < 2) {
                    fFld1 += (float) (((i9 * i8) + instanceCount) - i11);
                    fFld1 = i8;
                    if (bFld) {
                        i = i8;
                    } else {
                        i10 += i9;
                        iArr[i9] = iArr[i9] >>> i8;
                        instanceCount = i8;
                        i = i8 + 8231;
                    }
                    i9++;
                    int i12 = i8;
                    i8 = i;
                    i2 = i12;
                }
                i11++;
            }
            i7++;
            i3 = i11;
            i4 = i10;
            i5 = i9;
            i6 = i8;
            f = f2;
        }
        long floatToIntBits = i7 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(short s, int i) {
        vMeth_check_sum += s + ((int) (iMeth() + fFld1));
    }

    public boolean bMeth(int i, int i2, int i3) {
        int i4;
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 4005670795L);
        FuzzerUtils.init(iArr, 241);
        int i5 = (i2 >>> 1) % N;
        long j = jArr[i5];
        jArr[i5] = j - 1;
        int i6 = 1;
        int i7 = i;
        int i8 = i2;
        int i9 = ((int) j) * i3;
        int i10 = 214;
        int i11 = -37467;
        int i12 = 52110;
        int i13 = 13;
        int i14 = 1;
        while (true) {
            i14 += i6;
            if (i14 < 325) {
                this.fFld += i14;
                if (bFld) {
                    vMeth((short) -21472, i7);
                }
                int i15 = 1;
                while (true) {
                    if (i15 >= 5 || bFld) {
                        break;
                    }
                    i15++;
                }
                int i16 = ((i14 % 8) * 5) + 78;
                if (i16 == 80) {
                    iFld <<= i7;
                } else if (i16 == 96) {
                    i12 = 1;
                    for (i4 = 5; i12 < i4; i4 = 5) {
                        long j2 = instanceCount + i14;
                        instanceCount = j2;
                        int i17 = ((i14 % 5) * 5) + 80;
                        if (i17 == 82) {
                            i13 += i12;
                        } else if (i17 == 83) {
                            instanceCount = j2 + i12;
                        } else if (i17 == 92) {
                            iArr[i14] = iArr[i14] - i8;
                            instanceCount = j2 << i15;
                            if (i15 != 0) {
                                return ((int) (((((long) ((((((((i7 + i8) + i9) + i14) + (-21472)) + i15) + i11) + i12) + i13)) + Double.doubleToLongBits(-37.50236d)) + FuzzerUtils.checkSum(jArr)) + FuzzerUtils.checkSum(iArr))) % 2 > 0;
                            }
                            int i18 = i14 - 1;
                            jArr[i18] = jArr[i18] - i11;
                        } else if (i17 == 97) {
                            instanceCount = j2 >> i11;
                        } else if (i17 == 103) {
                            int i19 = i14 + 1;
                            jArr[i19] = jArr[i19] + iFld;
                        } else {
                            iFld += (int) ((i12 * i12) + 2);
                        }
                        i12++;
                    }
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 98) {
                    i13 += i14;
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 100) {
                    i11 -= (int) (-37.50236d);
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 109) {
                    try {
                        i7 = (-956246768) / i14;
                        iArr[i14] = iArr[i14 - 1] / 150;
                        iFld = i15 / (-185);
                        i10 = i15;
                        i6 = 1;
                    } catch (ArithmeticException e) {
                        i10 = i15;
                        i6 = 1;
                    }
                } else if (i16 == 118) {
                    i8 *= i11;
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 84) {
                    i9 += i14 * i14;
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 85) {
                    instanceCount = instanceCount;
                } else {
                    i10 = i15;
                    i6 = 1;
                    i7 = 2;
                }
                i10 = i15;
                i6 = 1;
            } else {
                long doubleToLongBits = ((((i7 + i8) + i9) + i14) - 21472) + i10 + i11 + i12 + i13 + Double.doubleToLongBits(-37.50236d) + FuzzerUtils.checkSum(jArr) + FuzzerUtils.checkSum(iArr);
                bMeth_check_sum += doubleToLongBits;
                return doubleToLongBits % 2 > 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    public void mainTest(String[] strArr) {
        int i = 9;
        double d = 126.6426d;
        int i2 = 9;
        int i3 = 2353;
        int i4 = -229;
        int i5 = -4;
        int i6 = 14521;
        int i7 = 55344;
        float f = 24.88f;
        float f2 = -1.122f;
        int i8 = 0;
        while (i < 337) {
            i2 = 3;
            boolean z = i8;
            while (77 > i2) {
                long j = i4;
                long j2 = i2;
                i4 = (int) (j + (((instanceCount * j2) + j2) - j));
                i3 >>= ((i << i3) * Math.abs(-22432)) + i4;
                f = 1.0f;
                boolean z2 = z;
                while (f < 2.0f) {
                    f2 += -(((float) (instanceCount % (-11))) + (-55125.0f) + f);
                    int i9 = iFld;
                    boolean bMeth = bMeth(i9, i9, i3);
                    this.fFld = (float) instanceCount;
                    iArrFld = iArrFld;
                    i5 += (int) (((iFld * f) + i5) - ((float) instanceCount));
                    int i10 = this.iFld1 + i5;
                    this.iFld1 = i10;
                    int i11 = i10 << i2;
                    this.iFld1 = i11;
                    i3 *= -12;
                    this.iFld1 = i11 + ((int) (f * f));
                    double d2 = i3;
                    Double.isNaN(d2);
                    d -= d2;
                    f += 1.0f;
                    z2 = bMeth;
                }
                i2++;
                z = z2;
            }
            int i12 = 2;
            while (77 > i12) {
                if (!z) {
                    this.iFld1 ^= 25;
                }
                i12++;
            }
            int i13 = i + 1;
            iArrFld[i13] = i;
            i6 = i12;
            i = i13;
            i7 = 45900;
            i8 = z;
        }
        instanceCount = i2;
        int i14 = 6;
        int i15 = 24924;
        byte b = -12;
        int i16 = i7;
        while (true) {
            int i17 = i15;
            if (i14 < 357) {
                long j3 = fFld1;
                instanceCount = j3;
                i15 = (int) j3;
                i16 *= (int) j3;
                instanceCount = -43125L;
                b = (byte) (b * ((byte) i2));
                this.iFld1 >>= iFld;
                i14++;
                i6 = i6;
                i5 = 25;
            } else {
                FuzzerUtils.out.println("i i1 i2 = " + i + "," + i7 + "," + i2);
                FuzzerUtils.out.println("i3 f i4 = " + i4 + "," + Float.floatToIntBits(f) + "," + i5);
                PrintStream printStream = FuzzerUtils.out;
                StringBuilder append = new StringBuilder().append("f1 by b = ").append(Float.floatToIntBits(f2)).append(",").append((int) b).append(",");
                int i18 = i8 == true ? 1 : 0;
                int i19 = i8 == true ? 1 : 0;
                int i20 = i8 == true ? 1 : 0;
                printStream.println(append.append(i18).toString());
                FuzzerUtils.out.println("d1 i20 i21 = " + Double.doubleToLongBits(d) + "," + i6 + "," + i16);
                FuzzerUtils.out.println("by1 i22 i23 = 25," + i14 + "," + i17);
                FuzzerUtils.out.println("Test.instanceCount fFld Test.fFld1 = " + instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + Float.floatToIntBits(fFld1));
                FuzzerUtils.out.println("Test.bFld Test.iFld iFld1 = " + (bFld ? 1 : 0) + "," + iFld + "," + this.iFld1);
                FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
                FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
