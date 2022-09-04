public class Test {
   public static final int N = 400;
   public static volatile long instanceCount = -11L;
   public static volatile int iFld = 63;
   public boolean bFld = false;
   public int iFld1 = -98;
   public int[] iArrFld = new int[400];
   public long[] lArrFld = new long[400];
   public static long vMeth_check_sum = 0L;
   public static long vMeth1_check_sum = 0L;
   public static long vMeth2_check_sum = 0L;

   public static void vMeth2() {
      float var0 = 0.854F;
      int var1 = 10;
      int var2 = -13;
      int var3 = 60186;
      byte var4 = 0;
      int[][] var5 = new int[400][400];
      int[][][] var6 = new int[400][400][400];
      long[] var7 = new long[400];
      FuzzerUtils.init(var7, 0L);
      FuzzerUtils.init((int[][])var5, (int)-9852);
      FuzzerUtils.init((Object[][])var6, -12);
      instanceCount += instanceCount;

      for(var0 = 10.0F; var0 < 264.0F; ++var0) {
         var2 = 6;

         while(var2 > 1) {
            var7 = var7;
            var5[var2][(int)var0] += var3;
            var1 = (int)((float)var1 + ((float)var2 * var0 + var0 - (float)instanceCount));
            var5[var2 + 1][(int)(var0 + 1.0F)] = (int)instanceCount;
            var6[var2][(int)var0][var2 + 1] -= (int)instanceCount;
            switch (var2 % 2 + 38) {
               case 38:
                  var1 = (int)((long)var1 + ((long)var2 | (long)var0));
                  switch ((int)(var0 % 1.0F * 5.0F + 69.0F)) {
                     case 70:
                        var7 = var7;

                        try {
                           var1 /= -48060;
                           var5[var2 - 1][var2 + 1] = -113 / var4;
                           var5[var2 - 1][(int)(var0 + 1.0F)] = 232 % var5[(int)(var0 + 1.0F)][(int)var0];
                        } catch (ArithmeticException var9) {
                        }

                        var5[(int)var0] = var5[(int)var0];
                        var1 += var2 * var2;
                        break;
                     default:
                        var3 = (int)instanceCount;
                  }
               case 39:
                  var1 += var2 * var2 + var4 - iFld;
               default:
                  --var2;
            }
         }
      }

      vMeth2_check_sum += (long)(Float.floatToIntBits(var0) + var1 + var2 + var3 + var4) + FuzzerUtils.checkSum(var7) + FuzzerUtils.checkSum(var5) + FuzzerUtils.checkSum((Object[][])var6);
   }

   public static void vMeth1(float var0, int var1) {
      float var2 = -2.395F;
      short var3 = 226;
      int var4 = 2;
      short var5 = -192;
      int var6 = 46;
      short var7 = 14078;
      int[][][] var8 = new int[400][400][400];
      short var9 = 22639;
      boolean var10 = true;
      double[] var11 = new double[400];
      FuzzerUtils.init((Object[][])var8, -20);
      FuzzerUtils.init(var11, 3.112165);
      vMeth2();
      var1 *= var1;
      if (var10) {
         iFld = var1;
      } else if (var10) {
         try {
            iFld *= -55979;

            for(var2 = 4.0F; var2 < 258.0F; ++var2) {
               for(var4 = 6; 1 < var4; var4 -= 3) {
                  iFld = 108;

                  for(var6 = var4; var6 < 6; ++var6) {
                     var8[var4][(int)var2][(int)var2] >>= -901995756;
                     var8[(int)var2][(int)var2][var6 + 1] = var1;
                     var11[var4] = (double)var9;
                     iFld -= -1;
                     instanceCount += (long)(var6 * var4 + var4) - instanceCount;
                  }
               }
            }
         } catch (UserDefinedExceptionTest var13) {
            var1 = var5;
         }
      } else {
         instanceCount = instanceCount;
      }

      vMeth1_check_sum += (long)(Float.floatToIntBits(var0) + var1 + Float.floatToIntBits(var2) + var3 + var4 + var5 + var6 + var7 + var9 + (var10 ? 1 : 0)) + FuzzerUtils.checkSum((Object[][])var8) + Double.doubleToLongBits(FuzzerUtils.checkSum(var11));
   }

   public void vMeth(int var1, long var2, int var4) {
      boolean var5 = true;
      int var6 = -124;
      int var7 = -157;
      byte var8 = 8;
      int var9 = 52;
      int var10 = 41;
      double var11 = 117.27922;
      instanceCount >>= 'ꯏ';

      int var13;
      for(var13 = 3; 167 > var13; var13 += 2) {
         long var10000 = Long.reverseBytes(instanceCount);
         --var6;
         var2 = var10000 - (long)var6 & (instanceCount = (long)var6) % (long)(11 - --this.iArrFld[var13] | 1);

         for(var11 = 1.0; var11 < 19.0; ++var11) {
            switch (var13 % 2 * 5 + 47) {
               case 54:
                  this.iArrFld[(int)(var11 - 1.0)] = var7;
                  break;
               case 56:
                  vMeth1(100.618F, var7);
            }

            var4 = var8;

            for(var9 = 1; 2 > var9; ++var9) {
               var7 = var6;
               var4 = 0;
               this.bFld = this.bFld;
            }

            instanceCount -= -2L;
         }

         var4 = var4;
         var10 = (int)((long)var10 + ((long)var13 | instanceCount));
      }

      vMeth_check_sum += (long)var1 + var2 + (long)var4 + (long)var13 + (long)var6 + Double.doubleToLongBits(var11) + (long)var7 + (long)var8 + (long)var9 + (long)var10;
   }

   public void mainTest(String[] var1) {
      double var2 = 2.118649;
      boolean var4 = true;
      int var5 = -44792;
      int var6 = 157;
      int var7 = 13;
      int var8 = -108;
      float var9 = -46.208F;
      byte var10 = -20;
      this.vMeth(6, instanceCount, iFld);
      iFld <<= iFld;
      this.lArrFld = FuzzerUtils.long1array(400, 8311270115264725562L);
      iFld += (int)var2;
      instanceCount -= (long)iFld;
      long[] var10000 = this.lArrFld;
      int var10001 = (iFld >>> 1) % 400;
      var10000[var10001] += (long)iFld;
      instanceCount = instanceCount;
      instanceCount = instanceCount;

      int var13;
      for(var13 = 8; var13 < 177; ++var13) {
         var5 >>>= -26072;
         instanceCount += (long)(var13 - var13);
         instanceCount += (long)(var13 * iFld + var5 - iFld);
         var5 += var13 * var5;
         var5 >>= var13;

         for(var6 = 5; var6 < 148; ++var6) {
            iFld |= var7;
            var8 = 1;

            do {
               var7 *= iFld;
               var9 += 74.0F;
               this.lArrFld[var6 + 1] = (long)var7;
               double var14 = var2 - (double)var13;
               instanceCount -= instanceCount;
               iFld += var8 * var8;
               var2 = -2.48671;

               try {
                  int var15 = var8 / this.iFld1;
                  var7 = 8 / this.iArrFld[var6 - 1];
                  var15 = var7 / this.iFld1;
               } catch (ArithmeticException var12) {
               }

               ++var8;
            } while(var8 < 2);

            this.iArrFld[var13] = (int)var2;
            var9 = (float)var10;
            this.iArrFld = this.iArrFld;
            iFld += var6;
            var5 = (int)var9;
         }
      }

      FuzzerUtils.out.println("d1 i18 i19 = " + Double.doubleToLongBits(var2) + "," + var13 + "," + var5);
      FuzzerUtils.out.println("i20 i21 i22 = " + var6 + "," + var7 + "," + var8);
      FuzzerUtils.out.println("f3 by = " + Float.floatToIntBits(var9) + "," + var10);
      FuzzerUtils.out.println("Test.instanceCount Test.iFld bFld = " + instanceCount + "," + iFld + "," + (this.bFld ? 1 : 0));
      FuzzerUtils.out.println("iFld1 iArrFld lArrFld = " + this.iFld1 + "," + FuzzerUtils.checkSum(this.iArrFld) + "," + FuzzerUtils.checkSum(this.lArrFld));
      FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
      FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
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
}
