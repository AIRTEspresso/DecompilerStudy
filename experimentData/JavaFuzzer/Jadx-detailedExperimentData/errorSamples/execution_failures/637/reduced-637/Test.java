import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:39:19 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-27L;
    public static short sFld=-7298;
    public static byte byFld=-76;
    public static byte byFld1=-34;
    public static boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public int iArrFld1[]=new int[N];

    static {
        init(Test.iArrFld, -29690);
        init(Test.fArrFld, -2.109F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=-60, i6=11;
        double d=1.16152;

        i5 -= Test.byFld;
        d = 1;
        while (++d < 357) {
            if (i5 != 0) {
            }
            i6 = 5;
            do {
                i5 += (24302 + (i6 * i6));
            } while (--i6 > 0);
        }
        long meth_res = i5 + Double.doubleToLongBits(d) + i6;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i3, int i4) {

        int i7=-21678, i8=-10, i9=-219, i10=64791, i11=0;
        float f=-1.695F;
        boolean b=true;
        double d1=-108.98677;
        long lArr[]=new long[N];

        init(lArr, -235669650L);

        Test.instanceCount *= iMeth1();
        for (i7 = 11; i7 < 360; ++i7) {
            long l=2554576780295895974L;
            lArr[(i4 >>> 1) % N] >>= i8;
            i8 += i7;
            i3 = (int)-3L;
            Test.instanceCount >>= i3;
            f = 52992;
            switch (((i7 % 10) * 5) + 15) {
            case 32:
                for (i9 = 1; 5 > i9; ++i9) {
                    i8 = -1;
                }
                break;
            case 44:
                i11 = 1;
                do {
                    b = b;
                    i3 = i3;
                    i4 >>= i11;
                    Test.iArrFld[i11 - 1] = (int)1078026792L;
                } while (++i11 < 5);
                break;
            case 25:
                Test.instanceCount -= i4;
                break;
            case 52:
                Test.fArrFld = Test.fArrFld;
                break;
            case 29:
                Test.byFld1 = Test.byFld1;
                break;
            case 38:
                d1 *= f;
                break;
            case 46:
                i3 = i9;
                break;
            case 65:
                i8 -= (int)-61L;
                break;
            case 40:
                if (b) continue;
            case 17:
                Test.instanceCount += (((i7 * Test.instanceCount) + Test.instanceCount) - Test.instanceCount);
                break;
            default:
                lArr[i7] -= l;
            }
        }
        vMeth_check_sum += i3 + i4 + i7 + i8 + Float.floatToIntBits(f) + i9 + i10 + i11 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + checkSum(lArr);
    }

    public static int iMeth(int i2) {

        int i12=14, i13=-43284, i14=-3, i15=-54, i16=-1, i17=-52709, i18=48438, i19=-20500;
        float f1=0.716F;
        double d2=96.91043;
        short sArr[]=new short[N];

        init(sArr, (short)29449);

        i2 = Test.iArrFld[(i2 >>> 1) % N];
        vMeth(i2, i2);
        for (i12 = 178; i12 > 5; i12--) {
            for (i14 = 1; i14 < 9; ++i14) {
                sArr[i12 + 1] <<= (short)Test.instanceCount;
            }
        }
        for (i16 = 20; i16 < 365; ++i16) {
            switch ((((i15 >>> 1) % 8) * 5) + 60) {
            case 76:
                f1 -= Test.instanceCount;
                for (i18 = 1; i18 < 5; ++i18) {
                    f1 -= i18;
                    Test.bFld = Test.bFld;
                }
                if (Test.bFld) {
                    i19 -= i17;
                    Test.instanceCount += (i16 * Test.sFld);
                } else {
                    f1 += i16;
                }
            case 95:
                Test.iArrFld[i16 - 1] &= Test.sFld;
                break;
            case 93:
            case 90:
                Test.instanceCount *= (long)f1;
                break;
            case 83:
                f1 *= i12;
                break;
            case 73:
                d2 = Test.instanceCount;
                break;
            case 75:
                d2 = Test.instanceCount;
                break;
            case 78:
                Test.iArrFld[i16 + 1] -= i19;
                break;
            }
        }
        long meth_res = i2 + i12 + i13 + i14 + i15 + i16 + i17 + Float.floatToIntBits(f1) + i18 + i19 +
            Double.doubleToLongBits(d2) + checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=7, i1=8, i20=8, i21=4, i22=-40645, i23=-10265, i24=116, i25=23809, i26=1;
        float f2=-1.752F;
        double d3=52.29183;

        for (i = 2; 228 > i; ++i) {
            Test.instanceCount = (i1 + ((i - Test.sFld) * iMeth(i)));
            i1 += (((i * i1) + Test.byFld1) - i1);
            for (i20 = 4; 111 > i20; i20++) {
                for (i22 = 1; i22 < 2; ++i22) {
                    f2 = i;
                    f2 = i21;
                    Test.instanceCount = i21;
                    i23 = i23;
                    iArrFld1[i20 - 1] = (int)10L;
                }
                if (Test.bFld) {
                    for (i24 = 2; 1 < i24; i24 -= 3) {
                        Test.iArrFld[i24 - 1] = (int)Test.instanceCount;
                        switch (((i20 % 7) * 5) + 97) {
                        case 125:
                            i25 = i1;
                            f2 += i24;
                            if (Test.bFld) continue;
                            i23 = Test.sFld;
                            break;
                        case 129:
                            Test.instanceCount = -17803L;
                            i25 += (i24 * i24);
                            i23 *= (int)-9615L;
                            i23 = i;
                            break;
                        case 116:
                            switch (((i20 % 2) * 5) + 52) {
                            case 58:
                                Test.iArrFld[i] = i26;
                                i21 >>= -311;
                                break;
                            case 57:
                                i21 += (((i24 * i) + i25) - Test.instanceCount);
                                switch ((((-21 >>> 1) % 8) * 5) + 29) {
                                case 38:
                                    Test.bFld = Test.bFld;
                                    Test.fArrFld[i - 1] = i22;
                                    Test.sFld *= (short)i24;
                                case 43:
                                    i23 *= i20;
                                    break;
                                case 54:
                                    Test.instanceCount += (i24 ^ Test.byFld);
                                    break;
                                case 51:
                                    i26 -= i26;
                                    break;
                                case 49:
                                    i21 -= i24;
                                    break;
                                case 34:
                                    i21 = (int)Test.instanceCount;
                                    break;
                                case 37:
                                    d3 += f2;
                                    break;
                                case 60:
                                    i23 <<= (int)-43865L;
                                    break;
                                default:
                                    Test.instanceCount &= i24;
                                }
                                break;
                            }
                            break;
                        case 102:
                            i23 -= (int)f2;
                            break;
                        case 120:
                            Test.byFld1 += (byte)i26;
                            break;
                        case 114:
                            Test.instanceCount += 8;
                            break;
                        case 128:
                            i26 = (int)f2;
                            break;
                        default:
                            Test.instanceCount >>>= -16252;
                        }
                    }
                } else {
                    i23 = (int)19238L;
                }
            }
        }

        System.out.println("i i1 i20 = " + i + "," + i1 + "," + i20);
        System.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        System.out.println("f2 i24 i25 = " + Float.floatToIntBits(f2) + "," + i24 + "," + i25);
        System.out.println("i26 d3 = " + i26 + "," + Double.doubleToLongBits(d3));

        System.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
            "," + Test.byFld);
        System.out.println("Test.byFld1 Test.bFld Test.iArrFld = " + Test.byFld1 + "," + (Test.bFld ? 1 : 0) + ","
            + checkSum(Test.iArrFld));
        System.out.println("Test.fArrFld iArrFld1 = " +
            Double.doubleToLongBits(checkSum(Test.fArrFld)) + "," + checkSum(iArrFld1));

        System.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
                _instance.mainTest(strArr);
         } catch (Exception ex) {
            System.out.println(ex.getClass().getCanonicalName());
         }
    }
    public static PrintStream out = System.out;
    public static Random random = new Random(1);
    public static long seed = 1L;
    public static int UnknownZero = 0;


    public static int nextInt(){
        return random.nextInt();
    }
    public static long nextLong(){
        return random.nextLong();
    }
    public static float nextFloat(){
        return random.nextFloat();
    }
    public static double nextDouble(){
        return random.nextDouble();
    }
    public static boolean nextBoolean(){
        return random.nextBoolean();
    }
    public static byte nextByte(){
        return (byte)random.nextInt();
    }
    public static short nextShort(){
        return (short)random.nextInt();
    }
    public static char nextChar(){
        return (char)random.nextInt();
    }

    public static void init(boolean[] a, boolean seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed : (j % 3 == 0);
        }
    }

    public static void init(boolean[][] a, boolean seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(long[] a, long seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(long[][] a, long seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(int[] a, int seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(int[][] a, int seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(short[] a, short seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (short) ((j % 2 == 0) ? seed + j : seed - j);
        }
    }

    public static void init(short[][] a, short seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(char[] a, char seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (char) ((j % 2 == 0) ? seed + j : seed - j);
        }
    }

    public static void init(char[][] a, char seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(byte[] a, byte seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (byte) ((j % 2 == 0) ? seed + j : seed - j);
        }
    }

    public static void init(byte[][] a, byte seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(double[] a, double seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(double[][] a, double seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(float[] a, float seed) {
        for (int j = 0; j < a.length; j++) {
            a[j] = (j % 2 == 0) ? seed + j : seed - j;
        }
    }

    public static void init(float[][] a, float seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }


    public static void init(Object[][] a, Object seed) {
        for (int j = 0; j < a.length; j++) {
            init(a[j], seed);
        }
    }

    public static void init(Object[] a, Object seed) {
        for (int j = 0; j < a.length; j++)
            try {
                a[j] = seed.getClass().newInstance();
            } catch (Exception ex) {
                a[j] = seed;
            }
    }

    public static long checkSum(boolean[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] ? j + 1 : 0);
        }
        return sum;
    }

    public static long checkSum(boolean[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static long checkSum(long[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(long[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static long checkSum(int[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(int[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static long checkSum(short[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (short) (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(short[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static long checkSum(char[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (char) (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(char[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static long checkSum(byte[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (byte) (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static long checkSum(byte[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static double checkSum(double[] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static double checkSum(double[][] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static double checkSum(float[] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += (a[j] / (j + 1) + a[j] % (j + 1));
        }
        return sum;
    }

    public static double checkSum(float[][] a) {
        double sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }


    public static long checkSum(Object[][] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]);
        }
        return sum;
    }

    public static long checkSum(Object[] a) {
        long sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += checkSum(a[j]) * Math.pow(2, j);
        }
        return sum;
    }

    public static long checkSum(Object a) {
        if (a == null)
            return 0L;
        return (long) a.getClass().getCanonicalName().length();
    }


    public static byte[] byte1array(int sz, byte seed) {
        byte[] ret = new byte[sz];
        init(ret, seed);
        return ret;
    }

    public static byte[][] byte2array(int sz, byte seed) {
        byte[][] ret = new byte[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static short[] short1array(int sz, short seed) {
        short[] ret = new short[sz];
        init(ret, seed);
        return ret;
    }

    public static short[][] short2array(int sz, short seed) {
        short[][] ret = new short[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static int[] int1array(int sz, int seed) {
        int[] ret = new int[sz];
        init(ret, seed);
        return ret;
    }

    public static int[][] int2array(int sz, int seed) {
        int[][] ret = new int[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static long[] long1array(int sz, long seed) {
        long[] ret = new long[sz];
        init(ret, seed);
        return ret;
    }

    public static long[][] long2array(int sz, long seed) {
        long[][] ret = new long[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static float[] float1array(int sz, float seed) {
        float[] ret = new float[sz];
        init(ret, seed);
        return ret;
    }

    public static float[][] float2array(int sz, float seed) {
        float[][] ret = new float[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static double[] double1array(int sz, double seed) {
        double[] ret = new double[sz];
        init(ret, seed);
        return ret;
    }

    public static double[][] double2array(int sz, double seed) {
        double[][] ret = new double[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static char[] char1array(int sz, char seed) {
        char[] ret = new char[sz];
        init(ret, seed);
        return ret;
    }

    public static char[][] char2array(int sz, char seed) {
        char[][] ret = new char[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static Object[] Object1array(int sz, Object seed) {
        Object[] ret = new Object[sz];
        init(ret, seed);
        return ret;
    }

    public static Object[][] Object2array(int sz, Object seed) {
        Object[][] ret = new Object[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static boolean[] boolean1array(int sz, boolean seed) {
        boolean[] ret = new boolean[sz];
        init(ret, seed);
        return ret;
    }

    public static boolean[][] boolean2array(int sz, boolean seed) {
        boolean[][] ret = new boolean[sz][sz];
        init(ret, seed);
        return ret;
    }

    public static AtomicLong runningThreads = new AtomicLong(0);

    public static synchronized void runThread(Runnable r) {
        final Thread t = new Thread(r);
        t.start();
        runningThreads.incrementAndGet();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    t.join();
                    runningThreads.decrementAndGet();
                } catch (InterruptedException e) {
                }
            }
        });
        t1.start();
    }

    public static void joinThreads() {
        while (runningThreads.get() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
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