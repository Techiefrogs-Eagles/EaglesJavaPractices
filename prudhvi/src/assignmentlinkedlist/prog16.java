package assignmentlinkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class prog16 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");

        Collections.shuffle(obj);
        for(String string:obj){
            System.out.print(string+" ");
        }

    }
    
}
