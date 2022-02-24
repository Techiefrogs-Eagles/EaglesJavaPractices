package src.Practice1;



public class ExceptionDemo {
    public static void main(String[] args) throws Exception
    {
        //Arithmetic Exception

       /* int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        
        }catch(ArithmeticException ex)
        {
           b=2;
           System.out.println(a/b);
        }
        System.out.println("hi"); */

        //NullPointer Exception


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
    }
   
    
}
