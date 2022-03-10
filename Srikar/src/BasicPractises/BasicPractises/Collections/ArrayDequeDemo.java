import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Chair");
        arrayDeque.add("Table");
        arrayDeque.offer("Laptop");
        arrayDeque.offer("Charger");

        List<String> list = new ArrayList<>();
        list.add("Book");
        list.add("Pen");
        arrayDeque.addAll(list);  

      arrayDeque.offerFirst("Mobile");

      arrayDeque.offerLast("Tablet");

      arrayDeque.removeFirst();

      arrayDeque.removeLast();

      arrayDeque.peekFirst();
      
        arrayDeque.addFirst("we will provide");

        arrayDeque.addLast("For your Practise");

        Iterator<String> itr = arrayDeque.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
