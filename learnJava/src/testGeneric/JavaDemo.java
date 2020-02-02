package testGeneric;

public class JavaDemo {
    public static void main(String[] args) {
        Point point =    new Point();
        point.setX(10);
        point.setY("aaaa");
        System.out.println(point.getX());
        System.out.println(point.getY());

        Point<Integer> point1 = new Point<Integer>();
        point.setX(10);


        Message<String> msg = new Message<String>();
        msg.setContent("abc");
        fun(msg);



        IMessage<String> imsg = new MessageImpl<String>();
        System.out.println(imsg.echo("keran"));


        Integer num[] = func(1,2,3);
        for (int temp:num){
            System.out.println(temp+"、");
        }
    }

    public static <T> T[] func(T ...args){
        return args;
    }
    public static void fun(Message<?> temp){
        System.out.println(temp.getContent());
    }
}
