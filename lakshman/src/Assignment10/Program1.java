package Assignment10;

public class Program1 {
    public static void main(String[] args) 
    {
        int a=21;
        int b=201;
        try
        {
            System.out.println(a+b);
        }
        catch(ArithmeticException Ae)
        {
            System.out.println(Ae);
        }
    }
}
