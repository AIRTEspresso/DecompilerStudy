package defpackage;

import java.io.PrintStream;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/401/report-401/tmp/Test.dex */
class Test {
    static long instanceCount;
    final int N = 400;
    short sFld = -53;
    int[] iArrFld = new int[400];

    Test() {
    }

    void mainTest(String[] strArr) {
        long[] jArr = new long[400];
        int i = 19681;
        float f = 65.63f;
        int i2 = 1;
        do {
            f *= i2;
            i <<= (int) 18.102586d;
            i2++;
        } while (i2 < 133);
        System.out.println(i);
        System.out.println(i2);
        int i3 = 12;
        int i4 = 51019;
        int i5 = 10;
        int i6 = 7;
        while (i3 < 212) {
            int[] iArr = this.iArrFld;
            int i7 = i3 + 1;
            iArr[i7] = iArr[i7] & i4;
            int i8 = i;
            int i9 = i4;
            int i10 = i6;
            int i11 = 7;
            while (i11 < 126) {
                long j = instanceCount;
                i8 += i11;
                jArr[1] = jArr[1] - j;
                i11++;
                i9 = (int) (this.sFld + (i11 | j));
                i10 = 1;
            }
            jArr[i2 % 400] = instanceCount;
            instanceCount = i8;
            do {
                i5++;
            } while (i5 < 126);
            i = i8;
            i3 = i7;
            i4 = i9;
            i6 = i10;
        }
        PrintStream printStream = System.out;
        printStream.println("i i1 by = " + i + "," + i4 + ",-11");
        PrintStream printStream2 = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("i2 f i14 = ");
        sb.append(f);
        sb.append(i3);
        printStream2.println(sb.toString());
        System.out.println(i6);
    }

    public static void main(String[] strArr) {
        new Test().mainTest(strArr);
    }
}
