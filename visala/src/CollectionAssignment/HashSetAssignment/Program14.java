package src.CollectionAssignment.HashSetAssignment;

import java.util.HashSet;

public class Program14 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");
        H.add("Five");
        
        HashSet<String> H1=new HashSet<>();
        H.add("Six");
        H.add("seven");
        H.add("eight");
       
         H.addAll(H1);
         System.out.println(H);
    }
}
