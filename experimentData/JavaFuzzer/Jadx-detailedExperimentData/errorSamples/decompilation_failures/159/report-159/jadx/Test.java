/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/159/final-159/tmp/Test.dex */
class Test {
    int iFld = -3;

    Test() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed compute block dominance frontier
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:308)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:53)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:459)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        Caused by: java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeBlockDF(BlockProcessor.java:333)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:306)
        	... 4 more
        */
    void mainTest(java.lang.String[] r4) {
        /*
            r3 = this;
            int r4 = r3.iFld     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L30
            int r4 = r4 + 628
            short r4 = (short) r4
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "s i25 i26 = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ","
            r1.append(r4)
            r2 = 1
            r1.append(r2)
            r1.append(r4)
            r4 = 17
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            return
        L30:
            r4 = move-exception
        L32:
            goto L32
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
