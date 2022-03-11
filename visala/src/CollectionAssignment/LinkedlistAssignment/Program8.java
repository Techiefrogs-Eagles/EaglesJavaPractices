package src.CollectionAssignment.LinkedlistAssignment;

import java.util.LinkedList;

public class Program8 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");
        Link.offerLast("These are all colours");
        for (String string : Link) {
            System.out.println(string);
        }
    }
}
