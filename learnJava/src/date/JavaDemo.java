package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long t = date.getTime()+86400000;
        System.out.println(new Date(t));
//格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String str = sdf.format(date);
        System.out.println(str);

    }
}
