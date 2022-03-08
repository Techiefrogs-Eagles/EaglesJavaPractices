package Assignment10Exceptions;

public class Prg15 
{
    public static void main(String[] args) {
       
        try{
            int a[]=new int[-10];
            System.out.println(a);
           
        }
        catch(NegativeArraySizeException ne)
        {
            int a1[]=new int[2];
           System.out.println("NegativeArraySizeException solved");
           System.out.println(a1);
        }

    }
}
