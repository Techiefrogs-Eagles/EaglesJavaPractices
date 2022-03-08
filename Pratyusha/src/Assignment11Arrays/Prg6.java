package Assignment11Arrays;

import java.util.ArrayList;

public class Prg6 
{
    public static void main(String[] args) {
        
    
    ArrayList<String> Colour = new ArrayList<String>();
    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");
    Colour.add("Violet");
    Colour.add("Purpule");

    Colour.remove(3);
    
    for(String str : Colour)
        {
            System.out.println(str);
        }

    }
   
}
