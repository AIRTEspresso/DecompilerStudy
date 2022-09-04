public class Test {
   public static final int N = 400;
   public static volatile long instanceCount = -8L;
   public static short sFld = 20299;
   public static volatile float fFld = 42.963F;
   public static double dFld = 0.87786;
   public static float[] fArrFld = new float[400];
   public static int[] iArrFld = new int[400];
   public static int[] iArrFld1 = new int[400];
   public static long[] lArrFld = new long[400];
   public static long vMeth_check_sum;
   public static long vMeth1_check_sum;
   public static long iMeth_check_sum;

   public static int iMeth(long var0) {
      int var2 = 64573;
      boolean var3 = true;
      int var4 = -8;
      int var5 = 196;
      byte var6 = 103;
      float var7 = -73.448F;
      boolean var8 = true;
      double var9 = 0.36287;
      var2 >>= var2;

      int var13;
      for(var13 = 7; var13 < 126; ++var13) {
         var2 += var2;

         for(var5 = 13; var5 > 1; --var5) {
            float[] var10000 = fArrFld;
            var10000[var13 + 1] -= (float)sFld;
            var2 *= (int)var7;
            var7 = (float)var5;
            var2 += var5 | var6;
            var9 += (double)instanceCount;
            var8 = var8;
            if (!var8) {
               var4 = (int)((long)var4 + (long)var5 + instanceCount);
            }
         }

         fFld /= (float)(var13 | 1);
      }

      long var11 = var0 + (long)var2 + (long)var13 + (long)var4 + (long)var5 + (long)var6 + (long)Float.floatToIntBits(var7) + (long)(var8 ? 1 : 0) + Double.doubleToLongBits(var9);
      iMeth_check_sum += var11;
      return (int)var11;
   }

   public static void vMeth1() {
      int var0 = -157;
      boolean var1 = true;
      int var2 = 25151;
      int var3 = -47664;
      byte var4 = -92;
      int var5 = 52921;
      byte var6 = 3;
      int[] var7 = new int[400];
      double var8 = 1.102163;
      long[] var10 = new long[400];
      FuzzerUtils.init(var10, 60L);
      FuzzerUtils.init((int[])var7, (int)10);
      var10[(var0 >>> 1) % 400] = (long)(var0 - var0);

      int var15;
      for(var15 = 6; var15 < 233; ++var15) {
         sFld += (short)((int)((double)iMeth(instanceCount) * -99.7755));
         var8 -= (double)var15;
         var0 = -31029;
         fFld += (float)(var15 + var0);
         fFld = (float)var0;
      }

      int[] var11 = var7;
      int var12 = var7.length;

      for(int var13 = 0; var13 < var12; ++var13) {
         int var14 = var11[var13];

         for(var3 = 1; var3 < 4; ++var3) {
            fFld = fFld;
         }

         instanceCount += (long)var2;

         for(var5 = 1; var5 < 4; ++var5) {
            var0 = (int)((long)var0 + ((long)var5 - instanceCount));
         }

         var2 += var14;
      }

      vMeth1_check_sum += (long)(var0 + var15 + var2) + Double.doubleToLongBits(var8) + (long)var3 + (long)var4 + (long)var5 + (long)var6 + FuzzerUtils.checkSum(var10) + FuzzerUtils.checkSum(var7);
   }

   public void vMeth(int var1, int var2, int var3) {
      boolean var4 = true;
      int var5 = -13;
      char var6 = '讷';
      int var7 = -14;
      int var8 = -60287;
      int var9 = 203;
      byte var10 = 0;
      int[] var11 = new int[400];
      short var12 = 17553;
      long var13 = 26153L;
      FuzzerUtils.init((int[])var11, (int)209);
      int var15 = 238;

      while(true) {
         var15 -= 3;
         if (var15 <= 0) {
            vMeth1();

            for(var13 = 9L; var13 < 178L; var13 += 3L) {
               for(var7 = (int)var13; var7 < 27; ++var7) {
                  var11[var7] += (int)instanceCount;
                  var8 += var6;
                  var3 ^= var12;
               }

               switch ((var15 >>> 1) % 1 + 67) {
                  case 67:
                  default:
                     dFld = (double)var1;
                     var9 = 1;
               }

               while(var9 < 27) {
                  instanceCount *= (long)var15;
                  var1 += var9 ^ var6;
                  ++var9;
               }
            }

            vMeth_check_sum += (long)(var1 + var2 + var3 + var15 + var5 + var12) + var13 + (long)var6 + (long)var7 + (long)var8 + (long)var9 + (long)var10 + FuzzerUtils.checkSum(var11);
            return;
         }

         var2 += var15 * var3;
         var5 += var15 * var1 + var5 - var12;
         var5 >>>= -6956 * var3;
      }
   }

   public void mainTest(String[] var1) {
      int var2 = 14;
      boolean var3 = true;
      int var4 = 20808;
      int var5 = -182;
      int var6 = -248;
      int var7 = 56853;
      int var8 = -19775;
      int var9 = -63336;
      int var10 = -14;
      int var11 = 107;
      int var12 = 4691;
      int var13 = 244;
      boolean var14 = false;
      this.vMeth(var2, var2, var2);
      var2 -= (int)instanceCount;

      int var17;
      for(var17 = 14; var17 < 235; ++var17) {
         var2 = var4;
         var4 += var4;

         for(var5 = 114; var5 > 7; --var5) {
            var6 *= var2;

            for(var7 = 2; var7 > 1 && !var14; --var7) {
            }

            var2 -= (int)fFld;

            try {
               var6 = iArrFld[var5 + 1] / iArrFld1[var17 - 1];
               iArrFld1[var5] /= 2135;
               var6 = var4 / 1430829216;
            } catch (ArithmeticException var16) {
            }

            instanceCount = (long)var2;
            var9 = 1;

            do {
               int var10002 = lArrFld[var17]--;
               var6 = var6;
               var8 += var8;
               if (var14) {
               }

               ++var9;
            } while(var9 < 2);

            var2 += var5;
         }

         for(var10 = 4; var10 < 114; ++var10) {
            instanceCount ^= (long)var17;
            switch (var17 % 4 + 19) {
               case 19:
                  var6 >>= 9157;
                  if (var14) {
                  }
                  continue;
               case 20:
               case 21:
                  var11 -= var5;
                  int[] var10000 = iArrFld;
                  var10000[var10] %= sFld | 1;
                  continue;
               case 22:
                  var8 = (int)instanceCount;
                  instanceCount = (long)var9;
                  continue;
               default:
                  var12 = 1;
            }

            while(var12 < 2) {
               var13 *= var6;
               ++var12;
            }

            instanceCount += (long)var10;
         }
      }

      FuzzerUtils.out.println("i23 i24 i25 = " + var2 + "," + var17 + "," + var4);
      FuzzerUtils.out.println("i26 i27 i28 = " + var5 + "," + var6 + "," + var7);
      FuzzerUtils.out.println("i29 b1 i30 = " + var8 + "," + (var14 ? 1 : 0) + "," + var9);
      FuzzerUtils.out.println("i31 i32 i33 = " + var10 + "," + var11 + "," + var12);
      FuzzerUtils.out.println("i34 = " + var13);
      FuzzerUtils.out.println("Test.instanceCount Test.sFld Test.fFld = " + instanceCount + "," + sFld + "," + Float.floatToIntBits(fFld));
      FuzzerUtils.out.println("Test.dFld Test.fArrFld Test.iArrFld = " + Double.doubleToLongBits(dFld) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," + FuzzerUtils.checkSum(iArrFld));
      FuzzerUtils.out.println("Test.iArrFld1 Test.lArrFld = " + FuzzerUtils.checkSum(iArrFld1) + "," + FuzzerUtils.checkSum(lArrFld));
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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

   static {
      FuzzerUtils.init(fArrFld, -60.656F);
      FuzzerUtils.init((int[])iArrFld, (int)-6);
      FuzzerUtils.init((int[])iArrFld1, (int)-10);
      FuzzerUtils.init(lArrFld, -13L);
      vMeth_check_sum = 0L;
      vMeth1_check_sum = 0L;
      iMeth_check_sum = 0L;
   }
}
