class Test {
   int N = 400;
   long instanceCount;
   int iFld;
   int iFld1 = 98;
   int[] iArrFld;

   Test() {
      this.iArrFld = new int[this.N];
   }

   void vMeth(int var1, long var2, int var4) {
      for(int var5 = 3; 167 > var5; var5 += 2) {
         int var10002 = this.iArrFld[var5]--;
      }

      for(var1 = 0; var1 < this.iArrFld.length; ++var1) {
         System.out.println("iArrFld[" + var1 + "]=" + this.iArrFld[var1]);
      }

   }

   void mainTest(String[] var1) {
      double var2 = 2.118649;
      int var6 = 13;
      this.vMeth(6, this.instanceCount, this.iFld);
      this.iFld = (int)((double)this.iFld + var2);

      for(int var4 = 8; var4 < 177; ++var4) {
         for(int var5 = 5; var5 < 148; ++var5) {
            this.iFld |= var6;
            byte var7 = 1;
            var6 *= this.iFld;
            this.iFld += var7;
            var2 = -2.48671;

            try {
               int var10000 = var7 / this.iFld1;
               var6 = 8 / this.iArrFld[var5 - 1];
            } catch (ArithmeticException var9) {
            }

            this.iArrFld[var4] = (int)var2;
            this.iFld += var5;
         }
      }

      System.out.println("Test.iFld =" + this.iFld);
   }

   public static void main(String[] var0) {
      Test var1 = new Test();
      var1.mainTest(var0);
   }
}
