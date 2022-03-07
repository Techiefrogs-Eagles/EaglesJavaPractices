package Assignment11Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Prg8 
{
    public static void main(String[] args) 
    {
        ArrayList<String> Colour = new ArrayList<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");


        Collections.sort(Colour);

        for(String str : Colour)
        {
            System.out.println(str);
        }

    }

 }

