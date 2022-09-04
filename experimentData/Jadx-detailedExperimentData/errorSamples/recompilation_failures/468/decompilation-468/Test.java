/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome/eposide-1/468/original-468/Test.dex */
public class Test {
    public float fFld = 1.809f;
    public static long instanceCount = -157;
    public static final int N = 400;
    public static int[] iArrFld = new int[N];
    public static volatile long[] lArrFld = new long[N];
    public static int[] iArrFld1 = new int[N];
    public static float[] fArrFld = new float[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    static {
        FuzzerUtils.init(iArrFld, 20852);
        FuzzerUtils.init(lArrFld, -1877516366L);
        FuzzerUtils.init(iArrFld1, 242);
        FuzzerUtils.init(fArrFld, -119.534f);
    }

    public static int iMeth(int i) {
        float[] fArr;
        int i2;
        byte b;
        short s;
        double d;
        int i3;
        byte b2;
        short s2;
        double d2;
        byte b3;
        short s3;
        double d3;
        int i4;
        short s4;
        double d4;
        double d5;
        int i5;
        double d6;
        int i6;
        double d7;
        int i7;
        double d8;
        int i8;
        int i9;
        double d9;
        int i10;
        double d10;
        double d11;
        double d12;
        long j;
        float[] fArr2 = new float[N];
        FuzzerUtils.init(fArr2, -3.339f);
        int i11 = (-4689) - ((int) instanceCount);
        int i12 = -50981;
        int i13 = -39770;
        int i14 = -83;
        float f = -82.33f;
        byte b4 = -94;
        short s5 = -1330;
        int i15 = i;
        double d13 = 0.40652d;
        int i16 = 10;
        int i17 = -63;
        while (i16 < 168) {
            int i18 = i11 * (-191);
            switch ((i16 * 5) + 20) {
                case 23:
                    fArr = fArr2;
                    i2 = i15;
                    d = d13;
                    b = b4;
                    s = s5;
                    instanceCount = i13;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 26:
                    fArr = fArr2;
                    i3 = i15;
                    d2 = d13;
                    b2 = b4;
                    s2 = s5;
                    i12 -= i17;
                    i15 = i3;
                    i12 |= i13;
                    d13 = d2;
                    i11 = i18;
                    s5 = s2;
                    b4 = b2;
                    break;
                case 33:
                case 98:
                    fArr = fArr2;
                    i17 += i15;
                    i11 = i18;
                    break;
                case 43:
                case 298:
                    fArr = fArr2;
                    i4 = i15;
                    d3 = d13;
                    b3 = b4;
                    s3 = s5;
                    int[] iArr = iArrFld;
                    iArr[i16] = iArr[i16] & i4;
                    d13 = d3;
                    i15 = i14;
                    i11 = i18;
                    s5 = s3;
                    b4 = b3;
                    break;
                case 44:
                    fArr = fArr2;
                    d4 = d13;
                    s4 = s5;
                    d13 = d4;
                    i11 = i18;
                    s5 = s4;
                    f = -1.0f;
                    break;
                case 57:
                    fArr = fArr2;
                    i11 = i18;
                    i17 = s5;
                    s5 = i17;
                    break;
                case 69:
                    fArr = fArr2;
                    i11 = 194;
                    break;
                case 71:
                    fArr = fArr2;
                    i2 = i15;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 78:
                    fArr = fArr2;
                    d5 = d13;
                    i15 += i13;
                    instanceCount -= i18;
                    d13 = d5;
                    i11 = i18;
                    s5 = s5;
                    b4 = b4;
                    break;
                case 82:
                    fArr = fArr2;
                    i11 = i18 + (i16 * i13);
                    break;
                case 88:
                    fArr = fArr2;
                    i5 = i15;
                    d6 = d13;
                    i12 = 9;
                    i15 = i5;
                    d13 = d6;
                    i11 = i18;
                    break;
                case 91:
                case 230:
                    fArr = fArr2;
                    i6 = i15;
                    d7 = d13;
                    b4 = (byte) (b4 >> ((byte) i12));
                    iArrFld[i16] = -8;
                    i15 = i6;
                    d13 = d7;
                    i11 = i18;
                    break;
                case 95:
                    fArr = fArr2;
                    i7 = i15;
                    d8 = d13;
                    lArrFld[i16] = instanceCount;
                    i15 = i7;
                    s5 = (short) i12;
                    d13 = d8;
                    i11 = i18;
                    break;
                case 115:
                    fArr = fArr2;
                    i8 = i15;
                    d4 = d13;
                    b4 = (byte) instanceCount;
                    i15 = i8 * i13;
                    s4 = s5;
                    d13 = d4;
                    i11 = i18;
                    s5 = s4;
                    f = -1.0f;
                    break;
                case 117:
                    fArr = fArr2;
                    i9 = i15;
                    d9 = d13;
                    i17 = s5;
                    double d14 = i17;
                    Double.isNaN(d14);
                    d13 = d9 - d14;
                    i15 = i9;
                    i11 = i18;
                    break;
                case 120:
                    fArr = fArr2;
                    i3 = i15;
                    d2 = d13;
                    b2 = b4;
                    s2 = s5;
                    i15 = i3;
                    i12 |= i13;
                    d13 = d2;
                    i11 = i18;
                    s5 = s2;
                    b4 = b2;
                    break;
                case 123:
                    fArr = fArr2;
                    i2 = i15;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 136:
                    fArr = fArr2;
                    i10 = i15;
                    d10 = d13;
                    i15 = i10;
                    d13 = d10;
                    i11 = i18;
                    break;
                case 138:
                    fArr = fArr2;
                    i8 = i15;
                    d4 = d13;
                    i15 = i8 * i13;
                    s4 = s5;
                    d13 = d4;
                    i11 = i18;
                    s5 = s4;
                    f = -1.0f;
                    break;
                case 140:
                case 239:
                    fArr = fArr2;
                    int i19 = i15;
                    d11 = d13;
                    try {
                        i18 %= i12;
                        i15 = i12 / i18;
                        try {
                            iArrFld[i16 + 1] = i12 / i15;
                        } catch (ArithmeticException e) {
                        }
                    } catch (ArithmeticException e2) {
                        i15 = i19;
                    }
                    double d15 = d11;
                    d13 = d15;
                    i11 = i18 + ((int) d15);
                    break;
                case 151:
                    fArr = fArr2;
                    i11 = i18;
                    i15 = -148;
                    break;
                case 153:
                    fArr = fArr2;
                    i9 = i15;
                    d9 = d13;
                    i17 = s5;
                    double d142 = i17;
                    Double.isNaN(d142);
                    d13 = d9 - d142;
                    i15 = i9;
                    i11 = i18;
                    break;
                case 156:
                    fArr = fArr2;
                    d5 = d13;
                    instanceCount -= i18;
                    d13 = d5;
                    i11 = i18;
                    s5 = s5;
                    b4 = b4;
                    break;
                case 169:
                    fArr = fArr2;
                    i2 = i15;
                    instanceCount += 17547;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 172:
                    fArr = fArr2;
                    b4 = (byte) (b4 + 74);
                    i11 = i18;
                    break;
                case 175:
                    fArr = fArr2;
                    i11 = i18 + i12;
                    break;
                case 187:
                    fArr = fArr2;
                    i6 = i15;
                    d7 = d13;
                    iArrFld[i16] = -8;
                    i15 = i6;
                    d13 = d7;
                    i11 = i18;
                    break;
                case 191:
                    fArr = fArr2;
                    int i20 = i15;
                    double d16 = d13;
                    try {
                        i12 = iArrFld[i16 + 1] % i14;
                        i18 = 1861907854 % i17;
                        i15 = iArrFld[i16 - 1] % i17;
                        i11 = i18;
                        d13 = d16;
                        break;
                    } catch (ArithmeticException e3) {
                        i15 = i20;
                        i11 = i18;
                        d13 = d16;
                        break;
                    }
                case 197:
                    fArr = fArr2;
                    i12 = i17;
                    i11 = i18;
                    break;
                case 198:
                    fArr = fArr2;
                    i2 = i15;
                    instanceCount = i12;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 200:
                    fArr = fArr2;
                    i9 = i15;
                    d9 = d13;
                    double d1422 = i17;
                    Double.isNaN(d1422);
                    d13 = d9 - d1422;
                    i15 = i9;
                    i11 = i18;
                    break;
                case 202:
                    fArr = fArr2;
                    i2 = i15;
                    int[] iArr2 = iArrFld1;
                    int i21 = i16 - 1;
                    iArr2[i21] = iArr2[i21] + i16;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 203:
                    fArr = fArr2;
                    i17 = 149;
                    i11 = i18;
                    break;
                case 208:
                    fArr = fArr2;
                    i3 = i15;
                    i12 += 171;
                    d2 = d13;
                    b2 = b4;
                    s2 = s5;
                    i12 -= i17;
                    i15 = i3;
                    i12 |= i13;
                    d13 = d2;
                    i11 = i18;
                    s5 = s2;
                    b4 = b2;
                    break;
                case 221:
                    fArr = fArr2;
                    i15 *= (int) instanceCount;
                    i11 = i18;
                    break;
                case 234:
                    fArr = fArr2;
                    i12 += (int) instanceCount;
                    i11 = i18;
                    break;
                case 248:
                    fArr = fArr2;
                    i11 = (int) instanceCount;
                    break;
                case 251:
                    fArr = fArr2;
                    i10 = i15;
                    i12 += i16;
                    d10 = d13;
                    i15 = i10;
                    d13 = d10;
                    i11 = i18;
                    break;
                case 256:
                    fArr = fArr2;
                    i2 = i15;
                    d12 = d13;
                    instanceCount += i16 - i2;
                    d = d12;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 262:
                    fArr = fArr2;
                    i4 = i15;
                    i17 <<= i17;
                    d3 = d13;
                    b3 = b4;
                    s3 = s5;
                    int[] iArr3 = iArrFld;
                    iArr3[i16] = iArr3[i16] & i4;
                    d13 = d3;
                    i15 = i14;
                    i11 = i18;
                    s5 = s3;
                    b4 = b3;
                    break;
                case 268:
                    fArr = fArr2;
                    f += i16 + i13;
                    i11 = i18;
                    break;
                case 274:
                    fArr = fArr2;
                    i17 <<= i14;
                    i11 = i18;
                    break;
                case 276:
                    fArr = fArr2;
                    int i22 = i15;
                    double d17 = d13;
                    try {
                        int i23 = (-109) % i16;
                        i12 = 184 / iArrFld[i16];
                        iArrFld[i16 + 1] = (-210) / i18;
                        i15 = i22;
                        i11 = i18;
                        d13 = d17;
                        break;
                    } catch (ArithmeticException e4) {
                        i15 = i22;
                        i11 = i18;
                        d13 = d17;
                        break;
                    }
                case 289:
                    fArr = fArr2;
                    i2 = i15;
                    iArrFld[i16] = 45648;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 296:
                case 363:
                    fArr = fArr2;
                    d13 = i13;
                    i11 = i18;
                    break;
                case 302:
                    fArr = fArr2;
                    f = (float) instanceCount;
                    i11 = i18;
                    break;
                case 312:
                    fArr = fArr2;
                    i2 = i15;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 315:
                    fArr = fArr2;
                    float f2 = i17;
                    long j2 = instanceCount;
                    i17 = (int) (f2 + ((((float) (i16 * j2)) + f) - ((float) j2)));
                    i11 = i18;
                    d13 = d13;
                    break;
                case 316:
                    fArr = fArr2;
                    f *= i13;
                    i11 = i18;
                    break;
                case 317:
                    fArr = fArr2;
                    i2 = i15;
                    d = d13;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 319:
                    fArr = fArr2;
                    i15 -= (int) instanceCount;
                    i12 += (int) f;
                    d13 = s5;
                    i11 = i18;
                    break;
                case 326:
                    fArr = fArr2;
                    d13 = s5;
                    i11 = i18;
                    break;
                case 328:
                    fArr = fArr2;
                    i7 = i15;
                    d8 = d13;
                    i15 = i7;
                    s5 = (short) i12;
                    d13 = d8;
                    i11 = i18;
                    break;
                case 331:
                    fArr = fArr2;
                    int i24 = 10;
                    do {
                        j = instanceCount + i24;
                        instanceCount = j;
                        i15 = (i15 - 13798) >>> i17;
                        d13 -= 41243.0d;
                        i24--;
                    } while (i24 > 0);
                    f += i16 * i17;
                    instanceCount = i16;
                    i13 = i24;
                    i11 = (int) j;
                    i14 = 1;
                    break;
                case 333:
                    i2 = i15;
                    fArr = fArr2;
                    instanceCount += i16;
                    d12 = d13;
                    instanceCount += i16 - i2;
                    d = d12;
                    b = b4;
                    s = s5;
                    i15 = i2;
                    d13 = d;
                    i11 = i18;
                    s5 = s;
                    b4 = b;
                    break;
                case 335:
                    fArr = fArr2;
                    i12 += (int) f;
                    d13 = s5;
                    i11 = i18;
                    break;
                case 339:
                    i11 = i18 >> i12;
                    fArr = fArr2;
                    break;
                case 347:
                    fArr = fArr2;
                    d3 = d13;
                    b3 = b4;
                    s3 = s5;
                    d13 = d3;
                    i15 = i14;
                    i11 = i18;
                    s5 = s3;
                    b4 = b3;
                    break;
                case 348:
                case 357:
                    fArr = fArr2;
                    i11 = i18 + i17;
                    break;
                case 349:
                    i5 = i15;
                    fArr2[i16] = fArr2[i16] + ((float) instanceCount);
                    fArr = fArr2;
                    d6 = d13;
                    i12 = 9;
                    i15 = i5;
                    d13 = d6;
                    i11 = i18;
                    break;
                case 358:
                    i5 = i15;
                    instanceCount = 2237L;
                    fArr2[i16] = fArr2[i16] + ((float) instanceCount);
                    fArr = fArr2;
                    d6 = d13;
                    i12 = 9;
                    i15 = i5;
                    d13 = d6;
                    i11 = i18;
                    break;
                case 359:
                    fArr = fArr2;
                    d11 = d13;
                    double d152 = d11;
                    d13 = d152;
                    i11 = i18 + ((int) d152);
                    break;
                case 362:
                    fArr = fArr2;
                    i11 = i18;
                    f = -148.0f;
                    break;
                case 369:
                    double d18 = i13;
                    Double.isNaN(d18);
                    d13 -= d18;
                    i15 = i15;
                    fArr = fArr2;
                    i11 = i18;
                    break;
                default:
                    fArr = fArr2;
                    i15 += i18;
                    i11 = i18;
                    break;
            }
            i16++;
            fArr2 = fArr;
        }
        long doubleToLongBits = i15 + i11 + i16 + i12 + i13 + i14 + i17 + Double.doubleToLongBits(d13) + Float.floatToIntBits(f) + b4 + 0 + s5 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2));
        iMeth_check_sum += doubleToLongBits;
        return (int) doubleToLongBits;
    }

    public static void vMeth(int i, int i2) {
        long j;
        int[] iArr = new int[N];
        float[] fArr = new float[N];
        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(fArr, -44.528f);
        int i3 = 1;
        while (i3 < 139) {
            iArr[i3] = iArr[i3] >>> iMeth(i2);
            if ((((i2 >>> 1) % 1) * 5) + 65 == 67) {
                int i4 = i2 + (i3 * i3);
                double d = 1.0d;
                do {
                    instanceCount = instanceCount;
                    d += 1.0d;
                } while (d < 11.0d);
                vMeth_check_sum += ((((((((-1) + i4) + i3) + 112) + Double.doubleToLongBits(d)) + 112) - 13) - 7) + (3 - ((int) j)) + 0 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                return;
            }
            fArr[i3] = fArr[i3] * (-13);
            i3++;
        }
        vMeth_check_sum += (((((((i + i2) + i3) - 2) + Double.doubleToLongBits(1.122722d)) + 112) - 13) - 7) + 3 + 0 + FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vSmallMeth(double d, int i, int i2) {
        vMeth(i2, 20157);
        vSmallMeth_check_sum += Double.doubleToLongBits(d) + i + i2;
    }

    public void mainTest(String[] strArr) {
        int[] iArr = new int[N];
        FuzzerUtils.init(iArr, 236);
        int i = 58062;
        int i2 = -175;
        int i3 = 32099;
        int i4 = -28749;
        int i5 = -233;
        int i6 = 16581;
        int i7 = -210;
        int i8 = -211;
        int i9 = -7;
        double d = -18.44299d;
        int i10 = 196;
        while (i10 > 7) {
            double d2 = d;
            int i11 = 397;
            while (i11 > 13) {
                double d3 = 1.0d;
                while (d3 < 2.0d) {
                    double d4 = i4;
                    Double.isNaN(d4);
                    i4 = (int) (d4 + ((d3 * d3) - 247.0d));
                    float f = this.fFld + 1.0f;
                    this.fFld = f;
                    double d5 = f;
                    Double.isNaN(d5);
                    this.fFld = (float) (((long) (d3 + d5)) >> iArr[i11 - 1]);
                    d3 += 1.0d;
                }
                i = (int) instanceCount;
                i11--;
                d2 = d3;
            }
            for (int i12 = 0; i12 < 62; i12++) {
                vSmallMeth(d2, i10, i11);
            }
            int i13 = i11;
            instanceCount += ((i10 * i3) + i11) - i4;
            int i14 = i;
            int i15 = i4;
            int i16 = i6;
            int i17 = i7;
            int i18 = i10;
            while (397 > i18) {
                int[] iArr2 = iArrFld1;
                iArr2[i10] = iArr2[i10] + 46760;
                int i19 = i16 + i13;
                int i20 = i18 + 1;
                try {
                    try {
                        iArr[i20] = iArrFld[i18] % 196;
                        i15 = 6 % i15;
                        i15 = i18 / (-116);
                    } catch (ArithmeticException e) {
                    }
                } catch (ArithmeticException e2) {
                }
                try {
                    i3 = i19 / (-144);
                    i15 = 1 % i3;
                    iArrFld[i18 - 1] = (-8) / i3;
                } catch (ArithmeticException e3) {
                }
                i14 = -64;
                i16 = i19;
                i18 = i20;
                i17 = 1;
            }
            long[] jArr = lArrFld;
            jArr[i10] = jArr[i10] + i18;
            i8 = i8;
            int i21 = 1;
            do {
                i8 -= -69;
                i3 ^= i15;
                i21++;
            } while (i21 < 397);
            i10 -= 3;
            i5 = i18;
            i2 = i13;
            i4 = i15;
            i6 = i16;
            i7 = i17;
            d = d2;
            i9 = i21;
            i = i14;
        }
        FuzzerUtils.out.println("i i1 i2 = " + i10 + "," + i + "," + i2);
        FuzzerUtils.out.println("i3 d i4 = " + i3 + "," + Double.doubleToLongBits(d) + "," + i4);
        FuzzerUtils.out.println("i24 i25 i26 = " + i5 + "," + i6 + "," + i7);
        FuzzerUtils.out.println("i27 i28 by2 = " + i8 + "," + i9 + ",-69");
        FuzzerUtils.out.println("iArr = " + FuzzerUtils.checkSum(iArr));
        FuzzerUtils.out.println("Test.instanceCount fFld Test.iArrFld = " + instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.iArrFld1 Test.fArrFld = " + FuzzerUtils.checkSum(lArrFld) + "," + FuzzerUtils.checkSum(iArrFld1) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
