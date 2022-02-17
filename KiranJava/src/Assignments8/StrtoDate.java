package Assignments8;

//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrtoDate {
    public static void main(String[] args) throws Exception {
        //String Date;
        String sDate1="31/12/1998";  
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
        System.out.println(sDate1+"\t"+date1); 
        

   
    }
}
