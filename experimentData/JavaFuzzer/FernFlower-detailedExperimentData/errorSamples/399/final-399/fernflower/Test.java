import java.io.PrintStream;

class Test {
   int N = 400;

   int iMeth() {
      long var1 = 6434513136464641584L;
      return (int)var1;
   }

   void mainTest() {
      byte var2 = -8;
      short var3 = -11995;
      float[] var4 = new float[this.N];
      this.init(var4, 0.383F);

      for(int var1 = 342; var1 > 16; --var1) {
         var4[var1] -= (float)(-(var2 - var3)) + 103.596F + (float)this.iMeth() - 43490.0F;
      }

      PrintStream var10000 = System.out;
      double var10001 = this.checkSum(var4);
      var10000.println("fArr:" + Double.doubleToLongBits(var10001));
   }

   public static void main(String[] var0) {
      Test var1 = new Test();
      var1.mainTest();
   }

   void init(float[] var1, float var2) {
      for(int var3 = 0; var3 < var1.length; ++var3) {
         var1[var3] = var3 % 2 == 0 ? var2 + (float)var3 : var2 - (float)var3;
      }

   }

   double checkSum(float[] var1) {
      double var2 = 0.0;

      for(int var4 = 0; var4 < var1.length; ++var4) {
         var2 += (double)(var1[var4] / (float)(var4 + 1) + var1[var4] % (float)(var4 + 1));
      }

      return var2;
   }
}
