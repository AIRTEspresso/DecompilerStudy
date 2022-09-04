package defpackage;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/510/final-510/tmp/Test.dex */
class Test {
    int iFld;

    Test() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[LOOP:2: B:15:0x002d->B:16:0x002f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mainTest(java.lang.String[] r8) {
        /*
            r7 = this;
            r0 = 1
            r8 = -55
            r2 = r0
        L7:
            long r4 = (long) r8
            long r4 = r4 + r2
            int r8 = (int) r4
            byte r8 = (byte) r8
            long r2 = r2 + r0
            r4 = 282(0x11a, double:1.393E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L5a
            r0 = 2
            r1 = 2
        L14:
            r4 = 365(0x16d, float:5.11E-43)
            if (r4 <= r1) goto L35
            int r4 = r1 % 2
            r5 = 95
            if (r4 == r5) goto L29
            r5 = 102(0x66, float:1.43E-43)
            if (r4 == r5) goto L23
            goto L2c
        L23:
            int r8 = r7.iFld
            int r8 = r8 + 156
            r7.iFld = r8
        L29:
            int r8 = r7.iFld
            byte r8 = (byte) r8
        L2c:
            r4 = 1
        L2d:
            if (r4 >= r0) goto L32
            int r4 = r4 + 1
            goto L2d
        L32:
            int r1 = r1 + 1
            goto L14
        L35:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "l by2 i10 = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ","
            r4.append(r2)
            r4.append(r8)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r8 = r4.toString()
            r0.println(r8)
            return
        L5a:
            goto L7
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
