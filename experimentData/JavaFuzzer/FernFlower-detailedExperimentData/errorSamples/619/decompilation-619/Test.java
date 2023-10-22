public class Test {
   public static final int N = 400;
   public static long instanceCount = 163288996L;
   public float fFld = -1.652F;
   public static volatile float fFld1 = 2.253F;
   public static boolean bFld = false;
   public static int iFld = 13;
   public int iFld1 = -29538;
   public static volatile int[] iArrFld = new int[400];
   public static long bMeth_check_sum;
   public static long vMeth_check_sum;
   public static long iMeth_check_sum;

   public static int iMeth() {
      boolean var0 = true;
      int var1 = 10;
      int var2 = -231;
      int var3 = 0;
      int var4 = -6;
      int var5 = 12;
      int[] var6 = new int[400];
      float var7 = 2.717F;
      FuzzerUtils.init((int[])var6, (int)13);

      int var10;
      for(var10 = 2; var10 < 189; ++var10) {
         for(var2 = 1; var2 < 9; ++var2) {
            var7 = 1.0F;

            do {
               var3 &= (int)instanceCount;
               var1 >>= var3;
               instanceCount = (long)((float)instanceCount + -201.0F + var7 * var7);
            } while(++var7 < 2.0F);

            for(var4 = 1; var4 < 2; ++var4) {
               fFld1 += (float)((long)(var4 * var5) + instanceCount - (long)var2);
               var1 = var5;
               fFld1 = (float)var5;
               if (!bFld) {
                  var3 += var4;
                  var6[var4] >>>= var5;
                  instanceCount = (long)var5;
                  var5 += 8231;
               }
            }
         }
      }

      long var8 = (long)(var10 + var1 + var2 + var3 + Float.floatToIntBits(var7) + var4 + var5) + FuzzerUtils.checkSum(var6);
      iMeth_check_sum += var8;
      return (int)var8;
   }

   public static void vMeth(short var0, int var1) {
      var1 <<= var1;
      var1 = (int)((float)iMeth() + fFld1);
      vMeth_check_sum += (long)(var0 + var1);
   }

   public boolean bMeth(int var1, int var2, int var3) {
      boolean var4 = true;
      int var5 = 214;
      int var6 = -37467;
      int var7 = 52110;
      int var8 = 13;
      int[] var9 = new int[400];
      short var10 = -21472;
      double var11 = -37.50236;
      long[] var13 = new long[400];
      FuzzerUtils.init(var13, 4005670795L);
      FuzzerUtils.init((int[])var9, (int)241);
      int var10002 = (var2 >>> 1) % 400;
      long var10004 = var13[(var2 >>> 1) % 400];
      var13[var10002] = var13[(var2 >>> 1) % 400] - 1L;
      var3 *= (int)var10004;
      int var17 = 1;

      while(true) {
         label74:
         while(true) {
            ++var17;
            if (var17 >= 325) {
               long var14 = (long)(var1 + var2 + var3 + var17 + var10 + var5 + var6 + var7 + var8) + Double.doubleToLongBits(var11) + FuzzerUtils.checkSum(var13) + FuzzerUtils.checkSum(var9);
               bMeth_check_sum += var14;
               return var14 % 2L > 0L;
            }

            this.fFld += (float)var17;
            if (bFld) {
               vMeth(var10, var1);
            }

            for(var5 = 1; var5 < 5 && !bFld; ++var5) {
            }

            switch (var17 % 8 * 5 + 78) {
               case 80:
                  iFld <<= var1;
                  break;
               case 84:
                  var3 += var17 * var17;
                  break;
               case 85:
                  instanceCount = instanceCount;
                  break;
               case 96:
                  var7 = 1;

                  while(true) {
                     if (var7 >= 5) {
                        continue label74;
                     }

                     instanceCount += (long)var17;
                     switch (var17 % 5 * 5 + 80) {
                        case 82:
                           var8 += var7;
                           break;
                        case 83:
                           instanceCount += (long)var7;
                           break;
                        case 92:
                           var9[var17] -= var2;
                           instanceCount <<= var5;
                           if (var5 != 0) {
                              return (int)((long)(var1 + var2 + var3 + var17 + var10 + var5 + var6 + var7 + var8) + Double.doubleToLongBits(var11) + FuzzerUtils.checkSum(var13) + FuzzerUtils.checkSum(var9)) % 2 > 0;
                           }

                           var13[var17 - 1] -= (long)var6;
                           break;
                        case 97:
                           instanceCount >>= var6;
                           break;
                        case 103:
                           var13[var17 + 1] += (long)iFld;
                           break;
                        default:
                           iFld += (int)(2L + (long)(var7 * var7));
                     }

                     ++var7;
                  }
               case 98:
                  var8 += var17;
                  break;
               case 100:
                  var6 -= (int)var11;
                  break;
               case 109:
                  try {
                     var1 = -956246768 / var17;
                     var9[var17] = var9[var17 - 1] / 150;
                     iFld = var5 / -185;
                  } catch (ArithmeticException var16) {
                  }
                  break;
               case 118:
                  var2 *= var6;
                  break;
               default:
                  var1 = 2;
            }
         }
      }
   }

   public void mainTest(String[] var1) {
      boolean var2 = true;
      int var3 = 2353;
      int var4 = 9;
      int var5 = -229;
      int var6 = -4;
      int var7 = 14521;
      int var8 = 55344;
      boolean var9 = true;
      int var10 = 24924;
      float var11 = 24.88F;
      float var12 = -1.122F;
      byte var13 = -12;
      byte var14 = 25;
      boolean var15 = false;
      double var16 = 126.6426;

      int var18;
      for(var18 = 9; var18 < 337; iArrFld[var18 + 1] = var18++) {
         for(var4 = 3; 77 > var4; ++var4) {
            var5 = (int)((long)var5 + ((long)var4 * instanceCount + (long)var4 - (long)var5));
            var3 >>= var5 + (var18 << var3) * Math.abs(-22432);

            for(var11 = 1.0F; var11 < 2.0F; ++var11) {
               var12 += -((float)(instanceCount % (long)(var13 | 1)) + -55125.0F + var11);
               var15 = this.bMeth(iFld, iFld, var3);
               this.fFld = (float)instanceCount;
               iArrFld = iArrFld;
               var6 += (int)(var11 * (float)iFld + (float)var6 - (float)instanceCount);
               this.iFld1 += var6;
               this.iFld1 <<= var4;
               var3 *= var13;
               this.iFld1 += (int)(var11 * var11);
               var16 -= (double)var3;
            }
         }

         for(var7 = 2; 77 > var7; ++var7) {
            if (!var15) {
               this.iFld1 ^= var14;
            }
         }

         var8 = 45900;
      }

      instanceCount = (long)var4;

      int var19;
      for(var19 = 6; var19 < 357; ++var19) {
         instanceCount = (long)fFld1;
         var10 = (int)instanceCount;
         var8 *= (int)instanceCount;
         instanceCount = -43125L;
         var13 *= (byte)var4;
         var6 = var14;
         this.iFld1 >>= iFld;
      }

      FuzzerUtils.out.println("i i1 i2 = " + var18 + "," + var8 + "," + var4);
      FuzzerUtils.out.println("i3 f i4 = " + var5 + "," + Float.floatToIntBits(var11) + "," + var6);
      FuzzerUtils.out.println("f1 by b = " + Float.floatToIntBits(var12) + "," + var13 + "," + (var15 ? 1 : 0));
      FuzzerUtils.out.println("d1 i20 i21 = " + Double.doubleToLongBits(var16) + "," + var7 + "," + var8);
      FuzzerUtils.out.println("by1 i22 i23 = " + var14 + "," + var19 + "," + var10);
      FuzzerUtils.out.println("Test.instanceCount fFld Test.fFld1 = " + instanceCount + "," + Float.floatToIntBits(this.fFld) + "," + Float.floatToIntBits(fFld1));
      FuzzerUtils.out.println("Test.bFld Test.iFld iFld1 = " + (bFld ? 1 : 0) + "," + iFld + "," + this.iFld1);
      FuzzerUtils.out.println("Test.iArrFld = " + FuzzerUtils.checkSum(iArrFld));
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
      FuzzerUtils.out.println("bMeth_check_sum: " + bMeth_check_sum);
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
      FuzzerUtils.init((int[])iArrFld, (int)-11732);
      bMeth_check_sum = 0L;
      vMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
   }
}
