package testWrapper;

public class JavaDemo {
    public static void main(String[] args) {
        // 装箱：将基本数据类型保存在包装类之中
        Object obj = new Int(10);
        // 拆箱：从包装类对象中获取基本数据类型
        int x = ((Int)obj).intValue();
        System.out.println(x*2);

        Integer o = new Integer(10);//装箱
        int data = o.intValue();//拆箱
        System.out.println(data);


        Integer o1 = 10;   //自动装箱
        int num = o1;      //自动拆箱
        o1++;              //包装类对象可以直接参与数学运算
        System.out.println(num * o1);//直接参与数学运算


    }
}
