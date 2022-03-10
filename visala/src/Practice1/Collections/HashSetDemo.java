package src.Practice1.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> H = new HashSet<>();
        H.add("A");
        H.add("B");
        H.add("C");
        H.add("D");
        H.add("E");   

        //H.add("F");
        //H.clear();
        //HashSet<String> H1 = new HashSet<>(H);
        //System.out.println(H.contains("E"));
        //System.out.println(H.isEmpty());
        /*Iterator<String> itr = H.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }*/
        //H.remove("E");
        //System.out.println(H.size());
        /*Spliterator<String> spitr = H.spliterator();
        spitr.forEachRemaining(i->System.out.print(i+" "));*/

        System.out.println(H); 
    }
}