// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:35:20 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3972502732L;
    public static short sFld=-15999;
    public static double dFld=0.106173;
    public int iFld=-6;
    public static float fFld=0.405F;
    public long lArrFld[]=new long[N];
    public static long lArrFld1[]=new long[N];
    public static int iArrFld[]=new int[N];
    public long lArrFld2[]=new long[N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld1, -3230703983L);
        FuzzerUtils.init(Test.iArrFld, 175);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public int iMeth1() {

        float f=-18.285F;

        f = lArrFld[(iFld >>> 1) % N];
        long meth_res = Float.floatToIntBits(f);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f2) {

        int i8=46;

        Test.dFld -= i8;
        Test.dFld -= i8;
        vMeth_check_sum += Float.floatToIntBits(f2) + i8;
    }

    public static int iMeth2(int i6, int i7, long l1) {

        byte by=63;
        int i9=-2, i10=-219, i11=12, i12=-221, i13=21799, i14=-10, iArr[]=new int[N];
        double dArr[][][]=new double[N][N][N];

        FuzzerUtils.init(dArr, 0.103677);
        FuzzerUtils.init(iArr, -9);

        i7 -= (int)(((i6 + i7) - (i6 + i6)) - ((14 - dArr[(i6 >>> 1) % N][(i7 >>> 1) % N][(-11 >>> 1) % N]) + (by -
            Test.instanceCount)));
        vMeth(Test.fFld);
        for (i9 = 8; i9 < 384; i9++) {
            Test.lArrFld1[i9 - 1] -= i6;
            switch (((53362 >>> 1) % 6) + 97) {
            case 97:
                for (i11 = 4; i11 > i9; i11 -= 3) {
                    switch ((((i9 >>> 1) % 2) * 5) + 91) {
                    case 92:
                        i10 ^= (int)l1;
                        break;
                    case 94:
                        iArr[i11 - 1] = (int)Test.instanceCount;
                        break;
                    }
                    i10 -= i12;
                    for (i13 = 1; i13 < 1; ++i13) {
                        l1 += (long)Test.fFld;
                        iArr[i11] += by;
                        i6 += (int)Test.fFld;
                        i12 = -64;
                    }
                }
                break;
            case 98:
                Test.fFld += i9;
                break;
            case 99:
                i12 += (i9 * i10);
                break;
            case 100:
                i6 += (i9 + i7);
                break;
            case 101:
                i6 -= i7;
                break;
            case 102:
            }
        }
        long meth_res = i6 + i7 + l1 + by + i9 + i10 + i11 + i12 + i13 + i14 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i2, boolean b) {

        int i3=1, i4=-85, i5=-11;
        float f1=-59.821F;

        i3 = 1;
        while (++i3 < 342) {
            iMeth1();
            i2 = (-i2);
            for (i4 = 5; i4 > 1; i4 -= 2) {
                i5 = (int)((iFld + Math.abs(f1)) - (iMeth2(46064, -5, 429719668L) + Test.instanceCount));
                switch ((((iFld >>> 1) % 3) * 5) + 114) {
                case 123:
                    i2 += (i4 | Test.instanceCount);
                    Test.iArrFld[i4 + 1] *= 22847;
                    break;
                case 127:
                    f1 -= 9;
                    break;
                case 120:
                    lArrFld2[i3 - 1] = (long)-41.606F;
                    Test.fFld *= Test.instanceCount;
                    switch (((i3 % 3) * 5) + 62) {
                    case 67:
                        if (b) continue;
                        i2 &= i4;
                    case 73:
                    case 77:
                        i5 += (-14 + (i4 * i4));
                        break;
                    default:
                        if (false) break;
                    }
                    break;
                }
            }
        }
        long meth_res = i2 + (b ? 1 : 0) + i3 + i4 + i5 + Float.floatToIntBits(f1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-9, i1=-123, i16=-1, i17=14946, i18=-21352, i19=5, i20=27569;
        long l=-64560L, lArr[]=new long[N];
        boolean b1=false;
        byte by1=-124;

        FuzzerUtils.init(lArr, -175514017L);

        for (i = 3; i < 247; i++) {
            lArr[(i1 >>> 1) % N] <<= ((Test.sFld - Long.reverseBytes(l)) + i);
            i1 = -90;
            i1 *= (int)((-(i - i)) - Test.dFld);
            i1 >>= iMeth(i1, b1);
            i16 = 1;
            do {
                i1 <<= (int)Test.instanceCount;
                iFld += (int)-25.25197;
                Test.fFld += (212 + (i16 * i16));
                Test.sFld = (short)i16;
                for (i17 = 1; i17 < 1; i17 += 2) {
                    Test.iArrFld[i16 - 1] >>= i17;
                    i18 += (((i17 * Test.instanceCount) + i17) - Test.fFld);
                }
                i1 += i;
                for (i19 = 1; i19 < 1; i19++) {
                    switch (((i % 7) * 5) + 17) {
                    case 31:
                        if (true) break;
                        break;
                    case 38:
                        Test.iArrFld[i] -= 105;
                        Test.dFld = Test.instanceCount;
                    case 30:
                        fArrFld[i19 + 1] += Test.instanceCount;
                        Test.dFld = 2.321F;
                        i1 = 38767;
                        Test.fFld -= i16;
                        break;
                    case 51:
                        fArrFld[i19 + 1] -= 3841572526L;
                        break;
                    case 33:
                        iFld -= iFld;
                        break;
                    case 44:
                        iFld -= i18;
                        break;
                    case 45:
                        i18 <<= by1;
                    default:
                        i18 = i1;
                        fArrFld[i] -= -8L;
                    }
                    l >>>= iFld;
                }
            } while (++i16 < 103);
        }

        FuzzerUtils.out.println("i i1 l = " + i + "," + i1 + "," + l);
        FuzzerUtils.out.println("b1 i16 i17 = " + (b1 ? 1 : 0) + "," + i16 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("by1 lArr = " + by1 + "," + FuzzerUtils.checkSum(lArr));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.dFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Double.doubleToLongBits(Test.dFld));
        FuzzerUtils.out.println("iFld Test.fFld lArrFld = " + iFld + "," + Float.floatToIntBits(Test.fFld) + "," +
            FuzzerUtils.checkSum(lArrFld));
        FuzzerUtils.out.println("Test.lArrFld1 Test.iArrFld lArrFld2 = " + FuzzerUtils.checkSum(Test.lArrFld1) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(lArrFld2));
        FuzzerUtils.out.println("fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth2_check_sum: " + iMeth2_check_sum);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth2 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
