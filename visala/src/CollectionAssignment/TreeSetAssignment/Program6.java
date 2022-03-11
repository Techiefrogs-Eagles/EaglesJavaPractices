package src.CollectionAssignment.TreeSetAssignment;

import java.util.TreeSet;

public class Program6 {
    public static void main(String[] args) {
        TreeSet<String> T=new TreeSet<>();
        T.add("Ant");
        T.add("Cat");
        T.add("Dog");
        T.add("Bear");
        T.add("Elephant");
     System.out.println("First ="+T.first());
     System.out.println("LAst = "+T.last());
    }
}
