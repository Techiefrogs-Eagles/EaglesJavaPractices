package assignment10;

public class problem3 {
    public static void main(String[] args) {
        String s="hello";
        try
        { 
            ArithmeticException AE=new ArithmeticException("Exception");
            AE.initCause(new NumberFormatException("Hello"));
            throw AE;
        }
        catch(ArithmeticException Ae)
        {
            s="100";
            int  a=Integer.parseInt(s);
            System.out.println(Ae.getCause());
            System.out.println(a);
        }

    }
    
}
