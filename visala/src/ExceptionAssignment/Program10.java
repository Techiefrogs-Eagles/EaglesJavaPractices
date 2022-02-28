package src.ExceptionAssignment;

import Assignment1.character;

public class Program10 {
    public static void main(String[] args) {
        int a=20;
        int b=0;
        int arr[]={1,2,3};
        
        try
        {
        
            System.out.println(a/b);
            System.out.println(arr[3]);
        }
        catch(ArithmeticException s)
        {
            b=2;
            System.out.println(a/b);
        }
        catch(NumberFormatException ne)
        {
            System.out.println("hello");
        }
        catch(Exception e)
        {
            System.out.println(arr[arr.length-1]);
        }
}
}
