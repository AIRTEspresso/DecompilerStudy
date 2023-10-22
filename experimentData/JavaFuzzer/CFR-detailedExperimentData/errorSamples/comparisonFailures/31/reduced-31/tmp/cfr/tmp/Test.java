/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static final int N = 400;
    public static long instanceCount = -13400L;
    public static short sFld = (short)29789;
    public static int iFld = 41363;
    public static volatile float fFld = -107.67f;
    public static boolean bFld = true;
    public double dFld = -1.19269;
    public static int iFld1 = 24598;
    public static byte[] byArrFld = new byte[400];
    public static long lMeth_check_sum;
    public static long fMeth_check_sum;
    public static long vMeth_check_sum;
    public static PrintStream out;
    public static Random random;
    public static long seed;
    public static int UnknownZero;
    public static AtomicLong runningThreads;

    public static void vMeth(int n, boolean bl, int n2) {
        int n3 = -2;
        int n4 = -45388;
        int n5 = -11;
        int n6 = -5;
        int n7 = 10;
        int n8 = -188;
        int n9 = 5;
        double d = 97.80612;
        float f = 2.674f;
        float f2 = 2.74f;
        float[] fArray = new float[400];
        Test.init(fArray, -1.711f);
        for (n3 = 306; n3 > 12; n3 -= 3) {
            int n10 = n3;
            fArray[n10] = fArray[n10] * (float)n;
            for (n5 = 1; n5 < 16; ++n5) {
                n = (int)d;
                sFld = (short)(sFld + (short)n5);
                for (n7 = n5; n7 < 2; ++n7) {
                    if (bl) continue;
                    n6 |= n7;
                    int n11 = n3;
                    byArrFld[n11] = (byte)(byArrFld[n11] >> (byte)n4);
                    n8 += (int)f;
                    n6 = (int)((long)n6 + ((long)(n7 * n6 + n3) - instanceCount));
                    int n12 = n5 - 1;
                    byArrFld[n12] = (byte)(byArrFld[n12] + (byte)sFld);
                }
                for (f2 = 1.0f; f2 < 2.0f && !bl; f2 += 1.0f) {
                    instanceCount += (long)f;
                }
            }
        }
        vMeth_check_sum += (long)(n + (bl ? 1 : 0) + n2 + n3 + n4 + n5 + n6) + Double.doubleToLongBits(d) + (long)n7 + (long)n8 + (long)Float.floatToIntBits(f) + (long)Float.floatToIntBits(f2) + (long)n9 + Double.doubleToLongBits(Test.checkSum(fArray));
    }

    public static float fMeth(int n, double d) {
        int n2 = -58601;
        int n3 = 19738;
        int n4 = 2;
        int n5 = 9;
        int n6 = 4;
        int n7 = 6;
        int n8 = -141;
        int[] nArray = new int[400];
        Test.init(nArray, 33251);
        Test.vMeth(n, true, -12);
        n2 = 170;
        while (n2 > 6) {
            for (n4 = 10; n4 > 1; n4 -= 3) {
                if (n != 0) {
                    // empty if block
                }
                n5 = n;
                for (n6 = 1; n6 < 4; ++n6) {
                    try {
                        n3 = -18681 / n7;
                        n = n7 / -9306;
                        n5 = n6 % nArray[n2 - 1];
                        continue;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                }
                int n9 = n4 + 1;
                nArray[n9] = nArray[n9] - n2;
                d -= (double)iFld;
                fFld -= (float)n4;
            }
            n3 = n2--;
            if (bFld) break;
        }
        n8 = 1;
        while (++n8 < 253) {
            int n10 = n8 - 1;
            byArrFld[n10] = (byte)(byArrFld[n10] - (byte)d);
            instanceCount -= (long)n5;
        }
        long l = (long)n + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + Test.checkSum(nArray);
        fMeth_check_sum += l;
        return l;
    }

    public static long lMeth(long l) {
        int n = -16580;
        int n2 = -143;
        double d = -89.46318;
        n = (short)(n - (short)n2);
        int n3 = (n2 >>> 1) % 400;
        byArrFld[n3] = (byte)(byArrFld[n3] - (byte)Test.fMeth(n2, d));
        long l2 = l + (long)n + (long)n2 + Double.doubleToLongBits(d);
        lMeth_check_sum += l2;
        return l2;
    }

    public void mainTest(String[] stringArray) {
        boolean bl = true;
        int n = 54830;
        int n2 = -218;
        int n3 = 231;
        int n4 = 9;
        int n5 = -17949;
        int n6 = -7;
        int n7 = 57;
        int n8 = -58117;
        int n9 = -188;
        int n10 = -54;
        int[] nArray = new int[400];
        long l = -57605L;
        long[] lArray = new long[400];
        float[] fArray = new float[400];
        Test.init(nArray, 240);
        Test.init(lArray, -49946L);
        Test.init(fArray, 0.824f);
        bl = (long)n++ <= (long)Math.abs(n) - Test.lMeth(instanceCount);
        for (n2 = 1; n2 < 125; ++n2) {
            n4 = 1;
            while (++n4 < 202) {
                for (n5 = n2; n5 < 1; ++n5) {
                    n3 -= sFld;
                    n3 <<= -90;
                    iFld ^= 7;
                    instanceCount += (long)n2;
                    try {
                        n = -49243 / nArray[n2 + 1];
                        n3 = 12 % n2;
                        iFld = n5 % n6;
                        continue;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                }
            }
            n7 = 1;
            while (++n7 < 202) {
                block22: for (n8 = 1; n8 < 1; ++n8) {
                    int n11 = 43;
                    switch (n7 % 10 + 29) {
                        case 29: {
                            fFld -= (float)n9;
                            continue block22;
                        }
                        case 30: {
                            instanceCount = n3;
                            continue block22;
                        }
                        case 31: {
                            n10 += n6;
                            n9 = (int)l;
                            this.dFld = instanceCount;
                            continue block22;
                        }
                        case 32: {
                            n = (int)((float)n + ((float)n8 * fFld + (float)n5 - (float)instanceCount));
                            n10 += n8;
                            switch (n8 % 2 * 5 + 85) {
                                case 90: {
                                    l += (long)n8;
                                    n -= iFld1;
                                    break;
                                }
                                case 91: {
                                    int n12 = n2;
                                    lArray[n12] = lArray[n12] | 0x2819L;
                                    n11 = (byte)(n11 + (byte)n9);
                                }
                            }
                            continue block22;
                        }
                        case 33: {
                            continue block22;
                        }
                        case 34: {
                            fFld += (float)n10;
                            iFld -= n;
                        }
                        case 35: {
                            l = (long)fFld;
                            fFld += (float)n8;
                            continue block22;
                        }
                        case 36: {
                            instanceCount += (long)(n8 * n9 + n11 - n9);
                        }
                        case 37: {
                            l += (long)(n8 * n9) + l - (long)n7;
                            continue block22;
                        }
                        case 38: {
                            fFld += (float)((long)n8 * l + (long)n6 - (long)n3);
                        }
                    }
                }
            }
        }
        System.out.println("b i i19 = " + (bl ? 1 : 0) + "," + n + "," + n2);
        System.out.println("i20 i21 i22 = " + n3 + "," + n4 + "," + n5);
        System.out.println("i23 i24 i25 = " + n6 + "," + n7 + "," + n8);
        System.out.println("i26 i27 l1 = " + n9 + "," + n10 + "," + l);
        System.out.println("iArr1 lArr fArr1 = " + Test.checkSum(nArray) + "," + Test.checkSum(lArray) + "," + Double.doubleToLongBits(Test.checkSum(fArray)));
        System.out.println("Test.instanceCount Test.sFld Test.iFld = " + instanceCount + "," + sFld + "," + iFld);
        System.out.println("Test.fFld Test.bFld dFld = " + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(this.dFld));
        System.out.println("Test.iFld1 Test.byArrFld = " + iFld1 + "," + Test.checkSum(byArrFld));
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
        System.out.println("fMeth_check_sum: " + fMeth_check_sum);
        System.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
        Test.init(byArrFld, (byte)27);
        lMeth_check_sum = 0L;
        fMeth_check_sum = 0L;
        vMeth_check_sum = 0L;
        out = System.out;
        random = new Random(1L);
        seed = 1L;
        UnknownZero = 0;
        runningThreads = new AtomicLong(0L);
    }
}

