import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Jan  5 22:06:42 2022
public class Test {

    public static final int N = 400;

    public static long instanceCount=6410838818528573617L;
    public static int iFld=13;
    public static int iFld1=231;
    public static boolean bFld=true;
    public static float fArrFld[]=new float[N];

    static {
        init(Test.fArrFld, 42.196F);
    }

    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=5, i6=-32166, i8=24633, i9=28969, i10=-6, iArr[]=new int[N];
        double d=1.74993;
        boolean b=false;
        long lArr[]=new long[N];

        init(iArr, 3);
        init(lArr, 2603973738L);

        Test.iFld = (int)Test.instanceCount;
        for (i5 = 4; 285 > i5; ++i5) {
            float f3=2.737F;
            f3 = f3;
            try {
                i6 = (iArr[i5 - 1] % -145);
                i6 = (i6 / i5);
                i6 = (-1738862258 % Test.iFld);
            } catch (ArithmeticException a_e) {}
            switch ((((i5 >>> 1) % 2) * 5) + 109) {
            case 118:
                i6 /= 18222;
                break;
            case 110:
                if (b) {
                    for (i8 = 1; i8 < 6; i8++) {
                        i10 = 1;
                        do {
                            iArr = iArr;
                            Test.iFld *= (int)-1.108F;
                            d = i8;
                            d -= -5770;
                            lArr[i8] |= Test.instanceCount;
                        } while (++i10 < 2);
                        i6 -= (int)-14.335F;
                    }
                } else if (true) {
                    i6 = 0;
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i8 + i9 + i10 + Double.doubleToLongBits(d) + (b ? 1 : 0) +
            checkSum(iArr) + checkSum(lArr);
    }

    public static void vMeth(int i3, int i4, float f2) {

        int i11=11, i12=-33757, i13=58530, i14=4, i15=180;
        boolean b1=false;
        double d1=1.41276, dArr[]=new double[N];
        long lArr1[]=new long[N];

        init(lArr1, -6080L);
        init(dArr, -23.37426);

        vMeth1();
        lArr1[(15711 >>> 1) % N] = Test.iFld;
        for (i11 = 11; 327 > i11; i11++) {
            i12 += (int)-5090635659426882883L;
            i4 |= 8;
            for (i13 = 1; i13 < 5; i13++) {
                dArr[i13 + 1] = Test.iFld;
                if (b1) break;
                i15 = 1;
                do {
                    switch (((i11 % 2) * 5) + 50) {
                    case 56:
                        Test.instanceCount -= 0;
                        lArr1[(i3 >>> 1) % N] >>= 168;
                        i12 = i15;
                        i4 += (int)d1;
                    case 58:
                        Test.instanceCount += i11;
                    }
                } while (++i15 < 2);
            }
        }
        vMeth_check_sum += i3 + i4 + Float.floatToIntBits(f2) + i11 + i12 + i13 + i14 + (b1 ? 1 : 0) + i15 +
            Double.doubleToLongBits(d1) + checkSum(lArr1) +
            Double.doubleToLongBits(checkSum(dArr));
    }

    public static boolean bMeth(int i) {

        int i1=-63371, i2=-248, i16=10, i17=-203, i18=32545;
        float f1=6.663F;
        byte by=116, byArr[][]=new byte[N][N];
        long l=130L;
        boolean b2=true;

        init(byArr, (byte)-49);

        for (i1 = 7; i1 < 323; ++i1) {
            i = (int)(++Test.instanceCount);
        }
        f1 = 1;
        while (++f1 < 391) {
            i2 ^= Math.abs(14);
            vMeth(98, i, f1);
        }
        Test.iFld += i;
        Test.instanceCount += Test.instanceCount;
        for (i16 = 4; i16 < 154; i16++) {
            i17 += (((i16 * Test.iFld) + i17) - i16);
            by -= (byte)Test.iFld;
            for (l = 1; l < 11; l++) {
                i2 = (int)l;
            }
            if (b2) continue;
            byArr[i16] = byArr[i16 + 1];
        }
        Test.instanceCount = -4982;
        long meth_res = i + i1 + i2 + Float.floatToIntBits(f1) + i16 + i17 + by + l + i18 + (b2 ? 1 : 0) +
            checkSum(byArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        float f=0.236F;
        int i19=224, i20=-64, i21=-1, i22=15918, i23=13, i24=200, iArr1[]=new int[N], iArr2[]=new int[N];
        byte by1=96;
        double d2=-2.92060;
        boolean bArr[]=new boolean[N];
        short sArr[]=new short[N];

        init(bArr, false);
        init(iArr1, -40735);
        init(iArr2, 41);
        init(sArr, (short)-18776);

        f = 311;
        while ((f -= 3) > 0) {
            bArr[(int)(f)] = bMeth(Test.iFld);
        }
        iArr1 = iArr1;
        for (i19 = 21; i19 < 363; i19++) {
            Test.instanceCount += -27196;
            Test.fArrFld[i19 + 1] -= Test.iFld;
            Test.instanceCount &= 32499;
            for (i21 = 2; i21 < 74; i21++) {
                i23 = 1;
                do {
                    if (Test.bFld) {
                        Test.instanceCount += (i23 - by1);
                        Test.iFld >>>= i19;
                        switch (((i21 % 2) * 5) + 122) {
                        case 125:
                            Test.instanceCount += i23;
                            Test.instanceCount *= (long)d2;
                            Test.iFld1 += (int)57.77613;
                            i20 -= i20;
                        case 130:
                        default:
                            iArr2[i19] = (int)Test.instanceCount;
                            Test.iFld1 *= (int)Test.instanceCount;
                        }
                        Test.instanceCount -= Test.iFld;
                    }
                    iArr2[i19] -= 9;
                    Test.iFld |= (int)Test.instanceCount;
                    i22 = Test.iFld1;
                } while (++i23 < 2);
                Test.iFld1 *= 9;
                i24 = 1;
                while (++i24 < 2) {
                    sArr[i24 - 1] *= (short)i22;
                }
            }
            sArr[i19 - 1] -= (short)Test.instanceCount;
        }
        Test.iFld = (int)Test.instanceCount;
        i22 ^= i20;
        iArr2[(54 >>> 1) % N] += Test.iFld1;

        System.out.println("f i19 i20 = " + Float.floatToIntBits(f) + "," + i19 + "," + i20);
        System.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        System.out.println("by1 d2 i24 = " + by1 + "," + Double.doubleToLongBits(d2) + "," + i24);
        System.out.println("bArr iArr1 iArr2 = " + checkSum(bArr) + "," + checkSum(iArr1)
            + "," + checkSum(iArr2));
        System.out.println("sArr = " + checkSum(sArr));

        System.out.println("Test.instanceCount Test.iFld Test.iFld1 = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.iFld1);
        System.out.println("Test.bFld Test.fArrFld = " + (Test.bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(checkSum(Test.fArrFld)));

        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
        System.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  vMeth ->  vMeth bMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}