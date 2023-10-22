// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 22:46:11 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-9L;
    public int iFld=7;
    public static double dFld=-66.79636;
    public static byte byFld=17;
    public static float fFld=-1.628F;
    public static double dArrFld[][]=new double[N][N];
    public static byte byArrFld[]=new byte[N];
    public int iArrFld[]=new int[N];
    public long lArrFld[][][]=new long[N][N][N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 93.1927);
        FuzzerUtils.init(Test.byArrFld, (byte)-56);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i7, float f1) {

        int i8=229, i9=1, iArr[]=new int[N];
        boolean b=false;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -12);
        FuzzerUtils.init(byArr, (byte)-51);

        iArr[(i7 >>> 1) % N] <<= -224;
        for (i8 = 15; i8 < 305; ++i8) {
            if (i7 != 0) {
                vMeth_check_sum += i7 + Float.floatToIntBits(f1) + i8 + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
                    FuzzerUtils.checkSum(byArr);
                return;
            }
        }
        f1 -= i9;
        b = b;
        iArr[(i9 >>> 1) % N] = i8;
        byArr[(14 >>> 1) % N] += (byte)i8;
        vMeth_check_sum += i7 + Float.floatToIntBits(f1) + i8 + i9 + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(byArr);
    }

    public static long lMeth() {

        int i10=29128, i11=-36993, i12=-232, i13=-152, i14=-12, iArr1[][]=new int[N][N];
        float f2=-42.418F;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 88);

        vMeth(i10, f2);
        for (i11 = 160; i11 > 10; i11 -= 2) {
            switch (((i10 >>> 1) % 2) + 50) {
            case 50:
                i10 += (i11 | i12);
                iArr1[i11] = iArr1[i11];
                break;
            case 51:
                i13 = 1;
                while ((i13 += 2) < 21) {
                    if (i12 != 0) {
                    }
                    Test.instanceCount += (long)f2;
                    i14 = 1;
                    do {
                        i12 -= i13;
                        i12 += (((i14 * Test.instanceCount) + i13) - Test.instanceCount);
                        i10 = (int)Test.instanceCount;
                        i10 |= -17009;
                        Test.instanceCount += (((i14 * i12) + i11) - Test.byFld);
                    } while (++i14 < 3);
                    Test.bArrFld[i11 - 1] = b1;
                }
                break;
            default:
                if (b1) break;
            }
        }
        long meth_res = i10 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + (b1 ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth() {

        float f=-101.128F, f3=-35.345F;
        int i6=-93, i15=-9297, i16=-21449;
        boolean b2=false;

        switch ((((iFld - iFld) >>> 1) % 8) + 68) {
        case 68:
            Test.dFld *= Test.instanceCount;
            Test.byArrFld = (Test.byArrFld = (Test.byArrFld = Test.byArrFld));
            iArrFld[(iFld >>> 1) % N] = (int)((iFld = (int)(Test.dFld + iFld)) - Test.instanceCount);
            break;
        case 69:
            Test.instanceCount *= (long)(((-(-67.104506 - (--Test.instanceCount))) + (Test.instanceCount + iFld)) +
                lArrFld[(-24541 >>> 1) % N][(iFld >>> 1) % N][(iFld >>> 1) % N]);
            break;
        case 70:
            for (f = 190; 1 < f; --f) {
                i6 -= Math.max(iFld, iArrFld[(int)(f)]);
                iFld = (int)lMeth();
                if (false) break;
                Test.instanceCount *= i6;
                i6 += (int)(((f * f) + Test.instanceCount) - Test.instanceCount);
                if (b2) break;
            }
            for (i15 = 4; 197 > i15; i15++) {
                Test.dFld = -11;
                if (false) continue;
            }
            break;
        case 71:
            Test.dFld = i6;
            break;
        case 72:
        case 73:
            f3 *= (float)Test.dFld;
            break;
        case 74:
            i16 += i15;
            break;
        case 75:
            iFld |= i15;
            break;
        }
        long meth_res = Float.floatToIntBits(f) + i6 + (b2 ? 1 : 0) + i15 + i16 + Float.floatToIntBits(f3);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=49, i1=57891, i2=-52195, i3=-2, i4=-171, i5=-11368, i17=-240, i18=48841;
        double d=-1.122010;
        boolean b3=true;
        short s=15486;

        for (i = 4; i < 364; i++) {
            for (i2 = 3; 70 > i2; i2++) {
                i1 -= (int)d;
                for (i4 = 1; i4 < 2; i4++) {
                    i1 <<= i3;
                    Test.instanceCount = (-(++Test.instanceCount));
                    Test.dArrFld[i2 + 1][i4 - 1] -= iMeth();
                    i3 = (int)Test.dFld;
                    i1 = i2;
                }
                for (i17 = 1; i17 < 2; ++i17) {
                    iArrFld[i17 - 1] = (int)Test.instanceCount;
                    Test.fFld += i17;
                    switch (((i % 5) * 5) + 106) {
                    case 127:
                    case 116:
                        Test.dFld -= 34800L;
                        break;
                    case 114:
                        i5 -= (int)Test.instanceCount;
                        i18 += (((i17 * Test.instanceCount) + i3) - i5);
                        switch ((i % 8) + 112) {
                        case 112:
                            Test.instanceCount >>= i4;
                        case 113:
                            Test.instanceCount -= i18;
                            break;
                        case 114:
                            Test.byFld = (byte)Test.dFld;
                            Test.fFld += i;
                        case 115:
                        case 116:
                            i1 += i;
                            switch (((i18 >>> 1) % 5) + 4) {
                            case 4:
                            case 5:
                                iArrFld[i2] -= (int)Test.instanceCount;
                                break;
                            case 6:
                                if (b3) break;
                            case 7:
                                Test.instanceCount += s;
                                i3 += (i17 - iFld);
                                i1 <<= i18;
                                Test.fFld += (i17 * i17);
                                break;
                            case 8:
                                i1 <<= iFld;
                                break;
                            }
                            break;
                        case 117:
                            i3 = i5;
                            break;
                        case 118:
                            try {
                                i1 = (iArrFld[i17] / 59710);
                                i3 = (i2 / -7014);
                                i3 = (294254790 % i2);
                            } catch (ArithmeticException a_e) {}
                            break;
                        case 119:
                            i18 -= -8;
                        }
                        break;
                    case 123:
                        iArrFld[i] = (int)21693L;
                        break;
                    case 119:
                        i3 = (int)Test.fFld;
                        break;
                    default:
                        i18 = i5;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        FuzzerUtils.out.println("i3 d i4 = " + i3 + "," + Double.doubleToLongBits(d) + "," + i4);
        FuzzerUtils.out.println("i5 i17 i18 = " + i5 + "," + i17 + "," + i18);
        FuzzerUtils.out.println("b3 s = " + (b3 ? 1 : 0) + "," + s);

        FuzzerUtils.out.println("Test.instanceCount iFld Test.dFld = " + Test.instanceCount + "," + iFld + "," +
            Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.byFld Test.fFld Test.dArrFld = " + Test.byFld + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));
        FuzzerUtils.out.println("Test.byArrFld iArrFld lArrFld = " + FuzzerUtils.checkSum(Test.byArrFld) + "," +
            FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.bArrFld = " + FuzzerUtils.checkSum(Test.bArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
