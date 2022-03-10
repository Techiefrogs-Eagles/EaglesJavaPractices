package src.HashSetAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Program9 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");

        H.add("Five");
        ArrayList<String> A=new ArrayList<>(H);
        System.out.println(A);
    }
}
