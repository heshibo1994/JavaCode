package Collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaDemo {
    public static void main(String[] args) {
        Set<String> all = Set.of("bb","cc","aa");
        System.out.println(all);

        Set<String> s1 = new HashSet<String>();
        s1.add("aa");
        s1.add("aa");
        s1.add("cc");
        s1.add("dd");
        System.out.println("HashSet: "+s1);

        Set<String>s2 = new TreeSet<String>();
        s2.add("dd");
        s2.add("cs");
        s2.add("aa");
        System.out.println("TreeSet: "+s2);

        Set<Person> p1 = new TreeSet<Person>();
        p1.add(new Person("a",19));
        p1.add(new Person("a",19));
        p1.add(new Person("b",20));
        p1.add(new Person("c",20));
        p1.add(new Person("d",19));
        System.out.println(p1);

        Set<Person> p2 = new HashSet<Person>();
        p2.add(new Person("a",19));
        p2.add(new Person("a",19));
        p2.add(new Person("b",20));
        p2.add(new Person("c",20));
        p2.add(new Person("d",19));
        System.out.println(p2);
    }

}
