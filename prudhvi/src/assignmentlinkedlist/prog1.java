package assignmentlinkedlist;

import java.util.LinkedList;

public class prog1 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        
        obj.addLast("Team");
        for(String string:obj){
            System.out.print(string+" ");
        }
    }
    
}
