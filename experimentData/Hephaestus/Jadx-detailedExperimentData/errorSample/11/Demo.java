class T2<H, R extends Integer> {
  public final H foo(R r) { return null; }
}

class T1<NEVER_USED> extends T2<Character, Integer> {
  public Character cc() {
    Character c = new T1<Integer>().foo(1);
    return c;
  }
}
