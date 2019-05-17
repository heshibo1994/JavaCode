package Relation;

public class Person {
    private String name;
    private int age;
    private Car car;//一个人有一辆车
    private Person [] children;
    public Person(String n, int a){
        this.name = n;
        this.age = a;
    }
    public void setChildren(Person [] children){this. children  = children ;}
    public void setName(String n){
        this.name = n;
    }
    public void setAge(int age){ this.age = age;    }
    public void setCar(Car car){this.car = car;}
    public Person[] getChildren(){
        return children;
    }
    public Car getCar(){
        return this.car;
    }
    public String  getInfo() {
        return "姓名:" + name + " 年纪：" + age;
    }
}


