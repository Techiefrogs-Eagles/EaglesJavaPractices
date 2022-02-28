package Assignments10;

import java.io.IOException;

public class Pr4 {
    static void Method() throws IOException
         {
             throw new IOException("Hello");
         }
         public static void main(String[] args)
         {
            try
            {
                 Pr4.Method();
            }
               catch(IOException cu)
            {
                System.out.println("Exception cleared");
                System.out.println(cu.getMessage());
            }
        }
}
