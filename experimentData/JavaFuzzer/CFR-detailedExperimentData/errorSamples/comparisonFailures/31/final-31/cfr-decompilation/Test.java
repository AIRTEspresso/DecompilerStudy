/*
 * Decompiled with CFR 0.152.
 */
class Test {
    boolean bFld = true;

    Test() {
    }

    void mainTest() {
        int n;
        int n2 = 170;
        while (true) {
            n = n2--;
            if (this.bFld) break;
        }
        System.out.println("i12:" + n2);
        System.out.println("i13:" + n);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest();
    }
}

