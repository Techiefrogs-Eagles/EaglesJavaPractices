package Assignments12;

import java.util.LinkedList;

public class Pr10to14 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
          System.out.println("First element: "+l_list.getFirst());
          System.out.println("Last element: "+l_list.getLast());
          //program11
          for(int p=0; p < l_list.size(); p++)
            {
                 System.out.println("Element at index "+ p +": "+l_list.get(p));
            } 
        //program12
        l_list.remove(1);
        //program13
        l_list.removeFirst();
        l_list.removeLast();
        //program14
        l_list.clear();
    }
}
