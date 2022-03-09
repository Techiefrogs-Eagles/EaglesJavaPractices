package src.CollectionAssignment.PriorityQueueAssignment;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Program2 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        Iterator<String> itr=colour.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
