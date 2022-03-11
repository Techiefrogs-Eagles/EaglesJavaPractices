package src.CollectionAssignment.TreeSetAssignment;

import java.util.TreeSet;

public class Program3 {
    public static void main(String[] args) {
        TreeSet<String> T=new TreeSet<>();
        T.add("Ant");
        T.add("Cat");
        T.add("Dog");
        T.add("Bear");
        T.add("Elephant");
        
        TreeSet<String> T1=new TreeSet<>();
        T1.add("Fox");
        T1.add("Goat");

        T.addAll(T1);
        System.out.println(T);
    }
}
