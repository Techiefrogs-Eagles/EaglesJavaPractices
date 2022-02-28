package src.ExceptionAssignment;

import java.io.IOException;

public class CheckedException
 {
    static void Method() 
    {
    
        try
        {
            
            throw new IOException("Hello");
        }
           catch(IOException cu)
        {
            System.out.println("Exception cleared");
            System.out.println(cu.getMessage());
        }
    }

        public static void main(String[] args) {

            CheckedException.Method();
        }
 }

