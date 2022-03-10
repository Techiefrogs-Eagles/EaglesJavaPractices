package Assignment15TreeSet;

import java.util.TreeSet;

public class Prg3 
{
    public static void main(String[] args)
    {
        TreeSet<String> Colour = new TreeSet<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");

        TreeSet<String> Colour1 = new TreeSet<>(Colour);

        System.out.println(Colour1);





    
        
    }
}
