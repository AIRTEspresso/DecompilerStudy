package defpackage;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/645/final-645/tmp/Test.dex */
class Test {
    boolean bFld;

    Test() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 != 40) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r4.bFld != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        r5 = 62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mainTest(java.lang.String[] r5) {
        /*
            r4 = this;
            r5 = 6
            r0 = 6
        L4:
            r1 = 372(0x174, float:5.21E-43)
            if (r0 >= r1) goto Lb
            int r0 = r0 + 1
            goto L4
        Lb:
            r1 = -41370(0xffffffffffff5e66, float:NaN)
        Le:
            r2 = 29
            if (r1 == r2) goto L1c
            r2 = 30
            if (r1 == r2) goto L23
            r2 = 40
            if (r1 == r2) goto L21
            goto L25
        L1c:
            boolean r2 = r4.bFld
            if (r2 == 0) goto L21
            goto L25
        L21:
            r5 = 62
        L23:
            int r2 = r5 % (-32618)
        L25:
            int r1 = r1 + 1
            r2 = 253(0xfd, float:3.55E-43)
            if (r1 < r2) goto L52
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "i i1 i22 = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            r3 = -32618(0xffffffffffff8096, float:NaN)
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r5.println(r0)
            return
        L52:
            goto Le
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
