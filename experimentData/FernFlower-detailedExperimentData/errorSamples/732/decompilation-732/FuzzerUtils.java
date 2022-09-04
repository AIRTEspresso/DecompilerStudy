import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class FuzzerUtils {
   public static PrintStream out;
   public static Random random;
   public static long seed;
   public static int UnknownZero;
   public static AtomicLong runningThreads;

   public static void seed(long var0) {
      random = new Random(var0);
      seed = var0;
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
               FuzzerUtils.runningThreads.decrementAndGet();
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
      out = System.out;
      random = new Random(1L);
      seed = 1L;
      UnknownZero = 0;
      runningThreads = new AtomicLong(0L);
   }
}
