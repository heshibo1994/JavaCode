package Nested;

import java.awt.*;

public class JavaDemo {
    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.fun();

        Outer.Inner in = new Outer().new Inner();
        in.print();

        Outer.Inner1 in1 = new Outer.Inner1();
        in1.print();

        IMessages msg = new IMessages() {//匿名内部类
            public void send(String str){
                System.out.println(str);
            }
        };
        msg.send("匿名内部类");
    }
}
