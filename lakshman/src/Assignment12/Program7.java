package Assignment12;

import java.util.LinkedList;

public class Program7 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        
        obj.offerFirst("Am i audible,");
        obj.addLast("Morning");

        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}
