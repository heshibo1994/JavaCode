package Collection.Iterator;

import java.util.*;

public class JavaDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("a");
        s.add("bb");
        s.add("ccc");
        s.add("aa");
        Iterator<String> iter = s.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            if ("ccc".equals(str)){
                iter.remove();
            }else{
                System.out.println(str);
            }
        }
        System.out.println(s);



        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("bb");
        l.add("ccc");
        l.add("aaaa");
        ListIterator<String> iter_l = l.listIterator();
        System.out.println("由前向后输出：");
        while (iter_l.hasNext()){
            String str_l = iter_l.next();
            System.out.println(str_l);
        }
        System.out.println("由后向前输出：");
        while(iter_l.hasPrevious()){
            String str_l = iter_l.previous();
            System.out.println(str_l);
        }

        Vector<String> v = new Vector<String>();
        v.add("a");
        v.add("bb");
        v.add("ccc");
        v.add("d");
        Enumeration<String> enu = v.elements();
        while(enu.hasMoreElements()){
            String str = enu.nextElement();
            System.out.println(str);
        }

        List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("bb");
        l1.add("ccc");
        l1.add("d");
        for(String str:l1){
            System.out.println(str);
        }







    }
}
