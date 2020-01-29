package testReference;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Car car;
    private Person children[];

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
