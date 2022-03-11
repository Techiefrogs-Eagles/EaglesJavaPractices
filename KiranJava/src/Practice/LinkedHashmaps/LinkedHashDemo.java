package Practice.LinkedHashmaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lh=new LinkedHashMap<>();
        lh.put(1, "a");
        lh.put(2, "value");
        lh.put(6, "value");
        lh.put(103, "Kim");
        lh.put(104, "Jo");
        lh.put(105, "Sam");
    
        System.out.println(lh.values());
        System.out.println(lh.entrySet());
        for(Map.Entry e: lh.entrySet() ){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
        System.out.println(lh.keySet());
        lh.remove(6);
        System.out.println(lh.containsKey(2));
        System.out.println(lh.containsValue("value"));
        System.out.println(lh.getOrDefault(3, "defaultValue"));
        //System.out.println(lh.removeEl);
        lh.replaceAll((k,v)->v.toUpperCase());
        System.out.println(lh);
    }
}
