
import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/300/final-300/tmp/Test.dex */
class Test {
    int N;
    float fFld;
    long instanceCount = 218;
    long vMeth1_check_sum;

    Test() {
    }

    void vMeth1(byte b, long j, int i) {
        long[] jArr = new long[this.N];
        float f = 101.7f;
        int i2 = 14;
        while (i2 < 284) {
            int i3 = ((i2 % 5) * 5) + 99;
            if (i3 != 103) {
                if (i3 == 104) {
                    float f2 = 1.0f;
                    while (true) {
                        f2 += 1.0f;
                        if (f2 >= 6.0f) {
                            break;
                        }
                        this.instanceCount += f2;
                    }
                    f = f2;
                } else if (i3 != 108) {
                }
                i2++;
            }
            this.fFld -= 125;
            i2++;
        }
        this.vMeth1_check_sum += b + i2 + Float.floatToIntBits(f);
    }

    void vMeth(int i, int i2) {
        vMeth1((byte) 54, this.instanceCount, i2);
    }

    void mainTest(String[] strArr) {
        int i = -55683;
        for (int i2 = 24; i2 < 390; i2++) {
            vMeth(i2, i2);
            i = (int) (i + (((i2 * 11) + 11) - this.instanceCount));
        }
        PrintStream printStream = System.out;
        printStream.println("i19 i20 by3 = -16903," + i + ",23");
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }
}
