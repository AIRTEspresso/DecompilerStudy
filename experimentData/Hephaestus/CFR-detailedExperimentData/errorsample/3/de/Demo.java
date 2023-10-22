interface I1 {
    void apply();
}

class Demo {
    public void foo() {
        Character c1= 'c';
        I1 i1 = () -> {
            Character c2 = 'c';
        };
    }
}
