package assignment10;

public class program13 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            b=2;
            System.out.println(a/b);
        }
    }
    
}
