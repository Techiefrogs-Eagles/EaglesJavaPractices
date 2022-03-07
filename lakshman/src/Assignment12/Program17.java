package Assignment12;

import java.util.LinkedList;

public class Program17 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        LinkedList<String> obj1 = new LinkedList<String>();
        obj1.add("how");
        obj1.add("are");
        obj1.add("you");
        obj1.add("all");

        obj.addAll(obj1);

        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}
