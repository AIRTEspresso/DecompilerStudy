class Test {
    static boolean bFld;
    {
        int i16 = 45938;
        switch(i16){
            case 109 : bFld = bFld;
            case 110 : bFld = false;
        }
    }
}
