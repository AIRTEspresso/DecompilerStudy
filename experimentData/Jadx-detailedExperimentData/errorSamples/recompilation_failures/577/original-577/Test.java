// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:16:46 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-986655698L;
    public static float fFld=-110.61F;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static boolean bArrFld[]=new boolean[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -6);
        FuzzerUtils.init(Test.lArrFld, 4118668901L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f) {

        int i2=5, i3=52768, i4=58823, i5=38703, i6=-33;
        byte by=-67;
        float f1=1.128F;
        double d1=-2.29660;

        i2 >>= i2;
        i2 = (int)Test.instanceCount;
        by = (byte)i2;
        Test.iArrFld = Test.iArrFld;
        for (f1 = 13; f1 < 337; ++f1) {
            i2 = i3;
            for (d1 = 1; 5 > d1; ++d1) {
                i4 -= (int)Test.instanceCount;
                for (i5 = 2; i5 > d1; i5 -= 2) {
                    i6 += i5;
                    f += i6;
                }
                i2 *= i6;
                if (true) {
                    i6 += (int)d1;
                    Test.instanceCount -= (long)d1;
                } else {
                    Test.instanceCount *= (long)d1;
                }
            }
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + i2 + by + Float.floatToIntBits(f1) + i3 +
            Double.doubleToLongBits(d1) + i4 + i5 + i6;
    }

    public static void vMeth1(double d) {

        float f2=-73.296F;
        int i7=-119, i8=5, i9=132;
        double d2=119.101080, dArr[]=new double[N];
        byte by1=0;

        FuzzerUtils.init(dArr, 2.70453);

        vMeth2(f2);
        i7 *= (int)-3067815193812624574L;
        Test.lArrFld = Test.lArrFld;
        d -= i7;
        i8 = 1;
        do {
            for (d2 = 7; d2 > 1; d2--) {
                d += i7;
                dArr[(int)(d2)] += -3612765705L;
                Test.iArrFld = Test.iArrFld;
                switch ((i8 % 7) + 117) {
                case 117:
                    i7 = by1;
                    d -= Test.instanceCount;
                    i9 += (int)(d2 * d2);
                case 118:
                case 119:
                    Test.lArrFld[i8 + 1] -= i8;
                    i9 = 14;
                    break;
                case 120:
                case 121:
                    i7 += (int)((long)d2 ^ Test.instanceCount);
                    break;
                case 122:
                    i7 += (int)((long)d2 | (long)f2);
                    break;
                case 123:
                    Test.instanceCount += (long)(((d2 * Test.instanceCount) + i7) - i7);
                    break;
                default:
                    Test.instanceCount += (long)((long)d2 | i9);
                }
            }
        } while (++i8 < 238);
        vMeth1_check_sum += Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + i7 + i8 +
            Double.doubleToLongBits(d2) + i9 + by1 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i, int i1) {

        double d3=-5.73201;
        short s=-14577;
        int i10=-9, i11=-2, i12=-38, i13=32815, i14=-1;
        byte by2=94;

        vMeth1(d3);
        s += (short)i;
        if (true) {
            Test.instanceCount >>= i;
            i1 += i;
        } else {
            i = 0;
            Test.instanceCount -= i1;
        }
        for (i10 = 15; 282 > i10; ++i10) {
            for (i12 = 1; i12 < 6; ++i12) {
                i14 = 1;
                while (++i14 < 2) {
                    Test.lArrFld[i10 + 1] >>= i13;
                    i /= (int)(i11 | 1);
                    i1 += by2;
                    Test.bArrFld = Test.bArrFld;
                    i1 = -176;
                }
            }
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d3) + s + i10 + i11 + i12 + i13 + i14 + by2;
    }

    public void mainTest(String[] strArr1) {

        int i15=-239, i16=-16311, i17=-46140, i18=-18483, i19=7, i20=-243, i21=1, i22=44251, i23=-62, i24=-196;
        float f3=-2.493F;
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)50);

        vMeth(i15, i15);
        i16 = 1;
        do {
            i15 = i16;
            Test.instanceCount += (i16 - i16);
            Test.iArrFld[i16 + 1] *= 6;
            i15 += (int)Test.instanceCount;
        } while (++i16 < 261);
        f3 += 62975;
        for (i17 = 3; i17 < 323; i17++) {
            for (i19 = 3; i19 < 79; i19++) {
                for (i21 = i17; i21 < 2; ++i21) {
                    i15 += i21;
                    i15 += (56 + (i21 * i21));
                }
                Test.instanceCount = 31;
                Test.instanceCount += i19;
                i20 = (int)Test.instanceCount;
                byArr[i17 - 1] -= (byte)Test.instanceCount;
                if (b) {
                    Test.iArrFld[i19] <<= i19;
                    f3 -= -103;
                    for (i23 = 1; i23 < 2; i23++) {
                        i15 -= i17;
                        if (b) break;
                        switch (((i19 % 2) * 5) + 38) {
                        case 39:
                            fArrFld[i23 - 1] -= i24;
                            break;
                        case 46:
                            i20 += i23;
                            i24 >>= i23;
                            break;
                        default:
                            Test.fFld = Test.instanceCount;
                            b = b;
                            i20 *= (int)1.505F;
                        }
                        i22 = (int)-1L;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i15 i16 f3 = " + i15 + "," + i16 + "," + Float.floatToIntBits(f3));
        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 b = " + i23 + "," + i24 + "," + (b ? 1 : 0));
        FuzzerUtils.out.println("byArr = " + FuzzerUtils.checkSum(byArr));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iArrFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.bArrFld fArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.bArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
