class Test {
    int N = 400;
    long instanceCount = - 4212500827L;
    boolean bFld = true;
    int iArrFld[]= new int[N];
    {
        init(iArrFld , - 11);
    }
    int iMeth(long l){
        int i2 , i14 = - 19481 , i15 , i16 = - 243 , i17 = 105 , i18 = 123;
        double d = 114.111568;
        float f1 = - 1.349F;
        i2 = 318;
        while(-- i2 > 0){
            d = iArrFld[i2 - 1]*= i2 * 12472 + i2;
            break;
        }
        i14 <<= 43649;
        for(i15 = 167; i15 > 2; i15 -= 2)d += instanceCount;
        long meth_res = l + i2 + Double.doubleToLongBits(d)+ 1 + Float.floatToIntBits(f1)+ i14 + i15 + i16 + i17 + i18;
        return(int)meth_res;
    }
    void mainTest(String[]strArr1){
        int i , i1 = 160 , i19 = 14 , i22 = 4;
        for(i = 2; i < 203; ++ i)i1 += i;
        if(bFld){
            instanceCount -= Math.abs(iMeth(instanceCount))+ instanceCount;
            i1 = 137;
            i1 -= instanceCount;
        }
        else do i22 -= instanceCount;
        while(i19 > 0);
        System.out.println("i i1 i19 = " + i + "," + i1 + "," + i19);
    }
    public static void main(String[]strArr){
        try {
            Test _instance = new Test();
            _instance.mainTest(strArr);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    void init(int[]a , int seed){
        for(int j = 0; j < a.length; j ++)a[j]= seed + j;
    }
}
