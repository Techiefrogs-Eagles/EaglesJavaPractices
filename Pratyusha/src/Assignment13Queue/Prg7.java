package Assignment13Queue;

import java.util.PriorityQueue;

public class Prg7 
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> Colour = new PriorityQueue<String>();
    Colour.add("Pink");
    Colour.add("Blue");
    Colour.add("Black");

    PriorityQueue<String> Colour1 = new PriorityQueue<String>();
    Colour1.add("Pink");
    Colour1.add("Blue");
    Colour1.add("Black");

    if(Colour.equals(Colour1))
    {
        System.out.println("THe queue is equal");
    }
    else{
        System.out.println("The Queue is not equal");
    }

    
    }
}
