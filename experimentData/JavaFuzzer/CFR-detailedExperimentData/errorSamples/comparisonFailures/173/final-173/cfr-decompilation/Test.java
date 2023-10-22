/*
 * Decompiled with CFR 0.152.
 */
public class Test {
    public static final int N = 400;
    public static long instanceCount = 1723977013L;
    public static long vMeth1_check_sum = 0L;

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.vMeth1();
    }

    public void vMeth1() {
        int n = 53;
        int n2 = -58396;
        int n3 = -8681;
        int n4 = -8;
        int n5 = 11268;
        int n6 = 21390;
        int n7 = 36;
        boolean bl = false;
        n &= (int)instanceCount;
        n7 = (byte)n3;
        instanceCount += 26L;
        n4 = 1;
        while (!bl) {
            for (n5 = 1; 1 > n5; ++n5) {
                n = (int)instanceCount;
                n6 = 225;
            }
            if (++n4 < 7) continue;
        }
        vMeth1_check_sum += (long)(n + n2 + n3 + n7 + n4 + (bl ? 1 : 0) + n5 + n6);
    }
}

