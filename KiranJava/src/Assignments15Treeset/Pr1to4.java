package Assignments15Treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Pr1to4 {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("Red");
        tree.add("Green");
        tree.add("Orange");
        tree.add("White");
        tree.add("Black");
        System.out.println(tree);
        //Program2
        Iterator<String> itr=tree.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
        //Program3
        TreeSet<String> tree_set2 = new TreeSet<String>();
            tree_set2.add("Pink");
            tree_set2.add("White");
            tree_set2.add("e");
            tree_set2.add("Black");
            tree_set2.add("a");

        //tree.addAll(tree_set2);
        //program4
        Iterator it = tree.descendingIterator();
     // Print list elements in reverse order
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
     System.out.println( tree.descendingSet());
    }
}
