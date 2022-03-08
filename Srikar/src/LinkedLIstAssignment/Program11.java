

import java.util.LinkedList;

public class Program11 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");

        for (int i = 0; i < obj.size(); i++) {
            System.out.println("index - "+i+"  "+obj.get(i));
        }
    }
}