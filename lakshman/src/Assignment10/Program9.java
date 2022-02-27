package Assignment10;

import java.io.IOException;

public class Program9
{
    static void display() 
    {
        try
        {            
            throw new IOException("IO exception");
        }
        catch(IOException io)
        {
            System.out.println("Exception cleared");
            System.out.println(io.getMessage());
        }
    }
    public static void main(String[] args) 
    {
        Program9.display();
    }
}
