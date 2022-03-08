package assignmentlinkedlist;

import java.util.LinkedList;

public class prog12 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");
        obj.remove(1);

        for(String string:obj){
            System.out.print(string+" ");
        }

    }
}
