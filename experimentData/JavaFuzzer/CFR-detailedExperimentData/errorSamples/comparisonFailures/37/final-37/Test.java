class Test {
    int N = 400;
    int iFld1 = 221;
    void vMeth(int i3 , int i4){
        System.out.println("i4:" + i4);
    }
    void mainTest(){
        this.iFld1 = 540298370;
        long lArr[]= new long[N];
        init(lArr , 39L);
        vMeth(iFld1 -- ,(int)(lArr[(iFld1 >>> 1)% N]^= - 13L));

        System.out.println("Test.iFld1= " + iFld1);
    }
    public static void main(String[]strArr2){
        Test test = new Test();
        test.mainTest();
    }
    void init(long[]a , long seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
}
