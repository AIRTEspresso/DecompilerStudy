
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/652/reduced-652/tmp/Test.dex */
public class Test {
    public static final int N = 400;
    public static int[] iArrFld;
    public int iFld1 = -6;
    public static long instanceCount = 1818248298180143934L;
    public static double dFld = -1.1715d;
    public static int iFld = 2;
    public static boolean bFld = true;
    public static long lMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static PrintStream out = System.out;
    public static Random random = new Random(1);
    public static long seed = 1;
    public static int UnknownZero = 0;
    public static AtomicLong runningThreads = new AtomicLong(0);

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        init(iArr, 189);
    }

    public static void vMeth(long j, int i, long j2) {
        int i2;
        int i3;
        int i4 = 1;
        do {
            i2 = 1;
            while (i2 < 5) {
                double d = dFld;
                int[] iArr = iArrFld;
                iArr[i4] = iArr[i4] - 1;
                j2 += i3 - i4;
                double d2 = j2;
                Double.isNaN(d2);
                dFld = d * d2;
                i2++;
            }
            i4++;
        } while (i4 < 372);
        vMeth_check_sum += ((((j + i) + j2) + i4) + i2) - 104;
    }

    public static int iMeth(int i) {
        vMeth(1555838649L, -8, instanceCount);
        int i2 = 1;
        do {
            i2++;
        } while (i2 < 368);
        short s = 5878;
        int i3 = 1;
        while (true) {
            i3++;
            if (i3 >= 125) {
                long j = (-33293) + i2 + 33 + 1 + i3 + s + 2;
                iMeth_check_sum += j;
                return (int) j;
            }
            s = (short) (((short) (s + ((short) (i3 ^ i2)))) + ((short) i2));
        }
    }

    public static long lMeth(int i) {
        boolean[] zArr = new boolean[N];
        long[] jArr = new long[N];
        init(zArr, false);
        init(jArr, -46L);
        boolean z = zArr[45];
        int i2 = -5;
        long j = -5;
        instanceCount = j;
        vMeth(Math.min(j, ((-5) - (-1.472f)) << iMeth(-45840)), -5, 0L);
        int i3 = 58;
        int i4 = -9;
        int i5 = 9;
        while (i5 < 328) {
            instanceCount = -177L;
            int i6 = i4;
            float f = i5;
            i3 = i5;
            while (i3 < 5) {
                i += i3;
                f += i6;
                i6 += (int) f;
                i2 -= 43;
                jArr[i5] = jArr[i5] * i3;
                i3++;
            }
            i5++;
            i4 = i6;
        }
        long checkSum = i + (z ? 1 : 0) + i2 + i5 + 11488 + 20268 + i3 + i4 + checkSum(zArr) + checkSum(jArr);
        lMeth_check_sum += checkSum;
        return checkSum;
    }

    public void mainTest(String[] strArr) {
        long[] jArr = new long[N];
        init(jArr, 3697874498L);
        long j = instanceCount;
        long j2 = j - 1;
        instanceCount = j2;
        dFld = j;
        instanceCount = j2 - lMeth(iFld);
        int[] iArr = iArrFld;
        int i = this.iFld1;
        iArr[(i >>> 1) % N] = i;
        jArr[(iFld >>> 1) % N] = (long) dFld;
        int i2 = -171;
        int i3 = 28696;
        int i4 = -8;
        int i5 = -23;
        int i6 = -186;
        float f = 2.345f;
        int i7 = 9;
        while (i7 < 254) {
            this.iFld1 = i2;
            iFld *= (int) dFld;
            i2 = i2 + (i7 | i2) + i7;
            i3 = i7;
            while (i3 < 103) {
                long j3 = i3;
                long j4 = instanceCount - j3;
                instanceCount = j4;
                this.iFld1 *= 1;
                i4 = (i4 * 14398) + 63512;
                int i8 = ((i3 % 2) * 5) + 87;
                if (i8 == 89) {
                    i2 *= iFld;
                    i5 = (int) j4;
                    i6 = 1;
                } else if (i8 == 93) {
                    f += (float) (((j3 * j4) + i5) - j4);
                    bFld = bFld;
                    iFld = i4;
                }
                i3++;
            }
            i7++;
        }
        System.out.println("i14 i15 i16 = " + i7 + "," + i2 + "," + i3);
        System.out.println("i17 f2 i18 = " + i4 + "," + Float.floatToIntBits(f) + "," + i5);
        System.out.println("i19 i20 lArr1 = " + i6 + ",-40013," + checkSum(jArr));
        System.out.println("Test.instanceCount Test.dFld Test.iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + iFld);
        PrintStream printStream = System.out;
        int i9 = this.iFld1;
        boolean z = bFld;
        printStream.println("iFld1 Test.bFld Test.iArrFld = " + i9 + "," + (z ? 1 : 0) + "," + checkSum(iArrFld));
        PrintStream printStream2 = System.out;
        long j5 = vMeth_check_sum;
        StringBuilder sb = new StringBuilder();
        sb.append("vMeth_check_sum: ");
        sb.append(j5);
        printStream2.println(sb.toString());
        System.out.println("iMeth_check_sum: " + iMeth_check_sum);
        System.out.println("lMeth_check_sum: " + lMeth_check_sum);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e.getClass().getCanonicalName());
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
        return (byte) random.nextInt();
    }

    public static short nextShort() {
        return (short) random.nextInt();
    }

    public static char nextChar() {
        return (char) random.nextInt();
    }

    public static void init(boolean[] zArr, boolean z) {
        for (int i = 0; i < zArr.length; i++) {
            zArr[i] = i % 2 == 0 ? z : i % 3 == 0;
        }
    }

    public static void init(boolean[][] zArr, boolean z) {
        for (boolean[] zArr2 : zArr) {
            init(zArr2, z);
        }
    }

    public static void init(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = i % 2 == 0 ? i + j : j - i;
        }
    }

    public static void init(long[][] jArr, long j) {
        for (long[] jArr2 : jArr) {
            init(jArr2, j);
        }
    }

    public static void init(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i2 % 2 == 0 ? i + i2 : i - i2;
        }
    }

    public static void init(int[][] iArr, int i) {
        for (int[] iArr2 : iArr) {
            init(iArr2, i);
        }
    }

    public static void init(short[] sArr, short s) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = (short) (i % 2 == 0 ? s + i : s - i);
        }
    }

    public static void init(short[][] sArr, short s) {
        for (short[] sArr2 : sArr) {
            init(sArr2, s);
        }
    }

    public static void init(char[] cArr, char c) {
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = (char) (i % 2 == 0 ? c + i : c - i);
        }
    }

    public static void init(char[][] cArr, char c) {
        for (char[] cArr2 : cArr) {
            init(cArr2, c);
        }
    }

    public static void init(byte[] bArr, byte b) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (i % 2 == 0 ? b + i : b - i);
        }
    }

    public static void init(byte[][] bArr, byte b) {
        for (byte[] bArr2 : bArr) {
            init(bArr2, b);
        }
    }

    public static void init(double[] dArr, double d) {
        double d2;
        for (int i = 0; i < dArr.length; i++) {
            if (i % 2 == 0) {
                double d3 = i;
                Double.isNaN(d3);
                d2 = d3 + d;
            } else {
                double d4 = i;
                Double.isNaN(d4);
                d2 = d - d4;
            }
            dArr[i] = d2;
        }
    }

    public static void init(double[][] dArr, double d) {
        for (double[] dArr2 : dArr) {
            init(dArr2, d);
        }
    }

    public static void init(float[] fArr, float f) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = i % 2 == 0 ? i + f : f - i;
        }
    }

    public static void init(float[][] fArr, float f) {
        for (float[] fArr2 : fArr) {
            init(fArr2, f);
        }
    }

    public static void init(Object[][] objArr, Object obj) {
        for (Object[] objArr2 : objArr) {
            init(objArr2, obj);
        }
    }

    public static void init(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            try {
                objArr[i] = obj.getClass().newInstance();
            } catch (Exception e) {
                objArr[i] = obj;
            }
        }
    }

    public static long checkSum(boolean[] zArr) {
        long j = 0;
        for (int i = 0; i < zArr.length; i++) {
            j += zArr[i] ? i + 1 : 0;
        }
        return j;
    }

    public static long checkSum(boolean[][] zArr) {
        long j = 0;
        for (boolean[] zArr2 : zArr) {
            j += checkSum(zArr2);
        }
        return j;
    }

    public static long checkSum(long[] jArr) {
        long j = 0;
        int i = 0;
        while (i < jArr.length) {
            int i2 = i + 1;
            long j2 = i2;
            j += (jArr[i] / j2) + (jArr[i] % j2);
            i = i2;
        }
        return j;
    }

    public static long checkSum(long[][] jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += checkSum(jArr2);
        }
        return j;
    }

    public static long checkSum(int[] iArr) {
        long j = 0;
        int i = 0;
        while (i < iArr.length) {
            int i2 = i + 1;
            j += (iArr[i] / i2) + (iArr[i] % i2);
            i = i2;
        }
        return j;
    }

    public static long checkSum(int[][] iArr) {
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += checkSum(iArr2);
        }
        return j;
    }

    public static long checkSum(short[] sArr) {
        long j = 0;
        int i = 0;
        while (i < sArr.length) {
            int i2 = i + 1;
            j += (short) ((sArr[i] / i2) + (sArr[i] % i2));
            i = i2;
        }
        return j;
    }

    public static long checkSum(short[][] sArr) {
        long j = 0;
        for (short[] sArr2 : sArr) {
            j += checkSum(sArr2);
        }
        return j;
    }

    public static long checkSum(char[] cArr) {
        long j = 0;
        int i = 0;
        while (i < cArr.length) {
            int i2 = i + 1;
            j += (char) ((cArr[i] / i2) + (cArr[i] % i2));
            i = i2;
        }
        return j;
    }

    public static long checkSum(char[][] cArr) {
        long j = 0;
        for (char[] cArr2 : cArr) {
            j += checkSum(cArr2);
        }
        return j;
    }

    public static long checkSum(byte[] bArr) {
        long j = 0;
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 1;
            j += (byte) ((bArr[i] / i2) + (bArr[i] % i2));
            i = i2;
        }
        return j;
    }

    public static long checkSum(byte[][] bArr) {
        long j = 0;
        for (byte[] bArr2 : bArr) {
            j += checkSum(bArr2);
        }
        return j;
    }

    public static double checkSum(double[] dArr) {
        double d = 0.0d;
        int i = 0;
        while (i < dArr.length) {
            double d2 = dArr[i];
            int i2 = i + 1;
            double d3 = i2;
            Double.isNaN(d3);
            double d4 = dArr[i];
            Double.isNaN(d3);
            d += (d2 / d3) + (d4 % d3);
            i = i2;
        }
        return d;
    }

    public static double checkSum(double[][] dArr) {
        double d = 0.0d;
        for (double[] dArr2 : dArr) {
            d += checkSum(dArr2);
        }
        return d;
    }

    public static double checkSum(float[] fArr) {
        double d = 0.0d;
        int i = 0;
        while (i < fArr.length) {
            int i2 = i + 1;
            float f = i2;
            double d2 = (fArr[i] / f) + (fArr[i] % f);
            Double.isNaN(d2);
            d += d2;
            i = i2;
        }
        return d;
    }

    public static double checkSum(float[][] fArr) {
        double d = 0.0d;
        for (float[] fArr2 : fArr) {
            d += checkSum(fArr2);
        }
        return d;
    }

    public static long checkSum(Object[][] objArr) {
        long j = 0;
        for (Object[] objArr2 : objArr) {
            j += checkSum(objArr2);
        }
        return j;
    }

    public static long checkSum(Object[] objArr) {
        long j = 0;
        for (int i = 0; i < objArr.length; i++) {
            double d = j;
            double checkSum = checkSum(objArr[i]);
            double pow = Math.pow(2.0d, i);
            Double.isNaN(checkSum);
            Double.isNaN(d);
            j = (long) (d + (checkSum * pow));
        }
        return j;
    }

    public static long checkSum(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return obj.getClass().getCanonicalName().length();
    }

    public static byte[] byte1array(int i, byte b) {
        byte[] bArr = new byte[i];
        init(bArr, b);
        return bArr;
    }

    public static byte[][] byte2array(int i, byte b) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, i, i);
        init(bArr, b);
        return bArr;
    }

    public static short[] short1array(int i, short s) {
        short[] sArr = new short[i];
        init(sArr, s);
        return sArr;
    }

    public static short[][] short2array(int i, short s) {
        short[][] sArr = (short[][]) Array.newInstance(short.class, i, i);
        init(sArr, s);
        return sArr;
    }

    public static int[] int1array(int i, int i2) {
        int[] iArr = new int[i];
        init(iArr, i2);
        return iArr;
    }

    public static int[][] int2array(int i, int i2) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, i, i);
        init(iArr, i2);
        return iArr;
    }

    public static long[] long1array(int i, long j) {
        long[] jArr = new long[i];
        init(jArr, j);
        return jArr;
    }

    public static long[][] long2array(int i, long j) {
        long[][] jArr = (long[][]) Array.newInstance(long.class, i, i);
        init(jArr, j);
        return jArr;
    }

    public static float[] float1array(int i, float f) {
        float[] fArr = new float[i];
        init(fArr, f);
        return fArr;
    }

    public static float[][] float2array(int i, float f) {
        float[][] fArr = (float[][]) Array.newInstance(float.class, i, i);
        init(fArr, f);
        return fArr;
    }

    public static double[] double1array(int i, double d) {
        double[] dArr = new double[i];
        init(dArr, d);
        return dArr;
    }

    public static double[][] double2array(int i, double d) {
        double[][] dArr = (double[][]) Array.newInstance(double.class, i, i);
        init(dArr, d);
        return dArr;
    }

    public static char[] char1array(int i, char c) {
        char[] cArr = new char[i];
        init(cArr, c);
        return cArr;
    }

    public static char[][] char2array(int i, char c) {
        char[][] cArr = (char[][]) Array.newInstance(char.class, i, i);
        init(cArr, c);
        return cArr;
    }

    public static Object[] Object1array(int i, Object obj) {
        Object[] objArr = new Object[i];
        init(objArr, obj);
        return objArr;
    }

    public static Object[][] Object2array(int i, Object obj) {
        Object[][] objArr = (Object[][]) Array.newInstance(Object.class, i, i);
        init(objArr, obj);
        return objArr;
    }

    public static boolean[] boolean1array(int i, boolean z) {
        boolean[] zArr = new boolean[i];
        init(zArr, z);
        return zArr;
    }

    public static boolean[][] boolean2array(int i, boolean z) {
        boolean[][] zArr = (boolean[][]) Array.newInstance(boolean.class, i, i);
        init(zArr, z);
        return zArr;
    }

    public static synchronized void runThread(Runnable runnable) {
        synchronized (Test.class) {
            final Thread thread = new Thread(runnable);
            thread.start();
            runningThreads.incrementAndGet();
            new Thread(new Runnable() { // from class: Test.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        thread.join();
                        Test.runningThreads.decrementAndGet();
                    } catch (InterruptedException e) {
                    }
                }
            }).start();
        }
    }

    public static void joinThreads() {
        while (runningThreads.get() > 0) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
            }
        }
    }
}
