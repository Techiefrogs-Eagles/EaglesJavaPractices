package src.Practice1.TypeCasting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateFormate {
    public static void main(String[] args) { 
              
        LocalDate L=LocalDate.now();
        System.out.println(L);
        LocalDate yesteeDate=L.minusDays(2);
        System.out.println(yesteeDate);
        LocalDate tomarrDate=L.plusDays(5);
        System.out.println(tomarrDate);


        System.out.println();


        LocalDateTime l1=LocalDateTime.of(1990, 05, 10, 2, 10);
        System.out.println(l1);

        Date d=new Date(2024);
        Date d1=new Date(2022);
        int comparison=d.compareTo(d1);
        System.out.println("Your comparison value is : "+comparison);

        LocalTime Lt=LocalTime.now();
        System.out.println(Lt);

        //LocalTime Lt1=LocalTime.of();
       // System.out.println(Lt1);




   }
    
}
