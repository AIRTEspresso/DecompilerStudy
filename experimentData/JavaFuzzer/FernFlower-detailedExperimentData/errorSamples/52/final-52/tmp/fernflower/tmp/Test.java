class Test {
   byte byFld = -92;
   short sFld = -8562;

   void mainTest(String[] var1) {
      int var3 = 10;
      int var5 = -14;
      int var7 = 12;
      char var8 = '칒';
      long var9 = -3L;
      long var11 = 13L;
      int var2 = 1;

      while(true) {
         ++var2;
         if (var2 >= 205) {
            byte var13 = this.byFld;
            var3 = var13 * var5;
            int var6 = 1;

            do {
               var3 += var6;
               switch (var6 % 2 + 116) {
                  case 116:
                     for(var7 = var6; 115 > var7; ++var7) {
                        var3 |= var7;
                     }
               }

               ++var6;
            } while(var6 < 219);

            System.out.println("i i1 l = " + var2 + "," + var3 + "," + var9);
            System.out.println("i24 i25 l4 = " + var7 + "," + var8 + "," + var11);
            return;
         }

         var9 >>= var3;

         for(int var4 = 7; var4 < 122; ++var4) {
            var5 += var4;
         }

         var5 += this.sFld;
      }
   }

   public static void main(String[] var0) {
      Test var1 = new Test();
      var1.mainTest(var0);
   }
}
