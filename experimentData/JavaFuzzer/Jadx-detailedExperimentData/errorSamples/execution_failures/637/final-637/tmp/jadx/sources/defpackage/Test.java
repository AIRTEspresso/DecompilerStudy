package defpackage;

import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/637/final-637/tmp/Test.dex */
class Test {
    int N = 400;
    int[] iArrFld;
    long instanceCount;
    long vMeth_check_sum;

    Test() {
        int[] iArr = new int[400];
        this.iArrFld = iArr;
        init(iArr, -29690);
    }

    void vMeth(int i, int i2) {
        long[] jArr = new long[this.N];
        init(jArr, -235669650L);
        int i3 = -10;
        int i4 = 11;
        while (i4 < 360) {
            int i5 = ((i4 % 10) * 5) + 15;
            if (i5 != 25) {
                if (i5 != 32) {
                    if (i5 != 40) {
                        jArr[i4] = jArr[i4] - 2554576780295895974L;
                    }
                    i4++;
                } else {
                    i3 = -1;
                }
            }
            this.instanceCount -= i2;
            i4++;
        }
        System.out.println("i8:" + i3);
        System.out.println("lArr:" + checkSum(jArr));
        this.vMeth_check_sum = this.vMeth_check_sum + ((long) (i + i2 + i4 + i3 + Float.floatToIntBits(1.695f) + (-219) + 64791 + 1)) + Double.doubleToLongBits(108.98677d) + checkSum(jArr);
    }

    int iMeth(int i) {
        int i2 = this.iArrFld[i >> 1];
        vMeth(i2, i2);
        return i2;
    }

    void mainTest(String[] strArr) {
        for (int i = 2; 228 > i; i++) {
            this.instanceCount = iMeth(i);
        }
        PrintStream printStream = System.out;
        long j = this.vMeth_check_sum;
        printStream.println("vMeth_check_sum: " + j);
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }

    void init(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = i % 2 == 0 ? i + j : j - i;
        }
    }

    void init(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i2 % 2 == 0 ? i + i2 : i - i2;
        }
    }

    long checkSum(long[] jArr) {
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
}
