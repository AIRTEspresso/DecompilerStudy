// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 21:33:57 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-3396066871785041809L;
    public static float fFld=-7.962F;
    public static byte byFld=72;
    public static boolean bFld=true;
    public double dFld=71.120897;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -13);
    }

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i2, int i3) {

        int i4=4, i5=-11, i6=7, iArr1[][]=new int[N][N];
        double d1=-44.49906;

        FuzzerUtils.init(iArr1, 164);

        for (i4 = 7; i4 < 134; ++i4) {
            switch (((i5 >>> 1) % 2) + 68) {
            case 68:
                Test.fFld -= Test.fFld;
                switch ((i4 % 2) + 38) {
                case 38:
                    i2 += (((i4 * i2) + i5) - Test.fFld);
                    i3 += i3;
                case 39:
                    Test.fFld += (i4 * Test.fFld);
                    d1 -= Test.instanceCount;
                    iArr1[i4 - 1] = iArr1[i4 + 1];
                    i6 = 1;
                    do {
                        Test.instanceCount *= (long)d1;
                        i3 = (int)d1;
                        Test.fFld -= (float)d1;
                    } while (++i6 < 12);
                    break;
                }
                i3 = -14;
                Test.byFld *= (byte)i3;
                break;
            case 69:
                if (true) continue;
            default:
                i5 += (4 + (i4 * i4));
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + i5 + Double.doubleToLongBits(d1) + i6 + FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(long l, int i1, boolean b) {

        int i7=-14525, i8=-11, i9=18154, i10=-74, i11=-29, iArr2[]=new int[N];
        double dArr[]=new double[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr2, 9);
        FuzzerUtils.init(dArr, 0.94644);
        FuzzerUtils.init(byArr, (byte)-94);

        vMeth(i1, 97);
        i1 *= i1;
        i1 *= i1;
        for (i7 = 1; i7 < 343; ++i7) {
            switch (((i7 % 7) * 5) + 33) {
            case 45:
            case 64:
                i9 = 1;
                do {
                    Test.instanceCount >>>= -13;
                    iArr2[i7] += i8;
                    i1 += (int)Test.instanceCount;
                    for (i10 = 1; i10 < 1; ++i10) {
                        Test.byFld += (byte)(i10 | i9);
                        i11 >>= i10;
                        i1 += (((i10 * Test.instanceCount) + Test.byFld) - Test.instanceCount);
                        i1 = i7;
                        Test.instanceCount += (((i10 * l) + i10) - i11);
                    }
                } while (++i9 < 5);
            case 59:
                i8 += (i7 * i7);
            case 60:
                i11 = (int)1.518;
                break;
            case 50:
                l = i9;
                break;
            case 46:
                dArr[i7] -= i10;
                break;
            case 51:
                Test.instanceCount %= (long)-117.47527;
                break;
            default:
                byArr[i7] = (byte)i9;
            }
        }
        long meth_res = l + i1 + (b ? 1 : 0) + i7 + i8 + i9 + i10 + i11 + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(byArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(byte by, float f, byte by1) {

        int i=6, i12=35842, i13=-51583, i14=38572, i15=209, iArr[]=new int[N];
        double d=0.24101;
        boolean b1=false;
        float f1=1.20F;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -13088);
        FuzzerUtils.init(lArr, 7897112876680856121L);

        f = (float)(((iArr[(i >>> 1) % N] >>= i) - 118.619F) - (d - Test.instanceCount));
        try {
            i = (int)((--i) * (fMeth(Test.instanceCount, i, b1) + Test.fFld));
            i += -125;
            iArr[(50525 >>> 1) % N] *= i;
            f1 = 1;
            do {
                for (i12 = 1; i12 < 6; ++i12) {
                    i += (i12 | i);
                }
                for (i14 = 1; i14 < 6; i14++) {
                    iArr = iArr;
                    by += (byte)Test.instanceCount;
                    try {
                        i15 = (i13 % -89);
                        i13 = (1638257376 % i14);
                        i15 = (16335 / i13);
                    } catch (ArithmeticException a_e) {}
                    i13 += i14;
                }
            } while (++f1 < 299);
            Test.instanceCount += (long)f1;
        }
        catch (ArithmeticException exc1) {
            lArr[(-8539 >>> 1) % N] <<= i;
        }
        finally {
            Test.instanceCount |= Test.byFld;
        }
        long meth_res = by + Float.floatToIntBits(f) + by1 + i + Double.doubleToLongBits(d) + (b1 ? 1 : 0) +
            Float.floatToIntBits(f1) + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i16=6, i17=5, i18=-10161, i19=98, i20=41455, i21=-3, i22=12;
        long l1=-44593L;
        double d2=2.10343, d3=1.79855;
        float f2=44.379F;

        iMeth(Test.byFld, Test.fFld, Test.byFld);
        for (i16 = 3; i16 < 179; i16++) {
            for (i18 = 2; i18 < 143; i18 += 3) {
                i19 += (((i18 * Test.fFld) + i18) - i19);
            }
            i19 = i19;
            i19 >>>= -26;
            i19 *= (int)Test.fFld;
            switch (((i16 % 9) * 5) + 108) {
            case 149:
                i19 += (((i16 * Test.fFld) + i17) - i17);
                i20 += (i16 * i16);
                Test.byFld = (byte)-37590;
                for (l1 = 143; l1 > 7; l1 -= 3) {
                    Test.instanceCount >>>= l1;
                    Test.iArrFld[(int)(l1 + 1)] = -72;
                    i17 = (int)11L;
                    switch ((((i20 >>> 1) % 2) * 5) + 47) {
                    case 50:
                        Test.bFld = Test.bFld;
                        break;
                    case 55:
                        Test.bFld = Test.bFld;
                        Test.iArrFld[(int)(l1)] -= i17;
                        i20 = -33925;
                        dFld /= (i20 | 1);
                        break;
                    }
                    for (d2 = 1; d2 < 4; d2++) {
                        i20 = i21;
                        i20 &= (int)l1;
                        d3 = Test.fFld;
                        switch ((i16 % 2) + 119) {
                        case 119:
                            i20 >>= Test.byFld;
                            Test.instanceCount = i19;
                            i17 *= (int)l1;
                            Test.instanceCount -= (long)dFld;
                        case 120:
                            Test.fFld += (float)(d2 - i18);
                            break;
                        }
                    }
                }
                break;
            case 129:
            case 153:
                i22 += (-19744 + (i16 * i16));
                break;
            case 126:
            case 116:
                i19 = (int)Test.fFld;
                break;
            case 125:
                i19 += (int)52994L;
            case 134:
                Test.iArrFld[i16 + 1] *= i20;
                break;
            case 142:
                try {
                    i22 = (Test.iArrFld[i16 + 1] / i21);
                    i22 = (Test.iArrFld[i16 - 1] / 20908);
                    i22 = (587751349 / i20);
                } catch (ArithmeticException a_e) {}
                break;
            case 110:
                Test.fFld -= i16;
                break;
            default:
                f2 += -6L;
            }
        }

        FuzzerUtils.out.println("i16 i17 i18 = " + i16 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("i19 i20 l1 = " + i19 + "," + i20 + "," + l1);
        FuzzerUtils.out.println("i21 d2 i22 = " + i21 + "," + Double.doubleToLongBits(d2) + "," + i22);
        FuzzerUtils.out.println("d3 f2 = " + Double.doubleToLongBits(d3) + "," + Float.floatToIntBits(f2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld dFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
