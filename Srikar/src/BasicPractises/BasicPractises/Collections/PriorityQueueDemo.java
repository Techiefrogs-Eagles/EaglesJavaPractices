import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
     PriorityQueue<Integer> pq = new PriorityQueue<>();
      pq.add(12);
      pq.add(23);
      pq.offer(34);
      pq.offer(45);
     ArrayList<Integer> arrList = new ArrayList<>();
      arrList.add(56);
      arrList.add(67);
      arrList.add(78);

      pq.addAll(arrList);




      Iterator<Integer> itr = pq.iterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
      pq.clear();
      System.out.println("peak = "+pq.peek());
      System.out.println("Element = " + pq.element());
      
    }
    
}
