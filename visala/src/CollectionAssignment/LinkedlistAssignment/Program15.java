package src.CollectionAssignment.LinkedlistAssignment;

import java.util.LinkedList;

public class Program15 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");

        String temp=Link.get(1);
        Link.set(1,Link.get(2));
        Link.set(2,temp);
        
        for (String string : Link) {
            
            System.out.println(string);
        }
    }
}
