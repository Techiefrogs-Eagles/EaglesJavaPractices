package src.CollectionAssignment.LinkedlistAssignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Program4 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");

        Collections.reverse(Link);
        Iterator<String> linkItr=Link.iterator() ;
        while(linkItr.hasNext())
        {
            System.out.println(linkItr.next());
        }
    }
}
