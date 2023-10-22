class Test {
    int N = 400;
    int iFld;

    void mainTest(){
        int i = 4;
        long lArr[]= new long[N];
        init(lArr , 2918919998L);
        while(-- i > 0){
            iFld += iFld =(int)(i + lArr[i]);
        }
        System.out.println("iFld " + Double.doubleToLongBits(iFld));
    }
    public static void main(String[]strArr){
        Test test = new Test();
        test.mainTest();
    }
    void init(long[]a , long seed){
        for(int j = 0; j < a.length; j ++)a[j]= seed - j;
    }
}
