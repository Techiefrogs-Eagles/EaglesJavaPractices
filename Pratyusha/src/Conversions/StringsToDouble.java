package Conversions;

public class StringsToDouble 
{
    public static void main(String[] args) 
    {
        String s = "26.24";

        double d = Double.parseDouble(s);  //conversion of  String to double using parsedouble

        System.out.println(d+100);

        
    }
}
