// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:52:38 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3L;
    public int iFld=11619;
    public static float fFld=0.731F;
    public static long lFld=-3986424624L;
    public static boolean bFld=true;
    public static short sFld=6863;
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -1.903F);
    }

    public static long byMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, int i4) {

        int i5=2915, i6=90, i7=32, i8=3, i9=-215, i10=-8100, i11=204;
        double d=2.5845;

        l1 -= i4;
        i4 -= i4;
        i4 <<= i4;
        for (i5 = 16; i5 < 394; i5++) {
            for (i7 = 4; 1 < i7; --i7) {
                i6 %= (int)(Test.instanceCount | 1);
                i4 *= i8;
            }
            l1 /= (Test.instanceCount | 1);
            i9 = 1;
            do {
                i8 += i5;
                for (d = i9; d < 1; ++d) {
                    if (false) break;
                }
            } while (++i9 < 4);
            i11 = 4;
            do {
                i10 += (((i11 * l1) + Test.instanceCount) - Test.instanceCount);
                Test.instanceCount += l1;
            } while (--i11 > 0);
        }
        long meth_res = l1 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(long l) {

        int i2=-70, i3=214, i12=7, iArr[]=new int[N];
        long l2=-2596391739L;
        byte by=64;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, -239);
        FuzzerUtils.init(fArr, -73.152F);

        for (int i1 : iArr) {
            for (i2 = 1; i2 < 4; ++i2) {
                fArr[i2] += Math.min(i1--, i2);
                i3 -= (int)((Test.fFld--) * (iArr[i2 + 1]--));
                l = Math.abs(iMeth(Test.lFld, -143));
                for (l2 = i2; l2 < 2; l2++) {
                    i3 *= (int)Test.fFld;
                    i1 = i3;
                    Test.fFld -= -4;
                    i1 += (int)Test.fFld;
                    by += (byte)(75 + (l2 * l2));
                    i1 += i3;
                    Test.lFld += l2;
                    if (Test.bFld) continue;
                    Test.sFld -= (short)Test.fFld;
                }
            }
        }
        long meth_res = l + i2 + i3 + l2 + i12 + by + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static byte byMeth() {

        float f=1.286F;
        int i=-46827, i13=-179, i14=24472, iArr1[][][]=new int[N][N][N], iArr2[]=new int[N];
        double dArr[][][]=new double[N][N][N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr1, 93);
        FuzzerUtils.init(iArr2, -3);
        FuzzerUtils.init(dArr, 53.98265);
        FuzzerUtils.init(bArr, true);

        f *= Long.reverseBytes(-(i - i));
        i -= (int)(33494 * lMeth(Test.instanceCount));
        i += i;
        switch (((i >>> 1) % 1) + 75) {
        case 75:
            if (Test.bFld) {
                i13 = 1;
                do {
                    byte by1=-32;
                    if (Test.bFld) continue;
                    iArr1[i13 - 1][i13 + 1][i13] = -63143;
                    Test.fArrFld[i13 - 1] = i13;
                    try {
                        i = (i14 / 202);
                        iArr2[i13 + 1] = (i13 / iArr2[i13 - 1]);
                        i14 = (iArr1[i13][(i >>> 1) % N][i13] % 33);
                    } catch (ArithmeticException a_e) {}
                    switch ((i13 % 3) + 51) {
                    case 51:
                        Test.bFld = Test.bFld;
                        by1 += (byte)i13;
                        Test.lFld += (i13 * i13);
                    case 52:
                        dArr[i13][i13][i13 + 1] += i13;
                        break;
                    case 53:
                        bArr[i13] = true;
                        break;
                    default:
                        i14 += (i13 * i13);
                    }
                } while (++i13 < 140);
            } else {
                i = i13;
            }
            break;
        default:
            i14 += i;
        }
        long meth_res = Float.floatToIntBits(f) + i + i13 + i14 + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(bArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=18263, i16=-138, i17=-12, i18=53618, i19=-23810, i20=2, i21=-12, iArr3[][][]=new int[N][N][N];
        float f1=93.960F;
        long l3=-760107937L, lArr[][][]=new long[N][N][N];
        boolean b=true, bArr1[]=new boolean[N];

        FuzzerUtils.init(lArr, 43729L);
        FuzzerUtils.init(iArr3, 1);
        FuzzerUtils.init(bArr1, true);

        iFld -= (int)Test.instanceCount;
        iFld = byMeth();
        for (i15 = 2; 341 > i15; ++i15) {
            i16 += i15;
            i17 = 1;
            do {
                iFld = i16;
            } while (++i17 < 74);
            for (f1 = i15; f1 < 74; f1 += 3) {
                i16 += (int)(f1 - Test.fFld);
                iFld *= i19;
                iFld -= i15;
                try {
                    i19 = (i15 / 598338107);
                    i18 = (i20 / iFld);
                    i18 = (-232701841 / i20);
                } catch (ArithmeticException a_e) {}
                for (l3 = 1; l3 < 1; l3++) {
                    lArr[i15][i15 - 1][i15 + 1] &= iFld;
                    switch (((i17 >>> 1) % 1) + 48) {
                    case 48:
                        iArr3[(int)(f1 - 1)][(int)(f1)][(int)(f1)] >>= (int)Test.instanceCount;
                        Test.instanceCount -= i17;
                        i21 += (int)(l3 * l3);
                        break;
                    }
                    i21 += (int)l3;
                    iArr3[(int)(f1)][(int)(l3)][i15 + 1] -= i20;
                    if (Test.bFld) continue;
                    Test.lFld += (l3 - Test.instanceCount);
                    i20 = i19;
                    Test.fFld *= i20;
                    lArr[(int)(f1 - 1)][i15 - 1][i15] = i17;
                }
                bArr1[i15] = b;
                if (Test.bFld) break;
                if (Test.bFld) break;
                i18 = 64;
            }
            Test.sFld ^= (short)Test.lFld;
            Test.fFld += (i15 * i15);
        }

        FuzzerUtils.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        FuzzerUtils.out.println("f1 i18 i19 = " + Float.floatToIntBits(f1) + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 l3 i21 = " + i20 + "," + l3 + "," + i21);
        FuzzerUtils.out.println("b lArr iArr3 = " + (b ? 1 : 0) + "," + FuzzerUtils.checkSum(lArr) + "," +
            FuzzerUtils.checkSum(iArr3));
        FuzzerUtils.out.println("bArr1 = " + FuzzerUtils.checkSum(bArr1));

        FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.lFld Test.bFld Test.sFld = " + Test.lFld + "," + (Test.bFld ? 1 : 0) + "," +
            Test.sFld);
        FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
        FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  lMeth ->  lMeth byMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
