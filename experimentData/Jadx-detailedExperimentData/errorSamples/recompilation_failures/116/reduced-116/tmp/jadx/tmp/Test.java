
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/todo_8_9/eposide-1/116/reduced-116/tmp/Test.dex */
public class Test {
    public static int[] iArrFld;
    public int iFld = -43857;
    public static long instanceCount = -8933235804963499611L;
    public static boolean bFld = false;
    public static final int N = 400;
    public static double[] dArrFld = new double[N];
    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static PrintStream out = System.out;
    public static Random random = new Random(1);
    public static long seed = 1;
    public static int UnknownZero = 0;
    public static AtomicLong runningThreads = new AtomicLong(0);

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        init(iArr, 93);
        init(dArrFld, -106.100693d);
    }

    public static void vSmallMeth(int i, int i2, int i3) {
        float[] fArr = new float[N];
        init(fArr, 60.671f);
        fArr[(i2 >>> 1) % N] = -6.0f;
        vSmallMeth_check_sum += i + i2 + i3 + Double.doubleToLongBits(checkSum(fArr));
    }

    public static void vMeth1(double d, float f, int i) {
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        init(iArr, -14);
        init(jArr, 95L);
        iArr[46] = i;
        int i2 = 4;
        while (i2 < 326) {
            long j = i;
            instanceCount = j;
            instanceCount = j + j;
            i2++;
        }
        int i3 = (i2 >>> 1) % N;
        jArr[i3] = jArr[i3] & 10;
        float f2 = f;
        long j2 = 6838349389279639813L;
        int i4 = 156;
        int i5 = -44421;
        int i6 = -11;
        while (i4 > 6) {
            long j3 = instanceCount;
            iArr[i4 + 1] = (int) j3;
            i5 = (int) j3;
            f2 -= i2;
            j2 = 11;
            while (j2 > 1) {
                instanceCount += j2 - j2;
                i6 += 166;
                j2 -= 2;
            }
            i4--;
        }
        int i7 = 2;
        int i8 = -213;
        while (i7 < 201) {
            i5 += i7;
            i8 += i7 * i7;
            i7++;
        }
        vMeth1_check_sum += ((((((((Double.doubleToLongBits(d) + Float.floatToIntBits(f2)) + i) + i2) + i5) + i4) + i6) + j2) - 234) + i7 + i8 + checkSum(iArr) + checkSum(jArr);
    }

    public static short sMeth(long j, long j2, int i) {
        long j3;
        int i2;
        int[] iArr = new int[N];
        int[][][] iArr2 = (int[][][]) Array.newInstance(int.class, N, N, N);
        long[] jArr = new long[N];
        init(jArr, 3188266214L);
        init(iArr, 204);
        init((Object[][]) iArr2, (Object) (-62320));
        float f = -34.42f;
        vMeth1(108.69093d, -34.42f, -35740);
        int i3 = 112;
        int i4 = 128;
        do {
            jArr[i4] = i;
            i2 = 12;
            while (i2 > i4) {
                f = (float) 108.69093d;
                i2--;
                i3 = 1;
            }
            iArr[i4] = -46295;
            i4--;
        } while (i4 > 0);
        int i5 = -41008;
        int i6 = 6;
        while (272 > i6) {
            i5 = 1;
            while (6 > i5) {
                f = 8.0f;
                i5++;
            }
            i6++;
        }
        long doubleToLongBits = (((((((((((j + j2) + j3) + Double.doubleToLongBits(108.69093d)) + Float.floatToIntBits(f)) + i4) + i2) - 38321) + i3) - 46295) + i6) - 11) + i5 + 1899 + checkSum(jArr) + checkSum(iArr) + checkSum((Object[][]) iArr2);
        sMeth_check_sum += doubleToLongBits;
        return (short) doubleToLongBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void vMeth(boolean z, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = 239;
        int i6 = 11;
        int i7 = -32;
        int i8 = 16;
        float f = 0.673f;
        int i9 = 10;
        while (265 > i9) {
            int i10 = i4 + 1;
            long j = instanceCount;
            vSmallMeth(i9, (int) (i4 % ((sMeth(j, j, i9) + instanceCount) | 1)), 206);
            if (z == 0) {
                i4 = i10;
            } else {
                long j2 = i9;
                instanceCount = j2;
                int[] iArr = iArrFld;
                int i11 = i9 + 1;
                iArr[i11] = iArr[i11] - i5;
                i5 = (int) (i5 + (((j2 * j2) + i3) - j2));
                i4 = i10 + i9;
            }
            float f2 = f;
            int i12 = i8;
            int i13 = i7;
            int i14 = 1;
            while (i14 < 6) {
                f2 -= (float) instanceCount;
                i13 *= i5;
                double[] dArr = dArrFld;
                double d = dArr[i14];
                double d2 = i4;
                Double.isNaN(d2);
                dArr[i14] = d + d2;
                i12 = 1;
                while (i12 < 2) {
                    if (i3 != 0) {
                        vMeth_check_sum += ((((((((i3 + z) + i4) + i9) + i5) + i14) + i13) + Float.floatToIntBits(f2)) + i12) - 201;
                        return;
                    } else {
                        i3 = (i3 * ((int) instanceCount)) - 49;
                        i12++;
                    }
                }
                i14++;
            }
            i9++;
            i6 = i14;
            i7 = i13;
            i8 = i12;
            f = f2;
        }
        vMeth_check_sum += ((((((((i3 + (z ? 1 : 0)) + i4) + i9) + i5) + i6) + i7) + Float.floatToIntBits(f)) + i8) - 201;
    }

    public void mainTest(String[] strArr) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, N, N);
        long[] jArr = new long[N];
        init(iArr, 0);
        init(jArr, -7L);
        for (int i = 0; i < 204; i++) {
            vSmallMeth(960, 960, 960);
        }
        int i2 = 960 * ((int) 0.79700005f);
        vMeth(bFld, i2, i2);
        int i3 = i2 ^ i2;
        int i4 = -13;
        int i5 = 161;
        int i6 = 1;
        while (i6 < 192) {
            int i7 = ((i6 % 2) * 5) + 121;
            int i8 = 131;
            if (i7 == 126) {
                while (i8 > i6) {
                    i8--;
                    i5 = 1;
                }
                i4 = i8;
            } else if (i7 == 131) {
                i3 -= (int) (-72.86975d);
            }
            i6++;
        }
        System.out.println("i3 f i30 = " + i3 + "," + Float.floatToIntBits(0.79700005f) + "," + i6);
        System.out.println("i31 i32 i33 = -9," + i4 + ",-16687");
        System.out.println("i34 i35 d2 = " + i5 + ",-235," + Double.doubleToLongBits(-72.86975d));
        System.out.println("iArr3 lArr2 = " + checkSum(iArr) + "," + checkSum(jArr));
        PrintStream printStream = System.out;
        long j = instanceCount;
        boolean z = bFld;
        printStream.println("Test.instanceCount Test.bFld iFld = " + j + "," + (z ? 1 : 0) + "," + this.iFld);
        System.out.println("Test.iArrFld Test.dArrFld = " + checkSum(iArrFld) + "," + Double.doubleToLongBits(checkSum(dArrFld)));
        System.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
        System.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        System.out.println("sMeth_check_sum: " + sMeth_check_sum);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
