class Test {
    int N = 400;
    long instanceCount = 5122183147755864801L;
    int iFld = 10;
    int iArrFld[]= new int[N];
    {
        init(iArrFld , - 23);
    }
    void vMeth1(long l){
        int i7 , i8 , i9 = - 91;
        i7 = 1;
        while(++ i7 < 256)
            for(i8 = 1; ; i8 ++){
                i9 += i8;
                i9 -= iFld;
                iFld >>>= instanceCount;
                switch(i9){
                    case 6 : return;
                    case 7 : iArrFld[i7]+= 27231;
                }
            }
    }
    void vMeth(int i){
        vMeth1(instanceCount);
    }
    void mainTest(String[]strArr1){
        vMeth(14);
        System.out.println("Test.iArrFld = " + checkSum(iArrFld));
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
    void init(int[]a , int seed){
        for(int j = 0;
            j < a.length;
            j ++)a[j]= j % 2 == 0 ? seed + j : seed;
    }
    long checkSum(int[]a){
        long sum = 0;
        for(int j = 0;
            j < a.length;
            j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
