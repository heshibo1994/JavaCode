package Test;

public class PersonStatic {
    private String name;
    private int age;
    static String country= "日本";
    public PersonStatic(String n,int a){
        this.name = n;
        this.age = a;
    }

    public void getInfo() {
        System.out.println("姓名:" + name + " 年纪：" + age+"国家："+country);
    }
}
