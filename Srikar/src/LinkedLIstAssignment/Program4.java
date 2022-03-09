import java.util.Iterator;
import java.util.LinkedList;

public class Program4 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.addLast("concept");

        Iterator<String> itr = obj.descendingIterator();//It prints the value in reverse order
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}