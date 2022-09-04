public class Test {
   public static final int N = 400;
   public static long instanceCount = 214L;
   public static volatile float fFld = -2.76F;
   public static volatile double dFld = 0.99098;
   public static volatile short sFld = 32073;
   public static byte byFld = 36;
   public byte[][] byArrFld = new byte[400][400];
   public static volatile int[] iArrFld = new int[400];
   public boolean[] bArrFld = new boolean[400];
   public static long vMeth_check_sum;
   public static long byMeth_check_sum;
   public static long sMeth_check_sum;

   public static void vMeth(int var0) {
      int var1 = -101;
      byte var2 = 13;
      var0 = var0++ - var0;
      instanceCount = (long)(--fFld);
      var0 = (int)((float)(var1++ + var0++) * (1.746F + (float)(var1 + var2)));
      instanceCount -= (long)var0;
      instanceCount = (long)(0.0 - 29236.0 * (-43093.0 + (double)fFld * dFld) * (double)var0);
      vMeth_check_sum += (long)(var0 + var1 + var2);
   }

   public static short sMeth(int var0, long var1, double var3) {
      boolean var5 = true;
      int var6 = 1;
      boolean var7 = true;
      int var8 = -6;
      byte var9 = 80;
      short var10 = -3820;
      boolean var11 = true;
      boolean var12 = true;

      int var15;
      for(var15 = 16; var15 < 358; ++var15) {
         var6 <<= iArrFld[var15];
      }

      int var16;
      for(var16 = 4; var16 < 283; ++var16) {
         vMeth(var15);
         fFld += fFld;
         var0 -= 3;
         var8 -= (int)var1;
         if (var11) {
            var8 = (int)((long)var8 + ((long)(var16 * var16 + var15) - var1));
         } else if (var12) {
            var6 += var16 * var15 + var8 - var8;
         }
      }

      long var13 = (long)var0 + var1 + Double.doubleToLongBits(var3) + (long)var15 + (long)var6 + (long)var16 + (long)var8 + (long)(var11 ? 1 : 0) + (long)(var12 ? 1 : 0) + (long)var9 + (long)var10;
      sMeth_check_sum += var13;
      return (short)((int)var13);
   }

   public static byte byMeth() {
      boolean var0 = true;
      boolean var1 = true;
      int var2 = -18322;
      int var3 = -167;
      int var4 = -197;
      int var5 = -92;
      int var6 = 4;
      int var7 = -164;
      byte var8 = 57;
      long[] var9 = new long[400];
      FuzzerUtils.init(var9, -1784227231L);
      int var12 = sMeth(124, instanceCount, 82.88871);

      int var13;
      for(var13 = 9; var13 < 335; ++var13) {
         var12 += var13 * var12 + var12 - var13;

         for(var3 = 5; var3 > 1; --var3) {
            var2 -= var3;
            var8 *= (byte)var12;
            var9[var3] += instanceCount;
            var5 &= sFld;

            for(var6 = 1; var6 < 2; ++var6) {
               var4 >>= var4;
               var8 = (byte)((int)dFld);
               iArrFld[var3 - 1] = 26;
               int[] var10000 = iArrFld;
               var10000[(var7 >>> 1) % 400] -= var4;
               var7 *= sFld;
               var10000 = iArrFld;
               var10000[var3] -= var2;
            }
         }
      }

      long var10 = (long)(var12 + var13 + var2 + var3 + var4 + var8 + var5 + var6 + var7) + FuzzerUtils.checkSum(var9);
      byMeth_check_sum += var10;
      return (byte)((int)var10);
   }

   public void mainTest(String[] var1) {
      boolean var2 = true;
      byte var3 = 6;
      int var4 = 10;
      int var5 = 174;
      int var6 = 8;
      int var7 = 8;
      int var8 = 61484;
      byte var9 = 117;
      byte var10 = -117;
      int[] var11 = new int[400];
      boolean var12 = false;
      short[] var13 = new short[400];
      long[] var14 = new long[400];
      double[] var15 = new double[400];
      FuzzerUtils.init((int[])var11, (int)89);
      FuzzerUtils.init((short[])var13, (short)24041);
      FuzzerUtils.init(var14, 2593749834351523544L);
      FuzzerUtils.init(var15, -115.126919);
      var11 = var11;

      int var16;
      for(var16 = 4; var16 < 122; ++var16) {
         vMeth(var3);

         for(var4 = 8; var4 < 212; ++var4) {
            switch (var16 % 10 + 79) {
               case 79:
                  byte[] var10000 = this.byArrFld[var16 + 1];
                  var10000[var4] ^= (byte)(var4 * '\ue5a0');
                  var5 *= (int)(instanceCount *= instanceCount-- - -((long)var4 - instanceCount));
                  var13[var16 - 1] = (short)((int)(instanceCount - (long)Math.abs((int)(fFld + (float)instanceCount))));
                  int var10003 = var14[var4]++;
                  --var5;
                  instanceCount = (long)(var10003 >>> var5);
                  break;
               case 80:
                  --var5;
                  vMeth(var5);

                  for(var6 = 1; var6 < 2; ++var6) {
                     instanceCount = (long)(dFld++);
                     fFld *= (float)byMeth();
                     var7 = var3;
                     var15[var6 + 1] = (double)var5;
                     instanceCount -= instanceCount;
                  }

                  switch (var4 % 2 * 5 + 24) {
                     case 29:
                        iArrFld[var16 - 1] = var7;
                        break;
                     case 33:
                        var7 += var16;
                  }

                  var11 = var11;
                  break;
               case 81:
                  var5 *= var16;

                  for(var8 = 2; var8 > 1; --var8) {
                     var14 = var14;
                     instanceCount += (long)var8 + instanceCount;
                     var5 *= (int)dFld;
                     switch (var8 % 1 * 5 + 63) {
                        case 66:
                           switch (var8 % 3 * 5 + 103) {
                              case 105:
                                 var5 >>= var4;
                                 var11[var16 + 1] = var4;
                                 continue;
                              case 110:
                                 var7 = (int)((long)var7 + ((long)var8 ^ (long)fFld));
                                 continue;
                              case 118:
                                 instanceCount *= (long)var4;
                              default:
                                 continue;
                           }
                        default:
                           iArrFld[var8 - 1] = (int)instanceCount;
                     }
                  }
               case 82:
                  fFld = (float)var9;
                  break;
               case 83:
                  this.bArrFld[var16] = var12;
                  break;
               case 84:
                  iArrFld[var4] = var4;
                  break;
               case 85:
                  var11[var4 + 1] = -51;
                  break;
               case 86:
                  var12 = var12;
                  break;
               case 87:
                  instanceCount += (long)(var4 * var8 + var10 - sFld);
                  break;
               case 88:
                  byFld = (byte)var10;
            }
         }
      }

      FuzzerUtils.out.println("i i1 i5 = " + var16 + "," + var3 + "," + var4);
      FuzzerUtils.out.println("i6 i7 i8 = " + var5 + "," + var6 + "," + var7);
      FuzzerUtils.out.println("i24 i25 b2 = " + var8 + "," + var9 + "," + (var12 ? 1 : 0));
      FuzzerUtils.out.println("i26 iArr sArr = " + var10 + "," + FuzzerUtils.checkSum(var11) + "," + FuzzerUtils.checkSum(var13));
      FuzzerUtils.out.println("lArr dArr = " + FuzzerUtils.checkSum(var14) + "," + Double.doubleToLongBits(FuzzerUtils.checkSum(var15)));
      FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.dFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + Double.doubleToLongBits(dFld));
      FuzzerUtils.out.println("Test.sFld Test.byFld byArrFld = " + sFld + "," + byFld + "," + FuzzerUtils.checkSum(this.byArrFld));
      FuzzerUtils.out.println("Test.iArrFld bArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," + FuzzerUtils.checkSum(this.bArrFld));
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
      FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
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
      FuzzerUtils.init((int[])iArrFld, (int)25650);
      vMeth_check_sum = 0L;
      byMeth_check_sum = 0L;
      sMeth_check_sum = 0L;
   }
}
