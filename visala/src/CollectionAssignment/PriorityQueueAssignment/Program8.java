package src.CollectionAssignment.PriorityQueueAssignment;

import java.util.PriorityQueue;

public class Program8 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        
        System.out.println(colour.peek());

    }
}
