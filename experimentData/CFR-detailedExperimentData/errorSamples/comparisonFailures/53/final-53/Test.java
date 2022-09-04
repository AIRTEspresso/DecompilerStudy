class Test {
    long instanceCount;

    void mainTest(String[]strArr1){
        long sum = 0;
        for(int l = 1; l < 272; l ++){
            int i1 , i2 = - 130 , i10;
            float f = 1.764F;
            for(i1 = 133; i1 > 2; -- i1){
                instanceCount = 19;
                i10 = 1;
                while(++ i10 < 4){
                    f *= 106;
                    i2 >>>= instanceCount;
                    instanceCount -= - 14;
                    switch((i2 >> 1)% 10 + 87){
                        case 88 : i2 = - 713;
                            i2 +=(int)f;
                            break;
                        case 90 : f *= 23408;
                        case 92 : i2 *= i2;
                            break;
                        case 93 : sum += i1;
                        case 95 : instanceCount += i10;
                    }
                }
            }
        }
        System.out.println("sum = " +  sum);
    }
    public static void main(String[]strArr){
        Test test = new Test();
        test.mainTest(strArr);
    }

}
