package Polymorphism;

public class JavaDemo {
    public static void main(String[] args) {
        fun(new DataBaseMessage());
        fun(new WebDataBase());
    }
    public static void fun(Message msg){
        msg.info();
    }
}
