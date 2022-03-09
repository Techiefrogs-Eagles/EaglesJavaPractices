package src.CollectionAssignment.PriorityQueueAssignment;

import java.util.PriorityQueue;



public class Program3 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        PriorityQueue<String> colour1=new PriorityQueue<>();
        colour1.add("red1");
        colour1.add("green1");
        colour1.add("blue1");
        colour1.add("pink1");
      colour.addAll(colour1);
      System.out.println(colour);
    }
}
