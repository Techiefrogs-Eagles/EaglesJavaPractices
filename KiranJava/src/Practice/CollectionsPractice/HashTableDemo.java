package Practice.CollectionsPractice;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo extends Hashtable{
    public void rehash(){

    }
    public static void main(String[] args) {
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
        hm.put(100,"Amit");  
        hm.put(102,"Ravi");  
        hm.put(101,"Vijay");  
        hm.put(103,"Rahul"); 
        /*hm.remove(102);
        hm.remove(1, "value");
        hm.put(1, "value");
        hm.put(2, "value1");*/

        System.out.println(hm);
        for(Map.Entry<Integer,String> m:hm.entrySet()){  
         System.out.println(m.getKey()+" "+m.getValue());  
        }  
        //System.out.println(hm.getOrDefault(104, "default"));
      //  hm.putIfAbsent(104,"Gaurav");  
    // System.out.println("Updated Map: "+hm); 
        String s=hm.toString();
        //System.out.println(s);
        Hashtable<Integer,String> ht=new Hashtable<>(hm);
       // System.out.println(ht);
        //System.out.println(ht.equals(hm));
       // System.out.println(ht.contains(hm));//prints false
        Enumeration<String> en=hm.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        System.out.println(ht.hashCode());
        
    }
}
