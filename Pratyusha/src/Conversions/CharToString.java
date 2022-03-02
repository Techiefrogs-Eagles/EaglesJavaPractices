package Conversions;

public class CharToString
 {
    public static void main(String[] args) 
    {
        char c = 'H';

        String s = String.valueOf(c);

        System.out.println("String is :" + s + 100);  //Conversion of char to string using valueOf

        String s2 = Character.toString(c);

        System.out.println(s2+100);      ////Conversion of char to string using toString
    }
}
