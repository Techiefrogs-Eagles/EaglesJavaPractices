package assignmentlinkedlist;

import java.util.LinkedList;

public class prog17 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");

        LinkedList<String> obj1=new LinkedList<String>();
        obj1.add("Hello");
        obj1.add("Good");
        obj1.add("Morning");
        obj1.add("Team");

        obj.addAll(obj1);

        for(String string:obj){
            System.out.print(string+" ");
        }


    }
    
}
