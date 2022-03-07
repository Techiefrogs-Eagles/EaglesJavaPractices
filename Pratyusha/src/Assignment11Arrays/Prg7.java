package Assignment11Arrays;

import java.util.ArrayList;

public class Prg7 
{
    public static void main(String[] args)
    {
        ArrayList<String> Colour = new ArrayList<String>();

    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");
    Colour.add("Violet");
    Colour.add("Purpule");

    System.out.println(Colour.contains("Violet"));
    System.out.println(Colour.contains("White"));
    }
}
