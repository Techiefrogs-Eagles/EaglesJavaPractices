package Assignment10;

public class Program15 {
    public static void main(String[] args) {
        try{
            int a[]=new int[-10];
            System.out.println(a);

        }
        catch(NegativeArraySizeException ne)
        {
            int a[]=new int[2];
           System.out.println("NegativeArraySizeException");
        }
    }

    
}
