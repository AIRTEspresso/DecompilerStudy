 import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
public class Test {
 public static final int N = 400;
public static long instanceCount = 2842853334L;
public static float fFld = 2.870F;
public static boolean bFld = false;
public static byte byFld = - 90;
public static int iArrFld[]= new int[N];
static {
 init(Test.iArrFld , - 82);
}
 public static long vMeth_check_sum = 0;
public static long fMeth_check_sum = 0;
public static long lMeth_check_sum = 0;
public static long lMeth(){
 int i10 = 241 , i11 = 31096 , i12 = 136 , i13 = 10 , i14 = - 6 , i15 = - 55006 , iArr[]= new int[N];
init(iArr , 14760);
for(i10 = 9;
301 > i10;
++ i10){
 for(i12 = 6;
i12 > i10;
i12 -= 2){
 i11 = i10;
for(i14 = 1;
i14 < 1;
i14 ++){
 iArr = int1array(N ,(int)5);
i11 +=(8 +(i14 * i14));
i11 = i15;
i13 +=(i14 * i14);
iArr[i10 + 1]= i10;
i11 +=(i14 * i10);
i11 += i15;
try {
 i15 =(i14 % i15);
i13 =(- 134 % i15);
i15 =(33236 % i12);
}
 catch(ArithmeticException a_e){
 }
 Test.bFld = Test.bFld;
i13 >>= i12;
}
 Test.instanceCount -= i13;
}
 }
 long meth_res = i10 + i11 + i12 + i13 + i14 + i15 + checkSum(iArr);
lMeth_check_sum += meth_res;
return(long)meth_res;
}
 public static float fMeth(int i6 , int i7 , int i8){
 double d = - 66.78893;
int i9 = 0;
boolean bArr[]= new boolean[N];
long lArr[]= new long[N];
init(bArr , false);
init(lArr , 5L);
for(d = 1;
d < 181;
++ d){
 Test.instanceCount +=(- Math.abs((int)(- lMeth())));
i9 += i8;
bArr[(int)(d)]= Test.bFld;
i7 *= i6;
lArr[(int)(d)]= i8;
i6 +=(int)(((d * Test.byFld)+ Test.instanceCount)- i7);
i9 *= i8;
}
 long meth_res = i6 + i7 + i8 + Double.doubleToLongBits(d)+ i9 + checkSum(bArr)+ checkSum(lArr);
fMeth_check_sum += meth_res;
return(float)meth_res;
}
 public static void vMeth(long l , long l1){
 int i5 = 216;
i5 =(int)(- fMeth(i5 , i5 , i5));
vMeth_check_sum += l + l1 + i5;
}
 public void mainTest(String[]strArr1){
 int i = 13484 , i1 = 42196 , i2 = 31897 , i3 = - 1 , i4 = 233 , i16 = 220 , i17 = - 5 , i18 = - 16230 , i19 = 171 , i20 = - 35848 , i21 = - 9525 , i22 = - 207;
float f = - 62.976F , fArr[]= new float[N];
short s = - 21624;
double dArr[][][]= new double[N][N][N];
init(fArr , 98.624F);
init(dArr , - 60.73362);
i = 1;
while(++ i < 298){
 for(i1 = 3;
i1 < 84;
i1 ++){
 for(i3 = 1;
i3 < 2;
++ i3){
 fArr[i1]*= i3;
i2 =(int)(((Test.instanceCount - Test.instanceCount)+(- 48916 - Math.abs(Test.instanceCount)))^(long)(-(- 40.112526 *(Test.instanceCount + 2.18F))));
}
 Test.fFld +=(((i1 * i)+ Test.instanceCount)- i2);
i4 %=(int)((i4 --)| 1);
vMeth(- 6L , - 7L);
Test.fFld = Test.instanceCount;
}
 i2 -= i2;
}
 for(f = 277;
1 < f;
-- f){
 s +=(short)(((f * i16)+ i16)- i3);
for(i17 = 5;
91 > i17;
i17 ++){
 for(i19 =(int)(f);
i19 < 2;
++ i19){
 Test.instanceCount = s;
Test.instanceCount += i19;
Test.iArrFld[i19 - 1]*= i19;
}
 switch((int)((f % 2)+ 33)){
 case 33 : for(i21 = 1;
i21 < 2;
i21 ++){
 i16 -=(int)- 53734L;
fArr[(int)(f)]*= i;
Test.iArrFld[i21 + 1]= i21;
switch((((i21 >>> 1)% 6)* 5)+ 14){
 case 16 : i2 /=(int)((long)(f)| 1);
Test.instanceCount = - 1;
dArr[i17 + 1][(int)(f + 1)]= dArr[i21 - 1][i21 - 1];
break;
case 34 : Test.byFld +=(byte)(((i21 * i16)+ i3)- Test.fFld);
case 35 : Test.fFld = Test.instanceCount;
break;
case 24 : Test.instanceCount >>= Test.instanceCount;
Test.iArrFld[i17 + 1]+=(int)- 4000847739L;
break;
case 36 : if(Test.bFld)break;
case 39 : i20 = i18;
break;
}
 }
 break;
case 34 : Test.iArrFld[(int)(f - 1)]<<=(int)Test.instanceCount;
break;
}
 }
 }
 System.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
System.out.println("i3 i4 f = " + i3 + "," + i4 + "," + Float.floatToIntBits(f));
System.out.println("i16 s i17 = " + i16 + "," + s + "," + i17);
System.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
System.out.println("i21 i22 fArr = " + i21 + "," + i22 + "," + Double.doubleToLongBits(checkSum(fArr)));
System.out.println("dArr = " + Double.doubleToLongBits(checkSum(dArr)));
System.out.println("Test.instanceCount Test.fFld Test.bFld = " + Test.instanceCount + "," + Float.floatToIntBits(Test.fFld)+ "," +(Test.bFld ? 1 : 0));
System.out.println("Test.byFld Test.iArrFld = " + Test.byFld + "," + checkSum(Test.iArrFld));
System.out.println("lMeth_check_sum: " + lMeth_check_sum);
System.out.println("fMeth_check_sum: " + fMeth_check_sum);
System.out.println("vMeth_check_sum: " + vMeth_check_sum);
}
 public static void main(String[]strArr){
 try {
 Test _instance = new Test();
_instance.mainTest(strArr);
}
 catch(Exception ex){
 System.out.println(ex.getClass().getCanonicalName());
}
 }
 public static PrintStream out = System.out;
public static Random random = new Random(1);
public static long seed = 1L;
public static int UnknownZero = 0;
public static int nextInt(){
 return random.nextInt();
}
 public static long nextLong(){
 return random.nextLong();
}
 public static float nextFloat(){
 return random.nextFloat();
}
 public static double nextDouble(){
 return random.nextDouble();
}
 public static boolean nextBoolean(){
 return random.nextBoolean();
}
 public static byte nextByte(){
 return(byte)random.nextInt();
}
 public static short nextShort(){
 return(short)random.nextInt();
}
 public static char nextChar(){
 return(char)random.nextInt();
}
 public static void init(boolean[]a , boolean seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(j % 2 == 0)? seed :(j % 3 == 0);
}
 }
 public static void init(boolean[][]a , boolean seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(long[]a , long seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(j % 2 == 0)? seed + j : seed - j;
}
 }
 public static void init(long[][]a , long seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(int[]a , int seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(j % 2 == 0)? seed + j : seed - j;
}
 }
 public static void init(int[][]a , int seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(short[]a , short seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(short)((j % 2 == 0)? seed + j : seed - j);
}
 }
 public static void init(short[][]a , short seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(char[]a , char seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(char)((j % 2 == 0)? seed + j : seed - j);
}
 }
 public static void init(char[][]a , char seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(byte[]a , byte seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(byte)((j % 2 == 0)? seed + j : seed - j);
}
 }
 public static void init(byte[][]a , byte seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(double[]a , double seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(j % 2 == 0)? seed + j : seed - j;
}
 }
 public static void init(double[][]a , double seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(float[]a , float seed){
 for(int j = 0;
j < a.length;
j ++){
 a[j]=(j % 2 == 0)? seed + j : seed - j;
}
 }
 public static void init(float[][]a , float seed){
 for(int j = 0;
j < a.length;
j ++){
 init(a[j], seed);
}
 }
 public static void init(Object[]a , Object seed){
 for(int j = 0;
j < a.length;
j ++)try {
 a[j]= seed.getClass().newInstance();
}
 catch(Exception ex){
 a[j]= seed;
}
 }
 public static long checkSum(Object a){
 if(a == null)return 0L;
return(long)a.getClass().getCanonicalName().length();
}
 public static int[]int1array(int sz , int seed){
 int[]ret = new int[sz];
init(ret , seed);
return ret;
}
 }
