package Object;
public class Person {
    private String name;
    private int age;
    public Person(String name, int  age) {
        this.name =name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public  int getAge(){
        return this.age;
    }

    public boolean equals(Object obj){
        Person p = (Person) obj;
        return this.name == p.name &&this.age==p.age;
    }
    public String toString() {
        return "name=" + name  +   ", age=" + age ;
    }
}

