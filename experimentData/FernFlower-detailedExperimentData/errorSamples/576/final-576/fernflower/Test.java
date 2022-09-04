class Test {
   void vMeth(int var1, int var2) {
      double var3 = 2.68183;
      short var5 = 219;
      byte var7 = -64;
      var3 += (double)var1;
      var3 -= (double)var1;

      int var6;
      for(var6 = 5; 1 < var6; var6 -= 3) {
         var2 += var6 | var5;
      }

      System.out.println("i3=" + var2);
      System.out.println("i4=" + var2);
      System.out.println("i13=" + var5);
      System.out.println("i14=" + var6);
      System.out.println("i16=" + var7);
      System.out.println("d=" + Double.doubleToLongBits(var3));
   }

   void mainTest() {
      this.vMeth(15, 184);
   }

   public static void main(String[] var0) {
      Test var1 = new Test();
      var1.mainTest();
   }
}
