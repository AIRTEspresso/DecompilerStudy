package defpackage;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/705/final-705/tmp/Test.dex */
class Test {
    int[] iArrFld;
    int N = 400;
    long instanceCount = -4212500827L;
    boolean bFld = true;

    Test() {
        int[] iArr = new int[400];
        this.iArrFld = iArr;
        init(iArr, -11);
    }

    int iMeth(long j) {
        int[] iArr = this.iArrFld;
        int i = iArr[316] * 3953941;
        iArr[316] = i;
        double d = i;
        int i2 = 167;
        while (i2 > 2) {
            double d2 = this.instanceCount;
            Double.isNaN(d2);
            d += d2;
            i2 -= 2;
        }
        return (int) ((((((((j + 317) + Double.doubleToLongBits(d)) + 1) + Float.floatToIntBits(-1.349f)) - 38962) + i2) - 243) + 105 + 123);
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to detect multi-entry loops
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.colorDFS(FixMultiEntryLoops.java:90)
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.colorDFS(FixMultiEntryLoops.java:92)
     */
    void mainTest(java.lang.String[] r7) {
        /*
            r6 = this;
            r7 = 2
        L2:
            r0 = 203(0xcb, float:2.84E-43)
            if (r7 >= r0) goto L9
            int r7 = r7 + 1
            goto L2
        L9:
            boolean r0 = r6.bFld
            if (r0 == 0) goto L4a
            long r0 = r6.instanceCount
            int r2 = r6.iMeth(r0)
            int r2 = java.lang.Math.abs(r2)
            long r2 = (long) r2
            long r4 = r6.instanceCount
            long r2 = r2 + r4
            long r0 = r0 - r2
            r6.instanceCount = r0
            r2 = 137(0x89, float:1.92E-43)
            long r2 = (long) r2
            long r2 = r2 - r0
            int r0 = (int) r2
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "i i1 i19 = "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ","
            r2.append(r7)
            r2.append(r0)
            r2.append(r7)
            r7 = 14
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.println(r7)
            return
        L4a:
            goto L4a
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

    void init(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i + i2;
        }
    }
}
