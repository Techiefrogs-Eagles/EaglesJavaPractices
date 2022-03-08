package Assignment10Exceptions;

public class Prg2 
{
    public static void main(String[] args) 
    {
        int a = 20;
        int b = 60;
        int array[] = { 1,2,3,4,5 }; 
          try
        { 
            System.out.println(a/b);
            System.out.println(array[3]);
        }
          catch(ArithmeticException s)
        {
            System.out.println();
        }
         catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(array[array.length-1]);
        }
    }
}
