public class Test {
   public static final int N = 400;
   public static long instanceCount = 1821961752287876664L;
   public static double dFld = 2.3843;
   public int iFld = -3;
   public static float fFld = 78.6F;
   public static boolean bFld = false;
   public volatile byte byFld = 18;
   public short sFld = -15127;
   public static int[] iArrFld = new int[400];
   public static long vMeth_check_sum;
   public static long byMeth_check_sum;
   public static long iMeth_check_sum;

   public static int iMeth(int var0, long var1, double var3) {
      boolean var5 = true;
      short var6 = 1600;
      int var7 = 34837;
      int var8 = -61675;
      float var9 = 72.648F;
      short var10 = 484;
      var0 -= var0;

      int var13;
      for(var13 = 143; var13 > 1; --var13) {
         var7 = 1;

         do {
            for(var9 = 1.0F; var9 < 1.0F; ++var9) {
               boolean var11 = true;
               byte var14 = (byte)var0;
               var11 = true;
               var0 -= var7;
               var3 += (double)var1;
               var8 += (int)(var9 * (float)var8 + (float)var10 - (float)var7);
               var0 += (int)instanceCount;
               var1 += (long)var7;
            }

            var0 >>= var10;
            var8 *= -33;
            var0 += var6;
            var0 = var0;
            ++var7;
         } while(var7 < 11);
      }

      long var15 = (long)var0 + var1 + Double.doubleToLongBits(var3) + (long)var13 + (long)var6 + (long)var7 + (long)Float.floatToIntBits(var9) + (long)var8 + (long)var10;
      iMeth_check_sum += var15;
      return (int)var15;
   }

   public static byte byMeth() {
      boolean var0 = true;
      int var1 = -8;
      int var2 = -2;
      int var3 = 22431;
      int var4 = 64728;
      int var5 = -49849;
      short var6 = 21102;
      int var7 = 84;
      short var8 = -185;
      int var9 = 0;
      int[] var10 = new int[400];
      short var11 = -11995;
      byte var12 = -31;
      float var13 = 0.394F;
      float[] var14 = new float[400];
      long[] var15 = new long[400];
      FuzzerUtils.init(var14, 0.383F);
      FuzzerUtils.init(var15, -3089688151L);
      FuzzerUtils.init((int[])var10, (int)55956);

      int var19;
      label61:
      for(var19 = 342; var19 > 16; --var19) {
         var14[var19] -= (float)(-(var1 - var11)) + 103.596F + (float)iMeth(var1, instanceCount, dFld) - 43490.0F;
         switch (var19 % 10 + 57) {
            case 57:
               var2 = 1;

               while(true) {
                  ++var2;
                  if (var2 >= 5) {
                     for(var3 = 1; var3 < 5; ++var3) {
                        for(var5 = 1; var5 < 2; ++var5) {
                           var4 += var5 * var1;
                           var4 += (int)dFld;
                           var7 = var12;
                        }

                        instanceCount -= (long)var1;
                        var8 = 1;
                        if (var8 < 2) {
                           var4 >>= var5;
                        }

                        if (var2 != 0) {
                        }
                     }
                     continue label61;
                  }

                  var15[var2 + 1] &= (long)var19;
               }
            case 58:
               var15[var19] >>= var3;
               break;
            case 59:
               var15[var19] -= -6L;
               break;
            case 60:
               var1 = -48502;
               break;
            case 61:
               var13 -= (float)var19;
            case 62:
               var14[var19 + 1] += (float)instanceCount;
               break;
            case 63:
               var13 += (float)instanceCount;
               break;
            case 64:
               var9 = var7;
               break;
            case 65:
               var13 = (float)var12;
               break;
            case 66:
               var4 = 14;
               break;
            default:
               try {
                  var4 = var10[var19 - 1] / 788266506;
                  var9 = -134 / var2;
                  var7 = var9 % -21855;
               } catch (ArithmeticException var18) {
               }
         }
      }

      long var16 = (long)(var19 + var1 + var11 + var2 + var3 + var4 + var5 + var6 + var7 + var12 + var8 + var9 + Float.floatToIntBits(var13)) + Double.doubleToLongBits(FuzzerUtils.checkSum(var14)) + FuzzerUtils.checkSum(var15) + FuzzerUtils.checkSum(var10);
      byMeth_check_sum += var16;
      return (byte)((int)var16);
   }

   public void vMeth() {
      float var1 = 0.313F;
      int var2 = 6088;
      int var3 = 62254;
      int[] var4 = new int[400];
      long[] var5 = new long[400];
      FuzzerUtils.init(var5, -50898L);
      FuzzerUtils.init((int[])var4, (int)9);
      byMeth();
      long[] var6 = var5;
      int var7 = var5.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         long var10000 = var6[var8];
         this.iFld = this.iFld;
         var1 -= (float)instanceCount;
         instanceCount = 2L;
         this.iFld = this.iFld;
         int var10001 = (this.iFld >>> 1) % 400;
         var4[var10001] >>>= this.iFld;

         for(var2 = 1; var2 < 4; ++var2) {
            this.iFld += var2 ^ var3;
            instanceCount = instanceCount;
            this.iFld += var2;
            instanceCount = (long)var3;
            this.iFld = this.iFld;
            var1 -= (float)var2;
            var3 += var2;
         }
      }

      vMeth_check_sum += (long)(Float.floatToIntBits(var1) + var2 + var3) + FuzzerUtils.checkSum(var5) + FuzzerUtils.checkSum(var4);
   }

   public void mainTest(String[] var1) {
      int var2 = -63964;
      int var3 = 60528;
      boolean var4 = true;
      int var5 = -3;
      int var6 = -56824;
      byte var7 = -7;
      int var8 = -243;
      long[] var9 = new long[400];
      FuzzerUtils.init(var9, 221L);
      this.vMeth();

      for(var2 = 377; var2 > 9; --var2) {
         instanceCount <<= this.iFld;
      }

      this.iFld -= var3;
      fFld += (float)dFld;
      this.iFld = this.iFld;

      int var10;
      for(var10 = 9; var10 < 190; ++var10) {
         for(var6 = 139; var6 > 3; --var6) {
            iArrFld = FuzzerUtils.int1array(400, -86);
            instanceCount = (long)var2;
            switch (var10 % 1 + 75) {
               case 75:
                  if (!bFld) {
                     this.iFld += var6;
                     instanceCount *= instanceCount;
                     if (bFld) {
                        dFld = (double)fFld;
                        iArrFld[var10] = (int)instanceCount;
                        var5 += var3;
                     } else {
                        boolean var11 = true;
                        var5 = var2;
                        var3 = (int)((float)var3 + ((float)var6 * fFld + (float)this.byFld - (float)this.iFld));
                     }
                  }
                  break;
               default:
                  fFld -= (float)var7;
                  var8 = 2;

                  while(true) {
                     var8 -= 2;
                     if (var8 <= 0) {
                        break;
                     }

                     instanceCount -= -1L;
                     this.sFld += (short)((int)((long)var8 | instanceCount));
                     instanceCount += 125L;
                     var5 = (int)((float)var5 + ((float)(var8 * this.iFld + var2) - fFld));
                     int[] var10000 = iArrFld;
                     var10000[var6 + 1] &= var7;
                     var5 = this.sFld;
                  }
            }
         }
      }

      FuzzerUtils.out.println("i17 i18 i19 = " + var2 + "," + var3 + "," + var10);
      FuzzerUtils.out.println("i20 i21 i22 = " + var5 + "," + var6 + "," + var7);
      FuzzerUtils.out.println("i23 lArr2 = " + var8 + "," + FuzzerUtils.checkSum(var9));
      FuzzerUtils.out.println("Test.instanceCount Test.dFld iFld = " + instanceCount + "," + Double.doubleToLongBits(dFld) + "," + this.iFld);
      FuzzerUtils.out.println("Test.fFld Test.bFld byFld = " + Float.floatToIntBits(fFld) + "," + (bFld ? 1 : 0) + "," + this.byFld);
      FuzzerUtils.out.println("sFld Test.iArrFld = " + this.sFld + "," + FuzzerUtils.checkSum(iArrFld));
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
      FuzzerUtils.out.println("byMeth_check_sum: " + byMeth_check_sum);
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
      FuzzerUtils.init((int[])iArrFld, (int)2);
      vMeth_check_sum = 0L;
      byMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
   }
}
