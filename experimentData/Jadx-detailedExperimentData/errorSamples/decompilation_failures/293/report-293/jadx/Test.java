
import java.lang.reflect.Array;
/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/293/final-293/tmp/Test.dex */
class Test {
    int N = 400;
    long instanceCount;

    Test() {
    }

    void vMeth1(int i, int i2, int i3) {
        int i4 = this.N;
        init((long[][][]) Array.newInstance(long.class, i4, i4, i4), 3015630487L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed compute block dominance frontier
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:308)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:75)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        Caused by: java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeBlockDF(BlockProcessor.java:333)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:306)
        	... 2 more
        */
    /* JADX WARN: Failed to detect multi-entry loops
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.colorDFS(FixMultiEntryLoops.java:90)
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.colorDFS(FixMultiEntryLoops.java:92)
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.detectSpecialEdges(FixMultiEntryLoops.java:81)
    	at jadx.core.dex.visitors.blocks.FixMultiEntryLoops.process(FixMultiEntryLoops.java:18)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
     */
    void vMeth(boolean r2, int r3) {
        /*
            r1 = this;
            r2 = 22300(0x571c, float:3.1249E-41)
            r0 = 209(0xd1, float:2.93E-43)
            r1.vMeth1(r3, r0, r2)
        L9:
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.vMeth(boolean, int):void");
    }

    void vSmallMeth(int i) {
        vMeth(true, i);
    }

    void mainTest(String[] strArr) {
        vSmallMeth(50856);
    }

    public static void main(String[] strArr) {
        try {
            new Test().mainTest(strArr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void init(Object[] objArr, Object obj) {
        while (true) {
            objArr[0] = obj;
        }
    }
}
