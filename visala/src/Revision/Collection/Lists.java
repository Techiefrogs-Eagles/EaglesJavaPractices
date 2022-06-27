package src.Revision.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Lists {
    public static void main(String[] args) {
        // Stack
        Stack<Integer> obj = new Stack<>();
        obj.push(1);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println(obj.peek());
        System.out.println(obj.isEmpty());
        System.out.println(obj.pop());
        System.out.println(obj);
        System.out.println(obj.search(10));

        // Linkedlist
        LinkedList<String> obj1 = new LinkedList<>();
        obj1.add("A");
        obj1.add("B");
        obj1.add("C");
        obj1.add(1, "a");
        obj1.addFirst("Strings");
        obj1.addLast("D");
        System.out.println(obj1.contains("A"));
        System.out.println(obj1.get(1));
        System.out.println(obj1.getFirst());
        System.out.println(obj1.getLast());
        System.out.println(obj1.size());
        System.out.println(obj1.remove(3));
        System.out.println(obj1);

        // ArrayList
        ArrayList<String> obj2 = new ArrayList<>();
        obj2.add("One");
        obj2.add("Two");
        obj2.add("Three");
        obj2.add("Four");
        obj2.add("Five");
        Iterator<String> itr = obj2.iterator();
        {
            while (itr.hasNext())
                System.out.println(itr.next());

        }
        System.out.println("Lisiterator");
        ListIterator<String> List = obj2.listIterator(5);
        {
            while (List.hasPrevious())
                System.out.println(List.previous());
        }

        // Vector
        Vector<String> vobj = new Vector<>();
        vobj.add("A");
        vobj.add("B");
        vobj.add("C");
        vobj.add("D");
        System.out.println(vobj);
        String b = vobj.toString();
        System.out.println(b);

    }
}
