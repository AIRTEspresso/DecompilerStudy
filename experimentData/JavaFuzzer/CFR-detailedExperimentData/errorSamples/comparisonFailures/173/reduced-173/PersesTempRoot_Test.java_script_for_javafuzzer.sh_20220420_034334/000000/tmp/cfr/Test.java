/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static final int N = 400;
    public static long instanceCount = 1723977013L;
    public byte byFld = (byte)15;
    public volatile float fFld = -93.335f;
    public static int[] iArrFld = new int[400];
    public boolean[][][] bArrFld = new boolean[400][400][400];
    public static long iMeth_check_sum;
    public static long vMeth_check_sum;
    public static long vMeth1_check_sum;
    public static long vMeth2_check_sum;
    public static PrintStream out;
    public static Random random;
    public static long seed;
    public static int UnknownZero;
    public static AtomicLong runningThreads;

    public static int iMeth(int n) {
        --n;
        long l = n;
        iMeth_check_sum += l;
        return (int)l;
    }

    public static void vMeth2() {
        int n = 172;
        vMeth2_check_sum += (long)n;
    }

    public static void vMeth1() {
        int n = 53;
        int n2 = -58396;
        int n3 = -8681;
        int n4 = -8;
        int n5 = 11268;
        int n6 = 21390;
        int n7 = 36;
        boolean bl = false;
        short[] sArray = new short[400];
        Test.init(sArray, (short)7937);
        Test.vMeth2();
        n &= (int)instanceCount;
        for (n2 = 3; n2 < 226; ++n2) {
            n7 = (byte)n3;
            instanceCount += 26L;
            n4 = 1;
            while (!bl) {
                for (n5 = 1; 1 > n5; ++n5) {
                    n += n5 ^ n6;
                    n = (int)instanceCount;
                    n6 += n5;
                    int n8 = n2 + 1;
                    sArray[n8] = (short)(sArray[n8] >>> (short)n);
                    n6 = 225;
                }
                if (++n4 < 7) continue;
            }
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n7 + n4 + (bl ? 1 : 0) + n5 + n6) + Test.checkSum(sArray);
    }

    public static void vMeth(float f) {
        int n = -2;
        int n2 = 5;
        int n3 = 64798;
        int n4 = -1;
        int n5 = -23269;
        n = 1;
        while (++n < 224) {
            Test.vMeth1();
        }
        block10: for (n2 = 173; n2 > 2; n2 -= 3) {
            instanceCount ^= (long)n2;
            switch (119) {
                case 119: {
                    n3 = n2;
                    n3 *= -110;
                    Test.iArrFld[n2] = n2;
                    switch (n2 % 2 + 61) {
                        case 61: {
                            instanceCount = n;
                            try {
                                n3 = n2 % n2;
                                n3 = 37353 % n3;
                                n3 = -10 / n3;
                            }
                            catch (ArithmeticException arithmeticException) {
                                // empty catch block
                            }
                            n3 = n2;
                            break;
                        }
                        case 62: {
                            n5 = (short)n4;
                            instanceCount <<= n3;
                            n4 -= n;
                        }
                    }
                    continue block10;
                }
                default: {
                    n4 -= 24524;
                }
            }
        }
        vMeth_check_sum += (long)(Float.floatToIntBits(f) + n + n2 + n3 + n5 + n4);
    }

    public void mainTest(String[] stringArray) {
        int n = -138;
        int n2 = 186;
        int n3 = 6;
        int n4 = -12281;
        double d = 0.124347;
        double[] dArray = new double[400];
        long[][] lArray = new long[400][400];
        Test.init(lArray, 1447614521L);
        Test.init(dArray, 45.35738);
        ++n;
        n = (int)((long)n * ((long)(12 + Test.iMeth(-56875)) * instanceCount));
        this.byFld = (byte)(this.byFld - 1);
        Test.vMeth(this.fFld);
        lArray[((n <<= -21451 + this.byFld) >>> 1) % 400] = lArray[(n >>> 1) % 400];
        n2 = 1;
        do {
            dArray[n2 + 1] = -126.10907;
            for (n3 = 101; n3 > 6; n3 -= 2) {
                this.bArrFld[n3 - 1][n3 - 1] = this.bArrFld[n3 + 1][n3 - 1];
                n = 43276;
                this.byFld = (byte)(this.byFld + (byte)n3);
            }
            n = (int)((long)n + ((long)n2 ^ instanceCount));
        } while (++n2 < 248);
        System.out.println("i d i13 = " + n + "," + Double.doubleToLongBits(d) + "," + n2);
        System.out.println("i14 i15 lArr = " + n3 + "," + n4 + "," + Test.checkSum(lArray));
        System.out.println("dArr = " + Double.doubleToLongBits(Test.checkSum(dArray)));
        System.out.println("Test.instanceCount byFld fFld = " + instanceCount + "," + this.byFld + "," + Float.floatToIntBits(this.fFld));
        System.out.println("Test.iArrFld bArrFld = " + Test.checkSum(iArrFld) + "," + Test.checkSum((Object[][])this.bArrFld));
        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
        System.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
        Test.init(iArrFld, 33391);
        iMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        vMeth2_check_sum = 0L;
        out = System.out;
        random = new Random(1L);
        seed = 1L;
        UnknownZero = 0;
        runningThreads = new AtomicLong(0L);
    }
}

