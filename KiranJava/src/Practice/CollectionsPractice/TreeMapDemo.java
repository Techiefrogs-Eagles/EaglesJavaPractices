package Practice.CollectionsPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(104, "firstent");
        tm.put(1, "value");
        tm.put(100,"Amit");    
        tm.put(102,"Ravi");    
        tm.put(101,"Vijay");    
        tm.put(103,"Rahul");  
        for(Map.Entry<Integer,String> m:tm.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           } 
        //System.out.println(tm.descendingMap()); 
          //Returns key-value pairs whose keys are less than or equal to the specified key.  
     /* System.out.println("headMap: "+tm.headMap(102,true));  
      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
      System.out.println("tailMap: "+tm.tailMap(102,true));  
      //Returns key-value pairs exists in between the specified key.  
      System.out.println("subMap: "+tm.subMap(100, false, 102, true)); */
     System.out.println();
     
     /* System.out.println( tm.ceilingEntry(104));  
     System.out.println(tm.ceilingKey(104));  
     System.out.println(tm.descendingKeySet());
     tm.clear();*/
    // System.out.println(tm.firstEntry());
     //System.out.println(tm.firstKey());
    //System.out.println(tm.lastEntry());
    //System.out.println(tm.floorEntry(104));
    //System.out.println(tm.floorKey(12));
    //tm.forEach((a,b)->System.out.println(a+"  "+b));
    // System.out.println(tm.higherEntry(103));
        //System.out.println(tm.higherKey(3));
       // System.err.println(tm.lowerEntry(102));
        //System.out.println(tm.lowerKey(3));
        //System.out.println(tm.keySet());  
        //System.out.println(tm.navigableKeySet());
        //System.out.println(tm.pollFirstEntry());
        //System.out.println(tm.pollLastEntry()); 
        TreeMap<Integer,String> tm1=new TreeMap<>(); 
        tm1.putAll(tm);
        tm1.put(10, "value1");
        tm1.replace(10, "new");
       /* System.out.println(tm1);
        tm1.replaceAll((a,b)->a+"..."+b);
        System.out.println(tm1);*/
     // System.out.println(  tm1.subMap(2, 101));
      //  System.out.println(tm.containsKey(5));
        System.out.println(tm.containsValue("value"));
        tm.remove(1);
       System.out.println( tm.values());
       System.out.println(tm.size());

    }
}
