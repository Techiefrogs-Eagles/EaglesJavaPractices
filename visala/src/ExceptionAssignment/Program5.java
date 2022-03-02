package src.ExceptionAssignment;

import java.io.IOException;

public class Program5 {
    public static void main (String args[]) { 
        try {
           throw new IOException("Hello Good Morning");
        } catch (Exception e) 
        {
           System.out.println(e.getMessage());
        }
     }
  
}
