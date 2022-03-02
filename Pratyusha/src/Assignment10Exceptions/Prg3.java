package Assignment10Exceptions;

public class Prg3 
{
    public static void main(String[] args) 
    {   
        String str="Hello Team";
             try
             {
          
                ArithmeticException AE=new ArithmeticException("Exception");
                AE.initCause(new NumberFormatException("Welcome"));
               throw AE;

            }
          catch(ArithmeticException Ae)
        {
            str="123";
            int  a=Integer.parseInt(str);
          System.out.println(Ae.getCause());
            System.out.println(a);
            
        }
}
}
