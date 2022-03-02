package ExceptionHandiling;

public class ExceptionHandilingDemo 
{
     public static void main(String[] args) 
     {
        /* int a = 50;
         int b = 0;

         try{
             System.out.println(a/b);
         }catch(ArithmeticException ex)
         {
              b = 10;
             System.out.println(a/b);
         }
         System.out.println("Arthematic Exception Case");
         
     
     */

      /* String s="Hello";
        String s1=null;
         
        try{
          s1= s1.concat(s);
            System.out.println(s1);
          
        }catch(NullPointerException n)
        {
              s1="Hi";
              System.out.println(s1);
        }
        System.out.println("Team");*/

      //NUMBER FORMAT EXCEPTION

    /*  String str="ABC";
      try{
          int a1=Integer.parseInt(str);
      }catch(NumberFormatException n1)
      {
          str="123";
          int a1=Integer.parseInt(str);
          System.out.println(a1);

      }
System.out.println("Egals");*/
       

//ARRAY INDEX OUT OF BOUND EXCEPTION

     /*   int a[]={1,2,3,4};
        try{
            System.out.println(a[5]);
          }catch(ArrayIndexOutOfBoundsException A)
            {
              System.out.println(a[3]);
   
            }*/


//String INDEX OUT OF BOUND EXCEPTION

String strr="Good";
try{
    System.out.println(strr.charAt(5));
}catch(StringIndexOutOfBoundsException S)
{
   System.out.println(strr.charAt(3));
}
    
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
    ExceptionHandilingDemo.throw_method();
} 
static void throw_method(){
   ArrayIndexOutOfBoundsException ax = new ArrayIndexOutOfBoundsException("123");
   throw ax;
}
}
