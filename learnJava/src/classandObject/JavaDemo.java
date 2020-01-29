package classandObject;

public class JavaDemo {
    public static void main(String[] args) {
        Person per = new Person("keren ",18);//声明并实例化对象
        per.setAge(18);
        per.setName("keran");
        per.tell();
        //匿名对象
        new Person("apple",29).tell();
    }
//    public static void change(Person temp){
//        temp.age = 90;
//    }
        //错误代码
//        Person per1 = null;//声明并实例化对象
//        per1.age = 18;
//        per1.name = "KeRan";
//        per1.tell();
}