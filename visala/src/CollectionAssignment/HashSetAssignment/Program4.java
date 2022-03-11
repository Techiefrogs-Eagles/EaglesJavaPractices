package src.CollectionAssignment.HashSetAssignment;

import java.util.HashSet;

public class Program4 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");

        H.add("Five");
        H.clear();
        System.out.println(H);
    }
}
