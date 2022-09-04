public class Test {
   public static final int N = 400;
   public static long instanceCount = -3L;
   public int iFld = 11619;
   public static float fFld = 0.731F;
   public static long lFld = -3986424624L;
   public static boolean bFld = true;
   public static short sFld = 6863;
   public static volatile float[] fArrFld = new float[400];
   public static long byMeth_check_sum;
   public static long lMeth_check_sum;
   public static long iMeth_check_sum;

   public static int iMeth(long var0, int var2) {
      boolean var3 = true;
      int var4 = 90;
      int var5 = 32;
      int var6 = 3;
      int var7 = -215;
      int var8 = -8100;
      int var9 = 204;
      double var10 = 2.5845;
      var0 -= (long)var2;
      var2 -= var2;
      var2 <<= var2;

      int var14;
      for(var14 = 16; var14 < 394; ++var14) {
         for(var5 = 4; 1 < var5; --var5) {
            var4 %= (int)(instanceCount | 1L);
            var2 *= var6;
         }

         var0 /= instanceCount | 1L;
         var7 = 1;

         do {
            var6 += var14;

            for(var10 = (double)var7; var10 < 1.0; ++var10) {
            }

            ++var7;
         } while(var7 < 4);

         var9 = 4;

         do {
            var8 = (int)((long)var8 + ((long)var9 * var0 + instanceCount - instanceCount));
            instanceCount += var0;
            --var9;
         } while(var9 > 0);
      }

      long var12 = var0 + (long)var2 + (long)var14 + (long)var4 + (long)var5 + (long)var6 + (long)var7 + Double.doubleToLongBits(var10) + (long)var8 + (long)var9;
      iMeth_check_sum += var12;
      return (int)var12;
   }

   public static long lMeth(long var0) {
      int var2 = -70;
      int var3 = 214;
      byte var4 = 7;
      int[] var5 = new int[400];
      long var6 = -2596391739L;
      byte var8 = 64;
      float[] var9 = new float[400];
      FuzzerUtils.init((int[])var5, (int)-239);
      FuzzerUtils.init(var9, -73.152F);
      int[] var10 = var5;
      int var11 = var5.length;

      for(int var12 = 0; var12 < var11; ++var12) {
         int var13 = var10[var12];

         for(var2 = 1; var2 < 4; ++var2) {
            var9[var2] += (float)Math.min(var13--, var2);
            int var10001 = fFld--;
            int var10003 = var2 + 1;
            int var10005 = var5[var2 + 1];
            var5[var10003] = var5[var2 + 1] - 1;
            var3 -= (int)(var10001 * (float)var10005);
            var0 = (long)Math.abs(iMeth(lFld, -143));

            for(var6 = (long)var2; var6 < 2L; ++var6) {
               var3 *= (int)fFld;
               fFld -= -4.0F;
               var13 = var3 + (int)fFld;
               var8 += (byte)((int)(75L + var6 * var6));
               var13 += var3;
               lFld += var6;
               if (!bFld) {
                  sFld -= (short)((int)fFld);
               }
            }
         }
      }

      long var14 = var0 + (long)var2 + (long)var3 + var6 + (long)var4 + (long)var8 + FuzzerUtils.checkSum(var5) + Double.doubleToLongBits(FuzzerUtils.checkSum(var9));
      lMeth_check_sum += var14;
      return var14;
   }

   public static byte byMeth() {
      float var0;
      int var1;
      int var2;
      int var3;
      int[][][] var4;
      int[] var5;
      double[][][] var6;
      boolean[] var7;
      var0 = 1.286F;
      var1 = -46827;
      var2 = -179;
      var3 = 24472;
      var4 = new int[400][400][400];
      var5 = new int[400];
      var6 = new double[400][400][400];
      var7 = new boolean[400];
      FuzzerUtils.init((Object[][])var4, 93);
      FuzzerUtils.init((int[])var5, (int)-3);
      FuzzerUtils.init((Object[][])var6, 53.98265);
      FuzzerUtils.init(var7, true);
      var0 *= (float)Long.reverseBytes((long)(-(var1 - var1)));
      var1 -= (int)(33494L * lMeth(instanceCount));
      var1 += var1;
      label36:
      switch ((var1 >>> 1) % 1 + 75) {
         case 75:
            if (bFld) {
               var2 = 1;

               while(true) {
                  byte var8 = -32;
                  if (!bFld) {
                     var4[var2 - 1][var2 + 1][var2] = -63143;
                     fArrFld[var2 - 1] = (float)var2;

                     try {
                        var1 = var3 / 202;
                        var5[var2 + 1] = var2 / var5[var2 - 1];
                        var3 = var4[var2][(var1 >>> 1) % 400][var2] % 33;
                     } catch (ArithmeticException var10) {
                     }

                     switch (var2 % 3 + 51) {
                        case 51:
                           bFld = bFld;
                           var8 += (byte)var2;
                           lFld += (long)(var2 * var2);
                        case 52:
                           var6[var2][var2][var2 + 1] += (double)var2;
                           break;
                        case 53:
                           var7[var2] = true;
                           break;
                        default:
                           var3 += var2 * var2;
                     }
                  }

                  ++var2;
                  if (var2 >= 140) {
                     break label36;
                  }
               }
            } else {
               var1 = var2;
               break;
            }
         default:
            var3 += var1;
      }

      long var11 = (long)(Float.floatToIntBits(var0) + var1 + var2 + var3) + FuzzerUtils.checkSum((Object[][])var4) + FuzzerUtils.checkSum(var5) + Double.doubleToLongBits((double)FuzzerUtils.checkSum((Object[][])var6)) + FuzzerUtils.checkSum(var7);
      byMeth_check_sum += var11;
      return (byte)((int)var11);
   }

   public void mainTest(String[] var1) {
      boolean var2 = true;
      int var3 = -138;
      int var4 = -12;
      int var5 = 53618;
      int var6 = -23810;
      int var7 = 2;
      int var8 = -12;
      int[][][] var9 = new int[400][400][400];
      float var10 = 93.96F;
      long var11 = -760107937L;
      long[][][] var13 = new long[400][400][400];
      boolean var14 = true;
      boolean[] var15 = new boolean[400];
      FuzzerUtils.init((Object[][])var13, 43729L);
      FuzzerUtils.init((Object[][])var9, 1);
      FuzzerUtils.init(var15, true);
      this.iFld -= (int)instanceCount;
      this.iFld = byMeth();

      int var18;
      for(var18 = 2; 341 > var18; ++var18) {
         var3 += var18;
         var4 = 1;

         do {
            this.iFld = var3;
            ++var4;
         } while(var4 < 74);

         for(var10 = (float)var18; var10 < 74.0F; var10 += 3.0F) {
            var3 += (int)(var10 - fFld);
            this.iFld *= var6;
            this.iFld -= var18;

            try {
               var6 = var18 / 598338107;
               int var10000 = var7 / this.iFld;
               var5 = -232701841 / var7;
            } catch (ArithmeticException var17) {
            }

            for(var11 = 1L; var11 < 1L; ++var11) {
               var13[var18][var18 - 1][var18 + 1] &= (long)this.iFld;
               switch ((var4 >>> 1) % 1 + 48) {
                  case 48:
                     var9[(int)(var10 - 1.0F)][(int)var10][(int)var10] >>= (int)instanceCount;
                     instanceCount -= (long)var4;
                     var8 += (int)(var11 * var11);
               }

               var8 += (int)var11;
               var9[(int)var10][(int)var11][var18 + 1] -= var7;
               if (!bFld) {
                  lFld += var11 - instanceCount;
                  var7 = var6;
                  fFld *= (float)var6;
                  var13[(int)(var10 - 1.0F)][var18 - 1][var18] = (long)var4;
               }
            }

            var15[var18] = var14;
            if (bFld || bFld) {
               break;
            }

            var5 = 64;
         }

         sFld ^= (short)((int)lFld);
         fFld += (float)(var18 * var18);
      }

      FuzzerUtils.out.println("i15 i16 i17 = " + var18 + "," + var3 + "," + var4);
      FuzzerUtils.out.println("f1 i18 i19 = " + Float.floatToIntBits(var10) + "," + var5 + "," + var6);
      FuzzerUtils.out.println("i20 l3 i21 = " + var7 + "," + var11 + "," + var8);
      FuzzerUtils.out.println("b lArr iArr3 = " + (var14 ? 1 : 0) + "," + FuzzerUtils.checkSum((Object[][])var13) + "," + FuzzerUtils.checkSum((Object[][])var9));
      FuzzerUtils.out.println("bArr1 = " + FuzzerUtils.checkSum(var15));
      FuzzerUtils.out.println("Test.instanceCount iFld Test.fFld = " + instanceCount + "," + this.iFld + "," + Float.floatToIntBits(fFld));
      FuzzerUtils.out.println("Test.lFld Test.bFld Test.sFld = " + lFld + "," + (bFld ? 1 : 0) + "," + sFld);
      FuzzerUtils.out.println("Test.fArrFld = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
      FuzzerUtils.out.println("lMeth_check_sum: " + lMeth_check_sum);
      FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
      FuzzerUtils.init(fArrFld, -1.903F);
      byMeth_check_sum = 0L;
      lMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
   }
}
