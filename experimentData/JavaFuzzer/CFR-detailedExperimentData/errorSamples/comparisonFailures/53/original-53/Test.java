// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 21:39:01 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=60695L;
    public static short sFld=-12971;
    public static byte byFld=-108;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 89);
        FuzzerUtils.init(Test.lArrFld, 507897389772567526L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i4, double d1, int i5) {

        int i6=-250, i7=7, i8=36535, i9=-65196, iArr[]=new int[N], iArr1[]=new int[N];
        short s=-7608;
        byte by=117, byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)83);
        FuzzerUtils.init(iArr, -11);
        FuzzerUtils.init(iArr1, 11);

        byArr[(i4 >>> 1) % N] = (byte)i4;
        for (i6 = 324; i6 > 12; --i6) {
            i7 = i7;
            i8 = 1;
            do {
                iArr = iArr1;
                s = (short)Test.instanceCount;
                i5 += (int)Test.instanceCount;
            } while (++i8 < 5);
            i7 += i4;
            Test.instanceCount = -235;
            by = (byte)-23778L;
            Test.instanceCount = i4;
            switch (((i6 % 3) * 5) + 49) {
            case 53:
                i9 = 1;
                while (++i9 < 5) {
                    Test.instanceCount = i4;
                    i7 += i9;
                }
                break;
            case 51:
                i7 = i8;
                break;
            case 63:
                i7 = i9;
            }
        }
        long meth_res = i4 + Double.doubleToLongBits(d1) + i5 + i6 + i7 + i8 + s + by + i9 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i3=19;

        i3 = (-8 * iMeth1(i3, -89.39037, -131));
        vMeth_check_sum += i3;
    }

    public static int iMeth() {

        int i1=-181, i2=-130, i10=14;
        double d=79.34239;
        float f=1.764F;
        byte by1=-1;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)-25215);
        FuzzerUtils.init(lArr, -5345615981701219748L);

        try {
            for (i1 = 133; i1 > (2 - 400); --i1) {
                d = (i2++);
                vMeth();
                i10 = 1;
                while (++i10 < 4) {
                    f *= 106;
                    sArr[i1 - 1] *= (short)i1;
                    i2 >>>= (int)Test.instanceCount;
                    Test.instanceCount -= -14;
                    d *= 47096;
                    switch (((i2 >>> 1) % 10) + 87) {
                    case 87:
                        by1 = (byte)i10;
                        break;
                    case 88:
                        i2 = i10;
                        i2 = -713;
                        i2 += (int)f;
                        break;
                    case 89:
                        Test.iArrFld[i1] = (int)Test.instanceCount;
                        break;
                    case 90:
                        f *= 23408;
                    case 91:
                        lArr[i10 + 1] %= (i10 | 1);
                    case 92:
                        i2 *= i2;
                        break;
                    case 93:
                    case 94:
                        Test.iArrFld[i1] += i1;
                        break;
                    case 95:
                        Test.instanceCount += i10;
                    case 96:
                        d += i1;
                        break;
                    default:
                        i2 >>= -10;
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            d = -124;
        }
        long meth_res = i1 + i2 + Double.doubleToLongBits(d) + i10 + Float.floatToIntBits(f) + by1 +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        long l=-6680001980801465313L;
        int i=170, i11=214, i12=-210, i13=7, i14=7, i15=44204, i16=14;
        float f1=-1.267F;
        byte byArr1[]=new byte[N];

        FuzzerUtils.init(byArr1, (byte)39);

        for (l = 1; l < 272; l++) {
            Test.instanceCount *= Math.abs((int)(26.939F + iMeth()));
            i |= (int)l;
            Test.instanceCount += l;
            for (i11 = 5; i11 < 93; i11++) {
                i12 = i11;
                f1 -= -29L;
                i12 = i12;
                i >>= i11;
                if (Test.bFld) {
                    if (Test.bFld) {
                        for (i13 = 1; i13 < 2; ++i13) {
                            Test.iArrFld[(int)(l)] = i11;
                            Test.iArrFld[(int)(l + 1)] ^= (int)l;
                            i *= i13;
                            Test.instanceCount += i13;
                            Test.iArrFld[i13] = (int)f1;
                            Test.sFld = (short)Test.instanceCount;
                            i12 -= (int)Test.instanceCount;
                            Test.iArrFld[i11 - 1] = 142;
                        }
                        Test.byFld |= (byte)i12;
                        Test.iArrFld[i11 - 1] = i14;
                        Test.lArrFld[(int)(l)] -= i;
                    } else {
                        for (i15 = 1; 2 > i15; ++i15) {
                            i14 = 199;
                        }
                    }
                    Test.sFld >>= (short)i12;
                    byArr1[(int)(l)] = (byte)i11;
                    try {
                        i = (6079 / i11);
                        i14 = (i15 / i14);
                        Test.iArrFld[i11 - 1] = (Test.iArrFld[(int)(l - 1)] / i14);
                    } catch (ArithmeticException a_e) {}
                } else {
                    try {
                        i16 = (i12 / 56045);
                        i14 = (i13 % -25);
                        Test.iArrFld[(int)(l)] = (Test.iArrFld[(int)(l - 1)] / 226);
                    } catch (ArithmeticException a_e) {}
                    Test.sFld = (short)l;
                }
            }
        }

        FuzzerUtils.out.println("l i i11 = " + l + "," + i + "," + i11);
        FuzzerUtils.out.println("i12 f1 i13 = " + i12 + "," + Float.floatToIntBits(f1) + "," + i13);
        FuzzerUtils.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
        FuzzerUtils.out.println("byArr1 = " + FuzzerUtils.checkSum(byArr1));

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        FuzzerUtils.out.println("Test.bFld Test.iArrFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," +
            FuzzerUtils.checkSum(Test.iArrFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
