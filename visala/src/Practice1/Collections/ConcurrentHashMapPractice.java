package src.Practice1.Collections;

import java.util.Enumeration;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice {
    public static void main(String[] args) {
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
