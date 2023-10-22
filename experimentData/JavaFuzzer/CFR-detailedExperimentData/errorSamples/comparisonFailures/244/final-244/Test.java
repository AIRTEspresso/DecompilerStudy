class Test {
    int N = 400;
    float fFld;
    void mainTest(){
        int i8 , i10 , iArr1[]= new int[N];
        for(i8 = 6; i8 < 128; ++ i8){
            i10 = 1;
            do iArr1[i8]*= fFld;
            while(++ i10 < 13);
        }
        System.out.println("i8=" + i8);
    }
    public static void main(String[] arg){
        Test tester = new Test();
        tester.mainTest();
    }
}
