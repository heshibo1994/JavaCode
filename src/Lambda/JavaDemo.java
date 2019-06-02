package Lambda;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage msg = (str)->{
            System.out.println("消息"+str);
        };
        msg.send("heshibo");

        IFunction1<Integer,String>  fun1 = String ::valueOf;
        String str = fun1.change(100);
        System.out.println(str.length());

        IFunction2<String>  fun2 = "heshibo"::toUpperCase;
        System.out.println(fun2.upper());

        IFunction3<String> fun3 = String :: compareTo;
        System.out.println(fun3.compare("A","a"));
    }
}
