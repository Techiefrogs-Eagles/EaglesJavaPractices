package Assignment11Arrays;

import java.util.ArrayList;

public class Prg18 
{
    public static void main(String[] args) 
    {
        ArrayList<String> Colour1 = new ArrayList<String>();

        Colour1.add("Pink");
        Colour1.add("Blue ");
        Colour1.add("Black ");
        Colour1.add("Violet");
        Colour1.add("Purpule");

        Colour1.trimToSize();
         
        for(String str : Colour1)
        {
            System.out.println(str);
        }

    }
}
