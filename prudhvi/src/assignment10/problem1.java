package assignment10;

public class problem1 {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        try
        {
            System.out.println(a+b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }

    
}
