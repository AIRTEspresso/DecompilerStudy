class Test {
    long instanceCount = - 1068005935077800450L;
    int iFld = - 113;
    long vSmallMeth_check_sum;
    void vMeth1(int i5 , int i6 , int i7){
        int i8 , i10;
        for(i8 = 8; i8 < 161; ++ i8)
            for(i10 = i8; i10 < 10; ++ i10){
                int i14 = - 70;
                instanceCount += i14;
                instanceCount -= 30310;
            }
    }
    void vMeth(){
        int i2 , i3 , i4;
        float f1;
        i3 = 364;
        while(-- i3 > 0){
            i4 = 1;
            while(++ i4 < 5){
                vMeth1(i4 , i4 , i3);
                f1 = 1;
                instanceCount +=(long)f1;
            }
        }
    }
    void vSmallMeth(float f , int i , int i1){
        i1 +=(int)instanceCount;
        vMeth();
        vSmallMeth_check_sum += Float.floatToIntBits(f)+ i + i1;
    }
    void mainTest(String[]strArr1){
        float f2 = - 16.177F;
        for(int smallinvoc = 0; smallinvoc < 411; smallinvoc ++)
            vSmallMeth(f2 , 70 , iFld);
        System.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
}
