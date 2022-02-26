package src.ExceptionAssignment;

public class Exceptionclass extends Exception {
    public Exceptionclass(String s){
        super(s);
        
     }
     
 }
 
 class Driverclass{
 
         static void Method() throws Exceptionclass
         {
             throw new Exceptionclass("Hello");
         }
         public static void main(String[] args)
         {
            try
            {
                 Driverclass.Method();
            }
               catch(Exceptionclass cu)
            {
                System.out.println("Exception cleared");
                System.out.println(cu.getMessage());
            }
        }
    }
    