package testInner;

public class Outer {
    private static final String MSG = "aaa";

    static class Inner{
            public void print(){
                System.out.println(Outer.MSG);
            }
        }
}
