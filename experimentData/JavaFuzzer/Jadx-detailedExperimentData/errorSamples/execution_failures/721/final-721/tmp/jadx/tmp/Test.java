
import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/721/final-721/tmp/Test.dex */
class Test {
    Test() {
    }

    void mainTest(String[] strArr) {
        int i = 6;
        int i2 = 2;
        while (i2 < 158) {
            int i3 = i2 % 4;
            if (i3 == 80) {
                i2 -= 37983;
            } else if (i3 != 87) {
                i2++;
            }
            i += i2;
            i2++;
        }
        PrintStream printStream = System.out;
        long doubleToLongBits = Double.doubleToLongBits(1.28617d);
        printStream.println("d i17 i18 = " + doubleToLongBits + "," + i2 + "," + i);
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }
}
