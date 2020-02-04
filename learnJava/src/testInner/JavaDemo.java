package testInner;

public class JavaDemo {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.print();

        new Outer1().fun(123);


        IMessage msg = new IMessage(){
            public void send(String str){
                System.out.println(str);
            }
        };
        msg.send("keran");
    }
}
