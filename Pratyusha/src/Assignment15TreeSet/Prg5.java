package Assignment15TreeSet;

import java.util.TreeSet;

public class Prg5 
{
    public static void main(String[] args) 
    {
        TreeSet<String> Colour = new TreeSet<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");

        System.out.println(Colour.first());
        System.out.println(Colour.last());
    }
}
