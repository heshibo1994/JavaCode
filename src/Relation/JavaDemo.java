package Relation;

import java.sql.SQLOutput;
import java.util.logging.XMLFormatter;

public class JavaDemo {
    public static void main(String[] args) {
        //设置关系
        Person p1 = new Person("heshibo", 29);
        Car c1 = new Car("baoma", 100000);
        p1.setCar(c1);
        c1.setPer(p1);
        //根据关系获取数据

        System.out.println(p1.getCar().getInfo());
        System.out.println(c1.getPer().getInfo());
        //自身关联
        Person child1 = new Person("he",29);
        Person child2 = new Person("shi",39);
        child1.setCar(new Car("法拉利",200000));
        child2.setCar(new Car("保时捷",400000));
        p1.setChildren(new Person []{child1,child2});
        for(Person i :p1.getChildren()){
            System.out.println(i.getInfo());
            System.out.println(i.getCar().getInfo());
        }
    }

}
