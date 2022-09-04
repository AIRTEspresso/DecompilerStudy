/*
 * Decompiled with CFR 0.152.
 */
class Test {
    Test() {
    }

    int iMeth(int n) {
        boolean bl = true;
        int n2 = 1;
        while (++n2 < 134) {
            n = -33279;
            n = (int)((long)n - 14L);
            if (!bl) continue;
        }
        long l = n + 1 + n2;
        return (int)l;
    }

    void mainTest(String[] stringArray) {
        int n = this.iMeth(-15);
        System.out.println("x: " + n);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }
}

