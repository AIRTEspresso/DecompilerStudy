// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:52:40 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static int iFld=-5;
    public static short sFld=25490;
    public float fFld=0.167F;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 7);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i4) {

        int i5=3, i6=-2178, i7=-5, i8=-201;
        byte by=-78;
        short s=-13395;
        boolean b=false;
        float fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(fArr, 48.216F);
        FuzzerUtils.init(lArr, 139L);

        i4 = Test.iFld;
        fArr[(142 >>> 1) % N] -= Test.iFld;
        Test.iFld = Test.iFld;
        for (i5 = 11; i5 < 270; i5++) {
            i4 *= i6;
            i6 <<= -12073;
            i6 = (int)408717811498012440L;
            i6 = i6;
            i4 >>>= by;
            for (i7 = 6; i7 > 1; i7 -= 3) {
                Test.iFld += (((i7 * i4) + i7) - Test.instanceCount);
                if (b) {
                    Test.iFld = s;
                    i6 = -27;
                    s = (short)i4;
                } else if (b) {
                    lArr[i7] ^= i8;
                }
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + by + i7 + i8 + s + (b ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i2, int i3, double d3) {

        int i9=13, i10=-13, i11=-64330, i12=196, i13=-4, i14=171, i15=1, i16=-23117;
        short s1=-17680;
        byte by1=-20;
        float f1=63.769F;
        boolean b1=true;

        Test.iFld = (--i2);
        vMeth(Test.iFld);
        for (i9 = 5; i9 < 167; i9 += 2) {
            for (i11 = 1; i11 < 19; ++i11) {
                for (i13 = 1; 2 > i13; i13++) {
                    i12 = -52685;
                    Test.instanceCount -= i12;
                }
                Test.iArrFld[i9 + 1] += (int)d3;
                i3 += i12;
                for (i15 = 1; 2 > i15; ++i15) {
                    i16 = i11;
                }
                s1 |= (short)i13;
                by1 = (byte)i9;
                f1 *= (float)2.52056;
            }
            b1 = b1;
        }
        long meth_res = i2 + i3 + Double.doubleToLongBits(d3) + i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + s1 + by1
            + Float.floatToIntBits(f1) + (b1 ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        double d1=-90.90482, d2=0.65288;
        float f=0.911F;
        long l=310304144709520296L;
        int i17=-18068, i18=-103, iArr[]=new int[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, -28114);
        FuzzerUtils.init(sArr, (short)-32487);

        d1 = 331;
        do {
            try {
                Test.iFld = (iArr[(int)(d1 - 1)] % 59423);
                Test.iFld = (-686331878 % Test.iFld);
                Test.iFld = (Test.iFld % -199);
            } catch (ArithmeticException a_e) {}
            Test.iFld -= (int)((Long.reverseBytes(Test.instanceCount) + (Test.iFld + 42317)) * Test.iFld);
            d2 -= (-(++Test.iFld));
            Test.iFld += (int)(d1 * d1);
            f = (-sArr[(int)(d1 + 1)]);
            Test.instanceCount -= (((Test.iFld - Test.iFld) * (Test.iFld = (int)2560681398L)) * 166);
            l = 5;
            while ((l -= 3) > 0) {
                int i1=-27;
                iArr[(int)(d1)] <<= ((-(i1 + Test.iFld)) + iArr[(int)(l)]);
                i1 += (-7 + (l * l));
                Test.iFld -= (int)(iMeth(i1, i1, d2) + Test.instanceCount);
                for (i17 = 3; i17 > 1; i17 -= 2) {
                    f *= 6037;
                    d2 += -12;
                }
                d2 -= -65522;
            }
        } while (--d1 > 0);
        long meth_res = Double.doubleToLongBits(d1) + Double.doubleToLongBits(d2) + Float.floatToIntBits(f) + l + i17 +
            i18 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        double d=0.112962;
        int i19=-11, i20=-4, i21=159, i22=-6, i23=123, i24=30104, i25=-11, i26=-3, i27=-4;
        byte by2=63;
        boolean b2=true;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 422L);

        Test.instanceCount -= (long)(((Test.iFld * Test.iFld) * (3910638169L - (d - Test.instanceCount))) + lMeth());
        for (i19 = 5; i19 < 239; i19++) {
            Test.iFld += (i19 | i20);
        }
        Test.iArrFld[(i19 >>> 1) % N] <<= -200;
        by2 = (byte)i19;
        for (i21 = 9; i21 < 293; ++i21) {
            Test.instanceCount += i22;
            switch ((i21 % 4) + 58) {
            case 58:
                i22 *= i20;
                break;
            case 59:
                lArr1[i21 - 1] = Test.instanceCount;
                for (i23 = 5; i23 < 89; ++i23) {
                    i20 = i19;
                    Test.instanceCount += (long)d;
                    Test.instanceCount = Test.iFld;
                    i22 += (int)Test.instanceCount;
                    if (b2) continue;
                    Test.iFld = -244;
                    for (i25 = 1; i25 < 2; ++i25) {
                        Test.sFld += (short)(i25 * i25);
                        fFld -= i23;
                        switch ((i21 % 2) + 126) {
                        case 126:
                            fFld += (-3 + (i25 * i25));
                            fFld *= 12442;
                            i22 += by2;
                            if (b2) {
                                if (b2) {
                                    if (b2) break;
                                    fFld += (((i25 * i23) + i21) - i21);
                                } else {
                                    Test.instanceCount += i27;
                                    if (false) break;
                                }
                            } else if (b2) {
                                by2 += (byte)(i25 * i26);
                            } else {
                                d *= i24;
                            }
                        case 127:
                            fFld += (((i25 * i24) + i25) - Test.instanceCount);
                            break;
                        }
                    }
                }
                break;
            case 60:
                i22 <<= Test.iFld;
                break;
            case 61:
                Test.iArrFld[i21] -= (int)d;
                break;
            default:
                i26 *= i27;
            }
        }

        FuzzerUtils.out.println("d i19 i20 = " + Double.doubleToLongBits(d) + "," + i19 + "," + i20);
        FuzzerUtils.out.println("by2 i21 i22 = " + by2 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 b2 = " + i23 + "," + i24 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        FuzzerUtils.out.println("lArr1 = " + FuzzerUtils.checkSum(lArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.sFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.sFld);
        FuzzerUtils.out.println("fFld Test.iArrFld = " + Float.floatToIntBits(fFld) + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}