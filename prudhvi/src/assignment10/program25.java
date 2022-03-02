package assignment10;

public class program25 {
    public static void main(String[] args) {
        try
        {
            System.out.println(4/0);
        }
        finally
        {
            System.out.println("finally is always executed");
        }
    }
    
}
