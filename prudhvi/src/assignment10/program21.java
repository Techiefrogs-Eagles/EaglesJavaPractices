package assignment10;

public class program21 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        try
        {
            System.out.println(arr[5]);  
        }
        catch(ArithmeticException s)
        {
            
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(arr[4]);
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        }
    }
    
}
