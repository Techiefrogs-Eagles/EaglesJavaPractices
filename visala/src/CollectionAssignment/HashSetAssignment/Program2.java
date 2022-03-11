package src.CollectionAssignment.HashSetAssignment;

import java.util.HashSet;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args) {
        HashSet<String> H=new HashSet<>();
        H.add("one");
        H.add("two");
        H.add("Three");
        H.add("Four");

        H.add("Five");
        Iterator<String> itr=H.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
             
    }
}
