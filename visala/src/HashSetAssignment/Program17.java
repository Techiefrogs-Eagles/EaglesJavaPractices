package src.HashSetAssignment;

import java.util.HashSet;

public class Program17 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");
        H.add("Five");

        HashSet<String> H1=new HashSet<>();
        H1.add("one");
        H1.add("two");
        H1.add("Three");
       
     System.out.println(H.containsAll(H1));   
    } 
}
