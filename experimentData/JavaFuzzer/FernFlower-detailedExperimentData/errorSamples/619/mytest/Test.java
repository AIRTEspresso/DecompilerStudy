import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:33:40 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=163288996L;
    public float fFld=-1.652F;
    public static volatile float fFld1=2.253F;
    public static boolean bFld=false;
    public static int iFld=13;
    public int iFld1=-29538;
    public static volatile int iArrFld[]=new int[N];

    static {
        init(Test.iArrFld, -11732);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i10=-9, i11=10, i12=-231, i13=0, i14=-6, i15=12, iArr[]=new int[N];
        float f2=2.717F;

        init(iArr, 13);

        for (i10 = 2; i10 < 189; ++i10) {
            for (i12 = 1; i12 < 9; i12++) {
                f2 = 1;
                do {
                    i13 &= (int)Test.instanceCount;
                    i11 >>= i13;
                    Test.instanceCount += (-201L + (f2 * f2));
                } while (++f2 < 2);
                for (i14 = 1; i14 < 2; i14++) {
                    Test.fFld1 += (((i14 * i15) + Test.instanceCount) - i12);
                    i11 = i15;
                    Test.fFld1 = i11;
                    if (Test.bFld) continue;
                    i13 += i14;
                    iArr[i14] >>>= i11;
                    Test.instanceCount = i11;
                    i15 -= -8231;
                }
            }
        }
        long meth_res = i10 + i11 + i12 + i13 + Float.floatToIntBits(f2) + i14 + i15 + checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(short s, int i9) {


        i9 <<= i9;
        i9 = (int)(iMeth() + Test.fFld1);
        vMeth_check_sum += s + i9;
    }

    public boolean bMeth(int i5, int i6, int i7) {

        int i8=-6, i16=214, i17=-37467, i18=52110, i19=13, iArr1[]=new int[N];
        short s1=-21472;
        double d=-37.50236;
        long lArr[]=new long[N];

        init(lArr, 4005670795L);
        init(iArr1, 241);

        i7 *= (int)(lArr[(i6 >>> 1) % N]--);
        i8 = 1;
        while (++i8 < 325) {
            fFld += i8;
            if (Test.bFld) {
                vMeth(s1, i5);
            }
            for (i16 = 1; i16 < 5; ++i16) {
                if (Test.bFld) break;
            }
            switch (((i8 % 8) * 5) + 78) {
            case 96:
                for (i18 = 1; i18 < 5; ++i18) {
                    Test.instanceCount += i8;
                    switch (((i8 % 5) * 5) + 80) {
                    case 92:
                        iArr1[i8] -= i6;
                        Test.instanceCount <<= i16;
                        if (i16 != 0) {
                            return ((int)(i5 + i6 + i7 + i8 + s1 + i16 + i17 + i18 + i19 + Double.doubleToLongBits(d) +
                                checkSum(lArr) + checkSum(iArr1))) % 2 > 0;
                        }
                        lArr[i8 - 1] -= i17;
                        break;
                    case 103:
                        lArr[i8 + 1] += Test.iFld;
                        break;
                    case 83:
                        Test.instanceCount += i18;
                        break;
                    case 82:
                        i19 += i18;
                        break;
                    case 97:
                        Test.instanceCount >>= i17;
                        break;
                    default:
                        Test.iFld += (int)(2L + (i18 * i18));
                    }
                }
                break;
            case 84:
                i7 += (i8 * i8);
                break;
            case 118:
                i6 *= i17;
                break;
            case 85:
                Test.instanceCount = Test.instanceCount;
                break;
            case 100:
                i17 -= (int)d;
                break;
            case 109:
                try {
                    i5 = (-956246768 / i8);
                    iArr1[i8] = (iArr1[i8 - 1] / 150);
                    Test.iFld = (i16 / -185);
                } catch (ArithmeticException a_e) {}
                break;
            case 98:
                i19 += i8;
                break;
            case 80:
                Test.iFld <<= i5;
                break;
            default:
                i5 = (int)2.800F;
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + s1 + i16 + i17 + i18 + i19 + Double.doubleToLongBits(d) +
            checkSum(lArr) + checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=182, i1=2353, i2=9, i3=-229, i4=-4, i20=14521, i21=55344, i22=-10681, i23=24924;
        float f=24.880F, f1=-1.122F;
        byte by=-12, by1=25;
        boolean b=false;
        double d1=126.64260;

        for (i = 9; i < 337; i++) {
            for (i2 = 3; 77 > i2; ++i2) {
                i3 += (((i2 * Test.instanceCount) + i2) - i3);
                i1 >>= (i3 + ((i << i1) * Math.abs(-22432)));
                for (f = 1; f < 2; f++) {
                    f1 += (-((Test.instanceCount % (by | 1)) + (-55125 + f)));
                    b = bMeth(Test.iFld, Test.iFld, i1);
                    fFld = Test.instanceCount;
                    Test.iArrFld = Test.iArrFld;
                    i4 += (int)(((f * Test.iFld) + i4) - Test.instanceCount);
                    iFld1 += i4;
                    iFld1 <<= i2;
                    i1 *= by;
                    iFld1 += (int)(f * f);
                    d1 -= i1;
                }
            }
            for (i20 = 2; 77 > i20; i20++) {
                if (b) continue;
                iFld1 ^= by1;
            }
            i21 = 45900;
            Test.iArrFld[i + 1] = i;
        }
        i1 = i21;
        Test.instanceCount = i2;
        for (i22 = 6; i22 < 357; i22++) {
            Test.instanceCount = (long)Test.fFld1;
            i23 = (int)Test.instanceCount;
            i21 *= (int)Test.instanceCount;
            Test.instanceCount = -43125;
            by *= (byte)i2;
            i4 = by1;
            iFld1 >>= Test.iFld;
        }

        System.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        System.out.println("i3 f i4 = " + i3 + "," + Float.floatToIntBits(f) + "," + i4);
        System.out.println("f1 by b = " + Float.floatToIntBits(f1) + "," + by + "," + (b ? 1 : 0));
        System.out.println("d1 i20 i21 = " + Double.doubleToLongBits(d1) + "," + i20 + "," + i21);
        System.out.println("by1 i22 i23 = " + by1 + "," + i22 + "," + i23);

        System.out.println("Test.instanceCount fFld Test.fFld1 = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + Float.floatToIntBits(Test.fFld1));
        System.out.println("Test.bFld Test.iFld iFld1 = " + (Test.bFld ? 1 : 0) + "," + Test.iFld + "," + iFld1);
        System.out.println("Test.iArrFld = " + checkSum(Test.iArrFld));

        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
        System.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}