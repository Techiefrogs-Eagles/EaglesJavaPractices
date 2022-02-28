package Assignment10;

public class Program7 
{
    public static void main(String[] args) 
    {   
        String s="AB";
        try
        {  
            ArithmeticException AE=new ArithmeticException("Arithmetic Exception");
            AE.initCause(new NumberFormatException("Number Format Exception"));
            throw AE;
        }
        catch(ArithmeticException Ae)
        {
            s="100";
            int a = Integer.parseInt(s);
            System.out.println(Ae.getCause());
            System.out.println(a);
            System.out.println(Ae);
        }
    }
}
