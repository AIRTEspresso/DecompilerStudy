public class Test {
   public static final int N = 400;
   public static long instanceCount = -1153958146L;
   public static volatile byte byFld = -92;
   public static short sFld = -8562;
   public static float[] fArrFld = new float[400];
   public static long vMeth_check_sum;
   public static long iMeth_check_sum;
   public static long vMeth1_check_sum;

   public static void vMeth1(long var0, int var2, int var3) {
      boolean var4 = true;
      byte var5 = -91;
      int var6 = -45;
      int var7 = -250;
      int var8 = -79;
      short var9 = -333;
      int[] var10 = new int[400];
      long var11 = -4482507297457906235L;
      boolean var13 = false;
      FuzzerUtils.init((int[])var10, (int)9475);

      int var14;
      for(var14 = 16; 379 > var14; ++var14) {
         var0 += (long)var5;
         if (!var13) {
            var3 += var14 * var14;
         } else {
            instanceCount = 44L;

            for(var6 = var14; var6 < 5; ++var6) {
               var0 += (long)(-5 + var6 * var6);
               var7 += (int)var0;
               var8 = 1;

               while(var8 < 1) {
                  var0 = (long)var7;
                  if (var3 != 0) {
                     vMeth1_check_sum += var0 + (long)var2 + (long)var3 + (long)var14 + (long)var5 + (long)var6 + (long)var7 + (long)var8 + (long)var9 + var11 + (long)(var13 ? 1 : 0) + FuzzerUtils.checkSum(var10);
                     return;
                  }

                  byFld = (byte)(byFld - 90);
                  switch (var6 % 1 + 97) {
                     case 97:
                        var10[var8] += var8;
                        var11 = (long)var8;
                        var11 += (long)(var8 * var6 + var2 - var5);
                     default:
                        var8 += 3;
                  }
               }
            }
         }
      }

      vMeth1_check_sum += var0 + (long)var2 + (long)var3 + (long)var14 + (long)var5 + (long)var6 + (long)var7 + (long)var8 + (long)var9 + var11 + (long)(var13 ? 1 : 0) + FuzzerUtils.checkSum(var10);
   }

   public static int iMeth(short var0, double var1) {
      int var3 = 45188;
      int var4 = 17232;
      int var5 = -202;
      int var6 = 125;
      int var7 = 61432;
      byte var8 = -76;
      int var9 = -27030;
      int var10 = -5585;
      int[] var11 = new int[400];
      float[] var12 = new float[400];
      long[] var13 = new long[400];
      FuzzerUtils.init(var12, 0.835F);
      FuzzerUtils.init(var13, 249L);
      FuzzerUtils.init((int[])var11, (int)-2150);
      vMeth1(-8821L, var3, var3);
      byte var22 = 2;

      try {
         var12[42] += (float)var3;

         label116:
         for(var4 = 2; var4 < 192; ++var4) {
            var6 = 1;

            while(true) {
               label111:
               while(true) {
                  ++var6;
                  if (var6 >= 8) {
                     continue label116;
                  }

                  switch (var6 % 8 * 5 + 64) {
                     case 67:
                        if (var4 != 0) {
                        }
                     case 82:
                        var9 = -37674;
                        break;
                     case 76:
                        var3 -= var10;
                        break;
                     case 85:
                        try {
                           var9 = 119 / var7;
                           var10 = -237 % var6;
                           var10 = -79 % var9;
                        } catch (ArithmeticException var19) {
                        }
                        break;
                     case 95:
                        instanceCount = (long)var3;
                        var1 = (double)var22;
                        instanceCount -= (long)var5;
                        var1 += (double)var3;
                     case 97:
                     case 103:
                        var7 = 1;

                        while(true) {
                           if (1 <= var7) {
                              continue label111;
                           }

                           var5 += var7 ^ var3;
                           var13[var6 + 1] -= instanceCount;
                           instanceCount -= instanceCount;
                           ++var7;
                        }
                     case 104:
                        var10 += var3;
                  }
               }
            }
         }
      } catch (NegativeArraySizeException var20) {
         byFld *= (byte)var5;
      } finally {
         var11[(var8 >>> 1) % 400] = 0;
      }

      long var14 = (long)var22 + Double.doubleToLongBits(var1) + (long)var3 + (long)var4 + (long)var5 + (long)var6 + (long)var7 + (long)var8 + (long)var9 + (long)var10 + Double.doubleToLongBits(FuzzerUtils.checkSum(var12)) + FuzzerUtils.checkSum(var13) + FuzzerUtils.checkSum(var11);
      iMeth_check_sum += var14;
      return (int)var14;
   }

   public static void vMeth(float var0) {
      short var1 = -2193;
      double var2 = -84.20295;
      int var4 = 13;
      boolean var5 = true;
      int var6 = 12;
      long var7 = -10L;
      long[] var9 = new long[400];
      boolean var10 = true;
      FuzzerUtils.init(var9, 5L);
      iMeth(var1, var2);
      instanceCount <<= var4;

      int var11;
      for(var11 = 5; var11 < 216; ++var11) {
         var4 = var1;
         var7 = 1L;

         while(++var7 < 8L && !var10) {
            switch (var11 % 2 * 5 + 60) {
               case 61:
                  float[] var10000 = fArrFld;
                  var10000[(int)(var7 - 1L)] += (float)var6;
                  var6 += (int)var7;
                  break;
               case 67:
                  switch ((var11 >>> 1) % 2 * 5 + 86) {
                     case 92:
                     case 93:
                        var6 *= (int)var0;
                        var9[(int)(var7 - 1L)] = -12L;
                        var4 += (int)var7;
                  }
            }
         }

         var2 += 206.0;
      }

      vMeth_check_sum += (long)(Float.floatToIntBits(var0) + var1) + Double.doubleToLongBits(var2) + (long)var4 + (long)var11 + (long)var6 + var7 + (long)(var10 ? 1 : 0) + FuzzerUtils.checkSum(var9);
   }

   public void mainTest(String[] var1) {
      boolean var2 = true;
      int var3 = 10;
      int var4 = -32818;
      int var5 = -14;
      boolean var6 = true;
      int var7 = 12;
      char var8 = '칒';
      int var9 = 11;
      int[] var10 = new int[400];
      int[] var11 = new int[400];
      long var12 = -3L;
      long var14 = -13L;
      long[] var16 = new long[400];
      float var17 = 3.42F;
      boolean var18 = true;
      double var19 = 0.117018;
      byte[] var21 = new byte[400];
      FuzzerUtils.init((int[])var10, (int)-11);
      FuzzerUtils.init((int[])var11, (int)6);
      FuzzerUtils.init(var16, 4L);
      FuzzerUtils.init(var21, (byte)-1);
      int var22 = 1;

      while(true) {
         ++var22;
         if (var22 >= 205) {
            byte var23 = byFld;
            var3 = var23 * var5;
            int var24 = 1;

            do {
               var3 += var24;
               var11[var24] *= (int)var19;
               switch (var24 % 2 + 116) {
                  case 116:
                     var5 = (int)var12;

                     for(var7 = var24; 115 > var7; ++var7) {
                        var3 |= var7;

                        for(var14 = 1L; var14 < 1L; var14 += 2L) {
                           var19 -= (double)var5;
                           var12 *= 5L;
                           var11[(int)(var14 + 1L)] = 1;
                           if (var18) {
                              var21 = var21;
                              switch ((var4 >>> 1) % 2 + 4) {
                                 case 4:
                                    var16[(int)(var14 + 1L)] += (long)var24;
                                    var9 += 21115;
                                    var16[(int)var14] <<= sFld;
                                 case 5:
                              }
                           } else if (var18) {
                           }
                        }
                     }
                  case 117:
               }

               ++var24;
            } while(var24 < 219);

            FuzzerUtils.out.println("i i1 l = " + var22 + "," + var3 + "," + var12);
            FuzzerUtils.out.println("f1 i21 i22 = " + Float.floatToIntBits(var17) + "," + var4 + "," + var5);
            FuzzerUtils.out.println("b2 i23 d2 = " + (var18 ? 1 : 0) + "," + var24 + "," + Double.doubleToLongBits(var19));
            FuzzerUtils.out.println("i24 i25 l4 = " + var7 + "," + var8 + "," + var14);
            FuzzerUtils.out.println("i26 iArr iArr1 = " + var9 + "," + FuzzerUtils.checkSum(var10) + "," + FuzzerUtils.checkSum(var11));
            FuzzerUtils.out.println("lArr2 byArr = " + FuzzerUtils.checkSum(var16) + "," + FuzzerUtils.checkSum(var21));
            FuzzerUtils.out.println("Test.instanceCount Test.byFld Test.sFld = " + instanceCount + "," + byFld + "," + sFld);
            FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
            FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
            FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
            FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
            return;
         }

         int var10002 = var22 - 1;
         int var10004 = var10[var22 - 1];
         var10[var10002] = var10[var22 - 1] - 1;
         var3 -= Math.min(var10004, var3);
         instanceCount += (long)(5069 + var22 * var22);
         var12 >>= var3;
         var3 = var22 - var11[var22 + 1];
         vMeth(var17);

         for(var4 = 7; var4 < 122; ++var4) {
            var16[var4 - 1] >>= var22;
            var5 += var4;
            if (var18) {
            }
         }

         var5 += sFld;
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
      FuzzerUtils.init(fArrFld, -2.522F);
      vMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
      vMeth1_check_sum = 0L;
   }
}
