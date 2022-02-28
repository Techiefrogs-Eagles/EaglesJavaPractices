package Assignment10;

import java.io.IOException;

public class Program4
{
    static void display() throws IOException
    {
        throw new IOException("Hello");
    }
    public static void main(String[] args)
    {
        try
        {
            Program4.display();
        }
        catch(IOException io)
        {
            System.out.println("Exception cleared");
            System.out.println(io.getMessage());
        }
    }
}
