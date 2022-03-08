package Assignment12;

import java.util.LinkedList;

public class Program3 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        
        obj.addLast("Morning");
        int start = 2;
        for (int i = start; i < obj.size(); i++) {
            System.out.print(obj.get(i)+" ");
        }
    }
}
