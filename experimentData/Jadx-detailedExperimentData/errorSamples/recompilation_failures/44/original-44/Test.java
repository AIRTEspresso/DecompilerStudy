// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 21:33:23 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=14L;
    public static int iFld=4038;
    public short sFld=-28926;
    public volatile byte byFld=-103;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1306739658L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i2, long l, int i3) {

        int i4=-135, i5=-210, i6=-3100, i7=64979, i8=196, iArr[]=new int[N];
        double d=1.101138;
        byte by=37;
        float f=0.508F, fArr[]=new float[N];
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(fArr, 0.932F);
        FuzzerUtils.init(iArr, 148);
        FuzzerUtils.init(bArr, false);

        for (i4 = 13; i4 < 333; ++i4) {
            d = i2;
        }
        i6 = 1;
        do {
            i2 += i4;
            i7 = 1;
            do {
                i2 += (((i7 * Test.instanceCount) + i4) - by);
                fArr[i7] = by;
                f = Test.instanceCount;
                iArr[i7 - 1] = i2;
                i8 = 1;
                while (++i8 < 1) {
                    boolean b1=false;
                    i5 -= i7;
                    fArr[i8 + 1] += (float)0.34980;
                    bArr[i7 + 1][i7] = b1;
                }
                iArr[i6 - 1] = (int)l;
                i3 += i4;
            } while (++i7 < 5);
        } while (++i6 < 312);
        vMeth1_check_sum += i2 + l + i3 + i4 + i5 + Double.doubleToLongBits(d) + i6 + i7 + by + Float.floatToIntBits(f)
            + i8 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public static void vMeth(int i1) {

        int i9=-245, i10=5, i11=-42064;
        float f1=-1.147F;
        double d1=2.14568;

        vMeth1(Test.iFld, Test.instanceCount, Test.iFld);
        for (i9 = 8; i9 < 326; i9++) {
            Test.iFld -= i9;
            Test.iFld = 209;
            Test.iFld = i10;
            i10 += (-26 + (i9 * i9));
            f1 = f1;
            i10 = Test.iFld;
            i11 = 1;
            do {
                Test.instanceCount *= i1;
                Test.iFld -= i1;
                i10 = (int)d1;
                Test.instanceCount <<= -207L;
            } while (++i11 < 5);
            i10 += (int)Test.instanceCount;
            i1 <<= -244;
        }
        vMeth_check_sum += i1 + i9 + i10 + Float.floatToIntBits(f1) + i11 + Double.doubleToLongBits(d1);
    }

    public static void vSmallMeth(boolean b, int i) {


        Test.lArrFld[(i >>> 1) % N] = i;
        vMeth(11);
        vSmallMeth_check_sum += (b ? 1 : 0) + i;
    }

    public void mainTest(String[] strArr1) {

        double d2=1.48360;
        boolean b2=true, bArr1[][]=new boolean[N][N];
        int i12=47824, i13=-36699, i14=29, i15=7, i16=-110, i17=181, iArr1[]=new int[N];
        float f2=0.348F;

        FuzzerUtils.init(iArr1, 13);
        FuzzerUtils.init(bArr1, false);

        for (int smallinvoc=0; smallinvoc<919; smallinvoc++) vSmallMeth(false, Test.iFld);
        Test.iFld *= (int)d2;
        iArr1[(4 >>> 1) % N] &= (int)Test.instanceCount;
        b2 = false;
        bArr1[(Test.iFld >>> 1) % N][(Test.iFld >>> 1) % N] = b2;
        sFld *= (short)57588;
        Test.instanceCount = -6202473916003642764L;
        iArr1[(Test.iFld >>> 1) % N] += Test.iFld;
        Test.instanceCount >>>= Test.iFld;
        for (i12 = 20; 389 > i12; ++i12) {
            if (b2) {
                Test.instanceCount = i12;
                for (i14 = 4; i14 < 68; i14++) {
                    sFld <<= (short)i12;
                    Test.lArrFld[i14 - 1] >>= Test.iFld;
                    i13 = Test.iFld;
                    iArr1 = iArr1;
                    for (i16 = i12; i16 < 2; i16++) {
                        byFld = (byte)Test.instanceCount;
                        Test.instanceCount = (long)f2;
                        Test.instanceCount -= i17;
                        f2 += f2;
                        Test.instanceCount += (long)f2;
                        Test.iFld = 5;
                        Test.iFld -= i13;
                        Test.iFld -= (int)-67.743F;
                        i13 += (int)1.895F;
                        byFld += (byte)(9 + (i16 * i16));
                    }
                    Test.instanceCount >>>= i16;
                }
                f2 /= -14L;
            } else if (b2) {
                Test.iFld += (((i12 * i16) + f2) - byFld);
            }
        }

        FuzzerUtils.out.println("d2 b2 i12 = " + Double.doubleToLongBits(d2) + "," + (b2 ? 1 : 0) + "," + i12);
        FuzzerUtils.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
        FuzzerUtils.out.println("i16 i17 f2 = " + i16 + "," + i17 + "," + Float.floatToIntBits(f2));
        FuzzerUtils.out.println("iArr1 bArr1 = " + FuzzerUtils.checkSum(iArr1) + "," + FuzzerUtils.checkSum(bArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld sFld = " + Test.instanceCount + "," + Test.iFld + "," +
            sFld);
        FuzzerUtils.out.println("byFld Test.lArrFld = " + byFld + "," + FuzzerUtils.checkSum(Test.lArrFld));

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
