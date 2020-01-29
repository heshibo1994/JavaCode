package classandObject;

public class Person {
    private String name;
    private int age;

    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //构造方法的重载
    public Person(String name) {
        this.name = name;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void tell(){
        System.out.println("name: "+name+"age: "+age);
    }
}

