package assignment10;

import java.io.IOException;

public class program9 {
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
        program9.display();
    }
    
}
