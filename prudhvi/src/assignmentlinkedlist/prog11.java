package assignmentlinkedlist;

import java.util.LinkedList;

public class prog11 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");

        for(int i=0;i<obj.size();i++){
            System.out.print(obj.get(i)+" ");
        }

    }
    
}
