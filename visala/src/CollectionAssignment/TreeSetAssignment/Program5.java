package src.CollectionAssignment.TreeSetAssignment;


import java.util.TreeSet;

public class Program5 {
    public static void main(String[] args) {
        TreeSet<String> T=new TreeSet<>();
        T.add("Ant");
        T.add("Cat");
        T.add("Dog");
        T.add("Bear");
        T.add("Elephant");
       TreeSet<String> T1=(TreeSet<String>)T.clone();
       System.out.println(T1);
    }
}
