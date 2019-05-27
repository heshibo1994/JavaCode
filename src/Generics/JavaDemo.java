package Generics;

import Wrapper.Int;

public class JavaDemo {
    public static void main(String[] args) {
        Point<Integer> point = new Point<Integer>();
        point.setX(10);
        point.setY(20);
        int x= point.getX();
        int y= point.getY();
        System.out.println("x坐标： "+x+",y坐标： "+y);


        Message<String > msg1 = new Message<String>();
        msg1.setContent("heshibo");
        fun(msg1);
        Message<Integer> msg2 = new Message<Integer>();
        msg2.setContent(100);
        fun(msg2);

        Imessage<String> imsg = new MessageImp1<String>();
        System.out.println(imsg.echo("heshibo"));


        Integer num[] = fun(1,2,3);
        for (int i:num){
            System.out.println(i);
        }
    }
    public static void fun (Message<?> msg){
        System.out.println(msg.getContent());
    }
    public static <T> T[] fun(T ... args){//泛型方法
        return args;
    }
}
