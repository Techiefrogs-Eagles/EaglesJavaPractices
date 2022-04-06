package Practice.CollectionsPractice;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> cobj = new ConcurrentHashMap<>();
        cobj.put(1, "One");
        cobj.put(2, "Two");
        cobj.put(3, "Three");
        cobj.put(4, "Four");
        cobj.put(5, "Five");

        ConcurrentHashMap<Integer,String> cobj1 = new ConcurrentHashMap<>();
        cobj1.put(1, "One");
        cobj1.put(2, "Two");
        cobj1.put(3, "Three");
        cobj1.put(4, "Four");
        cobj1.put(5, "Five");

        //cobj.clear();

        //cobj.compute(1, (a,b)-> a+" "+b);

        //cobj.computeIfPresent(2, (a,b) -> "kiran");

        //cobj.computeIfAbsent(6, a -> "Havish");

        //System.out.println(cobj.contains("kiran"));

        //System.out.println(cobj.containsKey(2));

        //System.out.println(cobj.containsValue("Three"));

        /*Enumeration<String> e = cobj.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }*/

        //System.out.println(cobj.entrySet());

        //System.out.println(cobj.equals(cobj1));

        //System.out.println(cobj.get(1));

        //System.out.println(cobj.getOrDefault(7, "Hello"));

        //System.out.println(cobj.hashCode());

        /*Enumeration<Integer> e = cobj.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }*/

        //System.out.println(cobj.keySet());

        //System.out.println(cobj.keySet("hello"));

        //System.out.println(cobj.mappingCount());

        //cobj.merge(1, "One", (a,b) -> a+b);

        /*Set<String> cobj2 = ConcurrentHashMap.newKeySet();
        cobj2.add("hello");
        cobj2.add("hai");
        cobj2.add("good");
        System.out.println(cobj2);*/

        /*Set<String> cobj3 = ConcurrentHashMap.newKeySet(100);
        cobj3.add("hello");
        cobj3.add("hai");
        cobj3.add("good");
        System.out.println(cobj3);*/

        //cobj.putAll(cobj3);

        //cobj.putIfAbsent(1, "hi");

        //cobj.remove(1);

        //cobj.remove(1, "One");

        //cobj.replace(1, "changed");

        //cobj.replace(1, "One", "yes");

        //System.out.println(cobj.toString());

        /*for (Map.Entry<Integer,String> k : cobj.entrySet()) {
            System.out.println(k.getKey()+ "  "+k.getValue());
        }*/

        //cobj.forEach((a,b) -> System.out.println(a+" "+b));

        //System.out.println(cobj.values());

        System.out.println(cobj);


    }
}
