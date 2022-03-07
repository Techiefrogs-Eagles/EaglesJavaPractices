package src.LinkedlistAssignment;

import java.util.LinkedList;

public class Program18 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");
        LinkedList<String> Link1 = (LinkedList<String>) Link.clone();
        for (String string : Link1) {
            System.out.println(string);
        }
    }
}
