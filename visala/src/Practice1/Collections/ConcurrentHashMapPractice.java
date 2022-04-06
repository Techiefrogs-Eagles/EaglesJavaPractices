package src.Practice1.Collections;

<<<<<<< HEAD
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
=======
import java.util.Enumeration;

>>>>>>> 2e407b985a3b11cdcbb931f9423b919672ca7363
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice {
    public static void main(String[] args) {
<<<<<<< HEAD
        ConcurrentHashMap<Integer, String> CHM = new ConcurrentHashMap<>();
        CHM.put(1, "One");
        CHM.put(2, "Two");
        CHM.put(3, "Three");
        CHM.put(4, "Four");
        CHM.put(5, "Five");

        ConcurrentHashMap<Integer, String> CHM1 = new ConcurrentHashMap<>();
        CHM1.put(1, "One");
        CHM1.put(2, "Two");
        CHM1.put(3, "Three");
        CHM1.put(4, "Four");
        CHM1.put(5, "Five");

        // CHM.clear();

        // CHM.compute(1, (a,b)-> a+" "+b);

        // CHM.computeIfPresent(4, (a,b) -> "Number");

        // CHM.computeIfAbsent(6, a -> "Numbers");

        // System.out.println(CHM.contains("Number"));

        // System.out.println(CHM.containsKey(4));

        // System.out.println(CHM.containsValue("Five"));

        /*
         * Enumeration<String> E = CHM.elements();
         * while (E.hasMoreElements()) {
         * System.out.println(E.nextElement());
         * }
         */

        // System.out.println(CHM.entrySet());

        // System.out.println(CHM.equals(CHM1));

        // System.out.println(CHM.get(3));

        // System.out.println(CHM.getOrDefault(6, "Number"));

        // System.out.println(CHM.hashCode());

        /*
         * Enumeration<Integer> E = CHM.keys();
         * while (E.hasMoreElements()) {
         * System.out.println(E.nextElement());
         * }
         */

        // System.out.println(CHM.keySet());

        // System.out.println(CHM.keySet("Number"));

        // System.out.println(CHM.mappingCount());

        // CHM.merge(4, "Four", (a,b) -> a+b);

        /*
         * Set<String> CHM2 = ConcurrentHashMap.newKeySet();
         * CHM2.add("hello");
         * CHM2.add("hai");
         * CHM2.add("good");
         * System.out.println(CHM2);
         */

        /*
         * Set<String> CHM3 = ConcurrentHashMap.newKeySet(100);
         * CHM3.add("hello");
         * CHM3.add("hai");
         * CHM3.add("good");
         * System.out.println(CHM3);
         */

        // CHM.putAll(CHM3);

        // CHM.putIfAbsent(1, "hi");

        // CHM.remove(1);

        // CHM.remove(1, "One");

        // CHM.replace(1, "Numbers");

        // CHM.replace(1, "One", "Numbers");

        // System.out.println(CHM.toString());

        /*
         * for (Map.Entry<Integer,String> k : CHM.entrySet()) {
         * System.out.println(k.getKey()+ "  "+k.getValue());
         * }
         */

        // CHM.forEach((a,b) -> System.out.println(a+" "+b));

        // System.out.println(CHM.values());

        System.out.println(CHM);

    }
}
=======
        ConcurrentHashMap<Integer,String> CHM=new ConcurrentHashMap<>();
        CHM.put(15, "Apple");
        CHM.put(48,"WaterMillon");
        CHM.put(54,"Mango");
        CHM.put(76,"Bannana");


     // CHM.clear();
        
     //  CHM.compute(98, (a,b)->"Fruit");

     //System.out.println(CHM.computeIfAbsent(83,(a)->"JackFruit"));
     

     // CHM.computeIfPresent(15, (a,b)->"Fruit");

     //  System.out.println(CHM.contains("Apple"));


     // System.out.println(CHM.containsKey(48));

     //  System.out.println(CHM.containsValue("Mango"));


     /* Enumeration Enum=CHM.elements();
       while(Enum.hasMoreElements())
       {
          System.out.println(Enum.nextElement());
       }*/

     //  System.out.println(CHM.entrySet());

     /*  ConcurrentHashMap<Integer,String> CHM1=new ConcurrentHashMap<>();
        CHM1.put(15, "Apple");
        CHM1.put(48,"WaterMillon");
        CHM1.put(54,"Mango");
        CHM1.put(76,"Bannana");

       System.out.println(CHM.equals(CHM1));*/


     //  System.out.println(CHM.get(15));


     //   System.out.println(CHM.getOrDefault(15, "Fruits"));


     //   System.out.println(CHM.hashCode());



     /*   Enumeration Enum=CHM.keys();
         while(Enum.hasMoreElements())
        {
          System.out.println(Enum.nextElement());
        }*/
         
     //   System.out.println(CHM.keySet());
    
     //  System.out.println(CHM.keySet("Bannana"));


     //   System.out.println(CHM.mappingCount());


     //    System.out.println( CHM.merge(15, "Stroburry", (a,b)->b+"Fruits"));

     /*  Set<String> S=ConcurrentHashMap.newKeySet();
       S.add("A");
       S.add("B");
       S.add("C");
       System.out.println(S);*/


     /*  Set<String> S=ConcurrentHashMap.newKeySet(10);
       S.add("A");
       S.add("B");
       S.add("C");
       System.out.println(S);*/


     /*  ConcurrentHashMap<Integer,String> CHM1=new ConcurrentHashMap<>();

       CHM1.putAll(CHM);

       System.out.println(CHM1);*/


     //  System.out.println(CHM.putIfAbsent(20, "Fruits"));


     //    CHM.remove(15);


     //  CHM.replace(15, "Apple", "Fruits");


     
     /*   String S=CHM.toString();
          System.out.println(S);*/


     //    CHM.forEach((a,b)->System.out.println(a+" "+b));

     //   System.out.println(CHM.values());


       System.out.println(CHM);
  }
}
>>>>>>> 2e407b985a3b11cdcbb931f9423b919672ca7363
