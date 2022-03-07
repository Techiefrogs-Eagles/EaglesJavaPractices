package Assignment12;

import java.util.LinkedList;

public class Program14 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        obj.clear();

        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}
