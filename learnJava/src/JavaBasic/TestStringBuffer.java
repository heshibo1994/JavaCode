package JavaBasic;

public class TestStringBuffer {
    public static void main(String[] args) {
        String str = "hello";
        change(str);
        System.out.println(str);

        StringBuffer sbuf = new StringBuffer("hello");
        change(sbuf);
        System.out.println(sbuf);
        System.out.println(sbuf.reverse());
    }

    public static void change(String str){
        str += "world";
    }
    public static void change(StringBuffer str){
        str.append("world");
    }
}
