class Test {
    long instanceCount;
    static double dFld;
    int iFld;
    int iFld1;
    void vMeth(int i){
        instanceCount -= Long.reverseBytes(- 2187064611379246730L);
        dFld -= ++ dFld;
    }
    void mainTest(String[]strArr1){
        float f3;
        int i18 , i21 = 110;
        long l;
        dFld *= instanceCount + iFld;
        iFld = 11897 - 34092;
        vMeth(iFld1);
        f3 =(float)dFld;
        for(i18 = 228; i18 > 11; i18 --)
            for(l = 7; l < 116; l += 3)
                switch((int)(l % 6 + 19)){
                    case 20 : instanceCount >>= i21;
                    case 21 : instanceCount = i18;
                    case 23 : iFld -= iFld;
                }
        System.out.println("Test.instanceCount Test.dFld iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld)+ "," + iFld);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
}
