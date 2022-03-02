package Conversions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate 
{
    public static void main(String[] args) throws Exception
    {
          String s = "01/01/2022";

          Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(s);

          System.out.println(s+"\t"+date1);

        
        
      
    }
}
