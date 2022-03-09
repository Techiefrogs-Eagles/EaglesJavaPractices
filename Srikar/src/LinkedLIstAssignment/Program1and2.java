import java.util.LinkedList;
import java.util.Iterator;
public class Program1and2 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("This");
        obj.add("is");
        obj.add("First program");
        obj.add("in linkedlist");
        obj.addLast("concept");

        for (String string : obj) {
            System.out.print(string+" ");
        }

        
        Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}