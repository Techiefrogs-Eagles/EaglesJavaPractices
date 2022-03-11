package Assignment15TreeSet;

import java.util.TreeSet;

public class Prg1 
{
    public static void main(String[] args) 
    {
        TreeSet<String> Colour = new TreeSet<String>();
        
    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");
    Colour.add("Violet");
    Colour.add("Purpule");

    for(String str : Colour)
    {
        System.out.println(str);
    }
  }
}
