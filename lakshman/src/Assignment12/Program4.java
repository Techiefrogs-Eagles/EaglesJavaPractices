package Assignment12;

import java.util.Iterator;
import java.util.LinkedList;

public class Program4 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        
        obj.addLast("Morning");

        Iterator<String> itr = obj.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
