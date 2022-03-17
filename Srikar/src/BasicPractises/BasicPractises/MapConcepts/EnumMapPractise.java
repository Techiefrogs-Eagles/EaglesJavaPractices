
 import java.util.EnumMap;
import java.util.Map;
public class EnumMapPractise {
    public enum Names {  
       Srikar,Lakshman,Prathusha,Kiran,Vishala
        };  
        
    public static void main(String[] args) {
        EnumMap<Names,Integer> enumm=new EnumMap<>(Names.class);
        enumm.put(Names.Srikar, 1);  
        enumm.put(Names.Kiran, 2);  
        enumm.put(Names.Prathusha, 3); 
        enumm.put(Names.Lakshman, 4); 
        enumm.put(Names.Vishala, 5); 
        for(Map.Entry<Names,Integer> m:enumm.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
           }  
           System.out.println(enumm.isEmpty());
           System.out.println(enum.keySet());

           em.replace(Days.Monday,5);
           System.out.println(em);
           System.out.println(em.values());
           EnumMap<Days,Integer> em1=new EnumMap<>(Days.class);
           em1=em.clone();
           System.out.println(em1.equals(em));
    }
}
}
