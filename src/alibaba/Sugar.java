package alibaba;

import java.util.ArrayList;
import java.util.List;
public class Sugar {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s2");

        for (String s : list) {
            System.out.println(s);
        }

        for (java.util.Iterator iter = list.iterator(); iter.hasNext(); ) {
            String s = (String) iter.next();
            {
                System.out.println(s);
            }
        }
    }
}



