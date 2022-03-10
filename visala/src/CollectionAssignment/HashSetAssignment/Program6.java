package src.CollectionAssignment.HashSetAssignment;

import java.util.HashSet;

public class Program6 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");

        H.add("Five");
        HashSet<String> H1=new HashSet<>(H);
        System.out.println(H1);
    }
    
}
