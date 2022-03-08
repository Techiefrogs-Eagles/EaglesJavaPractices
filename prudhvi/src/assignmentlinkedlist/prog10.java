package assignmentlinkedlist;

import java.util.LinkedList;

public class prog10 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");

        LinkedList<String> obj1=new LinkedList<String>();
        obj1.add(obj.peekFirst());
        obj1.add(obj.peekLast());

        for(String string:obj1){
            System.out.print(string+" ");
        }

    }
    
}
