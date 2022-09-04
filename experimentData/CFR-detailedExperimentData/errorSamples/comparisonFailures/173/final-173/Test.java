import java.util.concurrent.atomic.AtomicLong;
import java.io.PrintStream;
import java.util.Random;
public class Test {

    public static final int N = 400;

    public static long instanceCount=1723977013L;
    public static long vMeth1_check_sum = 0;
    public static void main(String[] arg) {
        Test tester = new Test();
        tester.vMeth1();
    }


    public void vMeth1() {

        int i4=53, i5=-58396, i6=-8681, i7=-8, i8=11268, i9=21390;
        byte by=36;
        boolean b=false;
        i4 &= (int)Test.instanceCount;
        by = (byte)i6;
        i6 = i6;
        Test.instanceCount += (long)26.895F;
        i7 = 1;
        do {
            if (b) break;
            b = b;
            for (i8 = 1; 1 > i8; ++i8) {
                i4 = (int)Test.instanceCount;
                i9 = 225;
            }
        } while (++i7 < 7);
        vMeth1_check_sum += i4 + i5 + i6 + by + i7 + (b ? 1 : 0) + i8 + i9;
    }


}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
