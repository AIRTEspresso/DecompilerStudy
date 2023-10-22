/* renamed from: Test */
/* loaded from: /root/DecompilerTester/testhome-save-jadx-2022.8.9/error_ones/468/final-468/tmp/Test.dex */
class Test {
    int N;
    long instanceCount;

    Test() {
    }

    int iMeth(int i) {
        int i2;
        float[] fArr = new float[this.N];
        int i3 = i;
        double d = 0.40652d;
        int i4 = 39770;
        int i5 = -83;
        short s = 63;
        short s2 = 1330;
        for (int i6 = 10; i6 < 168; i6++) {
            if (i6 != 57) {
                if (i6 != 315) {
                    if (i6 == 328) {
                        i2 = i3;
                    } else if (i6 == 331) {
                        while (i5 < 1) {
                            this.instanceCount += i5;
                            i5++;
                            i3 = i3;
                        }
                        i3 >>>= s;
                        d += 41243.0d;
                        i4 = 10;
                    }
                }
                s = (int) (s + 82.33f);
            } else {
                i2 = i3;
                s = s2;
            }
            i3 = i2;
            s2 = (short) 50981;
        }
        return (int) (i3 + i4 + Double.doubleToLongBits(d) + Float.floatToIntBits(82.33f) + checkSum(fArr));
    }

    long checkSum(Object obj) {
        return obj.getClass().getCanonicalName().length();
    }
}
