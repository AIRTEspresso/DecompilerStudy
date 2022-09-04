/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/672/final-672/tmp/Test.dex */
class Test {
    int N = 400;
    long lFld;

    Test() {
    }

    void vMeth() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r3 != 77) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int iMeth1(int r2, long r3, int r5) {
        /*
            r1 = this;
            int r3 = r1.N
            r4 = 3
            int[] r4 = new int[r4]
            r0 = 2
            r4[r0] = r3
            r0 = 1
            r4[r0] = r3
            r0 = 0
            r4[r0] = r3
            java.lang.Class<int> r3 = int.class
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            int[][][] r3 = (int[][][]) r3
            r4 = 167(0xa7, float:2.34E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.init(r3, r4)
            r3 = -50711(0xffffffffffff39e9, float:NaN)
        L22:
            java.lang.Math.max(r5, r3)
            r4 = 75
            if (r3 == r4) goto L2e
            r4 = 77
            if (r3 == r4) goto L31
            goto L33
        L2e:
            r1.vMeth()
        L31:
            int r5 = r5 + 133
        L33:
            int r3 = r3 + 1
            r4 = 215(0xd7, float:3.01E-43)
            if (r3 < r4) goto L3c
            long r2 = (long) r2
            int r3 = (int) r2
            return r3
        L3c:
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Test.iMeth1(int, long, int):int");
    }

    int iMeth(long j) {
        iMeth1(11946, this.lFld, 221);
        return (int) j;
    }

    void mainTest(String[] strArr) {
        while (true) {
            iMeth(this.lFld);
        }
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
