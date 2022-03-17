
import java.util.Iterator;
import java.util.PriorityQueue;

public class prog2 {
    public static void main(String[] args) {
        PriorityQueue<String> colour=new PriorityQueue<String>();
        colour.offer("Green");
        colour.offer("Red");
        colour.offer("Blue");
        colour.offer("Orange");
        colour.offer("Yellow");

        Iterator<String> itr = colour.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
    
    
}
