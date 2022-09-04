
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/619/reduced-619/tmp/Test.dex */
public class Test {
    public float fFld = -1.652f;
    public int iFld1 = -29538;
    public static long instanceCount = 163288996;
    public static volatile float fFld1 = 2.253f;
    public static boolean bFld = false;
    public static int iFld = 13;
    public static final int N = 400;
    public static volatile int[] iArrFld = new int[N];
    public static long bMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static PrintStream out = System.out;
    public static Random random = new Random(1);
    public static long seed = 1;
    public static int UnknownZero = 0;
    public static AtomicLong runningThreads = new AtomicLong(0);

    static {
        init(iArrFld, -11732);
    }

    public static int iMeth() {
        long j;
        int i;
        int[] iArr = new int[N];
        init(iArr, 13);
        int i2 = 10;
        int i3 = -231;
        int i4 = 0;
        int i5 = -6;
        int i6 = 12;
        float f = 2.717f;
        int i7 = 2;
        while (i7 < 189) {
            float f2 = f;
            int i8 = i6;
            int i9 = i5;
            int i10 = i4;
            int i11 = 1;
            while (i11 < 9) {
                i10 &= (int) instanceCount;
                i2 >>= i10;
                instanceCount = ((float) j) - 200.0f;
                f2 = 2.0f;
                i9 = 1;
                while (i9 < 2) {
                    fFld1 += (float) (((i9 * i8) + instanceCount) - i11);
                    fFld1 = i8;
                    if (bFld) {
                        i = i8;
                    } else {
                        i10 += i9;
                        iArr[i9] = iArr[i9] >>> i8;
                        instanceCount = i8;
                        i = i8 + 8231;
                    }
                    i9++;
                    int i12 = i8;
                    i8 = i;
                    i2 = i12;
                }
                i11++;
            }
            i7++;
            i3 = i11;
            i4 = i10;
            i5 = i9;
            i6 = i8;
            f = f2;
        }
        long floatToIntBits = i7 + i2 + i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + checkSum(iArr);
        iMeth_check_sum += floatToIntBits;
        return (int) floatToIntBits;
    }

    public static void vMeth(short s, int i) {
        vMeth_check_sum += s + ((int) (iMeth() + fFld1));
    }

    public boolean bMeth(int i, int i2, int i3) {
        int i4;
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        init(jArr, 4005670795L);
        init(iArr, 241);
        int i5 = (i2 >>> 1) % N;
        long j = jArr[i5];
        jArr[i5] = j - 1;
        int i6 = 1;
        int i7 = i;
        int i8 = i2;
        int i9 = ((int) j) * i3;
        int i10 = 214;
        int i11 = -37467;
        int i12 = 52110;
        int i13 = 13;
        int i14 = 1;
        while (true) {
            i14 += i6;
            if (i14 < 325) {
                this.fFld += i14;
                if (bFld) {
                    vMeth((short) -21472, i7);
                }
                int i15 = 1;
                while (true) {
                    if (i15 >= 5 || bFld) {
                        break;
                    }
                    i15++;
                }
                int i16 = ((i14 % 8) * 5) + 78;
                if (i16 == 80) {
                    iFld <<= i7;
                } else if (i16 == 96) {
                    i12 = 1;
                    for (i4 = 5; i12 < i4; i4 = 5) {
                        long j2 = instanceCount + i14;
                        instanceCount = j2;
                        int i17 = ((i14 % 5) * 5) + 80;
                        if (i17 == 82) {
                            i13 += i12;
                        } else if (i17 == 83) {
                            instanceCount = j2 + i12;
                        } else if (i17 == 92) {
                            iArr[i14] = iArr[i14] - i8;
                            instanceCount = j2 << i15;
                            if (i15 != 0) {
                                return ((int) (((((long) ((((((((i7 + i8) + i9) + i14) + (-21472)) + i15) + i11) + i12) + i13)) + Double.doubleToLongBits(-37.50236d)) + checkSum(jArr)) + checkSum(iArr))) % 2 > 0;
                            }
                            int i18 = i14 - 1;
                            jArr[i18] = jArr[i18] - i11;
                        } else if (i17 == 97) {
                            instanceCount = j2 >> i11;
                        } else if (i17 == 103) {
                            int i19 = i14 + 1;
                            jArr[i19] = jArr[i19] + iFld;
                        } else {
                            iFld += (int) ((i12 * i12) + 2);
                        }
                        i12++;
                    }
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 98) {
                    i13 += i14;
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 100) {
                    i11 -= (int) (-37.50236d);
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 109) {
                    try {
                        i7 = (-956246768) / i14;
                        iArr[i14] = iArr[i14 - 1] / 150;
                        iFld = i15 / (-185);
                        i10 = i15;
                        i6 = 1;
                    } catch (ArithmeticException e) {
                        i10 = i15;
                        i6 = 1;
                    }
                } else if (i16 == 118) {
                    i8 *= i11;
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 84) {
                    i9 += i14 * i14;
                    i10 = i15;
                    i6 = 1;
                } else if (i16 == 85) {
                    instanceCount = instanceCount;
                } else {
                    i10 = i15;
                    i6 = 1;
                    i7 = 2;
                }
                i10 = i15;
                i6 = 1;
            } else {
                long doubleToLongBits = ((((i7 + i8) + i9) + i14) - 21472) + i10 + i11 + i12 + i13 + Double.doubleToLongBits(-37.50236d) + checkSum(jArr) + checkSum(iArr);
                bMeth_check_sum += doubleToLongBits;
                return doubleToLongBits % 2 > 0;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int i = 9;
        double d = 126.6426d;
        int i2 = 9;
        int i3 = 2353;
        int i4 = -229;
        int i5 = -4;
        int i6 = 14521;
        int i7 = 55344;
        float f = 24.88f;
        float f2 = -1.122f;
        boolean z = false;
        while (i < 337) {
            i2 = 3;
            while (77 > i2) {
                long j = i4;
                long j2 = i2;
                i4 = (int) (j + (((instanceCount * j2) + j2) - j));
                i3 >>= ((i << i3) * Math.abs(-22432)) + i4;
                f = 1.0f;
                while (f < 2.0f) {
                    f2 += -(((float) (instanceCount % (-11))) + (-55125.0f) + f);
                    int i8 = iFld;
                    z = bMeth(i8, i8, i3);
                    this.fFld = (float) instanceCount;
                    iArrFld = iArrFld;
                    i5 += (int) (((iFld * f) + i5) - ((float) instanceCount));
                    int i9 = this.iFld1 + i5;
                    this.iFld1 = i9;
                    int i10 = i9 << i2;
                    this.iFld1 = i10;
                    i3 *= -12;
                    this.iFld1 = i10 + ((int) (f * f));
                    double d2 = i3;
                    Double.isNaN(d2);
                    d -= d2;
                    f += 1.0f;
                }
                i2++;
            }
            int i11 = 2;
            while (77 > i11) {
                if (!z) {
                    this.iFld1 ^= 25;
                }
                i11++;
            }
            int i12 = i + 1;
            iArrFld[i12] = i;
            i6 = i11;
            i = i12;
            i7 = 45900;
        }
        instanceCount = i2;
        int i13 = 6;
        int i14 = 24924;
        byte b = -12;
        int i15 = i7;
        while (true) {
            int i16 = i14;
            if (i13 < 357) {
                long j3 = fFld1;
                instanceCount = j3;
                i14 = (int) j3;
                i15 *= (int) j3;
                instanceCount = -43125L;
                b = (byte) (b * ((byte) i2));
                this.iFld1 >>= iFld;
                i13++;
                i6 = i6;
                i5 = 25;
            } else {
                int i17 = i6;
                System.out.println("i i1 i2 = " + i + "," + i7 + "," + i2);
                System.out.println("i3 f i4 = " + i4 + "," + Float.floatToIntBits(f) + "," + i5);
                PrintStream printStream = System.out;
                int floatToIntBits = Float.floatToIntBits(f2);
                StringBuilder sb = new StringBuilder();
                sb.append("f1 by b = ");
                sb.append(floatToIntBits);
                sb.append(",");
                sb.append((int) b);
                sb.append(",");
                int i18 = z ? 1 : 0;
                int i19 = z ? 1 : 0;
                int i20 = z ? 1 : 0;
                int i21 = z ? 1 : 0;
                sb.append(i18);
                printStream.println(sb.toString());
                System.out.println("d1 i20 i21 = " + Double.doubleToLongBits(d) + "," + i17 + "," + i15);
                System.out.println("by1 i22 i23 = 25," + i13 + "," + i16);
                System.out.println("Test.instanceCount fFld Test.fFld1 = " + instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + Float.floatToIntBits(fFld1));
                PrintStream printStream2 = System.out;
                boolean z2 = bFld;
                printStream2.println("Test.bFld Test.iFld iFld1 = " + (z2 ? 1 : 0) + "," + iFld + "," + this.iFld1);
                PrintStream printStream3 = System.out;
                long checkSum = checkSum(iArrFld);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Test.iArrFld = ");
                sb2.append(checkSum);
                printStream3.println(sb2.toString());
                System.out.println("iMeth_check_sum: " + iMeth_check_sum);
                System.out.println("vMeth_check_sum: " + vMeth_check_sum);
                System.out.println("bMeth_check_sum: " + bMeth_check_sum);
                return;
            }
        }
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
