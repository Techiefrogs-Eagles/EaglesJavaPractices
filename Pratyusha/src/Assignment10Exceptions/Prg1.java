package Assignment10Exceptions;

public class Prg1 
{
    public static void main(String[] args) {
        int a=100;
        int b=500;
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
