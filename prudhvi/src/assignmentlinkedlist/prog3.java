package assignmentlinkedlist;

import java.util.LinkedList;

public class prog3 {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        
        obj.add("Hello");
        obj.add("Good");
        obj.add("Morning");
        obj.add("Team");
        int start =2;
        for(int i=start;i<obj.size();i++){
            System.out.print(obj.get(i)+" ");
        }
        
    }
    
}
