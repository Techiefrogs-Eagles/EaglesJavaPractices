package Assignment11Practice;

import java.util.ArrayList;
import java.util.ListIterator;



public class Program10 {
    public static void main(String[] args) 
    {
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Red");
        colour.add("Blue");
        colour.add("Orange");
        colour.add(0,"Yellow");
        colour.remove(3);

        ListIterator<String> itr = colour.listIterator(colour.size());
        while (itr.hasPrevious()) 
        {
            System.out.println(itr.previous());
        }
    }
}
