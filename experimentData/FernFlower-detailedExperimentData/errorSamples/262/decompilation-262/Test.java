public class Test {
   public static final int N = 400;
   public static long instanceCount = -6L;
   public byte byFld = -1;
   public double dFld = 58.27429;
   public static short sFld = 29103;
   public boolean bFld = false;
   public static volatile long[][] lArrFld = new long[400][400];
   public static long dMeth_check_sum;
   public static long vMeth_check_sum;
   public static long iMeth_check_sum;

   public int iMeth() {
      boolean var1 = true;
      int var2 = 52825;
      int var3 = 41086;
      int var4 = -963;
      char var5 = '\ue4ed';
      int var6 = 38547;
      int var7 = -11;
      int[] var8 = new int[400];
      boolean var9 = true;
      double var10 = 119.89531;
      float var12 = 0.903F;
      float[] var13 = new float[400];
      long[] var14 = new long[400];
      FuzzerUtils.init(var13, -2.175F);
      FuzzerUtils.init(var14, -2830177830L);
      FuzzerUtils.init(var8, -62700);

      int var17;
      for(var17 = 8; 318 > var17 && !var9; ++var17) {
         var2 += (int)this.dFld;

         for(var10 = 1.0; var10 < 5.0; ++var10) {
            this.dFld -= (double)var3;
            this.byFld = 92;
            var13[(int)(var10 + 1.0)] = (float)instanceCount;
         }

         var3 = (int)((float)var3 + ((float)var17 * var12 + (float)this.byFld - var12));

         label42:
         for(var4 = 1; var4 < 5; ++var4) {
            short var15 = -11086;
            var8[var17] *= var4;
            switch ((var3 >>> 1) % 3 + 87) {
               case 87:
                  var6 = 1;

                  while(true) {
                     if (2 <= var6) {
                        continue label42;
                     }

                     var12 -= (float)var4;
                     var2 = (int)((float)var2 + (float)var6 + var12);
                     var8[var6 - 1] -= 235;
                     var6 += 2;
                  }
               case 88:
                  var7 = (int)var12;
               case 89:
                  var15 *= (short)((int)instanceCount);
                  break;
               default:
                  instanceCount >>= this.byFld;
            }
         }
      }

      long var18 = (long)(var17 + var2 + (var9 ? 1 : 0)) + Double.doubleToLongBits(var10) + (long)var3 + (long)Float.floatToIntBits(var12) + (long)var4 + (long)var5 + (long)var6 + (long)var7 + Double.doubleToLongBits(FuzzerUtils.checkSum(var13)) + FuzzerUtils.checkSum(var14) + FuzzerUtils.checkSum(var8);
      iMeth_check_sum += var18;
      return (int)var18;
   }

   public void vMeth() {
      boolean var1 = true;
      int var2 = -11;
      int var3 = 185;
      float var4 = -2.479F;
      float var5 = 0.29F;
      this.byFld = (byte)this.iMeth();

      int var6;
      for(var6 = 8; var6 < 372; ++var6) {
         for(var4 = (float)var6; var4 < 5.0F; ++var4) {
            var2 += (int)var4;
         }

         var3 += var6 - var6;
         instanceCount *= (long)this.dFld;
      }

      var3 += var6;
      var5 *= -3.04787712E8F;
      vMeth_check_sum += (long)(var6 + var2 + Float.floatToIntBits(var4) + var3 + Float.floatToIntBits(var5));
   }

   public double dMeth() {
      int var1 = 36184;
      boolean var2 = true;
      int var3 = -42285;
      int var4 = -3;
      int[][] var5 = new int[400][400];
      long var6 = 447504782L;
      float var8 = 69.681F;
      float[] var9 = new float[400];
      FuzzerUtils.init(var9, 0.746F);
      FuzzerUtils.init((int[][])var5, (int)9082);
      this.vMeth();
      var1 -= var1;
      var1 += (int)instanceCount;

      int var13;
      for(var13 = 16; var13 < 354; ++var13) {
         try {
            int var10000 = var1 / var3;
            var3 = var1 / var1;
            var1 = var13 % var13;
         } catch (ArithmeticException var12) {
         }

         var6 = 1L;

         do {
            var3 ^= sFld;
            var4 = 1;

            while(true) {
               var4 -= 3;
               if (var4 <= 0) {
                  var1 <<= var1;
                  break;
               }

               instanceCount += (long)(-40309 + var4 * var4);
               var3 = var3;
               var8 -= (float)var4;
               var9[(int)var6] = (float)var1;
               var1 <<= -139;
               var5[var4 - 1][(int)(var6 + 1L)] >>= 104;
            }
         } while(++var6 < 5L);
      }

      long var10 = (long)(var1 + var13 + var3) + var6 + (long)var4 + (long)Float.floatToIntBits(var8) + Double.doubleToLongBits(FuzzerUtils.checkSum(var9)) + FuzzerUtils.checkSum(var5);
      dMeth_check_sum += var10;
      return (double)var10;
   }

   public void mainTest(String[] var1) {
      int var2 = -9870;
      int var3 = 4;
      int var4 = -197;
      int var5 = -13;
      int var6 = 88;
      int var7 = -124;
      int var8 = 0;
      int var9 = 7;
      int[][] var10 = new int[400][400];
      double var11 = -53.102563;
      float var13 = 118.361F;
      byte[] var14 = new byte[400];
      FuzzerUtils.init((int[][])var10, (int)-6);
      FuzzerUtils.init((byte[])var14, (byte)52);
      var2 = var2-- - (int)((long)var2 / ((long)((double)(var2--) * ((double)var2 + 1.27269)) | 1L));

      for(var11 = 4.0; var11 < 125.0; ++var11) {
         var3 += (int)(var11 + (double)instanceCount);

         for(var4 = 7; var4 < 207; ++var4) {
            int[] var17 = var10[var4];
            int var18 = (int)(var11 + 1.0);
            int var10002 = var17[(int)(var11 + 1.0)];
            --var2;
            var17[var18] = var10002 * (int)(-5L - (long)var2);
            var2 = (int)this.dMeth();
         }

         switch ((int)(var11 % 8.0 + 16.0)) {
            case 16:
               var2 <<= var5;
               var6 = 4;

               label82:
               for(; var6 < 207; ++var6) {
                  var5 += var6;
                  switch ((var5 >>> 1) % 2 + 99) {
                     case 99:
                        switch ((int)(var11 % 10.0 + 17.0)) {
                           case 17:
                              var5 -= 4500;
                              this.byFld *= (byte)((int)var11);
                              var3 += var7;
                              var8 = 1;

                              while(true) {
                                 if (var8 >= 2) {
                                    continue label82;
                                 }

                                 var13 += (float)var11;

                                 try {
                                    var2 = -85 / var8;
                                    var7 = var6 / var5;
                                    var9 = 140 / var5;
                                 } catch (ArithmeticException var16) {
                                 }

                                 int var10000 = var9 + 69 + var8 * var8;
                                 instanceCount += (long)var4;
                                 var9 = -14;
                                 var10[(var9 >>> 1) % 400] = var10[317];
                                 var13 += (float)((long)var8 ^ (long)var13);
                                 instanceCount -= instanceCount;
                                 var3 = var5;
                                 ++var8;
                              }
                           case 18:
                              var10[var6][var6] -= (int)var13;
                              var7 += var7;
                              var9 = (int)this.dFld;
                              if (this.bFld) {
                              }
                              continue;
                           case 19:
                              var13 -= -27416.0F;
                              continue;
                           case 20:
                              var3 += var6 * var7 + this.byFld - var8;
                           case 21:
                              continue;
                           case 22:
                              var13 += (float)(var6 + this.byFld);
                           case 23:
                              instanceCount += (long)var6 * instanceCount;
                              continue;
                           case 24:
                              if (this.bFld) {
                                 continue;
                              }
                           case 25:
                              this.bFld = this.bFld;
                              continue;
                           case 26:
                              var10[(int)var11][(int)(var11 - 1.0)] <<= var5;
                              continue;
                           default:
                              this.dFld -= (double)var7;
                              continue;
                        }
                     case 100:
                        var3 -= var8;
                        break;
                     default:
                        lArrFld = lArrFld;
                  }
               }
               break;
            case 17:
               var7 *= var6;
            case 18:
               var7 >>= this.byFld;
               break;
            case 19:
               var2 *= -219;
               break;
            case 20:
               var2 = -14;
               break;
            case 21:
               var14[(int)(var11 - 1.0)] *= (byte)var6;
            case 22:
            case 23:
               if (this.bFld) {
               }
         }
      }

      FuzzerUtils.out.println("i d i1 = " + var2 + "," + Double.doubleToLongBits(var11) + "," + var3);
      FuzzerUtils.out.println("i2 i3 i18 = " + var4 + "," + var5 + "," + var6);
      FuzzerUtils.out.println("i19 i20 i21 = " + var7 + "," + var8 + "," + var9);
      FuzzerUtils.out.println("f4 iArr byArr = " + Float.floatToIntBits(var13) + "," + FuzzerUtils.checkSum(var10) + "," + FuzzerUtils.checkSum(var14));
      FuzzerUtils.out.println("Test.instanceCount byFld dFld = " + instanceCount + "," + this.byFld + "," + Double.doubleToLongBits(this.dFld));
      FuzzerUtils.out.println("Test.sFld bFld Test.lArrFld = " + sFld + "," + (this.bFld ? 1 : 0) + "," + FuzzerUtils.checkSum(lArrFld));
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
      FuzzerUtils.out.println("dMeth_check_sum: " + dMeth_check_sum);
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
      FuzzerUtils.init(lArrFld, -3972438219L);
      dMeth_check_sum = 0L;
      vMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
   }
}
