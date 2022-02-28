package src.ExceptionAssignment;

public class Program2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int arr[] = { 1,2,3,4,5 };
        
        try
        {
            
            System.out.println(a/b);
            System.out.println(arr[3]);
        }
        catch(ArithmeticException s)
        {
            System.out.println();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(arr[arr.length-1]);
        }
    }
    
}
