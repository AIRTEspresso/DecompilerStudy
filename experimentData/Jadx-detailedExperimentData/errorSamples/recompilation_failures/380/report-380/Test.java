class Test {
    byte byFld;
    {
        int i12 , i13 , i16 = 99 , i17 = 208;
        for(i12 = 137; i12 > 5; ){
            i13 = i17;
            i17 -= byFld;
            switch(i13){
                case 89 : i17 += i16;
            }
        }
    }
}
