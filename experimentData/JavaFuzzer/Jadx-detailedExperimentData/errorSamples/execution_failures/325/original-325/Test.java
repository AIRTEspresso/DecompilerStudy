// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:26:28 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static float fFld=-49.513F;
    public static volatile byte byFld=-13;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3113517310863762446L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i7) {

        int i8=165, i9=13, i10=89, i11=-8, i12=-32, i13=-48395, i14=-43921, i15=-60903, i16=2, iArr[]=new int[N];
        double d=-44.79751;
        short s=-29864;

        FuzzerUtils.init(iArr, -244);

        i7 = (int)Test.instanceCount;
        Test.instanceCount = i7;
        i7 |= i7;
        for (i8 = 8; 258 > i8; i8++) {
            Test.instanceCount -= i9;
            Test.fFld += i8;
            for (i10 = 7; i10 > 1; i10 -= 3) {
                i12 |= i9;
                iArr[i10] = i11;
            }
            d = Test.fFld;
            for (i13 = 1; i13 < 7; ++i13) {
                for (i15 = i13; 2 > i15; ++i15) {
                    iArr[i15] -= (int)d;
                }
                i12 <<= s;
                i14 = i14;
            }
        }
        long meth_res = i7 + i8 + i9 + i10 + i11 + i12 + Double.doubleToLongBits(d) + i13 + i14 + i15 + i16 + s +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4) {

        float f=2.829F;
        int i5=-14, i6=10, i17=0, i18=14599, i19=-19, i20=-43, iArr1[]=new int[N];
        boolean b=true;

        FuzzerUtils.init(iArr1, -141);

        Test.instanceCount -= (long)(((++i4) + (++f)) + f);
        for (i5 = 2; 202 > i5; ++i5) {
            Test.instanceCount += (i6 - Math.min(i4 / (i6 | 1), iMeth(i6)));
            i4 += (1255 + (i5 * i5));
            for (i17 = 8; i17 > i5; i17--) {
                Test.byFld *= (byte)f;
                try {
                    i18 = (i6 % i5);
                    i18 = (-14441 / i4);
                    i4 = (221 % i18);
                } catch (ArithmeticException a_e) {}
                for (i19 = 1; i19 < 1; ++i19) {
                    iArr1 = FuzzerUtils.int1array(N, (int)-4);
                    if (i6 != 0) {
                        vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + i17 + i18 + i19 + i20 + (b ? 1
                            : 0) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    Test.fFld *= i19;
                    i3 -= i17;
                    if (b) continue;
                    i20 = i3;
                    Test.fFld += (((i19 * i6) + Test.instanceCount) - i3);
                }
            }
        }
        vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + i17 + i18 + i19 + i20 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vSmallMeth(long l, int i2) {


        vMeth(i2, i2);
        vSmallMeth_check_sum += l + i2;
    }

    public void mainTest(String[] strArr1) {

        int i=-106, i1=0, i21=3, i22=14, i23=-12462, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 57814);

        for (i = 2; i < 151; ++i) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(Test.instanceCount, 249);
            Test.instanceCount = i;
            iArr2 = iArr2;
            for (i21 = 4; i21 < 168; ++i21) {
                double d1=-67.13848;
                Test.lArrFld = FuzzerUtils.long1array(N, (long)-7L);
                switch ((i % 2) + 121) {
                case 121:
                    switch (((i % 9) * 5) + 109) {
                    case 149:
                        Test.instanceCount = i21;
                        i1 = (int)d1;
                        break;
                    case 111:
                        Test.fFld *= Test.instanceCount;
                        Test.fFld += i21;
                        break;
                    case 150:
                        i22 += (((i21 * Test.instanceCount) + i22) - Test.fFld);
                        break;
                    case 113:
                        i22 += (i21 * i22);
                        Test.fFld = i;
                        i23 = 1;
                        while (++i23 < 2) {
                            boolean b1=false;
                            if (false) break;
                            d1 *= Test.byFld;
                            iArr2[i23] = i1;
                            Test.fFld *= i23;
                            Test.instanceCount *= Test.byFld;
                            d1 += Test.byFld;
                            i1 <<= (int)Test.instanceCount;
                            i22 = i1;
                            Test.instanceCount *= i1;
                            b1 = b1;
                        }
                        i1 = 8;
                        break;
                    case 143:
                        i22 >>= i22;
                        break;
                    case 135:
                    case 114:
                        Test.instanceCount >>>= i21;
                        i22 += i21;
                        break;
                    case 145:
                        i22 >>= -20;
                        break;
                    case 148:
                        try {
                            i1 = (344819139 / i23);
                            i1 = (i21 % i);
                            i22 = (iArr2[i21] / 40866);
                        } catch (ArithmeticException a_e) {}
                        break;
                    default:
                        i22 >>= 53209;
                    }
                    break;
                case 122:
                    i22 *= (int)Test.fFld;
                    break;
                default:
                    Test.lArrFld[i21] += (long)d1;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i21 = " + i + "," + i1 + "," + i21);
        FuzzerUtils.out.println("i22 i23 iArr2 = " + i22 + "," + i23 + "," + FuzzerUtils.checkSum(iArr2));

        FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + Test.byFld);
        FuzzerUtils.out.println("Test.lArrFld = " + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}