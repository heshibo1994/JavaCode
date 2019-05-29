package SingleTon;

public class Person {
    private static final Person INSTANCE = new Person();
    private Person(){}
    public  static Person getInstance(){
        return INSTANCE;
    }
    public void print(){
        System.out.println("heshibo");
    }
}
