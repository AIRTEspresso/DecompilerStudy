package defpackage;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/215/final-215/tmp/Test.dex */
public class Test {
    long instanceCount;

    public int iMeth() {
        return 93;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r1 != 113) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mainTest(java.lang.String[] r8) {
        /*
            r7 = this;
            r8 = 57891(0xe223, float:8.1123E-41)
            r0 = -52195(0xffffffffffff341d, float:NaN)
            r1 = 4
        L8:
            r2 = 364(0x16c, float:5.1E-43)
            if (r1 >= r2) goto L3b
        Lc:
            r2 = 70
            if (r2 <= r0) goto L38
        L11:
            r8 = 114(0x72, float:1.6E-43)
            if (r1 == r8) goto L16
            goto L24
        L16:
            r8 = 7
            r2 = 48841(0xbec9, float:6.8441E-41)
            if (r1 == r8) goto L33
            r8 = 112(0x70, float:1.57E-43)
            if (r1 == r8) goto L26
            r8 = 113(0x71, float:1.58E-43)
            if (r1 == r8) goto L2d
        L24:
            r8 = r0
            goto L35
        L26:
            long r3 = r7.instanceCount
            r8 = 171(0xab, float:2.4E-43)
            long r3 = r3 >> r8
            r7.instanceCount = r3
        L2d:
            long r3 = r7.instanceCount
            long r5 = (long) r2
            long r3 = r3 - r5
            r7.instanceCount = r3
        L33:
            int r8 = r0 << r2
        L35:
            int r0 = r0 + 1
            goto Lc
        L38:
            int r1 = r1 + 1
            goto L8
        L3b:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "i i1 i2 = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ","
            r3.append(r1)
            r3.append(r8)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            r2.println(r8)
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

    public static void init() {
    }

    public static void init(double d) {
    }
}
