class Test {
    long instanceCount;
    int iFld;
    void vMeth1(){
        iFld =(int)instanceCount;
    }
    void vMeth(int i3 , int i4 , float f2){
        int i11 , i13;
        vMeth1();
        for(i11 = 11; 327 > i11; i11 ++)
            for(i13 = 1; i13 < 5; i13 ++)
            switch(i11 % 2){
                case 56 : instanceCount -= 0;
                case 58 : instanceCount += i11;
            }
    }
    boolean bMeth(int i){
        float f1;
        f1 = 1;
        while(++ f1 < 391)vMeth(98 , i , f1);
        instanceCount = - 4982;
        long meth_res = i;
        return meth_res > 0;
    }
    void mainTest(String[]strArr1){
        bMeth(iFld);
        System.out.println("iFld = " + iFld);
        System.out.println("instanceCount = " + instanceCount);


    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }

}
