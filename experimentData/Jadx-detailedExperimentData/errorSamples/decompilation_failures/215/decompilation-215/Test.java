
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/215/original-215/Test.dex */
public class Test {
    public static double[][] dArrFld;
    public static long instanceCount = -9;
    public static double dFld = -66.79636d;
    public static byte byFld = 17;
    public static float fFld = -1.628f;
    public static final int N = 400;
    public static byte[] byArrFld = new byte[N];
    public static boolean[] bArrFld = new boolean[N];
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public int iFld = 7;
    public int[] iArrFld = new int[N];
    public long[][][] lArrFld = (long[][][]) Array.newInstance(long.class, N, N, N);

    static {
        double[][] dArr = (double[][]) Array.newInstance(double.class, N, N);
        dArrFld = dArr;
        FuzzerUtils.init(dArr, 93.1927d);
        FuzzerUtils.init(byArrFld, (byte) -56);
        FuzzerUtils.init(bArrFld, false);
    }

    public static void vMeth(int i, float f) {
        int[] iArr = new int[N];
        byte[] bArr = new byte[N];
        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(bArr, (byte) -51);
        int i2 = (i >>> 1) % N;
        iArr[i2] = iArr[i2] << (-224);
        int i3 = 15;
        while (i3 < 305) {
            if (i == 0) {
                i3++;
            } else {
                vMeth_check_sum += i + Float.floatToIntBits(f) + i3 + 1 + 0 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
                return;
            }
        }
        iArr[0] = i3;
        bArr[7] = (byte) (bArr[7] + ((byte) i3));
        vMeth_check_sum += i + Float.floatToIntBits(f - 1) + i3 + 1 + 0 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(bArr);
    }

    public static long lMeth() {
        int i;
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        FuzzerUtils.init(iArr, 88);
        int i2 = 29128;
        float f = -42.418f;
        vMeth(29128, -42.418f);
        int i3 = -232;
        int i4 = -152;
        int i5 = -12;
        int i6 = 160;
        while (i6 > 10) {
            int i7 = ((i2 >>> 1) % 2) + 50;
            if (i7 == 50) {
                i2 += i6 | i3;
                iArr[i6] = iArr[i6];
            } else if (i7 == 51) {
                i4 = 1;
                while (true) {
                    i4 += 2;
                    if (i4 < 21) {
                        instanceCount += f;
                        int i8 = 1;
                        while (true) {
                            long j = instanceCount;
                            i3 = (int) ((i3 - i4) + (((i8 * j) + i4) - j));
                            i = ((int) j) | (-17009);
                            instanceCount = j + (((i8 * i3) + i6) - byFld);
                            i8++;
                            if (i8 >= 3) {
                                break;
                            }
                        }
                        bArrFld[i6 - 1] = true;
                        i5 = i8;
                        i2 = i;
                        f = -42.418f;
                    }
                }
            }
            i6 -= 2;
            f = -42.418f;
        }
        long floatToIntBits = i2 + Float.floatToIntBits(-42.418f) + i6 + i3 + i4 + i5 + 1 + FuzzerUtils.checkSum(iArr);
        lMeth_check_sum += floatToIntBits;
        return floatToIntBits;
    }

    public int iMeth() {
        int i = this.iFld;
        float f = -101.128f;
        float f2 = -35.345f;
        int i2 = -93;
        int i3 = -9297;
        int i4 = -21449;
        switch ((((i - i) >>> 1) % 8) + 68) {
            case 68:
                double d = dFld;
                long j = instanceCount;
                double d2 = j;
                Double.isNaN(d2);
                double d3 = d * d2;
                dFld = d3;
                byte[] bArr = byArrFld;
                byArrFld = bArr;
                byArrFld = bArr;
                byArrFld = bArr;
                int[] iArr = this.iArrFld;
                int i5 = (i >>> 1) % N;
                double d4 = i;
                Double.isNaN(d4);
                int i6 = (int) (d3 + d4);
                this.iFld = i6;
                iArr[i5] = (int) (i6 - j);
                break;
            case 69:
                long j2 = instanceCount;
                long j3 = j2 - 1;
                instanceCount = j3;
                double d5 = j3;
                Double.isNaN(d5);
                double d6 = j3 + i;
                Double.isNaN(d6);
                double d7 = this.lArrFld[177][(i >>> 1) % N][(i >>> 1) % N];
                Double.isNaN(d7);
                instanceCount = j2 * ((long) ((-((-67.104506d) - d5)) + d6 + d7));
                break;
            case 70:
                f = 190.0f;
                while (1.0f < f) {
                    int max = i2 - Math.max(this.iFld, this.iArrFld[(int) f]);
                    this.iFld = (int) lMeth();
                    long j4 = instanceCount * max;
                    instanceCount = j4;
                    i2 = max + ((int) (((f * f) + ((float) j4)) - ((float) j4)));
                    f -= 1.0f;
                }
                i3 = 4;
                while (197 > i3) {
                    dFld = -11.0d;
                    i3++;
                }
                break;
            case 71:
                dFld = -93;
                break;
            case 72:
            case 73:
                f2 = (-35.345f) * ((float) dFld);
                break;
            case 74:
                i4 = -30746;
                break;
            case 75:
                this.iFld = i | (-9297);
                break;
        }
        long floatToIntBits = Float.floatToIntBits(f) + i2 + 0 + i3 + i4 + Float.floatToIntBits(f2);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r24) {
        /*
            Method dump skipped, instructions count: 862
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
