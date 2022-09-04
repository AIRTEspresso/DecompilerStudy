import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

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
   public static PrintStream out;
   public static Random random;
   public static long seed;
   public static int UnknownZero;
   public static AtomicLong runningThreads;

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
      init(var13, -2.175F);
      init(var14, -2830177830L);
      init(var8, -62700);

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

      long var18 = (long)(var17 + var2 + (var9 ? 1 : 0)) + Double.doubleToLongBits(var10) + (long)var3 + (long)Float.floatToIntBits(var12) + (long)var4 + (long)var5 + (long)var6 + (long)var7 + Double.doubleToLongBits(checkSum(var13)) + checkSum(var14) + checkSum(var8);
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
      init(var9, 0.746F);
      init((int[][])var5, (int)9082);
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

      long var10 = (long)(var1 + var13 + var3) + var6 + (long)var4 + (long)Float.floatToIntBits(var8) + Double.doubleToLongBits(checkSum(var9)) + checkSum(var5);
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
      init((int[][])var10, (int)-6);
      init((byte[])var14, (byte)52);
      var2 = var2-- - (int)((long)var2 / ((long)((double)(var2--) * ((double)var2 + 1.27269)) | 1L));

      int var19;
      for(var11 = 4.0; var11 < 125.0; ++var11) {
         var3 += (int)(var11 + (double)instanceCount);

         for(var4 = 7; var4 < 207; ++var4) {
            int[] var17 = var10[var4];
            var19 = (int)(var11 + 1.0);
            int var10002 = var17[(int)(var11 + 1.0)];
            --var2;
            var17[var19] = var10002 * (int)(-5L - (long)var2);
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

      System.out.println("i d i1 = " + var2 + "," + Double.doubleToLongBits(var11) + "," + var3);
      System.out.println("i2 i3 i18 = " + var4 + "," + var5 + "," + var6);
      System.out.println("i19 i20 i21 = " + var7 + "," + var8 + "," + var9);
      PrintStream var18 = System.out;
      var19 = Float.floatToIntBits(var13);
      var18.println("f4 iArr byArr = " + var19 + "," + checkSum(var10) + "," + checkSum(var14));
      long var10001 = instanceCount;
      System.out.println("Test.instanceCount byFld dFld = " + var10001 + "," + this.byFld + "," + Double.doubleToLongBits(this.dFld));
      short var20 = sFld;
      System.out.println("Test.sFld bFld Test.lArrFld = " + var20 + "," + (this.bFld ? 1 : 0) + "," + checkSum(lArrFld));
      System.out.println("iMeth_check_sum: " + iMeth_check_sum);
      System.out.println("vMeth_check_sum: " + vMeth_check_sum);
      System.out.println("dMeth_check_sum: " + dMeth_check_sum);
   }

   public static void main(String[] var0) {
      try {
         Test var1 = new Test();
         var1.mainTest(var0);
      } catch (Exception var2) {
         System.out.println(var2.getClass().getCanonicalName());
      }

   }

   public static int nextInt() {
      return random.nextInt();
   }

   public static long nextLong() {
      return random.nextLong();
   }

   public static float nextFloat() {
      return random.nextFloat();
   }

   public static double nextDouble() {
      return random.nextDouble();
   }

   public static boolean nextBoolean() {
      return random.nextBoolean();
   }

   public static byte nextByte() {
      return (byte)random.nextInt();
   }

   public static short nextShort() {
      return (short)random.nextInt();
   }

   public static char nextChar() {
      return (char)random.nextInt();
   }

   public static void init(boolean[] var0, boolean var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = var2 % 2 == 0 ? var1 : var2 % 3 == 0;
      }

   }

   public static void init(boolean[][] var0, boolean var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         init(var0[var2], var1);
      }

   }

   public static void init(long[] var0, long var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         var0[var3] = var3 % 2 == 0 ? var1 + (long)var3 : var1 - (long)var3;
      }

   }

   public static void init(long[][] var0, long var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         init(var0[var3], var1);
      }

   }

   public static void init(int[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = var2 % 2 == 0 ? var1 + var2 : var1 - var2;
      }

   }

   public static void init(int[][] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         init(var0[var2], var1);
      }

   }

   public static void init(short[] var0, short var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = (short)(var2 % 2 == 0 ? var1 + var2 : var1 - var2);
      }

   }

   public static void init(short[][] var0, short var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         init(var0[var2], var1);
      }

   }

   public static void init(char[] var0, char var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = (char)(var2 % 2 == 0 ? var1 + var2 : var1 - var2);
      }

   }

   public static void init(char[][] var0, char var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         init(var0[var2], var1);
      }

   }

   public static void init(byte[] var0, byte var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = (byte)(var2 % 2 == 0 ? var1 + var2 : var1 - var2);
      }

   }

   public static void init(byte[][] var0, byte var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         init(var0[var2], var1);
      }

   }

   public static void init(double[] var0, double var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         var0[var3] = var3 % 2 == 0 ? var1 + (double)var3 : var1 - (double)var3;
      }

   }

   public static void init(double[][] var0, double var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         init(var0[var3], var1);
      }

   }

   public static void init(float[] var0, float var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2] = var2 % 2 == 0 ? var1 + (float)var2 : var1 - (float)var2;
      }

   }

   public static void init(float[][] var0, float var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         init(var0[var2], var1);
      }

   }

   public static void init(Object[][] var0, Object var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         init(var0[var2], var1);
      }

   }

   public static void init(Object[] var0, Object var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         try {
            var0[var2] = var1.getClass().newInstance();
         } catch (Exception var4) {
            var0[var2] = var1;
         }
      }

   }

   public static long checkSum(boolean[] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += (long)(var0[var3] ? var3 + 1 : 0);
      }

      return var1;
   }

   public static long checkSum(boolean[][] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static long checkSum(long[] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += var0[var3] / (long)(var3 + 1) + var0[var3] % (long)(var3 + 1);
      }

      return var1;
   }

   public static long checkSum(long[][] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static long checkSum(int[] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += (long)(var0[var3] / (var3 + 1) + var0[var3] % (var3 + 1));
      }

      return var1;
   }

   public static long checkSum(int[][] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static long checkSum(short[] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += (long)((short)(var0[var3] / (var3 + 1) + var0[var3] % (var3 + 1)));
      }

      return var1;
   }

   public static long checkSum(short[][] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static long checkSum(char[] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += (long)((char)(var0[var3] / (var3 + 1) + var0[var3] % (var3 + 1)));
      }

      return var1;
   }

   public static long checkSum(char[][] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static long checkSum(byte[] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += (long)((byte)(var0[var3] / (var3 + 1) + var0[var3] % (var3 + 1)));
      }

      return var1;
   }

   public static long checkSum(byte[][] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static double checkSum(double[] var0) {
      double var1 = 0.0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += var0[var3] / (double)(var3 + 1) + var0[var3] % (double)(var3 + 1);
      }

      return var1;
   }

   public static double checkSum(double[][] var0) {
      double var1 = 0.0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static double checkSum(float[] var0) {
      double var1 = 0.0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += (double)(var0[var3] / (float)(var3 + 1) + var0[var3] % (float)(var3 + 1));
      }

      return var1;
   }

   public static double checkSum(float[][] var0) {
      double var1 = 0.0;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static long checkSum(Object[][] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 += checkSum(var0[var3]);
      }

      return var1;
   }

   public static long checkSum(Object[] var0) {
      long var1 = 0L;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         var1 = (long)((double)var1 + (double)checkSum(var0[var3]) * Math.pow(2.0, (double)var3));
      }

      return var1;
   }

   public static long checkSum(Object var0) {
      return var0 == null ? 0L : (long)var0.getClass().getCanonicalName().length();
   }

   public static byte[] byte1array(int var0, byte var1) {
      byte[] var2 = new byte[var0];
      init(var2, var1);
      return var2;
   }

   public static byte[][] byte2array(int var0, byte var1) {
      byte[][] var2 = new byte[var0][var0];
      init(var2, var1);
      return var2;
   }

   public static short[] short1array(int var0, short var1) {
      short[] var2 = new short[var0];
      init(var2, var1);
      return var2;
   }

   public static short[][] short2array(int var0, short var1) {
      short[][] var2 = new short[var0][var0];
      init(var2, var1);
      return var2;
   }

   public static int[] int1array(int var0, int var1) {
      int[] var2 = new int[var0];
      init(var2, var1);
      return var2;
   }

   public static int[][] int2array(int var0, int var1) {
      int[][] var2 = new int[var0][var0];
      init(var2, var1);
      return var2;
   }

   public static long[] long1array(int var0, long var1) {
      long[] var3 = new long[var0];
      init(var3, var1);
      return var3;
   }

   public static long[][] long2array(int var0, long var1) {
      long[][] var3 = new long[var0][var0];
      init(var3, var1);
      return var3;
   }

   public static float[] float1array(int var0, float var1) {
      float[] var2 = new float[var0];
      init(var2, var1);
      return var2;
   }

   public static float[][] float2array(int var0, float var1) {
      float[][] var2 = new float[var0][var0];
      init(var2, var1);
      return var2;
   }

   public static double[] double1array(int var0, double var1) {
      double[] var3 = new double[var0];
      init(var3, var1);
      return var3;
   }

   public static double[][] double2array(int var0, double var1) {
      double[][] var3 = new double[var0][var0];
      init(var3, var1);
      return var3;
   }

   public static char[] char1array(int var0, char var1) {
      char[] var2 = new char[var0];
      init(var2, var1);
      return var2;
   }

   public static char[][] char2array(int var0, char var1) {
      char[][] var2 = new char[var0][var0];
      init(var2, var1);
      return var2;
   }

   public static Object[] Object1array(int var0, Object var1) {
      Object[] var2 = new Object[var0];
      init(var2, var1);
      return var2;
   }

   public static Object[][] Object2array(int var0, Object var1) {
      Object[][] var2 = new Object[var0][var0];
      init(var2, var1);
      return var2;
   }

   public static boolean[] boolean1array(int var0, boolean var1) {
      boolean[] var2 = new boolean[var0];
      init(var2, var1);
      return var2;
   }

   public static boolean[][] boolean2array(int var0, boolean var1) {
      boolean[][] var2 = new boolean[var0][var0];
      init(var2, var1);
      return var2;
   }

   public static synchronized void runThread(Runnable var0) {
      final Thread var1 = new Thread(var0);
      var1.start();
      runningThreads.incrementAndGet();
      Thread var2 = new Thread(new Runnable() {
         public void run() {
            try {
               var1.join();
               Test.runningThreads.decrementAndGet();
            } catch (InterruptedException var2) {
            }

         }
      });
      var2.start();
   }

   public static void joinThreads() {
      while(runningThreads.get() > 0L) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var1) {
         }
      }

   }

   static {
      init(lArrFld, -3972438219L);
      dMeth_check_sum = 0L;
      vMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
      out = System.out;
      random = new Random(1L);
      seed = 1L;
      UnknownZero = 0;
      runningThreads = new AtomicLong(0L);
   }
}
