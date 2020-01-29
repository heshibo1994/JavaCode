package easy_code;

import java.lang.reflect.Field;

public class ClassTest {
    private static int [] array = new int[3];
    private static int  length = array.length;
    //class定义的类具备的魔法属性，class，获取此类大写Class类对象
    private static Class<One> one = One.class;
    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws Exception {
        One oneObject = one.newInstance();
        oneObject.call();
        Another anotherObject = another.newInstance();
        anotherObject.speak();


        // 通过one这个大写的Class对象，获取私有成员属性对象Field
        Field privateFieldInone = one.getDeclaredField("inner");
        //设置私有对象可以访问和修改
        privateFieldInone.setAccessible(true);
        privateFieldInone.set(oneObject, "world changed.");
        System.out.println(oneObject.getInner());
    }
}

class One {
    private String inner = "time flies";
    public void call(){
        System.out.println("hello,world");
    }
    public String getInner(){
        return inner;
    }
}

class Another {
    public void speak(){
        System.out.println("easy coding");
    }
}

