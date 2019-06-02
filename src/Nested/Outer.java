package Nested;

import java.io.OutputStream;

public class Outer {
    private static  final  String  OUTMESSAGE = "heshibo";
    public void fun(){
        Inner in = new Inner();
        in.print();
        System.out.println(in.inmessage);
    }
    class Inner{
        private String inmessage  = "boshihe";
        public void print(){
            System.out.println(Outer.this.OUTMESSAGE);
        }
    }

    static class Inner1{
        public void print(){
            System.out.println(Outer.OUTMESSAGE);
        }
    }
}
