import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 00:28:33 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-2408418474L;
    public static int iFld=49210;
    public static byte byFld=127;
    public static boolean bFld=false;
    public static float fFld=8.153F;
    public static double dFld=-53.81110;
    public static long lFld=-2516580881L;
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    static {
        init(Test.byArrFld, (byte)126);
        init(Test.lArrFld, -2L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(double d, int i3) {

        int i4=-43255, i5=-7, i6=-57, i7=-1, i8=162, i9=10, i10=-21950, i11=9986;

        for (i4 = 3; i4 < 163; ++i4) {
            i3 &= -10;
            Test.byFld = (byte)-108;
            i5 += (i4 ^ i3);
        }
        for (i6 = 5; i6 < 221; ++i6) {
            switch (((i6 % 6) * 5) + 113) {
            case 130:
                i3 *= (int)d;
                i3 += i6;
            case 123:
                i7 += (i6 * i6);
                for (i8 = i6; i8 < 7; ++i8) {
                    Test.instanceCount += (i8 * i8);
                    for (i10 = 1; i10 > i8; i10--) {
                        Test.bFld = Test.bFld;
                        i11 ^= (int)Test.instanceCount;
                        Test.iFld += (-2 + (i10 * i10));
                    }
                }
                break;
            case 131:
                if (Test.bFld) continue;
                break;
            case 129:
                Test.iFld += (int)Test.instanceCount;
            case 124:
                i11 *= 1;
            case 132:
                i3 = 6544;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11;
    }

    public static int iMeth(int i2, long l1, long l2) {

        float f=-114.85F;
        double d1=-2.28635;
        int i12=-5103, i13=22, i14=-13;
        long l3=1L;

        l1 += (long)(Test.iFld * ((i2 + f) - (Test.iFld - Test.byFld)));
        vMeth1(d1, Test.iFld);
        for (i12 = 11; i12 < 215; i12++) {
            f = Test.instanceCount;
            Test.iFld -= i13;
            i13 ^= (int)l2;
            l2 -= i12;
            l3 = 1;
            while (++l3 < 8) {
                i14 = 1;
                do {
                    if (Test.bFld) break;
                    i2 = i13;
                    if (Test.bFld) continue;
                    Test.iFld += (int)l3;
                } while (++i14 < 1);
                i13 &= 32878;
                i2 &= 41962;
            }
        }
        long meth_res = i2 + l1 + l2 + Float.floatToIntBits(f) + Double.doubleToLongBits(d1) + i12 + i13 + l3 + i14;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i, int i1) {

        short s=-21477;
        int i15=-2, i16=-61993, i17=0, i18=-157, i19=-7;
        long lArr[]=new long[N];

        init(lArr, -245L);

        Test.iFld -= (iMeth(Test.iFld, Test.instanceCount, Test.instanceCount) % (i | 1));
        Test.iFld -= i1;
        Test.fFld *= i1;
        Test.instanceCount = -206;
        Test.dFld -= Test.instanceCount;
        i *= Test.iFld;
        s >>= (short)i;
        i15 = 221;
        do {
            for (i16 = 1; 14 > i16; i16 += 2) {
                switch (((i16 % 2) * 5) + 1) {
                case 4:
                    i1 <<= i16;
                    for (i18 = i16; i18 < 3; ++i18) {
                        s -= (short)i18;
                        Test.iFld = (int)l;
                        i1 = i17;
                    }
                    break;
                case 10:
                    Test.byArrFld[i15] |= (byte)i17;
                    break;
                default:
                    l >>>= l;
                }
            }
        } while ((i15 -= 2) > 0);
        vMeth_check_sum += l + i + i1 + s + i15 + i16 + i17 + i18 + i19 + checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i20=111, i21=26492, i22=-22019, i23=1, i24=52213, i25=9, i26=-146, i27=-27054, i28=-196;
        short s1=4572;

        Test.iFld += (int)(++Test.instanceCount);
        vMeth(Test.instanceCount, -178, Test.iFld);
        for (i20 = 9; i20 < 270; i20++) {
            Test.iFld = (int)Test.instanceCount;
            Test.iFld += i20;
            Test.dFld *= 4;
            i21 += i20;
            Test.iFld <<= Test.iFld;
            for (i22 = 96; i22 > 6; i22 -= 2) {
                Test.fFld += i22;
                i24 = 1;
                do {
                    Test.fFld += Test.instanceCount;
                    i23 <<= i24;
                    Test.dFld *= Test.iFld;
                    Test.fFld += i22;
                    i21 |= (int)Test.instanceCount;
                    Test.iFld <<= Test.byFld;
                    Test.lArrFld[i24 + 1] &= i24;
                } while (++i24 < 3);
                Test.iFld -= (int)Test.fFld;
                for (i25 = 1; 3 > i25; ++i25) {
                    Test.fFld -= 248;
                }
                i23 &= Test.iFld;
                Test.byArrFld[i20 - 1] = (byte)-169;
                Test.iFld += -63;
                switch (((i26 >>> 1) % 8) + 17) {
                case 17:
                    for (i27 = 3; i27 > 1; i27--) {
                        Test.lFld -= -59542;
                        Test.iFld = (int)Test.instanceCount;
                        i28 += (int)Test.instanceCount;
                    }
                    try {
                        i21 = (i27 % i25);
                        i23 = (i22 % 73);
                        i26 = (i21 % -12085);
                    } catch (ArithmeticException a_e) {}
                case 18:
                    iArrFld[i22 - 1] -= i27;
                    break;
                case 19:
                case 20:
                    i26 += (((i22 * Test.fFld) + Test.fFld) - s1);
                case 21:
                    i21 = i21;
                    break;
                case 22:
                case 23:
                    i23 -= i20;
                    break;
                case 24:
                    Test.lArrFld[i20 + 1] -= Test.lFld;
                }
            }
        }

        System.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        System.out.println("i23 i24 i25 = " + i23 + "," + i24 + "," + i25);
        System.out.println("i26 i27 i28 = " + i26 + "," + i27 + "," + i28);
        System.out.println("s1 = " + s1);

        System.out.println("Test.instanceCount Test.iFld Test.byFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.byFld);
        System.out.println("Test.bFld Test.fFld Test.dFld = " + (Test.bFld ? 1 : 0) + "," +
            Float.floatToIntBits(Test.fFld) + "," + Double.doubleToLongBits(Test.dFld));
        System.out.println("Test.lFld Test.byArrFld Test.lArrFld = " + Test.lFld + "," +
            checkSum(Test.byArrFld) + "," + checkSum(Test.lArrFld));
        System.out.println("iArrFld = " + checkSum(iArrFld));

        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
