import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 22:29:12 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=107L;
    public static volatile int iFld=-8;
    public long lFld=13L;
    public static volatile byte byFld=-21;
    public static boolean bFld=false;
    public static float fArrFld[]=new float[N];
    public static volatile int iArrFld[]=new int[N];

    static {
        init(Test.fArrFld, 90.263F);
        init(Test.iArrFld, 44029);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(long l1) {

        int i10=10789;

        i10 *= (int)Test.instanceCount;
        l1 = -14075;
        vMeth1_check_sum += l1 + i10;
    }

    public static float fMeth(double d1, byte by, long l) {

        int i9=2, i12=63504, i13=-62949, iArr1[]=new int[N];
        float f2=0.913F;
        short s=-9867, sArr[]=new short[N];

        init(iArr1, 50986);
        init(sArr, (short)-4317);

        i9 = 1;
        do {
            int i11=0;
            f2 += (i9 * i9);
            vMeth1(Test.instanceCount);
            i11 *= i9;
            try {
                i11 = (-216 / i9);
                i11 = (i9 / i11);
                iArr1[i9 + 1] = (-1323004922 / i11);
            } catch (ArithmeticException a_e) {}
        } while (++i9 < 226);
        d1 -= i9;
        i12 = 1;
        while ((i12 += 3) < 234) {
            iArr1[i12 - 1] = i9;
            switch ((i12 % 4) + 63) {
            case 63:
            case 64:
                i13 = 1;
                do {
                    f2 = f2;
                    switch ((i13 % 1) + 10) {
                    case 10:
                        if (false) continue;
                        sArr[i12 - 1] = (short)i9;
                        s += (short)(i13 * i13);
                    default:
                        iArr1[i13] *= -91;
                    }
                } while (++i13 < 20);
            case 65:
                Test.instanceCount = (long)f2;
            case 66:
                Test.iFld = (int)17008L;
                break;
            default:
                Test.iFld += (i12 | i13);
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + by + l + i9 + Float.floatToIntBits(f2) + i12 + i13 + s +
            checkSum(iArr1) + checkSum(sArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i2) {

        int i3=5351, i4=79, i5=-8, i6=-14, i7=28617, i8=36801, iArr[]=new int[N];
        double d=57.26152;
        float f=50.231F;
        byte by1=-40;
        boolean b=true;

        init(iArr, 10);

        i3 = 216;
        do {
            iArr[i3] >>= -14;
            Test.instanceCount *= (long)((d++) - Integer.reverseBytes(Integer.reverseBytes(i3)));
            for (i4 = 21; i4 > 1; i4 -= 3) {
                i5 += i4;
                i2 += (int)d;
            }
            i5 += (int)d;
        } while ((i3 -= 3) > 0);
        Test.instanceCount &= (long)((f++) - (i5 - (i2 - Test.instanceCount)));
        for (float f1 : Test.fArrFld) {
            for (i6 = 1; i6 < 4; i6++) {
                i8 = 2;
                while (--i8 > 0) {
                    Test.instanceCount += (((i8 * i4) + i8) - i6);
                    Test.instanceCount *= i6;
                    iArr[i8 - 1] = (int)((i2--) + fMeth(-114.7178, by1, Test.instanceCount));
                    if (b) continue;
                }
            }
        }
        vMeth_check_sum += i2 + i3 + Double.doubleToLongBits(d) + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 +
            by1 + (b ? 1 : 0) + checkSum(iArr);
    }

    public void mainTest(String[] strArr3) {

        int i=42031, i1=-1, i14=-231, i15=-20701, i16=74, i17=-3, i18=-190, i19=-2;
        double d2=-1.48991, d3=82.119659;
        boolean b1=false;
        float f3=-98.489F;
        short s1=-6115;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];

        init(byArr, (byte)-66);
        init(lArr, 2711281106836039529L);

        for (i = 4; i < 255; i++) {
            byArr[i + 1] -= (byte)(Test.instanceCount++);
            vMeth(i);
            for (i14 = i; i14 < 100; i14 += 3) {
                i1 += (((i14 * Test.iFld) + lFld) - Test.iFld);
                Test.iArrFld[i - 1] = i14;
                Test.iFld *= (int)d2;
                Test.iArrFld[i14 - 1] -= i15;
            }
        }
        Test.iFld %= (int)(Test.instanceCount | 1);
        i16 = 1;
        while (++i16 < 198) {
            switch ((i16 % 8) + 43) {
            case 43:
            case 44:
                d3 = 1;
                while (++d3 < 127) {
                    Test.iArrFld[(int)(d3)] -= (int)-8318648140418222238L;
                    Test.iFld *= i1;
                    for (i17 = (int)(d3); i17 < 1; ++i17) {
                        if (b1) break;
                        Test.iFld += (((i17 * lFld) + f3) - i15);
                        Test.iFld = s1;
                        Test.iFld = i18;
                        lFld >>= Test.byFld;
                        i19 += (-3 + (i17 * i17));
                        Test.instanceCount += i17;
                        i15 = (int)Test.instanceCount;
                        i18 = i19;
                    }
                    i19 -= (int)Test.instanceCount;
                    i1 += 63916;
                }
                f3 += (((i16 * i19) + Test.instanceCount) - i16);
                f3 += i16;
                f3 = lFld;
            case 45:
                lArr[i16 - 1] = Test.iFld;
            case 46:
                byArr[i16 + 1] &= (byte)lFld;
            case 47:
                if (b1) continue;
            case 48:
                if (Test.bFld) break;
            case 49:
                Test.instanceCount >>= lFld;
                break;
            case 50:
                b1 = b1;
            default:
                i1 = -8;
            }
        }

        System.out.println("i i1 i14 = " + i + "," + i1 + "," + i14);
        System.out.println("i15 d2 i16 = " + i15 + "," + Double.doubleToLongBits(d2) + "," + i16);
        System.out.println("d3 i17 i18 = " + Double.doubleToLongBits(d3) + "," + i17 + "," + i18);
        System.out.println("b1 f3 s1 = " + (b1 ? 1 : 0) + "," + Float.floatToIntBits(f3) + "," + s1);
        System.out.println("i19 byArr lArr = " + i19 + "," + checkSum(byArr) + "," +
            checkSum(lArr));

        System.out.println("Test.instanceCount Test.iFld lFld = " + Test.instanceCount + "," + Test.iFld + "," +
            lFld);
        System.out.println("Test.byFld Test.bFld Test.fArrFld = " + Test.byFld + "," + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(checkSum(Test.fArrFld)));
        System.out.println("Test.iArrFld = " + checkSum(Test.iArrFld));

        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        System.out.println("fMeth_check_sum: " + fMeth_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
                _instance.mainTest(strArr2);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
