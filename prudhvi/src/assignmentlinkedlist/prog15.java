package assignmentlinkedlist;

import java.util.LinkedList;

public class prog15 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");

        String temp=obj.get(2);
        obj.set(2, obj.get(3));
        obj.set(3, temp);
        for(String string:obj){
            System.out.print(string+" ");
        }
    }
    
}
