interface I1<I> {
  I foo(I arg) ;
}

class T1 implements I1<Short> {
  public Short foo(Short arg) {
    return foo((short)63);
  }
}
