package defpackage;

import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/489/final-489/tmp/Test.dex */
class Test {
    float fFld;
    int N = 400;
    long instanceCount = 2184208139L;

    Test() {
    }

    void mainTest(String[] strArr) {
        int i = this.N;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i, i);
        long j = this.instanceCount - (-81);
        this.instanceCount = j;
        double d = j;
        int i2 = 4042;
        int i3 = 236;
        int i4 = 13;
        int i5 = 69;
        int i6 = 58610;
        int i7 = 17;
        while (i7 < 292) {
            while (true) {
                if (i4 < 91) {
                    this.instanceCount = this.instanceCount;
                    i4++;
                } else {
                    int i8 = 3;
                    for (int i9 = 91; i8 < i9; i9 = 91) {
                        int[] iArr2 = iArr[8];
                        int i10 = i8 - 1;
                        iArr2[i10] = iArr2[i10] - 17695;
                        int[] iArr3 = iArr[1];
                        iArr3[i7] = iArr3[i7] * 132;
                        if (i8 != 24) {
                            switch (i8) {
                                case 19:
                                    i2 = i5 / 598520166;
                                case 20:
                                    i5 += i8;
                                case 21:
                                    for (int i11 = 1; i11 < 2; i11++) {
                                        this.fFld -= i6;
                                    }
                                    break;
                            }
                            i8++;
                            i3 = 17695;
                        }
                        i6 = 65;
                        i8++;
                        i3 = 17695;
                    }
                    i7++;
                }
            }
        }
        System.out.println("d3 i17 i18 = " + Double.doubleToLongBits(d) + "," + i2 + "," + i7);
        System.out.println(i3);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
