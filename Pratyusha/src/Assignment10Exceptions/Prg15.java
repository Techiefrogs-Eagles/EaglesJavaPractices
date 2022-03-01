package Assignment10Exceptions;

public class Prg15 
{
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
