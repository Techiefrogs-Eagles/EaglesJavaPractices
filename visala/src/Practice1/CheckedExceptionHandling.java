package src.Practice1;

public class CheckedExceptionHandling extends Exception {
   public CheckedExceptionHandling(String s){
       super(s);
       
    }
    
}

class Driverclass{

       /* static void Method() throws CheckedExceptionHandling
        {
            throw new CheckedExceptionHandling("Hello");
        }
        public static void main(String[] args)
        {
           try
           {
                Driverclass.Method();
           }
              catch(CheckedExceptionHandling cu)
           {
               System.out.println("Exception cleared");
               System.out.println(cu.getMessage());
           }
        }*/
        static void Method() 
        {
        
            try
            {
                
                throw new CheckedExceptionHandling("Hello");
            }
               catch(CheckedExceptionHandling cu)
            {
                System.out.println("Exception cleared");
                System.out.println(cu.getMessage());
            }
        }

            public static void main(String[] args) {

                Driverclass.Method();
            }
}
    

