package Assignment10Exceptions;

public class Prg11 
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int arr[] = { 1,2,3,4,5 };
        
        try
        {
          System.out.println(arr[5]);
            System.out.println(a/b);
           
        }
        catch(ArithmeticException s)
        {
          System.out.println(a/b);
            System.out.println();
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
          System.out.println(arr[3]);
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
          }
          
      }
}
