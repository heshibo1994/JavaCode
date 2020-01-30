package testObject;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // 空对象不比较
        if (obj == null) return false;
        // 只比较同类对象
        if (! (obj instanceof Person)) return false;
        // 目的是为了获取类中的属性
        Person per = (Person) obj;
        return this.name.equals(per.name) &&
                this.age == per.age;
    }
}
