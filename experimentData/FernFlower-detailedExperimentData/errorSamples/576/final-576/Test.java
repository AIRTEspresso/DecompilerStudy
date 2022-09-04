class Test {
    void vMeth(int i3 , int i4){
        double d = 2.68183;
        int i13 = 219 , i14 , i16 = - 64;
        d += i3;
        d -= i3;
        i3 = i4;
        for(i14 = 5; 1 < i14; i14 -= 3)i4 += i14 | i13;
        System.out.println("i3=" + i3);
        System.out.println("i4=" + i4);
        System.out.println("i13=" + i13);
        System.out.println("i14=" + i14);
        System.out.println("i16=" + i16);
        System.out.println("d=" + Double.doubleToLongBits(d));
        return;
    }

    void mainTest(){
        vMeth(15 , 184);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest();
    }
}
