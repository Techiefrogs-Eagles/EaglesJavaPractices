package src.Practice1.Exceptionpractice;

public class Rethrow {
    public static void main(String[] args) {
        try{
            int i=10;
            {
                if(i%2==0)
                {
                  System.out.println("even number");
                  ArithmeticException Ae=new ArithmeticException("Hello");
                  throw Ae;
                }
                else{
                    System.out.println("odd number");
                }
        
            }
        }catch(ArithmeticException Ae)
        {
            throw Ae;
        }
    }
    
}
