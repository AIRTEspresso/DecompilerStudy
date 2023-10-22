class Test {
    int N = 400;
    long instanceCount = 3125503453L;
    int iArrFld[]= new int[N];
    {
        init(iArrFld , - 180);
    }
    int iMeth(){
        instanceCount = 115;
        return 12;
    }
    void mainTest(){
        int i , i1 = 173 , i2 = 1;
        for(i = 149; i > 7; i -= 2){
            i1 <<= iMeth();
            iArrFld[i]+= instanceCount;
            i2 -= i1;
            iArrFld[i - 1]= i;
        }
        System.out.println("the sum of iArrFld is :" + checkSum(iArrFld));
    }
    public static void main(String[]strArr){
        Test test = new Test();
        test.mainTest();
    }
    void init(int[]a , int seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
    long checkSum(int[]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
