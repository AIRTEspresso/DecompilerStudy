package defpackage;

import java.io.PrintStream;
/* renamed from: Demo  reason: default package */
/* loaded from: /home/xiayi/Mine/workspace/gradup-b/statistic/demo/jadx/4/de/classes.dex */
class Demo {
    Demo() {
    }

    public static void foo(Object obj) {
        if (obj instanceof Boolean) {
            PrintStream printStream = System.out;
            printStream.println("Boolean: " + obj);
        }
        if (obj instanceof Float) {
            PrintStream printStream2 = System.out;
            printStream2.println("Float: " + obj);
        }
    }

    public static void main(String[] strArr) {
        boolean valueOf = Float.valueOf(-47.99f);
        if (Boolean.valueOf(strArr.length == 0).booleanValue()) {
            valueOf = false;
        }
        foo(valueOf);
    }
}
