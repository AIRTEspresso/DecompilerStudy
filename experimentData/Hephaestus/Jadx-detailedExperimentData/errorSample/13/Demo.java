class T2  {
    public float f;
}

class T1  {
    public Character ch;
}

class T {
    static float f1 = ((T2) null).f;
    static Character c = ((T1) null).ch;
}
