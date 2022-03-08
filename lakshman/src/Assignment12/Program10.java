package Assignment12;

import java.util.LinkedList;

public class Program10 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        LinkedList<String> obj1 = new LinkedList<>();
        obj1.add(obj.peekFirst());
        obj1.add(obj.peekLast());

        for (String string : obj1) {
            System.out.print(string+" ");
        }
    }
}
