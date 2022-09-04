/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    float fFld;

    Test() {
    }

    void mainTest() {
        int[] nArray = new int[this.N];
        int n = 6;
        while (n < 128) {
            int n2 = 1;
            do {
                int n3 = n++;
                nArray[n3] = (int)((float)nArray[n3] * this.fFld);
            } while (++n2 < 13);
        }
        System.out.println("i8=" + n);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }
}

