public class Test {
   public static final int N = 400;
   public static long instanceCount = -9098291403467545512L;
   public static float fFld = -104.961F;
   public static volatile int iFld = 47057;
   public static int[] iArrFld = new int[400];
   public static long[] lArrFld = new long[400];
   public static long lMeth_check_sum;
   public static long vMeth_check_sum;
   public static long lMeth1_check_sum;

   public static long lMeth1(int var0, int var1, double var2) {
      short var4 = -6770;
      int var5 = -5;
      int var6 = 37;
      int var7 = -52;
      int var8 = -40554;
      boolean var9 = false;
      long[] var10 = new long[400];
      FuzzerUtils.init(var10, 163L);

      try {
         var0 *= var1;
         ++var10[(var0 >>> 1) % 400];
         instanceCount = (long)var1;
         int[] var11 = iArrFld;
         int var12 = var11.length;

         for(int var13 = 0; var13 < var12; ++var13) {
            int var10000 = var11[var13];
            var1 -= var4;
         }

         fFld = (float)instanceCount;
      } catch (UserDefinedExceptionTest var15) {
         for(var5 = 208; var5 > 3; --var5) {
            for(var7 = 1; 8 > var7; var7 += 3) {
               var2 += (double)var0;
               if (!var9) {
                  var10[var5 + 1] += -45L;
                  fFld *= (float)var0;
                  var6 *= (int)instanceCount;
                  if (var9) {
                     break;
                  }
               }
            }
         }
      }

      long var16 = (long)(var0 + var1) + Double.doubleToLongBits(var2) + (long)var4 + (long)var5 + (long)var6 + (long)var7 + (long)var8 + (long)(var9 ? 1 : 0) + FuzzerUtils.checkSum(var10);
      lMeth1_check_sum += var16;
      return var16;
   }

   public static void vMeth(int var0, int var1) {
      double var2 = 2.68183;
      double var4 = -10.5088;
      boolean var6 = true;
      int var7 = 219;
      int var8 = 161;
      int var9 = -201;
      byte var10 = -64;
      long var11 = -42L;
      var2 *= (double)(instanceCount + -4L + lMeth1(10, var1, var2) >> var1);
      var2 += (double)var0;
      var2 -= (double)var0;
      var0 = var1;

      int var13;
      for(var13 = 15; var13 < 363; ++var13) {
         for(var8 = 5; 1 < var8; var8 -= 3) {
            var1 += var8 | var7;
         }

         for(var4 = 1.0; var4 < 5.0; ++var4) {
            switch ((var10 >>> 1) % 6 + 83) {
               case 83:
                  instanceCount += (long)fFld;
                  if (var13 != 0) {
                     vMeth_check_sum += (long)(var1 + var1) + Double.doubleToLongBits(var2) + (long)var13 + (long)var7 + (long)var8 + (long)var9 + Double.doubleToLongBits(var4) + (long)var10 + var11;
                     return;
                  }
                  break;
               case 84:
                  var9 ^= var9;
                  if (var1 != 0) {
                     vMeth_check_sum += (long)(var0 + var1) + Double.doubleToLongBits(var2) + (long)var13 + (long)var7 + (long)var8 + (long)var9 + Double.doubleToLongBits(var4) + (long)var10 + var11;
                     return;
                  }

                  iFld = (int)fFld;
                  iArrFld = iArrFld;
                  break;
               case 85:
                  var7 >>= var1;
               case 86:
                  var11 *= (long)var2;
                  break;
               case 87:
                  var9 = (int)((double)var9 + 22761.0 + var4 * var4);
                  break;
               case 88:
                  var2 -= (double)var7;
            }
         }
      }

      vMeth_check_sum += (long)(var1 + var1) + Double.doubleToLongBits(var2) + (long)var13 + (long)var7 + (long)var8 + (long)var9 + Double.doubleToLongBits(var4) + (long)var10 + var11;
   }

   public long lMeth(long var1) {
      boolean var3 = true;
      int var4 = -11;
      int var5 = 3;
      long var6 = 6261206561801069038L;
      short var8 = 25928;

      int var11;
      for(var11 = 15; 263 > var11; ++var11) {
         var6 = 1L;

         do {
            vMeth(var11, 184);
            var5 = 1;

            do {
               iFld >>= var4;
               iFld /= var11 | 1;
               iFld = (int)fFld;
               var4 = var8 + (int)var6;
               iFld = -8;
               var4 >>= var5;
               iArrFld[(int)var6] = -29041;
               var4 <<= var11;
               lArrFld[var5 - 1] = 1L;
               var5 += 3;
            } while(var5 < 1);

            iFld = var5;
         } while(++var6 < 7L);
      }

      long var9 = var1 + (long)var11 + (long)var4 + var6 + (long)var5 + (long)var8;
      lMeth_check_sum += var9;
      return var9;
   }

   public void mainTest(String[] var1) {
      float var2 = -113.33F;
      int var3 = -2;
      int var4 = -61310;
      int var5 = -11;
      int var6 = 144;
      int var7 = 145;
      int var8 = -61224;
      int var9 = -120;
      byte var10 = -55;
      boolean var11 = true;
      boolean var12 = false;
      var2 *= (float)((instanceCount + (long)var3) * this.lMeth(instanceCount) + (long)var3);

      int[] var10000;
      for(var4 = 335; var4 > 16; --var4) {
         var10 -= (byte)((int)instanceCount);
         var3 = var5;
         iFld += '荸' + var4 * var4;
         var10000 = iArrFld;
         var10000[var4 - 1] += iFld;
         iFld -= 453473937;
         var10000 = iArrFld;
         var10000[var4] *= (int)var2;

         for(var6 = 4; 79 > var6; ++var6) {
            double var13 = -82.51976;
            iFld <<= 744;
            iFld += var6;
            var13 = (double)iFld;
         }
      }

      for(var8 = 2; var8 < 366; ++var8) {
         if (var11) {
            var5 -= 56;
            var9 -= 185;
         } else if (var12) {
            instanceCount = (long)var8;
            var10000 = iArrFld;
            var10000[var8] <<= var6;
         } else {
            if (var11) {
               break;
            }

            var7 -= 14;
         }

         var7 = var6;
         var5 += var8 | var6;
         int var15 = var9 - (int)var2;
         var12 = var12;
         var9 = -224;
         instanceCount = instanceCount;
      }

      instanceCount = 45L;
      FuzzerUtils.out.println("f i i18 = " + Float.floatToIntBits(var2) + "," + var3 + "," + var4);
      FuzzerUtils.out.println("i19 by i20 = " + var5 + "," + var10 + "," + var6);
      FuzzerUtils.out.println("i21 i22 i23 = " + var7 + "," + var8 + "," + var9);
      FuzzerUtils.out.println("b1 b2 = " + (var11 ? 1 : 0) + "," + (var12 ? 1 : 0));
      FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.iFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + iFld);
      FuzzerUtils.out.println("Test.iArrFld Test.lArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(lArrFld));
      FuzzerUtils.out.println("lMeth1_check_sum: " + lMeth1_check_sum);
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
      FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
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
      FuzzerUtils.init((int[])iArrFld, (int)64166);
      FuzzerUtils.init(lArrFld, 62351L);
      lMeth_check_sum = 0L;
      vMeth_check_sum = 0L;
      lMeth1_check_sum = 0L;
   }
}
