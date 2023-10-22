// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:39:19 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-27L;
    public static short sFld=-7298;
    public static byte byFld=-76;
    public static byte byFld1=-34;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -29690);
        FuzzerUtils.init(Test.fArrFld, -2.109F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=-60, i6=11;
        double d=1.16152;

        i5 -= Test.byFld;
        d = 1;
        while (++d < 357) {
            if (i5 != 0) {
            }
            i6 = 5;
            do {
                i5 += (24302 + (i6 * i6));
            } while (--i6 > 0);
        }
        long meth_res = i5 + Double.doubleToLongBits(d) + i6;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4) {

        int i7=-21678, i8=-10, i9=-219, i10=64791, i11=0;
        float f=-1.695F;
        boolean b=true;
        double d1=-108.98677;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -235669650L);

        Test.instanceCount *= iMeth1();
        for (i7 = 11; i7 < 360; ++i7) {
            long l=2554576780295895974L;
            lArr[(i4 >>> 1) % N] >>= i8;
            i8 += i7;
            i3 = (int)-3L;
            Test.instanceCount >>= i3;
            f = 52992;
            switch (((i7 % 10) * 5) + 15) {
            case 32:
                for (i9 = 1; 5 > i9; ++i9) {
                    i8 = -1;
                }
                break;
            case 44:
                i11 = 1;
                do {
                    b = b;
                    i3 = i3;
                    i4 >>= i11;
                    Test.iArrFld[i11 - 1] = (int)1078026792L;
                } while (++i11 < 5);
                break;
            case 25:
                Test.instanceCount -= i4;
                break;
            case 52:
                Test.fArrFld = Test.fArrFld;
                break;
            case 29:
                Test.byFld1 = Test.byFld1;
                break;
            case 38:
                d1 *= f;
                break;
            case 46:
                i3 = i9;
                break;
            case 65:
                i8 -= (int)-61L;
                break;
            case 40:
                if (b) continue;
            case 17:
                Test.instanceCount += (((i7 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                break;
            default:
                lArr[i7] -= l;
            }
        }
        vMeth_check_sum += i3 + i4 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + i11 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2) {

        int i12=14, i13=-43284, i14=-3, i15=-54, i16=-1, i17=-52709, i18=48438, i19=-20500;
        float f1=0.716F;
        double d2=96.91043;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)29449);

        i2 = Test.iArrFld[(i2 >>> 1) % N];
        vMeth(i2, i2);
        for (i12 = 178; i12 > 5; i12--) {
            for (i14 = 1; i14 < 9; ++i14) {
                sArr[i12 + 1] <<= (short)Test.instanceCount;
            }
        }
        for (i16 = 20; i16 < 365; ++i16) {
            switch ((((i15 >>> 1) % 8) * 5) + 60) {
            case 76:
                f1 -= Test.instanceCount;
                for (i18 = 1; i18 < 5; ++i18) {
                    f1 -= i18;
                    Test.bFld = Test.bFld;
                }
                if (Test.bFld) {
                    i19 -= i17;
                    Test.instanceCount += (i16 * Test.sFld);
                } else {
                    f1 += i16;
                }
            case 95:
                Test.iArrFld[i16 - 1] &= Test.sFld;
                break;
            case 93:
            case 90:
                Test.instanceCount *= (long)f1;
                break;
            case 83:
                f1 *= i12;
                break;
            case 73:
                d2 = Test.instanceCount;
                break;
            case 75:
                d2 = Test.instanceCount;
                break;
            case 78:
                Test.iArrFld[i16 + 1] -= i19;
                break;
            }
        }
        long meth_res = i2 + i12 + i13 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f1) + i18 + i19 +
            Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=8, i20=8, i21=4, i22=-40645, i23=-10265, i24=116, i25=23809, i26=1;
        float f2=-1.752F;
        double d3=52.29183;

        for (i = 2; 228 > i; ++i) {
            Test.instanceCount = (i1 + ((i - Test.sFld) * iMeth(i)));
            i1 += (((i * i1) + Test.byFld1) - i1);
            for (i20 = 4; 111 > i20; i20++) {
                for (i22 = 1; i22 < 2; ++i22) {
                    f2 = i;
                    f2 = i21;
                    Test.instanceCount = i21;
                    i23 = i23;
                    iArrFld1[i20 - 1] = (int)10L;
                }
                if (Test.bFld) {
                    for (i24 = 2; 1 < i24; i24 -= 3) {
                        Test.iArrFld[i24 - 1] = (int)Test.instanceCount;
                        switch (((i20 % 7) * 5) + 97) {
                        case 125:
                            i25 = i1;
                            f2 += i24;
                            if (Test.bFld) continue;
                            i23 = Test.sFld;
                            break;
                        case 129:
                            Test.instanceCount = -17803L;
                            i25 += (i24 * i24);
                            i23 *= (int)-9615L;
                            i23 = i;
                            break;
                        case 116:
                            switch (((i20 % 2) * 5) + 52) {
                            case 58:
                                Test.iArrFld[i] = i26;
                                i21 >>= -311;
                                break;
                            case 57:
                                i21 += (((i24 * i) + i25) - Test.instanceCount);
                                switch ((((-21 >>> 1) % 8) * 5) + 29) {
                                case 38:
                                    Test.bFld = Test.bFld;
                                    Test.fArrFld[i - 1] = i22;
                                    Test.sFld *= (short)i24;
                                case 43:
                                    i23 *= i20;
                                    break;
                                case 54:
                                    Test.instanceCount += (i24 ^ Test.byFld);
                                    break;
                                case 51:
                                    i26 -= i26;
                                    break;
                                case 49:
                                    i21 -= i24;
                                    break;
                                case 34:
                                    i21 = (int)Test.instanceCount;
                                    break;
                                case 37:
                                    d3 += f2;
                                    break;
                                case 60:
                                    i23 <<= (int)-43865L;
                                    break;
                                default:
                                    Test.instanceCount &= i24;
                                }
                                break;
                            }
                            break;
                        case 102:
                            i23 -= (int)f2;
                            break;
                        case 120:
                            Test.byFld1 += (byte)i26;
                            break;
                        case 114:
                            Test.instanceCount += 8;
                            break;
                        case 128:
                            i26 = (int)f2;
                            break;
                        default:
                            Test.instanceCount >>>= -16252;
                        }
                    }
                } else {
                    i23 = (int)19238L;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i20 = " + i + "," + i1 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("f2 i24 i25 = " + Float.floatToIntBits(f2) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 d3 = " + i26 + "," + Double.doubleToLongBits(d3));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.byFld1 Test.bFld Test.iArrFld = " + Test.byFld1 + "," + (Test.bFld ? 1 : 0) + ","
            + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.fArrFld iArrFld1 = " +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld1));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}