import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
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
        init(Test.iArrFld, 89);
        init(Test.lArrFld, 507897389772567526L);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i4, double d1, int i5) {

        int i6=-250, i7=7, i8=36535, i9=-65196, iArr[]=new int[N], iArr1[]=new int[N];
        short s=-7608;
        byte by=117, byArr[]=new byte[N];

        init(byArr, (byte)83);
        init(iArr, -11);
        init(iArr1, 11);

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
                checkSum(byArr) + checkSum(iArr) + checkSum(iArr1);
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

        init(sArr, (short)-25215);
        init(lArr, -5345615981701219748L);

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
                checkSum(sArr) + checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {
            iMeth();
                System.out.println("Test.bFld Test.iArrFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," +
                checkSum(Test.iArrFld) + "," + checkSum(Test.lArrFld));
//        long l=-6680001980801465313L;
//        int i=170, i11=214, i12=-210, i13=7, i14=7, i15=44204, i16=14;
//        float f1=-1.267F;
//        byte byArr1[]=new byte[N];
//
//        init(byArr1, (byte)39);
//
//        for (l = 1; l < 272; l++) {
//            Test.instanceCount *= Math.abs((int)(26.939F + iMeth()));
//            i |= (int)l;
//            Test.instanceCount += l;
//            for (i11 = 5; i11 < 93; i11++) {
//                i12 = i11;
//                f1 -= -29L;
//                i12 = i12;
//                i >>= i11;
//                if (Test.bFld) {
//                    if (Test.bFld) {
//                        for (i13 = 1; i13 < 2; ++i13) {
//                            Test.iArrFld[(int)(l)] = i11;
//                            Test.iArrFld[(int)(l + 1)] ^= (int)l;
//                            i *= i13;
//                            Test.instanceCount += i13;
//                            Test.iArrFld[i13] = (int)f1;
//                            Test.sFld = (short)Test.instanceCount;
//                            i12 -= (int)Test.instanceCount;
//                            Test.iArrFld[i11 - 1] = 142;
//                        }
//                        Test.byFld |= (byte)i12;
//                        Test.iArrFld[i11 - 1] = i14;
//                        Test.lArrFld[(int)(l)] -= i;
//                    } else {
//                        for (i15 = 1; 2 > i15; ++i15) {
//                            i14 = 199;
//                        }
//                    }
//                    Test.sFld >>= (short)i12;
//                    byArr1[(int)(l)] = (byte)i11;
//                    try {
//                        i = (6079 / i11);
//                        i14 = (i15 / i14);
//                        Test.iArrFld[i11 - 1] = (Test.iArrFld[(int)(l - 1)] / i14);
//                    } catch (ArithmeticException a_e) {}
//                } else {
//                    try {
//                        i16 = (i12 / 56045);
//                        i14 = (i13 % -25);
//                        Test.iArrFld[(int)(l)] = (Test.iArrFld[(int)(l - 1)] / 226);
//                    } catch (ArithmeticException a_e) {}
//                    Test.sFld = (short)l;
//                }
//            }
//        }
//
//        System.out.println("l i i11 = " + l + "," + i + "," + i11);
//        System.out.println("i12 f1 i13 = " + i12 + "," + Float.floatToIntBits(f1) + "," + i13);
//        System.out.println("i14 i15 i16 = " + i14 + "," + i15 + "," + i16);
//        System.out.println("byArr1 = " + checkSum(byArr1));
//
//        System.out.println("Test.instanceCount Test.sFld Test.byFld = " + Test.instanceCount + "," + Test.sFld +
//                "," + Test.byFld);
//        System.out.println("Test.bFld Test.iArrFld Test.lArrFld = " + (Test.bFld ? 1 : 0) + "," +
//                checkSum(Test.iArrFld) + "," + checkSum(Test.lArrFld));
//
//        System.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
//        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
//        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
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