 class Test {
 boolean bFld;
void mainTest(String[]strArr1){
 int i = 2 , i22 , i24 = 58974;
for(i22 = 18;
i22 < 359;
++ i22)switch(i22){
 case 100 : if(bFld)break;
case 103 : if(bFld)continue;
default : i <<= i24;
}
 System.out.println("i d i1 = " + i);
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
 }
