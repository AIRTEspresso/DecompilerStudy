public class Test {
    static int N = 400;
    long instanceCount;
    static float fFld;
    int iFld;
    void vMeth1(int i1 , int i2){
        int i8 = 1 , i9 = 46 , iArr2[]= new int[N];
        while(++ i8 < 331)
            while((i9 += 3)< 5)
                iArr2[i9]=(int)fFld;
    }

    public void mainTest(String[]strArr1){
        int iArr[]= new int[N];
        init(iArr , - 11272);
        vMeth1(44170 , iFld);
        System.out.println("iArr = " + checkSum(iArr));
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
    public static void init(int[]a , int seed){
        for(int j = 0; j < a.length; j ++)a[j]= seed - j;
    }
    public static long checkSum(){
        long sum = 0;
        return sum;
    }
    public static long checkSum(int[]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
