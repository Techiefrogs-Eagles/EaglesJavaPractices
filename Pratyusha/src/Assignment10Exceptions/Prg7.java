package Assignment10Exceptions;

public class Prg7 
{
    public static void main(String[] args) {
       
        String s="ABCD";
        
             try
             {
          
        ArithmeticException AE=new ArithmeticException("Exception");
        AE.initCause(new NumberFormatException("Hello All"));
        throw AE;

        }
        catch(ArithmeticException Ae)
        {
            s="1234";
            int  a=Integer.parseInt(s);
          System.out.println(Ae.getCause());
            System.out.println(a);
            System.out.println(Ae);
        }
    }
}
