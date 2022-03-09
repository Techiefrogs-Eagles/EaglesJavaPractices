package src.CollectionAssignment.PriorityQueueAssignment;

import java.util.PriorityQueue;

public class Program9 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        colour.add("Black"); 
       colour.poll();
       System.out.println(colour);

    }
}
