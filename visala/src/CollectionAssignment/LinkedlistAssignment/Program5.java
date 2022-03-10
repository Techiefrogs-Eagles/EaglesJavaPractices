package src.CollectionAssignment.LinkedlistAssignment;

import java.util.LinkedList;

public class Program5 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");

        Link.add(0, "white");
        for (String string : Link) {
            System.out.println(string);
        }
    }
}
