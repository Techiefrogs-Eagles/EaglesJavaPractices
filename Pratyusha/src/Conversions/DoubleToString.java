package Conversions;

public class DoubleToString 
{
    public static void main(String[] args) 
    {
        double d = 123.47;

        String s = String.valueOf(d);  // conversion of double to String using ValueOf

        System.out.println(s);

        String s2 = Double.toString(d);

        System.out.println(s2+100);  //conversion of double to string using toString
    }
}
