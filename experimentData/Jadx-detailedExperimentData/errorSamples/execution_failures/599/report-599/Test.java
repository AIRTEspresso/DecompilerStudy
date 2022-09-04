class Test {
    int N;
    long instanceCount;
    float fFld = 41.231F;
    boolean bFld;
    void vMeth(){
        int i = 188;
        instanceCount = i;
    }
    void mainTest(String[]strArr1){
        int i20 , i21 = - 46764 , i22 , i23 = - 3 , i24 = 47564 , i25 , i27 , i29 = 99 , iArr2[][]= new int[N][N];
        byte by2 = 105;
        vMeth();
        i20 = 1;
        do {
            fFld -= instanceCount;
            fFld += 25055 + i20 * i20;
        }
        while(++ i20 < 154);
        i21 += 125.389F;
        i21 |= - 30129;
        i22 = 1;
        int loopcount = 0;
        do {
            if(bFld){
                by2 += i22;
                for(; i23 < 72; i23 ++)i21 =(int)fFld;
            }
            i21 +=(int)fFld;
            for(i25 = 2; i25 < 72; i25 ++){
                i21 += - 58865 + i25 * i25;
                for(i27 = 1; i27 < 2; ++ i27){
                    i24 *= i29;
                    i24 >>>= - 3;
                    i29 = i21;
                    instanceCount >>= instanceCount;
                    i29 += i27 * i22 - fFld;
                }
            }
            loopcount++;
        }
        while(++ i22 < 352);
        System.out.println("loopcount:" + loopcount);

        System.out.println(i20);
        System.out.println("by2 i23 i24 = " + by2 + i24);
        System.out.println("i28 i29 iArr2 = " + i29 + iArr2);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
}
