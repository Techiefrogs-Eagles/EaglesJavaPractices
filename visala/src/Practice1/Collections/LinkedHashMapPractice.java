package src.Practice1.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapPractice {
    public static void main(String[] args) {
        Map<Integer,String> M=new LinkedHashMap<>();
         M.put(1, "Ant");
         M.put(2,"Bear");
         M.put(3, "Cat");

         HashMap<Integer,String> H=new HashMap<>();
         H.put(4,"Dog");
         H.put(5,"Elephant");

         M.putAll(H);

         LinkedHashMap<Integer,String> LH=new LinkedHashMap<>();
         LH.putAll(M);

       
        // System.out.println(LH.get(2));

        // LH.clear();

       //System.out.println(LH.containsKey(2));

        //System.out.println(LH.containsValue("Ant"));

        //System.out.println(LH.entrySet());

      //  LH.forEach((a,b)->System.out.println(a+"..... "+b));

      // System.out.println( LH.getOrDefault(1, "Animals"));

      /*  for (Map.Entry M1 : LH.entrySet()) {
            System.out.println(M1.getKey()+"  "+M1.getValue());
        }*/

      //   System.out.println(LH.keySet());

      //  LH.replaceAll((a,b)->a+"....."+b+"Pet");

      // System.out.println(LH.values());

     /*  if(LH.isEmpty())
       {
         System.out.println("Is Empty");
       }
       else
       {
         System.out.println("Not Empty");

       }*/

       /* LinkedHashMap<Integer,String> LH1=(LinkedHashMap<Integer,String>)LH.clone();
          System.out.println(LH1);*/

       //System.out.println(LH.putIfAbsent(6, "Ant"));
     
       // System.out.println(LH.replace(1, "Ant", "Animals"));

       // System.out.println(LH.remove(1));

       //  LH.compute(1, (a,b)->b+"S");

       // LH.computeIfPresent(5, (a,b)-> "big"+b);

       //  LH.computeIfAbsent(6, (a)->"Animals");

       //  System.out.println(LH.merge(4, "Pet",(a,b)->a+b));


         System.out.println(LH.size());
            
         System.out.println(LH);
    }
}
