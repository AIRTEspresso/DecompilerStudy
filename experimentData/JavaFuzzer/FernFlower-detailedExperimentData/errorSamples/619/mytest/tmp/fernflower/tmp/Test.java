import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

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
   public static PrintStream out;
   public static Random random;
   public static long seed;
   public static int UnknownZero;
   public static AtomicLong runningThreads;

   public static int iMeth() {
      boolean var0 = true;
      int var1 = 10;
      int var2 = -231;
      int var3 = 0;
      int var4 = -6;
      int var5 = 12;
      int[] var6 = new int[400];
      float var7 = 2.717F;
      init((int[])var6, (int)13);

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

      long var8 = (long)(var10 + var1 + var2 + var3 + Float.floatToIntBits(var7) + var4 + var5) + checkSum(var6);
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
      init(var13, 4005670795L);
      init((int[])var9, (int)241);
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
               long var14 = (long)(var1 + var2 + var3 + var17 + var10 + var5 + var6 + var7 + var8) + Double.doubleToLongBits(var11) + checkSum(var13) + checkSum(var9);
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
                              return (int)((long)(var1 + var2 + var3 + var17 + var10 + var5 + var6 + var7 + var8) + Double.doubleToLongBits(var11) + checkSum(var13) + checkSum(var9)) % 2 > 0;
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

      System.out.println("i i1 i2 = " + var18 + "," + var8 + "," + var4);
      System.out.println("i3 f i4 = " + var5 + "," + Float.floatToIntBits(var11) + "," + var6);
      PrintStream var10000 = System.out;
      int var10001 = Float.floatToIntBits(var12);
      var10000.println("f1 by b = " + var10001 + "," + var13 + "," + (var15 ? 1 : 0));
      var10000 = System.out;
      long var20 = Double.doubleToLongBits(var16);
      var10000.println("d1 i20 i21 = " + var20 + "," + var7 + "," + var8);
      System.out.println("by1 i22 i23 = " + var14 + "," + var19 + "," + var10);
      var20 = instanceCount;
      System.out.println("Test.instanceCount fFld Test.fFld1 = " + var20 + "," + Float.floatToIntBits(this.fFld) + "," + Float.floatToIntBits(fFld1));
      var10001 = bFld ? 1 : 0;
      System.out.println("Test.bFld Test.iFld iFld1 = " + var10001 + "," + iFld + "," + this.iFld1);
      System.out.println("Test.iArrFld = " + checkSum(iArrFld));
      System.out.println("iMeth_check_sum: " + iMeth_check_sum);
      System.out.println("vMeth_check_sum: " + vMeth_check_sum);
      System.out.println("bMeth_check_sum: " + bMeth_check_sum);
   }

   public static void main(String[] var0) {
      try {
         Test var1 = new Test();

         for(int var2 = 0; var2 < 10; ++var2) {
            var1.mainTest(var0);
         }
      } catch (Exception var3) {
         System.out.println(var3.getClass().getCanonicalName());
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
      init((int[])iArrFld, (int)-11732);
      bMeth_check_sum = 0L;
      vMeth_check_sum = 0L;
      iMeth_check_sum = 0L;
      out = System.out;
      random = new Random(1L);
      seed = 1L;
      UnknownZero = 0;
      runningThreads = new AtomicLong(0L);
   }
}
