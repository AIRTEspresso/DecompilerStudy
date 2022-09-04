/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/execution_failures/114/final-114/tmp/Test.dex */
public class Test {
    int iFld;
    int N = 400;
    long instanceCount = 6410838818528573617L;

    void vMeth1() {
        this.iFld = (int) this.instanceCount;
    }

    void vMeth(int i, int i2, float f) {
        vMeth1();
        for (int i3 = 11; 327 > i3; i3++) {
            for (int i4 = 1; i4 < 5; i4++) {
                int i5 = i3 % 2;
                if (i5 == 56) {
                    this.instanceCount -= 0;
                } else if (i5 != 58) {
                }
                this.instanceCount += i3;
            }
        }
    }

    boolean bMeth(int i) {
        int i2 = (int) this.instanceCount;
        float f = 1.0f;
        while (true) {
            f += 1.0f;
            if (f >= 391.0f) {
                break;
            }
            vMeth(98, i2, f);
        }
        this.instanceCount = -4982L;
        return ((long) (i2 + Float.floatToIntBits(f))) > 0;
    }

    void mainTest(String[] strArr) {
        int i = this.N;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        boolean[] zArr = new boolean[i];
        init(zArr, false);
        init(iArr, -40735);
        init(iArr2, 41);
        float f = 311.0f;
        while (true) {
            f -= 3.0f;
            if (f <= 0.0f) {
                break;
            }
            zArr[(int) f] = bMeth(this.iFld);
        }
        System.out.println("iFld = " + this.iFld);
        System.out.println("instanceCount = " + this.instanceCount);
        this.instanceCount = -4982L;
        for (int i2 = 21; i2 < 363; i2++) {
            long j = this.instanceCount - 27196;
            this.instanceCount = j;
            this.instanceCount = j & 32499;
            for (int i3 = 2; i3 < 74; i3++) {
                long j2 = this.instanceCount - 95;
                this.instanceCount = j2;
                int i4 = this.iFld >>> i2;
                this.iFld = i4;
                iArr2[i2] = (int) j2;
                long j3 = j2 - i4;
                this.instanceCount = j3;
                iArr2[i2] = iArr2[i2] - 9;
                this.iFld = (int) (j3 | i4);
            }
        }
        System.out.println("iArr2 = " + checkSum(iArr2));
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }

    void init(boolean[] zArr, boolean z) {
        for (int i = 0; i < zArr.length; i++) {
            zArr[i] = i % 2 == 0 ? z : i % 3 == 0;
        }
    }

    void init(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i2 % 2 == 0 ? i + i2 : i - i2;
        }
    }

    long checkSum(boolean[] zArr) {
        long j = 0;
        for (int i = 0; i < zArr.length; i++) {
            j += zArr[i] ? i + 1 : 0L;
        }
        return j;
    }

    long checkSum(int[] iArr) {
        long j = 0;
        int i = 0;
        while (i < iArr.length) {
            int i2 = i + 1;
            j += (iArr[i] / i2) + (iArr[i] % i2);
            i = i2;
        }
        return j;
    }
}
