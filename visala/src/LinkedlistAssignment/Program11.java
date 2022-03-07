package src.LinkedlistAssignment;

import java.util.LinkedList;

public class Program11 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");
        for (int i = 0; i < Link.size(); i++) {
            System.out.println(i+" "+Link.get(i));
            
        }
    }
}
