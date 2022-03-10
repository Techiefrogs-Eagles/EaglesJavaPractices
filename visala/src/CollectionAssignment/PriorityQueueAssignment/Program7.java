package src.CollectionAssignment.PriorityQueueAssignment;

import java.util.PriorityQueue;

public class Program7 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        PriorityQueue<String> colour1=new PriorityQueue<>();
        colour1.add("red");
        colour1.add("green");
        colour1.add("blue");
        colour1.add("pink");
       System.out.println( colour.equals(colour1));

    }
}
