
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/203/original-203/Test.dex */
public class Test {
    public static final int N = 400;
    public volatile long[] lArrFld = new long[N];
    public static long instanceCount = -6729139300331859853L;
    public static volatile boolean bFld = false;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i, long j, int i2) {
        boolean[][][] zArr = (boolean[][][]) Array.newInstance(boolean.class, N, N, N);
        FuzzerUtils.init((Object[][]) zArr, (Object) true);
        int i3 = 369;
        while (16 < i3) {
            i <<= -1;
            zArr[i3 + 1][i3][i3 - 1] = false;
            i3 -= 3;
        }
        vMeth1_check_sum += ((((i + (j >> (-1))) + i2) + i3) - 1) + 0 + Float.floatToIntBits(-87.99992f) + FuzzerUtils.checkSum((Object[][]) zArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vMeth(int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(int, int, int):void");
    }

    public static float fMeth() {
        int i;
        long[] jArr = new long[N];
        FuzzerUtils.init(jArr, -2522260819L);
        int i2 = 160;
        vMeth(-21017, 160, 160);
        int i3 = -7;
        float f = -35.358f;
        double d = 0.54138d;
        int i4 = 1;
        do {
            i = 1;
            while (i < 5) {
                if (bFld) {
                    if (bFld) {
                        i++;
                    } else {
                        i3 += i2 ^ i;
                        int i5 = i + 1;
                        jArr[i5] = jArr[i5] - i;
                    }
                } else if (bFld) {
                    i3 = (int) instanceCount;
                    if (bFld) {
                        break;
                    }
                }
                int i6 = i3 << i3;
                long j = instanceCount;
                int i7 = (int) j;
                float f2 = i6;
                double d2 = j;
                Double.isNaN(d2);
                d -= d2;
                i3 = i6;
                i2 = i7;
                f = f2;
                i++;
            }
            i4++;
        } while (i4 < 354);
        long floatToIntBits = i2 + i4 + i + i3 + Float.floatToIntBits(f) + Double.doubleToLongBits(d) + FuzzerUtils.checkSum(jArr);
        fMeth_check_sum += floatToIntBits;
        return (float) floatToIntBits;
    }

    public void mainTest(String[] strArr) {
        int i;
        int i2;
        short s;
        long j;
        int i3;
        float f;
        int i4;
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -186);
        FuzzerUtils.init(fArr, 1.519f);
        int i5 = 1;
        int i6 = -231;
        int i7 = -7;
        float f2 = 1.144f;
        int i8 = 1;
        while (true) {
            instanceCount ^= -80;
            i = i8 + 1;
            int i9 = iArr[i];
            float f3 = i8;
            double fMeth = f3 - (fMeth() * (-127.0f));
            Double.isNaN(fMeth);
            iArr[i] = i9 + ((int) (fMeth - 125.61015d));
            float f4 = f2 + (i8 * i8);
            int i10 = i6 + i8;
            i2 = 1;
            while (true) {
                this.lArrFld[i] = i10;
                s = (short) i2;
                f4 -= 165.0f;
                iArr[i2 - 1] = 40967;
                j = instanceCount;
                i10 = (int) (i10 + (((i2 * f4) + f3) - ((float) j)));
                i2 += i5;
                if (i2 >= 174) {
                    break;
                }
                i5 = 1;
            }
            instanceCount = j - i10;
            i3 = (int) 125.61015d;
            f = -4.3577936E8f;
            while (174 > i8) {
                i8++;
                fArr[i8] = (float) 125.61015d;
                f += 11;
                bFld = bFld;
                iArr[i8] = iArr[i8] % (i2 | 1);
                i7 = 1;
            }
            i4 = 5;
            while (i4 < 174) {
                f -= i8;
                i4++;
            }
            if (i >= 144) {
                break;
            }
            i6 = i3;
            i8 = i;
            f2 = f;
            i5 = 1;
        }
        long[] jArr = this.lArrFld;
        int i11 = (i3 >>> 1) % N;
        int i12 = i7;
        jArr[i11] = jArr[i11] + i4;
        int i13 = 4;
        while (i13 < 247) {
            long j2 = instanceCount;
            i3 >>= (int) j2;
            instanceCount = j2 * ((long) 125.61015d);
            i13++;
            iArr = iArr;
            fArr = fArr;
        }
        FuzzerUtils.out.println("i d2 f3 = " + i + "," + Double.doubleToLongBits(125.61015d) + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i18 i19 s = " + i3 + "," + i2 + "," + ((int) s));
        FuzzerUtils.out.println("i21 i22 by1 = " + i8 + ",0,11");
        FuzzerUtils.out.println("i23 i24 i25 = " + i12 + ",1," + i4);
        FuzzerUtils.out.println("i26 i27 i28 = 0," + i13 + ",-176");
        FuzzerUtils.out.println("iArr fArr1 = " + FuzzerUtils.checkSum(iArr) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));
        FuzzerUtils.out.println("Test.instanceCount Test.bFld lArrFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(this.lArrFld));
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
