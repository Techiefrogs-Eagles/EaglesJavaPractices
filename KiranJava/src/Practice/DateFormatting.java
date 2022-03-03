package Practice;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {
   public static void main(String[] args) {
    Date d = new Date( );
    SimpleDateFormat ft = 
    new SimpleDateFormat ("E y.MM.dd 'at' hh:mm:ss S a zz D");

    System.out.println("Current Date: " + ft.format(d));
    String str = String.format("Current Date/Time : %tc", d );
    System.out.printf(str);
    try { 
        System.out.println(new Date( ) + "\n"); 
        Thread.sleep(5*60*10); 
        System.out.println(new Date( ) + "\n"); 
     } catch (Exception e) {
        System.out.println("Got an exception!"); 
     }
     System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", d);
   } 
}
