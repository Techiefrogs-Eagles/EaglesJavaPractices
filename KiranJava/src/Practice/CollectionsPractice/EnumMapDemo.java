package Practice.CollectionsPractice;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public enum Days {  
        Monday, Tuesday, Wednesday, Thursday  
        };  
        enum months {  
            SUNDAY, MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
          } ;
    public static void main(String[] args) {
        EnumMap<Days,Integer> em=new EnumMap<>(Days.class);
        em.put(Days.Monday, 1);  
        em.put(Days.Tuesday, 2);  
        em.put(Days.Wednesday, 3); 
        em.put(Days.Thursday, 4); 
        for(Map.Entry<Days,Integer> m:em.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  
           System.out.println(em.isEmpty());
           System.out.println(em.keySet());
           
           em.replace(Days.Monday,5);
           System.out.println(em);
           System.out.println(em.values());
           EnumMap<Days,Integer> em1=new EnumMap<>(Days.class);
           em1=em.clone();
           System.out.println(em1.equals(em));
    }
}
