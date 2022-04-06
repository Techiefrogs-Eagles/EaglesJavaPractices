package CollectionsPractise;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {  
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
  }

public class EnumSetPractise 
{
    enum months
    {
          Jan,Feb,March,April;
    }
    public static void main(String[] args) {
        Set<days> obj = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
        Iterator<days> itr = obj.iterator();  
        while (itr.hasNext()) 
        { 
            System.out.println(itr.next());    
        }
        Set<days> obj2 = EnumSet.allOf(days.class);
        System.out.println(obj2);
        Set<days> obj3 = EnumSet.noneOf(days.class);
        System.out.println(obj3);
        Set<months> obj4 = EnumSet.allOf(months.class);
        
        for (months months : obj4) 
        {
            System.out.println(months);
        }
    }
}

