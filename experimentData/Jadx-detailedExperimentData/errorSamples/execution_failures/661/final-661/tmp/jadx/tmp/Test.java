
import java.io.PrintStream;
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/661/final-661/tmp/Test.dex */
class Test {
    int N = 400;
    float fFld;

    Test() {
    }

    void mainTest(String[] strArr) {
        int i = this.N;
        float[][] fArr = (float[][]) Array.newInstance(float.class, i, i);
        init(fArr, -114.1013f);
        int i2 = 10;
        int i3 = 11;
        while (i3 < 382) {
            int i4 = ((i3 % 9) * 5) + 20;
            if (i4 == 30) {
                i2 = 1;
                do {
                    i2++;
                } while (i2 < 68);
            } else if (i4 != 35) {
                if (i4 != 52) {
                    if (i4 == 65) {
                        i3 = (int) this.fFld;
                    }
                }
                float[] fArr2 = fArr[i3];
                int i5 = i3 + 1;
                fArr2[i5] = fArr2[i5] + i2;
            }
            i3++;
        }
        PrintStream printStream = System.out;
        long doubleToLongBits = Double.doubleToLongBits(checkSum(fArr));
        printStream.println("fArr = " + doubleToLongBits);
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }

    void init(float[] fArr, float f) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = i % 2 == 0 ? i + f : f - i;
        }
    }

    void init(float[][] fArr, float f) {
        for (float[] fArr2 : fArr) {
            init(fArr2, f);
        }
    }

    double checkSum(float[] fArr) {
        double d = 0.0d;
        int i = 0;
        while (i < fArr.length) {
            int i2 = i + 1;
            float f = i2;
            double d2 = (fArr[i] / f) + (fArr[i] % f);
            Double.isNaN(d2);
            d += d2;
            i = i2;
        }
        return d;
    }

    double checkSum(float[][] fArr) {
        double d = 0.0d;
        for (float[] fArr2 : fArr) {
            d += checkSum(fArr2);
        }
        return d;
    }
}
