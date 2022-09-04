
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/661/original-661/Test.dex */
public class Test {
    public static final int N = 400;
    public static long instanceCount = -4233195867522294710L;
    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public float fFld = -117.425f;
    public long[] lArrFld = new long[N];
    public int[] iArrFld = new int[N];

    public static void vMeth(float f, int i, int i2) {
        int i3 = i >>> (-213);
        int i4 = 11;
        while (i4 < 198) {
            i2 += i4;
            long j = instanceCount - i2;
            instanceCount = j;
            instanceCount = j + (i4 * i4);
            i4++;
        }
        instanceCount *= i4;
        vMeth_check_sum += ((((((((Float.floatToIntBits(f) + i3) + i2) + i4) - 7) + 1) + 138) - 17587) - 3384) + 19095;
    }

    public static double dMeth(double d, int i, int i2) {
        int i3;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, -20);
        int i4 = (i2 >>> 1) % N;
        int i5 = iArr[i4];
        iArr[i4] = i5 + 1;
        switch (((i5 >>> 1) % 4) + 48) {
            case 48:
            case 49:
                vMeth(0.501f, -51051, i);
                i3 = 1;
                do {
                    i3++;
                } while (i3 < 126);
                break;
            case 50:
                instanceCount += 64;
            case 51:
                iArr[i4] = 96;
            default:
                i3 = 24493;
                break;
        }
        long doubleToLongBits = (((((Double.doubleToLongBits(d) + i) + i2) + Float.floatToIntBits(0.501f)) + i3) - 89) + 96 + FuzzerUtils.checkSum(iArr);
        dMeth_check_sum += doubleToLongBits;
        return doubleToLongBits;
    }

    public static int iMeth(float f) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 5);
        long floatToIntBits = (((((Float.floatToIntBits(f) + 240) - 1) + Double.doubleToLongBits(2.42924d)) + 13) - 22) + 0 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        int i = 2;
        float[][] fArr = (float[][]) Array.newInstance(float.class, N, N);
        FuzzerUtils.init(fArr, -114.1013f);
        int i2 = 46281;
        int i3 = -34498;
        int i4 = 160;
        byte b = 61;
        double d = -73.531d;
        int i5 = 19;
        while (true) {
            int i6 = 1;
            if (i5 >= 340) {
                break;
            }
            i = 1;
            do {
                b = (byte) (i5 - (-(-iMeth(this.fFld))));
                i++;
            } while (i < 78);
            i2 *= i5;
            int i7 = i5 + 1;
            this.lArrFld[i7] = i2;
            while (i6 < 78) {
                long j = instanceCount;
                double d2 = j;
                Double.isNaN(d2);
                d += d2;
                this.fFld = i5;
                instanceCount = j >> i6;
                i6++;
            }
            long j2 = instanceCount;
            long j3 = j2 - j2;
            instanceCount = j3;
            i4 = (int) j3;
            i5 = i7;
            i3 = i6;
        }
        this.lArrFld[44] = i2;
        int i8 = i2 + ((int) instanceCount);
        int i9 = 11;
        int i10 = -57083;
        int i11 = -10;
        int i12 = -11;
        short s = 29620;
        while (i9 < 382) {
            i8 -= 112;
            int[] iArr = this.iArrFld;
            iArr[i9] = i5;
            long j4 = instanceCount * (-22528);
            instanceCount = j4;
            iArr[i9] = iArr[i9] * i10;
            int i13 = i12;
            int i14 = ((i9 % 9) * 5) + 20;
            double d3 = d;
            if (i14 == 23) {
                int i15 = i9 + 1;
                iArr[i15] = iArr[i15] + 113;
            } else if (i14 == 30) {
                int i16 = (int) (i8 + i9 + j4);
                int i17 = 1;
                do {
                    i17++;
                } while (i17 < 68);
                i11 = i17;
                i8 = i16;
                i13 = 0;
            } else if (i14 == 35) {
                i10 >>= -12;
            } else {
                if (i14 != 52) {
                    if (i14 == 54) {
                        s = (short) (s + ((short) (i9 * i9)));
                    } else if (i14 == 57) {
                        i10 += i9 + i10;
                    } else if (i14 == 60) {
                        i10 *= i4;
                    } else if (i14 != 62) {
                        if (i14 == 65) {
                            iArr[i9 - 1] = (int) this.fFld;
                        }
                    }
                    i4 *= (int) instanceCount;
                }
                float[] fArr2 = fArr[i9];
                int i18 = i9 + 1;
                fArr2[i18] = fArr2[i18] + i11;
            }
            i9++;
            i12 = i13;
            d = d3;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i5 + "," + i8 + "," + i);
        FuzzerUtils.out.println("by i19 i20 = " + ((int) b) + "," + i3 + "," + i4);
        FuzzerUtils.out.println("d2 i21 i22 = " + Double.doubleToLongBits(d) + "," + i9 + "," + i10);
        FuzzerUtils.out.println("i23 i24 s2 = " + i11 + "," + i12 + "," + ((int) s));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("Test.instanceCount fFld lArrFld = " + instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(this.iArrFld));
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
