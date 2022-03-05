package src.Practice1.TypeCasting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat1 {
    public static void main(String[] args) 
    {
        Date d1 = new Date();

        SimpleDateFormat s1 = new SimpleDateFormat("E dd-MM-yyyy hh:mm:ss:S a z");

        System.out.println("current Date is : " + s1.format(d1));
        
    }
}

    

