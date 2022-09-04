class Test {
    int N = 400;
    long dMeth_check_sum;
    double dMeth(){
        int i14 = 36184 , i15 , i16 = - 42285 , i17 = 3 , iArr2[][]= new int[N][N];
        long l1 = 447504782L;
        float f3 = 69.681F , fArr1[]= new float[N];
        init(fArr1 , 0.746F);
        init(iArr2 , 9082);
        i14 -= i14;
        for(i15 = 16; i15 < 354; i15 ++){
            l1 = 1;
            do {
                i17 = 1;
                while((i17 -= 3)> 0)i16 = i16;
            }
            while(++ l1 < 5);
        }
        long meth_res = i14 + i15 + i16 + l1 + i17 + Float.floatToIntBits(f3)+ Double.doubleToLongBits(checkSum(fArr1))+ checkSum(iArr2);
        dMeth_check_sum += meth_res;
        return meth_res;
    }
    void mainTest(String[]strArr1){
        int i , i2;
        double d;
        for(d = 4;
            d < 125;
            ++ d)for(i2 = 7;
                     i2 < 207;
                     ++ i2)i =(int)dMeth();
        System.out.println("dMeth_check_sum: " + dMeth_check_sum);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
    void init(int[]a , int seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed;
    }
    void init(int[][]a , int seed){
        for(int j = 0; j < a.length; j ++)init(a[j], seed);
    }
    void init(float[]a , float seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
    long checkSum(int[]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
    long checkSum(int[][]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += checkSum(a[j]);
        return sum;
    }
    double checkSum(float[]a){
        double sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j];
        return sum;
    }
}
