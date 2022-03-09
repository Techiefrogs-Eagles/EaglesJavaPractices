package src.CollectionAssignment.LinkedlistAssignment;

import java.util.Collections;
import java.util.LinkedList;

public class Program16 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");
        
        for (String string : Link) {
            System.out.println(string);
        }
        Collections.shuffle(Link);
        
        System.out.println();
        for (String string : Link) {
            System.out.println(string);
        }
    }
}
