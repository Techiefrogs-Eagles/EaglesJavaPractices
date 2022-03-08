package Assignment11Arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class Prg10 
{
    public static void main(String[] args) 
    {
        ArrayList<String> Colour = new ArrayList<String>();

    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");
    Colour.add("Violet");
    Colour.add("Purpule");

    ListIterator<String> itr = Colour.listIterator(Colour.size());
    while(itr.hasPrevious())
    {
       System.out.println(itr.previous()+" ");
    }
    
    }
    
}
