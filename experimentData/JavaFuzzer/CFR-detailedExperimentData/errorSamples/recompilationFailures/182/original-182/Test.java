// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 22:35:14 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=254L;
    public static float fFld=-2.83F;
    public static double dFld=8.102582;
    public static volatile float fFld1=-126.86F;
    public volatile int iFld=26;
    public boolean bFld=true;
    public static short sArrFld[]=new short[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)9775);
        FuzzerUtils.init(Test.iArrFld, -51588);
    }

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i7=46803, i8=95, i9=111, i10=-232, i11=12, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 18877);

        for (i7 = 3; i7 < 167; ++i7) {
            for (i9 = i7; i9 < 10; i9 += 3) {
                i10 -= (int)-83.780F;
                i11 = 1;
                do {
                    try {
                        i10 = (i8 % -87);
                        i8 = (i11 % 522520565);
                        i10 = (i8 / i11);
                    } catch (ArithmeticException a_e) {}
                    i8 <<= i10;
                    Test.instanceCount = 235L;
                    iArr[i9 - 1] += i7;
                    i8 = i7;
                    Test.instanceCount &= 63032;
                    i10 *= i9;
                    Test.fFld += i8;
                    Test.fFld = i10;
                } while (++i11 < 1);
                i10 = i7;
                iArr[i9 + 1] >>= 20184;
            }
        }
        vMeth1_check_sum += i7 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i5, long l2, int i6) {

        boolean b=false;
        int i12=-8, i13=4;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 2.921F);

        for (short s : Test.sArrFld) {
            vMeth1();
            l2 |= l2;
            if (b) continue;
            try {
                i6 = (i5 / i5);
                i6 = (Test.iArrFld[(-2 >>> 1) % N] / -82044512);
                i6 = (i6 / Test.iArrFld[(i5 >>> 1) % N]);
            } catch (ArithmeticException a_e) {}
            switch (((-45354 >>> 1) % 2) + 53) {
            case 53:
                i6 -= (int)Test.fFld;
                i5 = (int)Test.instanceCount;
                i6 = (int)l2;
            case 54:
                Test.iArrFld[(i5 >>> 1) % N] = (int)Test.dFld;
                break;
            default:
                for (i12 = 4; i12 > 1; i12 -= 2) {
                    Test.fFld1 += i12;
                    if (i13 != 0) {
                        vMeth_check_sum += i5 + l2 + i6 + (b ? 1 : 0) + i12 + i13 +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                    i13 -= s;
                    fArr[i12] -= l2;
                }
            }
        }
        vMeth_check_sum += i5 + l2 + i6 + (b ? 1 : 0) + i12 + i13 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(long l, long l1, int i2) {

        int i3=-244, i4=52935, i14=-7;
        float f1=-2.29F;
        byte by=-7;

        for (i3 = 4; i3 < 170; ++i3) {
            vMeth(64278, Test.instanceCount, i2);
            i2 += i3;
        }
        for (f1 = 7; 135 > f1; ++f1) {
            i4 *= by;
            by = (byte)i2;
            Test.instanceCount = i14;
            i4 = i4;
        }
        long meth_res = l + l1 + i2 + i3 + i4 + Float.floatToIntBits(f1) + i14 + by;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=53565, i1=44, i15=45277, i16=-250, i17=4, i18=-32626, i19=-33329, i20=223, i21=51, i22=-8, i23=-9, i24=7;
        float f=-72.251F, fArr1[]=new float[N];
        byte by1=44;
        long lArr[]=new long[N];
        double dArr[][][]=new double[N][N][N];

        FuzzerUtils.init(lArr, 2806961701L);
        FuzzerUtils.init(fArr1, -83.532F);
        FuzzerUtils.init(dArr, 0.32342);

        for (i = 142; i > 5; i--) {
            lArr[i + 1] = (long)(((f++) + (++Test.instanceCount)) + (i1 = (int)fMeth(Test.instanceCount, -13L,
                -17554)));
            for (i15 = 183; i15 > 2; i15--) {
                Test.instanceCount += i15;
                switch (((i >>> 1) % 2) + 118) {
                case 118:
                    for (i17 = 1; i17 < 2; ++i17) {
                        i18 = i15;
                        i1 += (((i17 * i1) + i18) - i);
                        i18 = i19;
                    }
                    for (i20 = 1; 2 > i20; ++i20) {
                        Test.iArrFld[i15 + 1] -= i17;
                        i18 += (i20 * i20);
                        i21 *= (int)Test.instanceCount;
                        iFld ^= i;
                        Test.iArrFld[i + 1] -= iFld;
                        iFld = (int)f;
                        i19 = i22;
                        if (bFld) {
                            i21 = i17;
                            fArr1[i15] += Test.fFld;
                            if (bFld) continue;
                        } else if (true) {
                            i19 *= iFld;
                        } else {
                            Test.iArrFld[i] = (int)Test.instanceCount;
                        }
                        Test.instanceCount += 20908L;
                    }
                    for (i23 = i; i23 < 2; ++i23) {
                        i24 = i18;
                        Test.iArrFld[i - 1] ^= -32025;
                        dArr[i - 1][i + 1][i] *= -96;
                        Test.instanceCount = Test.instanceCount;
                        Test.instanceCount = i16;
                    }
                case 119:
                    by1 = (byte)i20;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 by1 lArr = " + i24 + "," + by1 + "," + FuzzerUtils.checkSum(lArr));
        FuzzerUtils.out.println("fArr1 dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.fFld1 iFld bFld = " + Float.floatToIntBits(Test.fFld1) + "," + iFld + "," + (bFld
            ? 1 : 0));
        FuzzerUtils.out.println("Test.sArrFld Test.iArrFld = " + FuzzerUtils.checkSum(Test.sArrFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

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
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
