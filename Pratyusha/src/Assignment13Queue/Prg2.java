package Assignment13Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Prg2 
{
    public static void main(String[] args) 
    {
      PriorityQueue<String> Colour = new PriorityQueue<String>();
    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");
    Colour.add("Violet");
    Colour.add("Purpule");
    Iterator<String> str = Colour.iterator();
    while(str.hasNext())
    {
        System.out.println(str.next()+" ");
    }
    


    }
}
