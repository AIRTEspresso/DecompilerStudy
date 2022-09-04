public class Test {
   public static final int N = 400;
   public static volatile long instanceCount = 2L;
   public double dFld = 2.3932;
   public short sFld = -27032;
   public static long vMeth_check_sum = 0L;
   public static long vMeth1_check_sum = 0L;
   public static long iMeth_check_sum = 0L;

   public static int iMeth() {
      instanceCount = instanceCount;
      long var0 = 0L;
      iMeth_check_sum += var0;
      return (int)var0;
   }

   public static void vMeth1() {
      int var0 = -8;
      var0 *= (int)((instanceCount = (long)iMeth()) - (long)var0);
      vMeth1_check_sum += (long)var0;
   }

   public static void vMeth() {
      float var0 = -1.158F;
      float[] var1 = new float[400];
      boolean var2 = true;
      int var3 = 19463;
      int var4 = 7;
      int var5 = -61079;
      int var6 = 29827;
      int var7 = -24574;
      int var8 = 47170;
      int[] var9 = new int[400];
      byte var10 = 52;
      boolean var11 = false;
      boolean[] var12 = new boolean[400];
      short var13 = 20976;
      long var14 = -8L;
      long[] var16 = new long[400];
      double[] var17 = new double[400];
      FuzzerUtils.init((int[])var9, (int)11);
      FuzzerUtils.init(var12, false);
      FuzzerUtils.init(var16, 915069913L);
      FuzzerUtils.init(var17, 65.12613);
      FuzzerUtils.init(var1, -1.495F);
      vMeth1();
      var0 = (float)instanceCount;

      int var23;
      for(var23 = 3; var23 < 337; ++var23) {
         double var18 = 0.586;
         var4 = 5;

         do {
            var10 = (byte)var3;
            var9[var23] += (int)var0;
            instanceCount |= instanceCount;
            instanceCount = 1L;
            var4 -= 3;
         } while(var4 > 0);

         var3 += 175 + var23 * var23;
         switch (var23 * 5 + 82) {
            case 90:
            case 92:
            case 93:
            case 94:
            case 97:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 112:
            case 115:
            case 116:
            case 119:
            case 120:
            case 121:
            case 122:
            case 124:
            case 125:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 185:
            case 186:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 199:
            case 200:
            case 201:
            case 202:
            case 203:
            case 206:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 223:
            case 224:
            case 227:
            case 229:
            case 230:
            case 231:
            case 232:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 248:
            case 251:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 260:
            case 261:
            case 262:
            case 263:
            case 265:
            case 266:
            case 268:
            case 270:
            case 271:
            case 272:
            case 273:
            case 275:
            case 277:
            case 278:
            case 279:
            case 280:
            case 281:
            case 282:
            case 283:
            case 284:
            case 285:
            case 286:
            case 287:
            case 288:
            case 290:
            case 291:
            case 292:
            case 294:
            case 295:
            case 297:
            case 298:
            case 299:
            case 300:
            case 301:
            case 302:
            case 303:
            case 304:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 313:
            case 314:
            case 316:
            case 317:
            case 321:
            case 322:
            case 323:
            case 324:
            case 325:
            case 326:
            case 327:
            case 328:
            case 329:
            case 330:
            case 331:
            case 332:
            case 335:
            case 336:
            case 337:
            case 338:
            case 339:
            case 340:
            case 342:
            case 343:
            case 344:
            case 345:
            case 346:
            case 348:
            case 349:
            case 350:
            case 351:
            case 352:
            case 353:
            case 354:
            case 355:
            case 356:
            case 358:
            case 359:
            case 360:
            case 361:
            case 362:
            case 363:
            case 364:
            case 366:
            case 367:
            case 369:
            case 370:
            case 372:
            case 373:
            case 374:
            case 375:
            case 376:
            case 377:
            case 378:
            case 379:
            case 380:
            case 381:
            case 382:
            case 383:
            case 384:
            case 385:
            case 386:
            case 387:
            case 389:
            case 390:
            case 391:
            case 392:
            case 394:
            case 395:
            case 396:
            case 397:
            case 398:
            case 399:
            case 400:
            case 401:
            case 403:
            case 404:
            case 406:
            case 407:
            case 408:
            case 409:
            case 410:
            case 411:
            case 412:
            case 413:
            case 414:
            case 415:
            case 416:
            case 417:
            case 419:
            case 422:
            case 423:
            case 425:
            case 426:
            default:
               break;
            case 95:
               var0 += (float)var23;
               break;
            case 96:
               var5 -= var23;
            case 269:
               var3 = var23;
               break;
            case 98:
               var16[var23 + 1] += -30993L;
               break;
            case 108:
               var5 >>>= var10;
            case 320:
               var3 -= (int)var0;
               break;
            case 113:
               var0 -= (float)var8;
            case 315:
               var1 = var1;
               break;
            case 114:
               var16[var23] = (long)var23;
               break;
            case 118:
               instanceCount >>>= 0;
               break;
            case 126:
               instanceCount *= (long)var0;
            case 252:
               var6 = var3;
               break;
            case 135:
            case 371:
               var3 -= var23;
               break;
            case 145:
               instanceCount = 32877L;
               break;
            case 177:
            case 213:
               var9 = var9;
               break;
            case 178:
               var14 >>>= var6;
               break;
            case 184:
               if (var11) {
               }
               break;
            case 187:
               var13 = (short)var4;
            case 207:
               var3 = (int)((long)var3 + ((long)var23 ^ instanceCount));
            case 89:
            case 234:
            case 388:
               instanceCount += (long)var23;
               break;
            case 188:
               if (var5 != 0) {
                  vMeth_check_sum += (long)(Float.floatToIntBits(var0) + var23 + var3 + var4 + var10 + (var11 ? 1 : 0) + var13 + var5) + var14 + (long)var6 + (long)var7 + (long)var8 + FuzzerUtils.checkSum(var9) + FuzzerUtils.checkSum(var12) + FuzzerUtils.checkSum(var16) + Double.doubleToLongBits(FuzzerUtils.checkSum(var17)) + Double.doubleToLongBits(FuzzerUtils.checkSum(var1));
                  return;
               }
            case 117:
               if (var4 != 0) {
                  vMeth_check_sum += (long)(Float.floatToIntBits(var0) + var23 + var3 + var4 + var10 + (var11 ? 1 : 0) + var13 + var5) + var14 + (long)var6 + (long)var7 + (long)var8 + FuzzerUtils.checkSum(var9) + FuzzerUtils.checkSum(var12) + FuzzerUtils.checkSum(var16) + Double.doubleToLongBits(FuzzerUtils.checkSum(var17)) + Double.doubleToLongBits(FuzzerUtils.checkSum(var1));
                  return;
               }
               break;
            case 198:
               var11 = var11;
               int var24 = var3 * (int)var18;
               var3 = (int)instanceCount;
               break;
            case 204:
               instanceCount = (long)var4;
               break;
            case 222:
               double var10000 = var18 * (double)var14;
               break;
            case 225:
               var6 += 11;
               break;
            case 226:
               var14 = (long)var0;
               break;
            case 228:
               var3 = var6;
               break;
            case 233:
               var3 >>>= var23;
               break;
            case 247:
               var3 += var3;
               break;
            case 249:
               var0 -= (float)var14;
            case 165:
               var0 -= (float)var18;
               break;
            case 250:
               var14 += (long)(var23 * var23);
            case 123:
               var8 = 126;
               break;
            case 253:
               var0 += (float)var6;
               break;
            case 259:
               var5 = (int)var14;
               break;
            case 264:
               try {
                  var6 = 163 / var6;
                  var9[var23 - 1] = -61964 / var5;
                  var6 = var5 / var23;
               } catch (ArithmeticException var22) {
               }
               break;
            case 267:
               var17[var23 - 1] *= (double)var5;
               break;
            case 276:
               var7 *= (int)var18;
               break;
            case 293:
               var3 += var23;
               break;
            case 296:
               var12[var23] = var11;
               break;
            case 305:
               var0 = var0;
               break;
            case 311:
            case 402:
               int var10002 = var16[var23]++;
               break;
            case 312:
               var9[var23 + 1] += var23;
               break;
            case 318:
               var5 -= var3;
               break;
            case 319:
               var9[var23 - 1] += var5;
               break;
            case 333:
               var3 = var4;
               break;
            case 334:
               var7 = (int)instanceCount;
            case 289:
               if (var11) {
               }
               break;
            case 341:
               try {
                  var6 = var7 % '\udeee';
                  var9[var23 - 1] = var4 / var23;
                  var8 = var7 / var8;
               } catch (ArithmeticException var21) {
               }
               break;
            case 347:
               var3 ^= var5;
               break;
            case 357:
               var0 = (float)var4;
               break;
            case 365:
               var5 = 155;
               break;
            case 368:
               var5 += var5;
               break;
            case 393:
               var9[var23 - 1] -= (int)instanceCount;
            case 91:
               var13 += (short)var23;
            case 274:
               var6 += var4;
            case 132:
               var14 = -41L;
               break;
            case 405:
               var5 = var4;
               break;
            case 418:
               var5 += 27101;
               break;
            case 420:
               var6 -= (int)var14;
               break;
            case 421:
               var6 += var23;
            case 205:
            case 424:
               var16[var23 - 1] *= -6L;
               break;
            case 427:
               var3 = (int)((long)var3 + ((long)var23 - var14));
         }
      }

      vMeth_check_sum += (long)(Float.floatToIntBits(var0) + var23 + var3 + var4 + var10 + (var11 ? 1 : 0) + var13 + var5) + var14 + (long)var6 + (long)var7 + (long)var8 + FuzzerUtils.checkSum(var9) + FuzzerUtils.checkSum(var12) + FuzzerUtils.checkSum(var16) + Double.doubleToLongBits(FuzzerUtils.checkSum(var17)) + Double.doubleToLongBits(FuzzerUtils.checkSum(var1));
   }

   public void mainTest(String[] var1) {
      boolean var2 = true;
      int var3 = -6;
      int var4 = -42801;
      int var5 = -9;
      int var6 = 63822;
      int var7 = 47;
      int var8 = -103;
      int[] var9 = new int[400];
      float var10 = -38.561F;
      boolean var11 = true;
      long[] var12 = new long[400];
      FuzzerUtils.init(var9, -39778);
      FuzzerUtils.init(var12, 63866L);

      int var16;
      for(var16 = 386; var16 > 14; --var16) {
         boolean var13 = true;
         vMeth();
         var3 += var16;
         byte var17 = (byte)var3;
         var9[var16] <<= var16;
         var3 += var3;
         this.dFld += (double)var3;
         var3 += (int)var10;

         for(var4 = 2; var4 < 68; ++var4) {
            var5 = var4;
            var3 = var4;
            var6 = 1;

            while(true) {
               ++var6;
               if (var6 >= 2 || var11) {
                  var5 *= var17;

                  for(var7 = 1; var7 < 2; ++var7) {
                     instanceCount = (long)var7;
                     var3 >>= var8;
                     var8 >>= -7;
                     var12[var4 + 1] *= (long)this.sFld;
                     this.sFld += (short)var8;
                     var9[var16 + 1] += var4;
                     var3 += var7 * var7;
                  }
                  break;
               }

               var5 = var16;

               try {
                  var5 = -239 % var6;
                  var9[var6 + 1] = var4 / var3;
                  var9[var4 - 1] = var5 % var4;
               } catch (ArithmeticException var15) {
               }

               var9[var6] = (int)var10;
               var10 += (float)(4 + var6 * var6);
               var3 >>= var3;
               instanceCount = (long)var4;
               var5 -= (int)this.dFld;
               var3 = (int)instanceCount;
            }
         }
      }

      FuzzerUtils.out.println("i i1 f1 = " + var16 + "," + var3 + "," + Float.floatToIntBits(var10));
      FuzzerUtils.out.println("i11 i12 i13 = " + var4 + "," + var5 + "," + var6);
      FuzzerUtils.out.println("b1 i14 i15 = " + (var11 ? 1 : 0) + "," + var7 + "," + var8);
      FuzzerUtils.out.println("iArr1 lArr1 = " + FuzzerUtils.checkSum(var9) + "," + FuzzerUtils.checkSum(var12));
      FuzzerUtils.out.println("Test.instanceCount dFld sFld = " + instanceCount + "," + Double.doubleToLongBits(this.dFld) + "," + this.sFld);
      FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
      FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
      FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
   }

   public static void main(String[] var0) {
      try {
         Test var1 = new Test();

         for(int var2 = 0; var2 < 10; ++var2) {
            var1.mainTest(var0);
         }
      } catch (Exception var3) {
         FuzzerUtils.out.println(var3.getClass().getCanonicalName());
      }

   }
}
