
import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/325/final-325/tmp/Test.dex */
class Test {
    int N = 400;

    Test() {
    }

    void mainTest(String[] strArr) {
        int[] iArr = new int[this.N];
        init(iArr, 57814);
        int i = 14;
        for (int i2 = 2; i2 < 151; i2++) {
            for (int i3 = 4; i3 < 168; i3++) {
                if (i2 == 113) {
                    i += i3;
                } else if (i2 != 135) {
                    i >>= 53209;
                }
                i += i3;
            }
        }
        PrintStream printStream = System.out;
        long checkSum = checkSum(iArr);
        printStream.println("i22 i23 iArr2 = " + i + ",-12462," + checkSum);
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }

    void init(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i2 % 2 == 0 ? i + i2 : i;
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
}
