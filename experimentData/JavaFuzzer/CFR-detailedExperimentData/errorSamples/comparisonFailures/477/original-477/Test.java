// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 00:28:33 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2408418474L;
    public static int iFld=49210;
    public static byte byFld=127;
    public static boolean bFld=false;
    public static float fFld=8.153F;
    public static double dFld=-53.81110;
    public static long lFld=-2516580881L;
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)126);
        FuzzerUtils.init(Test.lArrFld, -2L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d, int i3) {

        int i4=-43255, i5=-7, i6=-57, i7=-1, i8=162, i9=10, i10=-21950, i11=9986;

        for (i4 = 3; i4 < 163; ++i4) {
            i3 &= -10;
            Test.byFld = (byte)-108;
            i5 += (i4 ^ i3);
        }
        for (i6 = 5; i6 < 221; ++i6) {
            switch (((i6 % 6) * 5) + 113) {
            case 130:
                i3 *= (int)d;
                i3 += i6;
            case 123:
                i7 += (i6 * i6);
                for (i8 = i6; i8 < 7; ++i8) {
                    Test.instanceCount += (i8 * i8);
                    for (i10 = 1; i10 > i8; i10--) {
                        Test.bFld = Test.bFld;
                        i11 ^= (int)Test.instanceCount;
                        Test.iFld += (-2 + (i10 * i10));
                    }
                }
                break;
            case 131:
                if (Test.bFld) continue;
                break;
            case 129:
                Test.iFld += (int)Test.instanceCount;
            case 124:
                i11 *= 1;
            case 132:
                i3 = 6544;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11;
    }

    public static int iMeth(int i2, long l1, long l2) {

        float f=-114.85F;
        double d1=-2.28635;
        int i12=-5103, i13=22, i14=-13;
        long l3=1L;

        l1 += (long)(Test.iFld * ((i2 + f) - (Test.iFld - Test.byFld)));
        vMeth1(d1, Test.iFld);
        for (i12 = 11; i12 < 215; i12++) {
            f = Test.instanceCount;
            Test.iFld -= i13;
            i13 ^= (int)l2;
            l2 -= i12;
            l3 = 1;
            while (++l3 < 8) {
                i14 = 1;
                do {
                    if (Test.bFld) break;
                    i2 = i13;
                    if (Test.bFld) continue;
                    Test.iFld += (int)l3;
                } while (++i14 < 1);
                i13 &= 32878;
                i2 &= 41962;
            }
        }
        long meth_res = i2 + l1 + l2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i12 + i13 + l3 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i, int i1) {

        short s=-21477;
        int i15=-2, i16=-61993, i17=0, i18=-157, i19=-7;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -245L);

        Test.iFld -= (iMeth(Test.iFld, Test.instanceCount, Test.instanceCount) % (i | 1));
        Test.iFld -= i1;
        Test.fFld *= i1;
        Test.instanceCount = -206;
        Test.dFld -= Test.instanceCount;
        i *= Test.iFld;
        s >>= (short)i;
        i15 = 221;
        do {
            for (i16 = 1; 14 > i16; i16 += 2) {
                switch (((i16 % 2) * 5) + 1) {
                case 4:
                    i1 <<= i16;
                    for (i18 = i16; i18 < 3; ++i18) {
                        s -= (short)i18;
                        Test.iFld = (int)l;
                        i1 = i17;
                    }
                    break;
                case 10:
                    Test.byArrFld[i15] |= (byte)i17;
                    break;
                default:
                    l >>>= l;
                }
            }
        } while ((i15 -= 2) > 0);
        vMeth_check_sum += l + i + i1 + s + i15 + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i20=111, i21=26492, i22=-22019, i23=1, i24=52213, i25=9, i26=-146, i27=-27054, i28=-196;
        short s1=4572;

        Test.iFld += (int)(++Test.instanceCount);
        vMeth(Test.instanceCount, -178, Test.iFld);
        for (i20 = 9; i20 < 270; i20++) {
            Test.iFld = (int)Test.instanceCount;
            Test.iFld += i20;
            Test.dFld *= 4;
            i21 += i20;
            Test.iFld <<= Test.iFld;
            for (i22 = 96; i22 > 6; i22 -= 2) {
                Test.fFld += i22;
                i24 = 1;
                do {
                    Test.fFld += Test.instanceCount;
                    i23 <<= i24;
                    Test.dFld *= Test.iFld;
                    Test.fFld += i22;
                    i21 |= (int)Test.instanceCount;
                    Test.iFld <<= Test.byFld;
                    Test.lArrFld[i24 + 1] &= i24;
                } while (++i24 < 3);
                Test.iFld -= (int)Test.fFld;
                for (i25 = 1; 3 > i25; ++i25) {
                    Test.fFld -= 248;
                }
                i23 &= Test.iFld;
                Test.byArrFld[i20 - 1] = (byte)-169;
                Test.iFld += -63;
                switch (((i26 >>> 1) % 8) + 17) {
                case 17:
                    for (i27 = 3; i27 > 1; i27--) {
                        Test.lFld -= -59542;
                        Test.iFld = (int)Test.instanceCount;
                        i28 += (int)Test.instanceCount;
                    }
                    try {
                        i21 = (i27 % i25);
                        i23 = (i22 % 73);
                        i26 = (i21 % -12085);
                    } catch (ArithmeticException a_e) {}
                case 18:
                    iArrFld[i22 - 1] -= i27;
                    break;
                case 19:
                case 20:
                    i26 += (((i22 * Test.fFld) + Test.fFld) - s1);
                case 21:
                    i21 = i21;
                    break;
                case 22:
                case 23:
                    i23 -= i20;
                    break;
                case 24:
                    Test.lArrFld[i20 + 1] -= Test.lFld;
                }
            }
        }

        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        FuzzerUtils.out.println("s1 = " + s1);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.byFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld Test.fFld Test.dFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.lFld Test.byArrFld Test.lArrFld = " + Test.lFld + "," +
            FuzzerUtils.checkSum(Test.byArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("iArrFld = " + FuzzerUtils.checkSum(iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}