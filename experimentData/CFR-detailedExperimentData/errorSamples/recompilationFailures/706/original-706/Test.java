// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 02:13:42 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=9976L;
    public static float fFld=0.352F;
    public static double dFld=108.26118;
    public static int iFld=-175;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -2298);
        FuzzerUtils.init(Test.lArrFld, 4826642194869447603L);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i8, int i9) {

        double d1=92.101416;
        int i10=4, i11=103, i12=-3, i13=-5, i14=-47274;
        boolean b=true;
        short s=3682;

        for (d1 = 6; d1 < 260; d1++) {
            byte by=-111;
            Test.instanceCount += (long)(((d1 * by) + Test.fFld) - Test.instanceCount);
            i10 *= i10;
            i8 /= (int)(i8 | 1);
            Test.fFld -= Test.fFld;
            if (b) break;
            i8 = (int)Test.fFld;
            i9 += (int)(d1 - s);
            for (i11 = 6; d1 < i11; --i11) {
                i8 = i11;
                i8 = (int)Test.instanceCount;
            }
            s += (short)(d1 + Test.instanceCount);
        }
        for (i13 = 22; 382 > i13; ++i13) {
            if (i9 != 0) {
                vMeth1_check_sum += i8 + i9 + Double.doubleToLongBits(d1) + i10 + (b ? 1 : 0) + s + i11 + i12 + i13 +
                    i14;
                return;
            }
            i14 = i11;
        }
        vMeth1_check_sum += i8 + i9 + Double.doubleToLongBits(d1) + i10 + (b ? 1 : 0) + s + i11 + i12 + i13 + i14;
    }

    public static void vMeth(int i5, int i6, int i7) {

        short s1=14756, sArr[][][]=new short[N][N][N];
        int i15=-67, i16=-187;
        boolean b1=false;
        long l=-7L;

        FuzzerUtils.init(sArr, (short)330);

        switch (((((int)(-112712196L + (i5 >> Test.instanceCount))) >>> 1) % 5) + 107) {
        case 107:
            i5 += (Test.iArrFld[(i7 >>> 1) % N]++);
            vMeth1(i5, i6);
            i6 = (int)Test.instanceCount;
            break;
        case 108:
            s1 = (short)i6;
            try {
                i7 += (int)Test.instanceCount;
                for (i15 = 10; i15 < (355 + 400); ++i15) {
                    i6 -= i7;
                    if (b1) {
                        i6 += (int)Test.dFld;
                        switch ((i15 % 6) + 104) {
                        case 104:
                            i6 = (int)Test.instanceCount;
                            Test.instanceCount = s1;
                            i7 = (int)Test.dFld;
                            break;
                        case 105:
                            i6 = i5;
                            break;
                        case 106:
                            Test.instanceCount = i5;
                            break;
                        case 107:
                            Test.instanceCount <<= i15;
                            break;
                        case 108:
                            s1 = (short)i16;
                            break;
                        case 109:
                        default:
                            sArr[i15 - 1][i15 - 1][i15 - 1] = s1;
                        }
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException exc4) {
                Test.dFld -= Test.dFld;
            }
            catch (UserDefinedExceptionTest exc5) {
                i6 += i7;
            }
            break;
        case 109:
            i6 = -55200;
            break;
        case 110:
            i16 = 63;
            break;
        case 111:
            l = i15;
            break;
        default:
            i7 >>= i15;
        }
        vMeth_check_sum += i5 + i6 + i7 + s1 + i15 + i16 + (b1 ? 1 : 0) + l + FuzzerUtils.checkSum(sArr);
    }

    public static float fMeth(int i) {

        int i1=104, i2=187, i3=-253, i4=-19618, i17=28533;
        boolean b2=true;
        float fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr, 126.614F);
        FuzzerUtils.init(dArr, -50.117935);

        for (i1 = 13; i1 < 218; ++i1) {
            for (i3 = 1; 8 > i3; ++i3) {
                double d=-3.70727;
                d *= (--fArr[i3]);
                vMeth(i1, -221, 208);
            }
            Test.instanceCount += (((i1 * i4) + i2) - i3);
            i17 = 1;
            do {
                if (b2) {
                    Test.lArrFld[i17 + 1] += i4;
                    i = (int)Test.dFld;
                    dArr[i17] = Test.instanceCount;
                } else if (b2) {
                    Test.iArrFld[i1 + 1] = i;
                    if (i17 != 0) {
                    }
                    Test.lArrFld[i1 + 1] += Test.instanceCount;
                    i2 <<= i3;
                }
                Test.dFld += Test.dFld;
            } while (++i17 < 8);
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i17 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i18=-13, i19=7, i20=-13, i21=14, i22=-15, i23=0, i24=62303, i25=-123, i26=12, i27=-14, i28=6620;
        boolean b3=false, b4=false;
        short s2=-12800;

        fMeth(Test.iFld);
        Test.fFld *= (float)1.58324;
        for (i18 = 12; 219 > i18; ++i18) {
            if (true) break;
            Test.iFld = Test.iFld;
            i20 = 1;
            do {
                Test.instanceCount = i18;
                Test.iFld += i20;
                Test.iFld = Test.iFld;
            } while (++i20 < 121);
            Test.iFld <<= (int)Test.instanceCount;
            i19 %= (int)((long)(Test.fFld) | 1);
            Test.iArrFld[i18 + 1] <<= -7;
        }
        for (i21 = 12; i21 < 219; i21 += 3) {
            if (b3) break;
            i19 <<= -10;
            i22 = -12;
            i19 -= (int)1.69F;
            Test.instanceCount += (long)Test.dFld;
            for (i23 = i21; i23 < 363; ++i23) {
                for (i25 = 1; i25 < 1; ++i25) {
                    Test.lArrFld[i21] = s2;
                }
                i19 += i23;
                i24 -= i24;
                Test.iArrFld[i21 + 1] <<= 3969;
            }
            if (b3) {
                i26 += i25;
            } else if (b4) {
                for (i27 = 13; i27 < 363; ++i27) {
                    i28 = (int)Test.instanceCount;
                }
            }
            if (b3) break;
            Test.iArrFld = Test.iArrFld;
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 b3 = " + i21 + "," + i22 + "," + (b3 ? 1 : 0));
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 s2 i27 = " + i26 + "," + s2 + "," + i27);
        FuzzerUtils.out.println("i28 b4 = " + i28 + "," + (b4 ? 1 : 0));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.iFld Test.iArrFld Test.lArrFld = " + Test.iFld + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
