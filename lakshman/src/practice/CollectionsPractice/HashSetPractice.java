package practice.CollectionsPractice;

import java.util.HashSet;
/*import java.util.Iterator;
import java.util.Spliterator;*/

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        //obj.add("F");
        //obj.clear();
        //HashSet<String> obj1 = new HashSet<>(obj);
        //System.out.println(obj.contains("E"));
        //System.out.println(obj.isEmpty());
        /*Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }*/
        //obj.remove("E");
        //System.out.println(obj.size());
        /*Spliterator<String> spitr = obj.spliterator();
        spitr.forEachRemaining(i->System.out.print(i+" "));*/

        System.out.println(obj); 
    }
}
