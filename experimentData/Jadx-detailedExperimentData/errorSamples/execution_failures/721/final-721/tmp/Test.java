 class Test {
 void mainTest(String[]strArr1){
 int i , i17 , i18 = 6;
double d = 1.28617;
for(i17 = 2;
i17 < 158;
++ i17)switch(i17 % 4){
 case 80 : i17 -= 37983;
case 87 : i18 += i17;
}
 System.out.println("d i17 i18 = " + Double.doubleToLongBits(d)+ "," + i17 + "," + i18);
}
 public static void main(String[]strArr){
 Test _instance = new Test();
_instance.mainTest(strArr);
}
 }
