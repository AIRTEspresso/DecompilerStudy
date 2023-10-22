/*
 * Decompiled with CFR 0.152.
 */
class Test {
    int N = 400;
    long instanceCount;
    int iFld = 9;
    long vMeth_check_sum;

    Test() {
    }

    void vMeth(long l, int n) {
        int n2;
        int n3;
        int n4 = 1515;
        int n5 = 51;
        int[] nArray = new int[this.N];
        this.init(nArray, -3);
        for (n3 = 11; 202 > n3; ++n3) {
            int n6 = n3;
            nArray[n6] = nArray[n6] << n3;
        }
        int n7 = n2 = 20;
        int n8 = n2 - 1;
        nArray[n8] = nArray[n8] * n;
        int n9 = 1;
        while (true) {
            n = n9++;
            if (n5 == 0) continue;
            System.out.println("iArr3=" + this.checkSum(nArray));
            System.out.println("i13=" + n3);
            System.out.println("i14=" + n7);
            System.out.println("i15=" + n2);
            System.out.println("i16=" + n4);
            System.out.println("i17=" + n9);
            System.out.println("i18=" + n5);
            this.vMeth_check_sum += (long)(n3 + n7 + n2 + n4 + n9 + n5) + this.checkSum(nArray);
            return;
        }
    }

    void mainTest(String[] stringArray) {
        this.vMeth(this.instanceCount, this.iFld);
        System.out.println("vMeth_check_sum: " + this.vMeth_check_sum);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }

    void init(int[] nArray, int n) {
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = i % 2 == 0 ? n + i : n - i;
        }
    }

    long checkSum(int[] nArray) {
        long l = 0L;
        for (int i = 0; i < nArray.length; ++i) {
            l += (long)(nArray[i] / (i + 1) + nArray[i] % (i + 1));
        }
        return l;
    }
}

