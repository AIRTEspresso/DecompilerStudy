// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 22:29:01 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-222L;
    public static int iFld=31231;
    public double dFld=-25.42777;
    public static float fFld=4.476F;
    public short sFld=-6543;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -10L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i5, int i6) {

        int i7=-62787, i8=-7, i9=15595, i10=0, i11=-37579, i12=51, iArr[]=new int[N], iArr1[]=new int[N];
        short s1=-9439;
        byte by1=29;
        double d1=116.121409;

        FuzzerUtils.init(iArr, 6);
        FuzzerUtils.init(iArr1, 9);

        iArr = iArr;
        for (i7 = 7; i7 < 328; ++i7) {
            i5 -= (int)Test.instanceCount;
            Test.iFld += (((i7 * i5) + i6) - i8);
            for (i9 = 1; i9 < 5; ++i9) {
                switch ((i7 % 2) + 26) {
                case 26:
                    i6 = Test.iFld;
                    if (i7 != 0) {
                        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + s1 + i11 + i12 + by1 +
                            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    s1 -= (short)i5;
                    try {
                        i8 = (i7 % i9);
                        iArr1[i7 + 1] = (iArr[i9 + 1] / -48370);
                        i10 = (Test.iFld % i8);
                    } catch (ArithmeticException a_e) {}
                case 27:
                    for (i11 = 2; i11 > 1; i11 -= 3) {
                        by1 *= (byte)-38345;
                        d1 = i9;
                        i8 -= (int)Test.instanceCount;
                        Test.iFld += i11;
                    }
                    break;
                }
            }
        }
        vMeth2_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + s1 + i11 + i12 + by1 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        double d2=-91.8643;
        int i13=-112, i14=-6, i15=-10, i16=-54571, i17=159, iArr2[]=new int[N];
        short s2=-13900;
        byte by2=-76;

        FuzzerUtils.init(iArr2, -191);

        vMeth2(Test.iFld, 18352);
        iArr2[(Test.iFld >>> 1) % N] = (int)Test.fFld;
        d2 = Test.instanceCount;
        Test.iFld -= Test.iFld;
        for (i13 = 3; i13 < 157; ++i13) {
            i14 -= (int)Test.instanceCount;
            i14 *= s2;
            Test.instanceCount += i13;
            i15 = 10;
            do {
                by2 = (byte)d2;
                for (i16 = 1; i16 < 1; ++i16) {
                    Test.iFld -= (int)Test.instanceCount;
                    Test.fFld = i17;
                    Test.fFld *= -14;
                    if (false) break;
                }
            } while (--i15 > 0);
        }
        vMeth1_check_sum += Double.doubleToLongBits(d2) + i13 + i14 + s2 + i15 + by2 + i16 + i17 +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(short s) {

        int i4=-11;
        long l=92L;
        double d=1.51951;

        i4 = 1;
        while (++i4 < 384) {
            Test.instanceCount ^= l;
            Test.fFld = (float)d;
            Test.iFld >>= (int)(l = Math.min((int)(Test.iFld - d), Test.iFld));
        }
        vMeth1();
        vMeth_check_sum += s + i4 + l + Double.doubleToLongBits(d);
    }

    public void mainTest(String[] strArr1) {

        float f=-28.479F;
        int i=-62635, i1=24419, i2=25205, i3=38788, i18=-5, i19=6, i20=37, iArr3[]=new int[N];
        long l1=-7L;
        boolean b=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 123.44430);
        FuzzerUtils.init(iArr3, 3);

        dArr[(Test.iFld >>> 1) % N] += (Test.lArrFld[(Test.iFld >>> 1) % N]--);
        Test.iFld = (int)((-(Test.iFld * Test.iFld)) * ((dFld + -62.453F) - (f + dFld)));
        for (i = 5; 136 > i; ++i) {
            byte by=-49;
            f += (((i * Test.instanceCount) + i) - f);
            i1 += (int)((f - (-159 + (i1 * Test.instanceCount))) - (f + (i - by)));
            for (i2 = 8; i2 < 191; ++i2) {
                dFld = Math.max(Test.instanceCount, Test.lArrFld[i + 1]);
                i3 += i3;
                vMeth((short)(-655));
                switch ((((Test.iFld >>> 1) % 10) * 5) + 94) {
                case 108:
                    Test.fFld += i2;
                    iArr3[i2 - 1] -= -1;
                    break;
                case 102:
                    for (i18 = 1; i18 < 2; ++i18) {
                        dArr[i] += Test.instanceCount;
                        i19 += (i18 ^ Test.iFld);
                    }
                    break;
                case 115:
                    dFld += 0.835F;
                    Test.iFld -= (int)Test.instanceCount;
                    f += f;
                case 117:
                    for (l1 = 1; l1 < 2; ++l1) {
                        Test.instanceCount += l1;
                        i19 = i19;
                        i20 += (int)(l1 - i2);
                        i1 += (int)(((l1 * i3) + Test.fFld) - l1);
                        iArr3[(int)(l1 + 1)] += i19;
                        i20 += i19;
                    }
                    dArr[i2 - 1] = 1.171F;
                    f += i3;
                    break;
                case 142:
                    dFld = 45909;
                    sFld <<= (short)i19;
                    break;
                case 112:
                    Test.instanceCount = i18;
                case 113:
                    i1 >>= i3;
                case 138:
                    Test.iFld += i2;
                    break;
                case 118:
                    b = b;
                    break;
                case 116:
                    i19 += (((i2 * l1) + Test.instanceCount) - i2);
                default:
                    if (b) break;
                }
            }
        }

        FuzzerUtils.out.println("f i i1 = " + Float.floatToIntBits(f) + "," + i + "," + i1);
        FuzzerUtils.out.println("i2 i3 i18 = " + i2 + "," + i3 + "," + i18);
        FuzzerUtils.out.println("i19 l1 i20 = " + i19 + "," + l1 + "," + i20);
        FuzzerUtils.out.println("b dArr iArr3 = " + (b ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + "," + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld dFld = " + Test.instanceCount + "," + Test.iFld + "," +
            Double.doubleToLongBits(dFld));
        FuzzerUtils.out.println("Test.fFld sFld Test.lArrFld = " + Float.floatToIntBits(Test.fFld) + "," + sFld + "," +
            FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
