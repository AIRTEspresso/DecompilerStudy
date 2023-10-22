class Test {
    int N = 400;
    void mainTest(String[]strArr1){
        int i , i21 , i22 = 14 , i23 = - 12462 , iArr2[]= new int[N];
        init(iArr2 , 57814);
        for(i = 2; i < 151; ++ i)
            for(i21 = 4; i21 < 168; ++ i21)
                switch(i){
                case 113 : i22 += i21;
                case 135 : i22 += i21;
                    break;
                default : i22 >>= 53209;
            }
        System.out.println("i22 i23 iArr2 = " + i22 + "," + i23 + "," + checkSum(iArr2));
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
    void init(int[]a , int seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed;
    }
    long checkSum(int[]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
