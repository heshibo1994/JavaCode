package Nested;

public class JavaDemo {
    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.fun();

        Outer.Inner in = new Outer().new Inner();
        in.print();

        Outer.Inner1 in1 = new Outer.Inner1();
        in1.print();


    }
}
