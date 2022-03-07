package Assignment11Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Prg2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> Colour = new ArrayList<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");
    
        Iterator<String> str = Colour.iterator();
        while(str.hasNext())
        {
           System.out.print(str.next()+" ");
        }
        System.out.println();

    }
}
