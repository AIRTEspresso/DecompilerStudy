class Test {
    int N = 400;
    long instanceCount;
    int iFld = 9;
    long vMeth_check_sum;
    void vMeth(long l , int i){
        int i13 , i14 , i15 , i16 = 1515 , i17 , i18 = 51 , iArr3[]= new int[N];
        init(iArr3 , - 3);
        for(i13 = 11; 202 > i13; ++ i13)iArr3[i13]<<= i13;
        for(i15 = 20; ; ){
            i14 = i15;
            iArr3[i15 - 1]*= i;
            for(i17 = 1; ; i17 ++){
                i = i17;
                if(i18 != 0){
                    System.out.println("iArr3=" + checkSum(iArr3));
                    System.out.println("i13=" + i13);
                    System.out.println("i14=" + i14);
                    System.out.println("i15=" + i15);
                    System.out.println("i16=" + i16);
                    System.out.println("i17=" + i17);
                    System.out.println("i18=" + i18);

                    vMeth_check_sum += i13 + i14 + i15 + i16 + i17 + i18 + checkSum(iArr3);
                    return;
                }
            }
        }
    }
    void mainTest(String[]strArr1){
        vMeth(instanceCount , iFld);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
    void init(int[]a , int seed){
        for(int j = 0;
            j < a.length;
            j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
    long checkSum(int[]a){
        long sum = 0;
        for(int j = 0;
            j < a.length;
            j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
