package Practice.CollectionsPractice;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<days> set=EnumSet.allOf(days.class);
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Set<months> set1=EnumSet.noneOf(months.class);
        Set<months> set2=EnumSet.copyOf(set1);
        Set<months> set3=EnumSet.complementOf((EnumSet<months>) set1);
        Set<months> set4=EnumSet.of(months.FRIDAY,months.MONDAY);
        Set<months> set5=EnumSet.range(months.MONDAY, months.THURSDAY);
        EnumSet<days> set6=set.clone();
    }
}
enum days {  
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
  } 
  enum months {  
    SUNDAY, MONDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
  } 
