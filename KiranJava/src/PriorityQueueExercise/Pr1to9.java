package PriorityQueueExercise;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Pr1to9 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("a");
        pq.add("b");
        pq.offer("c");
        pq.offer("d");
        Iterator<String> itr = pq.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }
         PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("a");
        pq2.add("b");
        pq2.offer("c");
        pq2.offer("d");
        pq.addAll(pq2);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.remove();
    }
}
