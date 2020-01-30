package testObject;

public class JavaDemo {
    public static void main(String[] args) {
        Person per = new Person("keran",20);
        System.out.println(per);
        System.out.println(per.toString());
        Person perA = new Person("a",21);
        Person perB = new Person("a",21);
        System.out.println(perA.equals(perB));

    }
}
