package Collection.List;

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
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj ==null){
            return false;
        }
        Person per = (Person)obj;
        return this.age == per.age && this.name.equals(per.name);

    }
}
