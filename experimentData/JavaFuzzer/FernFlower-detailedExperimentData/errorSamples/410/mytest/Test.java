import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 23:52:38 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=-3L;
    public int iFld=11619;
    public static float fFld=0.731F;
    public static long lFld=-3986424624L;
    public static boolean bFld=true;
    public static short sFld=6863;
    public static volatile float fArrFld[]=new float[N];

    static {
        init(Test.fArrFld, -1.903F);
    }

    public static long byMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(long l1, int i4) {

        int i5=2915, i6=90, i7=32, i8=3, i9=-215, i10=-8100, i11=204;
        double d=2.5845;

        l1 -= i4;
        i4 -= i4;
        i4 <<= i4;
        for (i5 = 16; i5 < 394; i5++) {
            for (i7 = 4; 1 < i7; --i7) {
                i6 %= (int)(Test.instanceCount | 1);
                i4 *= i8;
            }
            l1 /= (Test.instanceCount | 1);
            i9 = 1;
            do {
                i8 += i5;
                for (d = i9; d < 1; ++d) {
                    if (false) break;
                }
            } while (++i9 < 4);
            i11 = 4;
            do {
                i10 += (((i11 * l1) + Test.instanceCount) - Test.instanceCount);
                Test.instanceCount += l1;
            } while (--i11 > 0);
        }
        long meth_res = l1 + i4 + i5 + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth(long l) {

        int i2=-70, i3=214, i12=7, iArr[]=new int[N];
        long l2=-2596391739L;
        byte by=64;
        float fArr[]=new float[N];

        init(iArr, -239);
        init(fArr, -73.152F);

        for (int i1 : iArr) {
            for (i2 = 1; i2 < 4; ++i2) {
                fArr[i2] += Math.min(i1--, i2);
                i3 -= (int)((Test.fFld--) * (iArr[i2 + 1]--));
                l = Math.abs(iMeth(Test.lFld, -143));
                for (l2 = i2; l2 < 2; l2++) {
                    i3 *= (int)Test.fFld;
                    i1 = i3;
                    Test.fFld -= -4;
                    i1 += (int)Test.fFld;
                    by += (byte)(75 + (l2 * l2));
                    i1 += i3;
                    Test.lFld += l2;
                    if (Test.bFld) continue;
                    Test.sFld -= (short)Test.fFld;
                }
            }
        }
        long meth_res = l + i2 + i3 + l2 + i12 + by + checkSum(iArr) +
            Double.doubleToLongBits(checkSum(fArr));
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static byte byMeth() {

        float f=1.286F;
        int i=-46827, i13=-179, i14=24472, iArr1[][][]=new int[N][N][N], iArr2[]=new int[N];
        double dArr[][][]=new double[N][N][N];
        boolean bArr[]=new boolean[N];

        init(iArr1, 93);
        init(iArr2, -3);
        init(dArr, 53.98265);
        init(bArr, true);

        f *= Long.reverseBytes(-(i - i));
        i -= (int)(33494 * lMeth(Test.instanceCount));
        i += i;
        switch (((i >>> 1) % 1) + 75) {
        case 75:
            if (Test.bFld) {
                i13 = 1;
                do {
                    byte by1=-32;
                    if (Test.bFld) continue;
                    iArr1[i13 - 1][i13 + 1][i13] = -63143;
                    Test.fArrFld[i13 - 1] = i13;
                    try {
                        i = (i14 / 202);
                        iArr2[i13 + 1] = (i13 / iArr2[i13 - 1]);
                        i14 = (iArr1[i13][(i >>> 1) % N][i13] % 33);
                    } catch (ArithmeticException a_e) {}
                    switch ((i13 % 3) + 51) {
                    case 51:
                        Test.bFld = Test.bFld;
                        by1 += (byte)i13;
                        Test.lFld += (i13 * i13);
                    case 52:
                        dArr[i13][i13][i13 + 1] += i13;
                        break;
                    case 53:
                        bArr[i13] = true;
                        break;
                    default:
                        i14 += (i13 * i13);
                    }
                } while (++i13 < 140);
            } else {
                i = i13;
            }
            break;
        default:
            i14 += i;
        }
        long meth_res = Float.floatToIntBits(f) + i + i13 + i14 + checkSum(iArr1) +
            checkSum(iArr2) + Double.doubleToLongBits(checkSum(dArr)) +
            checkSum(bArr);
        byMeth_check_sum += meth_res;
        return (byte)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i15=18263, i16=-138, i17=-12, i18=53618, i19=-23810, i20=2, i21=-12, iArr3[][][]=new int[N][N][N];
        float f1=93.960F;
        long l3=-760107937L, lArr[][][]=new long[N][N][N];
        boolean b=true, bArr1[]=new boolean[N];

        init(lArr, 43729L);
        init(iArr3, 1);
        init(bArr1, true);

        iFld -= (int)Test.instanceCount;
        iFld = byMeth();
        for (i15 = 2; 341 > i15; ++i15) {
            i16 += i15;
            i17 = 1;
            do {
                iFld = i16;
            } while (++i17 < 74);
            for (f1 = i15; f1 < 74; f1 += 3) {
                i16 += (int)(f1 - Test.fFld);
                iFld *= i19;
                iFld -= i15;
                try {
                    i19 = (i15 / 598338107);
                    i18 = (i20 / iFld);
                    i18 = (-232701841 / i20);
                } catch (ArithmeticException a_e) {}
                for (l3 = 1; l3 < 1; l3++) {
                    lArr[i15][i15 - 1][i15 + 1] &= iFld;
                    switch (((i17 >>> 1) % 1) + 48) {
                    case 48:
                        iArr3[(int)(f1 - 1)][(int)(f1)][(int)(f1)] >>= (int)Test.instanceCount;
                        Test.instanceCount -= i17;
                        i21 += (int)(l3 * l3);
                        break;
                    }
                    i21 += (int)l3;
                    iArr3[(int)(f1)][(int)(l3)][i15 + 1] -= i20;
                    if (Test.bFld) continue;
                    Test.lFld += (l3 - Test.instanceCount);
                    i20 = i19;
                    Test.fFld *= i20;
                    lArr[(int)(f1 - 1)][i15 - 1][i15] = i17;
                }
                bArr1[i15] = b;
                if (Test.bFld) break;
                if (Test.bFld) break;
                i18 = 64;
            }
            Test.sFld ^= (short)Test.lFld;
            Test.fFld += (i15 * i15);
        }

        System.out.println("i15 i16 i17 = " + i15 + "," + i16 + "," + i17);
        System.out.println("f1 i18 i19 = " + Float.floatToIntBits(f1) + "," + i18 + "," + i19);
        System.out.println("i20 l3 i21 = " + i20 + "," + l3 + "," + i21);
        System.out.println("b lArr iArr3 = " + (b ? 1 : 0) + "," + checkSum(lArr) + "," +
            checkSum(iArr3));
        System.out.println("bArr1 = " + checkSum(bArr1));

        System.out.println("Test.instanceCount iFld Test.fFld = " + Test.instanceCount + "," + iFld + "," +
            Float.floatToIntBits(Test.fFld));
        System.out.println("Test.lFld Test.bFld Test.sFld = " + Test.lFld + "," + (Test.bFld ? 1 : 0) + "," +
            Test.sFld);
        System.out.println("Test.fArrFld = " + Double.doubleToLongBits(checkSum(Test.fArrFld)));

        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
        System.out.println("lMeth_check_sum: " + lMeth_check_sum);
        System.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
//DEBUG  byMeth ->  byMeth mainTest
//DEBUG  lMeth ->  lMeth byMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth byMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}