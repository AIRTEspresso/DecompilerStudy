import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:25:51 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=2L;
    public static float fFld=41.231F;
    public boolean bFld=false;
    public static volatile float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        init(Test.fArrFld, -89.767F);
        init(Test.iArrFld, 5);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i3, double d, int i4) {

        int i5=54375, i6=-243, i7=-13237, iArr1[]=new int[N];
        short s=-26495;
        byte by=125;
        boolean b1=true, bArr[]=new boolean[N];
        long l=-14L;
        double dArr[]=new double[N];

        init(dArr, 53.80351);
        init(iArr1, -27090);
        init(bArr, true);

        i4 *= -168;
        Test.fArrFld = Test.fArrFld;
        for (i5 = 279; i5 > 4; i5 -= 3) {
            s = (short)i4;
            i3 <<= i4;
            dArr = dArr;
            i6 = (int)1.108F;
            by = (byte)Test.instanceCount;
            iArr1[i5 + 1] = i5;
            i3 += (12 + (i5 * i5));
            i3 += i3;
            bArr[i5] = b1;
            for (l = i5; 17 > l; ++l) {
                if (true) continue;
                iArr1[(int)(l + 1)] -= (int)l;
            }
        }
        vMeth1_check_sum += i3 + Double.doubleToLongBits(d) + i4 + i5 + i6 + s + by + (b1 ? 1 : 0) + l + i7 +
            Double.doubleToLongBits(checkSum(dArr)) + checkSum(iArr1) +
            checkSum(bArr);
    }

    public static int iMeth(boolean b, int i1, int i2) {

        double d1=1.47841;
        int i8=5, i9=41703, i10=-11, i11=21961, i12=30387, i13=-156;
        float f=-32.176F;
        short s1=28768;

        vMeth1(i1, 30.49577, i1);
        Test.instanceCount = i1;
        i1 = (int)Test.instanceCount;
        Test.iArrFld[(i1 >>> 1) % N] *= (int)d1;
        for (i8 = 9; i8 < 293; ++i8) {
            i2 -= (int)f;
            if (b) {
                for (i10 = 6; i10 > 1; i10 -= 2) {
                    if (b) continue;
                    for (i12 = i8; i12 < 3; ++i12) {
                        i9 += i11;
                        d1 -= Test.instanceCount;
                        i13 *= (int)Test.instanceCount;
                        d1 = s1;
                        i9 += (i12 * i1);
                    }
                }
            } else if (b) {
                Test.instanceCount += i8;
            }
        }
        long meth_res = (b ? 1 : 0) + i1 + i2 + Double.doubleToLongBits(d1) + i8 + i9 + Float.floatToIntBits(f) + i10 +
            i11 + i12 + i13 + s1;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=188, i14=0, i15=13, i16=7, i17=-252, i18=197, i19=56914, iArr[]=new int[N];
        boolean b2=true;
        byte by1=72;

        init(iArr, 1);

        iArr[(-53 >>> 1) % N] -= (int)((Test.instanceCount * i) - ((Test.instanceCount = i) >>> (i / 232)));
        i <<= (int)Math.max(Test.instanceCount, -6 - iMeth(b2, i, 14));
        for (i14 = 11; 196 > i14; i14 += 3) {
            Test.iArrFld[i14] -= i15;
            for (i16 = 1; i16 < 25; ++i16) {
                for (i18 = 1; i18 < 2; ++i18) {
                    i19 += (((i18 * i19) + i18) - i18);
                    i19 += (((i18 * i) + Test.fFld) - i16);
                    i += i18;
                    i += (i18 | i19);
                    switch (((i >>> 1) % 4) + 32) {
                    case 32:
                        i19 = i16;
                        i15 += (int)Test.fFld;
                        by1 *= (byte)i;
                        i15 += (int)Test.instanceCount;
                    case 33:
                    case 34:
                        i17 += (53 + (i18 * i18));
                        break;
                    case 35:
                        if (true) break;
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += i + (b2 ? 1 : 0) + i14 + i15 + i16 + i17 + i18 + i19 + by1 + checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i20=3, i21=-46764, i22=0, i23=-3, i24=-47564, i25=3, i26=60720, i27=-2261, i28=-194, i29=-99, iArr2[][]=new
            int[N][N];
        byte by2=-105;

        init(iArr2, -31998);

        vMeth();
        i20 = 1;
        do {
            Test.fFld -= Test.instanceCount;
            iArr2 = iArr2;
            Test.instanceCount += (i20 - i20);
            Test.fFld += (25055 + (i20 * i20));
        } while (++i20 < 154);
        i21 += (int)125.389F;
        i21 |= -30129;
        i22 = 1;
        do {
            i21 = i21;
            if (bFld) {
                by2 += (byte)(i22 ^ i21);
                Test.instanceCount <<= i22;
                for (i23 = 1; i23 < 72; i23++) {
                    i21 = (int)Test.fFld;
                }
            }
            Test.instanceCount += (((i22 * by2) + i23) - i23);
            i24 <<= i22;
            i21 += (int)Test.fFld;
            for (i25 = 2; i25 < 72; i25++) {
                i21 += (-58865 + (i25 * i25));
                for (i27 = 1; i27 < 2; ++i27) {
                    i24 *= i29;
                    i29 = i29;
                    i24 >>>= -3;
                    i26 += 5;
                    Test.instanceCount = Test.instanceCount;
                    Test.instanceCount += (154 + (i27 * i27));
                    i29 = i21;
                    Test.instanceCount >>= Test.instanceCount;
                    i29 += (((i27 * i22) + Test.instanceCount) - Test.fFld);
                }
            }
        } while (++i22 < 352);

        System.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        System.out.println("by2 i23 i24 = " + by2 + "," + i23 + "," + i24);
        System.out.println("i25 i26 i27 = " + i25 + "," + i26 + "," + i27);
        System.out.println("i28 i29 iArr2 = " + i28 + "," + i29 + "," + checkSum(iArr2));

        System.out.println("Test.instanceCount Test.fFld bFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(Test.fFld) + "," + (bFld ? 1 : 0));
        System.out.println("Test.fArrFld Test.iArrFld = " +
            Double.doubleToLongBits(checkSum(Test.fArrFld)) + "," + checkSum(Test.iArrFld));

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
