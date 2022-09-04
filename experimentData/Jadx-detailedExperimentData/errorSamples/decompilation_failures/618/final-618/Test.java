class Test {
    int N;
    long instanceCount;
    long vMeth1_check_sum;
    void vMeth1(int i3){
        int i4 , i5 = 6 , i6 = 13 , i7 = - 33451 , i8 = 2;
        long l1 = 40391L , lArr[]= new long[N];
        boolean b = true , bArr[]= new boolean[N];
        double d = 0.63859;
        for(i4 = 4; i4 < 312; i4 ++)do {
            bArr[i4]= b;
            for(; i7 < 1; i7 += 2){
                d *= i7;
                i8 += i7 | instanceCount;
                i6 <<= i5;
            }
        }
        while(++ l1 < 5);
        vMeth1_check_sum += i3 + i6 + 1 + d + i8 + checkSum(lArr);
    }
    long checkSum(Object a){
        return a.getClass().getCanonicalName().length();
    }
}
