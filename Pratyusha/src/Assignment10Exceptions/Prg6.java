package Assignment10Exceptions;

public class Prg6 
{
    public static void main(String[] args) 
    {
        int a=10;
        int b=0;
        try
        {
            System.out.println("In Try ");
            try
            {
                System.out.println("In nested try Method");
                System.out.println(a/b);
            }
            catch(Exception p)
            {
                b=2;
                System.out.println(a/b);
                System.out.println("In inner catch Method");
            }
        }
        catch(Exception e)
        {
            System.out.println("In catch Method");
        }
    }
}
