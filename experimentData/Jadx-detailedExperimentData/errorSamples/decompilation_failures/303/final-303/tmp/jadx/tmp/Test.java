/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/303/final-303/tmp/Test.dex */
class Test {
    double dFld;
    float fFld;
    long instanceCount;
    int N = 400;
    int[] iArrFld = new int[400];

    Test() {
    }

    void vMeth(int i, long j, int i2) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    void mainTest(String[] strArr) {
        int i;
        long[] jArr = new long[this.N];
        int i2 = 2;
        int i3 = 107;
        int i4 = 34934;
        int i5 = 71;
        int i6 = 191;
        while (i6 > 3) {
            int[] iArr = this.iArrFld;
            int i7 = iArr[i6];
            int i8 = 133;
            switch ((i6 % 9) + 41) {
                case 41:
                    while (true) {
                        int i9 = i8 - 1;
                        long j = jArr[i9];
                        int i10 = i4;
                        long j2 = this.instanceCount - i8;
                        this.instanceCount = j2;
                        jArr[i9] = j >>> ((int) j2);
                        i8--;
                        if (i8 > 0) {
                            i4 = i10;
                        } else {
                            vMeth(i7, j2, i7);
                            i4 = i10;
                            while (true) {
                                i4--;
                                if (i4 <= 0) {
                                    i2 = i7;
                                    i3 = i8;
                                    break;
                                } else {
                                    i7 *= i7;
                                }
                            }
                        }
                    }
                case 42:
                case 45:
                default:
                    i = i4;
                    i4 = i;
                    i2 = i7;
                    break;
                case 43:
                case 44:
                    iArr[i6] = i5;
                    i = i4;
                    i4 = i;
                    i2 = i7;
                    break;
                case 46:
                    int i11 = i5;
                    int i12 = 6;
                    while (i12 < 133) {
                        try {
                            i6 = 3 % i3;
                        } catch (ArithmeticException e) {
                        }
                        i12++;
                        i11 = 229;
                    }
                    i5 = i11;
                    this.fFld = (float) this.dFld;
                    i2 = i7;
                    break;
                case 47:
                    this.fFld = (float) this.dFld;
                    i2 = i7;
                    break;
            }
            i6--;
        }
        System.out.println("i i1 i2 = " + i6 + "," + i2 + "," + i3);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
