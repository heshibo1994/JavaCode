package SingleTon;

public class JavaDemo {
    public static void main(String[] args) {
        Person instance = null;
        instance = Person.getInstance();
        instance.print();

        Color c = Color.getInstance("green");
        System.out.println(c);


    }
}
