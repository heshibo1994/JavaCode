package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class JavaDemo {
    public static void main(String[] args) {
        List<String> all = List.of("a", "bb", "ccc", "keran");
        System.out.println(all);
        Object result[] = all.toArray();
        for (Object temp:result){
            System.out.println(temp);
        }

        List<String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("a");
        l1.add("aad");
        System.out.println(l1);
        l1.forEach((str)->{
            System.out.print(str+"-");
                });
        System.out.println("集合为空： "+l1.isEmpty()+"集合个数："+l1.size());

        List<Person> p = new ArrayList<Person>();
        p.add(new Person("aa",23));
        p.add(new Person("bb",34));
        p.add(new Person("cc",22));
        p.remove(new Person("aa",23));
        p.contains(new Person("aa",23));

        p.forEach((person)->{
            System.out.println(person);
        });
    }
}
