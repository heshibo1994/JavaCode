package String;

public class TestString {
    public static void main(String[] args) {
        String s1 = "heshibo";
        String s2 = new String("heshibo");
        System.out.println(s1==s2);//==数值进行比较，若是对象，比较内存地址
        System.out.println(s1.equals(s2));//比较内容


        for (String arg:args){
            System.out.println(arg);
        }

        String s3 = "fsdf";
        char s  = s3.charAt(3);
        System.out.println(s);

        String s4 = "helloworld";
        byte data []  = s4.getBytes();//将字符串转化为字符数组
        for (int i =0;i<data.length;i++){
            data[i]-=32;
        }
        System.out.println(new String(data));

        System.out.println(s4.replace('l','h'));
        System.out.println(s4.split("l"));
    }
}