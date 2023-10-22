public class Test {
   public static final int N = 400;
   public static volatile long instanceCount = -3396066871785041809L;
   public static float fFld = -7.962F;
   public static byte byFld = 72;
   public static boolean bFld = true;
   public double dFld = 71.120897;
   public static int[] iArrFld = new int[400];
   public static long iMeth_check_sum;
   public static long fMeth_check_sum;
   public static long vMeth_check_sum;

   public static void vMeth(int var0, int var1) {
      boolean var2 = true;
      int var3 = -11;
      int var4 = 7;
      int[][] var5 = new int[400][400];
      double var6 = -44.49906;
      FuzzerUtils.init((int[][])var5, (int)164);

      int var8;
      for(var8 = 7; var8 < 134; ++var8) {
         switch ((var3 >>> 1) % 2 + 68) {
            case 68:
               fFld -= fFld;
               switch (var8 % 2 + 38) {
                  case 38:
                     var0 = (int)((float)var0 + ((float)(var8 * var0 + var3) - fFld));
                     var1 += var1;
                  case 39:
                     fFld += (float)var8 * fFld;
                     var6 -= (double)instanceCount;
                     var5[var8 - 1] = var5[var8 + 1];
                     var4 = 1;

                     do {
                        instanceCount *= (long)var6;
                        var1 = (int)var6;
                        fFld -= (float)var6;
                        ++var4;
                     } while(var4 < 12);
                  default:
                     var1 = -14;
                     byFld *= (byte)var1;
               }
            case 69:
               break;
            default:
               var3 += 4 + var8 * var8;
         }
      }

      vMeth_check_sum += (long)(var0 + var1 + var8 + var3) + Double.doubleToLongBits(var6) + (long)var4 + FuzzerUtils.checkSum(var5);
   }

   public static float fMeth(long var0, int var2, boolean var3) {
      boolean var4 = true;
      int var5 = -11;
      int var6 = 18154;
      int var7 = -74;
      int var8 = -29;
      int[] var9 = new int[400];
      double[] var10 = new double[400];
      byte[] var11 = new byte[400];
      FuzzerUtils.init((int[])var9, (int)9);
      FuzzerUtils.init(var10, 0.94644);
      FuzzerUtils.init(var11, (byte)-94);
      vMeth(var2, 97);
      var2 *= var2;
      var2 *= var2;

      int var14;
      for(var14 = 1; var14 < 343; ++var14) {
         switch (var14 % 7 * 5 + 33) {
            case 45:
            case 64:
               var6 = 1;

               do {
                  instanceCount >>>= -13;
                  var9[var14] += var5;
                  var2 += (int)instanceCount;

                  for(var7 = 1; var7 < 1; ++var7) {
                     byFld += (byte)(var7 | var6);
                     var8 >>= var7;
                     var2 = (int)((long)var2 + ((long)var7 * instanceCount + (long)byFld - instanceCount));
                     var2 = var14;
                     instanceCount += (long)var7 * var0 + (long)var7 - (long)var8;
                  }

                  ++var6;
               } while(var6 < 5);
            case 59:
               var5 += var14 * var14;
               break;
            case 46:
               var10[var14] -= (double)var7;
               continue;
            case 47:
            case 48:
            case 49:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 61:
            case 62:
            case 63:
            default:
               var11[var14] = (byte)var6;
               continue;
            case 50:
               var0 = (long)var6;
               continue;
            case 51:
               instanceCount %= -117L;
               continue;
            case 60:
         }

         var8 = 1;
      }

      long var12 = var0 + (long)var2 + (long)(var3 ? 1 : 0) + (long)var14 + (long)var5 + (long)var6 + (long)var7 + (long)var8 + FuzzerUtils.checkSum(var9) + Double.doubleToLongBits(FuzzerUtils.checkSum(var10)) + FuzzerUtils.checkSum(var11);
      fMeth_check_sum += var12;
      return (float)var12;
   }

   public static int iMeth(byte var0, float var1, byte var2) {
      int var3 = 6;
      int var4 = 35842;
      int var5 = -51583;
      int var6 = 38572;
      int var7 = 209;
      int[] var8 = new int[400];
      double var9 = 0.24101;
      boolean var11 = false;
      float var12 = 1.2F;
      long[] var13 = new long[400];
      FuzzerUtils.init((int[])var8, (int)-13088);
      FuzzerUtils.init(var13, 7897112876680856121L);
      var1 = (float)((double)((float)(var8[(var3 >>> 1) % 400] >>= var3) - 118.619F) - (var9 - (double)instanceCount));

      try {
         --var3;
         var3 = (int)((float)var3 * (fMeth(instanceCount, var3, var11) + fFld));
         var3 -= 125;
         var8[62] *= var3;
         var12 = 1.0F;

         do {
            for(var4 = 1; var4 < 6; ++var4) {
               var3 |= var4;
            }

            for(var6 = 1; var6 < 6; ++var6) {
               var8 = var8;
               var0 += (byte)((int)instanceCount);

               try {
                  var7 = var5 % -89;
                  var5 = 1638257376 % var6;
                  var7 = 16335 / var5;
               } catch (ArithmeticException var19) {
               }

               var5 += var6;
            }
         } while(++var12 < 299.0F);

         instanceCount += (long)var12;
      } catch (ArithmeticException var20) {
         var13[178] <<= var3;
      } finally {
         instanceCount |= (long)byFld;
      }

      long var14 = (long)(var0 + Float.floatToIntBits(var1) + var2 + var3) + Double.doubleToLongBits(var9) + (long)(var11 ? 1 : 0) + (long)Float.floatToIntBits(var12) + (long)var4 + (long)var5 + (long)var6 + (long)var7 + FuzzerUtils.checkSum(var8) + FuzzerUtils.checkSum(var13);
      iMeth_check_sum += var14;
      return (int)var14;
   }

   public void mainTest(String[] var1) {
      boolean var2 = true;
      int var3 = 5;
      int var4 = -10161;
      int var5 = 98;
      int var6 = 41455;
      byte var7 = -3;
      int var8 = 12;
      long var9 = -44593L;
      double var11 = 2.10343;
      double var13 = 1.79855;
      float var15 = 44.379F;
      iMeth(byFld, fFld, byFld);

      int var18;
      for(var18 = 3; var18 < 179; ++var18) {
         for(var4 = 2; var4 < 143; var4 += 3) {
            var5 = (int)((float)var5 + ((float)var4 * fFld + (float)var4 - (float)var5));
         }

         var5 >>>= -26;
         var5 *= (int)fFld;
         int[] var10000;
         switch (var18 % 9 * 5 + 108) {
            case 110:
               fFld -= (float)var18;
               break;
            case 116:
            case 126:
               var5 = (int)fFld;
               break;
            case 125:
               var5 += 52994;
            case 134:
               var10000 = iArrFld;
               var10000[var18 + 1] *= var6;
               break;
            case 129:
            case 153:
               var8 += -19744 + var18 * var18;
               break;
            case 142:
               try {
                  var8 = iArrFld[var18 + 1] / var7;
                  var8 = iArrFld[var18 - 1] / 20908;
                  var8 = 587751349 / var6;
               } catch (ArithmeticException var17) {
               }
               break;
            case 149:
               var5 = (int)((float)var5 + ((float)var18 * fFld + (float)var3 - (float)var3));
               var6 += var18 * var18;
               byFld = 42;

               for(var9 = 143L; var9 > 7L; var9 -= 3L) {
                  instanceCount >>>= (int)var9;
                  iArrFld[(int)(var9 + 1L)] = -72;
                  var3 = 11;
                  switch ((var6 >>> 1) % 2 * 5 + 47) {
                     case 50:
                        bFld = bFld;
                        break;
                     case 55:
                        bFld = bFld;
                        var10000 = iArrFld;
                        var10000[(int)var9] -= var3;
                        var6 = -33925;
                        this.dFld /= (double)(var6 | 1);
                  }

                  var11 = 1.0;

                  while(var11 < 4.0) {
                     var6 = var7 & (int)var9;
                     var13 = (double)fFld;
                     switch (var18 % 2 + 119) {
                        case 119:
                           var6 >>= byFld;
                           instanceCount = (long)var5;
                           var3 *= (int)var9;
                           instanceCount -= (long)this.dFld;
                        case 120:
                           fFld += (float)(var11 - (double)var4);
                        default:
                           ++var11;
                     }
                  }
               }
               break;
            default:
               var15 += -6.0F;
         }
      }

      FuzzerUtils.out.println("i16 i17 i18 = " + var18 + "," + var3 + "," + var4);
      FuzzerUtils.out.println("i19 i20 l1 = " + var5 + "," + var6 + "," + var9);
      FuzzerUtils.out.println("i21 d2 i22 = " + var7 + "," + Double.doubleToLongBits(var11) + "," + var8);
      FuzzerUtils.out.println("d3 f2 = " + Double.doubleToLongBits(var13) + "," + Float.floatToIntBits(var15));
      FuzzerUtils.out.println("Test.instanceCount Test.fFld Test.byFld = " + instanceCount + "," + Float.floatToIntBits(fFld) + "," + byFld);
      FuzzerUtils.out.println("Test.bFld dFld Test.iArrFld = " + (bFld ? 1 : 0) + "," + Double.doubleToLongBits(this.dFld) + "," + FuzzerUtils.checkSum(iArrFld));
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
      FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
      FuzzerUtils.init((int[])iArrFld, (int)-13);
      iMeth_check_sum = 0L;
      fMeth_check_sum = 0L;
      vMeth_check_sum = 0L;
   }
}
