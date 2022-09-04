
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/599/original-599/Test.dex */
public class Test {
    public boolean bFld = false;
    public static long instanceCount = 2;
    public static float fFld = 41.231f;
    public static final int N = 400;
    public static volatile float[] fArrFld = new float[N];
    public static int[] iArrFld = new int[N];
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    static {
        FuzzerUtils.init(fArrFld, -89.767f);
        FuzzerUtils.init(iArrFld, 5);
    }

    public static void vMeth1(int i, double d, int i2) {
        int[] iArr = new int[N];
        boolean[] zArr = new boolean[N];
        double[] dArr = new double[N];
        FuzzerUtils.init(dArr, 53.80351d);
        FuzzerUtils.init(iArr, -27090);
        FuzzerUtils.init(zArr, true);
        int i3 = i2 * (-168);
        fArrFld = fArrFld;
        int i4 = -243;
        short s = -26495;
        int i5 = i;
        long j = -14;
        int i6 = 279;
        byte b = 125;
        while (i6 > 4) {
            s = (short) i3;
            b = (byte) instanceCount;
            iArr[i6 + 1] = i6;
            int i7 = (i5 << i3) + (i6 * i6) + 12;
            i5 = i7 + i7;
            zArr[i6] = true;
            j = i6;
            while (17 > j) {
                j++;
            }
            i6 -= 3;
            i4 = 1;
        }
        vMeth1_check_sum += (((((((((i5 + Double.doubleToLongBits(d)) + i3) + i6) + i4) + s) + b) + 1) + j) - 13237) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(zArr);
    }

    public static int iMeth(boolean z, int i, int i2) {
        vMeth1(i, 30.49577d, i);
        long j = i;
        instanceCount = j;
        int i3 = (int) j;
        int[] iArr = iArrFld;
        int i4 = (i3 >>> 1) % N;
        double d = 1.47841d;
        iArr[i4] = iArr[i4] * ((int) 1.47841d);
        int i5 = 41703;
        int i6 = -11;
        int i7 = 30387;
        int i8 = -156;
        int i9 = 9;
        while (i9 < 293) {
            i2 -= (int) (-32.176f);
            if (z) {
                i6 = 6;
                while (i6 > 1) {
                    if (!z) {
                        i7 = i9;
                        while (i7 < 3) {
                            i8 *= (int) instanceCount;
                            d = 28768;
                            i5 = i5 + 21961 + (i7 * i3);
                            i7++;
                        }
                    }
                    i6 -= 2;
                }
            } else if (z) {
                instanceCount += i9;
            }
            i9++;
        }
        long doubleToLongBits = (z ? 1 : 0) + i3 + i2 + Double.doubleToLongBits(d) + i9 + i5 + Float.floatToIntBits(-32.176f) + i6 + 21961 + i7 + i8 + 28768;
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth() {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 1);
        int i = iArr[21];
        long j = 188;
        instanceCount = j;
        iArr[21] = i - ((int) ((instanceCount * j) - (j >>> 0)));
        int max = 188 << ((int) Math.max(j, (-6) - iMeth(true, 188, 14)));
        int i2 = 13;
        int i3 = 7;
        int i4 = -252;
        int i5 = 197;
        int i6 = 56914;
        byte b = 72;
        int i7 = 11;
        while (196 > i7) {
            int[] iArr2 = iArrFld;
            iArr2[i7] = iArr2[i7] - i2;
            i3 = 1;
            while (i3 < 25) {
                i5 = 1;
                while (i5 < 2) {
                    float f = fFld;
                    i6 = (int) (i6 + (((i5 * i6) + i5) - i5) + (((i5 * max) + f) - i3));
                    max = max + i5 + (i5 | i6);
                    switch (((max >>> 1) % 4) + 32) {
                        case 32:
                            b = (byte) (b * ((byte) max));
                            i2 = i2 + ((int) f) + ((int) instanceCount);
                            i6 = i3;
                        case 33:
                        case 34:
                            i4 += (i5 * i5) + 53;
                            break;
                    }
                    i5++;
                }
                i3++;
            }
            i7 += 3;
        }
        vMeth_check_sum += max + 1 + i7 + i2 + i3 + i4 + i5 + i6 + b + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        FuzzerUtils.init(iArr, -31998);
        vMeth();
        int i = 1;
        int i2 = 1;
        while (true) {
            float f = fFld;
            long j = instanceCount;
            float f2 = f - ((float) j);
            fFld = f2;
            instanceCount = j + (i2 - i2);
            fFld = f2 + (i2 * i2) + 25055;
            i2 += i;
            if (i2 >= 154) {
                break;
            }
            i = 1;
        }
        int i3 = -13345;
        int i4 = -3;
        int i5 = -47564;
        int i6 = 60720;
        int i7 = -2261;
        int i8 = -99;
        byte b = -105;
        int i9 = 1;
        int i10 = -3;
        while (true) {
            int i11 = 72;
            if (this.bFld) {
                b = (byte) (b + ((byte) (i9 ^ i3)));
                instanceCount <<= i9;
                i10 = 1;
                while (i10 < 72) {
                    i3 = (int) fFld;
                    i10++;
                }
            }
            int[][] iArr2 = iArr;
            instanceCount += ((i9 * b) + i10) - i10;
            i3 += (int) fFld;
            i5 <<= i9;
            int i12 = 2;
            while (i12 < i11) {
                i3 += (i12 * i12) - 58865;
                i7 = 1;
                while (i7 < 2) {
                    int i13 = (i5 * i8) >>> i4;
                    i6 += 5;
                    long j2 = instanceCount;
                    instanceCount = j2;
                    long j3 = (i7 * i7) + 154 + j2;
                    instanceCount = j3;
                    long j4 = j3 >> ((int) j3);
                    instanceCount = j4;
                    i7++;
                    i8 = (int) (i3 + (((float) ((i7 * i9) + j4)) - fFld));
                    i5 = i13;
                    i4 = -3;
                }
                i12++;
                i11 = 72;
                i4 = -3;
            }
            i9++;
            if (i9 < 352) {
                iArr = iArr2;
                i4 = -3;
            } else {
                FuzzerUtils.out.println("i20 i21 i22 = " + i2 + "," + i3 + "," + i9);
                FuzzerUtils.out.println("by2 i23 i24 = " + ((int) b) + "," + i10 + "," + i5);
                FuzzerUtils.out.println("i25 i26 i27 = " + i12 + "," + i6 + "," + i7);
                FuzzerUtils.out.println("i28 i29 iArr2 = -194," + i8 + "," + FuzzerUtils.checkSum(iArr2));
                FuzzerUtils.out.println("Test.instanceCount Test.fFld bFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + (this.bFld ? 1 : 0));
                FuzzerUtils.out.println("Test.fArrFld Test.iArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
                FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
                FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
                FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
