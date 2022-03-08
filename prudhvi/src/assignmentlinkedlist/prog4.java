package assignmentlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class prog4 {
    public static void main(String[] args) {
    LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");
       
        Iterator<String> itr = obj.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
    
}
