class Test {
    int N = 400;

    int iMeth(){
        long result = 6434513136464641584L;
        return (int) (result);
    }


    void mainTest(){
        int i , i1 = - 8;
        short s = - 11995;
        float fArr[]= new float[N];
        init(fArr , 0.383F);
        for(i = 342; i > 16; i --){
            fArr[i]-=(-(i1 - s)+(103.596F + iMeth()))- 43490;
        }
        System.out.println("fArr:" +Double.doubleToLongBits(checkSum(fArr)));

    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest();
    }

    void init(float[]a , float seed){
        for(int j = 0;
            j < a.length;
            j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }

    double checkSum(float[]a){
        double sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
