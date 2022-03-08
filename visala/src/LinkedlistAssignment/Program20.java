package src.LinkedlistAssignment;

import java.util.LinkedList;

public class Program20 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");
       System.out.println("First element ="+Link.peekFirst()); 

       for (String string : Link) {
          System.out.println(string);
       }
        
    }
}
