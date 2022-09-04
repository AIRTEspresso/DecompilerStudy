class Test {
    int N = 400;
    long instanceCount;
    int iFld;
    int iFld1 = 98;
    int iArrFld[]= new int[N];
    void vMeth(int i , long l , int i1){
        int i2;
        for(i2 = 3; 167 > i2; i2 += 2)--iArrFld[i2];
        for (i = 0; i < iArrFld.length;i++) {
            System.out.println("iArrFld[" + i + "]=" + iArrFld[i]);
        }
    }
    void mainTest(String[]strArr1){
        double d1 = 2.118649;
        int i18 , i20 , i21 = 13 , i22;
        vMeth(6 , instanceCount , iFld);
        iFld += d1;
        for(i18 = 8; i18 < 177; i18 ++)
            for(i20 = 5; i20 < 148; ++ i20){
                iFld |= i21;
                i22 = 1;
                i21 *= iFld;
                iFld += i22;
                d1 = - 2.48671;
                try {
                    i21 = i22 / iFld1;
                    i21 = 8 / iArrFld[i20 - 1];
                }
                catch(ArithmeticException a_e){
                }
                iArrFld[i18]=(int)d1;
                iFld += i20;
            }
        System.out.println("Test.iFld =" + iFld);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
}
