package Assignments12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pr1to9 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("first");
        ll.add("red");
        ll.add("blue");
        ll.add("green");
        ll.addLast("last");
        ll.add("black");
        ll.add("orange");
        /*for (String string : ll) {
            System.out.println(string);
        }
        //reverse order
        Iterator<String> rev = ll.descendingIterator();
        while(rev.hasNext()){
            System.out.println(rev.next());
        }
        System.out.println();
        ListIterator it=ll.listIterator(2);
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //program5
        ll.add(1, "element");
        //program6
        ll.addFirst("first");
        ll.addLast("last");
        //program7
        ll.offerFirst("first offer");
        //prgram8
        ll.offerLast("last offer");
        for (String string : ll) {
            System.out.println(string);
        }
        //program9
        LinkedList <String> new_l_list = new LinkedList <String> ();
        new_l_list.add("White");
        new_l_list.add("Pink");
        ll.addAll(1, new_l_list);
}
}
