class Test {
    int N = 400;
    long instanceCount = - 9L;
    int iFld = 7;
    double dFld = - 66.79636;
    int iArrFld[]= new int[N];

    int iMeth(){
        int i6 = - 93;
        dFld *= instanceCount;
        iArrFld[(iFld >>> 1)% N]=(int)((iFld =(int)(dFld + iFld))- instanceCount);
        long meth_res = i6;
        return(int)meth_res;
    }
    void mainTest(){
        iMeth();
        System.out.println("Test.iArrFld = " + checkSum(iArrFld));
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest();
    }

    long checkSum(int[]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }

}
