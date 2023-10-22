class Test {
    int N = 400;
    long instanceCount;
    long bMeth_check_sum;
    boolean bMeth(double d1 , int i6){
        int i7 , i8 = - 61492 , i9 , i10 = - 57244 , i11 = 2 , iArr[]= new int[N];
        float f = - 1.231F , fArr1[]= new float[N];
        init(fArr1 , 119.546F);
        init(iArr , - 4);
        i7 = 1;
        for(i9 = 232; i9 > 10; -- i9){
            i10 += 12545 + i9 * i9;
            i6 += i9 + i10;
            i11 = 1;
            while(++ i11 < 7){
                fArr1[i9 - 1]+= instanceCount;
                i10 = i7;
                f += i11;
            }
        }
        long meth_res = Double.doubleToLongBits(d1)+ i6 + i7 + 1 + Float.floatToIntBits(f)+ i8 + i9 + i10 + i11 + Double.doubleToLongBits(checkSum(fArr1))+ checkSum(iArr);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }
    void vMeth(int i , int i1 , int i2){
        double d;
        int i3 = 10 , i4;
        float fArr[]= new float[N];
        init(fArr , 1.282F);
        i += - 3469599995L + i2;
        for(d = 190; d > 5; d --){
            for(i4 = 1; i4 < 9; ++ i4){
                i1 += i4;
                instanceCount =(long)(- fArr[i4]-(Integer.reverseBytes(i2)+ i));
                i2 += Math.max(- 69 -(i1 - d), i3 + i3)* - 124;
                if(bMeth(- 6.45281 , i3))break;
            }
            i -=(int)instanceCount;
            instanceCount += d;
            i2 = i;
        }
    }
    void vSmallMeth(){
        int i12 = - 58;
        vMeth(i12 , i12 , 86);
    }
    void mainTest(String[]strArr1){
        for(int smallinvoc = 0; smallinvoc < 787; smallinvoc ++)vSmallMeth();
        System.out.println("bMeth_check_sum: " + bMeth_check_sum);
    }
    public static void main(String[]strArr){
        Test _instance = new Test();
        _instance.mainTest(strArr);
    }
    void init(int[]a , int seed){
        for(int j = 0; j < a.length; j++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
    void init(float[]a , float seed){
        for(int j = 0; j < a.length; j ++)a[j]= j % 2 == 0 ? seed + j : seed - j;
    }
    long checkSum(int[]a){
        long sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
    double checkSum(float[]a){
        double sum = 0;
        for(int j = 0; j < a.length; j ++)sum += a[j]/(j + 1)+ a[j]%(j + 1);
        return sum;
    }
}
