// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 00:36:19 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1L;
    public static double dFld=0.118459;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(double d1, int i6) {

        int i7=-10, i8=-61492, i9=119, i10=-57244, i11=-2, iArr[]=new int[N];
        boolean b=true;
        float f=-1.231F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 119.546F);
        FuzzerUtils.init(iArr, -4);

        i7 = 1;
        do {
            if (b) break;
            Test.instanceCount = (long)f;
            i8 += (int)Test.instanceCount;
            i8 %= (int)(i8 | 1);
            i8 >>= i8;
        } while (++i7 < 319);
        for (i9 = 232; i9 > 10; --i9) {
            i10 += (12545 + (i9 * i9));
            i6 += (i9 + i10);
            i11 = 1;
            while (++i11 < 7) {
                fArr1[i9 - 1] += Test.instanceCount;
                i10 = (int)1247006176535950312L;
                if (b) {
                    i10 = i7;
                    f += i11;
                } else if (b) {
                    iArr[i9] -= i7;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + i6 + i7 + (b ? 1 : 0) + Float.floatToIntBits(f) + i8 + i9 + i10 +
            i11 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static void vMeth(int i, int i1, int i2) {

        double d=71.93603, dArr[]=new double[N];
        int i3=10, i4=-12, i5=6;
        float f1=1.302F, fArr[]=new float[N];

        FuzzerUtils.init(fArr, 1.282F);
        FuzzerUtils.init(dArr, -103.28192);

        i += (int)(-3469599995L + (i2 = i2));
        for (d = 190; d > 5; d--) {
            for (i4 = 1; i4 < 9; ++i4) {
                i5 = 248;
                i1 += i4;
                Test.instanceCount = (long)((-fArr[i4]) - (Integer.reverseBytes(i2) + i));
                i2 += (Math.max((int)(-69 - (i1 - d)), i3 + i3) * -124);
                dArr[(10 >>> 1) % N] += d;
                if (bMeth(-6.45281, i3)) break;
                Test.dFld *= f1;
            }
            i -= (int)Test.instanceCount;
            Test.instanceCount += (long)d;
            f1 += 48718L;
            i2 = i;
            Test.dFld -= i5;
        }
        vMeth_check_sum += i + i1 + i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vSmallMeth() {

        int i12=-58;

        vMeth(i12, i12, 86);
        Test.iArrFld[(i12 >>> 1) % N] |= -79;
        vSmallMeth_check_sum += i12;
    }

    public void mainTest(String[] strArr1) {

        float f2=0.484F;
        int i13=-72, i14=-4, i15=7, i16=-1, i17=-113, i18=5, i19=-5, i20=0;
        short s=-21474;

        Test.instanceCount <<= (Test.instanceCount--);
        for (int smallinvoc=0; smallinvoc<787; smallinvoc++) vSmallMeth();
        f2 += Test.instanceCount;
        for (i13 = 10; i13 < 350; i13++) {
            for (i15 = 74; i15 > 3; --i15) {
                i14 = 2;
            }
            i14 >>= i15;
            for (i17 = 74; i17 > i13; i17 -= 3) {
                f2 *= i14;
                i16 >>= i14;
                Test.iArrFld[i13 - 1] = s;
                Test.dFld += 86;
                for (i19 = 1; i19 < 1; i19++) {
                    Test.instanceCount >>= i15;
                }
                Test.instanceCount += (((i17 * f2) + Test.instanceCount) - f2);
            }
            f2 += i13;
            Test.instanceCount += i13;
        }
        i16 = s;

        FuzzerUtils.out.println("f2 i13 i14 = " + Float.floatToIntBits(f2) + "," + i13 + "," + i14);
        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 s i19 = " + i18 + "," + s + "," + i19);
        FuzzerUtils.out.println("i20 = " + i20);

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.iArrFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
