import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:05:45 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=227L;
    public static int iFld=-5;
    public static volatile double dArrFld[]=new double[N];
    public static int iArrFld[]=new int[N];

    static {
        init(Test.dArrFld, -35.38200);
        init(Test.iArrFld, 13);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        int i3=167, i4=-56, i5=117, i6=-13, iArr1[]=new int[N];
        float f1=0.605F;
        double d=-118.46446;
        boolean b=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];

        init(lArr, 30838L);
        init(bArr, false);
        init(iArr1, -36499);

        lArr[(-29475 >>> 1) % N] /= (Test.instanceCount | 1);
        i2 = i2;
        if (b) {
            for (i3 = 11; i3 < 378; ++i3) {
                f1 += i2;
                bArr = bArr;
                for (i5 = 1; i5 < 5; ++i5) {
                    switch (((i3 % 5) * 5) + 90) {
                    case 92:
                        try {
                            i4 = (i3 / 212);
                            iArr1[i3] = (i5 % -105);
                            i4 = (i4 % -167);
                        } catch (ArithmeticException a_e) {}
                        d = Test.instanceCount;
                    case 94:
                        i2 += (i5 | (long)f1);
                        Test.instanceCount += (long)f1;
                        i4 = 99;
                        break;
                    case 106:
                        i2 ^= (int)-41834L;
                        break;
                    case 95:
                        iArr1[i3 + 1] = i3;
                        break;
                    case 98:
                        i6 += i6;
                        break;
                    }
                }
            }
        } else {
            iArr1[(215 >>> 1) % N] += i3;
        }
        vMeth2_check_sum += i2 + i3 + i4 + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(d) + (b ? 1 :
            0) + checkSum(lArr) + checkSum(bArr) + checkSum(iArr1);
    }

    public static void vMeth1(int i, int i1) {

        float f=-36.656F, f2=101.41F;
        int i7=-101, i8=-192, i9=-13, i10=14, iArr[][][]=new int[N][N][N];
        double d1=96.125212;

        init(iArr, 101);

        i1 = i1;
        f += (++i1);
        iArr[(i >>> 1) % N][(i >>> 1) % N][(i1 >>> 1) % N] += i;
        vMeth2(i);
        i7 = 1;
        do {
            for (i8 = 4; i8 > 1; i8--) {
                d1 = d1;
                for (f2 = 1; f2 < 2; f2++) {
                    if (false) break;
                    i9 = i1;
                    i1 += 144;
                    i10 -= (int)f;
                    iArr[(int)(f2 - 1)][(int)(f2)][i8] = i10;
                    i1 <<= -29190;
                    Test.dArrFld = Test.dArrFld;
                }
            }
        } while (++i7 < 390);
        vMeth1_check_sum += i + i1 + Float.floatToIntBits(f) + i7 + i8 + i9 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f2) + i10 + checkSum(iArr);
    }

    public static void vMeth(byte by) {

        int i11=94, i12=-189, i13=-2, i14=180, i15=-54063, i16=129, i17=11797, iArr2[]=new int[N];
        boolean b1=false;
        double d2=-1.43336;
        short s=-12824;

        init(iArr2, -22459);

        vMeth1(i11, i11);
        for (i12 = 2; 209 > i12; ++i12) {
            if (b1) break;
            Test.instanceCount += Test.instanceCount;
        }
        d2 = s;
        for (i14 = 6; 330 > i14; i14++) {
            i11 *= i13;
            for (i16 = 1; 5 > i16; ++i16) {
                i17 += (i16 - i13);
                iArr2[i14] |= i14;
                try {
                    i15 = (i14 % 240);
                    i15 = (Test.iFld % -255);
                    iArr2[i16 + 1] = (i17 % 204);
                } catch (ArithmeticException a_e) {}
                Test.instanceCount <<= by;
                Test.instanceCount -= -224;
                Test.iFld |= i15;
                Test.iFld *= s;
            }
        }
        vMeth_check_sum += by + i11 + i12 + i13 + (b1 ? 1 : 0) + Double.doubleToLongBits(d2) + s + i14 + i15 + i16 +
            i17 + checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        byte by1=-26, byArr[]=new byte[N];
        int i19=7, i20=35, i21=12, i22=9, i23=-48, i24=43;
        double d3=-20.108593;
        float f3=-35.744F;
        boolean bArr1[]=new boolean[N];

        init(bArr1, true);
        init(byArr, (byte)-126);

        vMeth(by1);
        for (int i18 : Test.iArrFld) {
            Test.instanceCount = i18;
            Test.iArrFld[(i19 >>> 1) % N] -= Test.iFld;
            Test.iFld -= (int)d3;
            f3 -= i18;
            switch ((((i19 >>> 1) % 2) * 5) + 30) {
            case 32:
                i20 = 1;
                do {
                    Test.instanceCount = i20;
                    Test.dArrFld[i20 + 1] *= i20;
                    i18 /= (int)(Test.iFld | 1);
                    i19 = (int)Test.instanceCount;
                    f3 = -57071;
                    Test.iFld += (int)1.28266;
                    for (i21 = 1; i21 > i20; i21--) {
                        boolean b2=false;
                        try {
                            i18 = (54627 / i22);
                            Test.iFld = (Test.iArrFld[i21 + 1] % Test.iFld);
                            Test.iArrFld[i21 + 1] = (143 / i21);
                        } catch (ArithmeticException a_e) {}
                        bArr1[i20 + 1] = b2;
                    }
                    i22 >>>= i21;
                    f3 -= 6;
                } while (++i20 < 63);
                Test.instanceCount -= Test.instanceCount;
                f3 = i19;
                for (i23 = 3; i23 < 63; i23 += 3) {
                    short s1=31371;
                    Test.iArrFld[i23 + 1] -= i20;
                    i19 ^= i22;
                    switch ((i23 % 3) + 33) {
                    case 33:
                        i18 = i24;
                        break;
                    case 34:
                        Test.instanceCount = i21;
                        byArr[i23] >>>= (byte)i19;
                        i22 *= -55945;
                        i19 -= (int)d3;
                    case 35:
                        Test.iArrFld[i23 - 1] >>>= s1;
                        break;
                    default:
                        i24 += i23;
                    }
                }
                break;
            case 40:
                i24 -= (int)-111.852F;
            default:
                d3 = i23;
            }
        }

        System.out.println("by1 i19 d3 = " + by1 + "," + i19 + "," + Double.doubleToLongBits(d3));
        System.out.println("f3 i20 i21 = " + Float.floatToIntBits(f3) + "," + i20 + "," + i21);
        System.out.println("i22 i23 i24 = " + i22 + "," + i23 + "," + i24);
        System.out.println("bArr1 byArr = " + checkSum(bArr1) + "," + checkSum(byArr));

        System.out.println("Test.instanceCount Test.iFld Test.dArrFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Double.doubleToLongBits(checkSum(Test.dArrFld)));
        System.out.println("Test.iArrFld = " + checkSum(Test.iArrFld));

        System.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}