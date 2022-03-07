package Assignment11Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Prg17 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> Colour = new ArrayList<String>();

        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");
        Colour.add(2,"Yellow");
        Colour.set(1,"Red");
        
        Collections.sort(Colour);
        
        ArrayList<String> Colour1 = new ArrayList<String>();

        Colour1.add("Pink");
        Colour1.add("Blue");
        Colour1.add("Black");
        Colour1.add("Violet");
        Colour1.add("Purpule");
        Colour1.add(2,"Yellow");
        Colour1.set(1,"Red");

        Collections.sort(Colour1);

        System.out.println(Colour.equals(Colour1));
    }
}
