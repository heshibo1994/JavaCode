package testString;

public class JavaDemo {
    public static void main(String[] args) {
        String s =  "hello,keran";
        System.out.println(s);
        String ss = new String("hello,keran");
        System.out.println(ss);
        System.out.println(s==ss);
        System.out.println(s.equals(ss));

        String sss = null;
        //System.out.println(sss.equals("keran"));
        System.out.println("keran".equals(sss));


        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);

        String sstr1 = new String("hello").intern();
        String sstr2 = new String("hello").intern();
        System.out.println(sstr1 == sstr2);

        String str = "keran";
        String strA = "hello,keran";
        String strB = "hello," + "keran";
        String strC = "hello,"+str;
        System.out.println(strA == strB);
        System.out.println(strA == strC);

        String s1 = "hello ";
        s1 += "keren";
        System.out.println(s1);
        System.out.println("=============");
        System.out.println(StringDemo.isNumber("fsdfsd89fs"));
        System.out.println("m".compareTo("Ma"));
    }
}
