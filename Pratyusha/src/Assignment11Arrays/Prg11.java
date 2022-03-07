package Assignment11Arrays;

import java.util.ArrayList;

public class Prg11 
{
    public static void main(String[] args) 
    {
        ArrayList<String> Colour = new ArrayList<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");

        String temp = Colour.get(3);
        Colour.set(2, Colour.get(4));
        Colour.set(3, temp);

        for(String str : Colour)
        {
            System.out.println(str);
        }

    }
 }

