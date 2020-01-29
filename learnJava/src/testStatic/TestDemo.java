package testStatic;

public class TestDemo {
    public static void main(String[] args) {
/*        Person p1 = new Person("keran3", 20);
        Person p2 = new Person("keran2", 20);
        Person p3 = new Person("keran1", 20);
        Person.country = "中国";
        System.out.println(p1.toString());*/

/*        System.out.println(Person.country);
        Person.country = "中国";
        Person p = new Person("keran3", 20);
        System.out.println(p);*/
        System.out.println(new Book("Java").getName());
        System.out.println(new Book("Python").getName());
        System.out.println(new Book("C++").getName());
        System.out.println(new Book().getName());

    }
}
