package assignmentlinkedlist;

import java.util.LinkedList;

public class prog18 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");

        LinkedList<String> obj1=(LinkedList<String>) obj.clone();

        for(String string:obj1){
            System.out.print(string+" ");
        }

    }
    
}
