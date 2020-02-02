package textSingleton;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    public static Singleton getInstance(){
        return INSTANCE;}
    private Singleton(){}
    // 私有构造方法
    public void print(){
        System.out.println("aaa");
    }
}
