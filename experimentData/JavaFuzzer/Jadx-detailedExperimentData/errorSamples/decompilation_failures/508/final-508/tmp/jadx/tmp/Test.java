/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/508/final-508/tmp/Test.dex */
class Test {
    int[] iArrFld;
    int iFld;
    int iFld1;
    long instanceCount = 49446;
    long vMeth_check_sum;

    Test() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r5 != 57) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void vMeth(int r5) {
        /*
            r4 = this;
            long r0 = r4.instanceCount
            r2 = 1
            long r0 = r0 - r2
            r4.instanceCount = r0
            r0 = 49
            r1 = 94
            if (r5 == r0) goto L13
            r0 = 57
            if (r5 == r0) goto L18
            goto L21
        L13:
            int r0 = r4.iFld
            int r0 = r0 / r1
            r4.iFld = r0
        L18:
            int[] r0 = r4.iArrFld
            r2 = r0[r1]
            int r3 = r4.iFld1
            int r2 = r2 >>> r3
            r0[r1] = r2
        L21:
            long r0 = r4.vMeth_check_sum
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.vMeth_check_sum = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(int):void");
    }

    void mainTest(String[] strArr) {
        vMeth(this.iFld);
        int i = 74;
        int i2 = 249;
        int i3 = 11;
        while (i2 > 13) {
            while (i < 106) {
                i3 += i;
                int i4 = ((i3 >> 1) % 9) + 7;
                if (i4 != 10) {
                    if (i4 == 11) {
                        i3 >>= (int) this.instanceCount;
                    }
                } else {
                    i3 = 31988;
                }
                i++;
            }
            i2--;
        }
        System.out.println("i20 i21 i22 = " + i2 + "," + i3 + "," + i);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
