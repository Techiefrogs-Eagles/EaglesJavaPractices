package CollectionsPractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo 
{
  public static void main(String[] args) 
  {
    Map<Integer,String> m1 = new LinkedHashMap<>();
    m1.put(10,"Ten");
    m1.put(20, "Twenty");
    m1.put(30,"Thirty");

    LinkedHashMap<Integer,String> m2 = new LinkedHashMap<>();
    m2.put(40,"Fourty");
    m2.put(50,"Fifty");

    m1.putAll(m2);

   // m1.clear();
     System.out.println(m1.containsKey(10));
   // System.out.println(m1.containsValue("ten"));

   // System.out.println("Entry set is:"+" "+m1.entrySet());
   // System.out.println("Key set is:"+"  "+m1.keySet());

   // m1.forEach((a,b) ->System.out.println(a+"...."+b));
   // System.out.println(m1.getOrDefault(70,"hund"));

    System.out.println("Key set is :"+" "+m1.keySet());

    for(Map.Entry<Integer,String> m : m1.entrySet())
    {
          System.out.println(m.getKey()+"  "+m.getValue());
    }
      //System.out.println(m1);
    
  }   
}
  /* class LinkedHashMapRemoveEldest 
   {
     private static final int Max_Entries = 6;
     public static void main(String[] args) 
     {
       LinkedHashMap<Integer,String> lin = new LinkedHashMap<Integer,String>()
       {
        
        protected boolean removeEldestEntry(Map.Entry entry)
         {
           return size () > Max_Entries;
         }
       };
           lin.put(1, "One");
           lin.put(2, "Two");
           lin.put(3, "Three");
           lin.put(4, "Four");
           lin.put(5 , "Five");
           lin.put(6 , "Six");

           lin.put(7 , "Seven");
           lin.put(8 , "Eight");
           lin.put(9 , "Nine");

           System.out.println("Map" + lin);
     }
   }*/