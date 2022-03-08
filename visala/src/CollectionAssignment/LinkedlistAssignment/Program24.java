package src.CollectionAssignment.LinkedlistAssignment;

import java.util.Collections;
import java.util.LinkedList;

public class Program24 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");
        Collections.sort(Link);

        LinkedList<String> Link1=new LinkedList<>();
        Link1.add("red");
        Link1.add("Blue");
        Link1.add("green");
        Link1.add("pink"); 
        Link1.add("black");
        Link1.add("gray");
        Collections.sort(Link1);
        System.out.println(Link1.equals(Link));

    }
}
