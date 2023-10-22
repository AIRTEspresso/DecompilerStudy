/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/recompilation_failures/506/final-506/tmp/Test.dex */
class Test {
    int N;
    long instanceCount;

    Test() {
        int i = this.N;
        int[] iArr = new int[i];
        long j = 7049337105499461961L;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            while (true) {
                j++;
                if (j < 4) {
                    this.instanceCount = i3;
                }
            }
            iArr[i3] = iArr[i3] << 64061;
        }
    }
}
