package defpackage;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/203/report-203/tmp/Test.dex */
class Test {
    int N = 400;
    long instanceCount;

    Test() {
    }

    void vMeth1(int i, long j, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void vMeth(int r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r6 = 1
        L3:
            r0 = 1
        L4:
            r1 = 6
            if (r0 >= r1) goto L1e
            r1 = 44
            if (r6 == r1) goto Lc
            goto L1b
        Lc:
            long r1 = r4.instanceCount
            r3 = 52
            r4.vMeth1(r7, r1, r3)
            switch(r6) {
                case 28: goto L17;
                case 29: goto L17;
                case 30: goto L18;
                default: goto L16;
            }
        L16:
            goto L1b
        L17:
        L18:
            if (r6 == 0) goto L1b
            return
        L1b:
            int r0 = r0 + 1
            goto L4
        L1e:
            int r6 = r6 + 1
            r0 = 262(0x106, float:3.67E-43)
            if (r6 < r0) goto L25
            return
        L25:
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(int, int, int):void");
    }

    void mainTest(String[] strArr) {
        vMeth(21017, 160, 160);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
