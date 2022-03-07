package Assignments12;

import java.util.Collections;
import java.util.LinkedList;

public class Pr15to21 {
    public static void main(String[] args) {
        LinkedList <String> l_list = new LinkedList <String> ();
  // use add() method to add values in the linked list
  l_list.add("Red");
  l_list.add("Green");
  l_list.add("Black");
  l_list.add("Pink");
  l_list.add("orange");
  Collections.swap(l_list, 0, 2);
    System.out.println("The New linked list after swap: " + l_list);
    Collections.shuffle(l_list);
  System.out.println("Linked list after shuffling:\n" + l_list);

  LinkedList <String> c1 = new LinkedList <String> ();
  
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(l_list);
        a.addAll(c1);
        LinkedList <String> newc1 = new LinkedList <String> ();
                newc1 = (LinkedList)c1.clone();
    //program19
    System.out.println("Removed element: "+c1.pop());
    //program20
    System.out.println(c1.peekFirst());
    //program21
    System.out.println(c1.peekLast());
    }
}
