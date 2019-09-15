package easy_code;

public class TestConstructor extends Parent{
    static {
        System.out.println("son静态代码块");
    }
    TestConstructor(){
        System.out.println("son构造方法");
    }

    public static void main(String[] args) {
        new TestConstructor();
        new TestConstructor();

    }
}
class Parent{
    static {
        System.out.println("parent静态代码块");
    }
    public Parent(){
        System.out.println("parent构造方法");
    }
}