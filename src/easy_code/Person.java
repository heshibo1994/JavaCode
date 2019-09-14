package easy_code;

public class Person {
    public static void print(String s){
        System.out.println(s);
    }

    // 构造方法(1)
    Person(){
        print("父类.无参构造方法"+"A person.");
    }
    // 构造方法(2)
    Person(String name){
        print("父类.含有一个参数的构造方法"+"A person‘s name is ."+name);

    }
}

class Student extends Person{
    Student(){
        // 调用父类构造方法（1）
        super();// 调用父类构造否方法
        print("子类·调用父类”无参数构造方法“： "+"A student .");
    }
    // 调用父类具有相同形参的构造方法（2）
    Student(String name){
        super(name);
        print("子类·调用父类”含有一个参数构造方法“： "+"His name is."+name);
    }
    Student (String name,int age){
        // 调用具有相同形参的构造方法（3）
        this(name);
        print("子类·调用父类”含有一个参数构造方法“： "+"His name is."+name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s = new Student("Keran");
        s = new Student("Keran",24);
    }
}