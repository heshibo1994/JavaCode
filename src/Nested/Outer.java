package Nested;

import java.io.OutputStream;

public class Outer {
    private String outmessage = "heshibo";
    public void fun(){
        Innner in = new Innner();
        in.print();
        System.out.println(in.inmessage);
    }
    class Innner{
        private String inmessage  = "boshihe";
        public void print(){
            System.out.println(Outer.this.outmessage);

        }
    }
}
