package assignment10;

public class program22 {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int arr[] = {1,2,3,4,5};
        try
        {
            System.out.println(a/b);
            System.out.println(arr[3]);
        }
        catch(ArithmeticException s)
        {
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        }
        try
        {
            ClassNotFoundException cn = new ClassNotFoundException();
            throw cn;
        }
        catch(ClassNotFoundException cn)
        {
            System.out.println("Exception cleared");
        }
    }
    
}
