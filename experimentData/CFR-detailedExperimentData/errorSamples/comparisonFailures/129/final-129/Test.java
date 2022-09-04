class Test {
    int N = 400;
    void mainTest(){
        int i , i1 = - 130 , i20 , i21 = 51760 , iArr[]= new int[N];
        i = 1;
        do {
            for(i20 = 5; i20 < 186; ++ i20){
                i1 += i20 | i21;
                iArr[i20]-= i1;
            }
        }
        while(++ i < 135);
        System.out.println("i1 = " + i1);
    }
    public static void main(String[]strArr){
        Test test = new Test();
        test.mainTest();
    }
}
