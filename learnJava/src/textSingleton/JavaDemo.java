package textSingleton;

public class JavaDemo {
    public static void main(String[] args) {
        Singleton instance = null;
        instance = Singleton.getInstance();
        instance.print();

        Color c = Color.getInstance("red");
        System.out.println(c.toString());
    }
}
