package practice.CollectionsPractice;

//import java.util.Enumeration;
import java.util.Hashtable;
//import java.util.Map;

public class HashTablePractice {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<>();
        map.put(1, "Akhil");
        map.put(2, "Sravani");
        map.put(3, "Rohini");
        map.put(4, "Tataji");
        map.put(5, "Priyanka");
        map.put(6, "Sandeep");

        /*HashTable<Integer,String> map1 = (HashTable<Integer,String>)map.clone();
        System.out.println(map1);*/

        //map.clear();
        //System.out.println(map.compute(3, (a,b)->"."+b));
        //System.out.println(map.computeIfPresent(3, (a,b)->"."+b));
        //System.out.println(map.computeIfAbsent(3, a -> "."));
        //System.out.println(map.elements());
        //System.out.println(map.entrySet());
        /*for (Map.Entry<Integer,String> h : map.entrySet()) {
            System.out.println(h.getKey()+"  "+h.getValue());
        }*/
        //System.out.println(map.getOrDefault(2, "Default"));
        //System.out.println(map.hashCode());
        //System.out.println(map.keys());
        //System.out.println(map.keySet());
        //System.out.println(map.merge(1 , "akhil" , (a,b)->a+b));
        //map.putAll(map1);
        


         System.out.println(map.putIfAbsent(5,"hari" ));

       //map.remove(1);

       //map.replace(1, "Akhil", "akhil");

      // map.replace(1, "akhil");
       
     // map.replaceAll((a,b)->"...."+b);

        
       /*  String str=map.toString();
          System.out.println(str);*/

       //System.out.println(map.values());

      // System.out.println(map.contains("Akhil"));


     //  System.out.println(map.containsValue("Akhil"));



     //  System.out.println(map.containsKey(1));

     /*if(map.isEmpty())
       {
         System.out.println("Empty");
       }
      else{
         System.out.println("Not Empty");
      }*/
        
     // System.out.println(map.get(1));

     //HT.remove(2);

       System.out.println(map.size());
         

       System.out.println(map);
    }
}
