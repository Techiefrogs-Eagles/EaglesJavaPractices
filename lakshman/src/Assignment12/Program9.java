package Assignment12;

import java.util.LinkedList;

public class Program9 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        
        obj.add(1,"Good Morning");

        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}
