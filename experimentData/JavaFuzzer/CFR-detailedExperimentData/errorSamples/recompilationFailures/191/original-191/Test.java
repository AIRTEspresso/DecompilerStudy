// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 22:35:22 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=62L;
    public static short sFld=-32176;
    public static float fFld=0.120F;
    public static boolean bFld=true;
    public double dFld=1.68015;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];
    public static long lArrFld1[][]=new long[N][N];
    public short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5678);
        FuzzerUtils.init(Test.lArrFld, 7L);
        FuzzerUtils.init(Test.lArrFld1, 18881L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i2=-234, i3=9497, i4=20114, i5=-126, i6=-187, i7=-8374, i8=-3, i9=14, iArr[]=new int[N];
        double d=2.51093;
        float f=17.197F;
        boolean b=true;

        FuzzerUtils.init(iArr, -13464);

        for (i2 = 264; i2 > 1; i2--) {
            for (d = 6; d > 1; d--) {
                short s=-25066;
                s &= (short)i3;
                i5 = 1;
                while (++i5 < 2) {
                    Test.instanceCount = (long)-4.932F;
                }
                Test.instanceCount += (long)((long)d | i4);
            }
            i4 *= i4;
            i4 = i4;
            i3 /= (int)(Test.instanceCount | 1);
        }
        for (i6 = 18; i6 < 289; ++i6) {
            switch ((i6 % 6) + 75) {
            case 75:
                for (i8 = 1; i8 < 6; i8++) {
                    Test.instanceCount += i8;
                    i7 = (int)d;
                    i3 >>= i3;
                }
                break;
            case 76:
                iArr[i6 + 1] &= (int)-3L;
                break;
            case 77:
                f += i6;
                break;
            case 78:
            case 79:
                Test.instanceCount *= i3;
            case 80:
                if (b) continue;
            }
        }
        vMeth2_check_sum += i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 + i9 +
            Float.floatToIntBits(f) + (b ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1() {

        int i10=59, i11=4, i12=-12, i13=-9, i14=-52298;
        double d1=14.114085;

        vMeth2();
        i10 = 144;
        while ((i10 -= 2) > 0) {
            for (d1 = 1; 21 > d1; ++d1) {
                Test.iArrFld[(int)(d1 - 1)] = Test.sFld;
                i11 *= Test.sFld;
                for (i12 = 1; i12 < 2; ++i12) {
                    boolean b1=false;
                    if (b1) continue;
                    Test.lArrFld[i10 + 1] *= i10;
                    i11 *= i12;
                }
                Test.sFld <<= (short)0;
                i11 %= (int)((long)(Test.fFld) | 1);
                i11 -= i10;
                Test.lArrFld[i10 + 1] = i14;
                Test.lArrFld[i10 - 1] -= (long)-1.161F;
                Test.bFld = Test.bFld;
            }
        }
        vMeth1_check_sum += i10 + Double.doubleToLongBits(d1) + i11 + i12 + i13 + i14;
    }

    public static void vMeth(long l) {

        int i15=1, i16=12, i17=207, i18=0;

        vMeth1();
        Test.iArrFld[(27130 >>> 1) % N] = i15;
        Test.lArrFld1 = Test.lArrFld1;
        for (i16 = 4; i16 < 174; i16++) {
            Test.iArrFld[i16] = (int)l;
            i18 = 1;
            do {
                byte by=-22;
                i15 -= i15;
                l = -69L;
                switch ((i18 % 1) + 91) {
                case 91:
                    switch (((i15 >>> 1) % 10) + 18) {
                    case 18:
                        Test.instanceCount += (i18 + i16);
                        switch ((i16 % 1) + 53) {
                        case 53:
                            if (false) continue;
                            if (Test.bFld) continue;
                            Test.instanceCount >>= i18;
                            break;
                        default:
                            Test.fFld += (i18 * i17);
                        }
                    case 19:
                        i15 -= -5990;
                        break;
                    case 20:
                        Test.instanceCount &= -894;
                        break;
                    case 21:
                        i17 += by;
                        break;
                    case 22:
                        i17 = i16;
                        break;
                    case 23:
                        i17 >>= (int)9L;
                        break;
                    case 24:
                        i17 -= (int)l;
                        break;
                    case 25:
                        i17 -= i18;
                        break;
                    case 26:
                        i17 += (i18 * i18);
                        break;
                    case 27:
                        Test.lArrFld1[i16][i16] -= i17;
                        break;
                    }
                    break;
                }
            } while (++i18 < 9);
        }
        vMeth_check_sum += l + i15 + i16 + i17 + i18;
    }

    public void mainTest(String[] strArr1) {

        int i=-11, i1=-3, i19=35, i20=58518, i21=-197, i22=12, i23=119, i24=-5, i25=135, i26=18457;

        for (i = 7; 124 > i; ++i) {
            vMeth(Test.instanceCount);
            i1 *= (int)Test.instanceCount;
            Test.instanceCount <<= Test.instanceCount;
            for (i19 = 1; 214 > i19; ++i19) {
                Test.fFld += i19;
                switch ((i19 % 9) + 84) {
                case 84:
                    i1 += (((i19 * i20) + i) - i19);
                    for (i21 = i; 2 > i21; ++i21) {
                        byte by1=-107;
                        Test.fFld -= Test.instanceCount;
                        i22 *= -10106;
                        Test.lArrFld1[i21 + 1][i21] = 170L;
                        try {
                            Test.iArrFld[i21] = (17819 % i1);
                            i22 = (i % -151);
                            i23 = (-4555 % i19);
                        } catch (ArithmeticException a_e) {}
                        i20 = by1;
                    }
                    for (i24 = 1; i24 < 2; ++i24) {
                        i20 *= i21;
                        i22 = (int)Test.instanceCount;
                    }
                    switch ((i % 2) + 20) {
                    case 20:
                        if (Test.bFld) break;
                        break;
                    case 21:
                        i26 = 1;
                        while (++i26 < 2) {
                            Test.instanceCount -= 13925;
                            i20 += i26;
                            sArrFld[i26 + 1] += (short)Test.instanceCount;
                            Test.iArrFld[i19 - 1] -= i21;
                            i1 *= i25;
                            i23 -= (int)-62719L;
                            switch ((i19 % 9) + 46) {
                            case 46:
                                Test.instanceCount -= i20;
                                Test.sFld += (short)(5 + (i26 * i26));
                                Test.iArrFld[i26 - 1] = (int)237L;
                                break;
                            case 47:
                                i23 *= i26;
                            case 48:
                                i20 += (int)Test.instanceCount;
                                break;
                            case 49:
                                i22 *= i19;
                            case 50:
                                i22 >>= (int)Test.instanceCount;
                            case 51:
                                i25 >>= (int)-10L;
                                break;
                            case 52:
                                dFld += i19;
                                break;
                            case 53:
                                i1 = (int)Test.instanceCount;
                                break;
                            case 54:
                                i23 = 1;
                            default:
                                dFld += Test.fFld;
                            }
                        }
                        break;
                    }
                    break;
                case 85:
                    Test.iArrFld[i] = i19;
                    break;
                case 86:
                case 87:
                    Test.iArrFld[i19] += (int)Test.instanceCount;
                    break;
                case 88:
                    i1 -= (int)-4945871004424632104L;
                    break;
                case 89:
                    i22 = 72;
                case 90:
                    i22 = (int)Test.instanceCount;
                    break;
                case 91:
                    i1 -= i21;
                    break;
                case 92:
                    i1 *= (int)Test.instanceCount;
                    break;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i19 = " + i + "," + i1 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 = " + i26);

        FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.bFld dFld Test.iArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(dFld) + "," + FuzzerUtils.checkSum(Test.iArrFld));
        FuzzerUtils.out.println("Test.lArrFld Test.lArrFld1 sArrFld = " + FuzzerUtils.checkSum(Test.lArrFld) + "," +
            FuzzerUtils.checkSum(Test.lArrFld1) + "," + FuzzerUtils.checkSum(sArrFld));

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