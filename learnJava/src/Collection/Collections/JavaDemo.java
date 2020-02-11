package Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaDemo {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        Collections.addAll(l,"a","b");
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(Collections.binarySearch(l,"c"));
    }
}
