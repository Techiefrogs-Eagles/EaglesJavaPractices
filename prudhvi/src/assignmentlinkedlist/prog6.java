package assignmentlinkedlist;

import java.util.LinkedList;

public class prog6 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");

        obj.addFirst("Hi");
        obj.addLast("Guys");

        for(String string:obj){
            System.out.print(string+" ");
        }
    }
}
