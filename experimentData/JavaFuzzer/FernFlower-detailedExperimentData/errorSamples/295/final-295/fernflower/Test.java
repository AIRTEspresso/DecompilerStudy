class Test {
   long instanceCount = 0L;
   int iFld = -39966;

   void mainTest() {
      int var1 = 1;
      boolean var2 = true;

      do {
         this.instanceCount ^= (long)var1;
         int var3 = var1;

         while(var3 < 68) {
            switch (var1 % 9 * 5 + 63) {
               case 98:
                  this.instanceCount += (long)this.iFld;
                  System.out.println("instanceCount 2:" + this.instanceCount);
               default:
                  ++var3;
            }
         }

         ++var1;
      } while(var1 < 373);

      System.out.println("Test.instanceCount = " + this.instanceCount);
   }

   public static void main(String[] var0) {
      Test var1 = new Test();
      var1.mainTest();
   }
}
