import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:41:04 2022
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=11L;
    public int iFld=-78;
    public static boolean bFld=true;
    public float fFld=-102.9F;
    public static byte byFld=-36;
    public static long lArrFld[]=new long[N];

    static {
        init(Test.lArrFld, 40180L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i2) {

        long l=-3757823783L, l1=0L;
        int i3=-2, i4=243, i5=11, iArr[]=new int[N];
        boolean b=false;
        float fArr[][][]=new float[N][N][N];

        init(fArr, -98.445F);
        init(iArr, 58801);

        l = 1;
        while ((l += 3) < 282) {
            Test.instanceCount = 208L;
            fArr[(int)(l - 1)][(91 >>> 1) % N] = fArr[(int)(l + 1)][(int)(l)];
            iArr[(int)(l)] *= -2;
            i2 += (int)l;
            for (i3 = (int)(l); i3 < 16; ++i3) {
                for (l1 = 1; l1 < 1; ++l1) {
                    b = b;
                    i5 += (int)(l1 * l1);
                    Test.instanceCount += i4;
                    b = b;
                    i5 += (int)(((l1 * i5) + i5) - i4);
                    i4 <<= i2;
                    i4 += i2;
                }
                i2 >>= (int)l1;
            }
        }
        vMeth2_check_sum += i2 + l + i3 + i4 + l1 + i5 + (b ? 1 : 0) +
            Double.doubleToLongBits(checkSum(fArr)) + checkSum(iArr);
    }

    public void vMeth1() {

        int i6=5, i7=29887, i8=-75, i9=-240, iArr1[]=new int[N];
        double d=50.27480;
        float f=101.493F;
        boolean b1=false;
        short sArr[]=new short[N];

        init(sArr, (short)-8240);
        init(iArr1, -15756);

        vMeth2(iFld);
        sArr[(iFld >>> 1) % N] -= (short)51.99484;
        iArr1[(iFld >>> 1) % N] *= iFld;
        iFld = -14;
        for (i6 = 2; i6 < 293; i6++) {
            for (i8 = 1; i8 < 6; ++i8) {
                i9 += (5 + (i8 * i8));
                iFld *= i9;
                iArr1[i6] = (int)d;
                iFld *= i7;
                iFld += (((i8 * f) + i8) - f);
                f += (i8 + i8);
                if (b1) break;
                d += i6;
                b1 = b1;
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + Float.floatToIntBits(f) + (b1 ? 1 : 0) +
            checkSum(sArr) + checkSum(iArr1);
    }

    public void vMeth() {

        int i=0, i1=5, i10=37, i11=1;
        float f1=-2.1016F;
        double d1=-1.114359;
        byte byArr[]=new byte[N];

        init(byArr, (byte)-89);

        i = 1;
        while (++i < 184) {
            i1 = 1;
            while (++i1 < 9) {
                vMeth1();
                Test.instanceCount = i1;
                iFld = iFld;
                iFld <<= (int)Test.instanceCount;
                for (i10 = 1; i10 > 1; --i10) {
                    if (Test.bFld) {
                        Test.instanceCount += (-37514 + (i10 * i10));
                        byArr[i1 - 1] &= (byte)Test.instanceCount;
                        if (iFld != 0) {
                            vMeth_check_sum += i + i1 + i10 + i11 + Float.floatToIntBits(f1) +
                                Double.doubleToLongBits(d1) + checkSum(byArr);
                            return;
                        }
                        switch ((((iFld >>> 1) % 2) * 5) + 30) {
                        case 35:
                            i11 += (i10 * i10);
                            iFld = 11542;
                            f1 = -11140;
                            break;
                        case 40:
                            d1 += iFld;
                        }
                    } else if (Test.bFld) {
                        i11 <<= (int)Test.instanceCount;
                    }
                }
            }
        }
        vMeth_check_sum += i + i1 + i10 + i11 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) +
            checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        int i12=208, i13=-31436, i14=3, i15=-59648, i16=-99, i17=208, i18=7361, i19=23219, i20=12;
        long l2=774514488L;
        short s1=23386;

        iFld = (iFld++);
        vMeth();
        iFld += iFld;
        for (i12 = 137; i12 > 5; i12--) {
            for (i14 = 9; i14 < 190; i14++) {
                for (i16 = i12; i16 < 2; i16++) {
                    short s=9464;
                    i13 += i16;
                    Test.lArrFld[i14 - 1] += (long)fFld;
                    i13 -= i16;
                    s += (short)(i16 * i16);
                    try {
                        i13 = (i13 / -31031);
                        i13 = (-1896834471 / i17);
                        i13 = (i12 % i13);
                    } catch (ArithmeticException a_e) {}
                    i17 -= Test.byFld;
                    switch (((i13 >>> 1) % 4) + 87) {
                    case 87:
                        i15 >>= (int)Test.instanceCount;
                        break;
                    case 88:
                        i13 = (int)156L;
                        break;
                    case 89:
                    case 90:
                        i17 += i16;
                        i13 >>= s;
                        i15 += (i16 ^ iFld);
                    default:
                        Test.byFld += (byte)i15;
                        Test.lArrFld[i16 - 1] = i15;
                    }
                    Test.instanceCount *= s;
                }
            }
            for (l2 = 190; l2 > 1; l2--) {
                for (i19 = 1; i19 < 2; i19++) {
                    i15 += (i19 ^ i19);
                    Test.instanceCount = i15;
                    Test.instanceCount += (i19 * i19);
                }
                i20 += (-57360 + (l2 * l2));
                i13 += (int)(((l2 * iFld) + i20) - Test.instanceCount);
                s1 += (short)(l2 + i15);
                fFld += 46220;
            }
        }

        System.out.println("i12 i13 i14 = " + i12 + "," + i13 + "," + i14);
        System.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        System.out.println("l2 i18 i19 = " + l2 + "," + i18 + "," + i19);
        System.out.println("i20 s1 = " + i20 + "," + s1);

        System.out.println("Test.instanceCount iFld Test.bFld = " + Test.instanceCount + "," + iFld + "," +
            (Test.bFld ? 1 : 0));
        System.out.println("fFld Test.byFld Test.lArrFld = " + Float.floatToIntBits(fFld) + "," + Test.byFld + ","
            + checkSum(Test.lArrFld));

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
