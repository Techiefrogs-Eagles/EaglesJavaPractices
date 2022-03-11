package Assignment15TreeSet;

import java.util.TreeSet;

public class Prg8 
{
   public static void main(String[] args) 
   {
    TreeSet<String> Colour = new TreeSet<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");

    TreeSet<String> Colour1 = new TreeSet<String>();
        Colour1.add("Pink");
        Colour1.add("Blue");
        Colour1.add("Black");
        Colour1.add("Violet");
        Colour1.add("Purpule");

        if(Colour.isEmpty())
        {
            System.out.println("The given Treesets are  not equal");
        }
        else
        {
            System.out.println("The given Treesets are equal");
        }
        
        
    }
}
