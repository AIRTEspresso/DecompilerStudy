package defpackage;

import java.io.PrintStream;
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/599/final-599/tmp/Test.dex */
class Test {
    boolean bFld;
    long instanceCount;
    int N = 400;
    float fFld = 41.231f;

    Test() {
    }

    void vMeth() {
        this.instanceCount = 188;
    }

    void mainTest(String[] strArr) {
        int i = this.N;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i, i);
        init(iArr, -31998);
        vMeth();
        int i2 = 1;
        do {
            float f = this.fFld - ((float) this.instanceCount);
            this.fFld = f;
            this.fFld = f + (i2 * i2) + 25055;
            i2++;
        } while (i2 < 154);
        int i3 = ((int) ((-46764) + 125.389f)) | (-30129);
        int i4 = -3;
        int i5 = 47564;
        int i6 = 99;
        byte b = 105;
        int i7 = 1;
        int i8 = -3;
        while (true) {
            if (this.bFld) {
                b = (byte) (b + i7);
                while (i8 < 72) {
                    i3 = (int) this.fFld;
                    i8++;
                }
            }
            i3 += (int) this.fFld;
            int i9 = 2;
            while (i9 < 72) {
                i3 += (i9 * i9) - 58865;
                int i10 = 1;
                while (i10 < 2) {
                    int i11 = (i5 * i6) >>> i4;
                    long j = this.instanceCount;
                    this.instanceCount = j >> ((int) j);
                    i10++;
                    i5 = i11;
                    i6 = (int) (i3 + ((i10 * i7) - this.fFld));
                    i4 = -3;
                }
                i9++;
                i4 = -3;
            }
            i7++;
            if (i7 < 352) {
                i4 = -3;
            } else {
                System.out.println(i2);
                PrintStream printStream = System.out;
                printStream.println("by2 i23 i24 = " + ((int) b) + i5);
                PrintStream printStream2 = System.out;
                long checkSum = checkSum(iArr);
                printStream2.println("i28 i29 iArr2 = -194," + i6 + "," + checkSum);
                return;
            }
        }
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }

    void init(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i2 % 2 == 0 ? i + i2 : i - i2;
        }
    }

    void init(int[][] iArr, int i) {
        for (int[] iArr2 : iArr) {
            init(iArr2, i);
        }
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

    long checkSum(int[][] iArr) {
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += checkSum(iArr2);
        }
        return j;
    }
}
