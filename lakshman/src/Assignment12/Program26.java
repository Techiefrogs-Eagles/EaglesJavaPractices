package Assignment12;

import java.util.LinkedList;

public class Program26 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");
        
        obj.set(2, "Eagles,");

        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}
