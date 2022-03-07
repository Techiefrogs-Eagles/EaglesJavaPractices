package Practice.LinkedLists;

import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("asdfg");
        ll.add("red");
        ll.add("blue");
        ll.add("green");
        ll.add("black");
        ll.add("orange");
        for (String string : ll) {
            System.out.println(string);
        }
    }
}
