package Conversions;

public class IntegertoString 
{
    public static void main(String[] args) 
    {
        int i3 = 10;

        String s2 = String.valueOf(i3);  //conversion of integer to String using ValueOf

        System.out.println(s2+100);

        String s3 = Integer.toString(i3); // conversion using toString Method

        System.out.println(s3+100);

        String s4 = String.format("%d",i3); // conversion of integer to String.format method

        System.out.println(s4);
        
    }
}
