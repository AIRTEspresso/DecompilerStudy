public class Test {
   public void mainTest() {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = -42285;
      int var6 = -6;

      for(int var7 = 16; var7 < 354; ++var7) {
         try {
            int var10000 = var6 / var3;
            var3 = var6 / var6;
            var6 = var7 % var7;
         } catch (ArithmeticException var5) {
         }
      }

      System.out.println("i16=" + var3);
   }

   public static void main(String[] var0) {
      try {
         Test var1 = new Test();
         var1.mainTest();
      } catch (Exception var2) {
         System.out.println(var2.getClass().getCanonicalName());
      }

   }
}
