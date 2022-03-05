package Conversions;

public class StringToLong 
{
    public static void main(String[] args) 
    {
        String s4 = "7032042643";

        long l = Long.parseLong(s4);

        System.out.println(l+100); // + operator works a add operator in conversion of String to Long

        long l1 = Long.valueOf(s4);

        System.out.println(l1+100); // conversion from string to long using ValueOf 



    }
}
