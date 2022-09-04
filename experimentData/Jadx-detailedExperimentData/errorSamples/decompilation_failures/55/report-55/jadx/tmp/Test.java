/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/55/final-55/tmp/Test.dex */
class Test {
    long instanceCount;

    Test() {
    }

    void vMeth1(double d) {
        this.instanceCount -= 7924;
    }

    int iMeth(int i) {
        vMeth1(0.90106d);
        this.instanceCount >>= 84;
        return i;
    }

    void vMeth(int i) {
        iMeth(154);
        int i2 = 9;
        while (true) {
            if (i2 > 1) {
                this.instanceCount -= -43719;
                for (int i3 = 1; 2 > i3; i3++) {
                }
                this.instanceCount += 48.73f;
                i2--;
            } else {
                return;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.and(BitSet.java:917)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:735)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:262)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to detect multi-entry loops
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.colorDFS(FixMultiEntryLoops.java:90)
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.colorDFS(FixMultiEntryLoops.java:92)
     */
    void mainTest(java.lang.String[] r9) {
        /*
            r8 = this;
            r9 = 11
            r8.vMeth(r9)
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 4625759767262920704(0x4032000000000000, double:18.0)
        La:
            r3 = 4644900065679245312(0x4076000000000000, double:352.0)
            r5 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L1c
            r0 = 1
        L12:
            int r0 = r0 + r5
            r3 = 75
            if (r0 >= r3) goto L18
            goto L12
        L18:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 + r3
            goto La
        L1c:
            long r3 = r8.instanceCount
            int r4 = (int) r3
            r3 = 11
        L21:
            r6 = 243(0xf3, float:3.4E-43)
            if (r5 >= r6) goto L41
            int r6 = r5 % 9
            int r6 = r6 + 18
            if (r6 == r9) goto L3e
            r7 = 21
            if (r6 == r7) goto L36
            r7 = 22
            if (r6 == r7) goto L34
            goto L3b
        L34:
            int r4 = r4 + r0
            goto L3b
        L36:
            r6 = 61145(0xeed9, float:8.5682E-41)
            int r3 = r3 / r6
        L3b:
            int r5 = r5 + 1
            goto L21
        L3e:
        L3f:
            goto L3f
        L41:
            java.io.PrintStream r9 = java.lang.System.out
            long r0 = java.lang.Double.doubleToLongBits(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "i21 d2 i22 = "
            r2.append(r5)
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r0)
            r2.append(r3)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            r9.println(r0)
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
