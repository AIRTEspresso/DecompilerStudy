
import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/execution_failures/162/final-162/tmp/Test.dex */
public class Test {
    static int N = 400;
    static float fFld;
    int iFld;
    long instanceCount;

    void vMeth1(int i, int i2) {
        int[] iArr = new int[N];
        int i3 = 46;
        int i4 = 1;
        while (true) {
            i4++;
            if (i4 < 331) {
                while (true) {
                    i3 += 3;
                    if (i3 < 5) {
                        iArr[i3] = (int) fFld;
                    }
                }
            } else {
                return;
            }
        }
    }

    public void mainTest(String[] strArr) {
        int[] iArr = new int[N];
        init(iArr, -11272);
        vMeth1(44170, this.iFld);
        PrintStream printStream = System.out;
        long checkSum = checkSum(iArr);
        printStream.println("iArr = " + checkSum);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void init(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i - i2;
        }
    }

    public static long checkSum() {
        return 0L;
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
}
