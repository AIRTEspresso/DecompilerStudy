package defpackage;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/execution_failures/487/final-487/tmp/Test.dex */
class Test {
    boolean bFld;

    Test() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
        if (r0 != 103) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mainTest(java.lang.String[] r4) {
        /*
            r3 = this;
            r4 = 2
            r0 = 18
        L4:
            r1 = 359(0x167, float:5.03E-43)
            if (r0 >= r1) goto L22
            r1 = 100
            if (r0 == r1) goto L11
            r1 = 103(0x67, float:1.44E-43)
            if (r0 == r1) goto L16
            goto L1b
        L11:
            boolean r1 = r3.bFld
            if (r1 == 0) goto L16
            goto L1f
        L16:
            boolean r1 = r3.bFld
            if (r1 == 0) goto L1b
            goto L1f
        L1b:
            r1 = 58974(0xe65e, float:8.264E-41)
            int r4 = r4 << r1
        L1f:
            int r0 = r0 + 1
            goto L4
        L22:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "i d i1 = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.mainTest(java.lang.String[]):void");
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
