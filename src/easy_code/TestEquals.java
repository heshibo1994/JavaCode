package easy_code;

public class TestEquals {
    public static void main(String[] args) {

        String x = "string";
        String y = "string";
        String z = new String ("string");
        System.out.println(x == y); // true
        System.out.println(x == z); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true

        String s1 = new String("老王");
        String s2 = new String("老王");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2)); // true



        String str1 = "通话";
        String str2 = "重地";
        System.out.println(str1.hashCode());//1179395
        System.out.println(str2.hashCode());//1179395
        System.out.println(str1.equals(str2));//false
    }
}
