import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Jan  6 01:52:37 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4233195867522294710L;
    public float fFld=-117.425F;
    public long lArrFld[]=new long[N];
    public int iArrFld[]=new int[N];

    public static long iMeth_check_sum = 0;
    public static long dMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(float f1, int i7, int i8) {

        int i9=11, i10=-7, i11=138, i12=-17587, i13=-3384;
        boolean b=true;
        short s1=19095;

        i7 >>>= -213;
        if (b) {
            for (i9 = 11; i9 < 198; i9++) {
                short s=23999;
                s = (short)i7;
                i8 += i9;
                Test.instanceCount -= i8;
                Test.instanceCount += (i9 * i9);
            }
            Test.instanceCount *= i9;
        } else {
            i7 = i9;
            for (i11 = 16; 311 > i11; i11 += 3) {
                i8 = i10;
                i13 = 1;
                while (++i13 < 16) {
                    i10 = s1;
                    Test.instanceCount -= i13;
                    i7 = (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += Float.floatToIntBits(f1) + i7 + i8 + i9 + i10 + (b ? 1 : 0) + i11 + i12 + i13 + s1;
    }

    public static double dMeth(double d, int i5, int i6) {

        float f2=0.501F;
        int i14=24493, i15=-89, i16=96, iArr[]=new int[N];

        init(iArr, -20);

        switch ((((iArr[(i6 >>> 1) % N]++) >>> 1) % 4) + 48) {
        case 48:
        case 49:
            vMeth(f2, -51051, i5);
            i14 = 1;
            while (++i14 < 126) {
                if (true) continue;
                iArr[i14] = 98;
                i6 = i6;
                if (true) {
                    for (i15 = 1; 12 > i15; ++i15) {
                        i5 = i5;
                        i6 = i5;
                        i5 = i6;
                        iArr = iArr;
                    }
                    Test.instanceCount = -33257;
                    i5 *= i16;
                    f2 = i16;
                } else {
                    Test.instanceCount >>= i15;
                }
            }
            break;
        case 50:
            Test.instanceCount += 64;
        case 51:
            iArr[(i6 >>> 1) % N] = i16;
        }
        long meth_res = Double.doubleToLongBits(d) + i5 + i6 + Float.floatToIntBits(f2) + i14 + i15 + i16 +
            checkSum(iArr);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static int iMeth(float f) {

        int i3=240, i4=-1, i17=13, i18=-35, iArr1[]=new int[N];
        double d1=2.42924;
        boolean b1=false;

        init(iArr1, 5);

        if (b1) {
            for (i3 = 18; i3 < 294; i3++) {
                dMeth(d1, i4, 9);
                i4 += (int)Test.instanceCount;
                i4 = 174;
                i4 = (int)Test.instanceCount;
                switch (((i3 % 3) * 5) + 37) {
                case 47:
                    for (i17 = 1; 6 > i17; i17++) {
                        b1 = b1;
                        iArr1[i3] >>= i17;
                        i4 += (i17 * i17);
                        Test.instanceCount = i4;
                        Test.instanceCount += i4;
                        d1 += i17;
                        f += i4;
                    }
                case 50:
                    Test.instanceCount >>>= i3;
                    break;
                case 46:
                    f = i18;
                    break;
                }
            }
        } else {
            i18 += i17;
        }
        long meth_res = Float.floatToIntBits(f) + i3 + i4 + Double.doubleToLongBits(d1) + i17 + i18 + (b1 ? 1 : 0) +
            checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-55148, i1=46281, i2=2, i19=-34498, i20=160, i21=11334, i22=-57083, i23=-10, i24=-11;
        byte by=61;
        double d2=-73.5310;
        short s2=29620;
        float fArr[][]=new float[N][N];

        init(fArr, -114.1013F);

        for (i = 19; i < 340; i++) {
            i2 = 1;
            do {
                by = (byte)(i - (-(-iMeth(fFld))));
            } while (++i2 < 78);
            i1 *= i;
            lArrFld[i + 1] = i1;
            for (i19 = 1; i19 < 78; i19++) {
                d2 += Test.instanceCount;
                fFld = i;
                Test.instanceCount >>= i19;
            }
            Test.instanceCount -= Test.instanceCount;
            i20 = (int)Test.instanceCount;
            i20 = (int)Test.instanceCount;
        }
        lArrFld[(-8 >>> 1) % N] = i1;
        i1 += (int)Test.instanceCount;
        for (i21 = 11; i21 < 382; i21++) {
            i1 -= 112;
            iArrFld[i21] = i;
            Test.instanceCount *= -22528;
            iArrFld[i21] *= i22;
            switch (((i21 % 9) * 5) + 20) {
            case 30:
                i1 += (i21 + Test.instanceCount);
                i23 = 1;
                do {
                    i24 = 1;
                    while (--i24 > 0) {
                        i22 *= i1;
                        i1 = (int)Test.instanceCount;
                        i22 = (int)Test.instanceCount;
                        Test.instanceCount *= s2;
                        iArrFld[i24 + 1] = i24;
                        lArrFld[i24] <<= i1;
                        by = (byte)i22;
                    }
                } while (++i23 < 68);
                break;
            case 54:
                s2 += (short)(i21 * i21);
            case 62:
                i20 *= (int)Test.instanceCount;
                break;
            case 35:
                i22 >>= -12;
                break;
            case 65:
                iArrFld[i21 - 1] = (int)fFld;
            case 52:
                fArr[i21][i21 + 1] += i23;
                break;
            case 60:
                i22 *= i20;
                break;
            case 57:
                i22 += (i21 + i22);
                break;
            case 23:
                iArrFld[i21 + 1] += 113;
                break;
            }
        }

        System.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
        System.out.println("by i19 i20 = " + by + "," + i19 + "," + i20);
        System.out.println("d2 i21 i22 = " + Double.doubleToLongBits(d2) + "," + i21 + "," + i22);
        System.out.println("i23 i24 s2 = " + i23 + "," + i24 + "," + s2);
        System.out.println("fArr = " + Double.doubleToLongBits(checkSum(fArr)));

        System.out.println("Test.instanceCount fFld lArrFld = " + Test.instanceCount + "," +
            Float.floatToIntBits(fFld) + "," + checkSum(lArrFld));
        System.out.println("iArrFld = " + checkSum(iArrFld));

        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
        System.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
//DEBUG  dMeth ->  dMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth dMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
