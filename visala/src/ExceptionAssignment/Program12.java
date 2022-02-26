package src.ExceptionAssignment;

public class Program12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int arr[] = { 1,2,3,4,5 };
        
        try
        {
            System.out.println(arr[5]);
            System.out.println(a/b);
            
        }
        catch(ArrayIndexOutOfBoundsException s)
        {
            System.out.println(arr[5]);
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        }
    }
}
