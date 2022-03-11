package Assignment13Queue;

import java.util.PriorityQueue;

public class Prg8 
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> Colour = new PriorityQueue<String>();
    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");

    Colour.peek();
    System.out.println(Colour);
    }
}
