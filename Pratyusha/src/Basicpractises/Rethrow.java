package Basicpractises;

public class Rethrow {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
            String inputString = args[0];
            System.out.println("Received:" + inputString);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Array index out of Bounds");
            b=10;
        
            throw new ArrayIndexOutOfBoundsException();

           // System.out.println(a/b);
        }
    }
    
}
