import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:14:40 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-167L;
    public static int iFld=-11;
    public static boolean bFld=true;
    public static byte byFld=-98;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth() {

        int i2=17, i3=170, i4=4581, i5=62334, i6=3, i7=1155, i8=13, i9=5, iArr[]=new int[N];
        short s=12629;
        float f1=2.119F;
        double d=-85.40773;
        boolean b=false;

        init(iArr, 9);

        i2 = s;
        f1 -= 134;
        Test.instanceCount *= Test.iFld;
        i2 >>= 9;
        for (i3 = 4; 162 > i3; i3++) {
            for (i5 = i3; i5 < 10; i5++) {
                d += d;
                Test.iFld += i5;
                for (i7 = i5; i7 < 1; i7++) {
                    i4 *= (int)d;
                    f1 *= Test.instanceCount;
                    try {
                        iArr[i3 + 1] = (i3 % i9);
                        i9 = (iArr[i3] / i7);
                        iArr[(i6 >>> 1) % N] = (-2712 / i2);
                    } catch (ArithmeticException a_e) {}
                    if (i4 != 0) {
                    }
                }
                Test.instanceCount += (-2 + (i5 * i5));
                if (b) continue;
            }
        }
        long meth_res = i2 + s + Float.floatToIntBits(f1) + i3 + i4 + i5 + i6 + Double.doubleToLongBits(d) + i7 + i8 +
            i9 + (b ? 1 : 0) + checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(long l, long l1) {

        int i10=1, i11=-6463, i12=-5415, i13=-44639, iArr1[][]=new int[N][N];
        float f2=38.1011F;
        short s1=23448;

        init(iArr1, 0);

        l1 &= (long)(dMeth() * Test.iFld);
        for (i10 = 7; i10 < 184; i10++) {
            f2 = 1;
            while (++f2 < 9) {
                iArr1[i10][(int)(f2)] -= i10;
                Test.iFld = (int)-2855622914L;
                for (i12 = 1; 1 > i12; ++i12) {
                    try {
                        Test.iFld = (-57509 % i12);
                        Test.iFld = (1007264487 / i12);
                        Test.iFld = (i13 % iArr1[(int)(f2)][(int)(f2)]);
                    } catch (ArithmeticException a_e) {}
                    Test.iFld /= (int)((long)(f2) | 1);
                }
                i11 = -13;
                if (Test.bFld) break;
                i11 = i12;
                l += i12;
                i13 += (int)(((f2 * Test.iFld) + Test.byFld) - Test.instanceCount);
                Test.iFld -= s1;
            }
            Test.instanceCount += (long)14.827F;
        }
        vMeth1_check_sum += l + l1 + i10 + i11 + Float.floatToIntBits(f2) + i12 + i13 + s1 +
            checkSum(iArr1);
    }

    public static void vMeth(int i1, float f) {

        long l2=28592L, lArr[]=new long[N];

        init(lArr, -50647L);

        lArr[(9345 >>> 1) % N] /= ((-i1) | 1);
        i1 = (int)2615956738L;
        vMeth1(l2, l2);
        i1 = (int)Test.instanceCount;
        i1 = Test.iFld;
        vMeth_check_sum += i1 + Float.floatToIntBits(f) + l2 + checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-43173, i14=-7223, i15=11, i16=36476, i17=-3147, i18=-4, i19=-66, i20=32555, i21=-13, i22=-2, i23=-19;
        float f3=-123.205F, fArr[]=new float[N];
        double d1=0.91118;
        byte byArr[]=new byte[N];
        long lArr1[]=new long[N];

        init(fArr, -2.179F);
        init(byArr, (byte)-121);
        init(lArr1, -26293L);

        fArr[(i >>> 1) % N] -= i;
        Test.instanceCount *= Test.instanceCount;
        vMeth(i, f3);
        for (i14 = 1; i14 < 278; i14++) {
            i16 = 1;
            do {
                f3 *= -31;
                d1 += d1;
                d1 -= f3;
            } while (++i16 < 91);
            try {
                iArrFld[i14 - 1] = (i / i16);
                iArrFld[i14] = (1365758419 / i15);
                i = (iArrFld[i14] / i16);
            } catch (ArithmeticException a_e) {}
            for (i17 = 1; i17 < 91; ++i17) {
                short s2=-32473;
                if (false) {
                    i19 = (int)Test.instanceCount;
                    iArrFld[i17 + 1] -= i16;
                    byArr[i17 + 1] *= (byte)i16;
                } else if (Test.bFld) {
                    Test.iFld += (i17 * i17);
                    Test.iFld -= (int)-2245312193L;
                    iArrFld[i17 - 1] += i17;
                }
                for (i20 = 1; i20 < 2; ++i20) {
                    Test.instanceCount += i18;
                }
                i += (i17 * s2);
                switch ((i17 % 4) + 123) {
                case 123:
                    i18 += (i17 * i17);
                    Test.instanceCount <<= Test.instanceCount;
                    break;
                case 124:
                    iArrFld[i14] = 197;
                    i15 >>= i20;
                    break;
                case 125:
                    i21 += (((i17 * f3) + Test.iFld) - i21);
                    break;
                case 126:
                    i21 += (i17 * i17);
                    break;
                default:
                    for (i22 = i14; i22 < 2; i22 += 2) {
                        lArr1[i17] -= i16;
                        f3 -= Test.byFld;
                    }
                }
            }
        }

        System.out.println("i f3 i14 = " + i + "," + Float.floatToIntBits(f3) + "," + i14);
        System.out.println("i15 i16 d1 = " + i15 + "," + i16 + "," + Double.doubleToLongBits(d1));
        System.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        System.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        System.out.println("i23 fArr byArr = " + i23 + "," + Double.doubleToLongBits(checkSum(fArr)) +
            "," + checkSum(byArr));
        System.out.println("lArr1 = " + checkSum(lArr1));

        System.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        System.out.println("Test.byFld iArrFld = " + Test.byFld + "," + checkSum(iArrFld));

        System.out.println("dMeth_check_sum: " + dMeth_check_sum);
        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}