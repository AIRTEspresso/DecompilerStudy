public class Test {
   public static final int N = 400;
   public static long instanceCount = 125L;
   public static float fFld = 0.237F;
   public volatile short sFld = -20403;
   public static float[] fArrFld = new float[400];
   public static long vMeth_check_sum;
   public static long iMeth_check_sum;
   public static long vMeth1_check_sum;

   public static void vMeth1(float var0, int var1, int var2) {
      instanceCount ^= (long)var2;
      instanceCount *= 3129639821L;
      vMeth1_check_sum += (long)(Float.floatToIntBits(var0) + var1 + var2);
   }

   public static int iMeth() {
      float var0 = -63.295F;
      float var1 = -1.29F;
      int var2 = 13;
      short var3 = 142;
      int var4 = 33329;
      byte var5 = 7;
      boolean var6 = true;
      boolean[] var7 = new boolean[400];
      double var8 = 0.102915;
      FuzzerUtils.init(var7, true);

      for(var0 = 227.0F; var0 > 2.0F; var0 -= 2.0F) {
         vMeth1(var0, var2, var2);

         for(var1 = 1.0F; var1 < 14.0F; ++var1) {
            boolean var10 = true;
            var7[(int)var1] = var6;
            instanceCount <<= -47166;
            byte var12 = (byte)var3;
            var2 += (int)var1;
            float[] var10000 = fArrFld;
            var10000[(int)(var1 + 1.0F)] += (float)var3;
            var2 >>>= var2;
            var2 += (int)(-6.319F + var1 * var1);
            var6 = var6;

            for(var4 = (int)var1; 2 > var4; ++var4) {
               var8 -= (double)var0;
               instanceCount += (long)(var4 * var5 + var3 - var5);
               fFld += (float)(var4 * var4);
            }
         }
      }

      long var13 = (long)(Float.floatToIntBits(var0) + var2 + Float.floatToIntBits(var1) + var3 + (var6 ? 1 : 0) + var4 + var5) + Double.doubleToLongBits(var8) + FuzzerUtils.checkSum(var7);
      iMeth_check_sum += var13;
      return (int)var13;
   }

   public static void vMeth(short var0, float var1) {
      boolean var2 = true;
      byte var3 = -37;
      int var4 = 13;
      byte var5 = -5;
      int var6 = 8;
      int var7 = 71;
      int var8 = -6;
      short var9 = -10342;
      int var10 = 2362;
      short var11 = 234;
      byte var12 = 13;
      double var13 = 0.90843;
      double[] var15 = new double[400];
      long[] var16 = new long[400];
      FuzzerUtils.init(var16, -26019L);
      FuzzerUtils.init(var15, -1.734);

      int var17;
      for(var17 = 291; var17 > 5; --var17) {
         for(var4 = 1; 6 > var4; ++var4) {
            var6 /= (int)(var16[var17] - (long)var12 | 1L);
            instanceCount *= (long)var6;
            var7 *= var6;
            var6 *= (int)(var13--);
            var16[var4 - 1] = (long)((var7 += var4) + -(var5 >> var5) * var6);

            for(var8 = 1; var8 < 2; ++var8) {
               var13 *= (double)iMeth();
            }

            var16[var4] += 18554L;
            var9 = var3;
         }

         for(var10 = 6; var10 > 1; --var10) {
            var15[var10 + 1] *= (double)instanceCount;
            instanceCount = (long)var17;
            var6 = (int)((long)var6 + ((long)var10 | (long)fFld));
         }
      }

      vMeth_check_sum += (long)(var0 + Float.floatToIntBits(var1) + var17 + var3 + var4 + var5 + var6 + var12 + var7) + Double.doubleToLongBits(var13) + (long)var8 + (long)var9 + (long)var10 + (long)var11 + FuzzerUtils.checkSum(var16) + Double.doubleToLongBits(FuzzerUtils.checkSum(var15));
   }

   public void mainTest(String[] var1) {
      char var2 = '骆';
      boolean var3 = true;
      char var4 = '\udfa8';
      float var5 = 0.91F;
      double var6 = -11.97741;
      double[][] var8 = new double[400][400];
      boolean[] var9 = new boolean[400];
      FuzzerUtils.init(var9, false);
      FuzzerUtils.init(var8, -72.882);
      var9[(var2 >>> 1) % 400] = var9[(var2 >>> 1) % 400];
      double[] var10000 = var8[(var2 >>> 1) % 400];
      int var10001 = (var2 >>> 1) % 400;
      double var10002 = var10000[(var2 >>> 1) % 400];
      double[] var10003 = var8[(var2 >>> 1) % 400];
      int var10004 = (var2 >>> 1) % 400;
      double var10006 = var10003[(var2 >>> 1) % 400];
      var10003[var10004] = var10003[(var2 >>> 1) % 400] + 1.0;
      var10000[var10001] = var10002 - var10006;
      vMeth(this.sFld, 124.485F);
      var2 = var2;
      instanceCount += (long)var2;

      byte var10;
      for(var5 = 1.0F; ++var5 < 150.0F; var2 = (char)var10) {
         var10 = 92;
      }

      int var11;
      for(var11 = 7; 157 > var11; ++var11) {
         instanceCount *= (long)var11;
         instanceCount += (long)(var11 * var4 + var4 - var2);
      }

      var6 += (double)var11;
      var6 -= (double)fFld;
      FuzzerUtils.out.println("i f4 i17 = " + var2 + "," + Float.floatToIntBits(var5) + "," + var11);
      FuzzerUtils.out.println("i18 d2 bArr = " + var4 + "," + Double.doubleToLongBits(var6) + "," + FuzzerUtils.checkSum(var9));
      FuzzerUtils.out.println("dArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(var8)));
      FuzzerUtils.out.println("Test.instanceCount Test.fFld sFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + this.sFld);
      FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
      FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
   }

   public static void main(String[] var0) {
      try {
         Test var1 = new Test();

         for(int var2 = 0; var2 < 10; ++var2) {
            var1.mainTest(var0);
         }
      } catch (Exception var3) {
         FuzzerUtils.out.println(var3.getClass().getCanonicalName());
      }

   }

   static {
      FuzzerUtils.init(fArrFld, 85.347F);
      vMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
      vMeth1_check_sum = 0L;
   }
}
