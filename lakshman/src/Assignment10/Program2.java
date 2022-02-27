package Assignment10;

public class Program2 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 5;
        int arr[] = {1,2,3,4,5};
        try
        {  
            System.out.println(a/b);
            System.out.println(arr[10]);
        }
        catch(ArithmeticException s)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(arr[arr.length-1]);
        }
    }
}
