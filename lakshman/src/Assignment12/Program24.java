package Assignment12;

import java.util.LinkedList;

public class Program24 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        LinkedList<String> obj1 = new LinkedList<String>();
        obj1.add("Hello");
        obj1.add("Team");
        obj1.add("Eagles");
        obj1.add("Good");
        obj1.add("Morning");

        System.out.println(obj.equals(obj1));
    }
}
