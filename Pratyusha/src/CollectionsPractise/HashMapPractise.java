package CollectionsPractise;

import java.util.HashMap;

public class HashMapPractise 
{
    public class HashMapPractice {
        public static void main(String[] args) 
        {
            HashMap<Integer,String> map = new HashMap<>();
            map.put(1,"Akhil");
            map.put(2, "Sravani");
            map.put(3, "Rohini");
            map.put(4, "Tataji");
            map.put(5, "Priyanka");
            map.put(6, "Sandeep");
    
            //System.out.println(map);
    
            /*HashMap<Integer,String> map1 =(HashMap<Integer,String>)map.clone();
    
            map1.putAll(map);*/
    
            //map.putIfAbsent(7,"Siva");
    
            //map.remove(1);
    
            //map.remove(1,"Akhil");
    
            //System.out.println("hello "+map);
    
            /*map.clear();
            if (map.isEmpty()) {
                System.out.println("Is empty");
            } else {
                System.out.println("Is not empty");
            }*/
    
            //System.out.println(map.keySet());
    
            //System.out.println(map.values());
            
            //System.out.println(map.entrySet());
    
            //System.out.println(map.containsKey(7));
    
            //System.out.println(map.containsValue("Akhil"));
    
            /*map.forEach((t, u) -> System.out.print((t+" "+u+"      ")));
            System.out.println();*/
    
            //System.out.println(map.get(1));
    
            //System.out.println(map.getOrDefault(10, "No key found"));
    
            /*map.merge(7,"Siva", (a,b)->a+b);
    
            System.out.println(map);
    
            map.merge(7," K.Siva", (a,b)->a+b);
    
            System.out.println(map);*/
    
            //map.replace(1, "Akhil", "Danny");
    
            //map.replace(1, "Danny");
    
            //map.replaceAll((a,b)->a+10+"..."+b);
    
            //System.out.println(map.size());
    
            //map.compute(7, (a,b)-> b+".k");
    
            //map.computeIfPresent(7, (a,b)-> b+".k");
    
            //map.computeIfAbsent(7, (a)->"k.siva");
    
            System.out.println(map);
       
        }
    }   
}
