// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:16:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9098291403467545512L;
    public static float fFld=-104.961F;
    public static volatile int iFld=47057;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 64166);
        FuzzerUtils.init(Test.lArrFld, 62351L);
    }

    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long lMeth1_check_sum = 0;

    public static long lMeth1(int i5, int i6, double d1) {

        short s=-6770;
        int i8=-5, i9=37, i10=-52, i11=-40554;
        boolean b=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 163L);

        try {
            i5 *= i6;
            lArr[(i5 >>> 1) % N] += 1;
            Test.instanceCount = i6;
            for (int i7 : Test.iArrFld) {
                i6 -= s;
            }
            Test.fFld = Test.instanceCount;
        }
        catch (UserDefinedExceptionTest exc1) {
            for (i8 = 208; i8 > 3; --i8) {
                for (i10 = 1; 8 > i10; i10 += 3) {
                    d1 += i5;
                    if (b) continue;
                    lArr[i8 + 1] += -45L;
                    Test.fFld *= i5;
                    i9 *= (int)Test.instanceCount;
                    if (b) break;
                }
            }
        }
        long meth_res = i5 + i6 + Double.doubleToLongBits(d1) + s + i8 + i9 + i10 + i11 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
        lMeth1_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth(int i3, int i4) {

        double d=2.68183, d2=-10.50880;
        int i12=-37, i13=219, i14=161, i15=-201, i16=-64;
        long l2=-42L;

        d *= (((Test.instanceCount + -4) + lMeth1(10, i4, d)) >> i4);
        d += i3;
        d -= i3;
        i3 = i4;
        for (i12 = 15; i12 < 363; ++i12) {
            for (i14 = 5; 1 < i14; i14 -= 3) {
                i4 += (i14 | i13);
            }
            for (d2 = 1; d2 < 5; d2++) {
                switch (((i16 >>> 1) % 6) + 83) {
                case 83:
                    Test.instanceCount += (long)Test.fFld;
                    if (i12 != 0) {
                        vMeth_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 +
                            Double.doubleToLongBits(d2) + i16 + l2;
                        return;
                    }
                    break;
                case 84:
                    i15 ^= i15;
                    if (i4 != 0) {
                        vMeth_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 +
                            Double.doubleToLongBits(d2) + i16 + l2;
                        return;
                    }
                    Test.iFld = (int)Test.fFld;
                    Test.iArrFld = Test.iArrFld;
                    break;
                case 85:
                    i13 >>= i4;
                case 86:
                    l2 *= (long)d;
                    break;
                case 87:
                    i15 += (22761 + (d2 * d2));
                    break;
                case 88:
                    d -= i13;
                    break;
                }
            }
        }
        vMeth_check_sum += i3 + i4 + Double.doubleToLongBits(d) + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d2) +
            i16 + l2;
    }

    public long lMeth(long l) {

        int i1=238, i2=-11, i17=3;
        long l1=6261206561801069038L;
        short s1=25928;

        for (i1 = 15; 263 > i1; i1++) {
            l1 = 1;
            do {
                vMeth(i1, 184);
                i17 = 1;
                do {
                    Test.iFld >>= i2;
                    Test.iFld /= (int)(i1 | 1);
                    Test.iFld = (int)Test.fFld;
                    i2 = s1;
                    i2 += (int)l1;
                    Test.iFld = -8;
                    i2 >>= i17;
                    Test.iArrFld[(int)(l1)] = -29041;
                    i2 <<= i1;
                    Test.lArrFld[i17 - 1] = (long)1.4049;
                } while ((i17 += 3) < 1);
                Test.iFld = i17;
            } while (++l1 < 7);
        }
        long meth_res = l + i1 + i2 + l1 + i17 + s1;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=-113.330F;
        int i=-2, i18=-61310, i19=-11, i20=144, i21=145, i22=-61224, i23=-120;
        byte by=-55;
        boolean b1=true, b2=false;

        f *= (((Test.instanceCount + i) * lMeth(Test.instanceCount)) + i);
        for (i18 = 335; i18 > 16; i18--) {
            by -= (byte)Test.instanceCount;
            i = i19;
            Test.iFld += (33656 + (i18 * i18));
            Test.iArrFld[i18 - 1] += Test.iFld;
            Test.iFld -= (int)-3841493359L;
            Test.iArrFld[i18] *= (int)f;
            for (i20 = 4; 79 > i20; i20++) {
                double d3=-82.51976;
                Test.iFld <<= 744;
                Test.iFld += i20;
                d3 = Test.iFld;
            }
        }
        for (i22 = 2; i22 < 366; i22++) {
            if (b1) {
                i19 -= (int)56L;
                i23 -= 185;
            } else if (b2) {
                Test.instanceCount = i22;
                Test.iArrFld[i22] <<= i20;
            } else if (false) {
                i21 += 170;
                if (b1) break;
                i19 &= i20;
            } else {
                if (b1) break;
                i21 += (int)-14L;
            }
            i21 = i20;
            i19 += (i22 | i20);
            i23 -= (int)f;
            b2 = b2;
            i23 = -224;
            Test.instanceCount = Test.instanceCount;
        }
        Test.instanceCount = (long)45.95053;

        FuzzerUtils.out.println("f i i18 = " + Float.floatToIntBits(f) + "," + i + "," + i18);
        FuzzerUtils.out.println("i19 by i20 = " + i19 + "," + by + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("b1 b2 = " + (b1 ? 1 : 0) + "," + (b2 ? 1 : 0));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.iFld);
        FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth mainTest
//DEBUG  lMeth1 ->  lMeth1 vMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
