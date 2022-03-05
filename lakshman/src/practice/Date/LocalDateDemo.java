package practice.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class LocalDateDemo 
{
    public static void main(String[] args) 
    {
        LocalDate date = LocalDate.now();  // LocalDate of present
        System.out.println(date);

        LocalDate d1 = date.minusDays(1);
        System.out.println("The Days after Minus  Are : " + d1);  // Local date after minus the number of days

        LocalDate d2 = date.plusDays(2);
        System.out.println("The days after adding are : " + d2);  //Local date od after Adding the days

        LocalDateTime d3 = LocalDateTime.of(2020, 10, 25, 5, 10, 30);  //Date and time in a partiular period of time
        System.out.println("The Local Date ANd time of 2020 is : "+ d3);

        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());
        System.out.println(date1.toString());
        System.out.println(date1.clone());

        if(d2.isAfter(date))       // date after the given date is taken as a boolen value
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        if(date.isBefore(d2))       // date before the given date is also taken as boolen value
        {
           System.out.println("Yes");
        }
        else
        {
           System.out.println("No");
        }
        LocalDate d4 = LocalDate.now();

        if(d2.equals(d4))  // comparing dates using equals method
        {
           System.out.println("yes");
        }
        else
        {
           System.out.println("No");
        }

        System.out.println(date1.hashCode()); // date compariso using hascode

        date1.setTime(1000);  // set time also gives the milliseconds    
    }   
}

class SimpleDateFormatDemo
{
    public static void main(String[] args) 
    {
        Date d1 = new Date();

        SimpleDateFormat s1 = new SimpleDateFormat("E dd-MM-yyyy hh:mm:ss:S a z");

        System.out.println("current Date is : " + s1.format(d1));
        
    }
}
