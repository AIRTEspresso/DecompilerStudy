package defpackage;

import java.io.PrintStream;
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/599/report-599/tmp/Test.dex */
class Test {
    int N;
    boolean bFld;
    float fFld = 41.231f;
    long instanceCount;

    Test() {
    }

    void vMeth() {
        this.instanceCount = 188;
    }

    void mainTest(String[] strArr) {
        int i = this.N;
        int i2 = 2;
        int i3 = 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i, i);
        vMeth();
        int i4 = 1;
        while (true) {
            float f = this.fFld - ((float) this.instanceCount);
            this.fFld = f;
            this.fFld = f + (i4 * i4) + 25055;
            i4++;
            if (i4 >= 154) {
                break;
            }
            i2 = 2;
        }
        int i5 = ((int) ((-46764) + 125.389f)) | (-30129);
        int i6 = -3;
        int i7 = 47564;
        int i8 = 99;
        byte b = 105;
        int i9 = 1;
        int i10 = -3;
        while (true) {
            if (this.bFld) {
                b = (byte) (b + i9);
                while (i10 < 72) {
                    i5 = (int) this.fFld;
                    i10++;
                }
            }
            i5 += (int) this.fFld;
            int i11 = 2;
            while (i11 < 72) {
                i5 += (i11 * i11) - 58865;
                int i12 = 1;
                while (i12 < i2) {
                    int i13 = (i7 * i8) >>> i6;
                    long j = this.instanceCount;
                    this.instanceCount = j >> ((int) j);
                    i12++;
                    i7 = i13;
                    i6 = -3;
                    i8 = (int) (i5 + ((i12 * i9) - this.fFld));
                    i2 = 2;
                }
                i11++;
                i2 = 2;
                i6 = -3;
            }
            i3++;
            i9++;
            if (i9 < 352) {
                i2 = 2;
                i6 = -3;
            } else {
                PrintStream printStream = System.out;
                printStream.println("loopcount:" + i3);
                System.out.println(i4);
                PrintStream printStream2 = System.out;
                printStream2.println("by2 i23 i24 = " + ((int) b) + i7);
                PrintStream printStream3 = System.out;
                printStream3.println("i28 i29 iArr2 = " + i8 + iArr);
                return;
            }
        }
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }
}
