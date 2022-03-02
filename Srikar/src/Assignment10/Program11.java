package Assignment10;

public class Program11 {
    public static void main(String[] args) {
        int a=20;
        int b=0;
        int arr[]={1,2,3};
        try
        {

            System.out.println(a/b);
            System.out.println(arr[3]);
        }
        catch(ArithmeticException Ae)
        {
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        }
}
    
}
