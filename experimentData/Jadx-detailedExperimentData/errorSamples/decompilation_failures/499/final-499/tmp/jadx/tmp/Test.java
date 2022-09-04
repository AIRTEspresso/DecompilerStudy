
import java.io.PrintStream;
import java.util.Random;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/499/final-499/tmp/Test.dex */
public class Test {
    public static final int N = 400;
    public static int[] iArrFld;
    public static long instanceCount = 2842853334L;
    public static float fFld = 2.87f;
    public static boolean bFld = false;
    public static byte byFld = -90;
    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static PrintStream out = System.out;
    public static Random random = new Random(1);
    public static long seed = 1;
    public static int UnknownZero = 0;

    static {
        int[] iArr = new int[N];
        iArrFld = iArr;
        init(iArr, -82);
    }

    public static long lMeth() {
        int[] iArr = new int[N];
        init(iArr, 14760);
        int i = 31096;
        int i2 = 136;
        int i3 = -6;
        int i4 = 9;
        while (301 > i4) {
            i2 = 6;
            while (i2 > i4) {
                instanceCount -= 10;
                i2 -= 2;
                i3 = 1;
                i = i4;
            }
            i4++;
        }
        long checkSum = (((((i4 + i) + i2) + 10) + i3) - 55006) + checkSum(iArr);
        lMeth_check_sum += checkSum;
        return checkSum;
    }

    public static float fMeth(int i, int i2, int i3) {
        boolean[] zArr = new boolean[N];
        long[] jArr = new long[N];
        int i4 = 0;
        init(zArr, false);
        init(jArr, 5L);
        double d = 1.0d;
        while (d < 181.0d) {
            long j = instanceCount + (-Math.abs((int) (-lMeth())));
            instanceCount = j;
            int i5 = (int) d;
            zArr[i5] = bFld;
            i2 *= i;
            jArr[i5] = i3;
            double d2 = byFld;
            Double.isNaN(d2);
            double d3 = j;
            Double.isNaN(d3);
            double d4 = (d2 * d) + d3;
            double d5 = i2;
            Double.isNaN(d5);
            i += (int) (d4 - d5);
            i4 = (i4 + i3) * i3;
            d += 1.0d;
        }
        long doubleToLongBits = i + i2 + i3 + Double.doubleToLongBits(d) + i4 + checkSum(zArr) + checkSum(jArr);
        fMeth_check_sum += doubleToLongBits;
        return (float) doubleToLongBits;
    }

    public static void vMeth(long j, long j2) {
        vMeth_check_sum += j + j2 + ((int) (-fMeth(216, 216, 216)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0142, code lost:
        if (defpackage.Test.bFld != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.mainTest(java.lang.String[]):void");
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

    public static void init(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            try {
                objArr[i] = obj.getClass().newInstance();
            } catch (Exception e) {
                objArr[i] = obj;
            }
        }
    }

    public static long checkSum(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return obj.getClass().getCanonicalName().length();
    }

    public static int[] int1array(int i, int i2) {
        int[] iArr = new int[i];
        init(iArr, i2);
        return iArr;
    }
}
