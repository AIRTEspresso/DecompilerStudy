// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:58:14 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6583368440205385030L;
    public static long lFld=-211L;
    public static volatile float fFld=-6.953F;
    public static float fFld1=1.240F;
    public static float fArrFld[]=new float[N];
    public static short sArrFld[]=new short[N];
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.873F);
        FuzzerUtils.init(Test.sArrFld, (short)32457);
        FuzzerUtils.init(Test.dArrFld, 124.127783);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i6=-199, i7=-12, i8=-29, i9=231, i10=-5, i11=-189, i12=33739, iArr2[]=new int[N];
        double d1=-2.103390, dArr[]=new double[N];
        short s=-20717;
        byte by=112;
        float f=0.938F;
        long lArr[]=new long[N], lArr1[]=new long[N];

        FuzzerUtils.init(lArr, -3L);
        FuzzerUtils.init(lArr1, 157226804L);
        FuzzerUtils.init(iArr2, -10);
        FuzzerUtils.init(dArr, 66.125295);

        i6 = (int)d1;
        s += (short)i6;
        switch (((i6 >>> 1) % 10) + 87) {
        case 87:
            for (i7 = 9; i7 < 282; ++i7) {
                for (i9 = i7; i9 < 6; i9++) {
                    by *= by;
                    for (i11 = i9; i11 < 1; ++i11) {
                        lArr[i7] += Test.instanceCount;
                        Test.instanceCount /= 180L;
                        i6 = i12;
                        i6 >>= (int)Test.instanceCount;
                        i10 = i8;
                        lArr1[i9 - 1] -= Test.instanceCount;
                        i12 = (int)Test.instanceCount;
                        lArr1[i11 - 1] >>>= i7;
                    }
                }
            }
            break;
        case 88:
            i12 = (int)Test.lFld;
            break;
        case 89:
            iArr2[(-24880 >>> 1) % N] *= (int)Test.instanceCount;
            break;
        case 90:
            iArr2[(i11 >>> 1) % N] = by;
        case 91:
            f += -2471888048L;
            break;
        case 92:
            i12 -= i7;
            break;
        case 93:
            Test.lFld = Test.lFld;
            break;
        case 94:
            Test.lFld = i12;
            break;
        case 95:
            dArr[(i12 >>> 1) % N] = 25.503F;
            break;
        case 96:
            i6 *= i12;
            break;
        default:
            Test.fArrFld[(i7 >>> 1) % N] -= i11;
        }
        vMeth_check_sum += i6 + Double.doubleToLongBits(d1) + s + i7 + i8 + i9 + i10 + by + i11 + i12 +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(lArr1) +
            FuzzerUtils.checkSum(iArr2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static int iMeth1(int i3, long l1, int i4) {

        int i5=-50711, i13=79, i14=-14335, iArr1[][][]=new int[N][N][N];
        double d=-2.109919;
        byte by1=50;
        long l2=-1847916536525504969L;

        FuzzerUtils.init(iArr1, 167);

        i5 = 1;
        do {
            d = Math.max(i4++, iArr1[i5][i5][i5 + 1] * (i4++));
            switch (((i5 % 5) * 5) + 66) {
            case 75:
                vMeth();
                i4 = i4;
                Test.fFld = i5;
                break;
            case 77:
                by1 >>= (byte)i4;
                for (i13 = 1; i13 < 7; ++i13) {
                    i4 += -133;
                    i3 += (i13 * i4);
                    switch (((i13 % 6) * 5) + 24) {
                    case 27:
                        d -= i13;
                        i14 = i3;
                        if (false) continue;
                        i4 += (((i13 * i14) + by1) - i14);
                        break;
                    case 38:
                        Test.instanceCount += (i13 - i3);
                        break;
                    case 41:
                        i14 = (int)Test.fFld;
                        break;
                    case 26:
                        i4 += i5;
                    case 51:
                        i3 *= i13;
                        break;
                    case 45:
                        by1 |= (byte)l2;
                    }
                }
            case 67:
                Test.sArrFld = FuzzerUtils.short1array(N, (short)11119);
                break;
            case 88:
                Test.dArrFld[i5 - 1][i5 + 1] -= i14;
                break;
            case 71:
                i14 = (int)l2;
                break;
            }
        } while (++i5 < 215);
        long meth_res = i3 + l1 + i4 + i5 + Double.doubleToLongBits(d) + by1 + i13 + i14 + l2 +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        int i2=-11946, i15=-34618, i16=-43802, i17=-5392, i18=80, iArr[]=new int[N];
        double d2=-122.92781;
        byte by2=100;

        FuzzerUtils.init(iArr, 107);

        iArr[(i2 >>> 1) % N] &= iMeth1(i2, Test.lFld, 221);
        Test.lFld += (long)d2;
        i2 += (int)l;
        for (i15 = 7; i15 < 164; ++i15) {
            short s1=-29950;
            Test.lFld += (i15 | s1);
            switch (((i15 % 2) * 5) + 103) {
            case 112:
                switch ((((i16 >>> 1) % 1) * 5) + 126) {
                case 128:
                    by2 -= (byte)Test.lFld;
                    i16 &= i2;
                    if (false) continue;
                    i16 += i2;
                    break;
                }
                i2 += i15;
                for (i17 = 1; i17 < 10; i17++) {
                    i2 >>= i18;
                    i2 += i18;
                }
                break;
            case 106:
                i16 = i2;
            }
        }
        long meth_res = l + i2 + Double.doubleToLongBits(d2) + i15 + i16 + by2 + i17 + i18 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-248, i1=-51413, i19=54, i20=60, i21=-7, i22=147, i23=12, i24=-22708, i25=4, iArr3[]=new int[N];
        byte by4=-98, byArr[][]=new byte[N][N];
        double d3=2.127295;
        short s2=7029;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(byArr, (byte)-104);
        FuzzerUtils.init(iArr3, -57864);
        FuzzerUtils.init(fArr, 2.678F);

        for (i = 2; 373 > i; i += 3) {
            byArr[i][i - 1] -= (byte)iMeth(Test.lFld);
            i1 += (i ^ Test.lFld);
        }
        iArr3[(i >>> 1) % N] = i1;
        for (i19 = 3; i19 < 278; ++i19) {
            Test.dArrFld[i19 + 1][i19 + 1] += i20;
            for (i21 = 91; i21 > 3; i21--) {
                i1 -= (int)Test.fFld;
                Test.fFld1 += i19;
                i1 = i;
                switch ((i19 % 4) + 25) {
                case 25:
                    Test.lFld <<= i20;
                    fArr = fArr;
                    Test.instanceCount += (i21 * i21);
                    i23 = 1;
                    while (++i23 < 2) {
                        byte by3=-81;
                        i20 *= (int)29.91976;
                        by3 = (byte)23869;
                        i20 = i21;
                        i20 >>= i22;
                        i20 += (((i23 * Test.fFld1) + by3) - i1);
                        Test.instanceCount += 64;
                    }
                    break;
                case 26:
                    i22 *= by4;
                    Test.instanceCount += -3074L;
                    i22 = i20;
                    for (i24 = 1; i24 < 2; i24++) {
                        switch ((i19 % 1) + 84) {
                        case 84:
                            Test.fFld *= Test.fFld;
                            by4 += (byte)(i24 * i24);
                            try {
                                i25 = (i19 / i25);
                                i22 = (i21 % iArr3[i19 + 1]);
                                i20 = (i / i22);
                            } catch (ArithmeticException a_e) {}
                            i22 = i23;
                            break;
                        default:
                            i1 += (-121 + (i24 * i24));
                        }
                    }
                case 27:
                    d3 *= -177;
                    break;
                case 28:
                    s2 += (short)(((i21 * Test.lFld) + i19) - i1);
                    break;
                default:
                    i25 += (int)-44.300F;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i19 = " + i + "," + i1 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 by4 i24 = " + i23 + "," + by4 + "," + i24);
        FuzzerUtils.out.println("i25 d3 s2 = " + i25 + "," + Double.doubleToLongBits(d3) + "," + s2);
        FuzzerUtils.out.println("byArr iArr3 fArr = " + FuzzerUtils.checkSum(byArr) + "," + FuzzerUtils.checkSum(iArr3)
            + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.lFld Test.fFld = " + Test.instanceCount + "," + Test.lFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.fFld1 Test.fArrFld Test.sArrFld = " + Float.floatToIntBits(Test.fFld1) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.fArrFld)) + "," + FuzzerUtils.checkSum(Test.sArrFld));
        FuzzerUtils.out.println("Test.dArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
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
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
