package Assignment11Arrays;

import java.util.ArrayList;

public class Prg14 
{
    public static void main(String[] args) 
    {
       ArrayList<String> Colour = new ArrayList<String>();
        Colour.add("Pink");
        Colour.add("Blue");
        Colour.add("Black");
        Colour.add("Violet");
        Colour.add("Purpule");

        Colour.clear();


    for(String str : Colour)
    {
        System.out.println(str);
    }
    }
}
   
    

