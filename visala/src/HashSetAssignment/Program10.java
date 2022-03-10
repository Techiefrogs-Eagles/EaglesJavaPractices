package src.HashSetAssignment;

import java.util.HashSet;

public class Program10 {
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
        H1.add("Four");
        H1.add("Five");
     
        H.retainAll(H1);

        if(H.isEmpty())
        {
           System.out.println("not equal");
        }
        else
        {
               
            System.out.println("equal");
        }
        
    }
}
