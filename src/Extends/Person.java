package Extends;

public class Person {
    private String name;
    private String addr;
    private char sex;
    private int age;

    public Person() {}

    public Person(String name, String addr) {
        this(name,addr,'男',0);
    }

    public Person(String name, String addr, char sex, int age) {
        this.name = name;
        this.addr = addr;
        this.sex = sex;
        this.age = age;
    }

    public String getInfo() {
        return "name=" + name  + ", addr=" + addr  + ", sex=" + sex + ", age=" + age ;
    }
}





