package src.ExceptionAssignment;

public class Program15 {
    public static void main(String[] args) {
       
        try{
            int a[]=new int[-10];
           
        }
        catch(NegativeArraySizeException ne)
        {
            int a[]=new int[2];
           System.out.println("NegativeArraySizeException solved");
        }
    }
    
}
