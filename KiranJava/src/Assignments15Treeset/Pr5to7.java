package Assignments15Treeset;

import java.util.TreeSet;

public class Pr5to7 {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("Red");
        tree.add("Green");
        tree.add("Orange");
        tree.add("White");
        tree.add("Black");
       // System.out.println(tree.first());
        System.out.println(tree);
        Object first=tree.first();
        System.out.println(first);
        
        Object last=tree.last();
        System.out.println(last);
        //System.out.println(tree.lower("e"));
        //program6
        TreeSet<String> newset = (TreeSet<String>) tree.clone();
          System.out.println("Cloned tree list: " +newset );
        //Program7
        System.out.println(tree.size()); 
    }
}
