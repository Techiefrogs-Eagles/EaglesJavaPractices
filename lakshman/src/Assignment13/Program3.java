package Assignment13;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Program3 {
    public static void main(String[] args) {
        PriorityQueue<String> colour = new PriorityQueue<String>();
        colour.offer("Green");
        colour.offer("Red");
        colour.offer("Blue");
        colour.offer("Orange");
        colour.offer("Yellow");

        PriorityQueue<String> colours = new PriorityQueue<String>();
        colour.add("White");
        colour.add("Grey");

        colour.addAll(colours);

        Iterator<String> itr = colour.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
