package regex;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDemo {
    public static void main(String[] args) {
        String str = "cusheshibo@163.com";
        String regex = "[a-zA-A0-9]\\w+@\\w+\\.(cn|com)";
        if(str.matches(regex)){
            System.out.println(str);
        }


        String s = "insert into dept(deptno,dname,loc) Values(#{aaa},#{bbb},#{ccc})";
        String re = "#\\{\\w+}";
        Pattern pat = Pattern.compile(re);
        Matcher mat = pat.matcher(s);
        while(mat.find()){
            System.out.println(mat.group(0).replaceAll("#|\\{|\\}",""));
        }
    }
}
