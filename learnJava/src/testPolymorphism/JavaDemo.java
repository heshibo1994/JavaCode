package testPolymorphism;

public class JavaDemo {
    public static void main(String[] args) {
        fun(new DatabaseMessage());
        fun(new WebServeMessage());
    }
    public static void fun(Message msg){
        msg.print();
    }
}
