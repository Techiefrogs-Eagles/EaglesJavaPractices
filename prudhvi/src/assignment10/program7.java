package assignment10;

public class program7 {
    public static void main(String[] args) {
        String s="hello";
        try
        {  
            ArithmeticException ae=new ArithmeticException("Arithmetic Exception");
            ae.initCause(new NumberFormatException("Number Format Exception"));
            throw ae;
        }
        catch(ArithmeticException AE)
        {
            s="10";
            int a = Integer.parseInt(s);
            System.out.println(AE.getCause());
            System.out.println(a);
            System.out.println(AE);
        }
    }
    
}
