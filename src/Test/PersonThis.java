package Test;

public class PersonThis {
    private String name;
    private int age;
    public PersonThis(){
        System.out.println("生产一个新的对象");
    }
    public PersonThis(String name){
        this();
        this.name = name;
    }
    public PersonThis(String name,int age){
        this(name);
        this.age = age;
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


