class Test {
    long instanceCount;
    { 
        float f = 50.231F;
        instanceCount &= (long) f;
    }
}
