
import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/execution_failures/114/report-114/tmp/Test.dex */
class Test {
    int iFld;
    long instanceCount;

    Test() {
    }

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
        float f = 1.0f;
        while (true) {
            f += 1.0f;
            if (f >= 391.0f) {
                break;
            }
            vMeth(98, i, f);
        }
        this.instanceCount = -4982L;
        return ((long) i) > 0;
    }

    void mainTest(String[] strArr) {
        bMeth(this.iFld);
        PrintStream printStream = System.out;
        int i = this.iFld;
        printStream.println("iFld = " + i);
        PrintStream printStream2 = System.out;
        long j = this.instanceCount;
        printStream2.println("instanceCount = " + j);
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }
}
