package Assignments15Treeset;

import java.util.TreeSet;

public class Pr9to16 {
    public static void main(String[] args) {
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     
   // Add numbers in the tree
   tree_num.add(1);
   tree_num.add(2);
   tree_num.add(3);
   tree_num.add(5);
   tree_num.add(6);
   tree_num.add(7);
   tree_num.add(12);
   tree_num.add(8);
   tree_num.add(9);
   tree_num.add(10);
     System.out.println(tree_num);
   // Find numbers less than 7
 treeheadset = (TreeSet)tree_num.headSet(7); 
 System.out.println(treeheadset);
 //program10
 System.out.println("Greater than or equal to 5 : "+tree_num.ceiling(5));
 System.out.println("Greater than or equal to 11 : "+tree_num.ceiling(11));
 //program11
 System.out.println("Less than or equal to 11 : "+tree_num.floor(11));
 //program12
 System.out.println("Strictly greater than 5 : "+tree_num.higher(5));
 //program13
 System.out.println("Strictly greater than 5 : "+tree_num.lower(5));  
 //Program14 
 System.out.println("Removes the first(lowest) element: "+tree_num.pollFirst());
   System.out.println("Tree set after removing first element: "+tree_num);
   //Program15
   System.out.println("Removes the last element: "+tree_num.pollLast());
   System.out.println("Tree set after removing last element: "+tree_num);
   //Program16
   tree_num.remove(3);
   System.out.println(tree_num);
    }
}
