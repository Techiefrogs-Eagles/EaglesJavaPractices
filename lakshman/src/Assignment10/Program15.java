package Assignment10;
 
public class Program15 
{
    public static void main(String[] args) 
    {
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