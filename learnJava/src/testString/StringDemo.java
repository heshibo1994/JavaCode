package testString;

public class StringDemo {
    public static boolean isNumber(String str){
        char [] result = str.toCharArray();
        for(char ch:result){
            System.out.println(ch);
            if (ch<'0' ||ch>'9'){return false;}
        }
        return true;
    }
}
