package Conversions;

public class LongToString 
{
    public static void main(String[] args) 
    {
        long l3 = 9872587412586L;

        String s1 = String.valueOf(l3); //conversion of Long to String using ValueOf

        System.out.println(s1+200);

        String s2 = Long.toString(l3);

        System.out.println(s2+200);


    }
}
