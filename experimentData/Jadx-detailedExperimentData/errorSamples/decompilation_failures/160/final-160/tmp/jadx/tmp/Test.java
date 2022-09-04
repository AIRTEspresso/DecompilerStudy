/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/160/final-160/tmp/Test.dex */
class Test {
    long instanceCount = -222;
    int iFld = 31231;
    double dFld = -25.42777d;

    Test() {
    }

    void vMeth1() {
        int i = this.iFld;
        this.iFld = i - i;
        for (int i2 = 3; i2 < 157; i2++) {
            this.instanceCount += i2;
        }
    }

    void vMeth(short s) {
        int i = 11;
        long j = 92;
        while (true) {
            i++;
            if (i < 384) {
                this.instanceCount = j ^ this.instanceCount;
                double d = this.iFld;
                Double.isNaN(d);
                j = (int) (d - 1.51951d);
            } else {
                vMeth1();
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[LOOP:2: B:12:0x0053->B:14:0x0059, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void mainTest(java.lang.String[] r11) {
        /*
            r10 = this;
            int r11 = r10.iFld
            int r11 = r11 * r11
            int r11 = -r11
            double r0 = (double) r11
            double r2 = r10.dFld
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            int r11 = (int) r0
            r10.iFld = r11
            r11 = 1105450238(0x41e3d4fe, float:28.479)
            r0 = 24419(0x5f63, float:3.4218E-41)
            r1 = 5
        L18:
            r2 = 136(0x88, float:1.9E-43)
            if (r2 <= r1) goto L62
        L1d:
            long r2 = (long) r1
            long r4 = r10.instanceCount
            long r2 = r2 * r4
            float r2 = (float) r2
            float r2 = r2 - r11
            float r11 = r11 + r2
            r2 = -159(0xffffffffffffff61, double:NaN)
            long r6 = (long) r0
            long r6 = r6 * r4
            long r6 = r6 + r2
            float r2 = (float) r6
            float r2 = r11 - r2
            int r3 = r1 + 49
            float r3 = (float) r3
            float r3 = r3 + r11
            float r2 = r2 - r3
            int r2 = (int) r2
            int r0 = r0 + r2
            r2 = 8
        L37:
            r3 = 191(0xbf, float:2.68E-43)
            if (r2 >= r3) goto L5f
            r3 = 655(0x28f, float:9.18E-43)
            r10.vMeth(r3)
            int r3 = r10.iFld
            switch(r3) {
                case 115: goto L46;
                case 116: goto L5b;
                case 117: goto L50;
                default: goto L45;
            }
        L45:
            goto L5c
        L46:
            double r3 = r10.dFld
            r5 = 4605696230729711616(0x3feab851e0000000, double:0.8349999785423279)
            double r3 = r3 + r5
            r10.dFld = r3
        L50:
            r3 = 1
            r5 = r3
        L53:
            r7 = 2
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L5b
            long r5 = r5 + r3
            goto L53
        L5b:
        L5c:
            int r2 = r2 + 1
            goto L37
        L5f:
            int r1 = r1 + 1
            goto L18
        L62:
            java.io.PrintStream r2 = java.lang.System.out
            int r11 = java.lang.Float.floatToIntBits(r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "f i i1 = "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r11 = ","
            r3.append(r11)
            r3.append(r1)
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r3.toString()
            r2.println(r11)
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
