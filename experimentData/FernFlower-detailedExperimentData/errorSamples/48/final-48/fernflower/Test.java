class Test {
   void mainTest() {
      int var1 = 0;
      int var2 = 0;
      var1 -= 125;
      var1 += var2 | var1;
      var1 += var2 | var1;
      System.out.println("i1:" + var1);
      int var3 = 1;

      do {
         for(var2 = 1; var2 < 6; ++var2) {
            var1 |= var2;
            System.out.println("i:" + var1);
         }

         ++var3;
      } while(var3 < 299);

      System.out.println("result: " + var1);
   }

   public static void main(String[] var0) {
      Test var1 = new Test();
      var1.mainTest();
   }
}
