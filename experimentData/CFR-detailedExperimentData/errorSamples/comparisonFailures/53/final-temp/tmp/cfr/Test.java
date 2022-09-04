/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static final int N = 400;
    public static long instanceCount = 60695L;
    public static short sFld = (short)-12971;
    public static byte byFld = (byte)-108;
    public static boolean bFld = false;
    public static int[] iArrFld = new int[400];
    public static volatile long[] lArrFld = new long[400];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long iMeth1_check_sum;
    public static PrintStream out;
    public static Random random;
    public static long seed;
    public static int UnknownZero;
    public static AtomicLong runningThreads;

    public static int iMeth1(int n, double d, int n2) {
        int n3 = -250;
        int n4 = 7;
        int n5 = 36535;
        int n6 = -65196;
        int[] nArray = new int[400];
        int[] nArray2 = new int[400];
        int n7 = -7608;
        int n8 = 117;
        byte[] byArray = new byte[400];
        Test.init(byArray, (byte)83);
        Test.init(nArray, -11);
        Test.init(nArray2, 11);
        byArray[(n >>> 1) % 400] = (byte)n;
        block5: for (n3 = 324; n3 > 12; --n3) {
            n5 = 1;
            do {
                nArray = nArray2;
                n7 = (short)instanceCount;
                n2 += (int)instanceCount;
            } while (++n5 < 5);
            n4 += n;
            instanceCount = -235L;
            n8 = 30;
            instanceCount = n;
            switch (n3 % 3 * 5 + 49) {
                case 53: {
                    n6 = 1;
                    while (++n6 < 5) {
                        instanceCount = n;
                        n4 += n6;
                    }
                    continue block5;
                }
                case 51: {
                    n4 = n5;
                    continue block5;
                }
                case 63: {
                    n4 = n6;
                }
            }
        }
        long l = (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n7 + (long)n8 + (long)n6 + Test.checkSum(byArray) + Test.checkSum(nArray) + Test.checkSum(nArray2);
        iMeth1_check_sum += l;
        return (int)l;
    }

    public static void vMeth() {
        int n = 19;
        n = -8 * Test.iMeth1(n, -89.39037, -131);
        vMeth_check_sum += (long)n;
    }

    public static int iMeth() {
        int n = -181;
        int n2 = -130;
        int n3 = 14;
        double d = 79.34239;
        float f = 1.764f;
        int n4 = -1;
        short[] sArray = new short[400];
        long[] lArray = new long[400];
        Test.init(sArray, (short)-25215);
        Test.init(lArray, -5345615981701219748L);
        try {
            for (n = 133; n > -398; --n) {
                d = n2++;
                Test.vMeth();
                n3 = 1;
                block14: while (++n3 < 4) {
                    f *= 106.0f;
                    int n5 = n - 1;
                    sArray[n5] = (short)(sArray[n5] * (short)n);
                    d *= 47096.0;
                    switch (((n2 >>>= (int)(instanceCount -= -14L)) >>> 1) % 10 + 87) {
                        case 87: {
                            n4 = (byte)n3;
                            continue block14;
                        }
                        case 88: {
                            n2 = n3;
                            n2 = -713;
                            n2 += (int)f;
                            continue block14;
                        }
                        case 89: {
                            Test.iArrFld[n] = (int)instanceCount;
                            continue block14;
                        }
                        case 90: {
                            f *= 23408.0f;
                        }
                        case 91: {
                            int n6 = n3 + 1;
                            lArray[n6] = lArray[n6] % (long)(n3 | 1);
                        }
                        case 92: {
                            n2 *= n2;
                            continue block14;
                        }
                        case 93: 
                        case 94: {
                            int n7 = n;
                            iArrFld[n7] = iArrFld[n7] + n;
                            continue block14;
                        }
                        case 95: {
                            instanceCount += (long)n3;
                        }
                        case 96: {
                            d += (double)n;
                            continue block14;
                        }
                    }
                    n2 >>= -10;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            d = -124.0;
        }
        long l = (long)(n + n2) + Double.doubleToLongBits(d) + (long)n3 + (long)Float.floatToIntBits(f) + (long)n4 + Test.checkSum(sArray) + Test.checkSum(lArray);
        iMeth_check_sum += l;
        return (int)l;
    }

    public void mainTest(String[] stringArray) {
        Test.iMeth();
        System.out.println("Test.bFld Test.iArrFld Test.lArrFld = " + (bFld ? 1 : 0) + "," + Test.checkSum(iArrFld) + "," + Test.checkSum(lArrFld));
    }

    public static void main(String[] stringArray) {
        try {
            Test test = new Test();
            test.mainTest(stringArray);
        }
        catch (Exception exception) {
            System.out.println(exception.getClass().getCanonicalName());
        }
    }

    public static int nextInt() {
        return random.nextInt();
    }

    public static long nextLong() {
        return random.nextLong();
    }

    public static float nextFloat() {
        return random.nextFloat();
    }

    public static double nextDouble() {
        return random.nextDouble();
    }

    public static boolean nextBoolean() {
        return random.nextBoolean();
    }

    public static byte nextByte() {
        return (byte)random.nextInt();
    }

    public static short nextShort() {
        return (short)random.nextInt();
    }

    public static char nextChar() {
        return (char)random.nextInt();
    }

    public static void init(boolean[] blArray, boolean bl) {
        for (int i = 0; i < blArray.length; ++i) {
            blArray[i] = i % 2 == 0 ? bl : i % 3 == 0;
        }
    }

    public static void init(boolean[][] blArray, boolean bl) {
        for (int i = 0; i < blArray.length; ++i) {
            Test.init(blArray[i], bl);
        }
    }

    public static void init(long[] lArray, long l) {
        for (int i = 0; i < lArray.length; ++i) {
            lArray[i] = i % 2 == 0 ? l + (long)i : l - (long)i;
        }
    }

    public static void init(long[][] lArray, long l) {
        for (int i = 0; i < lArray.length; ++i) {
            Test.init(lArray[i], l);
        }
    }

    public static void init(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = i % 2 == 0 ? n + i : n - i;
        }
    }

    public static void init(int[][] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            Test.init(nArray[i], n);
        }
    }

    public static void init(short[] sArray, short s) {
        for (int i = 0; i < sArray.length; ++i) {
            sArray[i] = (short)(i % 2 == 0 ? s + i : s - i);
        }
    }

    public static void init(short[][] sArray, short s) {
        for (int i = 0; i < sArray.length; ++i) {
            Test.init(sArray[i], s);
        }
    }

    public static void init(char[] cArray, char c) {
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(i % 2 == 0 ? c + i : c - i);
        }
    }

    public static void init(char[][] cArray, char c) {
        for (int i = 0; i < cArray.length; ++i) {
            Test.init(cArray[i], c);
        }
    }

    public static void init(byte[] byArray, byte by) {
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)(i % 2 == 0 ? by + i : by - i);
        }
    }

    public static void init(byte[][] byArray, byte by) {
        for (int i = 0; i < byArray.length; ++i) {
            Test.init(byArray[i], by);
        }
    }

    public static void init(double[] dArray, double d) {
        for (int i = 0; i < dArray.length; ++i) {
            dArray[i] = i % 2 == 0 ? d + (double)i : d - (double)i;
        }
    }

    public static void init(double[][] dArray, double d) {
        for (int i = 0; i < dArray.length; ++i) {
            Test.init(dArray[i], d);
        }
    }

    public static void init(float[] fArray, float f) {
        for (int i = 0; i < fArray.length; ++i) {
            fArray[i] = i % 2 == 0 ? f + (float)i : f - (float)i;
        }
    }

    public static void init(float[][] fArray, float f) {
        for (int i = 0; i < fArray.length; ++i) {
            Test.init(fArray[i], f);
        }
    }

    public static void init(Object[][] objectArray, Object object) {
        for (int i = 0; i < objectArray.length; ++i) {
            Test.init(objectArray[i], object);
        }
    }

    public static void init(Object[] objectArray, Object object) {
        for (int i = 0; i < objectArray.length; ++i) {
            try {
                objectArray[i] = object.getClass().newInstance();
                continue;
            }
            catch (Exception exception) {
                objectArray[i] = object;
            }
        }
    }

    public static long checkSum(boolean[] blArray) {
        long l = 0L;
        for (int i = 0; i < blArray.length; ++i) {
            l += (long)(blArray[i] ? i + 1 : 0);
        }
        return l;
    }

    public static long checkSum(boolean[][] blArray) {
        long l = 0L;
        for (int i = 0; i < blArray.length; ++i) {
            l += Test.checkSum(blArray[i]);
        }
        return l;
    }

    public static long checkSum(long[] lArray) {
        long l = 0L;
        for (int i = 0; i < lArray.length; ++i) {
            l += lArray[i] / (long)(i + 1) + lArray[i] % (long)(i + 1);
        }
        return l;
    }

    public static long checkSum(long[][] lArray) {
        long l = 0L;
        for (int i = 0; i < lArray.length; ++i) {
            l += Test.checkSum(lArray[i]);
        }
        return l;
    }

    public static long checkSum(int[] nArray) {
        long l = 0L;
        for (int i = 0; i < nArray.length; ++i) {
            l += (long)(nArray[i] / (i + 1) + nArray[i] % (i + 1));
        }
        return l;
    }

    public static long checkSum(int[][] nArray) {
        long l = 0L;
        for (int i = 0; i < nArray.length; ++i) {
            l += Test.checkSum(nArray[i]);
        }
        return l;
    }

    public static long checkSum(short[] sArray) {
        long l = 0L;
        for (int i = 0; i < sArray.length; ++i) {
            l += (long)((short)(sArray[i] / (i + 1) + sArray[i] % (i + 1)));
        }
        return l;
    }

    public static long checkSum(short[][] sArray) {
        long l = 0L;
        for (int i = 0; i < sArray.length; ++i) {
            l += Test.checkSum(sArray[i]);
        }
        return l;
    }

    public static long checkSum(char[] cArray) {
        long l = 0L;
        for (int i = 0; i < cArray.length; ++i) {
            l += (long)((char)(cArray[i] / (i + 1) + cArray[i] % (i + 1)));
        }
        return l;
    }

    public static long checkSum(char[][] cArray) {
        long l = 0L;
        for (int i = 0; i < cArray.length; ++i) {
            l += Test.checkSum(cArray[i]);
        }
        return l;
    }

    public static long checkSum(byte[] byArray) {
        long l = 0L;
        for (int i = 0; i < byArray.length; ++i) {
            l += (long)((byte)(byArray[i] / (i + 1) + byArray[i] % (i + 1)));
        }
        return l;
    }

    public static long checkSum(byte[][] byArray) {
        long l = 0L;
        for (int i = 0; i < byArray.length; ++i) {
            l += Test.checkSum(byArray[i]);
        }
        return l;
    }

    public static double checkSum(double[] dArray) {
        double d = 0.0;
        for (int i = 0; i < dArray.length; ++i) {
            d += dArray[i] / (double)(i + 1) + dArray[i] % (double)(i + 1);
        }
        return d;
    }

    public static double checkSum(double[][] dArray) {
        double d = 0.0;
        for (int i = 0; i < dArray.length; ++i) {
            d += Test.checkSum(dArray[i]);
        }
        return d;
    }

    public static double checkSum(float[] fArray) {
        double d = 0.0;
        for (int i = 0; i < fArray.length; ++i) {
            d += (double)(fArray[i] / (float)(i + 1) + fArray[i] % (float)(i + 1));
        }
        return d;
    }

    public static double checkSum(float[][] fArray) {
        double d = 0.0;
        for (int i = 0; i < fArray.length; ++i) {
            d += Test.checkSum(fArray[i]);
        }
        return d;
    }

    public static long checkSum(Object[][] objectArray) {
        long l = 0L;
        for (int i = 0; i < objectArray.length; ++i) {
            l += Test.checkSum(objectArray[i]);
        }
        return l;
    }

    public static long checkSum(Object[] objectArray) {
        long l = 0L;
        for (int i = 0; i < objectArray.length; ++i) {
            l = (long)((double)l + (double)Test.checkSum(objectArray[i]) * Math.pow(2.0, i));
        }
        return l;
    }

    public static long checkSum(Object object) {
        if (object == null) {
            return 0L;
        }
        return object.getClass().getCanonicalName().length();
    }

    public static byte[] byte1array(int n, byte by) {
        byte[] byArray = new byte[n];
        Test.init(byArray, by);
        return byArray;
    }

    public static byte[][] byte2array(int n, byte by) {
        byte[][] byArray = new byte[n][n];
        Test.init(byArray, by);
        return byArray;
    }

    public static short[] short1array(int n, short s) {
        short[] sArray = new short[n];
        Test.init(sArray, s);
        return sArray;
    }

    public static short[][] short2array(int n, short s) {
        short[][] sArray = new short[n][n];
        Test.init(sArray, s);
        return sArray;
    }

    public static int[] int1array(int n, int n2) {
        int[] nArray = new int[n];
        Test.init(nArray, n2);
        return nArray;
    }

    public static int[][] int2array(int n, int n2) {
        int[][] nArray = new int[n][n];
        Test.init(nArray, n2);
        return nArray;
    }

    public static long[] long1array(int n, long l) {
        long[] lArray = new long[n];
        Test.init(lArray, l);
        return lArray;
    }

    public static long[][] long2array(int n, long l) {
        long[][] lArray = new long[n][n];
        Test.init(lArray, l);
        return lArray;
    }

    public static float[] float1array(int n, float f) {
        float[] fArray = new float[n];
        Test.init(fArray, f);
        return fArray;
    }

    public static float[][] float2array(int n, float f) {
        float[][] fArray = new float[n][n];
        Test.init(fArray, f);
        return fArray;
    }

    public static double[] double1array(int n, double d) {
        double[] dArray = new double[n];
        Test.init(dArray, d);
        return dArray;
    }

    public static double[][] double2array(int n, double d) {
        double[][] dArray = new double[n][n];
        Test.init(dArray, d);
        return dArray;
    }

    public static char[] char1array(int n, char c) {
        char[] cArray = new char[n];
        Test.init(cArray, c);
        return cArray;
    }

    public static char[][] char2array(int n, char c) {
        char[][] cArray = new char[n][n];
        Test.init(cArray, c);
        return cArray;
    }

    public static Object[] Object1array(int n, Object object) {
        Object[] objectArray = new Object[n];
        Test.init(objectArray, object);
        return objectArray;
    }

    public static Object[][] Object2array(int n, Object object) {
        Object[][] objectArray = new Object[n][n];
        Test.init(objectArray, object);
        return objectArray;
    }

    public static boolean[] boolean1array(int n, boolean bl) {
        boolean[] blArray = new boolean[n];
        Test.init(blArray, bl);
        return blArray;
    }

    public static boolean[][] boolean2array(int n, boolean bl) {
        boolean[][] blArray = new boolean[n][n];
        Test.init(blArray, bl);
        return blArray;
    }

    public static synchronized void runThread(Runnable runnable) {
        final Thread thread = new Thread(runnable);
        thread.start();
        runningThreads.incrementAndGet();
        Thread thread2 = new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    thread.join();
                    runningThreads.decrementAndGet();
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
        });
        thread2.start();
    }

    public static void joinThreads() {
        while (runningThreads.get() > 0L) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    static {
        Test.init(iArrFld, 89);
        Test.init(lArrFld, 507897389772567526L);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        iMeth1_check_sum = 0L;
        out = System.out;
        random = new Random(1L);
        seed = 1L;
        UnknownZero = 0;
        runningThreads = new AtomicLong(0L);
    }
}

