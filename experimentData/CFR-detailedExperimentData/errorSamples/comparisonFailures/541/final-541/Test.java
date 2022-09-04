class Test {
    int N = 400;
    long instanceCount = 252L;
    int iFld = 194;
    int iArrFld[]= new int[N];
    {
        init(iArrFld , 16937);
    }
    long vSmallMeth_check_sum;
    float fMeth(int i3){
        int i6;
        iArrFld[i3 >> 1]-= instanceCount;
        for(i6 = 127;
            i6 > 2;
            -- i6)iArrFld[i6]-= - 213;
        long meth_res = i3;
        return meth_res;
    }
    void vMeth(int i1){
        int i2;
        i2 = 1;
        do {
            i1 *= i1;
            fMeth(i2);
        }
        while(++ i2 < 235);
        instanceCount = i1;
    }
    void vSmallMeth(long l , int i){
        l *= iArrFld[i >> 1];
        vMeth(i);
        vSmallMeth_check_sum += l + i;
    }
    void mainTest(String[]strArr1){
        for(int smallinvoc = 0; smallinvoc < 155; smallinvoc ++)vSmallMeth(instanceCount , iFld);
        System.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
    void init(int[]a , int seed){
        for(int j = 0;
            j < a.length;
            j ++)a[j]= seed - j;
    }
}
