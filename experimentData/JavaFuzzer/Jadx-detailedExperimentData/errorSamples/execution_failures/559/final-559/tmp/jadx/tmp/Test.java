/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/559/final-559/tmp/Test.dex */
class Test {
    int N = 400;
    int[] iArrFld = new int[400];
    long instanceCount;

    Test() {
    }

    void mainTest(String[] strArr) {
        long[] jArr = new long[this.N];
        int i = 1;
        float f = -123.205f;
        int i2 = 4;
        int i3 = 43173;
        int i4 = 11;
        int i5 = 1;
        while (i5 < 278) {
            int i6 = 1;
            while (true) {
                float f2 = 31.0f * f;
                i6 += i;
                if (i6 < 91) {
                    f = f2;
                    i = 1;
                } else {
                    try {
                        this.iArrFld[i5] = 1365758419 / i4;
                        i3 = this.iArrFld[i5] / i6;
                    } catch (ArithmeticException e) {
                    }
                    for (int i7 = 1; i7 < 91; i7++) {
                        int i8 = 1;
                        while (i8 < 2) {
                            this.instanceCount += i2;
                            i8++;
                        }
                        i3 += i7 * (-32473);
                        switch ((i7 % 4) + 123) {
                            case 123:
                                i2 += i7;
                            case 124:
                                this.iArrFld[i5] = 197;
                                i4 >>= i8;
                                break;
                        }
                        int i9 = i5;
                        while (i9 < 2) {
                            jArr[i7] = jArr[i7] - i6;
                            i9 += 2;
                            i2 = i2;
                        }
                    }
                    i5++;
                    f = f2;
                    i = 1;
                }
            }
        }
        System.out.println("i f3 i14 = " + i3 + "," + Float.floatToIntBits(f) + "," + i5);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
