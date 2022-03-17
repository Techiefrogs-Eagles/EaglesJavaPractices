

import java.util.EnumSet;
    import java.util.Iterator;
    import java.util.Set;
    
    public class EnumSetDemo {
        public static void main(String[] args) {
            
              enum months {  
                January,Feb,March,April,May,June,Jule,August,September,October,November,December
              } 

            EnumSet<months> set=EnumSet.allOf(months.class);
            Iterator itr=set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            Set<months> set1=EnumSet.noneOf(months.class);


            //Set<months> set2=EnumSet.copyOf(set1);


            //Set<months> set3=EnumSet.complementOf((EnumSet<months>) set1);


           // Set<months> set4=EnumSet.of(months.August,months.November);


            Set<months> set5=EnumSet.range(months.January, months.December);


           // EnumSet<months> set6=set.clone();
        }
    }
    