package Assignment11Arrays;

import java.util.ArrayList;

public class Prg3 
{
    public static void main(String[] args) 
    {
        ArrayList<String> Colour = new ArrayList<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");
        Colour.add(1,"Yellow");

        for(String str1 : Colour)
        {
            System.out.println(str1);
        }
    }
}
