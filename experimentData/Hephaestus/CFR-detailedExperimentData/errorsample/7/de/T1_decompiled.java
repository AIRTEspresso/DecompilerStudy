/*
 * Decompiled with CFR 0.153-SNAPSHOT (24c7433-dirty).
 */
class T1 {
    T1() {
    }

    public Object foo(boolean bl) {
        Byte[] byteArray = Integer.valueOf(1);
        return bl ? byteArray : (Byte[])new Object[]{(byte)-98};
    }
}
