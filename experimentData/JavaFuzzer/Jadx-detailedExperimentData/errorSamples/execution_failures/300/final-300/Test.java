 class Test {
 int N;
long instanceCount = 218L;
float fFld;
long vMeth1_check_sum;
void vMeth1(byte by , long l , int i4){
 int i5 , i9 = 125;
float f = 101.700F;
long lArr[]= new long[N];
for(i5 = 14;
i5 < 284;
++ i5)switch((i5 % 5)* 5 + 99){
 case 104 : f = 1;
while(++ f < 6)instanceCount +=(long)f;
break;
case 108 : lArr = lArr;
case 103 : fFld -= i9;
}
 vMeth1_check_sum += by + i5 + Float.floatToIntBits(f);
}
 void vMeth(int i2 , int i3){
 byte by2 = 54;
vMeth1(by2 , instanceCount , i3);
}
 void mainTest(String[]strArr1){
 int i , i17 = 11 , i19 = - 16903 , i20 = - 55683;
byte by3 = 23;
for(i = 24;
i < 390;
i ++){
 vMeth(i , i);
i20 +=(i * i17 + i17)- instanceCount;
}
 System.out.println("i19 i20 by3 = " + i19 + "," + i20 + "," + by3);
}
 public static void main(String[]strArr){
 Test _instance = new Test();
_instance.mainTest(strArr);
}
 }
