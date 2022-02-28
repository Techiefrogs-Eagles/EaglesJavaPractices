package practice;

public class ExceptionHandle 
{
   public static void main(String[] args) 
   {
        int a = 20;
        int b = 10;
        int arr[] = { 1,2,3 };
        System.out.println("in first line ");
        try
        {
            System.out.println("in try");
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
        finally
        {
            System.out.println("in finally");
            try
            {
                System.out.println(10/0);
            }
            catch(Exception h)
            {
                System.out.println("in nested catch");
                try
                {
                    System.out.println("in nested inner try");
                    System.out.println(10/0);
                }
                catch(Exception p)
                {
                    System.out.println(300);
                }
                finally
                {
                    System.out.println("in nested inner finally");
                }
            }
            finally
            {
                System.out.println("in nested finally");
            }

            
            
        }
        ExceptionHandle.throw_method();
   } 
   static void throw_method(){
       ArrayIndexOutOfBoundsException ax = new ArrayIndexOutOfBoundsException("123");
       throw ax;
}
}
