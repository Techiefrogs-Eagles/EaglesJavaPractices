package src.Practice1.Collections;

import java.util.EnumMap;
import java.util.Map;

enum days1 {  
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}

public class EnumMapPractice {
    public static void main(String[] args) {
        EnumMap<days1,Integer> EM = new EnumMap<>(days1.class);
        EM.put(days1.MONDAY, 1);
        EM.put(days1.TUESDAY, 2);
        EM.put(days1.WEDNESDAY, 3);
        EM.put(days1.THURSDAY, 4);
        EM.put(days1.FRIDAY, 5);

        //EM.clear();
        //System.out.println(EM.containsKey(days1.MONDAY));
        //System.out.println(EM.containsValue(1));
        //System.out.println(EM.entrySet());
        //System.out.println(EM.get(days1.FRIDAY));
        //System.out.println(EM.hashCode());
        //System.out.println(EM.keySet());
        //System.out.println(EM.values());
        //System.out.println(EM.remove(days1.FRIDAY, 5));

        //EnumMap<days1,Integer> EM1 = new EnumMap<>(days1.class);
        //obj1.putAll(EM);

        for (Map.Entry<days1,Integer> M: EM.entrySet()) {
            System.out.print(M.getKey()+"-"+M.getValue()+"  ");
        }

        days1 day = days1.FRIDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Monday");
                break;
            case FRIDAY:
                System.out.println("Monday");
                break;
        
            default:
                System.out.println("Wrong information");
                break;
        }
    }
}
