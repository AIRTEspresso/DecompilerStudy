public class Test {
   public static final int N = 400;
   public static long instanceCount = 184L;
   public static boolean bFld = false;
   public static byte byFld = 97;
   public static double dFld = -118.123343;
   public static int iFld = -39966;
   public static float[] fArrFld = new float[400];
   public volatile short[] sArrFld = new short[400];
   public static double[] dArrFld = new double[400];
   public byte[] byArrFld = new byte[400];
   public static long vSmallMeth_check_sum;
   public static long iMeth_check_sum;
   public static long vMeth_check_sum;

   public static void vMeth(int var0, int var1, short var2) {
      double var3 = 0.19451;
      long var5 = 60782L;
      int var7 = 33135;
      char var8 = 'ꊻ';
      int var9 = -49521;
      short var10 = -27;
      int[] var11 = new int[400];
      float var12 = -2.342F;
      float var13 = -32.13F;
      float var14 = -90.347F;
      byte var15 = -11;
      FuzzerUtils.init((int[])var11, (int)-6);
      var3 += (double)var2;

      for(var5 = 17L; 396L > var5; ++var5) {
         var7 += 981943660;
         var12 += (float)var5;
         var11[(int)(var5 + 1L)] -= var7;
      }

      var0 = (int)var13;

      for(var14 = 15.0F; var14 < 255.0F; ++var14) {
         if (!bFld) {
            var1 = var15;
            var11 = var11;
            var12 += var14 * (float)var8 + (float)var15 - (float)var15;

            for(var9 = 7; (float)var9 > var14; var9 -= 2) {
               var2 = (short)var10;
               var13 += (float)var9;
               var10 = -11361;
            }
         }
      }

      vMeth_check_sum += (long)(var0 + var1 + var2) + Double.doubleToLongBits(var3) + var5 + (long)var7 + (long)Float.floatToIntBits(var12) + (long)Float.floatToIntBits(var13) + (long)Float.floatToIntBits(var14) + (long)var8 + (long)var15 + (long)var9 + (long)var10 + FuzzerUtils.checkSum(var11);
   }

   public static int iMeth(int var0, int var1) {
      float var2 = 39.32F;
      boolean var3 = true;
      byte var4 = -99;
      int var5 = -38992;
      int var6 = -13182;
      boolean var7 = true;
      int var8 = 65037;
      char var9 = 'ꀃ';
      int[] var10 = new int[400];
      long var11 = 1622L;
      FuzzerUtils.init((int[])var10, (int)-21378);
      vMeth(var1, 24286, (short)-19034);
      var0 = (int)var2;
      var10[94] -= byFld;
      var1 *= 652834599;

      int var15;
      for(var15 = 16; var15 < 396; ++var15) {
         var2 -= (float)var4;

         for(var5 = 1; var5 < 4; ++var5) {
            if (bFld) {
            }
         }
      }

      int var16;
      for(var16 = 3; var16 < 183; ++var16) {
         var8 += (int)dFld;
         instanceCount += (long)var16 - instanceCount;

         for(var11 = 1L; var11 < 9L; ++var11) {
            var0 += (int)(var11 ^ instanceCount);
            var0 += (int)((float)var11 * var2);
            var6 = var9;
         }
      }

      long var13 = (long)(var0 + var1 + Float.floatToIntBits(var2) + var15 + var4 + var5 + var6 + var16 + var8) + var11 + (long)var9 + FuzzerUtils.checkSum(var10);
      iMeth_check_sum += var13;
      return (int)var13;
   }

   public static void vSmallMeth(int var0, double var1) {
      int[] var3 = new int[400];
      FuzzerUtils.init((int[])var3, (int)28529);
      var3[(var0 >>> 1) % 400] *= (int)(-113.332F + (float)(var0 * iMeth(var0, var0)));
      var0 += var0;
      vSmallMeth_check_sum += (long)var0 + Double.doubleToLongBits(var1) + FuzzerUtils.checkSum(var3);
   }

   public void mainTest(String[] var1) {
      int var2 = 2;
      boolean var3 = true;
      int var4 = -56147;
      boolean var5 = true;
      boolean var6 = true;
      int var7 = 145;
      int var8 = -55;
      int[] var9 = new int[400];
      float var10 = -84.794F;
      FuzzerUtils.init((int[])var9, (int)99);
      instanceCount = (long)var2;

      int var13;
      for(var13 = 19; var13 < 378; ++var13) {
         var4 += var13;

         for(int var11 = 0; var11 < 62; ++var11) {
            vSmallMeth(var2, dFld);
         }

         var10 += (float)((long)(var13 * var2) + instanceCount - (long)var4);
         var4 -= var4;
         var9[var13 + 1] = var2;
         dFld -= (double)var2;
         var4 = (int)((long)var4 + ((long)var13 ^ (long)var10));
         var4 += var4;
         var4 += (int)instanceCount;
      }

      instanceCount = instanceCount;
      int var14 = 1;

      int var15;
      do {
         iFld += var2;
         var9[var14] <<= iFld;
         var10 /= (float)(instanceCount | 1L);
         instanceCount ^= (long)var14;
         this.sArrFld[var14] = (short)var4;

         for(var15 = var14; var15 < 68; ++var15) {
            var8 = 1;

            do {
               var4 += 89;
               label42:
               switch (var14 % 9 * 5 + 63) {
                  case 65:
                     byFld = 1;
                  case 74:
                     switch (var8 % 2 + 4) {
                        case 4:
                        case 5:
                        default:
                           dArrFld[var15 + 1] = (double)iFld;
                           byFld -= (byte)((int)var10);
                           break label42;
                     }
                  case 70:
                     try {
                        var9[var14] = var7 / 28732;
                        iFld = var2 / var14;
                        var4 = var8 % 1635724932;
                     } catch (ArithmeticException var12) {
                     }
                     break;
                  case 71:
                     instanceCount += (long)var8;
                     var9[var8 + 1] += (int)instanceCount;
                     var10 += (float)(-28802 + var8 * var8);
                     this.byArrFld[var15 + 1] = (byte)((int)instanceCount);
                     break;
                  case 89:
                     var10 *= -98.124825F;
                     break;
                  case 90:
                     iFld *= (int)dFld;
                     break;
                  case 98:
                     instanceCount += (long)iFld;
                  case 75:
                     var7 += var8;
                     break;
                  case 108:
                     var2 -= var15;
                     break;
                  default:
                     byFld += (byte)var8;
               }

               ++var8;
            } while(var8 < 1);
         }

         ++var14;
      } while(var14 < 373);

      FuzzerUtils.out.println("i i1 i2 = " + var2 + "," + var13 + "," + var4);
      FuzzerUtils.out.println("f5 i21 i22 = " + Float.floatToIntBits(var10) + "," + var14 + "," + var15);
      FuzzerUtils.out.println("i23 i24 iArr3 = " + var7 + "," + var8 + "," + FuzzerUtils.checkSum(var9));
      FuzzerUtils.out.println("Test.instanceCount Test.bFld Test.byFld = " + instanceCount + "," + (bFld ? 1 : 0) + "," + byFld);
      FuzzerUtils.out.println("Test.dFld Test.iFld Test.fArrFld = " + Double.doubleToLongBits(dFld) + "," + iFld + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)));
      FuzzerUtils.out.println("sArrFld Test.dArrFld byArrFld = " + FuzzerUtils.checkSum(this.sArrFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)) + "," + FuzzerUtils.checkSum(this.byArrFld));
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
      FuzzerUtils.out.println("vSmallMeth_check_sum: " + vSmallMeth_check_sum);
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
      FuzzerUtils.init(fArrFld, 1.598F);
      FuzzerUtils.init(dArrFld, 0.99626);
      vSmallMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
      vMeth_check_sum = 0L;
   }
}
