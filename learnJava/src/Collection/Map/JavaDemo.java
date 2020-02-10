package Collection.Map;

import testWrapper.Int;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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



    }
}
