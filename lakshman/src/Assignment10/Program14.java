package Assignment10;

public class Program14 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5};
        try
        {
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException Ae)
        {
            System.out.println(a[3]);
        }
    }
}
