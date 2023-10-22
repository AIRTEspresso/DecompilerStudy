class Test {
    int N = 400;
    long instanceCount;
    int iFld;
    int iArrFld[]= new int[N];
    void vMeth(int i , long l , int i1){
        int i2;
        for(i2 = 3; 167 > i2; i2 += 2) --iArrFld[i2];
    }
    void mainTest(String[]strArr1){
        int i18 , i20 , i21 = 13 , i22;
        vMeth(6 , instanceCount , iFld);
        for(i20 = 5; i20 < 148; ++ i20){
            iFld |= i21;
            i22 = 1;
            iFld += i22;
            try {
                i21 = 8 / iArrFld[i20];
            }
            catch(ArithmeticException a_e){}
            iFld += i20;
        }
        System.out.println("Test.iFld =" + iFld);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
}
