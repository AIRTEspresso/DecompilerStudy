public class Test {
   public static final int N = 400;
   public static long instanceCount = -193369766L;
   public static double dFld = -17.97118;
   public static float fFld = 12.321F;
   public int iFld = -14;
   public static byte byFld = -101;
   public boolean[][] bArrFld = new boolean[400][400];
   public static short[] sArrFld = new short[400];
   public static long vMeth_check_sum;
   public static long vMeth1_check_sum;
   public static long vMeth2_check_sum;

   public static void vMeth2(int var0, short var1, float var2) {
      int var3 = 36738;
      int var4 = 90;
      int var5 = -29261;
      int var6 = 3;
      int var7 = -57161;
      int var8 = -205;
      int var9 = 43048;
      int var10 = 2;
      int[] var11 = new int[400];
      byte var12 = 63;
      FuzzerUtils.init((int[])var11, (int)49954);

      for(var3 = 293; var3 > 13; --var3) {
         var5 = 6;

         while(true) {
            --var5;
            if (var5 <= 0) {
               break;
            }

            if (var5 != 0) {
               vMeth2_check_sum += (long)(var0 + var1 + Float.floatToIntBits(var2) + var3 + var4 + var5 + var6 + var7 + var8 + var12 + var9 + var10) + FuzzerUtils.checkSum(var11);
               return;
            }

            var4 = var0;

            for(var6 = 1; var6 < 1; ++var6) {
               var7 *= var4;
               var11[var6] += (int)instanceCount;
               var8 += var6 * var6;
               if (var5 != 0) {
                  vMeth2_check_sum += (long)(var0 + var1 + Float.floatToIntBits(var2) + var3 + var4 + var5 + var6 + var7 + var8 + var12 + var9 + var10) + FuzzerUtils.checkSum(var11);
                  return;
               }
            }

            var4 = var12;

            for(var9 = 1; var9 < 1; ++var9) {
               var10 += var5;
            }

            instanceCount = (long)var3;
            var0 *= 8067;
            var12 >>= (byte)((int)instanceCount);
         }
      }

      vMeth2_check_sum += (long)(var0 + var1 + Float.floatToIntBits(var2) + var3 + var4 + var5 + var6 + var7 + var8 + var12 + var9 + var10) + FuzzerUtils.checkSum(var11);
   }

   public static void vMeth1(short var0, int var1) {
      float var2 = -114.304F;
      float[] var3 = new float[400];
      double var4 = -2.130951;
      boolean var6 = true;
      byte var7 = 8;
      boolean var8 = true;
      short var9 = -23147;
      int[][] var10 = new int[400][400];
      FuzzerUtils.init((int[][])var10, (int)24421);
      FuzzerUtils.init(var3, 41.0F);
      vMeth2(var1, var0, var2);
      var1 = (int)instanceCount;
      var10[(var1 >>> 1) % 400][(var1 >>> 1) % 400] *= var1;
      var4 = 1.0;

      int var11;
      int var12;
      do {
         var10[(int)var4][(int)(var4 + 1.0)] *= -13;

         for(var11 = 1; var11 < 10; ++var11) {
            var2 += (float)var11;
            var3[var11 - 1] -= -6.0F;
         }

         var0 >>>= (short)var7;

         for(var12 = 1; 10 > var12; var12 += 2) {
            instanceCount = (long)var2;
            instanceCount = (long)var11;
            var1 = (int)((float)var1 + ((float)var12 - var2));
            var1 *= var11;
            var10[var12][var12] -= var11;
         }
      } while(++var4 < 161.0);

      vMeth1_check_sum += (long)(var0 + var1 + Float.floatToIntBits(var2)) + Double.doubleToLongBits(var4) + (long)var11 + (long)var7 + (long)var12 + (long)var9 + FuzzerUtils.checkSum(var10) + Double.doubleToLongBits(FuzzerUtils.checkSum(var3));
   }

   public static void vMeth(int var0, int var1, short var2) {
      boolean var3 = true;
      int var4 = 30;
      int var5 = -183;
      char var6 = 'ꋿ';
      int var7 = 88;
      short var8 = 2700;
      int[] var9 = new int[400];
      byte var10 = -33;
      boolean var11 = false;
      long[][] var12 = new long[400][400];
      FuzzerUtils.init((int[])var9, (int)-189);
      FuzzerUtils.init(var12, 56L);
      vMeth1(var2, var0);
      var9[(var1 >>> 1) % 400] += var1;

      int var13;
      for(var13 = 6; 250 > var13; ++var13) {
         if (!var11) {
            if (var11) {
               fFld *= (float)instanceCount;
            } else {
               var0 >>= (int)instanceCount;
            }
         } else if (!var11) {
            for(var7 = var13; var7 < 7; ++var7) {
               var9[var7] *= var5;
               var2 *= (short)((int)instanceCount);
               var4 += 6;
            }
         } else {
            instanceCount = instanceCount;
            dFld = (double)var10;

            for(var5 = 1; var5 < 7; var5 += 3) {
               var4 = 6;
               var12[var5 - 1][var13] = (long)var6;
            }

            var9[var13 + 1] -= -59831;
         }
      }

      vMeth_check_sum += (long)(var0 + var1 + var2 + var13 + var4 + var10 + var5 + var6 + (var11 ? 1 : 0) + var7 + var8) + FuzzerUtils.checkSum(var9) + FuzzerUtils.checkSum(var12);
   }

   public void mainTest(String[] var1) {
      int var2 = 8;
      boolean var3 = true;
      int var4 = -7;
      int var5 = 11;
      byte var6 = 7;
      short var7 = 26935;
      int var8 = 8988;
      int var9 = 17;
      float var10 = -1.639F;
      float[] var11 = new float[400];
      short var12 = 4139;
      boolean var13 = false;
      long[][] var14 = new long[400][400];
      long[][][] var15 = new long[400][400][400];
      byte[] var16 = new byte[400];
      FuzzerUtils.init(var11, -1.157F);
      FuzzerUtils.init(var14, -583687835L);
      FuzzerUtils.init((byte[])var16, (byte)67);
      FuzzerUtils.init((Object[][])var15, -242L);
      this.bArrFld[(var2 >>> 1) % 400][(var2 >>> 1) % 400] = (float)((long)var2 - instanceCount) + var10 * (float)var2 > (float)Integer.reverseBytes(var2 + var2);
      vMeth(12, var2, var12);
      int var17 = 1;

      while(true) {
         while(true) {
            ++var17;
            if (var17 >= 151) {
               FuzzerUtils.out.println("i f s4 = " + var2 + "," + Float.floatToIntBits(var10) + "," + var12);
               FuzzerUtils.out.println("i23 i24 b1 = " + var17 + "," + var4 + "," + (var13 ? 1 : 0));
               FuzzerUtils.out.println("i25 i26 i27 = " + var5 + "," + var6 + "," + var7);
               FuzzerUtils.out.println("i28 i29 fArr1 = " + var8 + "," + var9 + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(var11)));
               FuzzerUtils.out.println("lArr1 byArr lArr2 = " + FuzzerUtils.checkSum(var14) + "," + FuzzerUtils.checkSum(var16) + "," + FuzzerUtils.checkSum((Object[][])var15));
               FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.fFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + Float.floatToIntBits(fFld));
               FuzzerUtils.out.println("iFld Test.byFld bArrFld = " + this.iFld + "," + byFld + "," + FuzzerUtils.checkSum(this.bArrFld));
               FuzzerUtils.out.println("Test.sArrFld = " + FuzzerUtils.checkSum(sArrFld));
               FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
               FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
               FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
               return;
            }

            var2 *= -14;
            switch (var17 % 5 + 83) {
               case 83:
                  var4 = 1;

                  do {
                     var11[var17] -= var10;
                     var2 /= 11;
                     var10 += (float)instanceCount;
                     var14[var4 - 1][var4] += (long)this.iFld;
                     var11[var17] -= (float)var12;
                     ++var4;
                  } while(var4 < 166);

                  this.bArrFld[var17 - 1][var17] = var13;
                  byFld <<= (byte)var17;
                  var16[var17] += (byte)var2;
               case 84:
                  var15 = var15;
                  this.iFld = (int)((long)this.iFld + ((long)(var17 * var2) + instanceCount - (long)var2));

                  for(var5 = 9; var5 < 166; ++var5) {
                     var2 += var5;
                  }

                  var7 = 3;
                  if (var7 < 166) {
                     var8 <<= -96;
                     instanceCount = (long)var7;
                     var2 = (int)((float)var2 + (float)var7 * var10);
                     var8 += var7 * var6 + var4 - var17;
                  }
                  break;
               case 85:
                  var8 -= this.iFld;
                  int var10002 = var15[var17][var17 - 1][var17 - 1]++;
                  var15[var17][var17][var17] = (long)var17;
                  var8 = (int)((float)var8 + ((float)(var17 * byFld) + var10 - (float)var2));
                  break;
               case 86:
                  sArrFld = sArrFld;
                  var9 = this.iFld;
                  break;
               case 87:
               default:
                  instanceCount = 34L;
            }
         }
      }
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
      FuzzerUtils.init(sArrFld, (short)-24983);
      vMeth_check_sum = 0L;
      vMeth1_check_sum = 0L;
      vMeth2_check_sum = 0L;
   }
}
