package Conversions;

public class FloattoString 
{
    public static void main(String[] args) 
    {
        float  f2 = 125.35f;

        String s = String.valueOf(f2); // conversion of float to string  using ValueOf

        System.out.println(s+200);

        String s1 = Float.toString(f2);

        System.out.println(s1+100);
    }
}
