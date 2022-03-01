package Basicpractises;

import java.sql.SQLDataException;

public class ThrowDemo 
{
    public static void main(String[] args) 
    {
        try{
        throw new ArithmeticException("Welcome");
        }catch(ArithmeticException a){
           System.out.println("Hello All");
        }
        System.out.println("After catch");
        try{
        ThrowDemo.Display();
        }catch(SQLDataException sq)
        {
                  
        }
        System.out.println("Catch for numberFormat");

    }
        static void Display() throws SQLDataException
    {
       throw new SQLDataException("Team Meet");
    }
       
}
 class A
 {
     public static void main(String[] args)
     {
         //ThrowDemo objth = new ThrowDemo();
         try{
            ThrowDemo.Display();
         }
         catch(SQLDataException se)
         {
           System.out.println("Catch in class A");
         }
     }

 }
