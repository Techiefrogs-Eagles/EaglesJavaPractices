package Assignment13Queue;

import java.util.PriorityQueue;

public class Prg3 
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> Colour = new PriorityQueue<String>();
    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");

    PriorityQueue<String> Colour1 = new PriorityQueue<String>();
    Colour.add("White");
    Colour.add("Yellow");
    Colour.add("Grey");
     Colour1.addAll(Colour);
     System.out.println(Colour1);
    }
}
