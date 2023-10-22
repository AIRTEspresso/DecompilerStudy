/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Test {
    public static final int N = 400;
    public static volatile long instanceCount = -2408418474L;
    public static int iFld = 49210;
    public static byte byFld = (byte)127;
    public static boolean bFld = false;
    public static float fFld = 8.153f;
    public static double dFld = -53.8111;
    public static long lFld = -2516580881L;
    public static byte[] byArrFld = new byte[400];
    public static long[] lArrFld = new long[400];
    public int[] iArrFld = new int[400];
    public static long vMeth_check_sum;
    public static long iMeth_check_sum;
    public static long vMeth1_check_sum;
    public static PrintStream out;
    public static Random random;
    public static long seed;
    public static int UnknownZero;
    public static AtomicLong runningThreads;

    public static void vMeth1(double d, int n) {
        int n2 = -43255;
        int n3 = -7;
        int n4 = -57;
        int n5 = -1;
        int n6 = 162;
        int n7 = 10;
        int n8 = -21950;
        int n9 = 9986;
        for (n2 = 3; n2 < 163; ++n2) {
            byFld = (byte)-108;
            n3 += n2 ^ (n &= 0xFFFFFFF6);
        }
        block9: for (n4 = 5; n4 < 221; ++n4) {
            switch (n4 % 6 * 5 + 113) {
                case 130: {
                    n *= (int)d;
                    n += n4;
                }
                case 123: {
                    n5 += n4 * n4;
                    for (n6 = n4; n6 < 7; ++n6) {
                        instanceCount += (long)(n6 * n6);
                        for (n8 = 1; n8 > n6; --n8) {
                            n9 ^= (int)instanceCount;
                            iFld += -2 + n8 * n8;
                        }
                    }
                    continue block9;
                }
                case 131: {
                    if (!bFld) continue block9;
                    continue block9;
                }
                case 129: {
                    iFld += (int)instanceCount;
                }
                case 124: {
                    n9 *= 1;
                }
                case 132: {
                    n = 6544;
                }
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d) + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + (long)n9;
    }

    public static int iMeth(int n, long l, long l2) {
        float f = -114.85f;
        double d = -2.28635;
        int n2 = -5103;
        int n3 = 22;
        int n4 = -13;
        long l3 = 1L;
        l += (long)((float)iFld * ((float)n + f - (float)(iFld - byFld)));
        Test.vMeth1(d, iFld);
        for (n2 = 11; n2 < 215; ++n2) {
            f = instanceCount;
            iFld -= n3;
            n3 ^= (int)l2;
            l2 -= (long)n2;
            l3 = 1L;
            while (++l3 < 8L) {
                n4 = 1;
                while (!bFld) {
                    n = n3;
                    if (!bFld) {
                        iFld += (int)l3;
                    }
                    if (++n4 < 1) continue;
                }
                n3 &= 0x806E;
                n &= 0xA3EA;
            }
        }
        long l4 = (long)n + l + l2 + (long)Float.floatToIntBits(f) + Double.doubleToLongBits(d) + (long)n2 + (long)n3 + l3 + (long)n4;
        iMeth_check_sum += l4;
        return (int)l4;
    }

    public static void vMeth(long l, int n, int n2) {
        int n3 = -21477;
        int n4 = -2;
        int n5 = -61993;
        int n6 = 0;
        int n7 = -157;
        int n8 = -7;
        long[] lArray = new long[400];
        Test.init(lArray, -245L);
        iFld -= Test.iMeth(iFld, instanceCount, instanceCount) % (n | 1);
        fFld *= (float)n2;
        instanceCount = -206L;
        dFld -= (double)instanceCount;
        n3 = (short)(n3 >> (short)(n *= (iFld -= n2)));
        n4 = 221;
        do {
            block5: for (n5 = 1; 14 > n5; n5 += 2) {
                switch (n5 % 2 * 5 + 1) {
                    case 4: {
                        n2 <<= n5;
                        for (n7 = n5; n7 < 3; ++n7) {
                            n3 = (short)(n3 - (short)n7);
                            iFld = (int)l;
                            n2 = n6;
                        }
                        continue block5;
                    }
                    case 10: {
                        int n9 = n4;
                        byArrFld[n9] = (byte)(byArrFld[n9] | (byte)n6);
                        continue block5;
                    }
                    default: {
                        l >>>= (int)l;
                    }
                }
            }
        } while ((n4 -= 2) > 0);
        vMeth_check_sum += l + (long)n + (long)n2 + (long)n3 + (long)n4 + (long)n5 + (long)n6 + (long)n7 + (long)n8 + Test.checkSum(lArray);
    }

    public void mainTest(String[] stringArray) {
        int n = 111;
        int n2 = 26492;
        int n3 = -22019;
        int n4 = 1;
        int n5 = 52213;
        int n6 = 9;
        int n7 = -146;
        int n8 = -27054;
        int n9 = -196;
        short s = 4572;
        Test.vMeth(instanceCount, -178, iFld += (int)(++instanceCount));
        for (n = 9; n < 270; ++n) {
            iFld = (int)instanceCount;
            iFld += n;
            dFld *= 4.0;
            n2 += n;
            iFld <<= iFld;
            block11: for (n3 = 96; n3 > 6; n3 -= 2) {
                fFld += (float)n3;
                n5 = 1;
                do {
                    fFld += (float)instanceCount;
                    n4 <<= n5;
                    dFld *= (double)iFld;
                    fFld += (float)n3;
                    n2 |= (int)instanceCount;
                    iFld <<= byFld;
                    int n10 = n5 + 1;
                    lArrFld[n10] = lArrFld[n10] & (long)n5;
                } while (++n5 < 3);
                iFld -= (int)fFld;
                for (n6 = 1; 3 > n6; ++n6) {
                    fFld -= 248.0f;
                }
                n4 &= iFld;
                Test.byArrFld[n - 1] = 87;
                iFld += -63;
                switch ((n7 >>> 1) % 8 + 17) {
                    case 17: {
                        for (n8 = 3; n8 > 1; --n8) {
                            lFld -= -59542L;
                            iFld = (int)instanceCount;
                            n9 += (int)instanceCount;
                        }
                        try {
                            n2 = n8 % n6;
                            n4 = n3 % 73;
                            n7 = n2 % -12085;
                        }
                        catch (ArithmeticException arithmeticException) {
                            // empty catch block
                        }
                    }
                    case 18: {
                        int n11 = n3 - 1;
                        this.iArrFld[n11] = this.iArrFld[n11] - n8;
                        continue block11;
                    }
                    case 19: 
                    case 20: {
                        n7 = (int)((float)n7 + ((float)n3 * fFld + fFld - (float)s));
                    }
                    case 21: {
                        continue block11;
                    }
                    case 22: 
                    case 23: {
                        n4 -= n;
                        continue block11;
                    }
                    case 24: {
                        int n12 = n + 1;
                        lArrFld[n12] = lArrFld[n12] - lFld;
                    }
                }
            }
        }
        System.out.println("i20 i21 i22 = " + n + "," + n2 + "," + n3);
        System.out.println("i23 i24 i25 = " + n4 + "," + n5 + "," + n6);
        System.out.println("i26 i27 i28 = " + n7 + "," + n8 + "," + n9);
        System.out.println("s1 = " + s);
        System.out.println("Test.instanceCount Test.iFld Test.byFld = " + instanceCount + "," + iFld + "," + byFld);
        System.out.println("Test.bFld Test.fFld Test.dFld = " + (bFld ? 1 : 0) + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
        System.out.println("Test.lFld Test.byArrFld Test.lArrFld = " + lFld + "," + Test.checkSum(byArrFld) + "," + Test.checkSum(lArrFld));
        System.out.println("iArrFld = " + Test.checkSum(this.iArrFld));
        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
        Test.init(byArrFld, (byte)126);
        Test.init(lArrFld, -2L);
        vMeth_check_sum = 0L;
        iMeth_check_sum = 0L;
        vMeth1_check_sum = 0L;
        out = System.out;
        random = new Random(1L);
        seed = 1L;
        UnknownZero = 0;
        runningThreads = new AtomicLong(0L);
    }
}

