package JavaBasic;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("a",21);
        Person p2= (Person)p1.clone();
        System.out.println(p1);
        System.out.println(p2);
    }
}
