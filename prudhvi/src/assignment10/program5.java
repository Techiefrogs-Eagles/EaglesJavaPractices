package assignment10;

import java.io.IOException;

public class program5 {
    public static void main(String[] args) {
        
        try 
        {
           throw new IOException("IO exception");
        } 
        catch (IOException e)
        {
           System.out.println(e.getMessage());
        }
    }
    
}
