package Assignment10;

public class program23 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 0;
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException s)
        {
            b = 2;
            System.out.println(a/b);
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}
