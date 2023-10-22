class T1<Z extends Character> {

  public <K extends Z> K foo() {
    final K k = (K) null;
    return k;
  }

}
