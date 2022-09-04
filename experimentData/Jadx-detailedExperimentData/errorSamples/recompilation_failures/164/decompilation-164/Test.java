/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/164/original-164/Test.dex */
public class Test {
    public long lFld = 13;
    public static long instanceCount = 107;
    public static volatile int iFld = -8;
    public static volatile byte byFld = -21;
    public static boolean bFld = false;
    public static final int N = 400;
    public static float[] fArrFld = new float[N];
    public static volatile int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(fArrFld, 90.263f);
        FuzzerUtils.init(iArrFld, 44029);
    }

    public static void vMeth1(long j) {
        vMeth1_check_sum += (((int) instanceCount) * 10789) - 14075;
    }

    public static float fMeth(double d, byte b, long j) {
        int[] iArr = new int[N];
        short[] sArr = new short[N];
        FuzzerUtils.init(iArr, 50986);
        FuzzerUtils.init(sArr, (short) -4317);
        float f = 0.913f;
        int i = 1;
        do {
            f += i * i;
            vMeth1(instanceCount);
            try {
                iArr[i + 1] = (-1323004922) / (i / ((-216) / i));
            } catch (ArithmeticException e) {
            }
            i++;
        } while (i < 226);
        double d2 = i;
        Double.isNaN(d2);
        double d3 = d - d2;
        int i2 = -62949;
        short s = -9867;
        int i3 = 1;
        while (true) {
            i3 += 3;
            if (i3 < 234) {
                int i4 = i3 - 1;
                iArr[i4] = i;
                switch ((i3 % 4) + 63) {
                    case 63:
                    case 64:
                        i2 = 1;
                        do {
                            if ((i2 % 1) + 10 == 10) {
                                sArr[i4] = (short) i;
                                s = (short) (s + ((short) (i2 * i2)));
                            }
                            iArr[i2] = iArr[i2] * (-91);
                            i2++;
                        } while (i2 < 20);
                        instanceCount = f;
                        break;
                    case 65:
                        instanceCount = f;
                        break;
                    case 66:
                        break;
                    default:
                        iFld += i3 | i2;
                        continue;
                }
                iFld = 17008;
            } else {
                long doubleToLongBits = Double.doubleToLongBits(d3) + b + j + i + Float.floatToIntBits(f) + i3 + i2 + s + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
                fMeth_check_sum += doubleToLongBits;
                return (float) doubleToLongBits;
            }
        }
    }

    public static void vMeth(int i) {
        int i2;
        double d;
        int i3;
        long j;
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 10);
        int i4 = i;
        double d2 = 57.26152d;
        int i5 = -8;
        int i6 = 216;
        while (true) {
            i2 = -14;
            iArr[i6] = iArr[i6] >> (-14);
            long j2 = instanceCount;
            d = 1.0d + d2;
            double reverseBytes = Integer.reverseBytes(Integer.reverseBytes(i6));
            Double.isNaN(reverseBytes);
            instanceCount = j2 * ((long) (d2 - reverseBytes));
            i3 = 21;
            while (i3 > 1) {
                i5 += i3;
                i4 += (int) d;
                i3 -= 3;
            }
            i5 += (int) d;
            i6 -= 3;
            if (i6 <= 0) {
                break;
            }
            d2 = d;
        }
        long j3 = i5;
        instanceCount = instanceCount & (50.231f - ((float) (j3 - (i4 - j))));
        float[] fArr = fArrFld;
        int length = fArr.length;
        int i7 = 36801;
        for (int i8 = 0; i8 < length; i8++) {
            float f = fArr[i8];
            i2 = 1;
            while (i2 < 4) {
                int i9 = 2;
                while (true) {
                    i9--;
                    if (i9 > 0) {
                        int i10 = i2;
                        long j4 = instanceCount + (((i9 * i3) + i9) - i2);
                        instanceCount = j4;
                        long j5 = i10 * j4;
                        instanceCount = j5;
                        iArr[i9 - 1] = (int) (i4 + fMeth(-114.7178d, (byte) -40, j5));
                        i2 = i10;
                        i4--;
                        length = length;
                        j3 = j3;
                    }
                }
                i2++;
                i7 = i9;
            }
        }
        vMeth_check_sum += (((((((((i4 + i6) + Double.doubleToLongBits(d)) + i3) + j3) + Float.floatToIntBits(51.231f)) + i2) + 28617) + i7) - 40) + 1 + FuzzerUtils.checkSum(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r22) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.mainTest(java.lang.String[]):void");
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
