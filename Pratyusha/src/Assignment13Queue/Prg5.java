package Assignment13Queue;

import java.util.PriorityQueue;


public class Prg5 
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> Colour = new PriorityQueue<String>();
    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");

    Colour.clear();
    System.out.println(Colour);
    }
}
