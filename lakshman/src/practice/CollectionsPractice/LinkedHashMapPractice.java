package practice.CollectionsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice 
{
    public static void main(String[] args) 
    {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Akhil");
        map.put(2, "Sravani");
        map.put(3,"Rohini");

        LinkedHashMap<Integer,String> map1 = new LinkedHashMap<>();
        map1.put(4,"Tataji");
        map1.put(5,"Priyanka");

        map.putAll(map1);

        // m1.clear();
        System.out.println(map.containsKey(10));
        // System.out.println(m1.containsValue("Akhil"));

        // System.out.println("Entry set is:"+" "+m1.entrySet());
        // System.out.println("Key set is:"+"  "+m1.keySet());

        // m1.forEach((a,b) ->System.out.println(a+"...."+b));
        // System.out.println(m1.getOrDefault(7,"Siva"));

        System.out.println("Key set is :"+" "+map.keySet());

        for(Map.Entry<Integer,String> m : map.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }
        //System.out.println(m1);

    }   
}

class limit{
    private static final int limit = 5;

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> nobj = new LinkedHashMap<>(){
            protected boolean removeEldestEntry(Map.Entry<Integer,String> n){
                return size()>limit;
            }
        };

        nobj.put(1, "one");
        nobj.put(2, "two");
        nobj.put(3, "three");
        nobj.put(4, "four");
        nobj.put(5, "five");
        nobj.put(6, "six");
        nobj.put(7, "seven");

        System.out.println(nobj);
    }
}
