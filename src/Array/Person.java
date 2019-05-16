package Array;
public class Person {
    private String name;
    private int age;
    public Person(String n,int a){
        name = n;
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        if (a>0){
            age = a;
        }
        else
            age  = 0;
    }
    public void tell() {
        System.out.println("姓名:" + name + " 年纪：" + age);
    }
}


