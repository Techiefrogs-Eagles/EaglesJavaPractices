package Practice;

import java.util.Date;


public class DateandTime {
    public static void main(String[] args) {
        Date d=new Date();
        d.setTime(234567890);
        System.out.println(d.getTime());
        Date d1=new Date();
        if(d1.after(d)){
            System.out.println("yes");
        }
        else System.out.println("false");
    System.out.println( d.before(d1));
    System.out.println(d.compareTo(d1));
  
    }
}
