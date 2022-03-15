package src.Practice1.Collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
         TreeMap<Integer,String> TM=new TreeMap<>();
         TM.put(1,"Apple");
         TM.put(2,"Banana");
         TM.put(3,"CusterdApple");
         TM.put(4,"DragonFruit");
      
        //System.out.println(TM.ceilingEntry(3));

        // System.out.println(TM.ceilingKey(4));

        // TM.clear();
         
        /*TreeMap<Integer,String> TM1=(TreeMap<Integer,String>)TM.clone();
          System.out.println(TM1);*/

        //  System.out.println(TM.navigableKeySet());

        //System.out.println(TM.descendingKeySet());

        // System.out.println(TM.descendingMap());

        // System.out.println(TM.firstEntry());
         
        //   System.out.println(TM.lastEntry());

        // System.out.println(TM.floorEntry(4));

        // System.out.println(TM.floorKey(3));

        // TM.forEach((a,b)->System.out.println(a+"...."+b));

        /* for(Map.Entry<Integer,String> M:TM.entrySet())
          System.out.println(M.getKey()+"   "+M.getValue());*/

        //  System.out.println(TM.headMap(3));   //Print lesthan values

        //  System.out.println(TM.headMap(4, false));

        // System.out.println(TM.higherEntry(2));   //Print the gatest value in given key

        // System.out.println(TM.higherKey(3));        //Print the greatest key in given key

        //  System.out.println(TM.keySet());

        //  System.out.println(TM.lastEntry());
 
        //System.out.println(TM.lastKey());

        // System.out.println(TM.lowerEntry(2));

        //  System.out.println(TM.lowerKey(3));


        //  System.out.println(TM.pollFirstEntry());

        //System.out.println(TM.pollLastEntry());
       

        /* TreeMap<Integer,String> TM2=new TreeMap<>();
           TM2.putAll(TM);
           System.out.println(TM2);*/

        //  TM.replace(1, "Apple", "Fruits");


        // TM.replaceAll((a,b)->a+"...."+b);

        // System.out.println(TM.subMap(1, 3));

        // System.out.println(TM.subMap(2, false, 4, true));

        // System.out.println(TM.tailMap(3));  //print greaterthan are equal


        // System.out.println(TM.tailMap(2, true));


        // System.out.println(TM.containsKey(2));

        // System.out.println(TM.containsValue("Apple"));


        // System.out.println(TM.firstKey());

        // System.out.println(TM.get(4));

        //System.out.println(TM.size());


        // TM.remove(2);


        //System.out.println(TM.values());
     

         System.out.println(TM);
        
        }
}
