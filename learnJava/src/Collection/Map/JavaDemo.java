package Collection.Map;

import testWrapper.Int;

import java.util.*;

public class JavaDemo {
    public static void main(String[] args) {
        Map<String,Integer> m = Map.of("a",1,"b",2);
        System.out.println(m);

        Map<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("a",1);
        hm.put("b",2);
        hm.put("a",3);//key重复
        hm.put(null,3);//key不存在
        hm.put("c",null);//value不存在
        System.out.println(hm.get("a"));
        System.out.println(hm.get(null));
        System.out.println(hm.get("c"));

        Map<String ,Integer> lm = new LinkedHashMap<String,Integer>();
        lm.put("a",1);
        lm.put("c",3);
        lm.put("null",0);
        lm.put("b",2);
        System.out.println(lm);

        Map<String ,Integer> htm = new Hashtable<String,Integer>();
        htm.put("a",1);
        htm.put("c",3);
        htm.put("b",2);
        System.out.println(htm);

        Map.Entry<String ,Integer> me = Map.entry("one",1);
        System.out.println(me.getKey());
        System.out.println(me.getValue());


        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iter = set.iterator();
        while(iter.hasNext()){
            Map.Entry<String ,Integer> meitor = iter.next();
            System.out.print(meitor.getKey()+"---");
            System.out.println(meitor.getValue());
        }

        Map<Person,String> pmap = new HashMap<Person,String>();
        pmap.put(new Person("a",20),"one");
        pmap.put(new Person("b",28),"one");
        pmap.put(new Person("c",29),"one");
        System.out.println(pmap.get(new Person("a",20)));

    }
}
