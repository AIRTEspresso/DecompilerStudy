import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:09:04 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=252L;
    public static short sFld=15107;
    public int iFld=194;
    public static float fFld=103.505F;
    public static boolean bFld=false;
    public static volatile long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        init(Test.lArrFld, -36L);
        init(Test.iArrFld, 16937);
        init(Test.bArrFld, true);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(int i3) {

        int i4=-27109, i5=45689, i6=-37857, i7=36196, i8=-5957, i9=-181, i10=213;
        boolean b1=true;
        double dArr[]=new double[N];

        init(dArr, 0.88260);

        Test.iArrFld[(i3 >>> 1) % N] -= (int)Test.instanceCount;
        for (i4 = 138; 1 < i4; --i4) {
            i5 = i4;
            i3 <<= Test.sFld;
        }
        for (i6 = 127; i6 > 2; --i6) {
            Test.iArrFld[i6 - 1] -= -213;
            i8 = 1;
            do {
                i3 += i4;
                for (i9 = 1; i9 < 1; i9++) {
                    if (b1) {
                        i5 += (-4 + (i9 * i9));
                        dArr[i8 - 1] += 5;
                    } else if (b1) {
                        Test.sFld += (short)(((i9 * i7) + i9) - Test.instanceCount);
                        Test.fFld -= i3;
                        if (i5 != 0) {
                        }
                    } else {
                        Test.lArrFld[i8 + 1] += i9;
                    }
                }
            } while (++i8 < 13);
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(checkSum(dArr));
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i1) {

        int i2=-6, i11=-35524, i12=8, i13=-250, i14=8, i15=57115;
        byte by=20;
        double d=-117.77503;
        float fArr[]=new float[N];

        init(fArr, 97.215F);

        i2 = 1;
        do {
            i1 *= i1;
            fMeth(i2);
        } while (++i2 < 235);
        Test.instanceCount = i1;
        Test.bFld = Test.bFld;
        i11 = 1;
        while (++i11 < 158) {
            i1 += i1;
            switch (((i1 >>> 1) % 8) + 16) {
            case 16:
                Test.fFld += (i11 + i2);
                break;
            case 17:
                Test.instanceCount <<= by;
                for (i12 = i11; i12 < 10; i12++) {
                    for (i14 = 1; i14 < 1; ++i14) {
                        by += (byte)(i14 | Test.instanceCount);
                        d = Test.instanceCount;
                    }
                    try {
                        i13 = (-155 % i1);
                        i13 = (591746516 / i11);
                        i1 = (-69 / i2);
                    } catch (ArithmeticException a_e) {}
                }
                break;
            case 18:
                Test.bArrFld = Test.bArrFld;
                break;
            case 19:
                i15 += (i11 - i11);
                break;
            case 20:
                Test.sFld = (short)Test.instanceCount;
                break;
            case 21:
                Test.iArrFld[i11 + 1] *= 4;
                break;
            case 22:
                fArr[i11 - 1] += Test.instanceCount;
                break;
            case 23:
                i1 += (i11 * i11);
            default:
                Test.sFld >>= (short)7318;
            }
        }
        vMeth_check_sum += i1 + i2 + i11 + by + i12 + i13 + i14 + i15 + Double.doubleToLongBits(d) +
            Double.doubleToLongBits(checkSum(fArr));
    }

    public static void vSmallMeth(long l, int i) {


        l *= Test.iArrFld[(i >>> 1) % N];
        vMeth(i);
        vSmallMeth_check_sum += l + i;
    }

    public void mainTest(String[] strArr1) {

        boolean b=false;
        int i16=9, i17=10, i18=183, i19=4, i20=-43618, i21=13, i22=9, i23=-31904, i24=1, i25=9;
        double d1=0.121613;
        byte by1=-23;
        float fArr1[][]=new float[N][N];

        init(fArr1, 75.346F);

        b = (b = true);
        Test.sFld = (short)Long.reverseBytes(--Test.lArrFld[(iFld >>> 1) % N]);
        for (int smallinvoc=0; smallinvoc<155; smallinvoc++) vSmallMeth(Test.instanceCount, iFld);
        Test.instanceCount = iFld;
        iFld = iFld;
        iFld >>>= iFld;
        for (i16 = 1; i16 < 326; ++i16) {
            if (b) {
                iFld -= i16;
                Test.instanceCount <<= -6;
                Test.fFld = i17;
                if (true) {
                    iFld -= Test.sFld;
                    for (i18 = i16; i18 < 77; i18++) {
                        i17 = (int)d1;
                        for (i20 = 1; i20 < 1; ++i20) {
                            d1 *= i18;
                        }
                        for (i22 = i18; 1 > i22; i22++) {
                            Test.iArrFld[i16 + 1] <<= i23;
                            Test.fFld += by1;
                            Test.sFld += (short)i21;
                        }
                        i23 >>>= iFld;
                        fArr1[i18][i18] *= i17;
                        i23 += i17;
                        for (i24 = i18; i24 < 1; i24++) {
                            Test.instanceCount += Test.instanceCount;
                            Test.instanceCount += (i24 ^ Test.sFld);
                            Test.fFld += 65459;
                            i17 = (int)Test.fFld;
                            Test.lArrFld[i18 - 1] += by1;
                        }
                    }
                } else {
                    i21 *= i24;
                }
            } else if (Test.bFld) {
                Test.fFld = i22;
            } else if (Test.bFld) {
                i25 *= by1;
            }
        }

        System.out.println("b i16 i17 = " + (b ? 1 : 0) + "," + i16 + "," + i17);
        System.out.println("i18 i19 d1 = " + i18 + "," + i19 + "," + Double.doubleToLongBits(d1));
        System.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        System.out.println("i23 by1 i24 = " + i23 + "," + by1 + "," + i24);
        System.out.println("i25 fArr1 = " + i25 + "," + Double.doubleToLongBits(checkSum(fArr1)));

        System.out.println("Test.instanceCount Test.sFld iFld = " + Test.instanceCount + "," + Test.sFld + "," +
            iFld);
        System.out.println("Test.fFld Test.bFld Test.lArrFld = " + Float.floatToIntBits(Test.fFld) + "," +
            (Test.bFld ? 1 : 0) + "," + checkSum(Test.lArrFld));
        System.out.println("Test.iArrFld Test.bArrFld = " + checkSum(Test.iArrFld) + "," +
            checkSum(Test.bArrFld));

        System.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
