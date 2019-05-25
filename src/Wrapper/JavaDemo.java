package Wrapper;

import javax.naming.spi.ObjectFactoryBuilder;

public class JavaDemo {
    public static void main(String[] args) {
        Object obj = new Int(10);//装箱
        int x = ((Int)obj).intValue();//拆箱
        System.out.println(x*2);

        Double obj1 =  new Double(10.1);//装箱
        double num1 = obj1.doubleValue();//拆箱
        System.out.println(num1*num1);

        //自动装箱和拆箱
        Integer obj2 = 10;
        int num2 = obj2;
        obj2++;
        System.out.println(num2*obj2);

        Object obj3  = 19.2;
        double num3 = (Double)obj3;//向下转型，再自动拆箱
        System.out.println(num3*2);

    }
}
