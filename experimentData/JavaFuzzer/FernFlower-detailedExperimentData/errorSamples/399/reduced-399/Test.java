import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:51:24 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=1821961752287876664L;
    public static double dFld=2.38430;
    public int iFld=-3;
    public static float fFld=78.6F;
    public static boolean bFld=false;
    public volatile byte byFld=18;
    public short sFld=-15127;
    public static int iArrFld[]=new int[N];

    static {
        init(Test.iArrFld, 2);
    }

    public static long vMeth_check_sum = 0;
    public static long byMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2, long l, double d) {

        int i3=23554, i4=1600, i5=34837, i6=-61675;
        float f=72.648F;
        short s1=484;

        i2 -= i2;
        for (i3 = 143; i3 > 1; i3--) {
            i5 = 1;
            do {
                for (f = 1; f < 1; f++) {
                    byte by=9;
                    by = (byte)i2;
                    by = (byte)-23792;
                    i2 -= i5;
                    d += l;
                    i6 += (int)(((f * i6) + s1) - i5);
                    i2 += (int)Test.instanceCount;
                    l += i5;
                }
                i2 >>= s1;
                i6 *= (int)-33.9548;
                i2 += i4;
                i2 = i2;
            } while (++i5 < 11);
        }
        long meth_res = i2 + l + Double.doubleToLongBits(d) + i3 + i4 + i5 + Float.floatToIntBits(f) + i6 + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static byte byMeth() {

        int i=-232, i1=-8, i7=-2, i8=22431, i9=64728, i10=-49849, i11=21102, i12=84, i13=-185, i14=0, iArr[]=new int[N];
        short s=-11995;
        byte by1=-31;
        float f1=0.394F, fArr[]=new float[N];
        long lArr[]=new long[N];

        init(fArr, 0.383F);
        init(lArr, -3089688151L);
        init(iArr, 55956);

        for (i = 342; i > 16; i--) {
            fArr[i] -= (((-(i1 - s)) + (103.596F + iMeth(i1, Test.instanceCount, Test.dFld))) - 43490);
            switch ((i % 10) + 57) {
            case 57:
                i7 = 1;
                while (++i7 < 5) {
                    lArr[i7 + 1] &= i;
                }
                for (i8 = 1; i8 < 5; ++i8) {
                    for (i10 = 1; i10 < 2; i10++) {
                        i9 += (i10 * i1);
                        i9 += (int)Test.dFld;
                        i12 = by1;
                    }
                    Test.instanceCount -= i1;
                    for (i13 = 1; i13 < 2; ++i13) {
                        i9 >>= i10;
                        if (true) break;
                    }
                    if (i7 != 0) {
                    }
                }
                break;
            case 58:
                lArr[i] >>= i8;
                break;
            case 59:
                lArr[i] -= -6L;
                break;
            case 60:
                i1 = -48502;
                break;
            case 61:
                f1 -= i;
            case 62:
                fArr[i + 1] += Test.instanceCount;
                break;
            case 63:
                f1 += Test.instanceCount;
                break;
            case 64:
                i14 = i12;
                break;
            case 65:
                f1 = by1;
                break;
            case 66:
                i9 = 14;
                break;
            default:
                try {
                    i9 = (iArr[i - 1] / 788266506);
                    i14 = (-134 / i7);
                    i12 = (i14 % -21855);
                } catch (ArithmeticException a_e) {}
            }
        }
        long meth_res = i + i1 + s + i7 + i8 + i9 + i10 + i11 + i12 + by1 + i13 + i14 + Float.floatToIntBits(f1) +
            Double.doubleToLongBits(checkSum(fArr)) + checkSum(lArr) +
            checkSum(iArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void vMeth() {

        float f2=0.313F;
        int i15=6088, i16=62254, iArr1[]=new int[N];
        long lArr1[]=new long[N];

        init(lArr1, -50898L);
        init(iArr1, 9);

        byMeth();
        for (long l1 : lArr1) {
            iFld = iFld;
            f2 -= Test.instanceCount;
            Test.instanceCount = (long)2.22F;
            iFld = iFld;
            iArr1[(iFld >>> 1) % N] >>>= iFld;
            for (i15 = 1; i15 < 4; ++i15) {
                iFld += (i15 ^ i16);
                Test.instanceCount = Test.instanceCount;
                iFld += i15;
                Test.instanceCount = i16;
                iFld = iFld;
                f2 -= i15;
                i16 += i15;
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f2) + i15 + i16 + checkSum(lArr1) +
            checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i17=-63964, i18=60528, i19=-2, i20=-3, i21=-56824, i22=-7, i23=-243;
        long lArr2[]=new long[N];

        init(lArr2, 221L);

        vMeth();
        for (i17 = 377; i17 > 9; i17--) {
            Test.instanceCount <<= iFld;
        }
        iFld -= i18;
        Test.fFld += (float)Test.dFld;
        iFld = iFld;
        lArr2 = lArr2;
        for (i19 = 9; i19 < 190; i19++) {
            for (i21 = 139; i21 > 3; --i21) {
                Test.iArrFld = int1array(N, (int)-86);
                Test.instanceCount = i17;
                switch ((i19 % 1) + 75) {
                case 75:
                    if (Test.bFld) continue;
                    iFld += i21;
                    Test.instanceCount *= Test.instanceCount;
                    if (Test.bFld) {
                        Test.dFld = Test.fFld;
                        Test.iArrFld[i19] = (int)Test.instanceCount;
                        i20 += i18;
                    } else {
                        i20 = 201;
                        i20 = i17;
                        i18 += (((i21 * Test.fFld) + byFld) - iFld);
                    }
                    break;
                default:
                    Test.fFld -= i22;
                    i23 = 2;
                    while ((i23 -= 2) > 0) {
                        Test.instanceCount -= -1;
                        sFld += (short)(i23 | Test.instanceCount);
                        Test.instanceCount += 125;
                        i20 += (((i23 * iFld) + i17) - Test.fFld);
                        Test.iArrFld[i21 + 1] &= i22;
                        i20 = sFld;
                    }
                }
            }
        }

        System.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        System.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        System.out.println("i23 lArr2 = " + i23 + "," + checkSum(lArr2));

        System.out.println("Test.instanceCount Test.dFld iFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + iFld);
        System.out.println("Test.fFld Test.bFld byFld = " + Float.floatToIntBits(Test.fFld) + "," + (Test.bFld ? 1
            : 0) + "," + byFld);
        System.out.println("sFld Test.iArrFld = " + sFld + "," + checkSum(Test.iArrFld));

        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
        System.out.println("byMeth_check_sum: " + byMeth_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  byMeth ->  byMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth byMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}