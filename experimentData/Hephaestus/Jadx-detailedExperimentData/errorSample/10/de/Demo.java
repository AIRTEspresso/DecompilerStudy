interface I1 {
  public Void apply();
}

class T1 {
    public Integer i;
}

class Demo {
    public void adjusted() {
        final T1 t1 = new T1();
        I1 i1 = () -> {
            Integer i = t1.i;
            return null;
        };
    }
}

