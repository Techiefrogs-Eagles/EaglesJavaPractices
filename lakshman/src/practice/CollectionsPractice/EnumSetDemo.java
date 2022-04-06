package practice.CollectionsPractice;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {  
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
  }

public class EnumSetDemo {
    enum months
    {
        jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec
    }
    public static void main(String[] args) {
        ArrayList<days> arr = new ArrayList<>();
        arr.add(days.FRIDAY);

        EnumSet<days> obj = EnumSet.of(days.SUNDAY);
        obj = EnumSet.range(days.MONDAY, days.SATURDAY);
        Iterator<days> itr = obj.iterator();  
        while (itr.hasNext()) 
        { 
            System.out.println(itr.next());    
        }
        Set<days> obj2 = EnumSet.allOf(days.class);
        System.out.println(obj2);
        Set<days> obj3 = EnumSet.noneOf(days.class);
        System.out.println(obj3);
        Set<days> obj4 = EnumSet.copyOf(arr);
        System.out.println(obj4);

        Set<days> obj5 = obj.clone();
        
        for (days day : obj5) 
        {
            System.out.println(day);
        }
    }
}
