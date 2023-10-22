/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static final int N = 400;
    public static long instanceCount = 2085349214L;
    public static double dFld = 0.90949;
    public static short sFld = (short)3971;
    public static boolean bFld = false;
    public static int[] iArrFld = new int[400];
    public boolean[] bArrFld = new boolean[400];
    public static long iMeth_check_sum;
    public static long lMeth_check_sum;
    public static long lMeth1_check_sum;
    public static PrintStream out;
    public static Random random;
    public static long seed;
    public static int UnknownZero;
    public static AtomicLong runningThreads;

    public static long lMeth1() {
        int n = 41;
        int n2 = 11;
        int n3 = 127;
        int n4 = -4;
        int n5 = -9097;
        int n6 = -1978;
        int n7 = 0;
        int n8 = -9589;
        boolean bl = false;
        float f = -97.969f;
        long[][] lArray = new long[400][400];
        Test.init(lArray, -13L);
        try {
            for (n = 11; n < 590; ++n) {
                if (bl) {
                    for (n3 = -399; n3 < 4; ++n3) {
                        for (n5 = -399; n5 < 1; ++n5) {
                            dFld = n4;
                        }
                    }
                } else {
                    int n9 = n;
                    iArrFld[n9] = iArrFld[n9] - -12;
                }
                n2 = (int)instanceCount;
                for (n7 = 1; n7 < 4; ++n7) {
                    int n10 = 25880;
                    dFld -= (double)f;
                    n10 = (short)(n10 + (short)n5);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
        long l = (long)(n + n2 + (bl ? 1 : 0) + n3 + n4 + n5 + n6 + n7 + n8 + Float.floatToIntBits(f)) + Test.checkSum(lArray);
        lMeth1_check_sum += l;
        return l;
    }

    public static long lMeth(double d, long l) {
        float f = -120.854f;
        float[] fArray = new float[400];
        int n = -7676;
        int n2 = -65008;
        int n3 = 23;
        int n4 = 9;
        int n5 = 0;
        int n6 = -24505;
        boolean bl = false;
        Test.init(fArray, 1.466f);
        f += (float)(Test.lMeth1() - (long)n);
        for (n2 = 1; n2 < 149; ++n2) {
            instanceCount = -188L;
            for (n4 = 1; n4 < 11; ++n4) {
                int n7 = n4 + 1;
                iArrFld[n7] = iArrFld[n7] >> n6;
                n = n6;
                n3 = (int)(instanceCount -= (long)n2);
                n6 += 9;
                bl = false;
                n6 = n;
                l += (long)(n4 * sFld + n2 - sFld);
                n3 += n4 * n2 + n3 - n2;
            }
        }
        dFld = n2;
        instanceCount -= (long)n6;
        long l2 = Double.doubleToLongBits(d) + l + (long)Float.floatToIntBits(f) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)(bl ? 1 : 0) + Double.doubleToLongBits(Test.checkSum(fArray));
        lMeth_check_sum += l2;
        return l2;
    }

    public static int iMeth(double d, long l) {
        int n = 177;
        int n2 = -132;
        int n3 = 2;
        int n4 = -200;
        int n5 = 11245;
        int n6 = -21;
        int n7 = 2;
        float f = 0.441f;
        float[] fArray = new float[400];
        int n8 = -61;
        long l2 = -1424L;
        boolean bl = false;
        Test.init(fArray, -5.468f);
        n = 2;
        while (136 > n) {
            for (n3 = n; n3 < 12; ++n3) {
                fArray[n - 1] = (float)((double)instanceCount-- + (-95.28634 - (double)(-5L + l--)));
                n4 = n4++;
            }
            n2 += n;
            int n9 = n++;
            iArrFld[n9] = iArrFld[n9] >> (int)Test.lMeth(119.68848, l);
            f = n8;
        }
        block2: for (n5 = 218; n5 > 7; --n5) {
            n4 *= (int)f;
            for (l2 = 1L; l2 < 8L; ++l2) {
                n2 *= -12;
                int n10 = n5;
                iArrFld[n10] = iArrFld[n10] << n6;
                if (bl) continue block2;
                n7 = n5;
            }
        }
        long l3 = Double.doubleToLongBits(d) + l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)Float.floatToIntBits(f) + (long)n8 + (long)n5 + (long)n6 + l2 + (long)n7 + (long)(bl ? 1 : 0) + Double.doubleToLongBits(Test.checkSum(fArray));
        iMeth_check_sum += l3;
        return (int)l3;
    }

    public void mainTest(String[] stringArray) {
        double d = -1.45484;
        int n = 21343;
        int n2 = -3;
        int n3 = -43216;
        float f = 2.136f;
        float[] fArray = new float[400];
        byte by = -7;
        byte[] byArray = new byte[400];
        Test.init(fArray, -49.647f);
        Test.init(byArray, (byte)-122);
        Test.iMeth(dFld, instanceCount);
        d = 1.0;
        block8: do {
            n += (int)(d * (double)n + (double)f - (double)by);
            n2 = 1;
            do {
                n3 = 1;
                while (--n3 > 0 && !bFld) {
                    n += n3 + n2;
                    n *= n2;
                    n |= n;
                    sFld = (short)(sFld + (short)n3);
                    n += n3;
                    try {
                        n /= n;
                        n = iArrFld[n3] / n;
                        Test.iArrFld[n3 - 1] = n2 / 91;
                    }
                    catch (ArithmeticException arithmeticException) {
                        // empty catch block
                    }
                    int n4 = (int)(d + 1.0);
                    fArray[n4] = fArray[n4] - (float)instanceCount;
                    n = (int)((long)n + ((long)(n3 * n3 + n) - instanceCount));
                    try {
                        n = 51458 % iArrFld[n3];
                        n = -51783 % iArrFld[n2 - 1];
                        n = 4501 % n2;
                    }
                    catch (ArithmeticException arithmeticException) {}
                }
                n = n3;
                if (bFld) continue block8;
                this.bArrFld[(int)(d + 1.0)] = bFld;
                switch (n2 % 2 + 18) {
                    case 18: {
                        byArray[(int)d] = by;
                        n = (int)((long)n + ((long)n2 - instanceCount));
                        sFld = (short)instanceCount;
                        break;
                    }
                    case 19: {
                        n += (int)instanceCount;
                        int n5 = n2 - 1;
                        iArrFld[n5] = iArrFld[n5] - (int)instanceCount;
                        f *= (float)n2;
                        n += 59347;
                    }
                    default: {
                        if (bFld) {
                            n += n;
                            f += (float)n2;
                            break;
                        }
                        n = (int)((long)n + ((long)(n2 * n3) + instanceCount - (long)n));
                    }
                }
            } while (++n2 < 142);
        } while ((d += 1.0) < 177.0);
        System.out.println("d2 i21 f4 = " + Double.doubleToLongBits(d) + "," + n + "," + Float.floatToIntBits(f));
        System.out.println("by1 i22 i23 = " + by + "," + n2 + "," + n3);
        System.out.println("fArr2 byArr = " + Double.doubleToLongBits(Test.checkSum(fArray)) + "," + Test.checkSum(byArray));
        System.out.println("Test.instanceCount Test.dFld Test.sFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + sFld);
        System.out.println("Test.bFld Test.iArrFld bArrFld = " + (bFld ? 1 : 0) + "," + Test.checkSum(iArrFld) + "," + Test.checkSum(this.bArrFld));
        System.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
        System.out.println("lMeth_check_sum: " + lMeth_check_sum);
        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        Test.init(iArrFld, -136);
        iMeth_check_sum = 0L;
        lMeth_check_sum = 0L;
        lMeth1_check_sum = 0L;
        out = System.out;
        random = new Random(1L);
        seed = 1L;
        UnknownZero = 0;
        runningThreads = new AtomicLong(0L);
    }
}

