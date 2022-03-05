package assignment10;

public class program15 {
    public static void main(String[] args) {
        
        try
        {
            int a[] = new int[-10];
            a[0] = 20;
        }
        catch(NegativeArraySizeException ne)
        {
           System.out.println("Exeption cleared");
        }
    }
    
}
