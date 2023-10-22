/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/577/original-577/Test.dex */
public class Test {
    public static int[] iArrFld;
    public float[] fArrFld = new float[N];
    public static long instanceCount = -986655698;
    public static float fFld = -110.61f;
    public static final int N = 400;
    public static long[] lArrFld = new long[N];
    public static boolean[] bArrFld = new boolean[N];
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init(lArrFld, 4118668901L);
        FuzzerUtils.init(bArrFld, false);
    }

    public static void vMeth2(float f) {
        int i = (int) instanceCount;
        byte b = (byte) i;
        iArrFld = iArrFld;
        int i2 = 58823;
        int i3 = 38703;
        int i4 = -33;
        double d = -2.2966d;
        float f2 = 13.0f;
        while (f2 < 337.0f) {
            double d2 = 1.0d;
            i = 52768;
            while (5.0d > d2) {
                i2 -= (int) instanceCount;
                i3 = 2;
                while (i3 > d2) {
                    i4 += i3;
                    f += i4;
                    i3 -= 2;
                }
                i *= i4;
                i4 += (int) d2;
                instanceCount -= (long) d2;
                d2 += 1.0d;
            }
            f2 += 1.0f;
            d = d2;
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i + b + Float.floatToIntBits(f2) + 52768 + Double.doubleToLongBits(d) + i2 + i3 + i4;
    }

    public static void vMeth1(double d) {
        double d2;
        int i;
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 2.70453d);
        vMeth2(-73.296f);
        lArrFld = lArrFld;
        int i2 = 838325330;
        double d3 = 838325330;
        Double.isNaN(d3);
        double d4 = d - d3;
        int i3 = 1;
        int i4 = 132;
        do {
            d2 = 7.0d;
            while (d2 > 1.0d) {
                double d5 = i2;
                Double.isNaN(d5);
                d4 += d5;
                dArr[(int) d2] = dArr[i] - 3.612765705E9d;
                iArrFld = iArrFld;
                switch ((i3 % 7) + 117) {
                    case 117:
                        double d6 = instanceCount;
                        Double.isNaN(d6);
                        d4 -= d6;
                        i2 = 0;
                    case 118:
                    case 119:
                        long[] jArr = lArrFld;
                        int i5 = i3 + 1;
                        jArr[i5] = jArr[i5] - i3;
                        i4 = 14;
                        break;
                    case 120:
                    case 121:
                        i2 += (int) (((long) d2) ^ instanceCount);
                        break;
                    case 122:
                        i2 += (int) (((long) d2) | (-73.296f));
                        break;
                    case 123:
                        long j = instanceCount;
                        double d7 = j;
                        Double.isNaN(d7);
                        Double.isNaN(d5);
                        Double.isNaN(d5);
                        instanceCount = j + ((long) (((d7 * d2) + d5) - d5));
                        break;
                    default:
                        instanceCount += ((long) d2) | i4;
                        break;
                }
                d2 -= 1.0d;
            }
            i3++;
        } while (i3 < 238);
        vMeth1_check_sum += Double.doubleToLongBits(d4) + Float.floatToIntBits(-73.296f) + i2 + i3 + Double.doubleToLongBits(d2) + i4 + 0 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i, int i2) {
        vMeth1(-5.73201d);
        short s = (short) (((short) i) - 14577);
        instanceCount >>= i;
        int i3 = i2 + i;
        int i4 = -38;
        int i5 = -1;
        int i6 = 15;
        while (282 > i6) {
            i4 = 1;
            while (i4 < 6) {
                i5 = 2;
                i4++;
            }
            i6++;
        }
        vMeth_check_sum += (((((i + i3) + Double.doubleToLongBits(-5.73201d)) + s) + i6) - 2) + i4 + 32815 + i5 + 94;
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) 50);
        vMeth(-239, -239);
        int i3 = 1;
        int i4 = 1;
        while (true) {
            long j = instanceCount + (i4 - i4);
            instanceCount = j;
            int[] iArr = iArrFld;
            i = i4 + 1;
            iArr[i] = iArr[i] * 6;
            i2 = i4 + ((int) j);
            if (i >= 261) {
                break;
            }
            i4 = i;
        }
        int i5 = 7;
        int i6 = -243;
        int i7 = 3;
        while (i7 < 323) {
            i5 = 3;
            while (i5 < 79) {
                i3 = i7;
                while (i3 < 2) {
                    i2 = i2 + i3 + (i3 * i3) + 56;
                    i3++;
                }
                instanceCount = 31L;
                long j2 = 31 + i5;
                instanceCount = j2;
                i6 = (int) j2;
                int i8 = i7 - 1;
                bArr[i8] = (byte) (bArr[i8] - ((byte) j2));
                i5++;
            }
            i7++;
        }
        FuzzerUtils.out.println("i15 i16 f3 = " + i2 + "," + i + "," + Float.floatToIntBits(62972.508f));
        FuzzerUtils.out.println("i17 i18 i19 = " + i7 + ",-18483," + i5);
        FuzzerUtils.out.println("i20 i21 i22 = " + i6 + "," + i3 + ",44251");
        FuzzerUtils.out.println("i23 i24 b = -62,-196,0");
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(bArr));
        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iArrFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.bArrFld fArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(bArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(this.fArrFld)));
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
