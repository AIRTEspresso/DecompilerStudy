
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/380/original-380/Test.dex */
public class Test {
    public static final int N = 400;
    public static long[] lArrFld;
    public static volatile long instanceCount = 11;
    public static boolean bFld = true;
    public static byte byFld = -36;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;
    public int iFld = -78;
    public float fFld = -102.9f;

    static {
        long[] jArr = new long[N];
        lArrFld = jArr;
        FuzzerUtils.init(jArr, 40180L);
    }

    public static void vMeth2(int i) {
        int[] iArr = new int[N];
        float[][][] fArr = (float[][][]) Array.newInstance(float.class, N, N, N);
        FuzzerUtils.init((Object[][]) fArr, (Object) Float.valueOf(-98.445f));
        FuzzerUtils.init(iArr, 58801);
        long j = 0;
        long j2 = 1;
        int i2 = -2;
        while (true) {
            j2 += 3;
            if (j2 < 282) {
                instanceCount = 208L;
                int i3 = (int) j2;
                fArr[(int) (j2 - 1)][45] = fArr[(int) (j2 + 1)][i3];
                iArr[i3] = iArr[i3] * (-2);
                i += i3;
                i2 = i3;
                while (i2 < 16) {
                    i >>= (int) 1;
                    i2++;
                    j = 1;
                }
            } else {
                vMeth2_check_sum += i + j2 + i2 + 243 + j + 11 + 0 + Double.doubleToLongBits(FuzzerUtils.checkSum((Object[][]) fArr)) + FuzzerUtils.checkSum(iArr);
                return;
            }
        }
    }

    public void vMeth1() {
        int i;
        int[] iArr = new int[N];
        short[] sArr = new short[N];
        FuzzerUtils.init(sArr, (short) -8240);
        FuzzerUtils.init(iArr, -15756);
        vMeth2(this.iFld);
        int i2 = this.iFld;
        sArr[(i2 >>> 1) % N] = (short) (sArr[i] - 51);
        int i3 = (i2 >>> 1) % N;
        iArr[i3] = iArr[i3] * i2;
        this.iFld = -14;
        int i4 = -75;
        int i5 = -240;
        double d = 50.2748d;
        float f = 101.493f;
        int i6 = 2;
        while (i6 < 293) {
            i4 = 1;
            while (i4 < 6) {
                i5 += (i4 * i4) + 5;
                int i7 = this.iFld * i5;
                this.iFld = i7;
                iArr[i6] = (int) d;
                int i8 = i7 * 29887;
                this.iFld = i8;
                float f2 = i4;
                this.iFld = (int) (i8 + (((f2 * f) + f2) - f));
                f += i4 + i4;
                double d2 = i6;
                Double.isNaN(d2);
                d += d2;
                i4++;
            }
            i6++;
        }
        vMeth1_check_sum += i6 + 29887 + i4 + i5 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + 0 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth() {
        byte[] bArr = new byte[N];
        FuzzerUtils.init(bArr, (byte) -89);
        int i = 5;
        int i2 = 37;
        int i3 = 1;
        while (true) {
            i3++;
            if (i3 < 184) {
                i = 1;
                while (true) {
                    i++;
                    if (i < 9) {
                        vMeth1();
                        instanceCount = i;
                        int i4 = this.iFld;
                        this.iFld = i4;
                        this.iFld = i4 << ((int) instanceCount);
                        i2 = 1;
                    }
                }
            } else {
                vMeth_check_sum += i3 + i + i2 + 1 + Float.floatToIntBits(-2.1016f) + Double.doubleToLongBits(-1.114359d) + FuzzerUtils.checkSum(bArr);
                return;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int i = this.iFld;
        this.iFld = i + 1;
        this.iFld = i;
        vMeth();
        int i2 = this.iFld;
        this.iFld = i2 + i2;
        int i3 = -31436;
        int i4 = 3;
        int i5 = -59648;
        int i6 = -99;
        byte b = 208;
        int i7 = 23219;
        int i8 = 12;
        long j = 774514488;
        short s = 23386;
        int i9 = 137;
        while (i9 > 5) {
            i4 = 9;
            while (true) {
                int i10 = 2;
                if (i4 >= 190) {
                    j = 190;
                    while (j > 1) {
                        i7 = 1;
                        while (i7 < 2) {
                            i5 += i7 ^ i7;
                            instanceCount = i5;
                            instanceCount += i7 * i7;
                            i7++;
                        }
                        i8 = (int) (i8 + ((j * j) - 57360));
                        i3 += (int) (((this.iFld * j) + i8) - instanceCount);
                        s = (short) (s + ((short) (i5 + j)));
                        this.fFld += 46220.0f;
                        j--;
                    }
                    i9--;
                } else {
                    i6 = i9;
                    b = b;
                    while (i6 < i10) {
                        long[] jArr = lArrFld;
                        int i11 = i4 - 1;
                        short s2 = s;
                        jArr[i11] = jArr[i11] + this.fFld;
                        int i12 = (i3 + i6) - i6;
                        short s3 = (short) (((short) (i6 * i6)) + 9464);
                        try {
                            int i13 = i12 / (-31031);
                            i12 = (-1896834471) / b;
                            i3 = i9 % i12;
                        } catch (ArithmeticException e) {
                            i3 = i12;
                        }
                        int i14 = b - byFld;
                        switch (((i3 >>> 1) % 4) + 87) {
                            case 87:
                                i5 >>= (int) instanceCount;
                                break;
                            case 88:
                                i3 = 156;
                                break;
                            case 89:
                            case 90:
                                i14 += i6;
                                i3 >>= s3;
                                i5 += this.iFld ^ i6;
                            default:
                                byFld = (byte) (byFld + ((byte) i5));
                                lArrFld[i6 - 1] = i5;
                                break;
                        }
                        instanceCount *= s3;
                        i6++;
                        s = s2;
                        i10 = 2;
                        b = i14;
                    }
                    i4++;
                }
            }
        }
        FuzzerUtils.out.println("i12 i13 i14 = " + i9 + "," + i3 + "," + i4);
        FuzzerUtils.out.println("i15 i16 i17 = " + i5 + "," + i6 + "," + ((int) b));
        FuzzerUtils.out.println("l2 i18 i19 = " + j + ",7361," + i7);
        FuzzerUtils.out.println("i20 s1 = " + i8 + "," + ((int) s));
        FuzzerUtils.out.println("Test.instanceCount iFld Test.bFld = " + instanceCount + "," + this.iFld + "," + (bFld ? 1 : 0));
        FuzzerUtils.out.println("fFld Test.byFld Test.lArrFld = " + Float.floatToIntBits(this.fFld) + "," + ((int) byFld) + "," + FuzzerUtils.checkSum(lArrFld));
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
