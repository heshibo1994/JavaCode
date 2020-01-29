package testExtend;

public class JavaDemo {
    public static void main(String[] args) {
        Student stu = new Student();//完全父类中的定义
        stu.setAge(24);
        stu.setName("KeRan");
        stu.setSchool("Tongji");
        System.out.println(stu);

        new Student1("keran","tongji");

    }
}
