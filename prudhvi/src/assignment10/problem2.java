package assignment10;

public class problem2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int arr[] = {1,2,3,4,5};
        try
        {  
            System.out.println(a+b);
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
