package assignmentlinkedlist;

import java.util.LinkedList;

public class prog9 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Team");

        obj.add(2, "Morning");

        for(String string:obj){
            System.out.print(string+" ");
        }

    }
    
}
