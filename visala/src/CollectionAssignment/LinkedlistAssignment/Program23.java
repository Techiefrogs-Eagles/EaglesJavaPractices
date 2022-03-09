package src.CollectionAssignment.LinkedlistAssignment;

import java.util.LinkedList;

public class Program23 {
    public static void main(String[] args) {
        LinkedList<String> Link=new LinkedList<>();
        Link.add("red");
        Link.add("Blue");
        Link.add("green");
        Link.add("pink"); 
        Link.add("black");
        Link.add("gray");
        String[] array = Link.toArray(new String[Link.size()]);
          for (int i = 0; i < array.length; i++) {
              System.out.println(array[i]);
            
          }
    }
}
