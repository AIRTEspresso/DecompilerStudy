// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:45:19 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public int iFld=-72;
    public int iArrFld[][][]=new int[N][N][N];
    public static volatile int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 159);
    }

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(double d1, float f) {

        int i7=61115, i8=-11, i9=86, i10=59198, i11=26366, iArr1[]=new int[N];
        double d2=59.11994;
        boolean b=true;
        short s1=26545;
        byte by=-68;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 21709);
        FuzzerUtils.init(lArr, 1973144196L);

        switch ((((i7 >>> 1) % 10) * 5) + 108) {
        case 136:
            d2 = 1;
            while (++d2 < 274) {
                for (i8 = 1; 6 > i8; ++i8) {
                    i9 += i8;
                    for (i10 = 1; i10 < 2; i10++) {
                        i7 = i10;
                        i7 -= i11;
                        i9 += (i10 ^ i8);
                        if (b) {
                            f += i7;
                        } else if (b) {
                            iArr1[i10 - 1] = -8694;
                            switch ((i8 % 9) + 49) {
                            case 49:
                                f = 18.61F;
                                i7 += i10;
                                d1 = f;
                                break;
                            case 50:
                                i7 = -172;
                                break;
                            case 51:
                                b = b;
                            case 52:
                                if (b) continue;
                                break;
                            case 53:
                                s1 += (short)(((i10 * i11) + Test.instanceCount) - Test.instanceCount);
                                break;
                            case 54:
                                iArr1[(int)(d2)] ^= i9;
                            case 55:
                                i7 ^= i10;
                            case 56:
                                i11 += i9;
                                break;
                            case 57:
                                f *= f;
                                break;
                            }
                        } else {
                            i11 -= -82;
                        }
                    }
                }
            }
        case 132:
            i9 *= i10;
            break;
        case 128:
            by = (byte)Test.instanceCount;
            break;
        case 126:
            Test.instanceCount <<= Test.instanceCount;
        case 119:
        case 142:
            b = b;
            break;
        case 149:
            i9 *= 4;
            break;
        case 112:
            i9 <<= i7;
            break;
        case 141:
            Test.instanceCount = s1;
        case 148:
            lArr[(-72 >>> 1) % N] += i7;
            break;
        default:
            iArr1[(14 >>> 1) % N] += i7;
        }
        long meth_res = Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + i7 + Double.doubleToLongBits(d2) + i8 +
            i9 + i10 + i11 + (b ? 1 : 0) + s1 + by + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i6) {

        double d3=94.123726;
        float f1=39.423F, fArr[]=new float[N];
        int i13=-251, i14=-10, i15=1, i16=-172;
        byte by1=14;
        long lArr1[]=new long[N];

        FuzzerUtils.init(fArr, -100.734F);
        FuzzerUtils.init(lArr1, 2968121567L);

        fArr[(i6 >>> 1) % N] *= lMeth(d3, f1);
        i6 %= (int)(i6 | 1);
        i6 -= i6;
        for (i13 = 354; i13 > 22; --i13) {
            Test.iArrFld1[i13 - 1] = (int)2.60997;
            i14 -= i14;
            i6 *= (int)Test.instanceCount;
            switch (((i13 % 3) * 5) + 11) {
            case 21:
                i6 = (int)d3;
                d3 += i14;
                i6 += i13;
                for (i15 = 5; i15 > 1; --i15) {
                    Test.instanceCount += i15;
                    i6 *= (int)Test.instanceCount;
                }
                break;
            case 19:
            case 25:
                lArr1[i13] -= by1;
            default:
                i16 += i13;
            }
        }
        long meth_res = i6 + Double.doubleToLongBits(d3) + Float.floatToIntBits(f1) + i13 + i14 + i15 + i16 + by1 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static boolean bMeth() {

        int i5=-1302, i17=-157, i18=26444, i19=6, iArr[]=new int[N];
        float f2=31.429F, fArr1[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, 54687);
        FuzzerUtils.init(lArr2, 150L);
        FuzzerUtils.init(fArr1, 0.894F);

        iArr[(i5 >>> 1) % N] >>= (int)(((i5 + i5) - iMeth(i5)) + Test.instanceCount);
        i5 -= i5;
        Test.iArrFld1[(i5 >>> 1) % N] = i5;
        i5 = 19965;
        Test.iArrFld1 = FuzzerUtils.int1array(N, (int)9267);
        i17 = 1;
        while (++i17 < 313) {
            i5 = i17;
            for (i18 = i17; i18 < 5; i18++) {
                lArr2[i18 - 1] -= (long)f2;
                i19 = i17;
                i5 += (i18 ^ Test.instanceCount);
                switch ((i18 % 2) + 113) {
                case 113:
                    Test.instanceCount *= Test.instanceCount;
                    i5 = (int)5932684690181128199L;
                case 114:
                    fArr1[i17 - 1] += i18;
                    break;
                default:
                    i5 *= (int)-2.708F;
                }
            }
        }
        long meth_res = i5 + i17 + i18 + i19 + Float.floatToIntBits(f2) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=-58673, i1=205, i2=59154, i3=6, i4=-9;
        double d=0.47668, dArr[]=new double[N];
        short s=-17786;
        boolean b1=true;
        byte byArr[]=new byte[N];
        float fArr2[]=new float[N];
        long lArr3[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-28);
        FuzzerUtils.init(fArr2, 101.16F);
        FuzzerUtils.init(dArr, -1.43286);
        FuzzerUtils.init(lArr3, 150L);

        iFld *= (int)(-(Test.instanceCount + -133L));
        for (i = 4; 354 > i; i++) {
            try {
                i1 = (iArrFld[i][i + 1][i - 1] % iArrFld[i][i + 1][i + 1]);
                i1 = (10144 % iFld);
                i1 = (i % 59600);
            } catch (ArithmeticException a_e) {}
            for (i2 = 3; i2 < 72; i2++) {
                i4 = 2;
                do {
                    d -= iArrFld[i4 + 1][i4 - 1][i4 - 1];
                    s = byArr[i4];
                    if (bMeth()) {
                        i1 += (i4 * i4);
                    }
                    Test.instanceCount -= -27253;
                    fArr2[i4 + 1] *= s;
                    switch (((i4 % 5) * 5) + 83) {
                    case 84:
                        d += i3;
                        Test.iArrFld1[i4] = (int)Test.instanceCount;
                        i3 &= i1;
                        dArr = dArr;
                        break;
                    case 88:
                        switch (((i2 % 10) * 5) + 38) {
                        case 53:
                            iFld <<= iFld;
                            Test.instanceCount -= i4;
                            Test.instanceCount = Test.instanceCount;
                            i1 *= i4;
                            break;
                        case 42:
                            switch ((i4 % 4) + 17) {
                            case 17:
                                Test.instanceCount <<= i4;
                                break;
                            case 18:
                                Test.instanceCount <<= i4;
                                i3 *= (int)Test.instanceCount;
                                Test.instanceCount += (i4 | i1);
                                break;
                            case 19:
                                lArr3 = lArr3;
                                lArr3[i4 + 1] = 1253704757L;
                                i1 -= i3;
                                break;
                            case 20:
                                iFld *= (int)d;
                                break;
                            }
                            break;
                        case 68:
                            Test.iArrFld1[i4 + 1] = i2;
                            break;
                        case 88:
                            iFld ^= -9;
                            break;
                        case 44:
                            Test.instanceCount += (i4 | i4);
                        case 64:
                            i1 = (int)Test.instanceCount;
                        case 85:
                            iFld += (i4 ^ i3);
                            break;
                        case 77:
                            i3 += i4;
                            break;
                        case 54:
                            Test.instanceCount *= iFld;
                            break;
                        case 41:
                            Test.instanceCount += (i4 * i4);
                            break;
                        default:
                            if (false) continue;
                        }
                        break;
                    case 98:
                        if (b1) break;
                        break;
                    case 94:
                        b1 = b1;
                    case 100:
                        s += (short)124.560F;
                        break;
                    }
                } while (--i4 > 0);
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 i4 d = " + i3 + "," + i4 + "," + Double.doubleToLongBits(d));
        FuzzerUtils.out.println("s b1 byArr = " + s + "," + (b1 ? 1 : 0) + "," + FuzzerUtils.checkSum(byArr));
        FuzzerUtils.out.println("fArr2 dArr lArr3 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," + FuzzerUtils.checkSum(lArr3));

        FuzzerUtils.out.println("Test.instanceCount iFld iArrFld = " + Test.instanceCount + "," + iFld + "," +
            FuzzerUtils.checkSum(iArrFld));
        FuzzerUtils.out.println("Test.iArrFld1 = " + FuzzerUtils.checkSum(Test.iArrFld1));

        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}