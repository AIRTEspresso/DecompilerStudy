// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:17:00 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2322956587539681484L;
    public static float fFld=-2.775F;
    public static double dFld=8.70920;
    public static short sFld=28341;
    public int iFld=6591;
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 13748L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, int i7, int i8) {

        int i9=-120, i10=-17, i11=-60891, i12=-241, i13=44, i14=1, i15=-200, iArr[]=new int[N], iArr1[][][]=new
            int[N][N][N];
        long lArr1[][][]=new long[N][N][N];
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(lArr1, 3015630487L);
        FuzzerUtils.init(fArr, -2.562F);
        FuzzerUtils.init(iArr, -6);
        FuzzerUtils.init(iArr1, -10);

        lArr1[(i7 >>> 1) % N][(i8 >>> 1) % N][(i7 >>> 1) % N] = i8;
        i9 = 384;
        while ((i9 -= 2) > 0) {
            lArr1[i9 - 1][i9 - 1][i9 - 1] = i9;
            for (i10 = 8; i10 > i9; i10--) {
                for (i12 = 1; i12 < 1; ++i12) {
                    fArr[i10 - 1][i12 + 1] -= Test.instanceCount;
                    fArr[i10][i10 + 1] -= (float)Test.dFld;
                    i8 += Test.sFld;
                    Test.instanceCount += (38815 + (i12 * i12));
                }
                for (i14 = 1; i14 < 1; ++i14) {
                    try {
                        i6 = (-1299865018 % i12);
                        i13 = (i9 % iArr[i9 - 1]);
                        iArr1[i14 + 1][i10 - 1][i10] = (i6 % -27922);
                    } catch (ArithmeticException a_e) {}
                    Test.sFld = (short)Test.fFld;
                    i6 *= i14;
                    Test.instanceCount += Test.instanceCount;
                    iArr[i9 - 1] = -182;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(boolean b, int i1) {

        float f=-16.386F, fArr1[]=new float[N];
        int i2=13, i3=209, i4=14, i5=-18420, i16=4894, i17=14;
        long l=-2L, lArr[]=new long[N], lArr2[]=new long[N];
        byte by=-11;

        FuzzerUtils.init(lArr, -34068L);
        FuzzerUtils.init(fArr1, -1.992F);
        FuzzerUtils.init(lArr2, 571902546L);

        i1 = (int)((-6L + (i1 + Test.fFld)) - i1);
        i1 <<= (i1 = (++i1));
        Test.fFld *= ((-55306 - (i1 * f)) - lArr[(i1 >>> 1) % N]);
        for (i2 = 4; i2 < 213; ++i2) {
            for (i4 = 8; i4 > 1; i4 -= 2) {
                i5 -= 8;
                switch ((i4 % 2) + 127) {
                case 127:
                    vMeth1(i1, i3, -22300);
                    switch (((i2 % 9) * 5) + 111) {
                    case 153:
                        for (l = i2; l < 3; l++) {
                            i3 <<= (int)Test.instanceCount;
                            f = (float)-106.35549;
                            Test.instanceCount = l;
                            i16 = i1;
                            i3 = 14;
                        }
                    case 113:
                        i17 = i5;
                        break;
                    case 128:
                        if (b) break;
                    case 156:
                        fArr1[i4 - 1] *= i16;
                        break;
                    case 131:
                        Test.instanceCount = i4;
                        break;
                    case 136:
                        i5 *= i17;
                        break;
                    case 150:
                        Test.instanceCount += i4;
                    case 140:
                        Test.instanceCount -= -6249500597848774621L;
                        break;
                    case 139:
                        i1 = by;
                        break;
                    }
                    break;
                case 128:
                    by = (byte)i2;
                    break;
                default:
                    lArr2[i2 - 1] ^= i5;
                }
            }
        }
        vMeth_check_sum += (b ? 1 : 0) + i1 + Float.floatToIntBits(f) + i2 + i3 + i4 + i5 + l + i16 + i17 + by +
            FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) +
            FuzzerUtils.checkSum(lArr2);
    }

    public static void vSmallMeth(int i) {

        boolean b1=true;

        vMeth(b1, i);
        Test.instanceCount += i;
        vSmallMeth_check_sum += i + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i18=-146, i19=-3, i20=99, i21=-11, i22=8, i23=-11739, i24=11, i25=44, i26=-3, i27=-3, i28=-7, iArr2[][]=new
            int[N][N];
        boolean b2=false;

        FuzzerUtils.init(iArr2, -132);

        for (int smallinvoc=0; smallinvoc<382; smallinvoc++) vSmallMeth(-50856);
        i18 <<= (int)Test.instanceCount;
        for (i19 = 7; 193 > i19; i19 += 2) {
            i18 *= Test.sFld;
        }
        Test.lArrFld[(i20 >>> 1) % N] += i19;
        i18 >>= i18;
        i20 <<= i19;
        i18 -= i18;
        for (i21 = 18; 396 > i21; ++i21) {
            for (i23 = 4; i23 < 67; ++i23) {
                iArr2[i21 - 1] = iArr2[i21 + 1];
                i18 &= i22;
                for (i25 = 1; i25 < 2; i25++) {
                    i24 = 2;
                    i24 -= i25;
                    i24 += i22;
                    Test.instanceCount += (((i25 * i26) + i26) - Test.instanceCount);
                    Test.instanceCount = i21;
                    i22 = iFld;
                    iArr2[i21][i23 + 1] -= i18;
                }
                for (i27 = i21; i27 < 2; i27 += 3) {
                    Test.instanceCount = i20;
                    iFld += (i27 - Test.instanceCount);
                    Test.fFld *= i18;
                    if (b2) {
                        if (b2) break;
                        i20 += i24;
                    } else if (b2) {
                        iArr2[i21][i27 - 1] <<= iFld;
                        i22 = 13420;
                    } else {
                        Test.instanceCount ^= i26;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 b2 = " + i27 + "," + i28 + "," + (b2 ? 1 : 0));
        FuzzerUtils.out.println("iArr2 = " + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("Test.sFld iFld Test.lArrFld = " + Test.sFld + "," + iFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}