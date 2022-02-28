package Assignment10;

public class Program10 
{
    public static void main(String[] args) 
    {
        int a=20;
        int b=0;
        int arr[]={1,2,3,4,5};
        try
        {
            System.out.println(a/b);
            System.out.println(arr[10]);
        }
        catch(ArithmeticException ae)
        {
            b=2;
            System.out.println(a/b);
        }
        catch(NumberFormatException nf)
        {
            System.out.println("Exception cleared");
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        }
    }
}
