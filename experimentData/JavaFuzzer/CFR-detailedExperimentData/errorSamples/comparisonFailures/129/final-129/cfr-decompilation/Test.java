/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;

    Test() {
    }

    void mainTest() {
        int n = -130;
        int n2 = 51760;
        int[] nArray = new int[this.N];
        int n3 = 1;
        do {
            int n4 = 5;
            while (n4 < 186) {
                int n5 = n4++;
                nArray[n5] = nArray[n5] - (n += n4 | n2);
            }
        } while (++n3 < 135);
        System.out.println("i1 = " + n);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }
}

