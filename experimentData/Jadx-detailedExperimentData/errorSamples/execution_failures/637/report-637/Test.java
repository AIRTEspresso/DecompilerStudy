class Test {
    int N = 400;
    long instanceCount;
    int iArrFld[]= new int[N];
    {
        init(iArrFld , - 29690);
    }
    long vMeth_check_sum;
    void vMeth(int i3 , int i4){
        int i7 , i8 = - 10 , i9 = - 219 , i10 = 64791;
        float f = 1.695F;
        double d1 = 108.98677;
        long lArr[]= new long[N];
        init(lArr , - 235669650L);
        for(i7 = 11; i7 < 360; ++ i7){
            switch((i7 % 10)* 5 + 15){
                case 32 : i8 = - 1;
                case 25 : instanceCount -= i4;
                case 40 : continue;
                default : lArr[i7]-= 2554576780295895974L;
            }
        }

        System.out.println("i8:" + i8);

        System.out.println("lArr:" + checkSum(lArr));


        vMeth_check_sum += i3 + i4 + i7 + i8 + Float.floatToIntBits(f)+ i9 + i10 + 1 + Double.doubleToLongBits(d1)+ checkSum(lArr);
    }
    int iMeth(int i2){
        i2 = iArrFld[i2 >> 1];
        vMeth(i2 , i2);
        long meth_res = i2;
        return(int)meth_res;
    }
    void mainTest(String[]strArr1){
        int i;
        for(i = 2; 228 > i; ++ i)instanceCount = iMeth(i);
        System.out.println("vMeth_check_sum: " + vMeth_check_sum);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
    void init(long[]a , long seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
    void init(int[]a , int seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
    long checkSum(long[]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
