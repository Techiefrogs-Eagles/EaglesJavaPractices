package practice.CollectionsPractice;

import java.util.EnumMap;
import java.util.Map;

enum days1 {  
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}

public class EnumMapPractice {
    public static void main(String[] args) {
        EnumMap<days1,Integer> obj = new EnumMap<>(days1.class);
        obj.put(days1.MONDAY, 1);
        obj.put(days1.TUESDAY, 2);
        obj.put(days1.WEDNESDAY, 3);
        obj.put(days1.THURSDAY, 4);
        obj.put(days1.FRIDAY, 5);

        //obj.clear();
        //System.out.println(obj.containsKey(days1.MONDAY));
        //System.out.println(obj.containsValue(1));'
        //System.out.println(obj.entrySet());
        //System.out.println(obj.get(days1.FRIDAY));
        //System.out.println(obj.hashCode());
        //System.out.println(obj.keySet());
        //System.out.println(obj.values());
        //System.out.println(obj.remove(days1.FRIDAY, 5));

        //EnumMap<days1,Integer> obj1 = new EnumMap<>(days1.class);
        //obj1.putAll(obj);

        for (Map.Entry<days1,Integer> M: obj.entrySet()) 
        {
            System.out.print(M.getKey()+"-"+M.getValue()+"  ");
        }

        days1 day = days1.FRIDAY;
        //int  a  =     10;

        switch (day) 
        {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;        
            default:
                System.out.println("Wrong information");
                break;
        }
    }
}
