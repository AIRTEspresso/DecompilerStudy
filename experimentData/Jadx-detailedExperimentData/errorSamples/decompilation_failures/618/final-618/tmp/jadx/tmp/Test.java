/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/618/final-618/tmp/Test.dex */
class Test {
    int N;
    long instanceCount;
    long vMeth1_check_sum;

    Test() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    void vMeth1(int i) {
        int i2 = this.N;
        long[] jArr = new long[i2];
        boolean[] zArr = new boolean[i2];
        int i3 = 2;
        int i4 = 13;
        int i5 = -33451;
        long j = 40391;
        double d = 0.63859d;
        int i6 = 4;
        while (true) {
            boolean z = true;
            if (i6 < 312) {
                while (true) {
                    zArr[i6] = z;
                    for (?? r12 = z; i5 < r12; r12 = 1) {
                        double d2 = i5;
                        Double.isNaN(d2);
                        i3 = (int) (i3 + (this.instanceCount | i5));
                        i4 <<= 6;
                        i5 += 2;
                        d *= d2;
                    }
                    j++;
                    if (j >= 5) {
                        break;
                    }
                    z = true;
                }
                i6++;
            } else {
                double d3 = this.vMeth1_check_sum;
                double d4 = i + i4 + 1;
                Double.isNaN(d4);
                double d5 = i3;
                Double.isNaN(d5);
                double checkSum = checkSum(jArr);
                Double.isNaN(checkSum);
                Double.isNaN(d3);
                this.vMeth1_check_sum = (long) (d3 + d4 + d + d5 + checkSum);
                return;
            }
        }
    }

    long checkSum(Object obj) {
        return obj.getClass().getCanonicalName().length();
    }
}
