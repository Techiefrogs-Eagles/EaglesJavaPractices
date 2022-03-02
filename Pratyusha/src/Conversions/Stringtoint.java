package Conversions;

public class Stringtoint 
{
    public static void main(String[] args) 
    {
        String s = "200";

        int i = Integer.parseInt(s); //Conversion from string to int.

        System.out.println(i);

        System.out.println(s+100); //concatination of string and 100.

        System.out.println(i+100); // here + is a binary operation and adds the two integers

        Integer i1 = Integer.valueOf(s);

        System.out.println(i1+100); //conversion of string to Integer using ValueOfString

        //String s1 = "Hello";

        //int i2 = Integer.parseInt(s1);
        
      //  System.out.println(i2);   //NumberFormatException to convert from String to INteger

        
    }


}
