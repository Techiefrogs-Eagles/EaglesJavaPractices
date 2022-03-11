package src.CollectionAssignment.TreeSetAssignment;

import java.util.TreeSet;

public class Program13 {
    public static void main(String[] args) {
        TreeSet<Integer> T=new TreeSet<>();
        T.add(1);
        T.add(2);
        T.add(3);
        T.add(4);
        T.add(5);
        T.add(6);
        T.add(7);
        System.out.println(T.lower(7));
    }
}
