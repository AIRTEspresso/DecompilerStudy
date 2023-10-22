 class Test {
 int N;
long instanceCount;
int iMeth(int i11){
 int i12 , i13 , i14 = 50981 , i15 = 39770 , i16 = - 83 , i17 = 63;
double d2 = 0.40652;
float f = 82.330F , fArr[]= new float[N];
short s = 1330;
for(i13 = 10;
i13 < 168;
i13 ++)switch(i13){
 case 331 : i15 = 10;
for(;
i16 < 1;
i16 ++)instanceCount += i16;
i11 >>>= i17;
d2 += 41243;
case 315 : i17 += f;
break;
case 57 : i17 = s;
case 328 : s =(short)i14;
}
 long meth_res = i11 + i15 + Double.doubleToLongBits(d2)+ Float.floatToIntBits(f)+ checkSum(fArr);
return(int)meth_res;
}
 long checkSum(Object a){
 return a.getClass().getCanonicalName().length();
}
 }
