package Extends;

public class Employee {
    private String name;
    private int age;
    private String sex;
    public Employee(){}
    public Employee(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getInfo() {
        return "name=" + name  + ", age=" + age + ", sex=" + sex ;
    }
}
