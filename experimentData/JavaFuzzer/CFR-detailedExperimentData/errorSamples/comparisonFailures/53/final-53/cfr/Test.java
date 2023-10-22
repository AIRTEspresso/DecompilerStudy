/*
 * Decompiled with CFR 0.152.
 */
class Test {
    long instanceCount;

    Test() {
    }

    void mainTest(String[] stringArray) {
        long l = 0L;
        for (int i = 1; i < 272; ++i) {
            int n = -130;
            float f = 1.764f;
            for (int j = 133; j > 2; --j) {
                this.instanceCount = 19L;
                int n2 = 1;
                while (++n2 < 4) {
                    f *= 106.0f;
                    this.instanceCount -= -14L;
                    switch (((n >>>= (int)this.instanceCount) >> 1) % 10 + 87) {
                        case 88: {
                            n = -713;
                            n += (int)f;
                            break;
                        }
                        case 90: {
                            f *= 23408.0f;
                        }
                        case 92: {
                            n *= n;
                            break;
                        }
                        case 93: {
                            l += (long)j;
                        }
                        case 95: {
                            this.instanceCount += (long)n2;
                        }
                    }
                }
            }
        }
        System.out.println("sum = " + l);
    }

    public static void main(String[] stringArray) {
        Test test = new Test();
        test.mainTest(stringArray);
    }
}

