package Assignment10Exceptions;

import java.io.IOException;

public class Prg4 
{
    static void Method() throws IOException
    {
        throw new IOException("Hello");
    }
    public static void main(String[] args)
    {
       try
       {
            Prg4.Method();
       }
          catch(IOException cu)
       {
           System.out.println("Exception cleared");
           System.out.println(cu.getMessage());
       }
   }
}
