package src.CollectionAssignment.HashSetAssignment;

import java.util.HashSet;

public class Program5 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");

        H.add("Five");

        if(H.isEmpty())
        {
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }
}
