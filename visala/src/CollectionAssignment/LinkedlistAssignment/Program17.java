package src.CollectionAssignment.LinkedlistAssignment;

import java.util.LinkedList;

public class Program17 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");

        LinkedList<String> Link1=new LinkedList<>();
        Link.add("red1");
        Link.add("Blue1");
        Link.add("green1");
        Link.add("pink1"); 
        Link.add("black1");
        Link.add("gray1");
        Link1.addAll(Link);
        for (String string : Link1) {
            System.out.println(string);
        }


    }
}
