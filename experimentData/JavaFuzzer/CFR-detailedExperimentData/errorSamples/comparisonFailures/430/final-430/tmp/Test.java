class Test {
    long instanceCount = 3093829568423456391L;
    int iFld = 46934;
    long vSmallMeth_check_sum;
    void vMeth1(int i5 , int i6){
        instanceCount = i6;
    }
    void vMeth(float f , long l){
        int i2 , i3 = 186 , i4 = 154;
        i2 = 1;
        do {
            i4 *= i2;
            vMeth1(i3 , i4);
        }
        while(++ i2 < 142);
    }
    void vSmallMeth(boolean b , int i , int i1){
        float f2 = 0.223F;
        i |=(int)instanceCount;
        vMeth(f2 , instanceCount);
        vSmallMeth_check_sum += 1 + i + i1 + Float.floatToIntBits(f2);
    }
    void mainTest(String[]strArr1){
        boolean b2 = true;
        for(int smallinvoc = 0; smallinvoc < 127; smallinvoc ++)
            vSmallMeth(b2 , iFld , 27417);
        System.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
}
