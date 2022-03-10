package src.CollectionAssignment.PriorityQueueAssignment;

import java.util.PriorityQueue;

public class Program10 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");

        colour.add("Black");
       Object[] arr= colour.toArray();
        System.out.println(arr);
        
    }
}
