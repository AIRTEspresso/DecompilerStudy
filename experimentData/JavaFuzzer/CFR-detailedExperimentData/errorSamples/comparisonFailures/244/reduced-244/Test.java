import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 22:56:43 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=3167832886L;
    public static int iFld=8;
    public static float fFld=1.288F;
    public static double dFld=-3.67625;
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];

    static {
        init(Test.fArrFld, 71.1013F);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(short s) {

        int i7=13, i8=3, i9=197, i10=0, i11=-7, i12=233, i13=13, i14=-1, iArr1[]=new int[N];
        double d=-76.68049;
        boolean b=false;
        long lArr[]=new long[N];

        init(iArr1, 38);
        init(lArr, 970730100L);

        Test.iFld -= i7;
        for (i8 = 6; i8 < 128; ++i8) {
            i10 = 1;
            do {
                iArr1[i8] *= (int)Test.fFld;
            } while (++i10 < 13);
        }
        d -= -60664;
        Test.instanceCount -= Test.iFld;
        for (i11 = 6; i11 < 183; ++i11) {
            switch ((i11 % 9) + 47) {
            case 47:
                lArr[i11] = Test.instanceCount;
                i7 *= (int)Test.fFld;
                i9 += (i11 ^ Test.instanceCount);
            case 48:
                for (i13 = 1; i13 < 9; ++i13) {
                    lArr[i11 - 1] -= 5L;
                }
                if (false) continue;
                i9 *= (int)Test.instanceCount;
            case 49:
                i14 = (int)34.91843;
                break;
            case 50:
                Test.iFld >>>= 23821;
                break;
            case 51:
            case 52:
                b = b;
                break;
            case 53:
                Test.iFld = i8;
            case 54:
                i9 -= i7;
                break;
            case 55:
                i14 += (((i11 * i14) + Test.fFld) - i13);
                break;
            default:
                Test.iFld = 8;
            }
        }
        vMeth1_check_sum += s + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
            checkSum(iArr1) + checkSum(lArr);
    }

    public static void vMeth(int i5, int i6) {

        short s1=-30748;

        vMeth1(s1);
        i5 |= Test.iFld;
        vMeth_check_sum += i5 + i6 + s1;
    }

    public static int iMeth(int i2) {

        int i3=3, i4=11, i15=11, i16=-11;
        long l=2247622150L;
        double d1=0.118598;
        float fArr[]=new float[N];

        init(fArr, 1.73F);

        for (i3 = 4; i3 < 323; i3++) {
            l = 1;
            do {
                vMeth(Test.iFld, i2);
                fArr[(int)(l)] += -207;
                Test.instanceCount = i3;
                Test.iFld -= (int)l;
                if (false) break;
                for (i15 = 1; i15 < 1; ++i15) {
                    if (false) continue;
                    Test.instanceCount -= i16;
                    Test.iFld += Test.iFld;
                    Test.instanceCount *= l;
                    Test.iFld += (int)d1;
                    Test.iFld &= i3;
                    Test.instanceCount += (i15 * i15);
                }
            } while (++l < 5);
        }
        long meth_res = i2 + i3 + i4 + l + i15 + i16 + Double.doubleToLongBits(d1) +
            Double.doubleToLongBits(checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=10, i1=-9, i17=-14, i18=-22081, i19=-48658, i20=-124, i21=-10242, i22=-56, i23=70, i24=15088, iArr[]=new
            int[N];
        short s2=32408;
        double d2=-1.76990;
        boolean b1=true;
        byte by=95;

        init(iArr, 12);

        iArr = (iArr = (iArr = (iArr = iArr)));
        Test.iFld <<= (Test.iFld -= iArr[(Test.iFld >>> 1) % N]);
        for (i = 14; i < 295; ++i) {
            try {
                i1 = (28353 / i);
                Test.iFld = (iArr[i - 1] / -62267);
                i1 = (204 / Test.iFld);
            } catch (ArithmeticException a_e) {}
            i1 -= (int)(iMeth(Test.iFld) + Test.instanceCount);
            iArr[i] = -5;
            for (i17 = 5; i17 < 89; ++i17) {
                Test.fArrFld[i17] = Test.instanceCount;
                Test.instanceCount >>= i17;
                i18 *= s2;
                Test.iFld -= i;
                i1 = i;
            }
        }
        i1 += i17;
        for (i19 = 6; 395 > i19; i19++) {
            lArrFld[i19] = (long)Test.dFld;
        }
        for (d2 = 2; d2 < 370; ++d2) {
            Test.fFld = s2;
            i20 = i20;
            Test.instanceCount -= i1;
        }
        Test.instanceCount -= i19;
        for (i22 = 14; i22 < 317; ++i22) {
            i24 = 1;
            do {
                Test.fFld += i18;
                i1 >>= i;
                if (b1) break;
                Test.instanceCount = i17;
                i23 = by;
                Test.fFld = s2;
                Test.iFld = i24;
                Test.iFld /= (int)(i1 | 1);
            } while (++i24 < 83);
        }

        System.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        System.out.println("i18 s2 i19 = " + i18 + "," + s2 + "," + i19);
        System.out.println("i20 d2 i21 = " + i20 + "," + Double.doubleToLongBits(d2) + "," + i21);
        System.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        System.out.println("b1 by iArr = " + (b1 ? 1 : 0) + "," + by + "," + checkSum(iArr));

        System.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        System.out.println("Test.dFld Test.fArrFld lArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Double.doubleToLongBits(checkSum(Test.fArrFld)) + "," + checkSum(lArrFld));

        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}