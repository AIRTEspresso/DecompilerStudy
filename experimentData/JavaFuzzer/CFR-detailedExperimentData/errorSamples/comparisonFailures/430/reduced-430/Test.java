import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:53:02 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3093829568423456391L;
    public static int iFld=46934;
    public short sFld=-13791;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[][]=new int[N][N];
    public static long lArrFld[][]=new long[N][N];

    static {
        init(Test.bArrFld, false);
        init(Test.iArrFld, 102);
        init(Test.lArrFld, -4087854843876614839L);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i5, int i6) {

        int i7=-23773, i8=-105, i9=24966, i10=-157, i11=114, i12=0, iArr[]=new int[N];
        float f1=0.39F;
        short sArr[]=new short[N];

        init(sArr, (short)15202);
        init(iArr, -1);

        i6 *= (int)-57.817F;
        Test.instanceCount = i6;
        for (i7 = 8; i7 < 285; ++i7) {
            boolean b1=true;
            if (false) {
                for (i9 = 1; i9 < 6; ++i9) {
                    i8 -= (int)37.694F;
                    sArr = short1array(N, (short)-21291);
                    iArr[i7 + 1] *= i8;
                    i10 += (i9 * i9);
                    f1 = Test.instanceCount;
                    i8 = i8;
                    for (i11 = 1; i11 < 2; ++i11) {
                        i5 <<= i7;
                        Test.instanceCount += (((i11 * i9) + i11) - i10);
                        i10 += i11;
                    }
                }
            } else if (true) {
                Test.instanceCount |= i12;
            } else if (b1) {
                Test.bArrFld[i7] = b1;
            } else {
                iArr = iArr;
                vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 +
                    checkSum(sArr) + checkSum(iArr);
                return;
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + Float.floatToIntBits(f1) + i11 + i12 +
            checkSum(sArr) + checkSum(iArr);
    }

    public static void vMeth(float f, long l) {

        double d=0.129769;
        int i2=9013, i3=-186, i4=154, i13=-19, i14=40333;

        d = Math.abs(Test.instanceCount);
        i2 = 1;
        do {
            for (i3 = 11; i3 > i2; i3--) {
                i4 *= i2;
                vMeth1(i3, i4);
                for (i13 = 1; i13 < 1; ++i13) {
                    Test.instanceCount += l;
                    f = i2;
                    Test.instanceCount *= (long)f;
                    d += -3;
                    i4 &= (int)l;
                    i4 += (((i13 * i3) + f) - i2);
                    Test.iArrFld[i3 - 1][i3] |= i4;
                    i14 *= i4;
                }
                Test.iArrFld[i2][i2] -= i14;
            }
        } while (++i2 < 142);
        vMeth_check_sum += Float.floatToIntBits(f) + l + Double.doubleToLongBits(d) + i2 + i3 + i4 + i13 + i14;
    }

    public static void vSmallMeth(boolean b, int i, int i1) {

        float f2=0.223F;

        i |= (int)Test.instanceCount;
        vMeth(f2, Test.instanceCount);
        vSmallMeth_check_sum += (b ? 1 : 0) + i + i1 + Float.floatToIntBits(f2);
    }

    public void mainTest(String[] strArr1) {

        boolean b2=true;
        int i15=12, i16=48187, i17=-106, i18=10189, i19=-163, i20=-13, i21=-200, i22=-3, i23=-228;
        byte by=-37;
        long l1=-8L;
        double d1=0.18313, d2=-123.120479;
        float f3=38.898F;

        for (int smallinvoc=0; smallinvoc<127; smallinvoc++) vSmallMeth(b2, Test.iFld, 27417);
        for (i15 = 14; i15 < 358; i15++) {
            Test.instanceCount -= by;
            for (i17 = 4; i17 < 73; ++i17) {
                l1 = Test.iFld;
                Test.iArrFld[i17][(i18 >>> 1) % N] -= i17;
                i18 += (int)7872344973167404192L;
                by -= (byte)i16;
                Test.iFld = (int)l1;
                Test.iArrFld[i17 - 1][i15 + 1] &= i16;
            }
            for (i19 = i15; i19 < 73; i19++) {
                sFld = by;
                Test.instanceCount += i19;
                for (i21 = 1; i21 < 1; ++i21) {
                    Test.instanceCount = i21;
                    Test.lArrFld[i19 - 1][i19] |= i20;
                    Test.iFld = sFld;
                    Test.lArrFld[i15 - 1][i19] = i17;
                    Test.instanceCount += (4 + (i21 * i21));
                    i20 *= i19;
                }
                i20 += (i19 | l1);
                Test.instanceCount -= -22739;
                i20 *= i16;
                d1 = f3;
                for (d2 = 1; d2 < 1; d2++) {
                    i18 += (int)(d2 * d2);
                    Test.lArrFld[(int)(d2)][(int)(d2 - 1)] -= l1;
                    if (b2) {
                        Test.iArrFld[(int)(d2 + 1)][i15] *= sFld;
                        f3 += i16;
                    } else {
                        i16 = i20;
                    }
                }
            }
        }

        System.out.println("b2 i15 i16 = " + (b2 ? 1 : 0) + "," + i15 + "," + i16);
        System.out.println("by i17 i18 = " + by + "," + i17 + "," + i18);
        System.out.println("l1 i19 i20 = " + l1 + "," + i19 + "," + i20);
        System.out.println("i21 i22 d1 = " + i21 + "," + i22 + "," + Double.doubleToLongBits(d1));
        System.out.println("f3 d2 i23 = " + Float.floatToIntBits(f3) + "," + Double.doubleToLongBits(d2) + "," +
            i23);

        System.out.println("Test.instanceCount Test.iFld sFld = " + Test.instanceCount + "," + Test.iFld + "," +
            sFld);
        System.out.println("Test.bArrFld Test.iArrFld Test.lArrFld = " + checkSum(Test.bArrFld) + ","
            + checkSum(Test.iArrFld) + "," + checkSum(Test.lArrFld));

        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
        System.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
