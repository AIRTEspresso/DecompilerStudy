
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/303/original-303/Test.dex */
public class Test {
    public static int[] iArrFld;
    public float fFld = 89.32f;
    public short sFld = -21962;
    public static long instanceCount = -10;
    public static boolean bFld = true;
    public static volatile double dFld = -1.1967d;
    public static final int N = 400;
    public static boolean[] bArrFld = new boolean[N];
    public static long vMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, 34974);
        FuzzerUtils.init(bArrFld, false);
    }

    public static void vMeth1(float f) {
        dFld += 146.0d;
        instanceCount = instanceCount;
        vMeth1_check_sum += Float.floatToIntBits(f) - 80;
    }

    public double dMeth(double d, int i) {
        double d2;
        double[] dArr = new double[N];
        long[] jArr = new long[N];
        float[][] fArr = (float[][]) Array.newInstance(float.class, N, N);
        FuzzerUtils.init(jArr, 6812899197426637662L);
        FuzzerUtils.init(fArr, -2.285f);
        FuzzerUtils.init(dArr, 2.61954d);
        double d3 = d;
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 -= (int) instanceCount;
            double d4 = 1.0d;
            d2 = 1.0d;
            while (d2 < 6.0d) {
                double d5 = d2 + d4;
                int i4 = (int) d5;
                jArr[i4] = jArr[i4] - instanceCount;
                boolean[] zArr = bArrFld;
                int i5 = (i3 >>> 1) % N;
                boolean z = bFld;
                zArr[i5] = z;
                bFld = z;
                vMeth1(this.fFld);
                double d6 = -94;
                Double.isNaN(d6);
                d3 *= d6;
                i2 += (int) ((d2 * d2) - 2.6419999599456787d);
                d2 = d5;
                d4 = 1.0d;
            }
            i3++;
            if (i3 >= 280) {
                break;
            }
            d3 = d3;
        }
        int i6 = 7;
        while (224 > i6) {
            int i7 = i6 - 1;
            float[] fArr2 = fArr[i7];
            fArr2[i7] = fArr2[i7] - ((float) dFld);
            i6 += 2;
            d3 = d3;
        }
        double d7 = d3;
        iArrFld[1] = -84;
        int i8 = 164;
        while (true) {
            i8--;
            if (i8 > 0) {
                dFld = 2.1423318716035952E17d;
                int i9 = i8 - 1;
                double d8 = dArr[i9];
                double d9 = this.sFld;
                Double.isNaN(d9);
                dArr[i9] = d8 * d9;
            } else {
                long doubleToLongBits = (((((((Double.doubleToLongBits(d7) + i2) + i3) + Double.doubleToLongBits(d2)) - 94) + i6) - 12) - 84) + i8 + FuzzerUtils.checkSum(jArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
                dMeth_check_sum += doubleToLongBits;
                return doubleToLongBits;
            }
        }
    }

    public void vMeth(int i, long j, int i2) {
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 5242775699499073777L);
        float f = this.fFld;
        double d = i2;
        Double.isNaN(d);
        this.fFld = f - ((float) (-((dMeth(dFld, i) * 169.0d) * d)));
        int i3 = i2 - i;
        int i4 = 64;
        int i5 = -1;
        int i6 = -16609;
        byte b = -66;
        long j2 = 3;
        while (j2 < 229) {
            i4 = 1;
            while (i4 < 7) {
                this.fFld += i4 * i4;
                b = (byte) j2;
                i6 = 2;
                int i7 = (int) j;
                int i8 = i3 ^ i7;
                i3 += i7;
                i4++;
                i5 = i8;
            }
            j2++;
        }
        vMeth_check_sum += ((((i + j) + i3) + j2) - 70) + i4 + i5 + b + i6 + FuzzerUtils.checkSum(jArr);
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        int i3;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, 8L);
        int i4 = -107;
        int i5 = -34934;
        int i6 = -71;
        int i7 = -7;
        int i8 = -41098;
        int i9 = -13;
        int i10 = 191;
        int i11 = -2;
        int i12 = 9;
        int i13 = 3;
        for (int i14 = 3; i10 > i14; i14 = 3) {
            int[] iArr = iArrFld;
            int i15 = i10 + 1;
            int i16 = iArr[i15];
            switch ((i10 % 9) + 41) {
                case 41:
                    int i17 = i12;
                    int i18 = 133;
                    while (true) {
                        int i19 = i18 - 1;
                        long j = jArr[i19];
                        long j2 = instanceCount;
                        double d = i18;
                        Double.isNaN(d);
                        long j3 = j2 - ((long) (d % 95.71801d));
                        instanceCount = j3;
                        i16 >>>= (int) j3;
                        jArr[i19] = j >>> i16;
                        i18--;
                        if (i18 <= 0) {
                            vMeth(i16, j3, i16);
                            int i20 = 133;
                            while (true) {
                                i20--;
                                if (i20 <= 0) {
                                    i4 = i18;
                                    i5 = i20;
                                    i11 = i16;
                                    i12 = i17;
                                    break;
                                } else {
                                    i16 *= i16;
                                }
                            }
                        }
                    }
                case 42:
                    int i21 = i12;
                    i13 = 3;
                    while (i13 < 133) {
                        i16 += (i13 * i13) - 5;
                        jArr[i15] = jArr[i15] << i16;
                        i13++;
                    }
                    i11 = i16;
                    i12 = i21;
                    break;
                case 43:
                case 44:
                    instanceCount -= this.fFld;
                    iArr[i10] = i6;
                    i12 = i12;
                    i11 = -130;
                    break;
                case 45:
                    dFld = i4;
                    jArr[i10 - 1] = instanceCount;
                    i11 = i16 * ((int) dFld);
                    i12 = i12;
                    break;
                case 46:
                    i2 = i12;
                    dFld = i10;
                    i7 = 6;
                    while (i7 < 133) {
                        long j4 = instanceCount;
                        float f = this.fFld;
                        instanceCount = j4 >> (((int) (i8 + (((i7 * (-43)) + i4) - j4))) * ((int) f));
                        i16 -= (int) f;
                        try {
                            i6 = 229 % i4;
                            iArrFld[i10] = i13 % i4;
                            i3 = iArrFld[i10 - 1] / i5;
                        } catch (ArithmeticException e) {
                            i3 = i6;
                        }
                        i6 = i3 + i7;
                        i9 = 2;
                        i7++;
                        i8 = i5;
                    }
                    this.fFld = (float) dFld;
                    i11 = i16;
                    i12 = i2;
                    break;
                case 47:
                    i2 = i12;
                    this.fFld = (float) dFld;
                    i11 = i16;
                    i12 = i2;
                    break;
                case 48:
                    i12 += i6;
                    i11 = i16;
                    break;
                case 49:
                    iArrFld = iArr;
                    i = i12;
                    i11 = i16;
                    i12 = i;
                    break;
                default:
                    i = i12;
                    i11 = i16;
                    i12 = i;
                    break;
            }
            i10--;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i10 + "," + i11 + "," + i4);
        FuzzerUtils.out.println("i16 i17 i18 = " + i5 + "," + i13 + "," + i6);
        FuzzerUtils.out.println("i19 i20 by2 = " + i7 + "," + i8 + ",-43");
        FuzzerUtils.out.println("i21 i22 lArr = " + i9 + "," + i12 + "," + FuzzerUtils.checkSum(jArr));
        FuzzerUtils.out.println("Test.instanceCount fFld Test.bFld = " + instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.dFld sFld Test.iArrFld = " + Double.doubleToLongBits(dFld) + "," + ((int) this.sFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(bArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
