class Test {
    int N = 400;
    long instanceCount;
    void vMeth1(int i6 , int i7 , int i8){
        long lArr1[][][]= new long[N][N][N];
        init(lArr1 , 3015630487L);
    }
    void vMeth(boolean b , int i1){
        int i3 = 209;
        switch(127){
            case 127 : vMeth1(i1 , i3 , 22300);
                for(; ; )i3 <<= instanceCount;
        }
    }
    void vSmallMeth(int i){
        boolean b1 = true;
        vMeth(b1 , i);
    }
    void mainTest(String[]strArr1){
        vSmallMeth(50856);
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
    void init(Object[]a , Object seed){
        for(int j = 0; ; )a[j]= seed;
    }
}
