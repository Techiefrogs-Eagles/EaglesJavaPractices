import java.util.Iterator;
import java.util.PriorityQueue;

public class prog4 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<String>();
        colour.offer("Green");
        colour.offer("Red");
        colour.offer("Blue");
        colour.offer("Orange");
        colour.offer("Yellow");

        colour.add("Pink");

        Iterator<String> itr = colour.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    
    }
    
}
