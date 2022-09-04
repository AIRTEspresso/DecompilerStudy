class Test {

    boolean bFld = true;

    void mainTest(){
        int i12 , i13;

        for(i12 = 170; ; --i12){
            i13 = i12;
            if(bFld)break;
        }
        System.out.println("i12:" + i12);
        System.out.println("i13:" + i13);
    }
    public static void main(String[]strArr){
        Test test = new Test();
        test.mainTest();
    }

}
