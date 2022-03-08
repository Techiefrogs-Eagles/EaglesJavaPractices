package Conversions;

public class StringToFloat 
{
    public static void main(String[] args) 
    {
        String s = "102.5f";

        float f = Float.parseFloat(s); //conversion from String to float using parsefloat

        System.out.println(f+100);
    }
}
