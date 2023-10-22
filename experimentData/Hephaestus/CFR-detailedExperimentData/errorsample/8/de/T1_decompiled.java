/*
 * Decompiled with CFR 0.153-SNAPSHOT (24c7433-dirty).
 */
class T1 {
    T1() {
    }

    public Object foo() {
        Boolean bl = false;
        Boolean bl2 = true;
        Comparable<Boolean> comparable = bl != false ? (Comparable<Double>)Double.valueOf(-33.998) : (Comparable<Double>)bl2;
        return comparable;
    }
}
