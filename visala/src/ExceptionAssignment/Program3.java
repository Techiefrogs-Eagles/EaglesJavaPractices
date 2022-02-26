package src.ExceptionAssignment;

public class Program3 {
    public static void main(String[] args) {
        
        String s="AB";
        
             try{
          
        ArithmeticException AE=new ArithmeticException("Exception");
        AE.initCause(new NumberFormatException("Hello"));
        throw AE;

        }catch(ArithmeticException Ae)
        {
            s="123";
            int  a=Integer.parseInt(s);
          System.out.println(Ae.getCause());
            System.out.println(a);
            
        }
    
    }
    
}
