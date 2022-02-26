package src.ExceptionAssignment;


    
public class CheckedException extends Exception {
    public CheckedException(String s){
        super(s);
        
     }
     
 }
 class SubClass
 {
    static void Method() 
    {
    
        try
        {
            
            throw new CheckedException("Hello");
        }
           catch(CheckedException cu)
        {
            System.out.println("Exception cleared");
            System.out.println(cu.getMessage());
        }
    }

        public static void main(String[] args) {

            SubClass.Method();
        }
 }

