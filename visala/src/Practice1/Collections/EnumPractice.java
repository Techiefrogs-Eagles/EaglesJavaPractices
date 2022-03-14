package src.Practice1.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;


public class EnumPractice {

    enum days {  
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
      }
    
    enum months{
       Jan,Feb,Mar,Api,May,Jun,Jul,Aug,Sec,Oct,Nov,Dec
    }
    public static void main(String[] args) {
        EnumSet<days> EM = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
        Iterator<days> itr = EM.iterator();  
        while (itr.hasNext()) 
        { 
            System.out.println(itr.next());    
        }
        Set<days> EM1 = EnumSet.allOf(days.class);
        System.out.println(EM1);
        Set<days> EM2 = EnumSet.noneOf(days.class);
        System.out.println(EM2);
       EnumSet<months> EM3 = EnumSet.allOf(months.class);
        EnumSet<months> EM6 = EM3.clone();
        System.out.println(EM6);
        
        for (months months : EM3) 
        {
            System.out.println(months);
        }
        Set<days> EM4 = EnumSet.range(days.SUNDAY,days.SATURDAY);
        System.out.println(EM4);

        Set<days>EM5=EnumSet.copyOf(EM);
        System.out.println(EM5); 

     


         
    }
}
