package Assignment11Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Prg9 
{
    public static void main(String[] args) 
    {
        ArrayList<String> Colour = new ArrayList<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");

        Collections.shuffle(Colour);

        for(String str : Colour)
        {
            System.out.println(str);
        }

    }
}
